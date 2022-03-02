package defpackage;

/* renamed from: agca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agca implements Runnable {
    private final agcd a;
    private final Object b;
    private final int c;

    public agca(agcd agcd, Object obj, int i) {
        this.a = agcd;
        this.b = obj;
        this.c = i;
    }

    public final void run() {
        agcd agcd = this.a;
        agcd.b.b().a(this.b, this.c, new agcb(agcd));
    }
}
