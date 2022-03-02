package defpackage;

import android.app.PendingIntent;
import android.os.Build;

/* renamed from: ajqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajqw {
    public static String a(PendingIntent pendingIntent) {
        int i = Build.VERSION.SDK_INT;
        return pendingIntent.getCreatorPackage();
    }

    public static int b(PendingIntent pendingIntent) {
        int i = Build.VERSION.SDK_INT;
        return pendingIntent.getCreatorUid();
    }
}
