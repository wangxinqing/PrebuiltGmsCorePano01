package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import android.os.StrictMode;
import android.os.UserManager;
import android.util.Log;
import java.util.Set;

/* renamed from: ikz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ikz {
    public static int a = 0;
    public static iky d = null;
    private static final Object e = new Object();
    private static Context f;
    private static Set g;
    public final String b;
    protected final Object c;

    protected ikz(String str, Object obj) {
        this.b = str;
        this.c = obj;
    }

    public static SharedPreferences a(Context context) {
        return b(context.getApplicationContext().createDeviceProtectedStorageContext());
    }

    static SharedPreferences b(Context context) {
        return context.getSharedPreferences("gservices-direboot-cache", 0);
    }

    private static boolean c(Context context) {
        if (jkr.c()) {
            UserManager userManager = (UserManager) context.getSystemService(UserManager.class);
            if (!userManager.isUserUnlocked()) {
                return userManager.isUserRunning(Process.myUserHandle());
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract Object a();

    /* access modifiers changed from: protected */
    public Object a(Context context, String str, Object obj) {
        throw null;
    }

    public static boolean b() {
        boolean z;
        synchronized (e) {
            z = d != null;
        }
        return z;
    }

    public static ikz a(String str, Float f2) {
        return new ikw(str, f2);
    }

    public static ikz a(String str, Integer num) {
        return new ikv(str, num);
    }

    public static ikz a(String str, Long l) {
        return new iku(str, l);
    }

    public final Object c() {
        boolean z;
        Set set;
        Context context;
        long clearCallingIdentity;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        synchronized (e) {
            z = false;
            if (f != null && c(f)) {
                z = true;
            }
            set = g;
            context = f;
        }
        if (!z) {
            synchronized (e) {
                g = null;
                f = null;
            }
            try {
                Object a2 = a();
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return a2;
            } catch (SecurityException e2) {
                clearCallingIdentity = Binder.clearCallingIdentity();
                Object a3 = a();
                Binder.restoreCallingIdentity(clearCallingIdentity);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return a3;
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
        } else if (set == null || set.contains(this.b)) {
            return a(context, this.b, this.c);
        } else {
            String valueOf = String.valueOf(this.b);
            Log.e("GservicesValue", valueOf.length() == 0 ? new String("Gservices key not whitelisted for directboot access: ") : "Gservices key not whitelisted for directboot access: ".concat(valueOf));
            return this.c;
        }
    }

    public static ikz a(String str, String str2) {
        return new ikx(str, str2);
    }

    public static ikz a(String str, boolean z) {
        return new ikt(str, Boolean.valueOf(z));
    }

    public static void a(Context context, Set set) {
        synchronized (e) {
            if (d == null) {
                iky iky = new iky(context.getContentResolver());
                synchronized (e) {
                    d = iky;
                    g = null;
                    f = null;
                    if (context != null && c(context)) {
                        g = set;
                        f = context.getApplicationContext().createDeviceProtectedStorageContext();
                    }
                }
            }
            if (a == 0) {
                try {
                    a = context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).uid;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e("GservicesValue", e2.toString());
                }
            }
        }
    }
}
