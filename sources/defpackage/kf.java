package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import java.io.File;

/* renamed from: kf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kf {
    public static int a(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static int b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }

    public static File c(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getNoBackupFilesDir();
    }

    public static File[] d(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getExternalFilesDirs((String) null);
    }

    public static Drawable a(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return context.getDrawable(i);
    }

    public static File a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.getDataDir();
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    public static File[] b(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getExternalCacheDirs();
    }

    public static void a(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        activity.finishAffinity();
    }

    public static void a(Activity activity, Intent intent, int i) {
        int i2 = Build.VERSION.SDK_INT;
        activity.startActivityForResult(intent, i, (Bundle) null);
    }

    public static void a(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        int i5 = Build.VERSION.SDK_INT;
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
