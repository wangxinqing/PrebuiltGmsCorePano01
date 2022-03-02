package defpackage;

/* renamed from: aiqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiqi implements Runnable {
    private final aiqo a;
    private final long b;

    public aiqi(aiqo aiqo, long j) {
        this.a = aiqo;
        this.b = j;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
