package defpackage;

import com.google.android.gms.accountsettings.mg.poc.ui.search.SearchItemsListView;
import java.util.ArrayList;

/* renamed from: ddw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ddw implements ax {
    private final dee a;

    public ddw(dee dee) {
        this.a = dee;
    }

    public final void a(Object obj) {
        dee dee = this.a;
        boolean d = dee.d();
        SearchItemsListView searchItemsListView = (SearchItemsListView) dee.j;
        cyf cyf = (cyf) ((amri) obj).c();
        ded ded = new ded(dee);
        searchItemsListView.d = cyf;
        searchItemsListView.e = ded;
        if (searchItemsListView.c == null) {
            searchItemsListView.a(new ArrayList(), (aqrj) null, (String) null);
        }
        searchItemsListView.c.a(cyf, (cyh) ded);
        if (d) {
            ((SearchItemsListView) dee.j).getLayoutManager().e(0, 0);
        }
    }
}
