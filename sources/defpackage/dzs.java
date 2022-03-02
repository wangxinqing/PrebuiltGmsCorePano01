package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: dzs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dzs extends adl {
    public final TextView s;
    public final TextView t;

    public dzs(View view) {
        super(view);
        this.s = (TextView) view.findViewById(R.id.selection);
        this.t = (TextView) view.findViewById(R.id.recipient_count);
    }
}
