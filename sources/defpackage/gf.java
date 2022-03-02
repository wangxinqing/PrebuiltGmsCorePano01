package defpackage;

import android.view.View;

/* renamed from: gf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gf extends gt {
    final /* synthetic */ gj a;

    public gf(gj gjVar) {
        this.a = gjVar;
    }

    public final View a(int i) {
        View view = this.a.S;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + this + " does not have a view");
    }

    public final boolean a() {
        return this.a.S != null;
    }
}
