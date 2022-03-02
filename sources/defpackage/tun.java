package defpackage;

import android.content.Context;

/* renamed from: tun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tun implements Runnable {
    private final Context a;
    private final ttg b;
    private final String c;
    private final byte[] d;
    private final arxt e;
    private final twf f;

    public tun(Context context, ttg ttg, String str, byte[] bArr, arxt arxt, twf twf) {
        this.a = context;
        this.b = ttg;
        this.c = str;
        this.d = bArr;
        this.e = arxt;
        this.f = twf;
    }

    public final void run() {
        tvd.a(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
