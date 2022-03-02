package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: yme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yme implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ yml a;

    public yme(yml yml) {
        this.a = yml;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ymm b = this.a.b.getItem(i);
        yml yml = this.a;
        yml.d = i;
        yml.a.b(iak.n, this.a.c());
        this.a.a.b(b.b);
        this.a.b.c = b.b;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
