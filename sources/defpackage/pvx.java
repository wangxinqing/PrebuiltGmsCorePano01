package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pvx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pvx extends BaseAdapter {
    public final List a = new ArrayList();
    private final Context b;

    public pvx(Context context) {
        this.b = context;
    }

    /* renamed from: a */
    public final pvu getItem(int i) {
        return (pvu) this.a.get(i);
    }

    public final int getCount() {
        return this.a.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.b.getSystemService("layout_inflater")).inflate(R.layout.app_indexing_package_item, viewGroup, false);
            view.setTag(new pvw(view));
        }
        pvw pvw = (pvw) view.getTag();
        pvu a2 = getItem(i);
        pvw.a.setText(a2.a);
        pvw.b.setText(a2.b);
        pvw.c.setImageDrawable(a2.c);
        return view;
    }
}
