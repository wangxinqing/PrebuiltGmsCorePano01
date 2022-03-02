package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: gpw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gpw implements View.OnApplyWindowInsetsListener {
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), 0, 0);
    }
}
