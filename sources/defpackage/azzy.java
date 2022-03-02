package defpackage;

/* renamed from: azzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class azzy extends baab {
    public final Object a(byte[] bArr) {
        return bArr;
    }

    public final byte[] a(Object obj) {
        return (byte[]) obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azzy(String str, azzu azzu) {
        super(str, false);
        boolean z = false;
        amrl.a(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", (Object) str, (Object) "-bin");
        amrl.a(str.length() > 4 ? true : z, (Object) "empty key name");
        amrl.a((Object) azzu, (Object) "marshaller is null");
    }
}
