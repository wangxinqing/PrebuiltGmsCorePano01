package defpackage;

import android.content.Intent;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: ubk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ubk extends arwm {
    final /* synthetic */ Intent a;
    final /* synthetic */ DiscoveryChimeraService.GuardedIntentReceiver b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ubk(DiscoveryChimeraService.GuardedIntentReceiver guardedIntentReceiver, String str, Intent intent) {
        super(str);
        this.b = guardedIntentReceiver;
        this.a = intent;
    }

    public final void run() {
        DiscoveryChimeraService.this.k.a(this.a);
    }
}
