package defpackage;

import android.content.Intent;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: ubd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ubd extends arwm {
    final /* synthetic */ Intent a;
    final /* synthetic */ DiscoveryChimeraService b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ubd(DiscoveryChimeraService discoveryChimeraService, String str, Intent intent) {
        super(str);
        this.b = discoveryChimeraService;
        this.a = intent;
    }

    public final void run() {
        this.b.k.a(this.a);
    }
}
