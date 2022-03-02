package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.gms.common.widget.phone.ScrollViewWithEvents;

/* renamed from: yyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yyx implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ yyz a;

    public yyx(yyz yyz) {
        this.a = yyz;
    }

    public final void onGlobalLayout() {
        ScrollViewWithEvents scrollViewWithEvents = this.a.c;
        scrollViewWithEvents.scrollTo(scrollViewWithEvents.getScrollX(), this.a.f);
    }
}
