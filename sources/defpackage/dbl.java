package defpackage;

import android.view.View;

/* renamed from: dbl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dbl implements View.OnClickListener {
    private final dbp a;

    public dbl(dbp dbp) {
        this.a = dbp;
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.a.q;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
