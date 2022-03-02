package defpackage;

import android.os.Build;
import android.view.View;
import com.google.android.gms.R;
import java.util.Set;

/* renamed from: cxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cxh implements cwd {
    private final cxl a;
    private final Set b;
    private final aqsl c;

    public cxh(cxl cxl, Set set, aqsl aqsl) {
        this.a = cxl;
        this.b = set;
        this.c = aqsl;
    }

    public void onClick(View view) {
        aqsj aqsj;
        aqsj aqsj2;
        cxl cxl = this.a;
        Set set = this.b;
        aqsl aqsl = this.c;
        set.remove(view);
        int d = cxl.d();
        if (((cze) cxl.v.g.get(d)).a() == 4) {
            aqqh aqqh = ((cxg) cxl.v.g.get(d)).a;
            aucd aucd = (aucd) aqqh.c(5);
            aucd.a((aucj) aqqh);
            aqqh aqqh2 = (aqqh) aucd.i();
            if (aqqh2.a == 2) {
                aqsj = (aqsj) aqqh2.b;
            } else {
                aqsj = aqsj.b;
            }
            aucd aucd2 = (aucd) aqsj.c(5);
            aucd2.a((aucj) aqsj);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            aqsj aqsj3 = aqsj.b;
            ((aqsj) aucd2.b).a = aucj.s();
            if (aqqh2.a == 2) {
                aqsj2 = (aqsj) aqqh2.b;
            } else {
                aqsj2 = aqsj.b;
            }
            aucx aucx = aqsj2.a;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                aqsl aqsl2 = (aqsl) aucx.get(i);
                if (!aqsl2.equals(aqsl)) {
                    if (aucd2.c) {
                        aucd2.c();
                        aucd2.c = false;
                    }
                    aqsj aqsj4 = (aqsj) aucd2.b;
                    aqsl2.getClass();
                    aqsj4.a();
                    aqsj4.a.add(aqsl2);
                }
            }
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aqqh aqqh3 = (aqqh) aucd.b;
            aqsj aqsj5 = (aqsj) aucd2.i();
            aqqh aqqh4 = aqqh.c;
            aqsj5.getClass();
            aqqh3.b = aqsj5;
            aqqh3.a = 2;
        }
        int dimensionPixelSize = cxl.u.getDimensionPixelSize(R.dimen.as_card_deck_vertical_padding);
        int height = view.getHeight();
        qg m = qb.m(view);
        float f = (float) (-(height + dimensionPixelSize));
        View view2 = (View) m.a.get();
        if (view2 != null) {
            view2.animate().translationYBy(f);
        }
        m.a(0.0f);
        cxi cxi = new cxi(cxl, view, set, aqsl);
        View view3 = (View) m.a.get();
        if (view3 != null) {
            int i2 = Build.VERSION.SDK_INT;
            view3.animate().withEndAction(cxi);
        }
    }
}
