package defpackage;

/* renamed from: aiug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiug implements Runnable {
    private final aivb a;
    private final String b;
    private final int c;
    private final aqek d;

    public aiug(aivb aivb, String str, int i, aqek aqek) {
        this.a = aivb;
        this.b = str;
        this.c = i;
        this.d = aqek;
    }

    public final void run() {
        aivb aivb = this.a;
        aivb.a.a(this.b, this.c, this.d);
    }
}
