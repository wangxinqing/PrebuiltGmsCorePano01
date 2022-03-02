package defpackage;

import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: asio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asio implements asgs {
    final /* synthetic */ asis a;

    public asio(asis asis) {
        this.a = asis;
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        asgl asgl = (asgl) audx;
        aucd aucd = (aucd) asgl.c(5);
        aucd.a((aucj) asgl);
        asfz d = this.a.d();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        asgl asgl2 = (asgl) aucd.b;
        asgl asgl3 = asgl.c;
        d.getClass();
        asgl2.b = d;
        asgl2.a |= 1;
        asgl asgl4 = (asgl) aucd.i();
        aucd o = ashb.h.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ashb ashb = (ashb) o.b;
        ashb.b = 3;
        int i = ashb.a | 1;
        ashb.a = i;
        asgl4.getClass();
        ashb.d = asgl4;
        ashb.a = i | 4;
        this.a.a(new OperationStatus((ashb) o.i()));
    }
}
