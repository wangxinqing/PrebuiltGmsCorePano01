package defpackage;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.chimera.Activity;
import java.lang.reflect.Method;

/* renamed from: fyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fyj {
    public static final Method a = a(Activity.class, "getActionBar");
    public static final Method b = a(ViewConfiguration.class, "hasPermanentMenuKey");
    public static final Method c = a(MenuItem.class, "setShowAsAction", Integer.TYPE);
    public static final Method d = a("android.app.ActionBar", "setDisplayShowHomeEnabled", Boolean.TYPE);
    public static final Method e = a("android.app.ActionBar", "setDisplayShowTitleEnabled", Boolean.TYPE);
    private static final Class f;
    private static final Class g;

    static {
        a("android.app.ActionBar", "setTitle", CharSequence.class);
        Class a2 = a("android.net.TrafficStats");
        f = a2;
        a(a2, "setThreadStatsTag", Integer.TYPE);
        a(f, "clearThreadStatsTag");
        a(View.class, "setSystemUiVisibility", Integer.TYPE);
        Class a3 = a("android.util.EventLog");
        g = a3;
        Class cls = Integer.TYPE;
        Class<String> cls2 = String.class;
        if (a3 != null) {
            try {
                a3.getMethod("writeEvent", new Class[]{cls, cls2});
            } catch (NoSuchMethodException e2) {
                Log.i("GLSUser", "Method not found writeEvent");
            }
        }
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            Log.i("GLSUser", str.length() == 0 ? new String("Class not found ") : "Class not found ".concat(str));
            return null;
        }
    }

    private static Method a(Class cls, String str) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod(str, new Class[0]);
        } catch (NoSuchMethodException e2) {
            Log.i("GLSUser", str.length() == 0 ? new String("Method not found ") : "Method not found ".concat(str));
            return null;
        }
    }

    private static Method a(Class cls, String str, Class cls2) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod(str, new Class[]{cls2});
        } catch (NoSuchMethodException e2) {
            Log.i("GLSUser", str.length() == 0 ? new String("Method not found ") : "Method not found ".concat(str));
            return null;
        }
    }

    private static Method a(String str, String str2, Class cls) {
        try {
            Class<?> cls2 = Class.forName(str);
            if (cls == null) {
                return cls2.getMethod(str2, new Class[0]);
            }
            return cls2.getMethod(str2, new Class[]{cls});
        } catch (ClassNotFoundException e2) {
            Log.i("GLSUser", str.length() == 0 ? new String("Class not found ") : "Class not found ".concat(str));
            return null;
        } catch (NoSuchMethodException e3) {
            Log.i("GLSUser", str2.length() == 0 ? new String("Method not found ") : "Method not found ".concat(str2));
            return null;
        }
    }

    public static boolean a() {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class});
            declaredMethod.setAccessible(true);
            return "wifi-only".equals(declaredMethod.invoke((Object) null, new Object[]{"ro.carrier"}));
        } catch (Exception e2) {
            return false;
        }
    }
}
