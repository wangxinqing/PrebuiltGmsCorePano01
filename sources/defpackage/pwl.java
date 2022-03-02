package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.gms.R;
import java.util.List;

/* renamed from: pwl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pwl extends BaseAdapter {
    private final Context a;
    private final List b;

    public pwl(Context context, List list) {
        this.a = context;
        this.b = list;
    }

    /* renamed from: a */
    public final pwj getItem(int i) {
        return (pwj) this.b.get(i);
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
            view.setTag(new pwk(view));
        }
        pwk pwk = (pwk) view.getTag();
        pwj a2 = getItem(i);
        pwk.a.setText(a2.a);
        pwk.b.setText(Integer.toString(a2.b.size()));
        return view;
    }
}
