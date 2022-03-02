package defpackage;

/* renamed from: egf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class egf implements Runnable {
    private final egh a;
    private final int b;

    public egf(egh egh, int i) {
        this.a = egh;
        this.b = i;
    }

    public final void run() {
        egh egh = this.a;
        int i = this.b;
        if (i != Integer.MAX_VALUE && egh.stopSelfResult(i)) {
            egh.f();
        }
    }
}
