package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: som  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class som implements Runnable {
    private final svv a;
    private final sut b;
    private final AtomicBoolean c;

    public som(svv svv, sut sut, AtomicBoolean atomicBoolean) {
        this.a = svv;
        this.b = sut;
        this.c = atomicBoolean;
    }

    public final void run() {
        svv svv = this.a;
        sut sut = this.b;
        AtomicBoolean atomicBoolean = this.c;
        if (svv.f.a) {
            sut.k.a("ChimeraPackageMeasurementTaskService processed last upload request.");
            synchronized (atomicBoolean) {
                atomicBoolean.set(true);
                atomicBoolean.notify();
            }
        }
    }
}
