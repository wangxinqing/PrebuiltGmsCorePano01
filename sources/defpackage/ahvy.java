package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.List;

/* renamed from: ahvy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahvy extends BroadcastReceiver {
    final /* synthetic */ ahvz a;

    public ahvy(ahvz ahvz) {
        this.a = ahvz;
    }

    public final void onReceive(Context context, Intent intent) {
        synchronized (this) {
            if (!this.a.i()) {
                this.a.a((List) null);
            }
        }
    }
}
