package defpackage;

/* renamed from: baad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baad extends baab {
    private final baae c;

    public final Object a(byte[] bArr) {
        return this.c.a(bArr);
    }

    public baad(String str, boolean z, baae baae) {
        super(str, z);
        amrl.a(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", (Object) str, (Object) "-bin");
        amrl.a((Object) baae, (Object) "marshaller");
        this.c = baae;
    }

    public final byte[] a(Object obj) {
        return this.c.a(obj);
    }
}
