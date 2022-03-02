package defpackage;

/* renamed from: osl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class osl implements osm {
    public final String a(String str, String str2) {
        try {
            osn.b(str, str2, 64000);
            return null;
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    public final String a(String str, byte[] bArr) {
        try {
            osn.a(str, (Object) bArr);
            osn.a(str, bArr);
            return null;
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}
