package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: dkf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class dkf implements Runnable {
    private final dpk a;
    private final AtomicBoolean b;

    public dkf(dpk dpk, AtomicBoolean atomicBoolean) {
        this.a = dpk;
        this.b = atomicBoolean;
    }

    public final void run() {
        dpk dpk = this.a;
        AtomicBoolean atomicBoolean = this.b;
        dpk.b("ChimeraAnalyticsTaskService processed last upload request.");
        synchronized (atomicBoolean) {
            atomicBoolean.set(true);
            atomicBoolean.notify();
        }
    }
}
