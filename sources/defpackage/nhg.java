package defpackage;

/* renamed from: nhg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nhg {
    public static nfv a(byte[] bArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        iva.a((Object) bArr, (Object) "null input");
        try {
            nfv nfv = (nfv) aucj.a((aucj) nfv.c, bArr);
            if (nfv.b > 0) {
                z = true;
            } else {
                z = false;
            }
            iva.a(z, (Object) "directory.version is invalid");
            if (nfv.a.size() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            iva.a(z2, (Object) "directory.family null or empty");
            aucx aucx = nfv.a;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                nfz nfz = (nfz) aucx.get(i);
                iva.a((Object) nfz, (Object) "family");
                if ((nfz.a & 1) == 0 || nfz.b.length() <= 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                iva.a(z3, (Object) "family.name null or empty");
                if (nfz.d.size() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                iva.a(z4, (Object) "family.fonts null or empty");
            }
            return nfv;
        } catch (auda e) {
            throw new IllegalArgumentException("Not a valid Directory proto", e);
        }
    }
}
