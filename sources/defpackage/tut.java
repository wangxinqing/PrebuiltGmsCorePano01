package defpackage;

import android.content.Context;

/* renamed from: tut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tut implements Runnable {
    private final Context a;
    private final tzi b;
    private final byte[] c;
    private final boolean d;
    private final double e;
    private final arxt f;
    private final String g;

    public tut(Context context, tzi tzi, byte[] bArr, boolean z, double d2, arxt arxt, String str) {
        this.a = context;
        this.b = tzi;
        this.c = bArr;
        this.d = z;
        this.e = d2;
        this.f = arxt;
        this.g = str;
    }

    public final void run() {
        tvd.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
