package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: dxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dxh extends znp {
    final /* synthetic */ dxm a;

    public dxh(dxm dxm) {
        this.a = dxm;
    }

    public final int a() {
        return this.a.c;
    }

    public final Object b(int i) {
        return this;
    }

    public final View a(View view, ViewGroup viewGroup, boolean z) {
        TextView textView = (TextView) this.a.a(view, R.layout.appinvite_contextual_selection_header_text);
        textView.setText(R.string.appinvite_public_search_results);
        return textView;
    }
}
