package defpackage;

/* renamed from: tqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tqf implements Runnable {
    private final tqg a;
    private final usx b;

    public tqf(tqg tqg, usx usx) {
        this.a = tqg;
        this.b = usx;
    }

    public final void run() {
        tqg tqg = this.a;
        usx usx = this.b;
        String str = usx.a;
        tro a2 = tro.a(usx);
        jjg jjg = tky.a;
        tky.a(tqg.b);
        tqg.c.a(tqg.a, str, (tnm) a2, asoe.WEB_RTC);
    }
}
