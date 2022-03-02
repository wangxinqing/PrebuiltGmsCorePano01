package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: wz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wz extends FrameLayout implements vs {
    final CollapsibleActionView a;

    public wz(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    public final void a() {
        this.a.onActionViewExpanded();
    }

    public final void b() {
        this.a.onActionViewCollapsed();
    }
}
