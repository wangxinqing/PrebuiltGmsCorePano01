package defpackage;

/* renamed from: lpn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lpn implements icm {
    final /* synthetic */ lpq a;

    public lpn(lpq lpq) {
        this.a = lpq;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        kvn kvn = (kvn) icl;
        if (kvn.a.c()) {
            this.a.h.a(kvn.b);
            this.a.i.b(kvn.b);
            return;
        }
        lpq.a.b("SelectFileFragment", "Could not get metadata of newly created folder (%s)", kvn.a.j);
    }
}
