package defpackage;

import android.os.Build;
import android.os.Process;

/* renamed from: ykh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ykh {
    public static int a = -1;

    static String a(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("com.google.android.platform.") : "com.google.android.platform.".concat(valueOf);
    }

    public static boolean a() {
        int i = Build.VERSION.SDK_INT;
        if (!Process.myUserHandle().isOwner()) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        return true;
    }
}
