package defpackage;

/* renamed from: apzp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class apzp implements Runnable {
    private final apzt a;
    private final String b;
    private final Throwable c;

    public apzp(apzt apzt, String str, Throwable th) {
        this.a = apzt;
        this.b = str;
        this.c = th;
    }

    public final void run() {
        apzt apzt = this.a;
        apzt.a().a(this.b, this.c);
    }
}
