package defpackage;

/* renamed from: aiuv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiuv implements Runnable {
    private final aivb a;
    private final int b;
    private final String c;
    private final String d;

    public aiuv(aivb aivb, int i, String str, String str2) {
        this.a = aivb;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final void run() {
        aivb aivb = this.a;
        aivb.a.a(this.b, this.c, this.d);
    }
}
