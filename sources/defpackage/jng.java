package defpackage;

import android.content.Context;

/* renamed from: jng  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jng {
    private static Context a;
    private static Boolean b;

    public static synchronized boolean a(Context context) {
        synchronized (jng.class) {
            Context applicationContext = context.getApplicationContext();
            if (a != null) {
                if (b != null && a == applicationContext) {
                    boolean booleanValue = b.booleanValue();
                    return booleanValue;
                }
            }
            b = null;
            if (jkr.e()) {
                b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    b = true;
                } catch (ClassNotFoundException e) {
                    b = false;
                }
            }
            a = applicationContext;
            boolean booleanValue2 = b.booleanValue();
            return booleanValue2;
        }
    }
}
