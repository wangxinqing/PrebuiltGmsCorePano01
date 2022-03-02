package defpackage;

import java.util.concurrent.Executor;

/* renamed from: acvx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acvx implements acwb, acvv, acvs, acvm {
    public final acvz a;
    private final Executor b;
    private final acwi c;

    public acvx(Executor executor, acvz acvz, acwi acwi) {
        this.b = executor;
        this.a = acvz;
        this.c = acwi;
    }

    public final void a() {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        this.c.g();
    }

    public final void a(acwa acwa) {
        this.b.execute(new acvw(this, acwa));
    }

    public final void a(Exception exc) {
        this.c.a(exc);
    }

    public final void a(Object obj) {
        this.c.a(obj);
    }
}
