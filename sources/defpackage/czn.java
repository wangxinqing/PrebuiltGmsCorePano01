package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;

/* renamed from: czn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class czn extends czj {
    final /* synthetic */ czr s;
    private final TextView t;
    private final FadeInImageView u;
    private final FadeInImageView v;
    private final View w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public czn(czr czr, View view) {
        super(view);
        this.s = czr;
        this.w = view;
        this.t = (TextView) view.findViewById(R.id.title);
        this.u = (FadeInImageView) view.findViewById(R.id.image);
        this.v = (FadeInImageView) view.findViewById(R.id.icon);
    }

    public final void a(cze cze) {
        boolean z;
        if (cze.a() == 7) {
            aqrj aqrj = ((czo) cze).a;
            aqri aqri = aqrj.c;
            if (aqri == null) {
                aqri = aqri.c;
            }
            if (!jlh.d(aqri.a)) {
                aqri aqri2 = aqrj.c;
                if (aqri2 == null) {
                    aqri2 = aqri.c;
                }
                String str = aqri2.a;
                aqri aqri3 = aqrj.c;
                if (aqri3 == null) {
                    aqri3 = aqri.c;
                }
                cyd.a(this.t, str.replace(aqri3.b, this.s.e));
            }
            djk djk = this.s.k;
            FadeInImageView fadeInImageView = this.u;
            boolean z2 = true;
            int i = aqrj.a & 1;
            aqrl aqrl = aqrj.b;
            if (aqrl == null) {
                aqrl = aqrl.g;
            }
            if (i == 0) {
                z = false;
            } else {
                z = true;
            }
            cyd.a(djk, fadeInImageView, z, aqrl);
            djk djk2 = this.s.k;
            FadeInImageView fadeInImageView2 = this.v;
            if ((aqrj.a & 4) == 0) {
                z2 = false;
            }
            aqrl aqrl2 = aqrj.d;
            if (aqrl2 == null) {
                aqrl2 = aqrl.g;
            }
            cyd.a(djk2, fadeInImageView2, z2, aqrl2);
            cyd.a(this.w, csm.a, (cyg) new czm(this, aqrj), que.a(this.s.j, R.attr.asRipple, R.drawable.as_ripple_light));
        }
    }
}
