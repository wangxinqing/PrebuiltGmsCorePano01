package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: zwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zwm extends adl {
    final TextView s;
    final ImageView t;

    public zwm(View view) {
        super(view);
        this.s = (TextView) view.findViewById(R.id.contact_name);
        this.t = (ImageView) view.findViewById(R.id.contact_photo);
    }
}
