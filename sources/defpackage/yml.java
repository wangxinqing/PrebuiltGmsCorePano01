package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Spinner;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import java.util.ArrayList;

/* renamed from: yml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yml extends yni implements ica, icb {
    static final int e = R.drawable.default_avatar;
    private static final auuv k = auuv.GOOGLE_PLAY_SERVICES;
    public ymo b;
    public ymo c;
    public int d;
    private sg f;
    private ymh[] g;
    private int h;
    private icc i;
    private int j;

    private final void a(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            try {
                this.j = 1;
                getActivity().startIntentSenderForResult(pendingIntent.getIntentSender(), 0, (Intent) null, 0, 0, 0);
            } catch (IntentSender.SendIntentException e2) {
                this.j = 2;
                this.i.e();
            }
        }
    }

    public static yml b(int i2) {
        if (i2 < 0 || i2 > 2) {
            Log.wtf("ConnectedAppsFragment", "Invalid filter type");
        }
        Bundle bundle = new Bundle();
        bundle.putInt("preselected_filter", i2);
        yml yml = new yml();
        yml.setArguments(bundle);
        return yml;
    }

    public final FavaDiagnosticsEntity c() {
        return this.g[this.h].e;
    }

    public final CharSequence d() {
        return this.g[this.h].c;
    }

    public final CharSequence e() {
        ymx.a();
        if (!ymx.b(getActivity(), 1)) {
            return this.g[this.h].d;
        }
        ymx.a();
        return ymx.a(getActivity(), 1);
    }

    public final Intent f() {
        return new Intent("android.intent.action.VIEW").setData(Uri.parse(this.g[this.h].f));
    }

    public final void g(Bundle bundle) {
        if (Log.isLoggable("ConnectedAppsFragment", 4)) {
            Log.i("ConnectedAppsFragment", "GoogleApiClient connected");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.g == null) {
            ymh[] ymhArr = new ymh[3];
            this.g = ymhArr;
            ymhArr[0] = new ymh(getString(R.string.plus_app_settings_all_apps_label), new ymg(this), R.drawable.common_settings_icon, getText(R.string.plus_list_apps_empty_message), getText(R.string.plus_list_apps_error), ial.j, (String) ysu.v.c());
            this.g[1] = new ymh(getString(R.string.plus_app_settings_sign_in_apps_label), new ymk(this), R.drawable.plus_icon_red_32, yng.a(getText(R.string.plus_list_apps_aspen_empty_message), (String) ysu.r.c()), yng.a(getText(R.string.plus_list_apps_error_aspen), (String) ysu.r.c()), ial.b, (String) ysu.s.c());
            this.g[2] = new ymh(getString(R.string.plus_app_settings_fitness_apps_label), new ymj(this), R.drawable.common_settings_icon, yng.a(getText(R.string.plus_list_apps_fitness_empty_message), (String) ysu.t.c()), yng.a(getText(R.string.plus_list_apps_error_fitness), (String) ysu.t.c()), ial.b, (String) ysu.u.c());
        }
        int i2 = getArguments().getInt("preselected_filter", -1);
        if (bundle != null) {
            this.h = bundle.getInt("connected_apps_filter");
            this.d = bundle.getInt("connected_apps_account");
            this.j = bundle.getInt("signed_in");
        } else {
            if (i2 == 1) {
                this.h = 1;
            } else if (i2 != 2) {
                this.h = 0;
            } else {
                this.h = 2;
            }
            this.d = -1;
        }
        int i3 = Build.VERSION.SDK_INT;
        ibz ibz = new ibz(getActivity());
        ibz.a((ica) this);
        ibz.a((icb) this);
        ibq ibq = wlt.a;
        wlr wlr = new wlr();
        wlr.a = k.iZ;
        ibz.a(ibq, (ibj) wlr.a());
        ibz.a(ykq.b);
        icc b2 = ibz.b();
        this.i = b2;
        b2.e();
        this.j = 2;
    }

    public final void onDetach() {
        super.onDetach();
        icc icc = this.i;
        if (icc != null) {
            icc.g();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("connected_apps_filter", this.h);
        bundle.putInt("connected_apps_account", this.d);
        bundle.putInt("signed_in", this.j);
    }

    public final void c(int i2) {
        this.h = i2;
        ynh h2 = h();
        ymh ymh = this.g[i2];
        h2.b = ymh.g;
        this.f.b(ymh.b);
        a();
    }

    public final void b(sg sgVar) {
        this.f = sgVar;
        c(this.h);
        String[] a = ymb.a((Context) getActivity());
        ArrayList arrayList = new ArrayList();
        for (String str : a) {
            ymd ymd = new ymd(str);
            arrayList.add(ymd);
            if (this.d == -1 && str.equals(this.a.a.name)) {
                this.d = arrayList.indexOf(ymd);
            }
            int i2 = Build.VERSION.SDK_INT;
            ibq ibq = wlt.a;
            xdh.b(this.i, str, 1, 0).a((icm) new ymf(ymd));
        }
        if (this.b == null) {
            ymo ymo = new ymo(sgVar.g());
            this.b = ymo;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ymo.b.add((ymd) arrayList.get(i3));
            }
            int i4 = Build.VERSION.SDK_INT;
        }
        this.b.c = this.a.a.name;
        int i5 = Build.VERSION.SDK_INT;
        if (this.c == null) {
            ymo ymo2 = new ymo(getActivity());
            this.c = ymo2;
            int i6 = 0;
            while (true) {
                ymh[] ymhArr = this.g;
                if (i6 >= ymhArr.length) {
                    break;
                }
                ymo2.a.add(new ymn(ymhArr[i6].a, i6));
                i6++;
            }
        }
        Spinner spinner = (Spinner) getActivity().findViewById(R.id.filters_spinner);
        spinner.setAdapter(this.c);
        spinner.setOnItemSelectedListener(new ymi(this));
        spinner.setSelection(this.h);
        this.c.a(this.h);
        int i7 = this.d;
        yme yme = new yme(this);
        sgVar.a((int) R.layout.common_action_bar_spinner);
        Spinner spinner2 = (Spinner) sgVar.a().findViewById(R.id.action_bar_spinner);
        spinner2.setOnItemSelectedListener(yme);
        spinner2.setAdapter(this.b);
        spinner2.setVisibility(0);
        spinner2.setSelection(i7);
    }

    public final ynh a(Context context) {
        return new ynh(context, this.a, new ymg(this));
    }

    public final void a(int i2) {
        if (Log.isLoggable("ConnectedAppsFragment", 4)) {
            Log.i("ConnectedAppsFragment", "GoogleApiClient connection suspended");
        }
        this.i.e();
    }

    public final void a(ConnectionResult connectionResult) {
        if (Log.isLoggable("ConnectedAppsFragment", 4)) {
            Log.i("ConnectedAppsFragment", "GoogleApiClient connection failed");
        }
        if (this.j == 2) {
            a(connectionResult.d);
        }
    }
}
