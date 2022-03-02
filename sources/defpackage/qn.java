package defpackage;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: qn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qn {
    public final Object a;

    public qn() {
        int i = Build.VERSION.SDK_INT;
        this.a = null;
    }

    public static qn a(WindowInsets windowInsets) {
        windowInsets.getClass();
        return new qn(windowInsets);
    }

    public final int b() {
        int i = Build.VERSION.SDK_INT;
        return ((WindowInsets) this.a).getSystemWindowInsetTop();
    }

    public final int c() {
        int i = Build.VERSION.SDK_INT;
        return ((WindowInsets) this.a).getSystemWindowInsetRight();
    }

    public final int d() {
        int i = Build.VERSION.SDK_INT;
        return ((WindowInsets) this.a).getSystemWindowInsetBottom();
    }

    public final boolean e() {
        int i = Build.VERSION.SDK_INT;
        return ((WindowInsets) this.a).isConsumed();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qn) {
            return op.a(this.a, ((qn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public qn(Object obj) {
        this.a = obj;
    }

    public final int a() {
        int i = Build.VERSION.SDK_INT;
        return ((WindowInsets) this.a).getSystemWindowInsetLeft();
    }
}
