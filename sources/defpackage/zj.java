package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: zj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zj implements AdapterView.OnItemClickListener {
    final /* synthetic */ zm a;

    public zj(zm zmVar) {
        this.a = zmVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.d.setSelection(i);
        if (this.a.d.getOnItemClickListener() != null) {
            zm zmVar = this.a;
            zmVar.d.performItemClick(view, i, zmVar.b.getItemId(i));
        }
        this.a.d();
    }
}
