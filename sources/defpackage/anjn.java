package defpackage;

import android.os.Build;
import android.util.Log;
import dalvik.system.VMStack;

/* renamed from: anjn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anjn extends aniy {
    /* access modifiers changed from: private */
    public static final boolean a = anjm.a();
    /* access modifiers changed from: private */
    public static final boolean b;
    private static final anix c = new anjl();

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        b = z;
        Log.class.getName();
    }

    static boolean j() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new Class[0]);
            return anjm.class.getName().equals(k());
        } catch (Throwable th) {
            return false;
        }
    }

    static String k() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable th) {
            return null;
        }
    }

    static Class l() {
        return VMStack.getStackClass2();
    }

    /* access modifiers changed from: protected */
    public anis b(String str) {
        if (anjr.a.get() != null) {
            return ((anji) anjr.a.get()).a(str);
        }
        anjr anjr = new anjr(str.replace('$', '.'));
        anjp.a.offer(anjr);
        if (anjr.a.get() == null) {
            return anjr;
        }
        anjr.b();
        return anjr;
    }

    /* access modifiers changed from: protected */
    public anix b() {
        return c;
    }

    /* access modifiers changed from: protected */
    public String h() {
        return "platform: Android";
    }
}
