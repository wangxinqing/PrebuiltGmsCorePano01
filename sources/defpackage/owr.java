package defpackage;

import android.content.Context;
import android.os.Looper;

/* renamed from: owr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class owr extends qwf {
    private prm a;
    private osf b;

    public final int a(qxz qxz) {
        boolean z = false;
        if (this.b == null) {
            oso.a("RebuildIndexService is unavailable on this device");
            return 0;
        } else if (!((Boolean) ozx.aq.c()).booleanValue()) {
            oso.a("Bail out as 3P appindexing is disabled.");
            return 0;
        } else {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                z = true;
            }
            iva.a(z);
            if (!this.b.d()) {
                oso.a("IndexManager initialization failed. Rescheduling!");
                return 1;
            }
            Context applicationContext = getApplicationContext();
            osf osf = this.b;
            return a(qxz, new owa(applicationContext, osf.g, osf.r, new oyt(applicationContext)));
        }
    }

    public abstract int a(qxz qxz, owa owa);

    public final void onCreate() {
        super.onCreate();
        if (axsd.f()) {
            prm a2 = prm.a("main", getApplicationContext());
            this.a = a2;
            this.b = a2.b();
        }
    }

    public final void onDestroy() {
        prm prm = this.a;
        if (prm != null) {
            prm.a();
        }
        super.onDestroy();
    }
}
