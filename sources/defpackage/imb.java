package defpackage;

/* renamed from: imb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class imb {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final byte[] f;
    public final long g;
    public final aogr h;
    public final boolean i;

    public imb(String str, String str2, String str3, long j, long j2, long j3, aogr aogr, boolean z, byte[] bArr) {
        boolean z2;
        long j4 = j;
        long j5 = j2;
        boolean z3 = true;
        if (j4 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.a(z2, (Object) "executionTimeSeconds must be greater than 0");
        iva.a(j5 < 0 ? false : z3, (Object) "ttl must not be negative");
        iva.c(str);
        this.a = str;
        iva.c(str2);
        this.b = str2;
        iva.c(str3);
        this.c = str3;
        this.d = j4;
        this.e = j5;
        this.f = bArr == null ? new byte[0] : bArr;
        this.g = j3;
        this.h = aogr;
        this.i = z;
    }
}
