package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: uwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uwp extends arwm {
    final /* synthetic */ String a;
    final /* synthetic */ uwr b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uwp(uwr uwr, String str, String str2) {
        super(str);
        this.b = uwr;
        this.a = str2;
    }

    public final void run() {
        jjg jjg = tgc.a;
        Context context = this.b.a;
        String str = this.a;
        Intent b2 = uyd.b(context);
        b2.setAction("com.google.android.gms.nearby.messages.service.STOP_CLIENT");
        b2.putExtra("com.google.android.gms.nearby.messages.CALLING_APP_PACKAGE_NAME", str);
        context.startService(b2);
    }
}
