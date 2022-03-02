package com.google.android.gms.icing.service;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class IndexWorkerChimeraService extends Service {
    static final long a = TimeUnit.MINUTES.toMillis(10);
    public prm b;

    public final osf a() {
        iva.a((Object) this.b);
        return this.b.b();
    }

    public final qwq b() {
        return qwq.a(a().b);
    }

    public final SharedPreferences c() {
        iva.a();
        return getSharedPreferences("IndexWorkerChimeraService_preferences", 0);
    }

    public final IBinder onBind(Intent intent) {
        oso.a("%s: Binding with intent %s", (Object) "main", (Object) intent);
        return null;
    }

    public final void onCreate() {
        oso.a("%s: IndexWorkerService onCreate", (Object) "main");
        if (axsd.f()) {
            this.b = prm.a("main", getApplicationContext());
        }
        super.onCreate();
    }

    public final void onDestroy() {
        oso.a("%s: IndexWorkerService onDestroy", (Object) "main");
        prm prm = this.b;
        if (prm != null) {
            prm.a();
        }
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        oso.a("%s: IndexWorkerService: onStartCommand with %s", (Object) "main", (Object) intent);
        if (this.b == null) {
            oso.a("IndexWorkerService is unavailable on this device");
            return 2;
        } else if (intent != null && "com.google.android.gms.icing.START_STICKY".equals(intent.getAction())) {
            return 1;
        } else {
            this.b.c.d(new prd(this, aonk.INDEX_WORKER, intent));
            return 2;
        }
    }

    public final boolean onUnbind(Intent intent) {
        oso.a("%s: Unbind", (Object) "main");
        return false;
    }

    public final void a(String str) {
        qxj a2 = osp.a("maintenance", TimeUnit.MILLISECONDS.toSeconds(((Long) ozx.a.c()).longValue()), TimeUnit.MILLISECONDS.toSeconds(a), 2, true);
        oso.b("Scheduling maintenance at %s period=%ds flex=%ds reason=%s", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()), Long.valueOf(a2.a), Long.valueOf(a2.b), str);
        b().a((qxx) a2);
        c().edit().putBoolean("maintenance_scheduled", true).apply();
    }
}
