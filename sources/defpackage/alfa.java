package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView;

/* renamed from: alfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alfa implements alff {
    final /* synthetic */ ExpandingScrollView a;

    public alfa(ExpandingScrollView expandingScrollView) {
        this.a = expandingScrollView;
    }

    public final void a(MotionEvent motionEvent) {
        View view = this.a.g;
        if (view != null) {
            view.dispatchTouchEvent(motionEvent);
        }
    }
}
