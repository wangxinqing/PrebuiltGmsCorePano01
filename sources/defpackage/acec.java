package defpackage;

import android.content.Context;

/* renamed from: acec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acec {
    private static volatile abzt a;

    private acec() {
    }

    public static acqi b(Context context) {
        return new acqi(context, a());
    }

    public static abzt c(Context context) {
        if (a == null) {
            synchronized (acec.class) {
                if (a == null) {
                    a = new abzt(context);
                }
            }
        }
        return a;
    }

    public static abpk d(Context context) {
        return new aceb(context);
    }

    public static acqg a() {
        abnb.e();
        return acqg.a();
    }

    public static tiq a(Context context) {
        abnb.e();
        tir tir = new tir();
        tir.a = "smartdevice";
        return tcn.a(context, tir.a());
    }
}
