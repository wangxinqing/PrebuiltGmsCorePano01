package defpackage;

import java.util.Map;

/* renamed from: suv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class suv implements Runnable {
    private final suu a;
    private final int b;
    private final Throwable c;
    private final byte[] d;
    private final String e;
    private final Map f;

    public suv(String str, suu suu, int i, Throwable th, byte[] bArr, Map map) {
        iva.a((Object) suu);
        this.a = suu;
        this.b = i;
        this.c = th;
        this.d = bArr;
        this.e = str;
        this.f = map;
    }

    public final void run() {
        this.a.a(this.e, this.b, this.c, this.d, this.f);
    }
}
