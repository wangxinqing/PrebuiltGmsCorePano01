package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* renamed from: vcr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vcr {
    public static String a(PendingIntent pendingIntent) {
        int i = Build.VERSION.SDK_INT;
        return pendingIntent.getCreatorPackage();
    }

    public static void a(Intent intent, String str, ReflectedParcelable reflectedParcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(str, reflectedParcelable);
        intent.putExtra(str, bundle);
    }
}
