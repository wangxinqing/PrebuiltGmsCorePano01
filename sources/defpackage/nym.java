package defpackage;

/* renamed from: nym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nym implements Runnable {
    private final nyn a;

    public nym(nyn nyn) {
        this.a = nyn;
    }

    public final void run() {
        nyq nyq;
        nyn nyn = this.a;
        synchronized (nyn) {
            nyq = (nyq) nyn.c.poll();
        }
        nyn.b(nyq);
    }
}
