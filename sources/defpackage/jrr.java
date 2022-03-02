package defpackage;

import android.view.View;

/* renamed from: jrr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class jrr implements View.OnLongClickListener {
    private final jrs a;
    private final View b;

    public jrr(jrs jrs, View view) {
        this.a = jrs;
        this.b = view;
    }

    public final boolean onLongClick(View view) {
        jrx.a(this.b.getContext(), this.a.d).show();
        return true;
    }
}
