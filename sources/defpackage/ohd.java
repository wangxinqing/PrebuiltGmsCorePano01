package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.WebView;
import com.google.android.gms.R;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/* renamed from: ohd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ohd extends Fragment {
    public WebView a;
    public Deque b;
    public nzu c;
    boolean d;
    private List e = new ArrayList();

    static final avmt a(int i) {
        int i2 = i - 2;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 == 1) {
                    return avmt.CHAT;
                }
                if (i2 == 2) {
                    return avmt.HANGOUTS;
                }
                if (i2 == 3) {
                    return avmt.C2C;
                }
                if (i2 != 50) {
                    return avmt.UNKNOWN_CONTACT_MODE;
                }
            }
            return avmt.EMAIL;
        }
        throw null;
    }

    public final boolean b() {
        return !this.b.isEmpty() && ((nzv) this.b.peek()).b();
    }

    public final boolean c() {
        return !this.b.isEmpty() && ((nzv) this.b.peek()).c();
    }

    public final float d() {
        WebView webView = this.a;
        if (webView == null || webView.getContentHeight() <= 0) {
            return -1.0f;
        }
        return ((float) this.a.getScrollY()) / ((float) this.a.getContentHeight());
    }

    public final void onActivityCreated(Bundle bundle) {
        AppBarLayout appBarLayout;
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        nzu nzu = (nzu) activity;
        this.c = nzu;
        if (nzu.f() != null && axoi.a.a().a() && jkr.b() && (appBarLayout = (AppBarLayout) activity.findViewById(R.id.gh_help_app_bar)) != null) {
            appBarLayout.d = true;
            appBarLayout.c(true);
            this.a.setOnScrollChangeListener(new ogt(appBarLayout));
        }
        a((ohb) new ogu(this));
        a(false);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.gh_help_answer_fragment, viewGroup, false);
        WebView webView = (WebView) inflate.findViewById(R.id.gh_answer_content);
        this.a = webView;
        webView.setBackgroundColor(ofy.a(layoutInflater.getContext(), R.attr.ghf_surfaceColor));
        this.b = new ArrayDeque();
        this.d = false;
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            ((ohb) this.e.get(i)).a();
        }
        this.e = null;
        return inflate;
    }

    public final void a() {
        a((ohb) new ogz(this));
    }

    public final void a(nzv nzv, boolean z) {
        a((ohb) new ogv(this, nzv, z));
    }

    public final void a(ohb ohb) {
        List list = this.e;
        if (list != null) {
            list.add(ohb);
        } else {
            ohb.a();
        }
    }

    public final void a(boolean z) {
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        if (z) {
            beginTransaction.show(this);
        } else {
            beginTransaction.hide(this);
        }
        beginTransaction.commitAllowingStateLoss();
    }
}
