package com.google.android.gms.plus.audience;

import android.app.PendingIntent;
import android.content.Context;
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
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class CircleCreationChimeraActivity extends FragmentActivity implements ica, icb, yqi {
    public AddToCircleConsentData a;
    private icc b;
    private String c;
    private String d;
    private String e;
    private AudienceMember f;
    private int g;
    private boolean h;

    private final void a(FavaDiagnosticsEntity favaDiagnosticsEntity) {
        izr.a(this, this.c, this.d, favaDiagnosticsEntity, ylq.c, this.e, (ClientActionDataEntity) null);
    }

    private final void c() {
        a(0, new iid(3, (AudienceMember) null, 3, (String) null).a(), (Status) null);
    }

    public final boolean b() {
        if (this.h) {
            return false;
        }
        AddToCircleConsentData addToCircleConsentData = this.a;
        if (addToCircleConsentData == null) {
            c();
            return true;
        } else if (!addToCircleConsentData.a) {
            return false;
        } else {
            startActivityForResult(ysf.a(this.c, this.d, addToCircleConsentData.b, addToCircleConsentData.c, addToCircleConsentData.d, this.g), 2000);
            return true;
        }
    }

    public final void finish() {
        znf znf = (znf) getSupportFragmentManager().findFragmentByTag("progressDialog");
        if (znf != null) {
            znf.dismissAllowingStateLoss();
        }
        super.finish();
    }

    public final void g(Bundle bundle) {
        if (this.a == null) {
            ibq ibq = wlt.a;
            xcy.a(this.b, this.c, this.d).a((icm) new yqe(this));
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 2000 && (i2 == -1 || i2 == 1 || i2 == 1)) {
            this.h = true;
            yqq yqq = (yqq) getSupportFragmentManager().findFragmentByTag("CircleCreationFragment");
            if (yqq != null) {
                yqq.d();
                return;
            }
        }
        c();
    }

    public final void onBackPressed() {
        c();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = iic.a(getIntent());
        this.d = iic.c(getIntent());
        try {
            this.e = jhg.c((Activity) this);
            this.f = iic.d(getIntent());
            if (((yqq) getSupportFragmentManager().findFragmentByTag("CircleCreationFragment")) == null) {
                getSupportFragmentManager().beginTransaction().add(16908290, new yqq(), "CircleCreationFragment").commit();
            }
            this.h = false;
            if (bundle != null) {
                this.a = (AddToCircleConsentData) bundle.getParcelable("addToCircleConsentData");
                if (bundle.containsKey("addToCircleConsentDataResultCode") && bundle.containsKey("addToCircleConsentDataResultIntent")) {
                    new yqg(new Status(bundle.getInt("addToCircleConsentDataResultCode"), (String) null, (PendingIntent) bundle.getParcelable("addToCircleConsentDataResultIntent")));
                }
            } else {
                this.a = null;
            }
            this.g = iic.b(getIntent());
            ibz ibz = new ibz(this, this, this);
            ibq ibq = wlt.a;
            wlr wlr = new wlr();
            wlr.a = this.g;
            ibz.a(ibq, (ibj) wlr.a());
            icc b2 = ibz.b();
            this.b = b2;
            b2.e();
        } catch (SecurityException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
            sb.append("SecurityException ");
            sb.append(valueOf);
            Log.w("CircleCreationActivity", sb.toString());
            c();
        }
    }

    public final void onStart() {
        super.onStart();
        this.b.e();
    }

    public final void onStop() {
        this.b.g();
        super.onStop();
    }

    private final void a(FavaDiagnosticsEntity favaDiagnosticsEntity, ClientActionDataEntity clientActionDataEntity) {
        Context applicationContext = getApplicationContext();
        izq izq = new izq(applicationContext);
        izq.a(this.c);
        izq.a(favaDiagnosticsEntity);
        izq.c(ylq.c);
        izq.c(this.d);
        izq.a(clientActionDataEntity);
        izq.b(this.e);
        izr.a(applicationContext, izq);
    }

    private final void a(String str, Intent intent) {
        Bundle b2 = znd.b(str);
        b2.putInt("resultCode", 7);
        b2.putParcelable("dataIntent", intent);
        yqf yqf = new yqf();
        yqf.setArguments(b2);
        getSupportFragmentManager().beginTransaction().add((Fragment) yqf, "errorDialog").commitAllowingStateLoss();
    }

    public final void a() {
        getSupportFragmentManager().beginTransaction().add((Fragment) zmz.a(getResources().getString(R.string.plus_add_to_new_circle_progress_message)), "progressDialog").commitAllowingStateLoss();
    }

    public final void a(int i) {
        if (this.a == null) {
            this.b.e();
        }
    }

    public final void a(int i, Intent intent, Status status) {
        zfw zfw;
        zfw zfw2;
        String str;
        Intent intent2 = intent;
        Status status2 = status;
        iid iid = new iid(intent2);
        setResult(i, intent);
        int i2 = iid.b;
        if (i2 == 1) {
            iid iid2 = new iid(intent2);
            List asList = Arrays.asList(new String[]{iid2.a.d});
            FavaDiagnosticsEntity favaDiagnosticsEntity = ylp.a;
            if (asList != null) {
                ArrayList arrayList = new ArrayList();
                int size = asList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    String str2 = (String) asList.get(i3);
                    if (!TextUtils.isEmpty(str2)) {
                        if (!str2.startsWith("p") && !str2.startsWith("s")) {
                            Log.w("AclDetails", "Circle ID should start with 'p' or 's'");
                        }
                        zfy zfy = new zfy();
                        zfy.a(str2);
                        arrayList.add(zfy.a());
                    }
                }
                if (!arrayList.isEmpty()) {
                    zfv zfv = new zfv();
                    zfv.a((List) arrayList);
                    zfw = zfv.a();
                } else if (Log.isLoggable("AclDetails", 5)) {
                    String valueOf = String.valueOf(asList);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                    sb.append("no LoggedCircles added for circle IDs: ");
                    sb.append(valueOf);
                    Log.w("AclDetails", sb.toString());
                    zfw = null;
                } else {
                    zfw = null;
                }
            } else {
                zfw = null;
            }
            a(favaDiagnosticsEntity, (ClientActionDataEntity) zfw);
            int i4 = iid2.c;
            if (i4 == 1) {
                FavaDiagnosticsEntity favaDiagnosticsEntity2 = ylp.b;
                if (asList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = asList.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        String str3 = (String) asList.get(i5);
                        if (!TextUtils.isEmpty(str3)) {
                            zfy zfy2 = new zfy();
                            zfy2.a(str3);
                            arrayList2.add(zfy2.a());
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        zfv zfv2 = new zfv();
                        zfs zfs = new zfs();
                        zfs.a(arrayList2);
                        zfv2.a(zfs.a());
                        zfw2 = zfv2.a();
                    } else if (Log.isLoggable("AclDetails", 5)) {
                        String valueOf2 = String.valueOf(asList);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 39);
                        sb2.append("no LoggedCircles added for circle IDs: ");
                        sb2.append(valueOf2);
                        Log.w("AclDetails", sb2.toString());
                        zfw2 = null;
                    } else {
                        zfw2 = null;
                    }
                } else {
                    zfw2 = null;
                }
                a(favaDiagnosticsEntity2, (ClientActionDataEntity) zfw2);
                finish();
            } else if (i4 == 2) {
                a(ylp.i);
                if (status2 != null && status2.i == 101) {
                    String str4 = this.f.f;
                    if (TextUtils.isEmpty(str4)) {
                        str = getString(R.string.plus_update_circles_not_allowed_default_message);
                    } else {
                        str = String.format(getString(R.string.plus_update_circles_not_allowed_message, new Object[]{str4}), new Object[0]);
                    }
                } else {
                    str = getString(R.string.plus_update_circles_failed_message);
                }
                a(str, intent2);
            } else if (i4 == 3) {
                finish();
            }
        } else if (i2 == 2) {
            a(ylp.j);
            a(getString(R.string.plus_circle_creation_failed_to_create_circle_message), intent2);
        } else if (i2 == 3) {
            finish();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        new yqg(new Status(connectionResult.c, (String) null, connectionResult.d));
    }
}
