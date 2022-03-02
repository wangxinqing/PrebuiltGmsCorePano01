package defpackage;

/* renamed from: yak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yak {
    public Thread a;
    public final yai b;
    public final yaq c;
    public final xvp d;

    public yak(yai yai, xvp xvp, yaq yaq) {
        this.b = yai;
        this.d = xvp;
        this.c = yaq;
    }

    public final void a() {
        Thread thread = this.a;
        if (thread != null) {
            xdt.a("FSA2_AsyncDataPopulator", "Thread was not removed correctly: %d", Long.valueOf(thread.getId()));
            this.a = null;
        }
        this.b.getClass().getSimpleName();
        Thread thread2 = new Thread(new yaj(this));
        this.a = thread2;
        thread2.getId();
        this.d.a(this.a);
        this.a.start();
    }
}
