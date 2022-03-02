package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* renamed from: ahsz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahsz extends BroadcastReceiver {
    final /* synthetic */ ahta a;

    protected ahsz(ahta ahta) {
        this.a = ahta;
    }

    public final void onReceive(Context context, Intent intent) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ajrh ajrh = this.a.g;
        new Object[1][0] = intent;
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.a.a(3, elapsedRealtime);
        } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            this.a.a(2, elapsedRealtime);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.a.a(1, elapsedRealtime);
        } else if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                int intExtra2 = intent.getIntExtra("plugged", -1);
                if (intExtra2 == 2) {
                    this.a.a(5, elapsedRealtime);
                } else if (intExtra2 != 1) {
                    this.a.a(7, elapsedRealtime);
                } else {
                    this.a.a(6, elapsedRealtime);
                }
            } else if (intExtra == 3 || intExtra == 4) {
                this.a.a(4, elapsedRealtime);
            } else {
                ajrh ajrh2 = this.a.g;
                StringBuilder sb = new StringBuilder(43);
                sb.append("Ignore unknown charging status: ");
                sb.append(intExtra);
                sb.toString();
            }
        } else {
            ajrh ajrh3 = this.a.g;
            String action = intent.getAction();
            StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 31);
            sb2.append("Received unknown event ");
            sb2.append(action);
            sb2.append(", ignore");
            sb2.toString();
        }
    }
}
