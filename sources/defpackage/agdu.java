package defpackage;

/* renamed from: agdu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agdu implements Runnable {
    private final agdv a;

    public agdu(agdv agdv) {
        this.a = agdv;
    }

    public final void run() {
        agdx agdx = this.a.a;
        if (agdx.c.getAndSet(false)) {
            basq basq = basq.PRIMES_CRASH_MONITORING_INITIALIZED;
            bash bash = agdx.d;
            agdx.a(basq);
            agdx.a(basq.PRIMES_FIRST_ACTIVITY_LAUNCHED);
        }
    }
}
