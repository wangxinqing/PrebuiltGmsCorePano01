package defpackage;

/* renamed from: dmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dmq implements Runnable {
    final /* synthetic */ dms a;

    public dmq(dms dms) {
        this.a = dms;
    }

    public final void run() {
        dms dms = this.a;
        dms.q();
        dms.f();
        dms.l().b();
        if (!dms.a("android.permission.ACCESS_NETWORK_STATE")) {
            dms.e("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            dms.u();
        }
        if (!dms.a("android.permission.INTERNET")) {
            dms.e("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            dms.u();
        }
        if (dpv.a(dms.d())) {
            dms.b("AnalyticsService registered in the app manifest and enabled");
        } else {
            dms.f();
            dms.e("Device AnalyticsService not registered! Hits will not be delivered reliably.");
        }
        if (!dms.h) {
            dms.f();
        }
        dms.s();
    }
}
