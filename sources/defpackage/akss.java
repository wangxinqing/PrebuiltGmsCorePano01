package defpackage;

import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: akss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class akss extends aktf {
    private final String b;
    private final String c;
    private final byte[] d;
    private final int e;
    private final Object f;
    private final int g;
    private final iyn h;

    public akss(iyn iyn, String str, String str2, String str3, byte[] bArr, Object obj, int i, int i2) {
        super(str3);
        this.h = iyn;
        this.b = str;
        this.c = str2;
        this.d = bArr;
        this.e = i2;
        this.f = obj;
        this.g = i;
    }

    public anui a(int i, long j, PlacesParams placesParams, Object obj) {
        anui a = aktf.a(this.g, i, j, placesParams);
        aucd aucd = (aucd) a.c(5);
        aucd.a((aucj) a);
        aoei aoei = ((anui) aucd.b).c;
        if (aoei == null) {
            aoei = aoei.w;
        }
        aucd aucd2 = (aucd) aoei.c(5);
        aucd2.a((aucj) aoei);
        aodn aodn = ((aoei) aucd2.b).v;
        if (aodn == null) {
            aodn = aodn.q;
        }
        aucd aucd3 = (aucd) aodn.c(5);
        aucd3.a((aucj) aodn);
        int i2 = this.g;
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        aodn aodn2 = (aodn) aucd3.b;
        aodn2.b = i2 - 1;
        aodn2.a |= 1;
        aodn aodn3 = (aodn) aucd3.i();
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aoei aoei2 = (aoei) aucd2.b;
        aodn3.getClass();
        aoei2.v = aodn3;
        aoei2.a |= 8388608;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anui anui = (anui) aucd.b;
        aoei aoei3 = (aoei) aucd2.i();
        anui anui2 = anui.p;
        aoei3.getClass();
        anui.c = aoei3;
        anui.a |= 2;
        return (anui) aucd.i();
    }

    public final Object a() {
        return this.h.a(this.a, this.d, this.f, this.b, this.c, azcl.c(), this.e);
    }
}
