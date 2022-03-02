package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.List;

/* renamed from: pui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pui extends BaseAdapter {
    private final Context a;
    private final List b;

    public pui(Context context, List list) {
        this.a = context;
        this.b = list;
    }

    /* renamed from: a */
    public final pug getItem(int i) {
        return (pug) this.b.get(i);
    }

    public final int getCount() {
        return this.b.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.a.getSystemService("layout_inflater")).inflate(R.layout.generic_single_line_item, viewGroup, false);
            view.setTag(new puh(view));
        }
        puh puh = (puh) view.getTag();
        pug a2 = getItem(i);
        puh.a.setText(pue.a(a2.a.c));
        TextView textView = puh.b;
        int i2 = a2.b;
        StringBuilder sb = new StringBuilder(11);
        sb.append(i2);
        textView.setText(sb.toString());
        return view;
    }
}
