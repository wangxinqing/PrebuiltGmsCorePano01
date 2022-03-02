package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.R;

/* renamed from: pvy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pvy implements AdapterView.OnItemClickListener {
    final /* synthetic */ pwe a;

    public pvy(pwe pwe) {
        this.a = pwe;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        pvx pvx = this.a.a;
        if (pvx != null && i >= 0 && i < pvx.getCount()) {
            pvu a2 = this.a.a.getItem(i);
            pwe pwe = this.a;
            pvt pvt = new pvt();
            Bundle bundle = new Bundle();
            bundle.putString("packageName", a2.b);
            bundle.putString("appName", a2.a);
            bundle.putBoolean("supportsRebuild", a2.d);
            pvt.setArguments(bundle);
            pwe.getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.debug_container, pvt, "packageDetailsFragment").addToBackStack((String) null).commit();
        }
    }
}
