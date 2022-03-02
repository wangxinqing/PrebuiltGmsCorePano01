package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: alcs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alcs implements View.OnClickListener {
    final /* synthetic */ rlr a;
    final /* synthetic */ int b;
    final /* synthetic */ alct c;

    public alcs(alct alct, rlr rlr, int i) {
        this.c = alct;
        this.a = rlr;
        this.b = i;
    }

    public void onClick(View view) {
        rlr rlr = this.a;
        View view2 = this.c.a;
        int i = this.b;
        rlr.onItemClick((AdapterView) null, view2, i, (long) i);
    }
}
