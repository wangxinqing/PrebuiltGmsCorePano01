package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;

/* renamed from: lp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lp {
    public static final ly a;
    public static final oi b = new oi(16);

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new lu();
        } else if (Build.VERSION.SDK_INT >= 28) {
            a = new lt();
        } else if (Build.VERSION.SDK_INT >= 26) {
            a = new ls();
        } else {
            if (Build.VERSION.SDK_INT >= 24) {
                if (lr.a == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (lr.a != null) {
                    a = new lr();
                }
            }
            int i = Build.VERSION.SDK_INT;
            a = new lq();
        }
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a2 = a.a(context, resources, i, str, i2);
        if (a2 != null) {
            b.a((Object) a(resources, i, i2), (Object) a2);
        }
        return a2;
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context != null) {
            int i2 = Build.VERSION.SDK_INT;
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface a(Context context, kw kwVar, Resources resources, int i, int i2, lg lgVar, boolean z) {
        Typeface typeface;
        boolean z2;
        if (kwVar instanceof kz) {
            kz kzVar = (kz) kwVar;
            if (!z || kzVar.c != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            typeface = ne.a(context, kzVar.a, lgVar, z2, z ? kzVar.b : -1, i2);
        } else {
            typeface = a.a(context, (kx) kwVar, resources, i2);
            if (typeface != null) {
                lgVar.b(typeface);
            } else {
                lgVar.b(-3);
            }
        }
        if (typeface != null) {
            b.a((Object) a(resources, i, i2), (Object) typeface);
        }
        return typeface;
    }

    public static String a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
