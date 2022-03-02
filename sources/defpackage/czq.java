package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;

/* renamed from: czq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class czq extends czj {
    final /* synthetic */ czr s;
    private final TextView t;
    private final TextView u;
    private final FadeInImageView v;
    private final FadeInImageView w;
    private final View x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public czq(czr czr, View view) {
        super(view);
        this.s = czr;
        this.x = view;
        this.t = (TextView) view.findViewById(R.id.title);
        this.u = (TextView) view.findViewById(R.id.description);
        this.v = (FadeInImageView) view.findViewById(R.id.image);
        this.w = (FadeInImageView) view.findViewById(R.id.icon);
    }

    public final void a(cze cze) {
        int i;
        boolean z;
        if (cze.a() == 6) {
            aqsz aqsz = ((czp) cze).a;
            cyd.a(this.t, aqsz.c);
            cyd.a(this.u, aqsz.d);
            ViewGroup.LayoutParams layoutParams = this.v.getLayoutParams();
            djk djk = this.s.k;
            FadeInImageView fadeInImageView = this.v;
            boolean z2 = true;
            int i2 = aqsz.a & 1;
            aqrl aqrl = aqsz.b;
            if (aqrl == null) {
                aqrl = aqrl.g;
            }
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            if (i2 == 0) {
                z = false;
            } else {
                z = true;
            }
            cyd.a(djk, fadeInImageView, z, aqrl, i);
            djk djk2 = this.s.k;
            FadeInImageView fadeInImageView2 = this.w;
            if ((aqsz.a & 8) == 0) {
                z2 = false;
            }
            aqrl aqrl2 = aqsz.e;
            if (aqrl2 == null) {
                aqrl2 = aqrl.g;
            }
            cyd.a(djk2, fadeInImageView2, z2, aqrl2);
            View view = this.x;
            aqsr aqsr = aqsz.g;
            if (aqsr == null) {
                aqsr = aqsr.d;
            }
            czr czr = this.s;
            cyd.a(view, aqsr, czr.h, que.a(czr.j, R.attr.asRipple, R.drawable.as_ripple_light));
        }
    }
}
