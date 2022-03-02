package defpackage;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.app.usage.UsageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: nqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nqw {
    public static boolean a = false;
    public static Method b;
    public static Object c;
    public static Method d;
    private static Object e;
    private static int f = 0;
    private static Class g;
    private static Method h;
    private static Constructor i;
    private static boolean j = false;
    private static PackageManager k;
    private static Method l;
    private static ActivityManager m;
    private static Method n;
    private static Method o;
    private static Method p;
    private static Class q;
    private static Field r;
    private static Method s;
    private static Method t;
    private static PowerManager u;
    private static Method v;

    public static int a(int i2) {
        if (a() && a) {
            try {
                return ((Integer) h.invoke(e, new Object[]{Integer.valueOf(i2)})).intValue();
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                if (valueOf.length() == 0) {
                    new String("Error getting user ID from serial: ");
                } else {
                    "Error getting user ID from serial: ".concat(valueOf);
                }
            }
        }
        return 0;
    }

    public static int b(int i2) {
        if (a() && a) {
            try {
                return ((Integer) o.invoke(e, new Object[]{Integer.valueOf(i2)})).intValue();
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                if (valueOf.length() == 0) {
                    new String("Error getting user serial from id: ");
                } else {
                    "Error getting user serial from id: ".concat(valueOf);
                }
            }
        }
        return i2;
    }

    public static Object c(int i2) {
        if (!a() || !a) {
            return null;
        }
        int a2 = a(i2);
        try {
            return i.newInstance(new Object[]{Integer.valueOf(a2)});
        } catch (Exception e2) {
            return null;
        }
    }

    public static int d() {
        a();
        return f;
    }

    public static boolean e() {
        a();
        if (jkr.c()) {
            try {
                if (v == null || !((Boolean) v.invoke(u, new Object[0])).booleanValue()) {
                    return false;
                }
                return true;
            } catch (Exception e2) {
            }
        }
        return false;
    }

    public static boolean d(int i2) {
        if (a() && a) {
            int a2 = a(i2);
            if (a2 < 0) {
                return false;
            }
            try {
                return ((Boolean) n.invoke(m, new Object[]{Integer.valueOf(a2)})).booleanValue();
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                if (valueOf.length() == 0) {
                    new String("Error getting user running: ");
                } else {
                    "Error getting user running: ".concat(valueOf);
                }
            }
        }
        return true;
    }

    public static boolean c() {
        return d() == 0;
    }

    public static boolean e(int i2) {
        a();
        Method method = s;
        if (method == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(ConnectivityManager.class, new Object[]{Integer.valueOf(i2)})).booleanValue();
        } catch (Exception e2) {
            s = null;
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() == 0) {
                new String("Broken ConnectivityManager.isNetworkTypeMobile: ");
            } else {
                "Broken ConnectivityManager.isNetworkTypeMobile: ".concat(valueOf);
            }
            return false;
        }
    }

    public static int a(Context context, ntx ntx) {
        a();
        iva.a(jkr.g());
        UsageStatsManager usageStatsManager = (UsageStatsManager) context.getSystemService(UsageStatsManager.class);
        if (axlc.v()) {
            try {
                return ((Integer) t.invoke(usageStatsManager, new Object[]{ntx.a})).intValue();
            } catch (IllegalAccessException | InvocationTargetException e2) {
                String valueOf = String.valueOf(ntx);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
                sb.append("Failed to get app standby bucket for: ");
                sb.append(valueOf);
                Log.e("GCM", sb.toString());
                return -1;
            }
        } else {
            try {
                return usageStatsManager.getAppStandbyBucket(ntx.a);
            } catch (IllegalArgumentException | SecurityException e3) {
                String valueOf2 = String.valueOf(ntx);
                String valueOf3 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 39 + String.valueOf(valueOf3).length());
                sb2.append("Failed to get app standby bucket for: ");
                sb2.append(valueOf2);
                sb2.append(" ");
                sb2.append(valueOf3);
                Log.e("GCM", sb2.toString());
                return -1;
            }
        }
    }

    public static List b() {
        if (a() && a) {
            try {
                return (List) p.invoke(e, new Object[0]);
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                if (valueOf.length() == 0) {
                    new String("Error getting user ID from serial: ");
                } else {
                    "Error getting user ID from serial: ".concat(valueOf);
                }
            }
        }
        return amzy.h();
    }

    public static int a(Object obj) {
        if (!a() || !a) {
            return 0;
        }
        try {
            return r.getInt(obj);
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() == 0) {
                new String("Error getting field serialNumber: ");
                return 0;
            }
            "Error getting field serialNumber: ".concat(valueOf);
            return 0;
        }
    }

    public static List a(Intent intent, int i2, int i3) {
        if (a() && a) {
            int a2 = a(i2);
            if (a2 < 0) {
                return amzy.h();
            }
            if (jkr.c()) {
                return k.queryBroadcastReceiversAsUser(intent, i3, UserHandle.of(a2));
            }
            try {
                return (List) l.invoke(k, new Object[]{intent, Integer.valueOf(i3), Integer.valueOf(a2)});
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.e("GCM", valueOf.length() == 0 ? new String("Error querying broadcast receivers: ") : "Error querying broadcast receivers: ".concat(valueOf), e2);
            }
        }
        return amzy.h();
    }

    public static synchronized void a(Context context) {
        synchronized (nqw.class) {
            if (!j) {
                e = context.getSystemService("user");
                m = (ActivityManager) context.getSystemService("activity");
                k = context.getPackageManager();
                c = context.getSystemService("usagestats");
                u = (PowerManager) context.getSystemService("power");
                if (e != null) {
                    Class<?> cls = e.getClass();
                    Class<UserHandle> cls2 = UserHandle.class;
                    try {
                        g = cls2;
                        i = cls2.getConstructor(new Class[]{Integer.TYPE});
                        Object invoke = cls.getMethod("supportsMultipleUsers", new Class[0]).invoke(e, new Object[0]);
                        if (invoke instanceof Boolean) {
                            if (((Boolean) invoke).booleanValue()) {
                                a = true;
                                int intValue = ((Integer) cls.getMethod("getUserHandle", new Class[0]).invoke(e, new Object[0])).intValue();
                                h = cls.getMethod("getUserHandle", new Class[]{Integer.TYPE});
                                Method method = cls.getMethod("getUserSerialNumber", new Class[]{Integer.TYPE});
                                o = method;
                                f = ((Integer) method.invoke(e, new Object[]{Integer.valueOf(intValue)})).intValue();
                                b = ActivityManager.class.getMethod("getCurrentUser", new Class[0]);
                                n = ActivityManager.class.getMethod("isUserRunning", new Class[]{Integer.TYPE});
                                l = PackageManager.class.getMethod("queryBroadcastReceivers", new Class[]{Intent.class, Integer.TYPE, Integer.TYPE});
                                p = cls.getMethod("getUsers", new Class[0]);
                                Class<?> cls3 = Class.forName("android.content.pm.UserInfo");
                                q = cls3;
                                r = cls3.getField("serialNumber");
                                int i2 = f;
                                StringBuilder sb = new StringBuilder(54);
                                sb.append("COMPAT: Multi user ser=");
                                sb.append(i2);
                                sb.append(" current=");
                                sb.append(intValue);
                                sb.toString();
                            }
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        a = true;
                        int intValue2 = ((Integer) cls.getMethod("getUserHandle", new Class[0]).invoke(e, new Object[0])).intValue();
                        h = cls.getMethod("getUserHandle", new Class[]{Integer.TYPE});
                        Method method2 = cls.getMethod("getUserSerialNumber", new Class[]{Integer.TYPE});
                        o = method2;
                        f = ((Integer) method2.invoke(e, new Object[]{Integer.valueOf(intValue2)})).intValue();
                        b = ActivityManager.class.getMethod("getCurrentUser", new Class[0]);
                        n = ActivityManager.class.getMethod("isUserRunning", new Class[]{Integer.TYPE});
                        l = PackageManager.class.getMethod("queryBroadcastReceivers", new Class[]{Intent.class, Integer.TYPE, Integer.TYPE});
                        p = cls.getMethod("getUsers", new Class[0]);
                        Class<?> cls32 = Class.forName("android.content.pm.UserInfo");
                        q = cls32;
                        r = cls32.getField("serialNumber");
                        int i22 = f;
                        StringBuilder sb2 = new StringBuilder(54);
                        sb2.append("COMPAT: Multi user ser=");
                        sb2.append(i22);
                        sb2.append(" current=");
                        sb2.append(intValue2);
                        sb2.toString();
                    } catch (Exception e2) {
                        String valueOf = String.valueOf(e2.getMessage());
                        if (valueOf.length() == 0) {
                            new String("COMPAT: Multiuser init error: ");
                        } else {
                            "COMPAT: Multiuser init error: ".concat(valueOf);
                        }
                    }
                }
                if (c != null) {
                    try {
                        d = c.getClass().getMethod("whitelistAppTemporarily", new Class[]{String.class, Long.TYPE, g});
                    } catch (NoSuchMethodException e3) {
                    }
                    if (jkr.g()) {
                        try {
                            t = c.getClass().getMethod("getAppStandbyBucket", new Class[]{String.class});
                        } catch (NoSuchMethodException e4) {
                            Log.w("GCM", "compat: getAppStandbyBucket not found");
                        }
                    }
                }
                try {
                    s = ConnectivityManager.class.getMethod("isNetworkTypeMobile", new Class[]{Integer.TYPE});
                } catch (Exception e5) {
                }
                if (jkr.c()) {
                    try {
                        v = PowerManager.class.getMethod("isLightDeviceIdleMode", new Class[0]);
                    } catch (Exception e6) {
                    }
                }
                j = true;
                if (f != 0) {
                    Intent intent = new Intent();
                    intent.setClassName(context, "com.google.android.gms.gcm.nts.SchedulerInternalReceiver");
                    intent.putExtra("user_serial", f);
                    intent.putExtra("OP_CODE", 4);
                    a(context, 0, intent, "com.google.android.gms.permission.INTERNAL_BROADCAST", (BroadcastReceiver) null, (Handler) null);
                }
            }
        }
        return;
    }

    public static void a(Context context, int i2, Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler) {
        if (!a() || !a) {
            context.sendOrderedBroadcast(intent, str, broadcastReceiver, handler, 0, (String) null, (Bundle) null);
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        context.sendOrderedBroadcastAsUser(intent, (UserHandle) c(i2), str, broadcastReceiver, (Handler) null, 0, (String) null, (Bundle) null);
    }

    public static void a(Context context, Intent intent) {
        if (!a() || !a) {
            context.sendBroadcast(intent);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        context.sendBroadcastAsUser(intent, (UserHandle) c(0));
    }

    public static void a(jbs jbs, String str, long j2, PendingIntent pendingIntent) {
        if (jkr.b()) {
            jbs.b(str, 2, j2, pendingIntent);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        jbs.b(str, 2, j2, pendingIntent, "com.google.android.gms");
    }

    public static boolean a() {
        if (!j) {
            Log.e("GCM", "Compat called without init");
        }
        return j;
    }
}
