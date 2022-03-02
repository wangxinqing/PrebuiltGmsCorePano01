package defpackage;

import android.os.Handler;

/* renamed from: ueu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ueu implements acvp {
    private final ufu a;

    public ueu(ufu ufu) {
        this.a = ufu;
    }

    public final void a(acwa acwa) {
        ufu ufu = this.a;
        ufu.a.a((iby) ufu, "connection");
        ifn ifn = ufu.k;
        ief ief = new ief(ufu.g);
        Handler handler = ifn.o;
        handler.sendMessage(handler.obtainMessage(14, ief));
    }
}
