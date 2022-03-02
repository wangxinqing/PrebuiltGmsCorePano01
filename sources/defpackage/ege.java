package defpackage;

/* renamed from: ege  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ege implements Runnable {
    private final egh a;
    private final int b;

    public ege(egh egh, int i) {
        this.a = egh;
        this.b = i;
    }

    public final void run() {
        egh egh = this.a;
        egh.d.post(new egf(egh, this.b));
    }
}
