package defpackage;

import android.content.Intent;
import com.google.android.gms.update.control.ActiveStateTrackingBroadcastReceiver;

/* renamed from: adkj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adkj extends jfx {
    final /* synthetic */ Intent a;
    final /* synthetic */ ActiveStateTrackingBroadcastReceiver e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adkj(ActiveStateTrackingBroadcastReceiver activeStateTrackingBroadcastReceiver, Intent intent) {
        super(9);
        this.e = activeStateTrackingBroadcastReceiver;
        this.a = intent;
    }

    public final void run() {
        synchronized (this.e.a) {
            ActiveStateTrackingBroadcastReceiver activeStateTrackingBroadcastReceiver = this.e;
            if (activeStateTrackingBroadcastReceiver.b) {
                activeStateTrackingBroadcastReceiver.a(this.a);
            }
        }
    }
}
