package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.R;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;

/* renamed from: puq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class puq implements AdapterView.OnItemClickListener {
    final /* synthetic */ pur a;

    public puq(pur pur) {
        this.a = pur;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        pum pum = this.a.a;
        if (pum != null && i >= 0 && i < pum.getCount()) {
            AppIndexingErrorInfo a2 = this.a.a.getItem(i);
            pur pur = this.a;
            puk puk = new puk();
            Bundle bundle = new Bundle();
            bundle.putParcelable("error", a2);
            puk.setArguments(bundle);
            pur.getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.debug_container, puk, "errorDetailsFragment").addToBackStack((String) null).commit();
        }
    }
}
