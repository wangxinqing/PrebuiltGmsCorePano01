package defpackage;

import android.view.View;

/* renamed from: cwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cwi implements View.OnClickListener {
    private final cwj a;
    private final aqpm b;

    public cwi(cwj cwj, aqpm aqpm) {
        this.a = cwj;
        this.b = aqpm;
    }

    public void onClick(View view) {
        cwj cwj = this.a;
        aqpm aqpm = this.b;
        if ((aqpm.a & 4) != 0) {
            cyg cyg = cwj.t.h;
            aqsr aqsr = aqpm.d;
            if (aqsr == null) {
                aqsr = aqsr.d;
            }
            cyg.a(aqsr);
            return;
        }
        cwj.t.a.performClick();
    }
}
