package defpackage;

import android.view.View;

/* renamed from: jpw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jpw implements View.OnLongClickListener {
    private final jpz a;
    private final String b;

    public jpw(jpz jpz, String str) {
        this.a = jpz;
        this.b = str;
    }

    public final boolean onLongClick(View view) {
        jpz jpz = this.a;
        jrx.a(jpz.c.getContext(), this.b).show();
        return true;
    }
}
