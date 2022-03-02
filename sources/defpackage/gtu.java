package defpackage;

/* renamed from: gtu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gtu {
    private final gts a = new gts();
    private final gtz b = new gtz();
    private final gty c = new gty();
    private final guc d = new guc();
    private final gtx e = new gtx();

    public final gtt a(gti gti) {
        int length;
        byte b2;
        byte[] bArr = gts.a;
        byte[] a2 = gti.a(76);
        if (a2 != null && a2.length >= 23 && a2[0] == 2 && a2[1] == 21) {
            return this.a;
        }
        byte[] a3 = gti.a(gtw.a);
        if (gtw.e(gti) && a3 != null && a3.length >= 18 && (a3[0] & -16) == 0) {
            return this.b;
        }
        byte[] a4 = gti.a(gtw.a);
        if (gtw.e(gti) && a4 != null && a4.length >= 4 && (a4[0] & -16) == 16) {
            return this.d;
        }
        byte[] a5 = gti.a(gtw.a);
        if (gtw.e(gti) && a5 != null && (length = a5.length) >= 2 && (a5[0] & 240) == 32 && (((b2 = a5[1]) == 1 && length >= 18) || (b2 == 0 && length >= 14))) {
            return this.c;
        }
        byte[] a6 = gti.a(gtw.a);
        if (gtw.e(gti) && a6 != null && a6.length >= 10 && (a6[0] & -16) == 48) {
            return this.e;
        }
        return null;
    }
}
