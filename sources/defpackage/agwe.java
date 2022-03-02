package defpackage;

/* renamed from: agwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agwe implements Runnable {
    private final agwj a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;

    public agwe(agwj agwj, long j, long j2, long j3, long j4) {
        this.a = agwj;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d, this.e);
    }
}
