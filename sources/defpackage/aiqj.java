package defpackage;

/* renamed from: aiqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiqj implements Runnable {
    private final aiqo a;
    private final long b;

    public aiqj(aiqo aiqo, long j) {
        this.a = aiqo;
        this.b = j;
    }

    public final void run() {
        this.a.b(this.b, 2);
    }
}
