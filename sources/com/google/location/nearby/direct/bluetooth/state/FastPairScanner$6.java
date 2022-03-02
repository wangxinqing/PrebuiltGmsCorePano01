package com.google.location.nearby.direct.bluetooth.state;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FastPairScanner$6 extends nla {
    final /* synthetic */ aseb a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastPairScanner$6(aseb aseb, String str) {
        super(str);
        this.a = aseb;
    }

    public final void a(Context context, Intent intent) {
        if (intent.getAction().equals("com.google.android.gms.nearby.ACTION_FAST_PAIR_CONNECTED")) {
            ((anih) ((anih) asil.a.d()).a("com.google.location.nearby.direct.bluetooth.state.FastPairScanner$6", "a", 257, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Change connect status and change mode connect");
            aseb aseb = this.a;
            int i = aseb.l;
            aseb.g = true;
        }
        if (intent.getAction().equals("com.google.android.gms.nearby.ACTION_FAST_PAIR_DISCONNECTED")) {
            ((anih) ((anih) asil.a.d()).a("com.google.location.nearby.direct.bluetooth.state.FastPairScanner$6", "a", 261, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Change connect status and change mode disconnect");
            aseb aseb2 = this.a;
            int i2 = aseb.l;
            aseb2.g = false;
        }
        aseb aseb3 = this.a;
        int i3 = aseb.l;
        if (aseb3.c()) {
            aseb aseb4 = this.a;
            aseb4.a.c(aseb4.j);
        }
    }
}
