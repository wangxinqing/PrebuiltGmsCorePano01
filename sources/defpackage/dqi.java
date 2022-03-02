package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: dqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dqi extends adl implements View.OnClickListener {
    final TextView s;
    final TextView t;
    final /* synthetic */ dqk u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dqi(dqk dqk, View view) {
        super(view);
        this.u = dqk;
        this.s = (TextView) view.findViewById(16908308);
        this.t = (TextView) view.findViewById(16908309);
    }

    public void onClick(View view) {
        int d;
        if (this.u.f != null && (d = d()) != -1) {
            dqk dqk = this.u;
            dqk.f.a((jef) dqk.e.get(d));
        }
    }
}
