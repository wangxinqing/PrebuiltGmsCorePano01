package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.gms.R;
import java.util.List;

/* renamed from: pup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pup extends BaseAdapter {
    private final Context a;
    private final List b;

    public pup(Context context, List list) {
        this.a = context;
        this.b = list;
    }

    /* renamed from: a */
    public final pun getItem(int i) {
        return (pun) this.b.get(i);
    }

    public final int getCount() {
        return this.b.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.a.getSystemService("layout_inflater")).inflate(R.layout.generic_item, viewGroup, false);
            view.setTag(new puo(view));
        }
        puo puo = (puo) view.getTag();
        pun a2 = getItem(i);
        puo.b.setText(a2.b());
        puo.a.setText(a2.a());
        puo.c.setText(pue.b(a2.a));
        return view;
    }
}
