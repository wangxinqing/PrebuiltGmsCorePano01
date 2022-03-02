package defpackage;

/* renamed from: ahso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahso implements Runnable {
    private final ahsr a;
    private final float[] b;
    private final long c;
    private final int d;

    public ahso(ahsr ahsr, float[] fArr, long j, int i) {
        this.a = ahsr;
        this.b = fArr;
        this.c = j;
        this.d = i;
    }

    public final void run() {
        ahsr ahsr = this.a;
        ahsr.a.a(this.b, this.c, this.d);
    }
}
