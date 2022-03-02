package defpackage;

import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: asin  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asin implements asgs {
    final /* synthetic */ asis a;

    public asin(asis asis) {
        this.a = asis;
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        asfk asfk = (asfk) audx;
        aucd aucd = (aucd) asfk.c(5);
        aucd.a((aucj) asfk);
        asfz d = this.a.d();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        asfk asfk2 = (asfk) aucd.b;
        asfk asfk3 = asfk.g;
        d.getClass();
        asfk2.b = d;
        asfk2.a |= 1;
        asfk asfk4 = (asfk) aucd.i();
        aucd o = ashb.h.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ashb ashb = (ashb) o.b;
        ashb.b = 2;
        int i = ashb.a | 1;
        ashb.a = i;
        asfk4.getClass();
        ashb.c = asfk4;
        ashb.a = i | 2;
        this.a.a(new OperationStatus((ashb) o.i()));
    }
}
