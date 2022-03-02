package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.material.chip.Chip;

/* renamed from: cwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cwj extends czj {
    public final Chip s;
    final /* synthetic */ cwp t;
    private final djk u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cwj(cwp cwp, View view, djk djk) {
        super(view);
        this.t = cwp;
        this.s = (Chip) view.findViewById(R.id.action_chip);
        this.u = djk;
    }

    public final void a(cze cze) {
        Drawable drawable;
        if (cze.a() == 5) {
            aqpm aqpm = ((cwg) cze).a;
            this.s.setText(aqpm.b);
            int b = que.b(this.t.j, R.attr.colorPrimaryGoogle, R.color.google_blue600);
            if ((aqpm.a & 2) != 0) {
                aqrl aqrl = aqpm.c;
                if (aqrl == null) {
                    aqrl = aqrl.g;
                }
                aqrk a = aqrk.a(aqrl.b);
                if (!(a == null || cxz.a(this.t.j, a) == 0)) {
                    if (awgy.d()) {
                        drawable = cxz.b(this.t.j, a).mutate();
                    } else {
                        Context context = this.t.j;
                        drawable = kf.a(context, cxz.a(context, a)).mutate();
                    }
                    this.s.a(drawable);
                    Chip chip = this.s;
                    ColorStateList a2 = que.a(b);
                    ajuj ajuj = chip.b;
                    if (ajuj != null) {
                        ajuj.b(a2);
                    }
                }
                aqrl aqrl2 = aqpm.c;
                if (aqrl2 == null) {
                    aqrl2 = aqrl.g;
                }
                if ((aqrl2.a & 2) != 0) {
                    djk djk = this.u;
                    aqrl aqrl3 = aqpm.c;
                    if (aqrl3 == null) {
                        aqrl3 = aqrl.g;
                    }
                    djk.a(aqrl3.c, new cwh(this, b));
                }
            }
            this.s.setOnClickListener(new cwi(this, aqpm));
        }
    }
}
