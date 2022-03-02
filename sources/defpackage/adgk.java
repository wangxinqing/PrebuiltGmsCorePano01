package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.google.android.gms.R;
import com.google.android.gms.common.widget.phone.ScrollViewWithEvents;

/* renamed from: adgk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adgk extends adgj implements ViewTreeObserver.OnGlobalLayoutListener {
    private ScrollViewWithEvents m;

    private final void a(int i) {
        View findViewById;
        if (getActivity() != null && (findViewById = getActivity().findViewById(R.id.udc_consent_button_bar_divider)) != null) {
            findViewById.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return R.layout.udc_consent_fragment_glif_v2;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (this.k || this.m.a()) {
            super.c();
            return;
        }
        this.i.a(this.j);
        this.m.pageScroll(130);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ScrollViewWithEvents scrollViewWithEvents = (ScrollViewWithEvents) onCreateView.findViewById(R.id.udc_consent_scroll_view);
        this.m = scrollViewWithEvents;
        scrollViewWithEvents.getViewTreeObserver().addOnGlobalLayoutListener(this);
        return onCreateView;
    }

    public final void onGlobalLayout() {
        a(!this.m.a() ? 0 : 8);
    }

    public final void a(ScrollView scrollView, boolean z) {
        super.a(scrollView, z);
        a(!z ? 0 : 8);
    }
}
