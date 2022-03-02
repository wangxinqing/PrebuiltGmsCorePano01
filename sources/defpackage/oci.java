package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: oci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oci implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ ocj a;

    public oci(ocj ocj) {
        this.a = ocj;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.a.e();
    }

    public final void onNothingSelected(AdapterView adapterView) {
        this.a.e();
    }
}
