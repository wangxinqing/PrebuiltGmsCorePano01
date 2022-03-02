package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: jrd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jrd {
    public final TextView a;
    public final View b;
    final /* synthetic */ jre c;

    public jrd(jre jre, View view) {
        this.c = jre;
        this.b = view;
        this.a = (TextView) view.findViewById(R.id.display_name);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        this.b.setVisibility(i);
    }
}
