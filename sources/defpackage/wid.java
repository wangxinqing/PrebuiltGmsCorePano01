package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.TypedValue;
import com.google.android.gms.R;

/* renamed from: wid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wid {
    public static int a(Context context) {
        return b(context, R.attr.colorAccent);
    }

    public static int b(Context context) {
        return b(context, 16842808);
    }

    public static int c(Context context) {
        return b(context, 16843782);
    }

    public static boolean d(Context context) {
        return context.getResources().getBoolean(R.bool.isTablet);
    }

    public static Uri e(Context context) {
        Resources a = ((vt) context).a();
        return new Uri.Builder().scheme("android.resource").authority(a.getResourcePackageName(R.raw.sharing_silent_chime)).appendPath(a.getResourceTypeName(R.raw.sharing_silent_chime)).appendPath(a.getResourceEntryName(R.raw.sharing_silent_chime)).build();
    }

    public static int a(Context context, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    public static int b(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
