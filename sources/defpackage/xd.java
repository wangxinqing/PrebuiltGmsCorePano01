package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: xd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class xd implements AdapterView.OnItemClickListener, xl, xh {
    public Rect g;

    protected static int a(ListAdapter listAdapter, Context context, int i) {
        int i2;
        int i3 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i4 = 0;
        int i5 = 0;
        while (i3 < count) {
            int itemViewType = listAdapter.getItemViewType(i3);
            if (itemViewType != i5) {
                i2 = itemViewType;
            } else {
                i2 = i5;
            }
            if (itemViewType != i5) {
                view = null;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i3, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i4) {
                i4 = measuredWidth;
            }
            i3++;
            i5 = i2;
        }
        return i4;
    }

    protected static boolean b(wt wtVar) {
        int size = wtVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = wtVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public abstract void a(int i);

    public final void a(Context context, wt wtVar) {
    }

    public abstract void a(View view);

    public abstract void a(PopupWindow.OnDismissListener onDismissListener);

    public abstract void a(wt wtVar);

    public final boolean a(ww wwVar) {
        return false;
    }

    public final int b() {
        return 0;
    }

    public abstract void b(int i);

    public abstract void b(boolean z);

    public final boolean b(ww wwVar) {
        return false;
    }

    public abstract void c(int i);

    public abstract void c(boolean z);

    /* access modifiers changed from: protected */
    public boolean h() {
        return true;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        wt wtVar = a(listAdapter).a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (!h()) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        wtVar.a(menuItem, (xh) this, i2);
    }

    protected static wq a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (wq) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (wq) listAdapter;
    }
}
