package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.Window;
import com.google.android.setupcompat.internal.TemplateLayout;

/* renamed from: alhk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alhk implements alhi {
    public final TemplateLayout a;
    public final Window b;
    public final boolean c;
    public int d = 0;

    public alhk(TemplateLayout templateLayout, Window window) {
        boolean z = false;
        this.a = templateLayout;
        this.b = window;
        if ((templateLayout instanceof algc) && ((algc) templateLayout).c()) {
            z = true;
        }
        this.c = z;
    }

    public static final void a(Window window) {
        int i = Build.VERSION.SDK_INT;
        alhs.a(window, 5634);
        alhs.c(window, 5634);
        window.setNavigationBarColor(0);
        window.setStatusBarColor(0);
    }

    public final void a(Window window, Context context) {
        int i = Build.VERSION.SDK_INT;
        alhs.b(window, 5634);
        alhs.d(window, 5634);
        int i2 = 0;
        if (this.c) {
            int a2 = alhb.a(context).a(context, alha.CONFIG_NAVIGATION_BAR_BG_COLOR);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(a2);
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16843857, 16843858});
        int color = obtainStyledAttributes.getColor(0, 0);
        int color2 = obtainStyledAttributes.getColor(1, 0);
        if (this.a instanceof algc) {
            if (Build.VERSION.SDK_INT < 23) {
                i2 = color;
            }
            if (Build.VERSION.SDK_INT >= 27) {
                color2 = this.d;
                color = i2;
            } else {
                color = i2;
            }
        }
        window.setStatusBarColor(color);
        window.setNavigationBarColor(color2);
        obtainStyledAttributes.recycle();
    }
}
