package defpackage;

import android.view.View;

/* renamed from: ajsp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajsp {
    public int a;
    public int b;
    private final View c;
    private int d;

    public ajsp(View view) {
        this.c = view;
    }

    public final void a() {
        this.a = this.c.getTop();
        this.d = this.c.getLeft();
    }

    public final void b() {
        View view = this.c;
        qb.g(view, this.b - (view.getTop() - this.a));
        View view2 = this.c;
        qb.h(view2, -(view2.getLeft() - this.d));
    }

    public final boolean a(int i) {
        if (this.b == i) {
            return false;
        }
        this.b = i;
        b();
        return true;
    }
}
