package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class GuidedActionItemContainer extends aki {
    private boolean a;

    public GuidedActionItemContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public final View focusSearch(View view, int i) {
        if (this.a || !alh.a(this, view)) {
            return super.focusSearch(view, i);
        }
        View focusSearch = super.focusSearch(view, i);
        if (!alh.a(this, focusSearch)) {
            return null;
        }
        return focusSearch;
    }

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
    }
}
