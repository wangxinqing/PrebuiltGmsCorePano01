package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.R;
import java.util.Locale;

/* renamed from: que  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class que {
    private static final anaf a;

    static {
        anab h = anaf.h();
        h.a(0, Integer.valueOf(a(0.0f)));
        h.a(1, Integer.valueOf(a(0.04f)));
        h.a(2, Integer.valueOf(a(0.06f)));
        h.a(3, Integer.valueOf(a(0.08f)));
        h.a(4, Integer.valueOf(a(0.1f)));
        h.a(5, Integer.valueOf(a(0.12f)));
        a = h.a();
    }

    private static final int a(float f) {
        return (int) ((f * 255.0f) + 0.5f);
    }

    public static int b(int i) {
        return Color.argb(((Integer) a.get(Integer.valueOf(i - 1))).intValue(), 255, 255, 255);
    }

    public static int a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        return (theme == null || !theme.resolveAttribute(i, typedValue, true)) ? i2 : typedValue.resourceId;
    }

    public static ColorStateList a(int i) {
        return new ColorStateList(new int[][]{new int[0]}, new int[]{i});
    }

    public static int b(Context context, int i, int i2) {
        return kf.b(context, a(context, i, i2));
    }

    public static Drawable a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw new Resources.NotFoundException(String.format(Locale.ROOT, "Attribute not defined by theme (attr = %d)", new Object[]{Integer.valueOf(i)}));
        } else if (typedValue.type >= 28 && typedValue.type <= 31) {
            return new ColorDrawable(typedValue.data);
        } else {
            if (typedValue.type == 3) {
                try {
                    return li.a(context.getResources(), typedValue.resourceId, context.getTheme());
                } catch (Resources.NotFoundException e) {
                    throw new UnsupportedOperationException(String.format(Locale.ROOT, "Type of attribute is not a reference to a drawable (attr = %d, value = %s)", new Object[]{Integer.valueOf(i), typedValue.coerceToString()}), e);
                }
            } else {
                throw new UnsupportedOperationException(String.format(Locale.ROOT, "Type of attribute is not a color or a reference to a drawable (attr = %d, value = %s)", new Object[]{Integer.valueOf(i), typedValue.coerceToString()}));
            }
        }
    }

    public static void a(View view, int i) {
        if (qud.h()) {
            Drawable background = view.getBackground();
            ColorDrawable colorDrawable = new ColorDrawable(b(i));
            view.setBackground(new LayerDrawable(background != null ? new Drawable[]{background, colorDrawable} : new Drawable[]{colorDrawable}));
        }
    }

    public static void a(SwipeRefreshLayout swipeRefreshLayout) {
        int b = b(swipeRefreshLayout.getContext(), 16842801, R.color.google_white);
        if (qud.h()) {
            swipeRefreshLayout.a(R.color.google_white);
            b = lk.a(Color.argb(((Integer) a.get(3)).intValue(), 255, 255, 255), b);
        } else {
            swipeRefreshLayout.b(swipeRefreshLayout.getResources().getIntArray(R.array.material_google_colors));
        }
        swipeRefreshLayout.e.setBackgroundColor(b);
    }
}
