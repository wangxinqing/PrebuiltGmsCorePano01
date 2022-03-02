package com.google.android.gms.drive.api;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ApiChimeraService extends nio {
    private static final ith a = new ith("ApiChimeraService", "");
    private kee b;
    private ktm k;
    private kdb l;
    private lfr m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApiChimeraService() {
        super(new int[]{11}, new String[]{"com.google.android.gms.drive.ApiService.START", "com.google.android.gms.drive.ApiService.STOP", "com.google.android.gms.drive.ApiService.RESET_AFTER_BOOT"}, (Set) anfv.a, 3, 9);
        int i = Build.VERSION.SDK_INT;
    }

    public static void a(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.drive.api.ApiService");
        intent.setAction("com.google.android.gms.drive.ApiService.STOP");
        context.startService(intent);
    }

    public static void b(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.drive.api.ApiService");
        context.startService(intent);
    }

    public static void c(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.drive.api.ApiService");
        intent.setAction("com.google.android.gms.drive.ApiService.RESET_AFTER_BOOT");
        PendingIntent service = PendingIntent.getService(context, 0, intent, 0);
        new jbs(context).a("ApiService", 2, ((Long) jzq.au.c()).longValue(), service, "com.google.android.gms");
    }

    public final IBinder onBind(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("com.google.android.gms.drive.ApiService.RESET_AFTER_BOOT".equals(action)) {
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ktm ktm = this.k;
                kkf kkf = ktm.b;
                ((kjp) kkf).a.a(kpn.a, kpm.LAST_UPDATE_TIME.i.a(currentTimeMillis - elapsedRealtime));
                ktm.a();
            }
            if (("com.google.android.gms.drive.ApiService.STOP".equals(action) || "com.google.android.gms.drive.ApiService.RESET_AFTER_BOOT".equals(action)) && !this.l.e()) {
                return null;
            }
        }
        return super.onBind(intent);
    }

    public final void onCreate() {
        jzk.a(this);
        lsm a2 = lsm.a();
        this.b = new kee(a2.m, a2.e);
        this.l = a2.f;
        this.k = a2.l;
        jiq jiq = a2.F;
        this.m = a2.x;
    }

    public final void onDestroy() {
        if (ldn.a()) {
            ldn.c().d();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        GetServiceRequest getServiceRequest2 = getServiceRequest;
        String string = getServiceRequest2.g.getString("proxy_package_name");
        int i = getServiceRequest2.g.getInt("proxy_type", 0);
        boolean z = getServiceRequest2.g.getBoolean("bypass_initial_sync", false);
        String string2 = getServiceRequest2.g.getString("method_trace_filename");
        lfq c = this.m.c();
        c.i();
        c.c(4, 44);
        try {
            nix nix = new nix(this, this.e, this.f);
            kfk kfk = r1;
            kfk kfk2 = new kfk(this, nix, this.b, Binder.getCallingUid(), getServiceRequest2.d, string, getServiceRequest2.h, getServiceRequest.a(), jkx.a(getServiceRequest2.f), nit, getServiceRequest2.c, c, i, z, string2);
            nix.a(kfk);
        } catch (kfj e) {
            a.c("ApiChimeraService", "Connection failed", e);
        }
    }
}
