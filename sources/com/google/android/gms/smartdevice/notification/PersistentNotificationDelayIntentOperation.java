package com.google.android.gms.smartdevice.notification;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PersistentNotificationDelayIntentOperation extends IntentOperation {
    private static final iwd a = acqa.a("Notification", "PersistentNotificationDelayIntentOperation");

    public static Intent a(Context context, String str, int i, SerializableNotification serializableNotification) {
        iva.c(str);
        iva.a((Object) serializableNotification);
        Intent putExtra = IntentOperation.getStartIntent(context, PersistentNotificationDelayIntentOperation.class, "com.google.android.gms.smartdevice.notification.PersistentNotificationDelayIntentOperation.ACTION").putExtra("tag", str).putExtra("id", i);
        Parcel obtain = Parcel.obtain();
        serializableNotification.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        Intent putExtra2 = putExtra.putExtra("notification_bytes", obtain.marshall());
        putExtra2.setData(Uri.parse(putExtra2.toUri(1)));
        return putExtra2;
    }

    public final void onHandleIntent(Intent intent) {
        a.a("onHandleIntent", new Object[0]);
        iwd iwd = a;
        String valueOf = String.valueOf(intent.getAction());
        iwd.a(valueOf.length() == 0 ? new String("Action: ") : "Action: ".concat(valueOf), new Object[0]);
        if ("com.google.android.gms.smartdevice.notification.PersistentNotificationDelayIntentOperation.ACTION".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("tag");
            int intExtra = intent.getIntExtra("id", 0);
            SerializableNotification a2 = SerializableNotification.a(intent.getByteArrayExtra("notification_bytes"));
            iwq a3 = iwq.a((Context) this);
            a.a("Showing notification (tag=%s, id=%s)", stringExtra, Integer.valueOf(intExtra));
            a3.a(stringExtra, intExtra, a2.a((Context) this));
        }
    }
}
