package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: ymi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ymi implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ yml a;

    public ymi(yml yml) {
        this.a = yml;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ymm b = this.a.c.getItem(i);
        this.a.a.b(iak.m, this.a.c());
        this.a.c(b.a);
        this.a.c.a(b.a);
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
