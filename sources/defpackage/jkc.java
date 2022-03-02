package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.os.UserManager;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: jkc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jkc extends jkb {
    public static final Field c;
    private static final Method f;
    public List d = null;
    private final UserManager e;

    static {
        Method method;
        Field field = null;
        try {
            method = UserManager.class.getMethod("getProfiles", new Class[]{Integer.TYPE});
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Unable to find getProfiles method: ");
            sb.append(valueOf);
            Log.wtf("MultiUserUtil", sb.toString());
            method = null;
        }
        f = method;
        try {
            field = Class.forName("android.content.pm.UserInfo").getField("id");
        } catch (Exception e3) {
            String valueOf2 = String.valueOf(e3);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 34);
            sb2.append("Unable to find UserInfo.id field: ");
            sb2.append(valueOf2);
            Log.wtf("MultiUserUtil", sb2.toString());
        }
        c = field;
    }

    public jkc(Context context) {
        this.e = (UserManager) context.getSystemService("user");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i) {
        for (UserHandle identifier : this.e.getUserProfiles()) {
            if (identifier.getIdentifier() == i) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        this.b = -1;
        this.d = null;
    }

    public final boolean d() {
        return this.e.isManagedProfile();
    }

    public final void b() {
        int i = Build.VERSION.SDK_INT;
        try {
            this.b = ActivityManager.getCurrentUser();
        } catch (Throwable th) {
            Log.wtf("MultiUserUtil", th);
            this.b = 0;
        }
        Method method = f;
        if (method != null) {
            try {
                this.d = (List) method.invoke(this.e, new Object[]{Integer.valueOf(this.b)});
            } catch (Throwable th2) {
                Log.wtf("MultiUserUtil", th2);
            }
        }
    }
}
