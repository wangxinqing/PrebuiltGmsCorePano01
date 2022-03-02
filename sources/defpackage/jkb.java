package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: jkb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jkb {
    public static final Method a;
    private static volatile Boolean c = null;
    protected int b = -1;

    public void b() {
        throw null;
    }

    public void c() {
        throw null;
    }

    public boolean d() {
        throw null;
    }

    static {
        Method method;
        int i = Build.VERSION.SDK_INT;
        try {
            method = UserHandle.class.getMethod("getUserId", new Class[]{Integer.TYPE});
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Unable to find getUserId method: ");
            sb.append(valueOf);
            Log.i("MultiUserUtil", sb.toString());
            method = null;
        }
        a = method;
    }

    public static jkb a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return new jkc(context);
    }

    public static boolean b(Context context) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        if (jkr.c() || context.getApplicationContext().getPackageName().equals("com.google.android.wearable.app.cn") || Boolean.TRUE.equals(c)) {
            return true;
        }
        try {
            UserManager userManager = (UserManager) context.getSystemService("user");
            if (c == null) {
                if (userManager.getUserCount() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                c = Boolean.valueOf(z);
                if (c.booleanValue()) {
                    return true;
                }
            }
            return userManager.isUserRunning(Process.myUserHandle());
        } catch (SecurityException e) {
            Log.w("MultiUserUtil", "Unable to determine if current user is active.", e);
            c = true;
            return true;
        }
    }

    public final boolean a() {
        int i = Build.VERSION.SDK_INT;
        try {
            return a(ActivityManager.getCurrentUser());
        } catch (Throwable th) {
            Log.wtf("MultiUserUtil", th);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(int i) {
        try {
            return UserHandle.myUserId() == i;
        } catch (Throwable th) {
            Log.wtf("MultiUserUtil", th);
            return true;
        }
    }
}
