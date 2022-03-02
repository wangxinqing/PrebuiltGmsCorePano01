package defpackage;

/* renamed from: apzr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class apzr implements Runnable {
    private final apzt a;
    private final Object b;

    public apzr(apzt apzt, Object obj) {
        this.a = apzt;
        this.b = obj;
    }

    public final void run() {
        apzt apzt = this.a;
        apzt.a().a(this.b);
    }
}
