package defpackage;

/* renamed from: tqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tqn implements Runnable {
    private final tqo a;
    private final uvy b;

    public tqn(tqo tqo, uvy uvy) {
        this.a = tqo;
        this.b = uvy;
    }

    public final void run() {
        tqo tqo = this.a;
        uvy uvy = this.b;
        jjg jjg = tky.a;
        tqr tqr = (tqr) tqo.d.remove(uvy);
        if (tqr != null) {
            tqo.e.c(tqo.a, (tms) tqr);
        }
    }
}
