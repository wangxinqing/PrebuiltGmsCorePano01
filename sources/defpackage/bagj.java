package defpackage;

/* renamed from: bagj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class bagj implements baep {
    public final azxa a() {
        return c().a();
    }

    public baef a(baaj baaj, baaf baaf, azxh azxh) {
        throw null;
    }

    public final azyx b() {
        return c().b();
    }

    /* access modifiers changed from: protected */
    public abstract baep c();

    public final String toString() {
        amrg a = amrh.a((Object) this);
        a.a("delegate", (Object) c());
        return a.toString();
    }

    public final void b(babj babj) {
        c().b(babj);
    }

    public final Runnable a(bajn bajn) {
        return c().a(bajn);
    }

    public final void a(babj babj) {
        c().a(babj);
    }
}
