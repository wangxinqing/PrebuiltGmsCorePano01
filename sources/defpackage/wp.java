package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.view.menu.ExpandedMenuView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.gms.R;

/* renamed from: wp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wp implements AdapterView.OnItemClickListener, xh {
    Context a;
    public LayoutInflater b;
    wt c;
    public ExpandedMenuView d;
    int e;
    final int f = R.layout.abc_list_menu_item_layout;
    public xg g;
    public wo h;

    public final void a(Context context, wt wtVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = wtVar;
        wo woVar = this.h;
        if (woVar != null) {
            woVar.notifyDataSetChanged();
        }
    }

    public final void a(xg xgVar) {
        throw null;
    }

    public final boolean a() {
        return false;
    }

    public final boolean a(ww wwVar) {
        return false;
    }

    public final int b() {
        return 0;
    }

    public final boolean b(ww wwVar) {
        return false;
    }

    public final ListAdapter c() {
        if (this.h == null) {
            this.h = new wo(this);
        }
        return this.h;
    }

    public final Parcelable f() {
        if (this.d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.a((MenuItem) this.h.getItem(i), (xh) this, 0);
    }

    public wp(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    public final void a(Parcelable parcelable) {
        SparseArray sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public final void a(wt wtVar, boolean z) {
        xg xgVar = this.g;
        if (xgVar != null) {
            xgVar.a(wtVar, z);
        }
    }

    public final void a(boolean z) {
        wo woVar = this.h;
        if (woVar != null) {
            woVar.notifyDataSetChanged();
        }
    }

    public final boolean a(xp xpVar) {
        if (!xpVar.hasVisibleItems()) {
            return false;
        }
        wu wuVar = new wu(xpVar);
        wt wtVar = wuVar.a;
        sr srVar = new sr(wtVar.a);
        wuVar.c = new wp(srVar.a());
        wp wpVar = wuVar.c;
        wpVar.g = wuVar;
        wuVar.a.a((xh) wpVar);
        ListAdapter c2 = wuVar.c.c();
        sn snVar = srVar.a;
        snVar.q = c2;
        snVar.r = wuVar;
        View view = wtVar.g;
        if (view != null) {
            srVar.a(view);
        } else {
            srVar.a(wtVar.f);
            srVar.b(wtVar.e);
        }
        srVar.a((DialogInterface.OnKeyListener) wuVar);
        wuVar.b = srVar.b();
        wuVar.b.setOnDismissListener(wuVar);
        WindowManager.LayoutParams attributes = wuVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        wuVar.b.show();
        xg xgVar = this.g;
        if (xgVar == null) {
            return true;
        }
        xgVar.a(xpVar);
        return true;
    }
}
