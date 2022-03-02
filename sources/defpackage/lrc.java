package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.drive.ui.select.view.FastScrollerSwipeRefreshLayout;
import com.google.android.gms.drive.ui.select.view.FileListView;

/* renamed from: lrc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lrc implements ViewGroup.OnHierarchyChangeListener {
    final /* synthetic */ FastScrollerSwipeRefreshLayout a;

    public lrc(FastScrollerSwipeRefreshLayout fastScrollerSwipeRefreshLayout) {
        this.a = fastScrollerSwipeRefreshLayout;
    }

    public final void onChildViewAdded(View view, View view2) {
        if (view2 instanceof FileListView) {
            this.a.m = ((FileListView) view2).a;
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        if (view2 instanceof FileListView) {
            this.a.m = null;
        }
    }
}
