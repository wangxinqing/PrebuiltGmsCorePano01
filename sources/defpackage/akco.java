package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: akco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akco implements AdapterView.OnItemClickListener {
    final /* synthetic */ akcp a;

    public akco(akcp akcp) {
        this.a = akcp;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object obj;
        long j2;
        int i2;
        View view2;
        View view3;
        int i3;
        long j3;
        if (i >= 0) {
            obj = this.a.getAdapter().getItem(i);
        } else {
            abs abs = this.a.a;
            obj = abs.e() ? abs.e.getSelectedItem() : null;
        }
        this.a.a(obj);
        AdapterView.OnItemClickListener onItemClickListener = this.a.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view != null && i >= 0) {
                view2 = view;
                i2 = i;
                j2 = j;
            } else {
                abs abs2 = this.a.a;
                if (abs2.e()) {
                    view3 = abs2.e.getSelectedView();
                } else {
                    view3 = null;
                }
                abs abs3 = this.a.a;
                if (abs3.e()) {
                    i3 = abs3.e.getSelectedItemPosition();
                } else {
                    i3 = -1;
                }
                abs abs4 = this.a.a;
                if (abs4.e()) {
                    j3 = abs4.e.getSelectedItemId();
                } else {
                    j3 = Long.MIN_VALUE;
                }
                view2 = view3;
                i2 = i3;
                j2 = j3;
            }
            onItemClickListener.onItemClick(this.a.a.e, view2, i2, j2);
        }
        this.a.a.d();
    }
}
