package defpackage;

/* renamed from: aexu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aexu implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;
    private final bapu d;

    public aexu(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
        this.d = bapu4;
    }

    public static aexu a(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4) {
        return new aexu(bapu, bapu2, bapu3, bapu4);
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return new aext(this.a, awdy.a(this.b), this.c, this.d);
    }
}
