package defpackage;

import android.view.View;

/* renamed from: jpv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jpv implements View.OnLongClickListener {
    private final jpz a;
    private final jsl b;

    public jpv(jpz jpz, jsl jsl) {
        this.a = jpz;
        this.b = jsl;
    }

    public final boolean onLongClick(View view) {
        jrx.a(this.a.c.getContext(), this.b.b()).show();
        return true;
    }
}
