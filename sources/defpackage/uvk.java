package defpackage;

/* renamed from: uvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uvk implements Runnable {
    private final uvp a;
    private final int b;

    public uvk(uvp uvp, int i) {
        this.a = uvp;
        this.b = i;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
