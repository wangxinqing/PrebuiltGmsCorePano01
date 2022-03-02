package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.R;

/* renamed from: pvm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pvm implements AdapterView.OnItemClickListener {
    final /* synthetic */ pvt a;

    public pvm(pvt pvt) {
        this.a = pvt;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        pup pup = this.a.k;
        if (pup != null && i >= 0 && i < pup.getCount()) {
            pun a2 = this.a.k.getItem(i);
            pvt pvt = this.a;
            pur pur = new pur();
            Bundle bundle = new Bundle();
            bundle.putString("callType", a2.a());
            bundle.putInt("errorCode", a2.b());
            bundle.putParcelableArrayList("errors", a2.b);
            pur.setArguments(bundle);
            pvt.getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.debug_container, pur, "errorsFragment").addToBackStack((String) null).commit();
        }
    }
}
