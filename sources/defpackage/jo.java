package defpackage;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: jo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jo {
    private static final Object a = new Object();
    private static String b;
    private static Set c = new HashSet();
    private static final Object f = new Object();
    private static jn g;
    private final Context d;
    private final NotificationManager e;

    public jo(Context context) {
        this.d = context;
        this.e = (NotificationManager) context.getSystemService("notification");
    }

    public static Set a(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (a) {
            if (string != null) {
                if (!string.equals(b)) {
                    HashSet hashSet = new HashSet(r3);
                    for (String unflattenFromString : string.split(":", -1)) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    c = hashSet;
                    b = string;
                }
            }
            set = c;
        }
        return set;
    }

    public final void a(String str, int i) {
        this.e.cancel(str, i);
        int i2 = Build.VERSION.SDK_INT;
    }

    public final void a(String str, int i, Notification notification) {
        Bundle a2 = ji.a(notification);
        if (a2 == null || !a2.getBoolean("android.support.useSideChannel")) {
            this.e.notify(str, i, notification);
            return;
        }
        jk jkVar = new jk(this.d.getPackageName(), i, str, notification);
        synchronized (f) {
            if (g == null) {
                g = new jn(this.d.getApplicationContext());
            }
            g.a.obtainMessage(0, jkVar).sendToTarget();
        }
        this.e.cancel(str, i);
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.e.areNotificationsEnabled();
        }
        int i = Build.VERSION.SDK_INT;
        AppOpsManager appOpsManager = (AppOpsManager) this.d.getSystemService("appops");
        ApplicationInfo applicationInfo = this.d.getApplicationInfo();
        String packageName = this.d.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            if (((Integer) cls.getMethod("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException e2) {
            return true;
        }
    }
}
