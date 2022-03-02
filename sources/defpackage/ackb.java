package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ackb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ackb extends BaseAdapter {
    private static final Comparator e = new acka();
    public final Object a = new Object();
    public final Map b;
    private final Context c;
    private final List d;

    public ackb(Context context) {
        iva.a((Object) context);
        this.c = context;
        this.b = new HashMap();
        this.d = new ArrayList();
    }

    /* renamed from: a */
    public final acov getItem(int i) {
        acov acov;
        synchronized (this.d) {
            acov = (acov) this.d.get(i);
        }
        return acov;
    }

    public final int getCount() {
        return this.d.size();
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.c.getSystemService("layout_inflater")).inflate(R.layout.sud_items_default, viewGroup, false);
        }
        acov a2 = getItem(i);
        ImageView imageView = (ImageView) view.findViewById(R.id.sud_items_icon);
        ((TextView) view.findViewById(R.id.sud_items_title)).setText(a2.a);
        TextView textView = (TextView) view.findViewById(R.id.sud_items_summary);
        if (a2.d == 12) {
            textView.setVisibility(0);
            textView.setText(R.string.common_connected);
        } else {
            textView.setVisibility(8);
        }
        if (a2.c != 0) {
            imageView.setImageResource(R.drawable.smartdevice_wifi_signal_lock);
        } else {
            imageView.setImageResource(R.drawable.smartdevice_wifi_signal_open);
        }
        imageView.setImageLevel(a2.b);
        return view;
    }

    public final void notifyDataSetChanged() {
        synchronized (this.a) {
            this.d.clear();
            for (acov add : this.b.values()) {
                this.d.add(add);
            }
            Collections.sort(this.d, e);
        }
        super.notifyDataSetChanged();
    }
}
