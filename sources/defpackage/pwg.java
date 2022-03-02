package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.gms.R;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import java.util.List;

/* renamed from: pwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pwg extends BaseAdapter {
    private final Context a;
    private final List b;

    public pwg(Context context, List list) {
        this.a = context;
        this.b = list;
    }

    /* renamed from: a */
    public final AppIndexingUserActionInfo getItem(int i) {
        return (AppIndexingUserActionInfo) this.b.get(i);
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
            view.setTag(new pwf(view));
        }
        pwf pwf = (pwf) view.getTag();
        AppIndexingUserActionInfo a2 = getItem(i);
        pwf.a.setText(a2.c.b);
        pwf.b.setText(a2.c.c);
        pwf.c.setText(pue.b(a2.b));
        return view;
    }
}
