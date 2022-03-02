package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.R;

/* renamed from: jsa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jsa {
    public static int a(Context context) {
        return a(context, 16842801);
    }

    public static int b(Context context) {
        return a(context, 16843829);
    }

    public static int c(Context context) {
        return a(context, R.attr.snackBarBackgroundColor);
    }

    public static int d(Context context) {
        return a(context, R.attr.snackBarButtonColor);
    }

    public static int e(Context context) {
        return a(context, R.attr.snackBarTextColor);
    }

    public static int f(Context context) {
        return a(context, R.attr.colorAccent);
    }

    public static int g(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843534, typedValue, true);
        return typedValue.resourceId;
    }

    public static int a(Context context, int i) {
        int color;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            if (!azia.a.a().a()) {
                color = obtainStyledAttributes.getColor(0, 0);
            } else {
                color = obtainStyledAttributes.getColor(0, 0);
            }
            return color;
        } catch (UnsupportedOperationException e) {
            Log.e("ThemeUtil", "Default color value is returned for unresolved TypedArray content", e);
            return 0;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
