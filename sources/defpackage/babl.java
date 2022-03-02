package defpackage;

/* renamed from: babl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class babl extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;
    public final babj a;
    public final baaf b;
    private final boolean c;

    public babl(babj babj) {
        this(babj, (baaf) null);
    }

    public final synchronized Throwable fillInStackTrace() {
        if (!this.c) {
            return this;
        }
        return super.fillInStackTrace();
    }

    public babl(babj babj, baaf baaf) {
        super(babj.a(babj), babj.t);
        this.a = babj;
        this.b = baaf;
        this.c = true;
        fillInStackTrace();
    }
}
