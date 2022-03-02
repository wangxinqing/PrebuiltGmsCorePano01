package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: fon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fon implements aora {
    final /* synthetic */ foo a;

    public fon(foo foo) {
        this.a = foo;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        amri amri = (amri) obj;
        if (amri.a()) {
            this.a.c = ((Integer) amri.b()).intValue();
            this.a.b();
            return;
        }
        this.a.g.a(Status.a);
    }

    public final void a(Throwable th) {
        Status b = qbf.a(th).b();
        foo.a.d("Encountered an error {error code= %d, error message= %s}", Integer.valueOf(b.i), amrk.b(b.j));
        this.a.g.a(b);
    }
}
