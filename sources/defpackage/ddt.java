package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;
import com.google.android.gms.accountsettings.mg.poc.ui.search.SearchItemsListView;
import java.util.List;

/* renamed from: ddt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ddt implements ax {
    private final dee a;

    public ddt(dee dee) {
        this.a = dee;
    }

    public final void a(Object obj) {
        aqrj aqrj;
        dee dee = this.a;
        List list = (List) obj;
        if (list != null && dee.g != null) {
            boolean z = false;
            if (!jlh.d(dee.h)) {
                dee.c.setText(dee.getResources().getQuantityString(R.plurals.as_result_num, list.size(), new Object[]{Integer.valueOf(list.size())}));
            } else {
                dee.c.setText(dee.getString(R.string.as_all_results));
            }
            if (list.isEmpty()) {
                djk djk = dee.i;
                FadeInImageView fadeInImageView = dee.b;
                aqsy aqsy = dee.g;
                if ((aqsy.a & 2) != 0) {
                    z = true;
                }
                aqrl aqrl = aqsy.d;
                if (aqrl == null) {
                    aqrl = aqrl.g;
                }
                cyd.a(djk, fadeInImageView, z, aqrl);
            } else {
                dee.b.setVisibility(8);
            }
            SearchItemsListView searchItemsListView = (SearchItemsListView) dee.j;
            aqsy aqsy2 = dee.g;
            if ((1 & aqsy2.a) != 0) {
                aqrj = aqsy2.c;
                if (aqrj == null) {
                    aqrj = aqrj.f;
                }
            } else {
                aqrj = null;
            }
            String str = dee.h;
            czr czr = searchItemsListView.c;
            if (czr != null) {
                czr.a(czr.a(list, aqrj, str));
                czr.e = str;
                czr.as();
                return;
            }
            searchItemsListView.a(list, aqrj, str);
        }
    }
}
