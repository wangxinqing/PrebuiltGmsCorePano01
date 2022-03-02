package defpackage;

import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: asip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asip implements asgs {
    final /* synthetic */ asis a;

    public asip(asis asis) {
        this.a = asis;
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        aseq aseq = (aseq) audx;
        aucd aucd = (aucd) aseq.c(5);
        aucd.a((aucj) aseq);
        asfz d = this.a.d();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aseq aseq2 = (aseq) aucd.b;
        aseq aseq3 = aseq.c;
        d.getClass();
        aseq2.b = d;
        aseq2.a |= 1;
        aseq aseq4 = (aseq) aucd.i();
        aucd o = ashb.h.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ashb ashb = (ashb) o.b;
        ashb.b = 4;
        int i = ashb.a | 1;
        ashb.a = i;
        aseq4.getClass();
        ashb.e = aseq4;
        ashb.a = i | 8;
        this.a.a(new OperationStatus((ashb) o.i()));
    }
}
