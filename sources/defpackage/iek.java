package defpackage;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: iek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iek implements irr {
    public final boolean a;
    private final WeakReference b;
    private final ibq c;

    public iek(iet iet, ibq ibq, boolean z) {
        this.b = new WeakReference(iet);
        this.c = ibq;
        this.a = z;
    }

    public final void a(ConnectionResult connectionResult) {
        boolean z;
        Lock lock;
        iet iet = (iet) this.b.get();
        if (iet != null) {
            if (Looper.myLooper() == iet.a.l.e) {
                z = true;
            } else {
                z = false;
            }
            iva.a(z, (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            iet.b.lock();
            try {
                if (iet.b(0)) {
                    if (!connectionResult.b()) {
                        iet.b(connectionResult, this.c, this.a);
                    }
                    if (iet.d()) {
                        iet.e();
                    }
                    lock = iet.b;
                } else {
                    lock = iet.b;
                }
                lock.unlock();
            } catch (Throwable th) {
                iet.b.unlock();
                throw th;
            }
        }
    }
}
