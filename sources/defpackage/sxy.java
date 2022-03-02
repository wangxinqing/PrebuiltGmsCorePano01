package defpackage;

/* renamed from: sxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sxy implements Runnable {
    final /* synthetic */ sug a;
    final /* synthetic */ syd b;

    public sxy(syd syd, sug sug) {
        this.b = syd;
        this.a = sug;
    }

    public final void run() {
        synchronized (this.b) {
            this.b.a = false;
            if (!this.b.c.o()) {
                this.b.c.E().k.a("Connected to service");
                this.b.c.a(this.a);
            }
        }
    }
}
