package defpackage;

/* renamed from: argd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class argd extends argy {
    final /* synthetic */ argi a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public argd(argi argi) {
        super(argi);
        this.a = argi;
    }

    public final Object a() {
        return this.a.a[this.b.d()];
    }

    public final Object a(Object obj) {
        if (obj != null) {
            Object a2 = a();
            this.a.a[this.b.d()] = obj;
            return a2;
        }
        throw new NullPointerException("The value must not be null.");
    }
}
