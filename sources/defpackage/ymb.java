package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.apps.ListAppsChimeraActivity;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ymb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ymb extends Fragment implements LoaderManager.LoaderCallbacks, ynk, icb, ica {
    public Account a;
    public int b;
    public int c = 1;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public List f;
    public final HashSet g = new HashSet();
    public ynl h;
    public ylt i;
    public final Map j = new HashMap();
    public icf k;
    public icc l;
    private String m;
    private String n;
    private String o;
    private boolean p;

    public static yuv a(yui yui, Context context, ica ica, icb icb, String str) {
        return a(yui, context, ica, icb, str, new String[]{"service_googleme"});
    }

    public static String b(Context context) {
        String[] a2 = a(context);
        if (r1 == 0) {
            return null;
        }
        String string = context.getSharedPreferences("com.google.android.gms.plus.apps.AppsUtilFragment", 0).getString("prefs_account_name", (String) null);
        if (string == null) {
            return a2[0];
        }
        for (String equals : a2) {
            if (string.equals(equals)) {
                return string;
            }
        }
        return a2[0];
    }

    private final icc c(String str) {
        ibz ibz = new ibz(getActivity());
        ibz.a(ndc.a);
        ibz.a(str);
        ibz.a((ica) this);
        ibz.a((icb) this);
        return ibz.b();
    }

    private static final boolean c(int i2) {
        return (i2 == 0 || i2 == 1 || i2 == 4) ? false : true;
    }

    private final void d() {
        this.l.e();
    }

    private final void e() {
        int i2 = Build.VERSION.SDK_INT;
        icf icf = this.k;
        if (icf != null) {
            icf.b();
        }
        ibq ibq = ndc.a;
        icc icc = this.l;
        idf a2 = icc.a((idf) new neo(icc));
        this.k = a2;
        a2.a((icm) new ylw(this));
    }

    private final void f() {
        this.d.clear();
        this.n = null;
    }

    public final void g(Bundle bundle) {
        String str = this.o;
        if (str != null) {
            a(str);
            this.o = null;
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        ynl a2 = ynl.a((Context) activity);
        this.h = a2;
        a2.a((ynk) this);
        this.i = ylt.a((Context) activity);
        if (this.c == 1) {
            getLoaderManager().initLoader(10, (Bundle) null, this);
            e();
        }
        this.b = -2;
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1) {
            a();
        }
    }

    public final void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        if (bundle != null) {
            this.p = bundle.getBoolean("is_in_resolution", false);
        }
        String string = getArguments().getString("account_name");
        if (string != null) {
            d(string);
        } else {
            string = b((Context) getActivity());
            if (string == null) {
                return;
            }
        }
        this.l = c(string);
        this.a = new Account(string, "com.google");
        this.m = getArguments().getString("calling_package_name");
        if (bundle != null) {
            this.e.clear();
            this.e.addAll(bundle.getStringArrayList("disconnected_apps"));
        }
        if (this.a != null && (bundle == null || !bundle.getBoolean("has_error"))) {
            ymx.a();
            if (!ymx.b(getActivity(), 1)) {
                return;
            }
        }
        if (this.a == null) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        b(i2);
    }

    public final /* bridge */ /* synthetic */ Loader onCreateLoader(int i2, Bundle bundle) {
        if (i2 == 10) {
            return new yte(getActivity(), this.a, ((Integer) ysu.y.c()).intValue(), this.n);
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Unknown loader ID: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void onDetach() {
        super.onDetach();
        ynl ynl = this.h;
        if (ynl != null) {
            ynl.b(this);
        }
        getLoaderManager().destroyLoader(10);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        yxj yxj = (yxj) obj;
        if (loader.getId() == 10) {
            yte yte = (yte) loader;
            ConnectionResult connectionResult = yte.a;
            if (yxj == null || connectionResult == null || !connectionResult.b()) {
                f();
                b(3);
                getLoaderManager().destroyLoader(10);
                if (connectionResult != null && connectionResult.a()) {
                    ListAppsChimeraActivity listAppsChimeraActivity = (ListAppsChimeraActivity) getActivity();
                    return;
                }
                return;
            }
            if (((Boolean) ysu.q.c()).booleanValue()) {
                f();
            }
            int a2 = yxj.a();
            for (int i2 = 0; i2 < a2; i2++) {
                this.d.add(ApplicationEntity.a(yxj.a(i2)));
            }
            String str = yte.b;
            this.n = str;
            if (str != null) {
                getLoaderManager().restartLoader(10, (Bundle) null, this);
            } else {
                b();
            }
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final void onPause() {
        super.onPause();
        icf icf = this.k;
        if (icf != null) {
            icf.b();
            this.k = null;
            this.f = null;
        }
    }

    public final void onResume() {
        super.onResume();
        if (c(this.c) && this.b == -1) {
            c();
        }
        this.b = -2;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("is_in_resolution", this.p);
        bundle.putBoolean("has_error", c(this.c));
        bundle.putStringArrayList("disconnected_apps", this.e);
    }

    public final void onStart() {
        super.onStart();
        d();
    }

    private static yuv a(yui yui, Context context, ica ica, icb icb, String str, String[] strArr) {
        ywh ywh = new ywh(context);
        ywh.a = str;
        ywh.a("https://www.googleapis.com/auth/plus.applications.manage", "https://www.googleapis.com/auth/grants.audit", "https://www.googleapis.com/auth/plus.circles.read", "https://www.googleapis.com/auth/plus.me");
        ywh.d = strArr;
        ywh.e = String.valueOf(auuv.GOOGLE_SETTINGS.iZ);
        return yui.a(context, ywh.a(), ica, icb);
    }

    private final void d(String str) {
        SharedPreferences.Editor edit = getActivity().getSharedPreferences("com.google.android.gms.plus.apps.AppsUtilFragment", 0).edit();
        edit.putString("prefs_account_name", str);
        edit.apply();
    }

    public final void c() {
        ymx.a();
        if (!ymx.b(getActivity(), 1)) {
            f();
            b(1);
            getLoaderManager().restartLoader(10, (Bundle) null, this);
            e();
        }
    }

    public static yuv b(yui yui, Context context, ica ica, icb icb, String str) {
        return a(yui, context, ica, icb, str, new String[0]);
    }

    static String[] a(Context context) {
        return jgu.a(jgu.d(context, context.getPackageName()));
    }

    public final void b() {
        int i2 = this.c;
        if (i2 == 1) {
            b(4);
        } else if (i2 == 4) {
            b(0);
        }
    }

    public final void b(int i2) {
        this.c = i2;
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((ylz) it.next()).a();
        }
    }

    public final void a() {
        this.p = false;
        if (!this.l.j()) {
            d();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
        izr.a((Context) getActivity(), this.a.name, (String) null, favaDiagnosticsEntity, favaDiagnosticsEntity2, this.m);
    }

    public final void a(int i2) {
        a();
    }

    public final void a(ConnectionResult connectionResult) {
        Activity activity = getActivity();
        if (activity != null) {
            b(3);
            if (!connectionResult.a()) {
                hxy.a(connectionResult.c, activity.getContainerActivity(), 0, new ylu(this)).show();
            } else if (!this.p) {
                this.p = true;
                try {
                    connectionResult.a(activity.getContainerActivity());
                } catch (IntentSender.SendIntentException e2) {
                    a();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        d(str);
        this.a = new Account(str, "com.google");
        this.l.g();
        this.l = c(str);
        d();
        c();
    }

    public final void a(FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
        izr.a(getActivity(), this.a.name, favaDiagnosticsEntity, favaDiagnosticsEntity2, this.m);
    }

    public final void a(String str) {
        if (!this.l.i()) {
            if (!this.l.j()) {
                d();
            }
            this.o = str;
            return;
        }
        this.o = null;
        ibq ibq = ndc.a;
        icc icc = this.l;
        icc.b((idf) new nen(icc, str)).a((icm) new yly(this));
    }

    public final void a(yxi yxi, Drawable drawable) {
        this.i.a(yxi, drawable);
        List<yma> list = (List) this.j.get(yxi);
        if (list != null) {
            for (yma a2 : list) {
                a2.a();
            }
            this.j.remove(yxi);
        }
    }
}
