package com.google.android.places.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GeoDataChimeraService extends nio {
    public iso a;
    public akib b;
    private final aoru k;
    private akhq l;
    private akvn m;
    private BroadcastReceiver n;

    public GeoDataChimeraService() {
        super(65, "com.google.android.gms.location.places.GeoDataApi", Collections.singleton("android.permission-group.LOCATION"), 3, 10);
        ThreadPoolExecutor.DiscardPolicy discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        aoru a2 = jfm.a(10);
        this.k = a2;
        if (a2 instanceof jfz) {
            ((jfz) a2).setRejectedExecutionHandler(discardPolicy);
        }
    }

    public final void a() {
        this.l.a(System.currentTimeMillis());
        this.a.a();
        SharedPreferences.Editor edit = super.getSharedPreferences("GEO_DATA_SERVICE_STORE", 0).edit();
        edit.putString("LOCALE", Locale.getDefault().toString());
        edit.commit();
    }

    public final akhq b() {
        this.l.b(System.currentTimeMillis());
        return this.l;
    }

    public final void onCreate() {
        this.a = new iso(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, 1, 1, TimeUnit.HOURS);
        if (!azci.a.a().g()) {
            this.l = new akht();
        } else if (azci.a.a().c()) {
            this.l = new akhr(this, "geo");
        } else {
            this.l = new akhs();
        }
        String string = super.getSharedPreferences("GEO_DATA_SERVICE_STORE", 0).getString("LOCALE", (String) null);
        if (string == null || !Locale.getDefault().toString().equals(string)) {
            a();
        }
        AnonymousClass1 r0 = new nla("places") {
            public final void a(Context context, Intent intent) {
                if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
                    GeoDataChimeraService.this.a();
                }
            }
        };
        this.n = r0;
        super.registerReceiver(r0, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
        this.m = new akvn(1);
        this.b = new akib(ihs.b().getRequestQueue(), super.getFilesDir());
    }

    public final void onDestroy() {
        super.unregisterReceiver(this.n);
        this.l.a();
        this.k.shutdown();
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        nit.a(new akuz(this, new nix(this, this.e, this.f), this, getServiceRequest.d, this.m, this.k));
    }
}
