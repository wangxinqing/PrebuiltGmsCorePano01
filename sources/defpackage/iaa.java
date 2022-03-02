package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: iaa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iaa extends adl {
    final TextView s;

    public iaa(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.title);
        this.s = (TextView) view.findViewById(R.id.subtitle);
    }
}
