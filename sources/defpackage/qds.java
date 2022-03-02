package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: qds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qds extends BroadcastReceiver {
    final /* synthetic */ qdt a;

    public qds(qdt qdt) {
        this.a = qdt;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.b(intent);
    }
}
