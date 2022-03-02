package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: sm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sm implements AdapterView.OnItemClickListener {
    final /* synthetic */ sq a;
    final /* synthetic */ sn b;

    public sm(sn snVar, sq sqVar) {
        this.b = snVar;
        this.a = sqVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.r.onClick(this.a.b, i);
        if (!this.b.v) {
            this.a.b.dismiss();
        }
    }
}
