package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.ConnectionResult;
import java.util.Arrays;
import java.util.List;

/* renamed from: yob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yob extends Fragment implements ica, icb {
    public icc a;
    public boolean b;
    public boolean c;
    public wlg d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    public final void a() {
        this.c = true;
        ibq ibq = wlt.a;
        xcy.a(this.a, this.e, this.f, this.g, Arrays.asList(new String[]{this.h}), (List) null, ylq.a).a((icm) new yoa(this));
    }

    public final void g(Bundle bundle) {
        if (this.b) {
            this.b = false;
            a();
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof ynz)) {
            throw new IllegalStateException("Activity must implement AddToCircleFragmentHost.");
        }
    }

    public final void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        setRetainInstance(true);
        Bundle arguments = getArguments();
        this.e = arguments.getString("accountName");
        this.f = arguments.getString("plusPageId");
        this.g = arguments.getString("updatePersonId");
        this.h = arguments.getString("circleIdToAdd");
        this.i = arguments.getString("clientApplicationId");
        ibz ibz = new ibz(getActivity(), this, this);
        ibq ibq = wlt.a;
        wlr wlr = new wlr();
        if (!TextUtils.isEmpty(this.i)) {
            i2 = Integer.parseInt(this.i);
        } else {
            i2 = 0;
        }
        wlr.a = i2;
        ibz.a(ibq, (ibj) wlr.a());
        icc b2 = ibz.b();
        this.a = b2;
        b2.e();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.a.g();
    }

    public final void b() {
        ynz ynz = (ynz) getActivity();
        if (ynz != null) {
            ynz.a(this.d);
        }
    }

    public final void a(int i2) {
        if (this.b || this.c) {
            this.b = true;
            this.a.e();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        this.d = null;
        b();
    }
}
