package defpackage;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: pvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pvi extends Fragment {
    public puz a;
    public ListView b;
    public View c;
    public View d;
    public MenuItem e;
    public SearchView f;
    public CharSequence g = "";
    public SwipeRefreshLayout h;
    private String i;
    private String j;
    private String k;
    private boolean l = true;

    public final void a(String str) {
        this.g = str;
        pvh pvh = new pvh(this);
        pvh.getClass();
        pvh.execute(new pvf[]{new pvf(this.i, this.j, this.k, str)});
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.app_indexing_debug_menu, menu);
        SearchManager searchManager = (SearchManager) getActivity().getSystemService("search");
        if (searchManager == null) {
            super.onCreateOptionsMenu(menu, menuInflater);
            return;
        }
        SearchableInfo searchableInfo = searchManager.getSearchableInfo(getActivity().getComponentName());
        if (searchableInfo == null) {
            super.onCreateOptionsMenu(menu, menuInflater);
            return;
        }
        MenuItem findItem = menu.findItem(R.id.app_indexing_debug_search);
        this.e = findItem;
        if (findItem == null) {
            super.onCreateOptionsMenu(menu, menuInflater);
            return;
        }
        pk.a(findItem, (pj) new pve(this));
        SearchView searchView = (SearchView) pk.a(this.e);
        this.f = searchView;
        if (searchView == null) {
            super.onCreateOptionsMenu(menu, menuInflater);
            return;
        }
        searchView.a(searchableInfo);
        this.f.a((CharSequence) getActivity().getString(R.string.search_view_hint, new Object[]{"Indexables"}));
        if (!this.l) {
            this.c.post(new pva(this));
        }
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.generic_list_fragment, viewGroup, false);
        this.c = inflate.findViewById(R.id.main_view);
        this.d = inflate.findViewById(R.id.progress_bar);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_container);
        this.h = swipeRefreshLayout;
        swipeRefreshLayout.setEnabled(true);
        this.h.a = new pvb(this);
        ListView listView = (ListView) inflate.findViewById(R.id.generic_list_view);
        this.b = listView;
        listView.setEmptyView(inflate.findViewById(R.id.no_items_message));
        ((TextView) inflate.findViewById(R.id.no_items_message)).setText(R.string.no_indexables);
        puz puz = new puz(getActivity());
        this.a = puz;
        this.b.setAdapter(puz);
        this.b.setOnItemClickListener(new pvc(this));
        this.b.setOnScrollListener(new pvd(this));
        this.i = getArguments().getString("packageName");
        this.j = getArguments().getString("corpusName");
        this.k = getArguments().getString("indexableType");
        a(this.g.toString());
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        SearchView searchView = this.f;
        if (searchView != null) {
            this.g = searchView.d();
            this.l = this.f.p;
        }
    }

    public final void onResume() {
        super.onResume();
        getActivity().setTitle((CharSequence) "Indexables");
        sg aE = ((bjs) getActivity()).aE();
        if (aE != null) {
            aE.b((CharSequence) getActivity().getString(R.string.indexables_subtitle, new Object[]{this.k, "Indexables"}));
        }
    }
}
