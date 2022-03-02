package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.List;

/* renamed from: mrv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mrv implements View.OnClickListener {
    private final mrx a;
    private final RecyclerView b;

    public mrv(mrx mrx, RecyclerView recyclerView) {
        this.a = mrx;
        this.b = recyclerView;
    }

    public void onClick(View view) {
        mrx mrx = this.a;
        int childLayoutPosition = this.b.getChildLayoutPosition(view);
        List list = mrx.e;
        if (list != null && childLayoutPosition < list.size() && childLayoutPosition >= 0) {
            mrm mrm = mrx.a;
            mta a2 = mta.a(((tzj) mrx.e.get(childLayoutPosition)).b.k());
            mrm.getFragmentManager().beginTransaction().addToBackStack("fast_pair_account_settings").replace(16908290, a2, "fast_pair_device_details").commit();
            arwt arwt = mrm.a;
            if (arwt != null) {
                arwt.a(a2);
            }
        }
    }
}
