package defpackage;

import android.content.Context;
import android.service.trust.TrustAgentService;
import java.util.List;

/* renamed from: bjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bjr extends TrustAgentService {
    final /* synthetic */ com.google.android.chimera.TrustAgentService a;

    public bjr(com.google.android.chimera.TrustAgentService trustAgentService) {
        this.a = trustAgentService;
    }

    public final void attachBaseContext(Context context) {
        bjr.super.attachBaseContext(context);
    }

    public final boolean onConfigure(List list) {
        return this.a.onConfigure(list);
    }

    public final void onDeviceLocked() {
        this.a.onDeviceLocked();
    }

    public final void onDeviceUnlockLockout(long j) {
        this.a.onDeviceUnlockLockout(j);
    }

    public final void onDeviceUnlocked() {
        this.a.onDeviceUnlocked();
    }

    public final void onTrustTimeout() {
        this.a.onTrustTimeout();
    }

    public final void onUnlockAttempt(boolean z) {
        this.a.onUnlockAttempt(z);
    }
}
