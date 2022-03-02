package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: adn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class adn extends oz {
    final RecyclerView b;
    public final adm c;

    public adn(RecyclerView recyclerView) {
        this.b = recyclerView;
        oz b2 = b();
        if (b2 == null || !(b2 instanceof adm)) {
            this.c = new adm(this);
        } else {
            this.c = (adm) b2;
        }
    }

    public final void a(View view, qs qsVar) {
        super.a(view, qsVar);
        if (!a() && this.b.getLayoutManager() != null) {
            act layoutManager = this.b.getLayoutManager();
            RecyclerView recyclerView = layoutManager.r;
            layoutManager.a(recyclerView.mRecycler, recyclerView.mState, qsVar);
        }
    }

    public oz b() {
        return this.c;
    }

    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !a()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().a(accessibilityEvent);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.b.hasPendingAdapterUpdates();
    }

    public boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (a() || this.b.getLayoutManager() == null) {
            return false;
        }
        act layoutManager = this.b.getLayoutManager();
        RecyclerView recyclerView = layoutManager.r;
        return layoutManager.a(recyclerView.mRecycler, recyclerView.mState, i);
    }
}
