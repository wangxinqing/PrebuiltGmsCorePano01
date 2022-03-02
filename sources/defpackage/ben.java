package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: ben  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ben extends acg {
    public View a;
    private final acg e;
    private final aci f;

    public ben(acg acg) {
        bem bem = new bem(this);
        this.f = bem;
        this.e = acg;
        acg.a((aci) bem);
        a(this.e.c);
    }

    public final long J(int i) {
        if (this.a != null) {
            i--;
        }
        if (i >= 0) {
            return this.e.J(i);
        }
        return Long.MAX_VALUE;
    }

    public final int a() {
        int a2 = this.e.a();
        return this.a != null ? a2 + 1 : a2;
    }

    public final int a(int i) {
        if (this.a != null) {
            i--;
        }
        if (i >= 0) {
            return this.e.a(i);
        }
        return Integer.MAX_VALUE;
    }

    public final adl a(ViewGroup viewGroup, int i) {
        if (i != Integer.MAX_VALUE) {
            return this.e.a(viewGroup, i);
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return new beo(frameLayout);
    }

    public final void a(adl adl, int i) {
        View view = this.a;
        if (view != null) {
            i--;
        }
        if (!(adl instanceof beo)) {
            this.e.a(adl, i);
        } else if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) this.a.getParent()).removeView(this.a);
            }
            ((FrameLayout) adl.a).addView(this.a);
        } else {
            throw new IllegalStateException("HeaderViewHolder cannot find mHeader");
        }
    }
}
