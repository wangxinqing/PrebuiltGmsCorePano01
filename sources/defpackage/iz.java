package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

/* renamed from: iz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iz {
    public static Intent a(Context context, ComponentName componentName) {
        String b = b(context, componentName);
        if (b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b);
        return b(context, componentName2) != null ? new Intent().setComponent(componentName2) : Intent.makeMainActivity(componentName2);
    }

    public static Intent b(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String c = c(activity);
        if (c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, c);
        try {
            return b((Context) activity, componentName) != null ? new Intent().setComponent(componentName) : Intent.makeMainActivity(componentName);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + c + "' in manifest");
            return null;
        }
    }

    public static String c(Activity activity) {
        try {
            return b((Context) activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void a(Activity activity) {
        Intent b = b(activity);
        if (b != null) {
            b(activity, b);
            return;
        }
        throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
    }

    public static boolean a(Activity activity, Intent intent) {
        int i = Build.VERSION.SDK_INT;
        return activity.shouldUpRecreateTask(intent);
    }

    public static String b(Context context, ComponentName componentName) {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT < 29) {
            i = Build.VERSION.SDK_INT >= 24 ? 787072 : 640;
        } else {
            i = 269222528;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        int i3 = Build.VERSION.SDK_INT;
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static void b(Activity activity, Intent intent) {
        int i = Build.VERSION.SDK_INT;
        activity.navigateUpTo(intent);
    }
}
