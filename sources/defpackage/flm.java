package defpackage;

import android.content.Context;

/* renamed from: flm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class flm {
    public static final qcc a = qcb.a(fll.a);
    public static final flf d = new flf("phone_numbers", ampu.a, new flh((auef) auuk.b.c(7)));
    public static final flf e = new flf("isAutoSignInEnabledForApp", true, flg.a);
    public final fla b;
    public final Object c = new Object();

    static {
        new flf("isNeverSave", false, flg.a);
    }

    public flm(Context context) {
        int i = jhg.a;
        fla a2 = fla.a(context);
        iva.a((Object) a2);
        this.b = a2;
    }
}
