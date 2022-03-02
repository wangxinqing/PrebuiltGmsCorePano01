package defpackage;

/* renamed from: osk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class osk implements osm {
    public final String a(String str, String str2) {
        return osn.d(str, str2, 64000);
    }

    public final String a(String str, byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    osn.a(str, bArr);
                    return null;
                }
            } catch (IllegalArgumentException e) {
                return e.getMessage();
            }
        }
        throw new IllegalArgumentException(str.concat(" empty"));
    }
}
