package defpackage;

import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: asim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asim implements asgs {
    final /* synthetic */ asis a;

    public asim(asis asis) {
        this.a = asis;
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        asem asem = (asem) audx;
        aucd aucd = (aucd) asem.c(5);
        aucd.a((aucj) asem);
        asfz d = this.a.d();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        asem asem2 = (asem) aucd.b;
        asem asem3 = asem.e;
        d.getClass();
        asem2.b = d;
        asem2.a |= 1;
        asem asem4 = (asem) aucd.i();
        aucd o = ashb.h.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ashb ashb = (ashb) o.b;
        ashb.b = 8;
        int i = ashb.a | 1;
        ashb.a = i;
        asem4.getClass();
        ashb.g = asem4;
        ashb.a = i | 32;
        this.a.a(new OperationStatus((ashb) o.i()));
    }
}
