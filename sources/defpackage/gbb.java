package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: gbb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gbb implements gaz {
    public gbc a;
    public final gaw b;
    private final mdl c;
    private final hol d;

    public gbb(mdl mdl, gaw gaw, hol hol) {
        this.c = mdl;
        this.b = gaw;
        this.d = hol;
    }

    public final void a(gay gay) {
        Log.i("AuthZeroTouch", "Launching ZT flow.");
        if (!axfl.b()) {
            gay.a((Intent) null);
        } else if (axfl.d()) {
            if (!axfl.a.a().a()) {
                mdp mdp = (mdp) this.c;
                jnh jnh = new jnh(mdp.a);
                DevicePolicyManager devicePolicyManager = (DevicePolicyManager) mdp.a.getSystemService("device_policy");
                if (!jkr.g() || jnh.d("com.google.android.feature.ZERO_TOUCH") || devicePolicyManager.isDeviceProvisioned()) {
                    Log.i("AuthZeroTouch", "Device conditions not met.");
                    gay.a((Intent) null);
                    return;
                }
            }
            if (this.d != null) {
                aucd o = baqi.g.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                baqi baqi = (baqi) o.b;
                baqi.b = 1;
                int i = baqi.a | 1;
                baqi.a = i;
                baqi.c = 1;
                int i2 = i | 2;
                baqi.a = i2;
                baqi.d = 1;
                baqi.a = i2 | 4;
                aucd o2 = baqj.c.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                baqj baqj = (baqj) o2.b;
                baqj.b = 2;
                baqj.a |= 1;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                baqi baqi2 = (baqi) o.b;
                baqj baqj2 = (baqj) o2.i();
                baqj2.getClass();
                baqi2.e = baqj2;
                baqi2.a |= 16;
                this.d.a(((baqi) o.i()).k()).b();
            }
            gbc gbc = new gbc(this.c, gay, this.b, this.d);
            this.a = gbc;
            gaw gaw = this.b;
            ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
            featureRequest.requestFeatureAtAnyVersion(mdh.a.a);
            featureRequest.setUrgent(gbc);
            if (gaw.a.requestFeatures(featureRequest)) {
                Log.i("AuthZeroTouch", "Module request succeeded.");
                try {
                    new ScheduledThreadPoolExecutor(1).schedule(new gba(this), axfl.a.a().c(), TimeUnit.SECONDS);
                } catch (RejectedExecutionException e) {
                    this.a.onRequestComplete(-2);
                }
            } else {
                Log.i("AuthZeroTouch", "Module request failed.");
                gay.a((Intent) null);
            }
        } else {
            Log.i("AuthZeroTouch", "ZT config not present.");
            gay.a((Intent) null);
        }
    }
}
