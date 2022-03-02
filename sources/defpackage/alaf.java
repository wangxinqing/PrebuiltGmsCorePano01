package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: alaf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alaf implements AdapterView.OnItemClickListener {
    final /* synthetic */ alal a;

    public alaf(alal alal) {
        this.a = alal;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        rhf rhf = (rhf) adapterView.getItemAtPosition(i);
        if (rhf.d() == null) {
            this.a.a(rhf.a(), true);
            return;
        }
        this.a.a(rhf.a(), false);
        alal alal = this.a;
        String d = rhf.d();
        alal.b();
        if (alal.g != null) {
            alal.a.setVisibility(0);
            akzz akzz = alal.g;
            akzz.h = alal;
            akzz.a(new String[]{d});
        }
        alal.f();
    }
}
