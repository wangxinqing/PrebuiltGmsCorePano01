package defpackage;

/* renamed from: yis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class yis implements Runnable {
    private final yiu a;
    private final String[] b;

    public yis(yiu yiu, String[] strArr) {
        this.a = yiu;
        this.b = strArr;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
