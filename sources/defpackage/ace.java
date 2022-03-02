package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: ace  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ace {
    public final /* synthetic */ RecyclerView a;

    public ace(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final int a() {
        return this.a.getChildCount();
    }

    public final View b(int i) {
        return this.a.getChildAt(i);
    }

    public final int a(View view) {
        return this.a.indexOfChild(view);
    }

    public final void b(View view) {
        adl childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            this.a.setChildImportantForAccessibilityInternal(childViewHolderInt, childViewHolderInt.o);
            childViewHolderInt.o = 0;
        }
    }

    public final void a(int i) {
        View childAt = this.a.getChildAt(i);
        if (childAt != null) {
            this.a.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        this.a.removeViewAt(i);
    }
}
