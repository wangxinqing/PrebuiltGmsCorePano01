package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: rm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rm {
    public final EdgeEffect a;

    @Deprecated
    public rm(Context context) {
        this.a = new EdgeEffect(context);
    }

    public static void a(EdgeEffect edgeEffect, float f, float f2) {
        int i = Build.VERSION.SDK_INT;
        edgeEffect.onPull(f, f2);
    }
}
