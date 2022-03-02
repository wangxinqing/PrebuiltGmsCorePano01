package com.google.android.gms.plus.audience;

import android.animation.Animator;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.Loader;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.circles.AddToCircleConsentData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class UpdateCirclesChimeraActivity extends CircleSelectionChimeraActivity implements yrc, zne, ica, icb {
    private yui A = yuv.a;
    private AudienceMember B;
    private boolean C;
    private icc D;
    private final icm E = new yqy(this);
    private final icm F = new yqz(this);
    public Bitmap w;
    public AddToCircleConsentData x;
    public Status y;
    public boolean z;

    private final void a(ArrayList arrayList, ArrayList arrayList2) {
        List list = this.f.a.b;
        ArrayList arrayList3 = new ArrayList(iia.e(getIntent()));
        arrayList.clear();
        arrayList.addAll(list);
        arrayList.removeAll(arrayList3);
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        arrayList2.removeAll(list);
    }

    private final int u() {
        String str = this.d;
        if (!TextUtils.isEmpty(str)) {
            return Integer.parseInt(str);
        }
        return 0;
    }

    public final void c() {
        h();
    }

    /* access modifiers changed from: protected */
    public final void f() {
        String str;
        izr.a(getApplicationContext(), this.a, this.b, ylp.d, ylq.a, this.c);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        a(arrayList, arrayList2);
        if (arrayList.size() + arrayList2.size() <= 0) {
            super.f();
            return;
        }
        if (arrayList.size() > 0 && arrayList2.size() == 0) {
            str = getString(R.string.plus_add_to_circle_progress);
        } else if (arrayList.size() != 0 || arrayList2.size() <= 0) {
            str = getString(R.string.plus_update_circles_progress);
        } else {
            str = getString(R.string.plus_remove_from_circle_progress);
        }
        getSupportFragmentManager().beginTransaction().add((Fragment) zmz.a(str), "progressDialog").commitAllowingStateLoss();
        if (this.y != null && s()) {
            return;
        }
        if (this.y == null) {
            this.z = true;
        } else {
            t();
        }
    }

    public final void g(Bundle bundle) {
        if (this.x == null) {
            ibq ibq = wlt.a;
            xcy.a(this.D, this.a, this.b).a(this.E);
        }
        findViewById(R.id.add_to_circles_user_icon).setVisibility(8);
        if (!TextUtils.isEmpty(this.B.g)) {
            ibq ibq2 = wlt.a;
            xdh.a(this.D, this.B.g, 1, 1).a(this.F);
        }
    }

    public final void h() {
        if (c(0)) {
            izr.a(getApplicationContext(), this.a, this.b, ylp.e, ylq.a, this.c);
            super.h();
        }
    }

    /* access modifiers changed from: protected */
    public final FavaDiagnosticsEntity i() {
        return ylq.a;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 2000) {
            if (i == 1) {
                if (intent != null) {
                    iid iid = new iid(intent);
                    if (iid.b == 1 && iid.c == 1) {
                        iia iia = new iia(new Intent());
                        iia.a(this.B);
                        iia.a(new ArrayList(Arrays.asList(new AudienceMember[]{iid.a})));
                        iia.b(new ArrayList());
                        iia.b((List) new ArrayList(iia.e(getIntent())));
                        b(iia.a);
                        return;
                    }
                    o();
                    return;
                }
                o();
            } else if (i != 0) {
            } else {
                if (i2 == -1) {
                    if (this.y.b()) {
                        ibq ibq = wlt.a;
                        xcy.a(this.D, this.a, this.b).a(this.E);
                    }
                    ibq ibq2 = wlt.a;
                    xdr.a(this.D, this.a, this.b, 0, true);
                    return;
                }
                super.onActivityResult(0, i2, intent);
            }
        } else if (i2 == -1 || i2 == 1 || i2 == 1) {
            t();
        } else {
            znf znf = (znf) getSupportFragmentManager().findFragmentByTag("progressDialog");
            if (znf != null) {
                znf.dismissAllowingStateLoss();
            }
            h();
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.audience_selection_create_circle_view) {
            iib iib = new iib(this.a, this.d);
            iib.a.putExtra("com.google.android.gms.common.audience.EXTRA_PAGE_ID", this.b);
            AudienceMember audienceMember = this.B;
            if (!TextUtils.isEmpty(audienceMember.e)) {
                iib.a.putExtra("com.google.android.gms.common.audience.EXTRA_TARGET_PERSON", audienceMember);
            }
            iib.a.putExtra("com.google.android.gms.common.audience.EXTRA_HEADER_TEXT_COLOR", iia.a(getIntent(), getResources().getColor(R.color.plus_add_to_circles_header_text)));
            iib.a.putExtra("com.google.android.gms.common.audience.EXTRA_HEADER_BACKGROUND_COLOR", iia.b(getIntent(), getResources().getColor(R.color.plus_add_to_circles_header_grey)));
            Intent intent = iib.a;
            if (intent != null) {
                super.a((Animator.AnimatorListener) new yqx(this, intent));
            }
        }
        super.onClick(view);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        onLoadFinished(loader, (xfh) obj);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("hasLoggedCircleLoad", this.C);
        bundle.putParcelable("addToCircleConsentData", this.x);
        Status status = this.y;
        if (status != null) {
            bundle.putInt("addToCircleConsentDataResultCode", status.i);
            bundle.putParcelable("addToCircleConsentDataResultIntent", this.y.k);
        }
    }

    public final void onStart() {
        super.onStart();
        this.D.e();
    }

    public final void onStop() {
        this.D.g();
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public final ypj r() {
        return ypj.a(this.a, this.b, this.d, this.c);
    }

    public final boolean s() {
        if (!this.y.c()) {
            iia iia = new iia(new Intent());
            iia.a(this.B);
            iia.a(new ArrayList());
            iia.b(new ArrayList());
            iia.b((List) new ArrayList(iia.e(getIntent())));
            getSupportFragmentManager().beginTransaction().add((Fragment) yra.a(getString(R.string.plus_update_circles_failed_message), iia.a), "errorDialog").commitAllowingStateLoss();
            return true;
        }
        AddToCircleConsentData addToCircleConsentData = this.x;
        if (!addToCircleConsentData.a) {
            return false;
        }
        startActivityForResult(ysf.a(this.a, this.b, addToCircleConsentData.b, addToCircleConsentData.c, addToCircleConsentData.d, u()), 2000);
        return true;
    }

    public final void t() {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        a(arrayList, arrayList2);
        String str = this.a;
        String str2 = this.b;
        String str3 = this.B.e;
        String str4 = this.d;
        String str5 = this.c;
        iva.a(str, (Object) "Account name must not be empty.");
        iva.a(str3, (Object) "Update person ID must not be empty");
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.b(z2, "Circles to add and remove are empty, nothing to do.");
        Bundle bundle = new Bundle();
        bundle.putString("accountName", str);
        bundle.putString("plusPageId", str2);
        bundle.putString("updatePersonId", str3);
        bundle.putParcelableArrayList("circleIdsToAdd", arrayList);
        bundle.putParcelableArrayList("circleIdsToRemove", arrayList2);
        bundle.putString("callingPackageName", str5);
        bundle.putString("clientApplicationId", str4);
        yrd yrd = new yrd();
        yrd.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().add((Fragment) yrd, "updateCircles").commitAllowingStateLoss();
        if (yrd.e || yrd.d || yrd.f != null) {
            throw new IllegalStateException("UpdateCirclesChimeraFragment should only be used once.");
        }
        icc icc = yrd.a;
        if (icc == null || !icc.i()) {
            yrd.d = true;
            icc icc2 = yrd.a;
            if (icc2 != null && !icc2.j()) {
                yrd.a.e();
            }
        } else if (!yrd.e) {
            yrd.a();
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ypk a(Intent intent, Fragment fragment) {
        return r();
    }

    public final void a(int i) {
        if (this.x == null) {
            this.D.e();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Bundle bundle) {
        AudienceMember c = iia.c(getIntent());
        this.B = c;
        iva.a((Object) c, (Object) "Update person ID must not be null.");
        if (bundle != null) {
            this.C = bundle.getBoolean("hasLoggedCircleLoad", false);
            this.x = (AddToCircleConsentData) bundle.getParcelable("addToCircleConsentData");
            if (bundle.containsKey("addToCircleConsentDataResultCode") && bundle.containsKey("addToCircleConsentDataResultIntent")) {
                this.y = new Status(bundle.getInt("addToCircleConsentDataResultCode"), (String) null, (PendingIntent) bundle.getParcelable("addToCircleConsentDataResultIntent"));
            }
        } else {
            this.C = false;
        }
        icc a = this.A.a(this, u(), this.c);
        this.D = a;
        a.a((ica) this);
        this.D.a((icb) this);
    }

    public final void a(Loader loader, xfh xfh) {
        super.onLoadFinished(loader, xfh);
        if (!this.C) {
            izr.a(getApplicationContext(), this.a, this.b, ylp.c, ylq.a, this.c);
            this.C = true;
        }
    }

    public final void a(ConnectionResult connectionResult) {
        this.y = new Status(connectionResult.c);
    }

    public final void a(Status status, ArrayList arrayList, ArrayList arrayList2) {
        String str;
        znf znf = (znf) getSupportFragmentManager().findFragmentByTag("progressDialog");
        if (znf != null) {
            znf.dismissAllowingStateLoss();
        }
        iia iia = new iia(new Intent());
        iia.a(this.B);
        iia.a(arrayList);
        iia.b(arrayList2);
        iia.b((List) new ArrayList(iia.e(getIntent())));
        Intent intent = iia.a;
        if (status == null || !status.c()) {
            if (status != null && status.i == 101) {
                String str2 = this.B.f;
                if (TextUtils.isEmpty(str2)) {
                    str = getString(R.string.plus_update_circles_not_allowed_default_message);
                } else {
                    str = String.format(getString(R.string.plus_update_circles_not_allowed_message, new Object[]{str2}), new Object[0]);
                }
            } else {
                str = getString(R.string.plus_update_circles_failed_message);
            }
            getSupportFragmentManager().beginTransaction().add((Fragment) yra.a(str, intent), "errorDialog").commitAllowingStateLoss();
            return;
        }
        b(intent);
    }
}
