package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;

/* renamed from: cxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cxp extends czj {
    public final View s;
    public final int t;
    final /* synthetic */ cxu u;
    private final FadeInImageView v;
    private final TextView w;
    private final TextView x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cxp(cxu cxu, View view) {
        super(view);
        this.u = cxu;
        this.s = view;
        this.v = (FadeInImageView) view.findViewById(R.id.intro_image);
        this.w = (TextView) view.findViewById(R.id.intro_title);
        this.x = (TextView) view.findViewById(R.id.intro_description);
        this.t = cxu.j.getResources().getDimensionPixelSize(R.dimen.as_screen_intro_max_width);
        cxu.a(this.s, 1);
    }

    public final void a(cze cze) {
        if (cze.a() == 2) {
            if (d() == this.u.a() - 1) {
                cxu.a(this.s, 2);
            }
            aqst aqst = ((cxm) cze).a;
            djk djk = this.u.k;
            FadeInImageView fadeInImageView = this.v;
            boolean z = true;
            int i = aqst.a & 1;
            aqrl aqrl = aqst.b;
            if (aqrl == null) {
                aqrl = aqrl.g;
            }
            int width = this.s.getWidth();
            if (i == 0) {
                z = false;
            }
            cyd.a(djk, fadeInImageView, z, aqrl, width);
            cyd.a(this.w, aqst.c);
            cyd.a(this.x, aqst.d);
            TextView textView = this.x;
            String str = aqst.e;
            aqsr aqsr = aqst.f;
            if (aqsr == null) {
                aqsr = aqsr.d;
            }
            cyd.a(textView, str, aqsr, this.u.h);
            this.s.addOnLayoutChangeListener(new cxo(this));
        }
    }
}
