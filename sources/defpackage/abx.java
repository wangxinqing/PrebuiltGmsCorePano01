package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: abx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abx extends abz {
    public final int a() {
        act act = this.a;
        return act.C - act.u();
    }

    public final void a(int i) {
        RecyclerView recyclerView = this.a.r;
        if (recyclerView != null) {
            recyclerView.offsetChildrenHorizontal(i);
        }
    }

    public final int b() {
        return this.a.C;
    }

    public final int c() {
        return this.a.s();
    }

    public final int d() {
        act act = this.a;
        return (act.C - act.s()) - this.a.u();
    }

    public final int e() {
        return this.a.u();
    }

    public final int f() {
        return this.a.A;
    }

    public final int g() {
        return this.a.B;
    }

    public abx(act act) {
        super(act);
    }

    public final int a(View view) {
        acu acu = (acu) view.getLayoutParams();
        return act.i(view) + acu.leftMargin + acu.rightMargin;
    }

    public final int b(View view) {
        acu acu = (acu) view.getLayoutParams();
        return act.h(view) + acu.topMargin + acu.bottomMargin;
    }

    public final int c(View view) {
        return this.a.f(view) + ((acu) view.getLayoutParams()).rightMargin;
    }

    public final int d(View view) {
        return this.a.d(view) - ((acu) view.getLayoutParams()).leftMargin;
    }

    public final int e(View view) {
        this.a.c(view, this.c);
        return this.c.right;
    }

    public final int f(View view) {
        this.a.c(view, this.c);
        return this.c.left;
    }
}
