package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.internal.PlusSession;
import com.google.android.gms.plus.model.posts.Comment;

/* renamed from: zlw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zlw extends Fragment implements yun {
    public static final long a = ((Long) ysu.X.c()).longValue();
    private static final String[] j = {"https://www.googleapis.com/auth/plus.me", "https://www.googleapis.com/auth/plus.stream.write", "https://www.googleapis.com/auth/plus.settings", "https://www.googleapis.com/auth/plus.pages.manage"};
    public yuv b;
    public zlu c;
    public boolean d;
    public icc e;
    public String f;
    public boolean g;
    public Comment h;
    public zlv i;
    private yui k = yuv.a;
    private zlt l;
    private String m;

    public static zlw a(String str) {
        yui yui = yuv.a;
        Bundle bundle = new Bundle();
        bundle.putString("specified_account_name", str);
        zlw zlw = new zlw();
        zlw.k = yui;
        zlw.setArguments(bundle);
        return zlw;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            this.m = this.i.getCallingPackage();
            String a2 = zmf.a(activity, getArguments().getString("specified_account_name"), this.m, jgu.a(jgu.d(activity, this.i.getCallingPackage())));
            ywh ywh = new ywh(activity);
            ywh.c = this.m;
            ywh.a = a2;
            ywh.e = this.i.d().m;
            ywh.a(j);
            int i2 = 0;
            if (zmf.a(activity, this.i.d().f)) {
                ywh.d = new String[0];
            }
            if (this.b == null) {
                this.c = new zlu(this);
                yui yui = this.k;
                Context applicationContext = activity.getApplicationContext();
                PlusSession a3 = ywh.a();
                zlu zlu = this.c;
                yuv a4 = yui.a(applicationContext, a3, zlu, zlu);
                this.b = a4;
                a4.t();
            }
            if (this.e == null) {
                if (this.i.d().d()) {
                    try {
                        i2 = Integer.parseInt(this.i.d().m);
                    } catch (NumberFormatException e2) {
                    }
                }
                this.l = new zlt(this);
                icc a5 = this.k.a(activity, i2, this.m);
                this.e = a5;
                a5.a((ica) this.l);
                this.e.a((icb) this.l);
            }
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof zlv)) {
            String valueOf = String.valueOf(zlv.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        } else {
            this.i = (zlv) activity;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.b.l() || this.b.m()) {
            this.b.j();
        }
        this.b = null;
        if (this.e.i() || this.e.j()) {
            this.e.g();
        }
        this.e = null;
        this.f = null;
    }

    public final void onDetach() {
        super.onDetach();
        this.i = null;
    }

    public final void a(ConnectionResult connectionResult) {
        zlv zlv;
        if (this.g && (zlv = this.i) != null) {
            zlv.b(connectionResult);
        }
        this.g = false;
    }

    public final void a(FavaDiagnosticsEntity favaDiagnosticsEntity) {
        String str;
        Activity activity = getActivity();
        if (activity != null && (str = this.f) != null && this.m != null) {
            izr.a((Context) activity, str, this.i.d().b(), favaDiagnosticsEntity, iay.b, this.m);
        }
    }
}
