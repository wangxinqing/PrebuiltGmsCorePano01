package com.google.android.gms.mdm.services;

import android.app.admin.DevicePolicyManager;
import android.content.Intent;
import android.location.Location;
import android.os.BatteryManager;
import android.os.Build;
import com.android.volley.Response;
import com.google.android.gms.R;
import java.util.Collection;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocateChimeraService extends smt {
    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        intent.getStringExtra("echo_server_token");
        intent.getBooleanExtra("includeBatteryStatus", false);
        Boolean valueOf = Boolean.valueOf(intent.getBooleanExtra("includeConnectivityStatus", false));
        long longExtra = intent.getLongExtra("timeout", 60000);
        valueOf.booleanValue();
        if (!snm.a(this)) {
            super.a(avuj.LOCATION_DISABLED_IN_SYSTEM);
        } else if (!jjm.a(this)) {
            super.a(avuj.LOCATION_DISABLED_IN_GOOGLE_SETTINGS);
        } else if (((Boolean) smo.e.a()).booleanValue()) {
            this.b = new Semaphore(0);
            this.d = false;
            this.e.f().a((acvp) new sms(this));
            try {
                this.b.tryAcquire(longExtra, TimeUnit.MILLISECONDS);
                if (!this.d) {
                    super.a(avuj.LOCATION_TIME_OUT);
                } else if (azfn.a.a().a()) {
                    a(getString(b()), getString(c()), "mdm.notification_location", false);
                }
                a();
                int i = crc.a;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                a();
            }
        } else {
            super.a(avuj.LOCATION_DISABLED_IN_CONSOLE);
        }
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return R.string.mdm_location_notification_title;
    }

    /* access modifiers changed from: protected */
    public final int c() {
        return R.string.mdm_location_notification_text;
    }

    /* access modifiers changed from: protected */
    public final int d() {
        return R.string.mdm_locating_notification_title;
    }

    /* access modifiers changed from: protected */
    public final int e() {
        return R.string.mdm_locating_notification_text;
    }

    /* access modifiers changed from: protected */
    public final int f() {
        return R.drawable.mdm_ic_notification;
    }

    /* access modifiers changed from: protected */
    public final int g() {
        return R.color.mdm_accent_color;
    }

    /* access modifiers changed from: protected */
    public final void a(avuj avuj, Location location, Response.Listener listener, Response.ErrorListener errorListener) {
        boolean z;
        avtx avtx;
        avuj avuj2 = avuj;
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) getSystemService("device_policy");
        Collection<snk> values = snl.a().a.values();
        if (avuj2 == avuj.USER_NOT_PRIVILEGED || avuj2 == avuj.LOCATION_DISABLED_IN_CONSOLE) {
            z = true;
        } else {
            z = false;
        }
        if (values != null) {
            for (snk snk : values) {
                avuj[] avujArr = {avuj2};
                if (!snk.b()) {
                    avtx = null;
                } else if (!z) {
                    int i = Build.VERSION.SDK_INT;
                    BatteryManager batteryManager = (BatteryManager) getSystemService("batterymanager");
                    avtx = sni.a(this);
                } else {
                    avtx = null;
                }
                smh.a(avujArr, location, avtx, !snk.c() ? null : !z ? snh.c(this) : null, snk.a(), snb.a(devicePolicyManager), snh.a(this), snh.a(), listener, errorListener);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(je jeVar) {
        jeVar.c();
    }
}
