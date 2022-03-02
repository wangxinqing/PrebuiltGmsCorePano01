package defpackage;

/* renamed from: baij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baij extends azzm {
    final /* synthetic */ Throwable a;
    private final azzh b = azzh.b(babj.n.a("Panic! This is a bug!").b(this.a));

    public baij(Throwable th) {
        this.a = th;
    }

    public final azzh a() {
        return this.b;
    }

    public final String toString() {
        amrg a2 = amrh.a(baij.class);
        a2.a("panicPickResult", (Object) this.b);
        return a2.toString();
    }
}
