package defpackage;

/* renamed from: spp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class spp {
    final String a;
    final String b;
    final long c;
    final long d;
    final long e;
    final long f;
    final long g;
    final Long h;
    final Long i;
    final Long j;
    final Boolean k;

    public spp(String str, String str2, long j2, long j3, long j4) {
        this(str, str2, j2, j3, 0, j4, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public final spp a(long j2) {
        return new spp(this.a, this.b, this.c, this.d, this.e, j2, this.g, this.h, this.i, this.j, this.k);
    }

    public spp(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l, Long l2, Long l3, Boolean bool) {
        long j7 = j2;
        long j8 = j3;
        long j9 = j4;
        long j10 = j6;
        iva.c(str);
        iva.c(str2);
        boolean z = true;
        iva.b(j7 >= 0);
        iva.b(j8 >= 0);
        iva.b(j9 >= 0);
        iva.b(j10 < 0 ? false : z);
        this.a = str;
        this.b = str2;
        this.c = j7;
        this.d = j8;
        this.e = j9;
        this.f = j5;
        this.g = j10;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    /* access modifiers changed from: package-private */
    public final spp a(long j2, long j3) {
        return new spp(this.a, this.b, this.c, this.d, this.e, this.f, j2, Long.valueOf(j3), this.i, this.j, this.k);
    }

    /* access modifiers changed from: package-private */
    public final spp a(Long l, Long l2, Boolean bool) {
        return new spp(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l, l2, (bool != null && !bool.booleanValue()) ? null : bool);
    }
}
