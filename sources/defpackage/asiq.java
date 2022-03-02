package defpackage;

import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: asiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asiq implements asgs {
    final /* synthetic */ asis a;

    public asiq(asis asis) {
        this.a = asis;
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        asgh asgh = (asgh) audx;
        aucd aucd = (aucd) asgh.c(5);
        aucd.a((aucj) asgh);
        asgg asgg = (asgg) aucd;
        asfz d = this.a.d();
        if (asgg.c) {
            asgg.c();
            asgg.c = false;
        }
        asgh asgh2 = (asgh) asgg.b;
        asgh asgh3 = asgh.d;
        d.getClass();
        asgh2.b = d;
        asgh2.a |= 1;
        asgh asgh4 = (asgh) asgg.i();
        aucd o = ashb.h.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ashb ashb = (ashb) o.b;
        ashb.b = 5;
        int i = ashb.a | 1;
        ashb.a = i;
        asgh4.getClass();
        ashb.f = asgh4;
        ashb.a = i | 16;
        this.a.a(new OperationStatus((ashb) o.i()));
    }
}
