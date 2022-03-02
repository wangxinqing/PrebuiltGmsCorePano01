package com.google.android.libraries.material.opensearchbar;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OpenSearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
    private boolean e = false;

    public OpenSearchBar$ScrollingViewBehavior() {
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean a = super.a(coordinatorLayout, view, view2);
        if (!this.e && (view2 instanceof AppBarLayout)) {
            this.e = true;
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            appBarLayout.setBackgroundColor(0);
            if (Build.VERSION.SDK_INT == 21) {
                appBarLayout.setOutlineProvider((ViewOutlineProvider) null);
            } else {
                int i = Build.VERSION.SDK_INT;
                ajsq.a(appBarLayout, 0.0f);
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        return true;
    }

    public OpenSearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
