package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.gms.R;
import java.util.ArrayList;

/* renamed from: wo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wo extends BaseAdapter {
    final /* synthetic */ wp a;
    private int b = -1;

    public wo(wp wpVar) {
        this.a = wpVar;
        a();
    }

    /* renamed from: a */
    public final ww getItem(int i) {
        ArrayList i2 = this.a.c.i();
        int i3 = this.a.e;
        int i4 = this.b;
        if (i4 >= 0 && i >= i4) {
            i++;
        }
        return (ww) i2.get(i);
    }

    public final int getCount() {
        int size = this.a.c.i().size();
        int i = this.a.e;
        return this.b >= 0 ? size - 1 : size;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            wp wpVar = this.a;
            LayoutInflater layoutInflater = wpVar.b;
            int i2 = wpVar.f;
            view = layoutInflater.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((xi) view).a(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        wt wtVar = this.a.c;
        ww wwVar = wtVar.i;
        if (wwVar != null) {
            ArrayList i = wtVar.i();
            int size = i.size();
            int i2 = 0;
            while (i2 < size) {
                if (((ww) i.get(i2)) != wwVar) {
                    i2++;
                } else {
                    this.b = i2;
                    return;
                }
            }
        }
        this.b = -1;
    }
}
