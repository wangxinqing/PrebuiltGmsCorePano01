package defpackage;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;

/* renamed from: akyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akyp {
    private final String a;
    private Resources b;

    public akyp(ComponentName componentName, PackageManager packageManager) {
        String packageName = componentName.getPackageName();
        this.a = packageName;
        try {
            this.b = packageManager.getResourcesForApplication(packageName);
        } catch (PackageManager.NameNotFoundException e) {
            this.b = null;
            Log.e("ColorHelper", "getResourcesForApplication failed", e);
        }
    }

    public static Toolbar a(Activity activity) {
        try {
            Toolbar toolbar = (Toolbar) activity.findViewById(R.id.action_bar);
            if (toolbar != null) {
                return toolbar;
            }
            if (Log.isLoggable("ColorHelper", 6)) {
                Log.e("ColorHelper", "Failed to get action bar; couldn't get view.");
            }
            return null;
        } catch (ClassCastException e) {
            if (Log.isLoggable("ColorHelper", 6)) {
                Log.e("ColorHelper", "Failed to get action bar; View is wrong class.", e);
            }
            return null;
        }
    }

    public static void a(Drawable drawable, int i) {
        drawable.mutate().setColorFilter(Color.rgb(Color.red(i), Color.green(i), Color.blue(i)), PorterDuff.Mode.SRC_ATOP);
        drawable.setAlpha(Color.alpha(i));
    }

    public static void a(Activity activity, int i, int i2, int i3) {
        Toolbar a2 = a(activity);
        if (a2 != null) {
            int i4 = Build.VERSION.SDK_INT;
            a2.setBackgroundColor(i);
            a2.b(i3);
            Drawable g = a2.g();
            if (g != null) {
                a(g, i3);
                a2.b(g);
            }
            int i5 = Build.VERSION.SDK_INT;
            activity.getWindow().setStatusBarColor(i2);
        }
    }

    public final int a(String str) {
        int identifier = this.b.getIdentifier(str, "color", this.a);
        if (identifier != 0) {
            try {
                return this.b.getColor(identifier);
            } catch (Resources.NotFoundException e) {
                throw new akyo((Exception) e);
            }
        } else {
            throw new akyo(String.format("No color found for name: %s in package: %s", new Object[]{str, this.a}));
        }
    }
}
