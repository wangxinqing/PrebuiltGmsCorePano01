package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;

/* renamed from: bmz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bmz {
    public static boolean a(Context context) {
        int i = Build.VERSION.SDK_INT;
        UserManager userManager = (UserManager) context.getSystemService("user");
        if (userManager != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                return userManager.isSystemUser();
            }
            if (userManager.getSerialNumberForUser(Process.myUserHandle()) != 0) {
                return false;
            }
        }
        return true;
    }

    public static long b(Context context) {
        int i = Build.VERSION.SDK_INT;
        UserManager userManager = (UserManager) context.getSystemService("user");
        if (userManager != null) {
            return userManager.getSerialNumberForUser(Process.myUserHandle());
        }
        return 0;
    }
}
