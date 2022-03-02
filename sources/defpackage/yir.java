package defpackage;

/* renamed from: yir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class yir implements Runnable {
    private final yiu a;
    private final String[] b;

    public yir(yiu yiu, String[] strArr) {
        this.a = yiu;
        this.b = strArr;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
