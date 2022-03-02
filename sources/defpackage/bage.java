package defpackage;

/* renamed from: bage  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bage extends bajy {
    private boolean b;
    private final babj c;
    private final baeg d;

    public bage(babj babj) {
        this(babj, baeg.PROCESSED);
    }

    public final void a(baeh baeh) {
        amrl.b(!this.b, (Object) "already started");
        this.b = true;
        baeh.a(this.c, this.d, new baaf());
    }

    public bage(babj babj, baeg baeg) {
        amrl.a(!babj.a(), (Object) "error must not be OK");
        this.c = babj;
        this.d = baeg;
    }

    public final void a(bahb bahb) {
        bahb.a("error", this.c);
        bahb.a("progress", this.d);
    }
}
