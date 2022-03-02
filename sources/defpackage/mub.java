package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: mub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mub extends adl {
    final TextView s;
    final TextView t;

    public mub(View view) {
        super(view);
        this.s = (TextView) view.findViewById(R.id.gf_item_label);
        this.t = (TextView) view.findViewById(R.id.gf_item_value);
    }
}
