package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BrowserActionsFallbackMenuView extends LinearLayout {
    private final int a = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
    private final int b = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3 = getResources().getDisplayMetrics().widthPixels;
        int i4 = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(i3 - (i4 + i4), this.b), JGCastService.FLAG_PRIVATE_DISPLAY), i2);
    }
}
