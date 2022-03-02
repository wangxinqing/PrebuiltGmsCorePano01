package android.support.v7.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, ws, xj {
    private static final int[] a = {16842964, 16843049};
    private wt b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public final void a(wt wtVar) {
        this.b = wtVar;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((ww) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        aev a2 = aev.a(context, attributeSet, a, i, 0);
        if (a2.f(0)) {
            setBackgroundDrawable(a2.a(0));
        }
        if (a2.f(1)) {
            setDivider(a2.a(1));
        }
        a2.a();
    }

    public final boolean a(ww wwVar) {
        return this.b.a((MenuItem) wwVar, 0);
    }
}
