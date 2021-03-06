package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class PlaybackControlsRowView extends LinearLayout {
    public PlaybackControlsRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findFocus = findFocus();
        if (findFocus == null || !findFocus.requestFocus(i, rect)) {
            return super.onRequestFocusInDescendants(i, rect);
        }
        return true;
    }

    public PlaybackControlsRowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
