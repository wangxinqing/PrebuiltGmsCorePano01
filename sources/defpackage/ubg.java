package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: ubg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ubg extends arwm {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Intent b;
    final /* synthetic */ DiscoveryChimeraService c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ubg(DiscoveryChimeraService discoveryChimeraService, String str, Bundle bundle, Intent intent) {
        super(str);
        this.c = discoveryChimeraService;
        this.a = bundle;
        this.b = intent;
    }

    public final void run() {
        this.c.i.a(this.a.getBoolean("com.google.android.gms.nearby.discovery:EXTRA_CATEGORY_SWITCH_ENABLED") ? this.b.getAction().equals("com.google.android.gms.nearby.discovery:ACTION_SET_DEVICE_SETTINGS") ? asom.DEVICE_NOTIFICATION_SETTINGS_ENABLED : asom.NOTIFICATION_SETTINGS_ENABLED : this.b.getAction().equals("com.google.android.gms.nearby.discovery:ACTION_SET_DEVICE_SETTINGS") ? asom.DEVICE_NOTIFICATION_SETTINGS_DISABLED : asom.NOTIFICATION_SETTINGS_DISABLED);
        this.c.d.a();
    }
}
