package defpackage;

import android.view.View;

/* renamed from: akav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akav implements View.OnClickListener {
    final /* synthetic */ View.OnClickListener a;
    final /* synthetic */ akax b;

    public akav(akax akax, View.OnClickListener onClickListener) {
        this.b = akax;
        this.a = onClickListener;
    }

    public void onClick(View view) {
        this.a.onClick(view);
        this.b.a(1);
    }
}
