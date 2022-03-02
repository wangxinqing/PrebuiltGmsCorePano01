package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: pt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pt implements View.OnApplyWindowInsetsListener {
    final /* synthetic */ pq a;

    public pt(pq pqVar) {
        this.a = pqVar;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return (WindowInsets) this.a.a(view, qn.a(windowInsets)).a;
    }
}
