package com.google.android.gms.people.service;

import android.content.Context;
import android.util.Log;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BackupAndSyncOptInValidationChimeraService extends qwf {
    private xvm a;

    public static void b(Context context) {
        if (ayrn.d()) {
            wss a2 = wss.a(context);
            long b = ayrn.b();
            boolean f = ayrn.f();
            boolean g = ayrn.g();
            boolean e = ayrn.e();
            boolean h = ayrn.h();
            long c = ayrn.c();
            if (!a2.a.getBoolean("backup_and_sync_opt_in_validator_enabled", false) || a2.a.getLong("backup_and_sync_opt_in_validator_periodic_interval_seconds", 0) != b || a2.a.getBoolean("backup_and_sync_opt_in_validator_requires_charging", false) != f || a2.a.getBoolean("backup_and_sync_opt_in_validator_requires_device_idle", false) != g || a2.a.getBoolean("backup_and_sync_opt_in_validator_persisted", false) != e || a2.a.getBoolean("backup_and_sync_opt_in_validator_use_flex", false) != h || (h && a2.a.getLong("backup_and_sync_opt_in_validator_flex_seconds", 0) != c)) {
                Log.i("BackupAndSyncValidation", "Flags changed. Will re-scheduling the service.");
                a(context);
                return;
            }
            return;
        }
        c(context);
    }

    public final void onCreate() {
        super.onCreate();
        xvm a2 = xvm.a((Context) this);
        if (this.a == null) {
            this.a = a2;
        }
    }

    public static void a(Context context) {
        int i;
        Log.i("BackupAndSyncValidation", "Scheduling the service.");
        qxi qxi = new qxi();
        qxi.i = "com.google.android.gms.people.service.BackupAndSyncOptInValidationService";
        qxi.k = "BackupAndSyncOptInValidationPeriodicTask";
        qxi.a(2);
        boolean f = ayrn.f();
        if (axcc.b() || ayrn.f()) {
            i = 1;
        } else {
            i = 0;
        }
        qxi.a(f ? 1 : 0, i);
        qxi.a(ayrn.g());
        qxi.b(1);
        qxi.n = ayrn.e();
        long b = ayrn.b();
        if (axcc.h()) {
            qxi.a(qxe.a(b));
        } else {
            qxi.a = b;
            if (ayrn.h()) {
                qxi.b = ayrn.c();
            }
        }
        wss.a(context).b(ayrn.d(), ayrn.b(), ayrn.f(), ayrn.g(), ayrn.e(), ayrn.h(), ayrn.c());
        try {
            qwq.a(context).a((qxx) qxi.b());
        } catch (IllegalArgumentException e) {
            Log.e("BackupAndSyncValidation", "Error when scheduling the service.", e);
        }
    }

    public static void c(Context context) {
        Log.i("BackupAndSyncValidation", "Canceling the service.");
        wss.a(context).b(ayrn.d(), ayrn.b(), ayrn.f(), ayrn.g(), ayrn.e(), ayrn.h(), ayrn.c());
        try {
            qwq.a(context).a("com.google.android.gms.people.service.BackupAndSyncOptInValidationService");
        } catch (IllegalArgumentException e) {
            Log.e("BackupAndSyncValidation", "Error when canceling the service.", e);
        }
    }

    public final int a(qxz qxz) {
        int i = 2;
        if (ayrn.d()) {
            if ("BackupAndSyncOptInValidationPeriodicTask".equals(qxz.a)) {
                this.a.e();
                i = 0;
            } else {
                Log.e("BackupAndSyncValidation", "Unknown tag received. Will not run");
            }
        }
        b(this);
        return i;
    }
}
