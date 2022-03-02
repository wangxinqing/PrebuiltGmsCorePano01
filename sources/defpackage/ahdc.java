package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: ahdc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahdc extends BroadcastReceiver {
    private final Runnable a;

    public ahdc(Runnable runnable) {
        this.a = runnable;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.run();
    }
}
