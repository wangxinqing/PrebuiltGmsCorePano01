package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: acd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acd implements afq {
    final /* synthetic */ RecyclerView a;

    public acd(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(adl adl) {
        RecyclerView recyclerView = this.a;
        recyclerView.mLayout.b(adl.a, recyclerView.mRecycler);
    }

    public final void b(adl adl, acn acn, acn acn2) {
        this.a.animateAppearance(adl, acn, acn2);
    }

    public final void c(adl adl, acn acn, acn acn2) {
        adl.a(false);
        RecyclerView recyclerView = this.a;
        if (recyclerView.mDataSetHasChangedAfterLayout) {
            if (recyclerView.mItemAnimator.a(adl, adl, acn, acn2)) {
                this.a.postAnimationRunner();
            }
        } else if (recyclerView.mItemAnimator.c(adl, acn, acn2)) {
            this.a.postAnimationRunner();
        }
    }

    public final void a(adl adl, acn acn, acn acn2) {
        this.a.mRecycler.b(adl);
        this.a.animateDisappearance(adl, acn, acn2);
    }
}
