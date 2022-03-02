package defpackage;

import android.content.Context;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.Collections;
import java.util.List;

/* renamed from: ptr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ptr extends BaseAdapter {
    private final List a;
    private final LayoutInflater b;
    private final Context c;

    public ptr(Context context, List list) {
        this.a = list;
        Collections.sort(list, new ptp());
        this.b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.c = context;
    }

    /* renamed from: a */
    public final pts getItem(int i) {
        return (pts) this.a.get(i);
    }

    public final int getCount() {
        return this.a.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        String str = null;
        if (view == null) {
            view = this.b.inflate(R.layout.manage_applications_item, (ViewGroup) null);
            view.setTag(new ptq(this.c, view));
        }
        ptq ptq = (ptq) view.getTag();
        pts a2 = getItem(i);
        ptq.a.setText(a2.b);
        TextView textView = ptq.b;
        long j = a2.d;
        if (j >= 0) {
            str = Formatter.formatFileSize(ptq.d, j);
        }
        textView.setText(str);
        ptq.c.setImageDrawable(a2.c);
        return view;
    }
}
