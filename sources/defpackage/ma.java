package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: ma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ma {
    private static Method a;
    private static boolean b;
    private static Method c;
    private static boolean d;

    public static void a(Drawable drawable, float f, float f2) {
        int i = Build.VERSION.SDK_INT;
        drawable.setHotspot(f, f2);
    }

    public static int b(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return drawable.getAlpha();
    }

    public static boolean c(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return drawable.canApplyTheme();
    }

    public static ColorFilter d(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return drawable.getColorFilter();
    }

    public static void e(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        int i = Build.VERSION.SDK_INT;
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            e(((InsetDrawable) drawable).getDrawable());
        } else if (drawable instanceof mc) {
            e(((mc) drawable).a());
        } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                Drawable child = drawableContainerState.getChild(i2);
                if (child != null) {
                    e(child);
                }
            }
        }
    }

    public static Drawable f(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23) {
            int i = Build.VERSION.SDK_INT;
            if (!(drawable instanceof mb)) {
                return new me(drawable);
            }
        }
        return drawable;
    }

    public static Drawable g(Drawable drawable) {
        return drawable instanceof mc ? ((mc) drawable).a() : drawable;
    }

    public static int h(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        int i = Build.VERSION.SDK_INT;
        if (!d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            d = true;
        }
        Method method = c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                c = null;
            }
        }
        return 0;
    }

    public static void a(Drawable drawable, int i) {
        int i2 = Build.VERSION.SDK_INT;
        drawable.setTint(i);
    }

    public static boolean b(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (!b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                return true;
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                a = null;
            }
        }
        return false;
    }

    public static void a(Drawable drawable, int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    public static void a(Drawable drawable, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        drawable.setTintList(colorStateList);
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        int i = Build.VERSION.SDK_INT;
        drawable.applyTheme(theme);
    }

    public static void a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i = Build.VERSION.SDK_INT;
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static void a(Drawable drawable, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        drawable.setTintMode(mode);
    }

    public static void a(Drawable drawable, boolean z) {
        int i = Build.VERSION.SDK_INT;
        drawable.setAutoMirrored(z);
    }

    public static boolean a(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return drawable.isAutoMirrored();
    }
}
