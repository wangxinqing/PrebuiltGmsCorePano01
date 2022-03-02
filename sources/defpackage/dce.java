package defpackage;

import android.view.View;

/* renamed from: dce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dce implements View.OnClickListener {
    private final dch a;
    private final aqtw b;

    public dce(dch dch, aqtw aqtw) {
        this.a = dch;
        this.b = aqtw;
    }

    public void onClick(View view) {
        dch dch = this.a;
        aqtw aqtw = this.b;
        dgb dgb = dch.a;
        aqsr aC = dch.aC();
        aqsr aqsr = aqtw.c;
        if (aqsr == null) {
            aqsr = aqsr.d;
        }
        dgb.a(aC, aqsr);
    }
}
