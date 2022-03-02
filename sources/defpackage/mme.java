package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: mme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mme extends adl {
    final ImageView s;
    final ImageView t;
    final TextView u;
    final TextView v;

    public mme(View view) {
        super(view);
        this.s = (ImageView) view.findViewById(R.id.fm_cp_avatar);
        this.t = (ImageView) view.findViewById(R.id.fm_cp_default_avatar);
        this.u = (TextView) view.findViewById(R.id.fm_cp_contact_row_line_1);
        this.v = (TextView) view.findViewById(R.id.fm_cp_contact_row_line_2);
    }
}
