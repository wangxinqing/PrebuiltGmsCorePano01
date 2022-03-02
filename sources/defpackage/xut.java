package defpackage;

/* renamed from: xut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xut implements bn {
    private final xuo a;
    private final aoru b;
    private final xsk c;
    private final xtq d;
    private final xun e;

    public xut(xsk xsk, xuo xuo, aoru aoru, xun xun, xtq xtq) {
        this.c = xsk;
        this.a = xuo;
        this.b = aoru;
        this.e = xun;
        this.d = xtq;
    }

    public static xut a(qcd qcd) {
        wlr wlr = new wlr();
        wlr.a = 80;
        wls a2 = wlr.a();
        return new xut(new xsk(qcd.getApplicationContext(), qcd.getPackageName()), xuo.a(qcd), jfm.a(9), new xun(wlt.d(qcd, a2)), new xtq(wst.a(qcd, a2)));
    }

    public final bl a(Class cls) {
        if (cls.isAssignableFrom(xug.class)) {
            return (bl) cls.cast(new xug(new xsj(this.a, this.b, this.c), this.a, this.e, this.d));
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("ViewModelFactory cannot create an instance of ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
