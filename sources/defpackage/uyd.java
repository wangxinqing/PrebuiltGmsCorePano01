package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: uyd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uyd {
    public static void a(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.nearby.messages.service.NearbyMessagesService");
        intent.setAction("com.google.android.gms.nearby.messages.service.START_SERVICE_PERSISTENT");
        context.startService(intent);
    }

    public static Intent b(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.google.android.gms.nearby.messages.service.NearbyMessagesService"));
        return intent;
    }
}
