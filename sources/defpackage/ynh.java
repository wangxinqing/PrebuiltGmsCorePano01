package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.fitness.data.BleDevice;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ynh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ynh extends BaseAdapter implements yma {
    public final ArrayList a = new ArrayList();
    public ymg b;
    private final ymb c;
    private final LayoutInflater d;
    private final ArrayList e = new ArrayList();
    private boolean f;

    public ynh(Context context, ymb ymb, ymg ymg) {
        this.d = LayoutInflater.from(context);
        this.c = ymb;
        this.b = ymg;
    }

    private final int c() {
        if (this.b.a()) {
            return this.a.size();
        }
        return 0;
    }

    public final void a() {
        notifyDataSetChanged();
    }

    public final void b() {
        this.e.clear();
        this.a.clear();
        this.f = false;
        notifyDataSetInvalidated();
    }

    public final int getCount() {
        return this.e.size() + c() + (this.f ? 1 : 0);
    }

    public final Object getItem(int i) {
        if (i < this.e.size()) {
            return this.e.get(i);
        }
        int size = i - this.e.size();
        if (size < c()) {
            return this.a.get(size);
        }
        return null;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return i < this.e.size() + c() ? 0 : 1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (i < this.e.size()) {
            if (view == null) {
                view = this.d.inflate(R.layout.plus_list_apps_item, viewGroup, false);
            }
            yxi yxi = (yxi) this.e.get(i);
            yls a2 = this.c.i.a(yxi);
            ((TextView) view.findViewById(R.id.app_name)).setText(a2.a);
            ((ImageView) view.findViewById(R.id.app_icon)).setImageDrawable(a2.b);
            String b2 = yxi.b();
            if (a2.c && b2 != null) {
                ymb ymb = this.c;
                ymb.h.a(yxi, b2);
                List list = (List) ymb.j.get(yxi);
                if (list == null) {
                    list = new ArrayList();
                    ymb.j.put(yxi, list);
                }
                list.add(this);
            }
        } else if (i - this.e.size() < c()) {
            if (view == null) {
                view = this.d.inflate(R.layout.plus_list_apps_item, viewGroup, false);
            }
            ((TextView) view.findViewById(R.id.app_name)).setText(((BleDevice) this.a.get(i - this.e.size())).b);
            ((ImageView) view.findViewById(R.id.app_icon)).setImageResource(R.drawable.ic_device_placeholder_24);
        } else if (view == null) {
            return this.d.inflate(R.layout.plus_list_apps_item_loading, viewGroup, false);
        }
        return view;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final boolean hasStableIds() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Collection r4, boolean r5) {
        /*
            r3 = this;
            java.util.ArrayList r0 = r3.e
            r0.clear()
            r3.f = r5
            int r5 = r4.size()
            r0 = 0
        L_0x000c:
            if (r0 >= r5) goto L_0x0025
            java.lang.Object r1 = r4.get(r0)
            yxi r1 = (defpackage.yxi) r1
            ymg r2 = r3.b
            boolean r2 = r2.a(r1)
            if (r2 != 0) goto L_0x001d
            goto L_0x0022
        L_0x001d:
            java.util.ArrayList r2 = r3.e
            r2.add(r1)
        L_0x0022:
            int r0 = r0 + 1
            goto L_0x000c
        L_0x0025:
            r3.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ynh.a(java.util.Collection, boolean):void");
    }
}
