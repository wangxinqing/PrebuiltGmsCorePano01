package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: rl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rl {
    private static Field a;
    private static boolean b;

    public static ColorStateList a(CompoundButton compoundButton) {
        int i = Build.VERSION.SDK_INT;
        return compoundButton.getButtonTintList();
    }

    public static void b(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT < 23) {
            if (!b) {
                try {
                    Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
                }
                b = true;
            }
            Field field = a;
            if (field != null) {
                try {
                    Drawable drawable = (Drawable) field.get(compoundButton);
                } catch (IllegalAccessException e2) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                    a = null;
                }
            }
        } else {
            compoundButton.getButtonDrawable();
        }
    }

    public static void a(CompoundButton compoundButton, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        compoundButton.setButtonTintList(colorStateList);
    }
}
