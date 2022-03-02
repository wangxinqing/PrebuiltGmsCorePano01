package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.R;

/* renamed from: pvl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pvl implements AdapterView.OnItemClickListener {
    final /* synthetic */ pvt a;

    public pvl(pvt pvt) {
        this.a = pvt;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        pwl pwl = this.a.h;
        if (pwl != null && i >= 0 && i < pwl.getCount()) {
            pwj a2 = this.a.h.getItem(i);
            pvt pvt = this.a;
            pwn pwn = new pwn();
            Bundle bundle = new Bundle();
            bundle.putString("actionType", a2.a);
            bundle.putParcelableArrayList("userActions", a2.b);
            pwn.setArguments(bundle);
            pvt.getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.debug_container, pwn, "userActionsFragment").addToBackStack((String) null).commit();
        }
    }
}
