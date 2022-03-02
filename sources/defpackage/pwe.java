package defpackage;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Switch;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: pwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pwe extends Fragment {
    public pvx a;
    public ListView b;
    public View c;
    public View d;
    public View e;
    public Switch f;
    public SwipeRefreshLayout g;

    public final void a(boolean z) {
        SharedPreferences.Editor edit = getActivity().getPreferences(0).edit();
        edit.putBoolean("errorCacheEnabled", z);
        edit.commit();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.packages_fragment, viewGroup, false);
        this.c = inflate.findViewById(R.id.packages_main_view);
        this.d = inflate.findViewById(R.id.packages_progress_bar);
        ListView listView = (ListView) inflate.findViewById(R.id.packages_list_view);
        this.b = listView;
        listView.setEmptyView(inflate.findViewById(R.id.no_applications_message));
        pvx pvx = new pvx(getActivity());
        this.a = pvx;
        this.b.setAdapter(pvx);
        this.b.setOnItemClickListener(new pvy(this));
        if (((Boolean) ozx.at.c()).booleanValue()) {
            View findViewById = inflate.findViewById(R.id.error_cache_container);
            this.e = findViewById;
            findViewById.setVisibility(0);
            Switch switchR = (Switch) inflate.findViewById(R.id.toggle_error_caching);
            this.f = switchR;
            switchR.setOnCheckedChangeListener(new pvz(this));
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.packages_swipe_container);
        this.g = swipeRefreshLayout;
        swipeRefreshLayout.a = new pwa(this);
        this.b.setOnScrollListener(new pwb(this));
        int i = Build.VERSION.SDK_INT;
        inflate.findViewById(R.id.error_cache_description).setTextDirection(5);
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        getActivity().setTitle((int) R.string.packages_title);
        sg aE = ((bjs) getActivity()).aE();
        if (aE != null) {
            aE.b((CharSequence) "");
        }
        getActivity();
        new pwd(this).execute(new Void[0]);
    }
}
