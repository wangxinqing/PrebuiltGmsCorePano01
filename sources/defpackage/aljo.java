package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: aljo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aljo extends acg {
    public final acg a;
    public View e;
    private final aci f;

    public aljo(acg acg) {
        aljn aljn = new aljn(this);
        this.f = aljn;
        this.a = acg;
        acg.a((aci) aljn);
        a(this.a.c);
    }

    public final long J(int i) {
        if (this.e != null) {
            i--;
        }
        if (i >= 0) {
            return this.a.J(i);
        }
        return Long.MAX_VALUE;
    }

    public final int a() {
        int a2 = this.a.a();
        return this.e != null ? a2 + 1 : a2;
    }

    public final int a(int i) {
        if (this.e != null) {
            i--;
        }
        if (i >= 0) {
            return this.a.a(i);
        }
        return Integer.MAX_VALUE;
    }

    public final adl a(ViewGroup viewGroup, int i) {
        if (i != Integer.MAX_VALUE) {
            return this.a.a(viewGroup, i);
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return new aljp(frameLayout);
    }

    public final void a(adl adl, int i) {
        View view = this.e;
        if (view != null) {
            i--;
        }
        if (!(adl instanceof aljp)) {
            this.a.a(adl, i);
        } else if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) this.e.getParent()).removeView(this.e);
            }
            ((FrameLayout) adl.a).addView(this.e);
        } else {
            throw new IllegalStateException("HeaderViewHolder cannot find mHeader");
        }
    }
}
