package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: jnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jnl {
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices/main");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/main_diff");
    public static Boolean c;
    public static Boolean d;
    public static final Executor e = new jnk();
    private static Boolean f;
    private static final jnl g = a();

    static {
        Uri.parse("content://com.google.android.gsf.gservices/override");
    }

    public static jnl a() {
        jnl jnl = g;
        if (jnl != null) {
            return jnl;
        }
        if (jkr.e()) {
            return new jnu();
        }
        if (jkr.c()) {
            return new jnt();
        }
        if (jkr.b()) {
            return new jns();
        }
        int i = Build.VERSION.SDK_INT;
        return new jnr();
    }

    public static void b() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e2) {
        }
    }

    public void a(Intent intent) {
    }

    public boolean a(Object obj) {
        return false;
    }

    public boolean b(Object obj) {
        return false;
    }

    public int c() {
        return 0;
    }

    public int c(Context context) {
        return 0;
    }

    public String d(Context context) {
        return null;
    }

    public boolean d() {
        return false;
    }

    public int e() {
        return 0;
    }

    public String e(Context context) {
        return null;
    }

    public Object f(Context context) {
        return null;
    }

    public static void b(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        PackageManager packageManager = context.getPackageManager();
        synchronized (jnl.class) {
            boolean z = true;
            boolean a2 = aeeg.a(contentResolver, "checkin_disable_gsf", true);
            if (!aeeg.a(context.getContentResolver(), "checkin_enable_gms", true) || !aeeg.a(context.getContentResolver(), "update_enable_gms", true)) {
                z = false;
            } else {
                int i = Build.VERSION.SDK_INT;
            }
            if (d != null) {
                if (d.equals(Boolean.valueOf(a2)) && c != null && c.equals(Boolean.valueOf(z))) {
                    return;
                }
            }
            d = Boolean.valueOf(a2);
            c = Boolean.valueOf(z);
            try {
                packageManager.getPackageInfo("com.google.android.gsf", 4);
                new jnj(packageManager).start();
            } catch (PackageManager.NameNotFoundException e2) {
                Log.i("CheckinCompat", "GoogleServicesFramework does not exist, no need to disable");
            }
        }
    }

    public static void a(PackageManager packageManager, String str, String str2, boolean z) {
        try {
            packageManager.setComponentEnabledSetting(new ComponentName(str, str2.length() == 0 ? new String(str) : str.concat(str2)), !z ? 1 : 2, 1);
        } catch (IllegalArgumentException e2) {
            if (Log.isLoggable("CheckinCompat", 4)) {
                String str3 = !z ? "enable" : "disable";
                StringBuilder sb = new StringBuilder(str2.length() + 15 + str3.length());
                sb.append("No service ");
                sb.append(str2);
                sb.append(" to ");
                sb.append(str3);
                Log.i("CheckinCompat", sb.toString());
            }
        }
    }

    public static boolean a(Context context) {
        boolean z;
        Class<jnl> cls = jnl.class;
        if (!awrq.a.a().k()) {
            return false;
        }
        synchronized (cls) {
            if (f != null) {
                if (!f.equals(d)) {
                }
            }
            if (d == null || d.booleanValue()) {
                Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    ActivityManager.RunningServiceInfo next = it.next();
                    if (next != null && next.service != null && "com.google.android.gsf".equals(next.service.getPackageName()) && ".checkin.CheckinService".equals(next.service.getShortClassName())) {
                        Log.i("CheckinCompat", "GSF Checkin still active");
                        z = false;
                        break;
                    }
                }
                synchronized (cls) {
                    f = Boolean.valueOf(z);
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    public int a(TelephonyManager telephonyManager) {
        try {
            return ((Integer) telephonyManager.getClass().getMethod("getCurrentPhoneType", new Class[0]).invoke(telephonyManager, new Object[0])).intValue();
        } catch (Exception e2) {
            return telephonyManager.getPhoneType();
        }
    }

    public void a(AsyncTask asyncTask, Executor executor, Object... objArr) {
        asyncTask.execute(objArr);
    }
}
