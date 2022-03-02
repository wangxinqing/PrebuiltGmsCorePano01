package defpackage;

import android.app.Application;
import android.content.Context;

/* renamed from: fyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fyp {
    private static ahhd a;

    public static synchronized ahhd a(Context context) {
        ahhd ahhd;
        synchronized (fyp.class) {
            if (a == null) {
                a = new ahgr(context.getApplicationContext(), "STREAMZ_ANDROID_AUTH_ACCOUNT");
            }
            ahhd = a;
        }
        return ahhd;
    }

    public static fya b(Context context) {
        Context context2;
        Application application;
        jfc a2 = jfm.a(1, 10);
        ahhd a3 = a(context);
        if (context == null) {
            context2 = ihs.b().getApplicationContext();
        } else {
            context2 = context.getApplicationContext();
        }
        if (context2 instanceof Application) {
            application = (Application) context2;
        } else {
            application = null;
        }
        return new fya(new eja(a2, a3, application, "gmscore_android_auth_account"));
    }
}
