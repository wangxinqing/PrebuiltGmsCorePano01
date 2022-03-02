package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;
import com.google.android.gms.accountsettings.mg.poc.ui.search.SearchItemsListView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: dee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dee extends dew {
    public dhy a;
    public FadeInImageView b;
    public TextView c;
    public SearchView d;
    public InputMethodManager e;
    public SwipeRefreshLayout f;
    public aqsy g;
    public String h;
    public djk i;

    public static dee a(dhx dhx) {
        dee dee = new dee();
        Bundle bundle = new Bundle();
        bundle.putByteArray("screenKey", csm.b(((dfk) dhx).a));
        dee.setArguments(bundle);
        return dee;
    }

    public final boolean a(aqpp aqpp) {
        return (aqpp.a & 64) != 0;
    }

    public final aqsr aC() {
        return this.a.a();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.d.setFocusable(true);
        this.d.requestFocus();
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 9) {
            dhy dhy = this.a;
            dhy.c.a(((dfk) dhy.a).a);
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.i = ((czx) activity).b().a();
        dhx a2 = dhx.a(csm.d(getArguments().getByteArray("screenKey")));
        did c2 = ((die) activity).c();
        dhy dhy = new dhy(a2, c2.a, c2.b);
        this.a = dhy;
        dhy.d.a(this, new ddr(this));
        this.a.f.a(this, new ddt(this));
        this.a.e.a(this, new ddu(this));
        this.a.h.a(this, new ddv(this));
        this.a.i.a(this, new ddw(this));
        this.e = (InputMethodManager) getContext().getSystemService("input_method");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.as_search_screen_fragment, viewGroup, false);
        ddx ddx = new ddx(this);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.d(!cyd.a(getContext()) ? R.drawable.quantum_ic_arrow_back_vd_theme_24 : R.drawable.quantum_ic_arrow_forward_vd_theme_24);
        toolbar.c((int) R.string.abc_action_bar_up_description);
        toolbar.a((View.OnClickListener) new ddy(this));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_refresh_layout);
        this.f = swipeRefreshLayout;
        que.a(swipeRefreshLayout);
        SwipeRefreshLayout swipeRefreshLayout2 = this.f;
        dhy dhy = this.a;
        dhy.getClass();
        swipeRefreshLayout2.a = new ddz(dhy);
        SwipeRefreshLayout swipeRefreshLayout3 = this.f;
        swipeRefreshLayout3.b(swipeRefreshLayout3.i);
        this.j = (cye) inflate.findViewById(R.id.search_items_list);
        SearchItemsListView searchItemsListView = (SearchItemsListView) this.j;
        searchItemsListView.f = this.i;
        searchItemsListView.setOnTouchListener(ddx);
        ((SearchItemsListView) this.j).a = new dea(this);
        ((SearchItemsListView) this.j).b = new deb(this);
        a(bundle);
        FadeInImageView fadeInImageView = (FadeInImageView) inflate.findViewById(R.id.illustration);
        this.b = fadeInImageView;
        fadeInImageView.setVisibility(8);
        TextView textView = (TextView) inflate.findViewById(R.id.result_number);
        this.c = textView;
        textView.setText(getString(R.string.as_all_results));
        this.c.setOnTouchListener(ddx);
        ((SearchItemsListView) this.j).setFocusable(false);
        this.c.setFocusable(false);
        SearchView searchView = (SearchView) inflate.findViewById(R.id.search_bar);
        this.d = searchView;
        View findViewById = searchView.findViewById(R.id.search_edit_frame);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (cyd.a(getContext())) {
                    marginLayoutParams.rightMargin = 0;
                } else {
                    marginLayoutParams.leftMargin = 0;
                }
            }
        }
        View findViewById2 = searchView.findViewById(R.id.search_src_text);
        if (findViewById2 != null) {
            if (cyd.a(getContext())) {
                findViewById2.setPadding(findViewById2.getPaddingLeft(), findViewById2.getPaddingTop(), 0, findViewById2.getPaddingBottom());
            } else {
                findViewById2.setPadding(0, findViewById2.getPaddingTop(), findViewById2.getPaddingRight(), findViewById2.getPaddingBottom());
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) findViewById2.getLayoutParams();
            layoutParams2.height = -1;
            findViewById2.setLayoutParams(layoutParams2);
        }
        this.d.n = new dds(this);
        this.d.m = new dec(this);
        SearchView searchView2 = this.d;
        searchView2.a(searchView2.a.getImeOptions() | 301989894);
        return inflate;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return ((SearchItemsListView) this.j).a();
    }

    public final /* synthetic */ void a(aqrj aqrj, String str) {
        aqrh aqrh = aqrj.e;
        if (aqrh == null) {
            aqrh = aqrh.c;
        }
        if (!jlh.d(aqrh.a)) {
            try {
                aqrh aqrh2 = aqrj.e;
                if (aqrh2 == null) {
                    aqrh2 = aqrh.c;
                }
                String str2 = aqrh2.a;
                aqrh aqrh3 = aqrj.e;
                if (aqrh3 == null) {
                    aqrh3 = aqrh.c;
                }
                startActivity(cyj.a(getContext(), cyj.a(str2.replace(aqrh3.b, URLEncoder.encode(str, "UTF-8")), false, (dih) null)));
            } catch (ActivityNotFoundException | UnsupportedEncodingException e2) {
            }
        }
    }
}
