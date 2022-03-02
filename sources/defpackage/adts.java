package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: adts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adts implements View.OnClickListener {
    final /* synthetic */ TextView a;
    final /* synthetic */ TextView b;

    public adts(TextView textView, TextView textView2) {
        this.a = textView;
        this.b = textView2;
    }

    public void onClick(View view) {
        this.a.setVisibility(0);
        this.b.setVisibility(0);
    }
}
