package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: pul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pul {
    public final TextView a;
    public final TextView b;
    public final TextView c;

    public pul(View view) {
        this.a = (TextView) view.findViewById(R.id.item_title);
        this.b = (TextView) view.findViewById(R.id.item_subtitle);
        this.c = (TextView) view.findViewById(R.id.item_timestamp);
    }
}
