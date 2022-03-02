package com.google.android.chimera;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.util.List;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class TrustAgentService extends Service {
    public static final int FLAG_GRANT_TRUST_DISMISS_KEYGUARD = 2;
    public static final int FLAG_GRANT_TRUST_INITIATED_BY_USER = 1;
    public static final String SERVICE_INTERFACE = "android.service.trust.TrustAgentService";
    public static final String TRUST_AGENT_META_DATA = "android.service.trust.trustagent";
    private bjr a;

    public final void grantTrust(CharSequence charSequence, long j, int i) {
        this.a.grantTrust(charSequence, j, i);
    }

    public final IBinder onBind(Intent intent) {
        return this.a.onBind(intent);
    }

    public boolean onConfigure(List list) {
        return false;
    }

    public void onCreate() {
        super.onCreate();
        ComponentName componentName = new ComponentName(this, getContainerService().getClass());
        try {
            if (!"android.permission.BIND_TRUST_AGENT".equals(getPackageManager().getServiceInfo(componentName, 0).permission)) {
                String flattenToShortString = componentName.flattenToShortString();
                StringBuilder sb = new StringBuilder(String.valueOf(flattenToShortString).length() + 74);
                sb.append(flattenToShortString);
                sb.append(" is not declared with the permission \"");
                sb.append("android.permission.BIND_TRUST_AGENT");
                sb.append("\"");
                throw new IllegalStateException(sb.toString());
            }
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(componentName.toShortString());
            Log.e("TrustAgentService", valueOf.length() == 0 ? new String("Can't get ServiceInfo for ") : "Can't get ServiceInfo for ".concat(valueOf));
        }
    }

    public void onDeviceLocked() {
    }

    public void onDeviceUnlockLockout(long j) {
    }

    public void onDeviceUnlocked() {
    }

    public void onRebind(Intent intent) {
        this.a.onRebind(intent);
    }

    public void onTrustTimeout() {
    }

    public boolean onUnbind(Intent intent) {
        return this.a.onUnbind(intent);
    }

    public void onUnlockAttempt(boolean z) {
    }

    public final void revokeTrust() {
        this.a.revokeTrust();
    }

    public final void setManagingTrust(boolean z) {
        this.a.setManagingTrust(z);
    }

    public void setProxy(Service service, Context context) {
        super.setProxy(service, context);
        bjr bjr = new bjr(this);
        this.a = bjr;
        bjr.attachBaseContext(context);
    }

    public final void grantTrust(CharSequence charSequence, long j, boolean z) {
        this.a.grantTrust(charSequence, j, z);
    }
}
