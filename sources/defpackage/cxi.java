package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Set;

/* renamed from: cxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cxi implements Runnable {
    private final cxl a;
    private final View b;
    private final Set c;
    private final aqsl d;

    public cxi(cxl cxl, View view, Set set, aqsl aqsl) {
        this.a = cxl;
        this.b = view;
        this.c = set;
        this.d = aqsl;
    }

    public final void run() {
        cxl cxl = this.a;
        View view = this.b;
        Set set = this.c;
        aqsl aqsl = this.d;
        int i = -cxl.t.getWidth();
        view.setX((float) (i + i));
        if (!set.isEmpty()) {
            ViewGroup.LayoutParams layoutParams = cxl.t.getLayoutParams();
            layoutParams.height = cxl.t.getHeight();
            cxl.t.setLayoutParams(layoutParams);
            cxl.t.removeView(view);
            LinearLayout linearLayout = cxl.t;
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int i2 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginEnd(0);
            childAt.setLayoutParams(layoutParams2);
        } else {
            int d2 = cxl.d();
            cxl.v.g.remove(d2);
            cxl.v.M(d2);
            cxu cxu = cxl.v;
            cxu.h(d2, cxu.g.size());
        }
        cxd cxd = cxl.v.a;
        Long valueOf = Long.valueOf(aqsl.b);
        cxd cxd2 = ((cxc) cxd).a.c;
        if (cxd2 != null) {
            dfd dfd = ((dbg) cxd2).a.a.b;
            dfd.a.a(dfd.b(), valueOf);
        }
    }
}
