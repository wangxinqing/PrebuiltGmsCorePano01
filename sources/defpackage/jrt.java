package defpackage;

import android.view.View;

/* renamed from: jrt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jrt implements View.OnLongClickListener {
    private final jru a;
    private final View b;

    public jrt(jru jru, View view) {
        this.a = jru;
        this.b = view;
    }

    public final boolean onLongClick(View view) {
        jrx.a(this.b.getContext(), this.a.a).show();
        return true;
    }
}
