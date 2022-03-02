package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: ajrx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajrx implements pq {
    final /* synthetic */ AppBarLayout a;

    public ajrx(AppBarLayout appBarLayout) {
        this.a = appBarLayout;
    }

    public final qn a(View view, qn qnVar) {
        qn qnVar2;
        AppBarLayout appBarLayout = this.a;
        if (!qb.s(appBarLayout)) {
            qnVar2 = null;
        } else {
            qnVar2 = qnVar;
        }
        if (!op.a(appBarLayout.c, qnVar2)) {
            appBarLayout.c = qnVar2;
            appBarLayout.b();
            appBarLayout.requestLayout();
        }
        return qnVar;
    }
}
