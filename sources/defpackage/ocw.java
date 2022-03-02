package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;

/* renamed from: ocw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ocw extends ArrayAdapter {
    private final List a;

    public ocw(Context context, List list, List list2) {
        super(context, 17367049, list);
        this.a = list2;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        view2.setTag(this.a.get(i));
        return view2;
    }
}
