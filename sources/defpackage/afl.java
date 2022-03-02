package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: afl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afl extends Resources {
    public static boolean a = false;

    public static void a() {
        if (a) {
            int i = Build.VERSION.SDK_INT;
        }
    }

    public final Drawable getDrawable(int i) {
        throw null;
    }
}
