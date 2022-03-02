package defpackage;

import android.util.Log;
import com.google.android.gms.gcm.DataMessageManager$BroadcastDoneReceiver;

/* renamed from: nrh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nrh implements Runnable {
    final /* synthetic */ DataMessageManager$BroadcastDoneReceiver a;

    public nrh(DataMessageManager$BroadcastDoneReceiver dataMessageManager$BroadcastDoneReceiver) {
        this.a = dataMessageManager$BroadcastDoneReceiver;
    }

    public final void run() {
        DataMessageManager$BroadcastDoneReceiver dataMessageManager$BroadcastDoneReceiver = this.a;
        dataMessageManager$BroadcastDoneReceiver.a.b((Object) null);
        if (dataMessageManager$BroadcastDoneReceiver.a()) {
            Log.w("GCM", "Force release of GOOGLE_C2DM lock");
        }
    }
}
