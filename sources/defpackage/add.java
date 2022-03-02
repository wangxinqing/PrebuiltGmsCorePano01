package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: add  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class add extends aci {
    final /* synthetic */ RecyclerView a;

    public add(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a() {
        this.a.assertNotInLayoutOrScroll((String) null);
        RecyclerView recyclerView = this.a;
        recyclerView.mState.f = true;
        recyclerView.processDataSetCompletelyChanged(true);
        if (!this.a.mAdapterHelper.d()) {
            this.a.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
            RecyclerView recyclerView = this.a;
            if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                qb.a((View) recyclerView, recyclerView.mUpdateChildViewsRunnable);
                return;
            }
        }
        RecyclerView recyclerView2 = this.a;
        recyclerView2.mAdapterUpdateDuringMeasure = true;
        recyclerView2.requestLayout();
    }

    public final void c(int i, int i2) {
        this.a.assertNotInLayoutOrScroll((String) null);
        yn ynVar = this.a.mAdapterHelper;
        if (i2 > 0) {
            ynVar.a.add(ynVar.a(2, i, i2, (Object) null));
            ynVar.d |= 2;
            if (ynVar.a.size() == 1) {
                b();
            }
        }
    }

    public final void d(int i, int i2) {
        this.a.assertNotInLayoutOrScroll((String) null);
        yn ynVar = this.a.mAdapterHelper;
        if (i != i2) {
            ynVar.a.add(ynVar.a(8, i, i2, (Object) null));
            ynVar.d |= 8;
            if (ynVar.a.size() == 1) {
                b();
            }
        }
    }

    public final void a(int i, int i2, Object obj) {
        this.a.assertNotInLayoutOrScroll((String) null);
        yn ynVar = this.a.mAdapterHelper;
        if (i2 > 0) {
            ynVar.a.add(ynVar.a(4, i, i2, obj));
            ynVar.d |= 4;
            if (ynVar.a.size() == 1) {
                b();
            }
        }
    }

    public final void b(int i, int i2) {
        this.a.assertNotInLayoutOrScroll((String) null);
        yn ynVar = this.a.mAdapterHelper;
        if (i2 > 0) {
            ynVar.a.add(ynVar.a(1, i, i2, (Object) null));
            ynVar.d |= 1;
            if (ynVar.a.size() == 1) {
                b();
            }
        }
    }
}
