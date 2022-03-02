package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: ymu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ymu extends Fragment implements ica, icb {
    public yui a = yuv.a;
    public yuv b;
    public boolean c;
    public ymt d;
    public boolean e;
    public String f;
    private Account g;

    public final void a(int i) {
        boolean z;
        if (this.e) {
            this.b.t();
            z = true;
        } else {
            z = false;
        }
        this.c = z;
    }

    public final void g(Bundle bundle) {
        this.c = false;
        if (this.e) {
            this.b.a(this, this.f);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof ymt) {
            this.d = (ymt) activity;
            return;
        }
        throw new IllegalStateException("DeleteMomentChimeraFragment must be hosted by an activity that implements DeleteMomentCallbacks.");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.g = (Account) getArguments().getParcelable("account");
        this.b = ymb.a(this.a, getActivity().getApplicationContext(), this, this, this.g.name);
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.b.l() || this.c) {
            this.b.j();
        }
        this.b = null;
        this.c = false;
        this.e = false;
        this.f = null;
    }

    public final void onDetach() {
        super.onDetach();
        this.d = null;
    }

    public final void a(ConnectionResult connectionResult) {
        ymt ymt;
        this.c = false;
        if (this.e && (ymt = this.d) != null) {
            ymt.a(this.f, true);
        }
        this.e = false;
    }
}
