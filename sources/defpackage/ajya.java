package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.gms.R;

/* renamed from: ajya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajya {
    private static final int[] a = {R.attr.colorPrimary};
    private static final int[] b = {R.attr.colorPrimaryVariant};

    public static TypedArray a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        a(context, attributeSet, i, i2);
        c(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static aev b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        a(context, attributeSet, i, i2);
        c(context, attributeSet, iArr, i, i2, iArr2);
        return aev.a(context, attributeSet, iArr, i, i2);
    }

    private static void c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajxp.c, i, i2);
        boolean z = false;
        if (obtainStyledAttributes.getBoolean(2, false)) {
            int length = iArr2.length;
            if (length != 0) {
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        if (obtainStyledAttributes2.getResourceId(iArr2[i3], -1) == -1) {
                            obtainStyledAttributes2.recycle();
                            break;
                        }
                        i3++;
                    } else {
                        obtainStyledAttributes2.recycle();
                        z = true;
                        break;
                    }
                }
            } else if (obtainStyledAttributes.getResourceId(0, -1) != -1) {
                z = true;
            }
            obtainStyledAttributes.recycle();
            if (!z) {
                throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
            }
            return;
        }
        obtainStyledAttributes.recycle();
    }

    public static void a(Context context) {
        a(context, a, "Theme.AppCompat");
    }

    public static void b(Context context) {
        a(context, b, "Theme.MaterialComponents");
    }

    private static void a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajxp.c, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                b(context);
            }
        }
        a(context);
    }

    private static void a(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int i = 0;
        while (i < iArr.length) {
            if (obtainStyledAttributes.hasValue(i)) {
                i++;
            } else {
                obtainStyledAttributes.recycle();
                StringBuilder sb = new StringBuilder(str.length() + 77);
                sb.append("The style on this component requires your app theme to be ");
                sb.append(str);
                sb.append(" (or a descendant).");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        obtainStyledAttributes.recycle();
    }
}
