package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.material.button.MaterialButton;

/* renamed from: cwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cwn extends czj {
    public final MaterialButton s;
    final /* synthetic */ cwo t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cwn(cwo cwo, View view) {
        super(view);
        this.t = cwo;
        this.s = (MaterialButton) view.findViewById(R.id.action_button);
    }

    public final void a(cze cze) {
        Drawable drawable;
        if (cze.a() == 5) {
            aqpm aqpm = ((cwk) cze).a;
            this.s.setText(aqpm.b);
            if ((aqpm.a & 2) != 0) {
                aqrl aqrl = aqpm.c;
                if (aqrl == null) {
                    aqrl = aqrl.g;
                }
                aqrk a = aqrk.a(aqrl.b);
                if (!(a == null || cxz.a(this.t.j, a) == 0)) {
                    if (awgy.d()) {
                        drawable = cxz.b(this.t.j, a);
                    } else {
                        Context context = this.t.j;
                        drawable = kf.a(context, cxz.a(context, a));
                    }
                    this.s.a(drawable);
                    qb.a(this.s, this.t.j.getResources().getDimensionPixelSize(R.dimen.as_action_chip_icon_left_padding), this.s.getPaddingTop(), this.s.getPaddingRight(), this.s.getPaddingBottom());
                }
                aqrl aqrl2 = aqpm.c;
                if (aqrl2 == null) {
                    aqrl2 = aqrl.g;
                }
                if ((aqrl2.a & 2) != 0) {
                    djk djk = this.t.k;
                    aqrl aqrl3 = aqpm.c;
                    if (aqrl3 == null) {
                        aqrl3 = aqrl.g;
                    }
                    djk.a(aqrl3.c, new cwl(this));
                }
            }
            MaterialButton materialButton = this.s;
            aqsr aqsr = aqpm.d;
            if (aqsr == null) {
                aqsr = aqsr.d;
            }
            cyd.a((View) materialButton, aqsr, this.t.h);
            if ((aqpm.a & 4) == 0) {
                this.s.setOnClickListener(new cwm(this));
            }
        }
    }
}
