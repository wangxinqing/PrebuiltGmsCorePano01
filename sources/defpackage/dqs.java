package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: dqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dqs extends adl {
    final View s;
    final TextView t;
    final TextView u;
    final TextView v;
    final TextView w;

    public dqs(View view) {
        super(view);
        this.s = view;
        this.t = (TextView) view.findViewById(R.id.component_title);
        this.u = (TextView) view.findViewById(R.id.data_usage_foreground);
        this.v = (TextView) view.findViewById(R.id.data_usage_background);
        this.w = (TextView) view.findViewById(R.id.data_usage_total);
        view.setFocusable(true);
    }
}
