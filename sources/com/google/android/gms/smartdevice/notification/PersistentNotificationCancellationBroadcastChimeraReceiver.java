package com.google.android.gms.smartdevice.notification;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PersistentNotificationCancellationBroadcastChimeraReceiver extends BroadcastReceiver {
    private static final iwd b = acqa.a("Notification", "PersistentNotificationCancellationBroadcastReceiver");

    public static Intent a(Context context, String str, int i) {
        Intent putExtra = new Intent().setClassName(context, "com.google.android.gms.smartdevice.notification.PersistentNotificationCancellationBroadcastReceiver").setAction("com.google.android.gms.smartdevice.notification.CANCEL").putExtra("tag", str).putExtra("id", i);
        putExtra.setData(Uri.parse(putExtra.toUri(1)));
        iwd iwd = b;
        String valueOf = String.valueOf(putExtra.getDataString());
        iwd.a(valueOf.length() == 0 ? new String("Notification cancel Intent data: ") : "Notification cancel Intent data: ".concat(valueOf), new Object[0]);
        return putExtra;
    }

    public final void onReceive(Context context, Intent intent) {
        iwd iwd = b;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("Received intent: ");
        sb.append(valueOf);
        iwd.b(sb.toString(), new Object[0]);
        if (!"com.google.android.gms.smartdevice.notification.CANCEL".equals(intent.getAction())) {
            iwd iwd2 = b;
            String valueOf2 = String.valueOf(intent.getAction());
            iwd2.d(valueOf2.length() == 0 ? new String("Unrecognized Intent action: ") : "Unrecognized Intent action: ".concat(valueOf2), new Object[0]);
        } else if (intent.hasExtra("tag") || intent.hasExtra("id")) {
            iwq a = iwq.a(context);
            if (a != null) {
                new acgc(a, new jbs(context)).b(intent.getStringExtra("tag"), intent.getIntExtra("id", 0));
                return;
            }
            throw null;
        } else {
            b.d("ACTION_CANCEL_NOTIFICATION intent found without tag or id.", new Object[0]);
        }
    }
}
