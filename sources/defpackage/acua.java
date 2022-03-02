package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: acua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acua {
    public static boolean a(Context context) {
        int i = Build.VERSION.SDK_INT;
        UserManager userManager = (UserManager) context.getSystemService("user");
        return userManager != null && userManager.getUserCount() > 1;
    }
}
