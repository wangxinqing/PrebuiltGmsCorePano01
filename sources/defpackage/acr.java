package defpackage;

import android.view.View;

/* renamed from: acr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acr implements afn {
    final /* synthetic */ act a;

    public acr(act act) {
        this.a = act;
    }

    public final int a() {
        return this.a.s();
    }

    public final int b() {
        act act = this.a;
        return act.C - act.u();
    }

    public final int a(View view) {
        return this.a.d(view) - ((acu) view.getLayoutParams()).leftMargin;
    }

    public final int b(View view) {
        return this.a.f(view) + ((acu) view.getLayoutParams()).rightMargin;
    }

    public final View a(int i) {
        return this.a.h(i);
    }
}
