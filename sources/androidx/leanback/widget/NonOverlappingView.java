package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class NonOverlappingView extends View {
    public NonOverlappingView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    public NonOverlappingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public NonOverlappingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
