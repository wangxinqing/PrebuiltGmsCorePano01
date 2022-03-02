package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: ajyl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajyl {
    public static int a(Context context, int i, String str) {
        TypedValue a = a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    public static int a(View view, int i) {
        return a(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static TypedValue a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        return typedValue;
    }

    public static boolean a(Context context, int i, boolean z) {
        TypedValue a = a(context, i);
        if (a == null || a.type != 18) {
            return z;
        }
        return a.data != 0;
    }
}
