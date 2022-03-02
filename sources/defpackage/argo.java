package defpackage;

/* renamed from: argo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class argo extends argy {
    final /* synthetic */ argt a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public argo(argt argt) {
        super(argt);
        this.a = argt;
    }

    public final Object a() {
        return this.a.b[this.b.d()];
    }

    public final Object a(Object obj) {
        if (obj != null) {
            Object a2 = a();
            this.a.b[this.b.d()] = obj;
            return a2;
        }
        throw new NullPointerException("The value must not be null.");
    }
}
