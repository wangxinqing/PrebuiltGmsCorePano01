package com.google.android.gms.nearby.discovery.fastpair;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FastPairNotificationManager$1 extends nla {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ tvo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastPairNotificationManager$1(tvo tvo, String str, String str2, String str3) {
        super(str);
        this.c = tvo;
        this.a = str2;
        this.b = str3;
    }

    public final void a(Context context, Intent intent) {
        ((anih) tsp.a.d()).a("Send the device info to companion app %s", (Object) intent.getData().getSchemeSpecificPart());
        if (intent.getData().getSchemeSpecificPart().equals(this.a)) {
            tvo tvo = this.c;
            String str = this.a;
            String str2 = this.b;
            int i = tvo.c;
            Intent b2 = tvo.b(str, str2);
            if (b2 != null) {
                b2.addFlags(268435456);
                context.startActivity(b2);
                this.c.g.a(asom.FAST_PAIR_POST_ACTION_LAUNCH_COMPANION_APP, this.c.e.G(), this.a);
            }
            try {
                context.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
            }
        }
    }
}
