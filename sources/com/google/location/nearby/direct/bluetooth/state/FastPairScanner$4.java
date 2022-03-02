package com.google.location.nearby.direct.bluetooth.state;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FastPairScanner$4 extends nla {
    final /* synthetic */ aseb a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastPairScanner$4(aseb aseb, String str) {
        super(str);
        this.a = aseb;
    }

    public final void a(Context context, Intent intent) {
        if (aymw.s()) {
            jjg jjg = asil.a;
            aseb aseb = this.a;
            int i = aseb.l;
            aseb.a.e(aseb.j);
            aseb aseb2 = this.a;
            aseb2.a.a(aseb2.j, aymn.a.a().o());
            aseb aseb3 = this.a;
            aseb3.a(aseb3.f, (int) aymn.i());
        }
    }
}
