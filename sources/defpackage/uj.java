package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: uj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uj {
    private static final ThreadLocal a = new ThreadLocal();
    private static final WeakHashMap b = new WeakHashMap(0);
    private static final Object c = new Object();

    public static ColorStateList a(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ui uiVar;
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        synchronized (c) {
            SparseArray sparseArray = (SparseArray) b.get(context);
            colorStateList = null;
            if (!(sparseArray == null || sparseArray.size() <= 0 || (uiVar = (ui) sparseArray.get(i)) == null)) {
                if (uiVar.b.equals(context.getResources().getConfiguration())) {
                    colorStateList2 = uiVar.a;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        Resources resources = context.getResources();
        TypedValue typedValue = (TypedValue) a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            a.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        if (typedValue.type < 28 || typedValue.type > 31) {
            Resources resources2 = context.getResources();
            try {
                colorStateList = ku.a(resources2, resources2.getXml(i), context.getTheme());
            } catch (Exception e) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList != null) {
            synchronized (c) {
                SparseArray sparseArray2 = (SparseArray) b.get(context);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    b.put(context, sparseArray2);
                }
                sparseArray2.append(i, new ui(colorStateList, context.getResources().getConfiguration()));
            }
            return colorStateList;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        } else {
            return context.getResources().getColorStateList(i);
        }
    }

    public static Drawable b(Context context, int i) {
        return ads.a().a(context, i);
    }
}
