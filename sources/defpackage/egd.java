package defpackage;

/* renamed from: egd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class egd implements Runnable {
    private final egh a;
    private final egg b;

    public egd(egh egh, egg egg) {
        this.a = egh;
        this.b = egg;
    }

    public final void run() {
        egh egh = this.a;
        egg egg = this.b;
        egh.c = 2;
        ege ege = new ege(egh, egh.b);
        if (egg != null) {
            egg.a(ege);
        }
    }
}
