package defpackage;

/* renamed from: yiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class yiq implements Runnable {
    private final yiu a;
    private final String[] b;

    public yiq(yiu yiu, String[] strArr) {
        this.a = yiu;
        this.b = strArr;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
