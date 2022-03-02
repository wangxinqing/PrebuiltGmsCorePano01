package defpackage;

/* renamed from: babk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class babk extends Exception {
    private static final long serialVersionUID = -660954903976144640L;
    public final babj a;
    private final boolean b = true;

    public final synchronized Throwable fillInStackTrace() {
        if (!this.b) {
            return this;
        }
        return super.fillInStackTrace();
    }

    public babk(babj babj) {
        super(babj.a(babj), babj.t);
        this.a = babj;
        fillInStackTrace();
    }
}
