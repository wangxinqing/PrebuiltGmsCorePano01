package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/* renamed from: iag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iag {
    public static int a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        return (theme == null || !theme.resolveAttribute(i, typedValue, true)) ? i2 : typedValue.resourceId;
    }
}
