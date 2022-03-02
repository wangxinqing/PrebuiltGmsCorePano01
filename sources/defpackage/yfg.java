package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: yfg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yfg extends yfw {
    public yfg(Context context, String str) {
        super(context, str, jfm.a(1, 10));
        jjj.a((SQLiteOpenHelper) this);
    }

    public static yfg a(Context context) {
        if (aekv.a(context)) {
            context = context.createDeviceProtectedStorageContext();
        }
        return c(context);
    }

    public static yfg b(Context context) {
        if (!context.isDeviceProtectedStorage()) {
            context = context.createDeviceProtectedStorageContext();
        }
        return c(context);
    }

    private static yfg c(Context context) {
        boolean z = false;
        if (aekv.a() && context.isDeviceProtectedStorage()) {
            z = true;
        }
        synchronized (c) {
            if (z) {
                if (yfw.d == null) {
                    yfw.d = new yfg(context, "phenotype.db");
                }
                yfw.d.f++;
                if (yfw.d.g != null && yfw.d.g.cancel(true)) {
                    yfw.d.g = null;
                }
                yfw yfw = yfw.d;
                return (yfg) yfw;
            }
            if (yfw.e == null) {
                yfw.e = new yfg(context, "phenotype.db");
            }
            yfw.e.f++;
            if (yfw.e.g != null && yfw.e.g.cancel(true)) {
                yfw.e.g = null;
            }
            yfw yfw2 = yfw.e;
            return (yfg) yfw2;
        }
    }
}
