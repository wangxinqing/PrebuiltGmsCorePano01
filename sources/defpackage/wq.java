package defpackage;

import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.ArrayList;

/* renamed from: wq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wq extends BaseAdapter {
    public final wt a;
    public boolean b;
    private int c = -1;
    private final boolean d;
    private final LayoutInflater e;
    private final int f;

    public wq(wt wtVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = wtVar;
        this.f = i;
        a();
    }

    /* renamed from: a */
    public final ww getItem(int i) {
        ArrayList i2 = this.d ? this.a.i() : this.a.g();
        int i3 = this.c;
        if (i3 >= 0 && i >= i3) {
            i++;
        }
        return (ww) i2.get(i);
    }

    public final int getCount() {
        ArrayList i = this.d ? this.a.i() : this.a.g();
        if (this.c >= 0) {
            return i.size() - 1;
        }
        return i.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z;
        int i3 = 0;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i4 = getItem(i).b;
        int i5 = i - 1;
        if (i5 >= 0) {
            i2 = getItem(i5).b;
        } else {
            i2 = i4;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (!this.a.b()) {
            z = false;
        } else {
            z = i4 != i2;
        }
        ImageView imageView = listMenuItemView.b;
        if (imageView != null) {
            if (listMenuItemView.d) {
                i3 = 8;
            } else if (!z) {
                i3 = 8;
            }
            imageView.setVisibility(i3);
        }
        xi xiVar = (xi) view;
        if (this.b) {
            listMenuItemView.e = true;
            listMenuItemView.c = true;
        }
        xiVar.a(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        wt wtVar = this.a;
        ww wwVar = wtVar.i;
        if (wwVar != null) {
            ArrayList i = wtVar.i();
            int size = i.size();
            int i2 = 0;
            while (i2 < size) {
                if (((ww) i.get(i2)) != wwVar) {
                    i2++;
                } else {
                    this.c = i2;
                    return;
                }
            }
        }
        this.c = -1;
    }
}
