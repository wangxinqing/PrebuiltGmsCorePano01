package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: yne  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yne extends Fragment implements ica, icb {
    public yui a = yuv.a;
    public yuv b;
    public boolean c;
    public boolean d;
    public yxi e;
    public boolean f;
    public ConnectionResult g;
    public boolean h;
    private Account i;
    private ynd j;

    public final void a(int i2) {
        boolean z;
        if (this.d) {
            this.b.t();
            z = true;
        } else {
            z = false;
        }
        this.c = z;
    }

    public final void b(ConnectionResult connectionResult) {
        ynd ynd;
        this.g = connectionResult;
        this.h = true;
        if (this.d && (ynd = this.j) != null) {
            boolean z = !ynd.a(connectionResult, this.e);
            this.h = z;
            if (!z) {
                this.d = false;
            }
        }
    }

    public final void g(Bundle bundle) {
        String str;
        this.c = false;
        if (this.d) {
            yuv yuv = this.b;
            String h2 = this.e.h();
            String c2 = this.e.c();
            boolean z = this.f;
            if (this.e.d() != null) {
                str = this.e.d().packageName;
            } else {
                str = null;
            }
            yuv.a(this, h2, c2, z, str);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof ynd) {
            this.j = (ynd) activity;
            return;
        }
        throw new IllegalStateException("DisconnectSourceChimeraFragment must be hosted by an activity that implements DisconnectSourceCallbacks.");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.i = (Account) getArguments().getParcelable("account");
        this.b = ymb.b(this.a, getActivity().getApplicationContext(), this, this, this.i.name);
        this.h = false;
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.b.l() || this.c) {
            this.b.j();
        }
        this.b = null;
        this.c = false;
        this.d = false;
        this.e = null;
    }

    public final void onDetach() {
        super.onDetach();
        this.j = null;
    }

    public final void a(ConnectionResult connectionResult) {
        ynd ynd;
        this.c = false;
        this.g = connectionResult;
        this.h = true;
        if (this.d && (ynd = this.j) != null) {
            boolean z = !ynd.a(connectionResult, this.e);
            this.h = z;
            if (!z) {
                this.d = false;
            }
        }
    }
}
