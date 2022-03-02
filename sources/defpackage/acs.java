package defpackage;

import android.view.View;

/* renamed from: acs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acs implements afn {
    final /* synthetic */ act a;

    public acs(act act) {
        this.a = act;
    }

    public final int a() {
        return this.a.t();
    }

    public final int b() {
        act act = this.a;
        return act.D - act.v();
    }

    public final int a(View view) {
        return this.a.e(view) - ((acu) view.getLayoutParams()).topMargin;
    }

    public final int b(View view) {
        return this.a.g(view) + ((acu) view.getLayoutParams()).bottomMargin;
    }

    public final View a(int i) {
        return this.a.h(i);
    }
}
