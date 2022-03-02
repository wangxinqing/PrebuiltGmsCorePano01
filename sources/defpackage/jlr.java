package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: jlr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jlr {
    public static final Method a;
    private static final int b = Process.myUid();
    private static final Method c;
    private static final Method d;
    private static final Method e;
    private static final Method f;
    private static final Method g;
    private static final Method h;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7 = null;
        try {
            method = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception e2) {
            method = null;
        }
        c = method;
        int i = Build.VERSION.SDK_INT;
        try {
            method2 = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, String.class});
        } catch (Exception e3) {
            method2 = null;
        }
        d = method2;
        try {
            method3 = WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception e4) {
            method3 = null;
        }
        e = method3;
        try {
            method4 = WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception e5) {
            method4 = null;
        }
        a = method4;
        int i2 = Build.VERSION.SDK_INT;
        try {
            method5 = WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
        } catch (Exception e6) {
            method5 = null;
        }
        f = method5;
        if (jkr.g()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e7) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e7);
                method6 = null;
            }
        } else {
            method6 = null;
        }
        g = method6;
        if (jkr.g()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, String.class});
            } catch (Exception e8) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e8);
            }
        }
        h = method7;
    }

    public static int a(WorkSource workSource) {
        Method method = e;
        if (method != null) {
            try {
                return ((Integer) method.invoke(workSource, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
        return 0;
    }

    public static List b(WorkSource workSource) {
        int i;
        if (workSource != null) {
            i = a(workSource);
        } else {
            i = 0;
        }
        if (i == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            String a2 = a(workSource, i2);
            if (!jlh.d(a2)) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public static WorkSource a(int i, String str) {
        WorkSource workSource = new WorkSource();
        a(workSource, i, str);
        return workSource;
    }

    public static WorkSource a(Context context, String str) {
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        if ("com.google.android.gms".equals(str)) {
            return a(Process.myUid(), str);
        }
        try {
            ApplicationInfo a2 = jni.b(context).a(str, 0);
            if (a2 != null) {
                return a(a2.uid, str);
            }
            Log.e("WorkSourceUtil", str.length() == 0 ? new String("Could not get applicationInfo from package: ") : "Could not get applicationInfo from package: ".concat(str));
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("WorkSourceUtil", str.length() == 0 ? new String("Could not find package: ") : "Could not find package: ".concat(str));
            return null;
        }
    }

    public static WorkSource a(Context context, String str, String str2) {
        if (context == null || context.getPackageManager() == null || str2 == null || str == null) {
            Log.w("WorkSourceUtil", "Unexpected null arguments");
            return null;
        }
        int i = -1;
        if ("com.google.android.gms".equals(str)) {
            i = b;
        } else {
            try {
                ApplicationInfo a2 = jni.b(context).a(str, 0);
                if (a2 == null) {
                    Log.e("WorkSourceUtil", str.length() == 0 ? new String("Could not get applicationInfo from package: ") : "Could not get applicationInfo from package: ".concat(str));
                } else {
                    i = a2.uid;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("WorkSourceUtil", str.length() == 0 ? new String("Could not find package: ") : "Could not find package: ".concat(str));
            }
        }
        if (i < 0) {
            return null;
        }
        WorkSource workSource = new WorkSource();
        Method method = g;
        if (method == null || h == null) {
            a(workSource, i, str);
        } else {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                if (i != b) {
                    h.invoke(invoke, new Object[]{Integer.valueOf(i), str});
                }
                h.invoke(invoke, new Object[]{Integer.valueOf(b), str2});
            } catch (Exception e3) {
                Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", e3);
            }
        }
        return workSource;
    }

    public static String a(WorkSource workSource, int i) {
        Method method = f;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, new Object[]{Integer.valueOf(i)});
        } catch (Exception e2) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            return null;
        }
    }

    public static void a(WorkSource workSource, int i, String str) {
        if (d == null) {
            Method method = c;
            if (method != null) {
                try {
                    method.invoke(workSource, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                }
            }
        } else {
            if (str == null) {
                str = "";
            }
            try {
                d.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e3) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
            }
        }
    }

    public static boolean a(Context context) {
        if (context == null || context.getPackageManager() == null || jni.b(context).a("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }
}
