package defpackage;

import android.app.PendingIntent;
import android.os.Build;

/* renamed from: ajqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajqj {
    public static String a(PendingIntent pendingIntent) {
        int i = Build.VERSION.SDK_INT;
        return pendingIntent.getCreatorPackage();
    }
}
