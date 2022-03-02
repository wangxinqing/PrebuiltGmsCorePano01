package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: puz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class puz extends BaseAdapter {
    public final List a = new ArrayList();
    private final Context b;

    public puz(Context context) {
        this.b = context;
    }

    /* renamed from: a */
    public final pux getItem(int i) {
        return (pux) this.a.get(i);
    }

    public final int getCount() {
        return this.a.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.b.getSystemService("layout_inflater")).inflate(R.layout.generic_item, viewGroup, false);
            view.setTag(new puy(view));
        }
        puy puy = (puy) view.getTag();
        pux a2 = getItem(i);
        if (a2.a.isEmpty()) {
            TextView textView = puy.a;
            String str = a2.g;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
            sb.append("<");
            sb.append(str);
            sb.append(">");
            textView.setText(sb.toString());
        } else {
            puy.a.setText(a2.a);
        }
        puy.b.setText(a2.b);
        puy.c.setText(pue.b(a2.c));
        return view;
    }
}
