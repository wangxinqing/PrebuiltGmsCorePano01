package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: px  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class px implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    private final WeakHashMap a = new WeakHashMap();

    public final void onGlobalLayout() {
        boolean z;
        for (Map.Entry entry : this.a.entrySet()) {
            View view = (View) entry.getKey();
            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
            if (view.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (booleanValue != z) {
                if (z) {
                    qb.i(view, 16);
                }
                this.a.put(view, Boolean.valueOf(z));
            }
        }
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
