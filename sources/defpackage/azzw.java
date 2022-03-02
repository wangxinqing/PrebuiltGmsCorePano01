package defpackage;

/* renamed from: azzw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class azzw extends baab {
    private final azzx c;

    public final Object a(byte[] bArr) {
        return this.c.a(new String(bArr, amqn.a));
    }

    public azzw(String str, azzx azzx) {
        super(str, false);
        amrl.a(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", (Object) str, (Object) "-bin");
        amrl.a((Object) azzx, (Object) "marshaller");
        this.c = azzx;
    }

    public final byte[] a(Object obj) {
        return this.c.a(obj).getBytes(amqn.a);
    }
}
