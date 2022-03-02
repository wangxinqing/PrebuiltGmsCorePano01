package defpackage;

import java.util.concurrent.Executor;

/* renamed from: acvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acvj implements acwb, acvv, acvs, acvm {
    public final acvf a;
    public final acwi b;
    private final Executor c;

    public acvj(Executor executor, acvf acvf, acwi acwi) {
        this.c = executor;
        this.a = acvf;
        this.b = acwi;
    }

    public final void a() {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        this.b.g();
    }

    public final void a(acwa acwa) {
        this.c.execute(new acvi(this, acwa));
    }

    public final void a(Exception exc) {
        this.b.a(exc);
    }

    public final void a(Object obj) {
        this.b.a(obj);
    }
}
