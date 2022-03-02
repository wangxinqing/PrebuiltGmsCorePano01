package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: ggb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ggb implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ View a;

    public ggb(View view) {
        this.a = view;
    }

    public final boolean onPreDraw() {
        View view = this.a;
        view.setSystemUiVisibility(view.getSystemUiVisibility() & -5635);
        return true;
    }
}
