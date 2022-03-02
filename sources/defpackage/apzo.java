package defpackage;

/* renamed from: apzo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class apzo implements Runnable {
    private final apzt a;
    private final int b;

    public apzo(apzt apzt, int i) {
        this.a = apzt;
        this.b = i;
    }

    public final void run() {
        apzt apzt = this.a;
        apzt.a().a(this.b);
    }
}
