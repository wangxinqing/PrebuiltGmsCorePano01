package defpackage;

import java.util.List;

/* renamed from: qrx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qrx implements acvs {
    final /* synthetic */ boolean a;
    final /* synthetic */ String[] b;
    final /* synthetic */ List c;
    final /* synthetic */ aosh d;
    final /* synthetic */ qry e;

    public qrx(qry qry, boolean z, String[] strArr, List list, aosh aosh) {
        this.e = qry;
        this.a = z;
        this.b = strArr;
        this.c = list;
        this.d = aosh;
    }

    public final void a(Exception exc) {
        this.e.c.d();
        qoi.b(exc, "Mediastore delete Icing failed.", new Object[0]);
        if (this.a) {
            this.d.b(this.e.a(this.e.a.a(this.b), this.c, this.b, false));
            return;
        }
        this.d.b((Object) false);
    }
}
