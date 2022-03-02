package defpackage;

import android.content.Context;
import android.os.UserManager;

/* renamed from: aecp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aecp {
    static boolean a(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        return userManager != null && userManager.getUserCount() > 1;
    }
}
