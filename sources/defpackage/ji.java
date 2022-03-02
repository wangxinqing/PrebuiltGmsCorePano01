package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;

/* renamed from: ji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ji {
    public static Bundle a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        return notification.extras;
    }
}
