package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import java.util.Map;

/* renamed from: nyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nyp extends nyq {
    final /* synthetic */ Messenger a;
    final /* synthetic */ int b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nyp(int i, ntx ntx, Bundle bundle, Map map, Messenger messenger, int i2) {
        super(i, ntx, bundle, map);
        this.a = messenger;
        this.b = i2;
    }

    public final void a(Context context, Bundle bundle) {
        Intent a2 = a(bundle);
        Messenger messenger = this.a;
        if (messenger == null || !a(messenger, a2)) {
            int i = this.b;
            if (i == 0 || i == nqw.d()) {
                context.sendOrderedBroadcast(a2, (String) null);
            } else {
                nqw.a(context, i, a2, (String) null, (BroadcastReceiver) null, (Handler) null);
            }
        }
    }
}
