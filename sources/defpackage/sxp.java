package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sxp implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ AppMetadata b;
    final /* synthetic */ sye c;

    public sxp(sye sye, AtomicReference atomicReference, AppMetadata appMetadata) {
        this.c = sye;
        this.a = atomicReference;
        this.b = appMetadata;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.a) {
            try {
                sye sye = this.c;
                sug sug = sye.c;
                if (sug != null) {
                    this.a.set(sug.b(this.b));
                    String str = (String) this.a.get();
                    if (str != null) {
                        this.c.f().a(str);
                        this.c.w().k.a(str);
                    }
                    this.c.q();
                    atomicReference = this.a;
                    atomicReference.notify();
                    return;
                }
                sye.E().c.a("Failed to get app instance id");
                this.a.notify();
            } catch (RemoteException e) {
                try {
                    this.c.E().c.a("Failed to get app instance id", e);
                    atomicReference = this.a;
                } catch (Throwable th) {
                    this.a.notify();
                    throw th;
                }
            }
        }
    }
}
