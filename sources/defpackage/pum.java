package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.gms.R;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;
import java.util.List;

/* renamed from: pum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pum extends BaseAdapter {
    private final Context a;
    private final List b;

    public pum(Context context, List list) {
        this.a = context;
        this.b = list;
    }

    /* renamed from: a */
    public final AppIndexingErrorInfo getItem(int i) {
        return (AppIndexingErrorInfo) this.b.get(i);
    }

    public final int getCount() {
        return this.b.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        String str2;
        ActionImpl actionImpl;
        if (view == null) {
            view = ((LayoutInflater) this.a.getSystemService("layout_inflater")).inflate(R.layout.generic_item, viewGroup, false);
            view.setTag(new pul(view));
        }
        pul pul = (pul) view.getTag();
        AppIndexingErrorInfo a2 = getItem(i);
        Thing thing = a2.f;
        if (thing == null || thing.a() == null) {
            ActionImpl actionImpl2 = a2.g;
            if (actionImpl2 == null || (str = actionImpl2.b) == null) {
                str = "<null name>";
            }
        } else {
            str = a2.f.a();
        }
        Thing thing2 = a2.f;
        if ((thing2 == null || (str2 = thing2.d) == null) && ((actionImpl = a2.g) == null || (str2 = actionImpl.c) == null)) {
            str2 = "<null URL>";
        }
        pul.a.setText(str);
        pul.b.setText(str2);
        pul.c.setText(pue.b(a2.e));
        return view;
    }
}
