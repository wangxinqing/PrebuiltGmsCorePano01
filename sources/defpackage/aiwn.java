package defpackage;

/* renamed from: aiwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiwn implements Runnable {
    final /* synthetic */ aiwo a;

    public aiwn(aiwo aiwo) {
        this.a = aiwo;
    }

    public final void run() {
        synchronized (this.a.a) {
            aiwq aiwq = this.a.a;
            if (aiwq.b != null) {
                aiwq.c(3);
                this.a.a.b = null;
            }
        }
    }
}
