package defpackage;

import android.os.Bundle;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: ubf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ubf extends arwm {
    final /* synthetic */ Bundle a;
    final /* synthetic */ DiscoveryChimeraService b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ubf(DiscoveryChimeraService discoveryChimeraService, String str, Bundle bundle) {
        super(str);
        this.b = discoveryChimeraService;
        this.a = bundle;
    }

    public final void run() {
        this.b.i.a(this.a.getBoolean("com.google.android.gms.nearby.discovery:EXTRA_MASTER_SWITCH_ENABLED") ? asom.NOTIFICATION_MASTER_SWITCH_ENABLED : asom.NOTIFICATION_MASTER_SWITCH_DISABLED);
    }
}
