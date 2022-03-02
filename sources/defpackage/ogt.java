package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: ogt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ogt implements View.OnScrollChangeListener {
    private final AppBarLayout a;

    public ogt(AppBarLayout appBarLayout) {
        this.a = appBarLayout;
    }

    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        this.a.b(i2 != 0);
    }
}
