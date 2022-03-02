package defpackage;

/* renamed from: ega  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ega implements Runnable {
    private final egh a;
    private final int b;

    public ega(egh egh, int i) {
        this.a = egh;
        this.b = i;
    }

    public final void run() {
        egh egh = this.a;
        egh.b = this.b;
        if (egh.c == 0) {
            egh.stopSelf();
            egh.f();
        }
    }
}
