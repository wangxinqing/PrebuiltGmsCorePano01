package defpackage;

/* renamed from: aiuu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiuu implements Runnable {
    private final aivb a;
    private final int b;
    private final String c;

    public aiuu(aivb aivb, int i, String str) {
        this.a = aivb;
        this.b = i;
        this.c = str;
    }

    public final void run() {
        aivb aivb = this.a;
        aivb.a.a(this.b, this.c);
    }
}
