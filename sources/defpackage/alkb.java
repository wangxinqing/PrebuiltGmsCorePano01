package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CompletableFuture;

/* renamed from: alkb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alkb extends BroadcastReceiver {
    final /* synthetic */ Context a;
    final /* synthetic */ CompletableFuture b;

    public alkb(Context context, CompletableFuture completableFuture) {
        this.a = context;
        this.b = completableFuture;
    }

    public final void onReceive(Context context, Intent intent) {
        if (alkc.a(this.a)) {
            this.b.complete((Object) null);
        }
    }
}
