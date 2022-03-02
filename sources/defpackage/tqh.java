package defpackage;

import java.io.Closeable;

/* renamed from: tqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tqh implements Runnable {
    private final tqi a;
    private final uwh b;

    public tqh(tqi tqi, uwh uwh) {
        this.a = tqi;
        this.b = uwh;
    }

    public final void run() {
        tqi tqi = this.a;
        uwh uwh = this.b;
        String str = uwh.a;
        trz a2 = trz.a(uwh);
        if (a2 != null) {
            jjg jjg = tky.a;
            tky.a(tqi.b);
        } else {
            jjt.a((Closeable) uwh);
        }
        tqi.c.a(tqi.a, str, (tnm) a2, asoe.WIFI_LAN);
    }
}
