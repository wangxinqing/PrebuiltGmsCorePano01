package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;

/* renamed from: vfr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vfr extends arwm {
    final /* synthetic */ Intent a;
    final /* synthetic */ Context b;
    final /* synthetic */ NearbyMessagesChimeraService.OptInChangeBroadcastReceiver c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vfr(NearbyMessagesChimeraService.OptInChangeBroadcastReceiver optInChangeBroadcastReceiver, String str, Intent intent, Context context) {
        super(str);
        this.c = optInChangeBroadcastReceiver;
        this.a = intent;
        this.b = context;
    }

    public final void run() {
        String stringExtra = this.a.getStringExtra("EXTRA_PACKAGE_NAME");
        jjg jjg = tgc.a;
        NearbyMessagesChimeraService nearbyMessagesChimeraService = NearbyMessagesChimeraService.this;
        Object obj = NearbyMessagesChimeraService.a;
        amzy a2 = nearbyMessagesChimeraService.a(stringExtra);
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            vgh vgh = (vgh) a2.get(i);
            vgh.b.c(new vge(vgh, "onNearbyPermissionChanged"));
        }
        if (!new vgm(this.b).b(stringExtra)) {
            NearbyMessagesChimeraService.this.a(stringExtra, true);
        }
    }
}
