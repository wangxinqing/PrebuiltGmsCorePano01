package defpackage;

/* renamed from: aiuw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiuw implements Runnable {
    private final aivb a;
    private final ahuz b;

    public aiuw(aivb aivb, ahuz ahuz) {
        this.a = aivb;
        this.b = ahuz;
    }

    public final void run() {
        aivb aivb = this.a;
        aivb.a.a(this.b);
    }
}
