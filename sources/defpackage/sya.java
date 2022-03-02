package defpackage;

/* renamed from: sya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sya implements Runnable {
    final /* synthetic */ sug a;
    final /* synthetic */ syd b;

    public sya(syd syd, sug sug) {
        this.b = syd;
        this.a = sug;
    }

    public final void run() {
        synchronized (this.b) {
            this.b.a = false;
            if (!this.b.c.o()) {
                this.b.c.E().j.a("Connected to remote service");
                this.b.c.a(this.a);
            }
        }
    }
}
