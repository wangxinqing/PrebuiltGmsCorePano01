package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* renamed from: alhr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alhr implements View.OnApplyWindowInsetsListener {
    private int a;
    private boolean b = false;

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!this.b) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            this.a = (view.getRootView().getHeight() - iArr[1]) - view.getHeight();
            this.b = true;
        }
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        int max = Math.max(windowInsets.getSystemWindowInsetBottom() - this.a, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (max < marginLayoutParams.bottomMargin + view.getHeight()) {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, max);
            view.setLayoutParams(marginLayoutParams);
            systemWindowInsetBottom = 0;
        }
        return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), systemWindowInsetBottom);
    }
}
