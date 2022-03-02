package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: acf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acf {
    final /* synthetic */ RecyclerView a;

    public acf(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final adl a(int i) {
        adl findViewHolderForPosition = this.a.findViewHolderForPosition(i, true);
        if (findViewHolderForPosition == null || this.a.mChildHelper.c(findViewHolderForPosition.a)) {
            return null;
        }
        return findViewHolderForPosition;
    }

    public final void b(int i, int i2) {
        this.a.offsetPositionRecordsForInsert(i, i2);
        this.a.mItemsAddedOrRemoved = true;
    }

    public final void c(int i, int i2) {
        this.a.offsetPositionRecordsForMove(i, i2);
        this.a.mItemsAddedOrRemoved = true;
    }

    public final void a(int i, int i2) {
        this.a.offsetPositionRecordsForRemove(i, i2, true);
        RecyclerView recyclerView = this.a;
        recyclerView.mItemsAddedOrRemoved = true;
        recyclerView.mState.c += i2;
    }

    public final void a(int i, int i2, Object obj) {
        this.a.viewRangeUpdate(i, i2, obj);
        this.a.mItemsChanged = true;
    }

    /* access modifiers changed from: package-private */
    public final void a(ym ymVar) {
        int i = ymVar.a;
        if (i == 1) {
            this.a.mLayout.b(ymVar.b, ymVar.d);
        } else if (i == 2) {
            this.a.mLayout.d(ymVar.b, ymVar.d);
        } else if (i == 4) {
            act act = this.a.mLayout;
            int i2 = ymVar.b;
            int i3 = ymVar.d;
            Object obj = ymVar.c;
            act.d();
        } else if (i == 8) {
            this.a.mLayout.c(ymVar.b, ymVar.d);
        }
    }
}
