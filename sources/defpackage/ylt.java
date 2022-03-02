package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.gms.R;

/* renamed from: ylt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ylt {
    private static ylt a;
    private final oi b = new oi(50);
    private final PackageManager c;
    private final Resources d;
    private Drawable e;

    private ylt(Context context) {
        this.c = context.getPackageManager();
        this.d = context.getResources();
    }

    private final Drawable a() {
        if (this.e == null) {
            this.e = this.d.getDrawable(R.drawable.plus_ic_apps_color_24);
        }
        return this.e;
    }

    public static ylt a(Context context) {
        if (a == null) {
            a = new ylt(context);
        }
        return a;
    }

    public final yls a(yxi yxi) {
        Drawable drawable;
        boolean z;
        String c2 = yxi.c();
        yls yls = (yls) this.b.a((Object) c2);
        if (yls != null) {
            return yls;
        }
        ApplicationInfo d2 = yxi.d();
        if (d2 != null) {
            drawable = this.c.getApplicationIcon(d2);
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = a();
        }
        String a2 = yxi.a();
        if (drawable == a()) {
            z = true;
        } else {
            z = false;
        }
        yls yls2 = new yls(a2, drawable, z);
        this.b.a((Object) c2, (Object) yls2);
        return yls2;
    }

    public final void a(yxi yxi, Drawable drawable) {
        yls a2 = a(yxi);
        if (drawable != null) {
            a2.b = drawable;
        }
        a2.c = false;
    }
}
