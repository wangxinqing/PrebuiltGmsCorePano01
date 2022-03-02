package defpackage;

import android.app.Application;
import android.content.Context;

/* renamed from: iiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iiz {
    private static ahhd a;

    public static Application a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        return null;
    }

    public static synchronized ahhd b(Context context) {
        ahhd ahhd;
        synchronized (iiz.class) {
            if (a == null) {
                a = new ahgr(context.getApplicationContext(), "STREAMZ_ANDROID_AUTH");
            }
            ahhd = a;
        }
        return ahhd;
    }
}
