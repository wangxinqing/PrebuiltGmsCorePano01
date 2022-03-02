package defpackage;

/* renamed from: aiun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiun implements Runnable {
    private final aivb a;
    private final String b;
    private final int c;
    private final String d;

    public aiun(aivb aivb, String str, int i, String str2) {
        this.a = aivb;
        this.b = str;
        this.c = i;
        this.d = str2;
    }

    public final void run() {
        aivb aivb = this.a;
        aivb.a.a(this.b, this.c, this.d);
    }
}
