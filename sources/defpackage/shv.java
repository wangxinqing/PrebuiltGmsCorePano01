package defpackage;

import javax.net.SocketFactory;

/* renamed from: shv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class shv implements apyp {
    static final apyp a = new shv();

    private shv() {
    }

    public final azxi a(apyo apyo) {
        bami a2 = bami.a(apyo.k(), apyo.l());
        a2.a(((apxw) apyo).b);
        a2.q = new afne(SocketFactory.getDefault(), 22017);
        return a2.b();
    }
}
