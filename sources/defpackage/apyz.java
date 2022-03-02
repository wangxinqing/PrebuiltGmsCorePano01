package defpackage;

/* renamed from: apyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class apyz implements Runnable {
    private final apzb a;
    private final apza b;

    public apyz(apzb apzb, apza apza) {
        this.a = apzb;
        this.b = apza;
    }

    public final void run() {
        apzb apzb = this.a;
        apza apza = this.b;
        synchronized (apzb.b) {
            apzb.b.remove(apza);
        }
    }
}
