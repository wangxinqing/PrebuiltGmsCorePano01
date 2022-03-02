package defpackage;

import android.view.View;

/* renamed from: abgq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abgq implements View.OnClickListener {
    private final abgt a;

    public abgq(abgt abgt) {
        this.a = abgt;
    }

    public void onClick(View view) {
        abgt abgt = this.a;
        if (abgt.c()) {
            abgt.b.a();
            abgt.d.b();
            abgt.n.a();
            return;
        }
        abgt.b();
    }
}
