package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: jqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jqv {
    public final View a;
    public final ImageView b;
    public final TextView c = ((TextView) this.a.findViewById(R.id.text));
    public final TextView d = ((TextView) this.a.findViewById(R.id.subtext));
    final /* synthetic */ jqw e;

    public jqv(jqw jqw, View view) {
        this.e = jqw;
        this.a = view;
        this.b = (ImageView) view.findViewById(R.id.image);
    }

    public final void a(int i) {
        this.a.setVisibility(i);
    }
}
