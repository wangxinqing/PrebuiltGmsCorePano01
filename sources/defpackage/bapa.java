package defpackage;

/* renamed from: bapa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bapa extends azxk {
    private final baow a;
    private Object b;

    public bapa(baow baow) {
        this.a = baow;
    }

    public final void a(baaf baaf) {
    }

    public final void a(babj babj, baaf baaf) {
        if (babj.a()) {
            if (this.b == null) {
                this.a.a((Throwable) babj.n.a("No value received for unary call").a(baaf));
            }
            this.a.b(this.b);
            return;
        }
        this.a.a((Throwable) babj.a(baaf));
    }

    public final void a(Object obj) {
        if (this.b == null) {
            this.b = obj;
            return;
        }
        throw babj.n.a("More than one value received for unary call").b();
    }
}
