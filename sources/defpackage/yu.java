package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: yu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yu {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static yu b;
    private ads c;

    public static synchronized PorterDuffColorFilter a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2;
        synchronized (yu.class) {
            a2 = ads.a(i, mode);
        }
        return a2;
    }

    public static synchronized yu b() {
        yu yuVar;
        synchronized (yu.class) {
            if (b == null) {
                a();
            }
            yuVar = b;
        }
        return yuVar;
    }

    /* access modifiers changed from: package-private */
    public final synchronized Drawable c(Context context, int i) {
        return this.c.a(context, i, true);
    }

    public static synchronized void a() {
        synchronized (yu.class) {
            if (b == null) {
                yu yuVar = new yu();
                b = yuVar;
                yuVar.c = ads.a();
                b.c.a(new yt());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized ColorStateList b(Context context, int i) {
        return this.c.b(context, i);
    }

    static void a(Drawable drawable, aet aet, int[] iArr) {
        ads.a(drawable, aet, iArr);
    }

    public final synchronized Drawable a(Context context, int i) {
        return this.c.a(context, i);
    }

    public final synchronized void a(Context context) {
        this.c.a(context);
    }
}
