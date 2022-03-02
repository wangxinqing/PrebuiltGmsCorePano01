package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: fv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fv {
    protected static final Class a;
    protected static final Field b;
    protected static final Field c;
    protected static final Method d;
    protected static final Method e;
    protected static final Method f;
    private static final Handler g = new Handler(Looper.getMainLooper());

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f A[SYNTHETIC, Splitter:B:23:0x005f] */
    static {
        /*
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            g = r0
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x0015
        L_0x0013:
            r1 = move-exception
            r1 = r0
        L_0x0015:
            a = r1
            r1 = 1
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ all -> 0x0024 }
            r2.setAccessible(r1)     // Catch:{ all -> 0x0024 }
            goto L_0x0026
        L_0x0024:
            r2 = move-exception
            r2 = r0
        L_0x0026:
            b = r2
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ all -> 0x0034 }
            r2.setAccessible(r1)     // Catch:{ all -> 0x0034 }
            goto L_0x0036
        L_0x0034:
            r2 = move-exception
            r2 = r0
        L_0x0036:
            c = r2
            java.lang.Class r2 = a
            java.lang.String r3 = "performStopActivity"
            r4 = 3
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L_0x0058
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ all -> 0x0057 }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x0057 }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0057 }
            r7[r1] = r8     // Catch:{ all -> 0x0057 }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch:{ all -> 0x0057 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r7)     // Catch:{ all -> 0x0057 }
            r2.setAccessible(r1)     // Catch:{ all -> 0x0057 }
            goto L_0x0059
        L_0x0057:
            r2 = move-exception
        L_0x0058:
            r2 = r0
        L_0x0059:
            d = r2
            java.lang.Class r2 = a
            if (r2 == 0) goto L_0x0072
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x0071 }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x0071 }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0071 }
            r7[r1] = r8     // Catch:{ all -> 0x0071 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r7)     // Catch:{ all -> 0x0071 }
            r2.setAccessible(r1)     // Catch:{ all -> 0x0071 }
            goto L_0x0073
        L_0x0071:
            r2 = move-exception
        L_0x0072:
            r2 = r0
        L_0x0073:
            e = r2
            java.lang.Class r2 = a
            boolean r3 = a()
            if (r3 != 0) goto L_0x007e
            goto L_0x00bb
        L_0x007e:
            if (r2 == 0) goto L_0x00ba
            r3 = 9
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ all -> 0x00b9 }
            java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
            r3[r6] = r7     // Catch:{ all -> 0x00b9 }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r3[r1] = r6     // Catch:{ all -> 0x00b9 }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r3[r5] = r6     // Catch:{ all -> 0x00b9 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00b9 }
            r3[r4] = r5     // Catch:{ all -> 0x00b9 }
            r4 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00b9 }
            r3[r4] = r5     // Catch:{ all -> 0x00b9 }
            r4 = 5
            java.lang.Class<android.content.res.Configuration> r5 = android.content.res.Configuration.class
            r3[r4] = r5     // Catch:{ all -> 0x00b9 }
            r4 = 6
            java.lang.Class<android.content.res.Configuration> r5 = android.content.res.Configuration.class
            r3[r4] = r5     // Catch:{ all -> 0x00b9 }
            r4 = 7
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00b9 }
            r3[r4] = r5     // Catch:{ all -> 0x00b9 }
            r4 = 8
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00b9 }
            r3[r4] = r5     // Catch:{ all -> 0x00b9 }
            java.lang.String r4 = "requestRelaunchActivity"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r3)     // Catch:{ all -> 0x00b9 }
            r2.setAccessible(r1)     // Catch:{ all -> 0x00b9 }
            r0 = r2
            goto L_0x00bb
        L_0x00b9:
            r1 = move-exception
        L_0x00ba:
        L_0x00bb:
            f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv.<clinit>():void");
    }

    private static boolean a() {
        return Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27;
    }

    public static boolean a(Activity activity) {
        Object obj;
        Application application;
        fu fuVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (a() && f == null) {
            return false;
        } else {
            if (e == null && d == null) {
                return false;
            }
            try {
                Object obj2 = c.get(activity);
                if (obj2 == null || (obj = b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                fuVar = new fu(activity);
                application.registerActivityLifecycleCallbacks(fuVar);
                g.post(new fr(fuVar, obj2));
                if (a()) {
                    f.invoke(obj, new Object[]{obj2, null, null, 0, false, null, null, false, false});
                } else {
                    activity.recreate();
                }
                g.post(new fs(application, fuVar));
                return true;
            } catch (Throwable th) {
                return false;
            }
        }
    }

    protected static boolean a(Object obj, Activity activity) {
        try {
            Object obj2 = c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            g.postAtFrontOfQueue(new ft(b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }
}
