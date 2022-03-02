package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: ast  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ast {
    public static Interpolator a(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return AnimationUtils.loadInterpolator(context, i);
    }
}
