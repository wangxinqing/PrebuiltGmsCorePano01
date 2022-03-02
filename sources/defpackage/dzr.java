package defpackage;

import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: dzr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dzr extends adl {
    public final AutoCompleteTextView s;
    public final TextView t;
    public final TextView u;
    public final ImageView v;

    public dzr(View view) {
        super(view);
        this.s = (AutoCompleteTextView) view.findViewById(R.id.search);
        this.t = (TextView) view.findViewById(R.id.search_text);
        this.u = (TextView) view.findViewById(R.id.recipient_count);
        this.v = (ImageView) view.findViewById(R.id.cancel);
    }
}
