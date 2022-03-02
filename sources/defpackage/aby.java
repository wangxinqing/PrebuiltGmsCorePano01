package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: aby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aby extends abz {
    public final int a() {
        act act = this.a;
        return act.D - act.v();
    }

    public final void a(int i) {
        RecyclerView recyclerView = this.a.r;
        if (recyclerView != null) {
            recyclerView.offsetChildrenVertical(i);
        }
    }

    public final int b() {
        return this.a.D;
    }

    public final int c() {
        return this.a.t();
    }

    public final int d() {
        act act = this.a;
        return (act.D - act.t()) - this.a.v();
    }

    public final int e() {
        return this.a.v();
    }

    public final int f() {
        return this.a.B;
    }

    public final int g() {
        return this.a.A;
    }

    public aby(act act) {
        super(act);
    }

    public final int a(View view) {
        acu acu = (acu) view.getLayoutParams();
        return act.h(view) + acu.topMargin + acu.bottomMargin;
    }

    public final int b(View view) {
        acu acu = (acu) view.getLayoutParams();
        return act.i(view) + acu.leftMargin + acu.rightMargin;
    }

    public final int c(View view) {
        return this.a.g(view) + ((acu) view.getLayoutParams()).bottomMargin;
    }

    public final int d(View view) {
        return this.a.e(view) - ((acu) view.getLayoutParams()).topMargin;
    }

    public final int e(View view) {
        this.a.c(view, this.c);
        return this.c.bottom;
    }

    public final int f(View view) {
        this.a.c(view, this.c);
        return this.c.top;
    }
}
