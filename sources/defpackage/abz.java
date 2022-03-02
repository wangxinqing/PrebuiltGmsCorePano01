package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: abz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class abz {
    protected final act a;
    public int b = Integer.MIN_VALUE;
    final Rect c = new Rect();

    public abz(act act) {
        this.a = act;
    }

    public static abz a(act act) {
        return new abx(act);
    }

    public static abz b(act act) {
        return new aby(act);
    }

    public abstract int a();

    public abstract int a(View view);

    public abstract void a(int i);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int e(View view);

    public abstract int f();

    public abstract int f(View view);

    public abstract int g();

    public final int h() {
        if (this.b != Integer.MIN_VALUE) {
            return d() - this.b;
        }
        return 0;
    }

    public static abz a(act act, int i) {
        if (i != 0) {
            return b(act);
        }
        return a(act);
    }
}
