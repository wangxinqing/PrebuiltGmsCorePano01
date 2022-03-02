package defpackage;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: svg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class svg implements Runnable {
    final /* synthetic */ ServiceConnection a;
    final /* synthetic */ svh b;
    final /* synthetic */ cpv c;

    public svg(svh svh, cpv cpv, ServiceConnection serviceConnection) {
        this.b = svh;
        this.c = cpv;
        this.a = serviceConnection;
    }

    public final void run() {
        svh svh = this.b;
        svi svi = svh.b;
        String str = svh.a;
        cpv cpv = this.c;
        ServiceConnection serviceConnection = this.a;
        svi.a.p();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Parcel aQ = cpv.aQ();
            bhx.a(aQ, (Parcelable) bundle);
            Parcel a2 = cpv.a(1, aQ);
            Bundle bundle3 = (Bundle) bhx.a(a2, Bundle.CREATOR);
            a2.recycle();
            if (bundle3 == null) {
                svi.a.E().c.a("Install Referrer Service returned a null response");
            } else {
                bundle2 = bundle3;
            }
        } catch (Exception e) {
            svi.a.E().c.a("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        svi.a.p();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                svi.a.E().c.a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    svi.a.E().c.a("No referrer defined in Install Referrer response");
                } else {
                    svi.a.E().k.a("InstallReferrer API result", string);
                    Bundle a3 = svi.a.f().a(Uri.parse(string.length() == 0 ? new String("?") : "?".concat(string)));
                    if (a3 == null) {
                        svi.a.E().c.a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = a3.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                svi.a.E().c.a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                a3.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == svi.a.a().j.a()) {
                            svv svv = svi.a;
                            if (!svv.f.a) {
                                svv.E().k.a("Install Referrer campaign has already been logged");
                            } else {
                                svv.E().k.a("Logging Install Referrer campaign from module while it may have already been logged.");
                            }
                        }
                        if (!ayiz.a.a().a() || !svi.a.g.a(sud.aH) || svi.a.q()) {
                            svi.a.a().j.a(j);
                            svv svv2 = svi.a;
                            if (svv2.f.a) {
                                svv2.E().k.a("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                                a3.putString("_cis", "referrer API v2");
                                svi.a.e().a("auto", "_cmp", a3, str);
                            } else {
                                svv2.E().k.a("Logging Install Referrer campaign from sdk with ", "referrer API");
                                a3.putString("_cis", "referrer API");
                                svi.a.e().a("auto", "_cmp", a3);
                            }
                        }
                    }
                }
            }
        }
        jca.a().a(svi.a.a, serviceConnection);
    }
}
