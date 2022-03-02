package defpackage;

import android.content.Intent;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: ubl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ubl extends arwm {
    final /* synthetic */ Intent a;
    final /* synthetic */ DiscoveryChimeraService.IntentReceiver b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ubl(DiscoveryChimeraService.IntentReceiver intentReceiver, String str, Intent intent) {
        super(str);
        this.b = intentReceiver;
        this.a = intent;
    }

    public final void run() {
        DiscoveryChimeraService.this.k.a(this.a);
    }
}
