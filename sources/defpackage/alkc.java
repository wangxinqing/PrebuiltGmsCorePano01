package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: alkc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alkc {
    public static boolean a(Context context) {
        return Build.VERSION.SDK_INT < 24 || ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
