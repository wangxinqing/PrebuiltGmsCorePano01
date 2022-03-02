package defpackage;

import java.util.Collections;

/* renamed from: csk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class csk {
    private static final iwd a = dit.a("RepositoryConverters");

    public static aqsr a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (aqsr) aucj.a((aucj) aqsr.d, bArr, aubs.c());
        } catch (auda e) {
            a.e("Failed to convert ByteArray to ResourceKey.", e, new Object[0]);
            return null;
        }
    }

    public static aqso b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (aqso) aucj.a((aucj) aqso.f, bArr, aubs.c());
        } catch (auda e) {
            a.e("Failed to convert ByteArray to Resource.", e, new Object[0]);
            return null;
        }
    }

    public static byte[] a(aqso aqso) {
        if (aqso != null) {
            return aqso.k();
        }
        return null;
    }

    public static byte[] a(aqsr aqsr) {
        if (aqsr == null) {
            return null;
        }
        aqsp aqsp = (aqsp) aqsr.d.o();
        int i = aqsr.b;
        if (aqsp.c) {
            aqsp.c();
            aqsp.c = false;
        }
        aqsr aqsr2 = (aqsr) aqsp.b;
        aqsr2.a |= 1;
        aqsr2.b = i;
        aqsp.a(anbd.b(Collections.unmodifiableMap(aqsr.c)));
        return ((aqsr) aqsp.i()).k();
    }
}
