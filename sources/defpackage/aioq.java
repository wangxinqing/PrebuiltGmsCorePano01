package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.google.android.gms.R;
import com.google.android.location.internal.ScanningUpgradeNotification$1;

/* renamed from: aioq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aioq {
    public final Context a;
    private BroadcastReceiver b;

    public aioq(Context context) {
        this.a = context;
    }

    private final Intent a(boolean z) {
        Intent intent = new Intent("com.google.android.location.internal.SCANNING_NOTIFICATION");
        intent.setPackage(this.a.getPackageName());
        intent.putExtra("launch_settings", z);
        return intent;
    }

    public final void a() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("platformVersionName", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("platformVersionO").apply();
        }
    }

    public final void a(int i) {
        int i2;
        if (i != 0) {
            ScanningUpgradeNotification$1 scanningUpgradeNotification$1 = new ScanningUpgradeNotification$1(this, "location");
            this.b = scanningUpgradeNotification$1;
            this.a.registerReceiver(scanningUpgradeNotification$1, new IntentFilter("com.google.android.location.internal.SCANNING_NOTIFICATION"));
            NotificationChannel notificationChannel = new NotificationChannel("location-settings-updates", this.a.getText(R.string.notification_channel_name_settings_updates), 3);
            notificationChannel.setImportance(4);
            iwq a2 = iwq.a(this.a);
            a2.a(notificationChannel);
            try {
                i2 = hdg.a(this.a, R.drawable.common_settings_icon);
            } catch (Resources.NotFoundException e) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = hdg.a(this.a, R.drawable.common_ic_googleplayservices);
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(this.a, 0, a(true), 134217728);
            a2.a("ZF1IDNpHEemzb8+5izDfJQ", 0, new Notification.Builder(this.a, "location-settings-updates").setContentTitle(this.a.getString(R.string.scanning_upgrade_to_p_notification_title)).setStyle(new Notification.BigTextStyle().bigText(this.a.getString(i))).setSmallIcon(i2).setContentIntent(broadcast).setDeleteIntent(PendingIntent.getBroadcast(this.a, 1, a(false), 134217728)).setAutoCancel(true).setLocalOnly(true).build());
            return;
        }
        a();
    }
}
