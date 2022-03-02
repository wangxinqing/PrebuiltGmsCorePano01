package defpackage;

import android.content.Context;

/* renamed from: cmn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cmn {
    private static volatile cmo b = null;
    public final cny a;

    public cmn(cny cny, coc coc) {
        this.a = cny;
        coc.a.execute(new coa(coc));
    }

    public static cmn a() {
        cmo cmo = b;
        if (cmo != null) {
            return (cmn) cmo.a.a();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void a(Context context) {
        if (b == null) {
            synchronized (cmn.class) {
                if (b == null) {
                    cmf cmf = new cmf();
                    awdx.a(context);
                    cmf.a = context;
                    awdx.a((Object) cmf.a, Context.class);
                    b = new cmo(cmf.a);
                }
            }
        }
    }
}
