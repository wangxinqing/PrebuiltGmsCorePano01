package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.gms.common.Feature;

/* renamed from: gif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gif extends Fragment implements LoaderManager.LoaderCallbacks {
    public boolean a;
    public String b = "";
    private Account c;
    private boolean d;
    private gig e;

    public final void a() {
        gie gie = (gie) getActivity();
        if (gie != null && this.d && this.a) {
            gig gig = this.e;
            gie.a(gig.a, gig.b, this.b);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.c = (Account) getArguments().getParcelable("account");
        this.d = false;
        this.a = false;
        getLoaderManager().initLoader(0, (Bundle) null, this);
        if (awpf.b()) {
            abty a2 = abmr.a(getActivity());
            iha b2 = ihb.b();
            b2.a = abtp.a;
            b2.b = new Feature[]{abmo.b};
            a2.a(b2.a()).a((acvp) new gid(this));
            return;
        }
        this.a = true;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new gih(getActivity(), this.c);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Activity activity = getActivity();
        if (!ijm.a(getArguments().getString("theme"))) {
            i = R.layout.auth_device_management_progress;
        } else {
            i = R.layout.auth_device_management_progress_glif;
        }
        ijo a2 = ijo.a(activity, i);
        ijm.a(a2.a());
        View findViewById = a2.a().findViewById(R.id.circular_progress_bar);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        } else {
            a2.a(true);
        }
        a2.c(false);
        a2.b();
        alhs.a(getActivity().getWindow(), false);
        a2.b(false);
        getActivity().setTitle((int) R.string.auth_gls_name_checking_info_title);
        a2.a(getActivity().getTitle());
        return a2.a();
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.d = true;
        this.e = (gig) obj;
        a();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
