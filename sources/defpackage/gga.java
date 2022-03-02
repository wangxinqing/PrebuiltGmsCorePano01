package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: gga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gga implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ View a;

    public gga(View view) {
        this.a = view;
    }

    public final boolean onPreDraw() {
        View view = this.a;
        view.setSystemUiVisibility(view.getSystemUiVisibility() | 5634);
        return true;
    }
}
