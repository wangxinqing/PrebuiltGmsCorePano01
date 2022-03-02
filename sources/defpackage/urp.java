package defpackage;

/* renamed from: urp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class urp implements tfv {
    private final urq a;
    private final Thread b;

    public urp(urq urq, Thread thread) {
        this.a = urq;
        this.b = thread;
    }

    public final void a() {
        urq urq = this.a;
        Thread thread = this.b;
        urq.h = true;
        thread.interrupt();
    }
}
