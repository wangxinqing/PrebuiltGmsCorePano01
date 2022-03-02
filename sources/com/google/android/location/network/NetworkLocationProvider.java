package com.google.android.location.network;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.WorkSource;
import com.android.location.provider.LocationProviderBase;
import com.android.location.provider.ProviderPropertiesUnbundled;
import com.android.location.provider.ProviderRequestUnbundled;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NetworkLocationProvider extends LocationProviderBase {
    private static final ProviderPropertiesUnbundled k = ProviderPropertiesUnbundled.create(false, false, false, false, true, true, true, 1, 2);
    public final Context a;
    public final Handler b;
    public final rns c;
    public final ajqi d;
    public final ajqf e = new ajqf();
    public final rnr f;
    public final rng g;
    public boolean h = false;
    public ProviderRequestUnbundled i = null;
    public WorkSource j = null;
    private long l = Long.MAX_VALUE;

    public NetworkLocationProvider(Context context) {
        super("NLP", k);
        this.a = context;
        this.b = new qvr(Looper.getMainLooper());
        this.c = rns.f(context);
        this.d = new ajqi(context, new aisu(this), this.b.getLooper());
        this.f = new aisv(this);
        this.g = new aisw(this);
    }

    public final void a() {
        a(rns.a(this.a));
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086 A[SYNTHETIC, Splitter:B:25:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(boolean r17) {
        /*
            r16 = this;
            r1 = r16
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r2 = r1.b
            android.os.Looper r2 = r2.getLooper()
            r3 = 1
            r4 = 0
            if (r0 != r2) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            defpackage.amrl.b(r0)
            com.android.location.provider.ProviderRequestUnbundled r0 = r1.i
            if (r0 == 0) goto L_0x009c
            long r5 = r0.getInterval()
            long r7 = r1.l
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            r1.l = r5
            r7 = 20000(0x4e20, double:9.8813E-320)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0031
            r5 = r7
            goto L_0x0032
        L_0x0031:
        L_0x0032:
            boolean r2 = r1.h
            if (r2 == 0) goto L_0x0040
            long r7 = defpackage.axxj.c()
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0040
            r12 = r7
            goto L_0x0042
        L_0x0040:
            r12 = r5
        L_0x0042:
            if (r17 == 0) goto L_0x004d
            ajqf r2 = r1.e
            boolean r0 = r2.a(r12, r0)
            if (r0 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            android.content.Context r0 = r1.a
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.ComponentName r5 = new android.content.ComponentName
            java.lang.String r6 = "com.google.android.location.network.NetworkLocationService"
            r5.<init>(r0, r6)
            r2.setComponent(r5)
            r5 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r2 = android.app.PendingIntent.getService(r0, r4, r2, r5)
            atir r4 = new atir
            android.content.Context r0 = r1.a
            java.lang.String r0 = r0.getPackageName()
            r4.<init>(r0)
            r4.c((boolean) r3)
            java.lang.String r15 = "NetworkLocationProvider"
            r9 = r4
            r10 = r12
            r14 = r2
            r9.a(r10, r12, r14, r15)
            android.os.WorkSource r0 = r1.j
            r4.a((android.os.WorkSource) r0)
            boolean r0 = defpackage.jkr.h()
            if (r0 == 0) goto L_0x0091
            com.android.location.provider.ProviderRequestUnbundled r0 = r1.i     // Catch:{ NoSuchMethodError -> 0x0090 }
            boolean r0 = r0.isLocationSettingsIgnored()     // Catch:{ NoSuchMethodError -> 0x0090 }
            r4.b((boolean) r0)     // Catch:{ NoSuchMethodError -> 0x0090 }
            goto L_0x0091
        L_0x0090:
            r0 = move-exception
        L_0x0091:
            android.content.Context r0 = r1.a
            android.content.ComponentName r0 = r4.a((android.content.Context) r0)
            if (r0 != 0) goto L_0x009c
            r2.cancel()
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.location.network.NetworkLocationProvider.b(boolean):void");
    }

    public final void onDisable() {
    }

    public final void onEnable() {
        if (Build.VERSION.SDK_INT == 28) {
            this.b.post(new aisy(this));
        }
    }

    public final int onGetStatus(Bundle bundle) {
        return 2;
    }

    public final long onGetStatusUpdateTime() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void onInit() {
        this.b.post(new aisx(this));
    }

    public final void onSetRequest(ProviderRequestUnbundled providerRequestUnbundled, WorkSource workSource) {
        this.b.post(new aisz(this, providerRequestUnbundled, workSource));
    }

    public final void setEnabled(boolean z) {
        if (jkr.h()) {
            try {
                NetworkLocationProvider.super.setEnabled(z);
                return;
            } catch (NoSuchMethodError e2) {
            }
        }
        if (!z) {
            rns.a(this.a, "network", false, rnu.a);
        } else if (Build.VERSION.SDK_INT == 28 && rns.b(this.a)) {
            rns.a(this.a, "network", true, rnu.a);
        }
    }

    public final void a(int i2) {
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        if (i2 != 2) {
            z = i2 == 3;
        } else {
            z = true;
        }
        amrl.a(z);
        if (!hxy.d(this.a) && !jkb.a(this.a).d()) {
            if (!jjm.c(this.a) || jjm.a(this.a)) {
                z2 = false;
            }
            int i3 = Build.VERSION.SDK_INT;
            Bundle applicationRestrictions = ((RestrictionsManager) this.a.getSystemService("restrictions")).getApplicationRestrictions();
            if (applicationRestrictions != null) {
                z3 = applicationRestrictions.getBoolean("suppressLocationDialog", false);
            }
            if (!rns.a(this.a) && !z3) {
                int i4 = Build.VERSION.SDK_INT;
                Context context = this.a;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, "com.google.android.location.network.NetworkConsentActivity"));
                intent.putExtra("confirmLgaayl", z2);
                intent.putExtra("newMode", i2);
                intent.setFlags(268435456);
                this.a.startActivity(intent);
            } else if (z2) {
                Intent intent2 = new Intent("com.google.android.gsf.GOOGLE_LOCATION_SETTINGS");
                intent2.setFlags(268435456);
                this.a.startActivity(intent2);
            }
        }
    }

    public final void a(boolean z) {
        amrl.b(Looper.myLooper() == this.b.getLooper());
        setEnabled(z);
    }
}
