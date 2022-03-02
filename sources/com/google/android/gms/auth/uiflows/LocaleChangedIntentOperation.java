package com.google.android.gms.auth.uiflows;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocaleChangedIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        List<NotificationChannel> a;
        Context baseContext = getBaseContext();
        iwq a2 = iwq.a(baseContext);
        if (gqg.a() && (a = a2.a()) != null) {
            for (NotificationChannel notificationChannel : a) {
                if ("com.google.android.gms.auth.base.Notifications.AuthGroup".equals(notificationChannel.getGroup())) {
                    gqg.a(a2, baseContext, notificationChannel.getId());
                }
            }
        }
    }
}
