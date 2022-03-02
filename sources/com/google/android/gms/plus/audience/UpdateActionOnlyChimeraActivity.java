package com.google.android.gms.plus.audience;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.circles.AddToCircleConsentData;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class UpdateActionOnlyChimeraActivity extends FragmentActivity implements ica, icb, ynz, zne {
    public AddToCircleConsentData a;
    public wlf b;
    public String c;
    public String d;
    private FragmentActivity e = this;
    private icc f;
    private AudienceMember g;
    private String h;
    private String i;
    private String j;
    private String k;
    private int l;

    public final int a() {
        if (!TextUtils.isEmpty(this.h)) {
            return Integer.parseInt(this.h);
        }
        return 0;
    }

    public final void b() {
        izr.a(getApplicationContext(), this.c, this.d, ylp.b, new FavaDiagnosticsEntity(this.k, this.l), this.i);
        getSupportFragmentManager().beginTransaction().add((Fragment) zmz.a(getString(R.string.plus_add_to_following_circle_progress)), "progressDialog").commitAllowingStateLoss();
        if (((yob) getSupportFragmentManager().findFragmentByTag("AddToCircle")) == null) {
            String str = this.c;
            String str2 = this.d;
            String str3 = this.g.e;
            String str4 = this.j;
            String str5 = this.h;
            iva.a(str, (Object) "Account name must not be empty.");
            iva.a(str3, (Object) "Update person qualifiedId must not be empty.");
            iva.a(str4, (Object) "Circle to add must not be empty.");
            Bundle bundle = new Bundle();
            bundle.putString("accountName", str);
            bundle.putString("plusPageId", str2);
            bundle.putString("updatePersonId", str3);
            bundle.putString("circleIdToAdd", str4);
            bundle.putString("clientApplicationId", str5);
            yob yob = new yob();
            yob.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().add((Fragment) yob, "AddToCircle").commitAllowingStateLoss();
            if (yob.c || yob.b || yob.d != null) {
                throw new IllegalStateException("AddToCircleChimeraFragment should only be used once.");
            }
            icc icc = yob.a;
            if (icc == null || !icc.i()) {
                yob.b = true;
                icc icc2 = yob.a;
                if (icc2 != null && !icc2.j()) {
                    yob.a.e();
                }
            } else if (!yob.c) {
                yob.a();
            }
        }
    }

    public final void c() {
        setResult(0, (Intent) null);
        finish();
    }

    public final void g(Bundle bundle) {
        if (this.a == null) {
            ibq ibq = wlt.a;
            xcy.a(this.f, this.c, this.d).a((icm) new yqu(this));
        }
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 2000) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1 || i3 == 1 || i3 == 1) {
            b();
        } else {
            znf znf = (znf) getSupportFragmentManager().findFragmentByTag("progressDialog");
            if (znf != null) {
                znf.dismissAllowingStateLoss();
            }
            a(0, (Intent) null);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!jgu.e(this)) {
            try {
                this.i = jhg.c((Activity) this);
                this.c = intent.getStringExtra("EXTRA_ACCOUNT_NAME");
                this.d = intent.getStringExtra("EXTRA_PLUS_PAGE_ID");
                this.h = intent.getStringExtra("EXTRA_CLIENT_APPLICATION_ID");
                this.j = intent.getStringExtra("EXTRA_TARGET_CIRCLE_ID");
                this.g = (AudienceMember) intent.getParcelableExtra("EXTRA_UPDATE_PERSON");
                String stringExtra = intent.getStringExtra("EXTRA_START_VIEW_NAMESPACE");
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = "sg";
                }
                this.k = stringExtra;
                this.l = intent.getIntExtra("EXTRA_START_VIEW_TYPE_NUM", 0);
                iva.a(this.c, (Object) "Account name must not be empty.");
                iva.a((Object) this.g, (Object) "Update person must not be null.");
                iva.a(this.j, (Object) "Target circleId must not be null.");
                ibz ibz = new ibz(this, this, this);
                ibq ibq = wlt.a;
                wlr wlr = new wlr();
                wlr.a = a();
                ibz.a(ibq, (ibj) wlr.a());
                this.f = ibz.b();
                this.a = null;
                this.b = null;
                if (bundle != null) {
                    this.a = (AddToCircleConsentData) bundle.getParcelable("addToCircleConsentData");
                    if (bundle.containsKey("addToCircleConsentDataResultCode") && bundle.containsKey("addToCircleConsentDataResultIntent")) {
                        this.b = new yqw(new Status(bundle.getInt("addToCircleConsentDataResultCode"), (String) null, (PendingIntent) bundle.getParcelable("addToCircleConsentDataResultIntent")));
                    }
                }
            } catch (SecurityException e2) {
                a(0, (Intent) null);
            }
        } else {
            Log.w("UpdateActionOnlyActivity", "This activity is not available for restricted profile.");
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("addToCircleConsentData", this.a);
        wlf wlf = this.b;
        if (wlf != null) {
            bundle.putInt("addToCircleConsentDataResultCode", wlf.aO().i);
            bundle.putParcelable("addToCircleConsentDataResultIntent", this.b.aO().k);
        }
    }

    public final void onStart() {
        super.onStart();
        this.f.e();
    }

    public final void onStop() {
        this.f.g();
        super.onStop();
    }

    public final void a(int i2) {
        if (this.a == null) {
            this.f.e();
        }
    }

    public final void a(int i2, Intent intent) {
        setResult(i2, intent);
        finish();
    }

    public final void a(ConnectionResult connectionResult) {
        this.b = new yqw(new Status(connectionResult.c, (String) null, connectionResult.d));
    }

    public final void a(Status status) {
        String str;
        if (status != null && status.i == 101) {
            String str2 = this.g.f;
            if (TextUtils.isEmpty(str2)) {
                str = getString(R.string.plus_update_circles_not_allowed_default_message);
            } else {
                str = String.format(getString(R.string.plus_update_circles_not_allowed_message, new Object[]{str2}), new Object[0]);
            }
        } else {
            str = getString(R.string.plus_update_circles_failed_message);
        }
        Bundle b2 = znd.b(str);
        b2.putInt("resultCode", 7);
        yqv yqv = new yqv();
        yqv.setArguments(b2);
        getSupportFragmentManager().beginTransaction().add((Fragment) yqv, "errorDialog").commitAllowingStateLoss();
    }

    public final void a(wlg wlg) {
        znf znf = (znf) this.e.getSupportFragmentManager().findFragmentByTag("progressDialog");
        if (znf != null) {
            znf.dismissAllowingStateLoss();
        }
        if (wlg == null) {
            a((Status) null);
        } else if (!wlg.aO().c()) {
            a(wlg.aO());
        } else {
            iif iif = new iif();
            iif.a.putExtra("EXTRA_TARGET_CIRCLE_ID", this.j);
            iif.a.putExtra("EXTRA_UPDATE_PERSON", this.g);
            a(-1, iif.a);
        }
    }
}
