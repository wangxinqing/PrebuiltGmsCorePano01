package defpackage;

/* renamed from: aiui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiui implements Runnable {
    private final aivb a;
    private final int b;

    public aiui(aivb aivb, int i) {
        this.a = aivb;
        this.b = i;
    }

    public final void run() {
        aivb aivb = this.a;
        aivb.a.a(this.b);
    }
}
