package defpackage;

import android.view.View;

/* renamed from: jpx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jpx implements View.OnLongClickListener {
    private final jpy a;
    private final String b;

    public jpx(jpy jpy, String str) {
        this.a = jpy;
        this.b = str;
    }

    public final boolean onLongClick(View view) {
        jpy jpy = this.a;
        jrx.a(jpy.getContext(), this.b).show();
        return true;
    }
}
