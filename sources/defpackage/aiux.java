package defpackage;

/* renamed from: aiux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiux implements Runnable {
    private final aivb a;
    private final String b;

    public aiux(aivb aivb, String str) {
        this.a = aivb;
        this.b = str;
    }

    public final void run() {
        aivb aivb = this.a;
        aivb.a.a(this.b);
    }
}
