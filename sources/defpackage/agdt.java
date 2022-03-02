package defpackage;

/* renamed from: agdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agdt implements Runnable {
    private final agdx a;
    private final basq b;

    public agdt(agdx agdx, basq basq) {
        this.a = agdx;
        this.b = basq;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
