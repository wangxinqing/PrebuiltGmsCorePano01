package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;

/* renamed from: akva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akva {
    public static final void a(Context context, Intent intent, PendingIntent pendingIntent) {
        int i = Build.VERSION.SDK_INT;
        intent.setPackage(pendingIntent.getCreatorPackage());
        int i2 = Build.VERSION.SDK_INT;
        jhr.a(context).c("android:fine_location", pendingIntent.getCreatorUid(), pendingIntent.getCreatorPackage());
        int i3 = Build.VERSION.SDK_INT;
        pendingIntent.send(context, 0, intent, (PendingIntent.OnFinished) null, (Handler) null, "android.permission.ACCESS_FINE_LOCATION");
    }
}
