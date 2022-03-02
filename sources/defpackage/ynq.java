package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.gms.R;

/* renamed from: ynq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ynq {
    private static ynq a;
    private final oi b = new oi(50);
    private final Resources c;
    private Drawable d;

    private ynq(Resources resources) {
        this.c = resources;
    }

    public static ynq a(Context context) {
        if (a == null) {
            a = new ynq(context.getResources());
        }
        return a;
    }

    public final Drawable a(String str) {
        if (str != null) {
            return (Drawable) this.b.a((Object) str);
        }
        if (this.d == null) {
            this.d = this.c.getDrawable(R.drawable.plus_ic_apps_lightgrey_24);
        }
        return this.d;
    }

    public final void a(String str, Drawable drawable) {
        this.b.a((Object) str, (Object) drawable);
    }
}
