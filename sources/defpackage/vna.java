package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: vna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vna {
    private static vna e;
    public final Context a;
    public final thb b;
    public final vwj c;
    private final ScheduledExecutorService d = tid.a();

    private vna(Context context, vwj vwj) {
        this.a = context;
        thb a2 = thb.a(context);
        this.b = a2;
        this.c = vwj;
        a2.a = true;
        if (Build.VERSION.SDK_INT >= 26) {
            this.b.a(new NotificationChannelGroup("NEARBY_SHARING_CHANNEL_GROUP_ID", this.a.getString(R.string.sharing_product_name)));
            thb thb = this.b;
            NotificationChannel notificationChannel = new NotificationChannel("nearby_sharing_file", this.a.getString(R.string.sharing_notification_channel_title_files), 4);
            notificationChannel.setDescription(this.a.getString(R.string.sharing_notification_channel_description_files));
            notificationChannel.setGroup("NEARBY_SHARING_CHANNEL_GROUP_ID");
            if (ayni.a.a().ay()) {
                notificationChannel.setBypassDnd(true);
            }
            a(notificationChannel);
            thb.a(notificationChannel);
            thb thb2 = this.b;
            NotificationChannel notificationChannel2 = new NotificationChannel("nearby_sharing_alert", this.a.getString(R.string.sharing_notification_channel_title_alert), 4);
            notificationChannel2.setDescription(this.a.getString(R.string.sharing_notification_channel_description_alert));
            notificationChannel2.setGroup("NEARBY_SHARING_CHANNEL_GROUP_ID");
            a(notificationChannel2);
            thb2.a(notificationChannel2);
            thb thb3 = this.b;
            NotificationChannel notificationChannel3 = new NotificationChannel("nearby_sharing_privacy", this.a.getString(R.string.sharing_notification_channel_title_privacy_reminder), 2);
            notificationChannel3.setDescription(this.a.getString(R.string.sharing_notification_channel_description_privacy_reminder));
            notificationChannel3.setGroup("NEARBY_SHARING_CHANNEL_GROUP_ID");
            a(notificationChannel3);
            thb3.a(notificationChannel3);
            if (this.b.a("nearby_sharing") != null) {
                this.b.a().b("nearby_sharing");
            }
        }
    }

    static int a(int i, ShareTarget shareTarget) {
        return (Arrays.hashCode(new Object[]{Long.valueOf(shareTarget.a)}) << 10) + i;
    }

    public static final void c() {
        e.c.c().edit().remove("dont_show_notification_again").remove("most_recent_notification_dismissed_timestamp").apply();
        ((anih) ((anih) vvj.a.d()).a("vwj", "b", 94, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Resetting the fast init notification blacklist.");
    }

    public final PendingIntent b(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        return PendingIntent.getActivity(this.a, 1001, new Intent().setClassName(this.a, "com.google.android.gms.nearby.sharing.InternalReceiveSurfaceActivity").addFlags(268435456).addFlags(32768).putExtra("share_target_bytes", ivy.a(shareTarget)).putExtra("transfer_metadata_bytes", ivy.a(transferMetadata)), 134217728);
    }

    public static vna a(Context context) {
        vwj a2 = vwj.a(context.getApplicationContext());
        if (e == null) {
            e = new vna(new vt(context.getApplicationContext(), context.getTheme()), a2);
        }
        return e;
    }

    public final PendingIntent c(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        return PendingIntent.getActivity(this.a, 1001, new Intent().setClassName(this.a, "com.google.android.gms.nearby.sharing.InternalShareSheetActivity").addFlags(268435456).addFlags(32768).putExtra("share_target_bytes", ivy.a(shareTarget)).putExtra("transfer_metadata_bytes", ivy.a(transferMetadata)), 134217728);
    }

    private final void a(NotificationChannel notificationChannel) {
        notificationChannel.setSound(wid.e(this.a), Notification.AUDIO_ATTRIBUTES_DEFAULT);
        notificationChannel.enableVibration(false);
    }

    public final void b() {
        StatusBarNotification[] statusBarNotificationArr;
        thb thb = this.b;
        if (Build.VERSION.SDK_INT >= 23) {
            statusBarNotificationArr = thb.a().a.getActiveNotifications();
        } else {
            statusBarNotificationArr = new StatusBarNotification[0];
        }
        for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
            if ("nearby_sharing".equals(statusBarNotification.getTag())) {
                this.b.a(statusBarNotification.getTag(), statusBarNotification.getId());
            }
        }
    }

    public final void a() {
        this.b.a("nearby_sharing", 3);
    }

    public final void a(ShareTarget shareTarget) {
        this.b.a("nearby_sharing", a(1, shareTarget));
    }

    public final void c(ShareTarget shareTarget) {
        thd thd = new thd();
        String str = shareTarget.j;
        if (str == null) {
            str = shareTarget.b;
        }
        thd.a = str;
        thd.b = whr.a((Drawable) new vwp(this.a, shareTarget));
        thd.c = Long.toString(shareTarget.a);
        new the(thd);
    }

    public final void a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        int a2 = a(1, shareTarget);
        tgx tgx = new tgx(this.a, "nearby_sharing_file");
        tgx.j();
        tgx.b(whr.b(new vwp(this.a, shareTarget)));
        tgx.g(shareTarget.b);
        tgx.f(this.a.getString(R.string.sharing_notification_incoming_failed_description));
        tgx.f = b(shareTarget, transferMetadata);
        tgx.d(PendingIntent.getBroadcast(this.a, a(1006, shareTarget), new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage(this.a.getPackageName()).putExtra("share_target_bytes", ivy.a(shareTarget)).putExtra("notification_id", a2), 134217728));
        tgx.h();
        tgx.j = 2;
        tgx.s = "msg";
        tgx.u = wid.a(this.a);
        tgx.d(true);
        tgx.q = "nearby_sharing";
        tgx.a(this.a.getString(R.string.sharing_product_name));
        c(shareTarget);
        tgx.f();
        a(tgx);
        a("nearby_sharing", a2, tgx.b());
        b(a2, shareTarget);
    }

    /* access modifiers changed from: package-private */
    public final void b(int i, ShareTarget shareTarget) {
        this.d.schedule(new vmz(this, i, shareTarget), ayni.a.a().aw(), TimeUnit.MILLISECONDS);
    }

    public final void b(ShareTarget shareTarget) {
        this.b.a("nearby_sharing", a(2, shareTarget));
    }

    public final void a(ShareTarget shareTarget, TransferMetadata transferMetadata, boolean z) {
        String str = transferMetadata.c;
        if (z) {
            try {
                b(shareTarget, transferMetadata).send();
                return;
            } catch (PendingIntent.CanceledException e2) {
                anih anih = (anih) vvj.a.c();
                anih.a((Throwable) e2);
                anih.a("Failed to launch receive surface.");
            }
        }
        CharSequence a2 = TextUtils.isEmpty(str) ? wig.a(this.a, shareTarget) : wig.a(this.a, shareTarget, str);
        int a3 = a(1, shareTarget);
        tgx tgx = new tgx(this.a, "nearby_sharing_file");
        tgx.b((jh) new jd());
        tgx.j();
        tgx.b(whr.b(new vwp(this.a, shareTarget)));
        tgx.g(shareTarget.b);
        tgx.f(a2);
        tgx.f = b(shareTarget, transferMetadata);
        tgx.d(PendingIntent.getBroadcast(this.a, a(1006, shareTarget), new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage(this.a.getPackageName()).putExtra("share_target_bytes", ivy.a(shareTarget)).putExtra("notification_id", a3), 134217728));
        tgx.h();
        tgx.j = 2;
        tgx.s = "msg";
        tgx.i();
        tgx.a(R.drawable.quantum_gm_ic_clear_vd_theme_24, this.a.getText(R.string.sharing_action_reject), PendingIntent.getBroadcast(this.a, a(1003, shareTarget), new Intent("com.google.android.gms.nearby.sharing.ACTION_REJECT").setPackage(this.a.getPackageName()).putExtra("share_target_bytes", ivy.a(shareTarget)).putExtra("notification_id", a3), 134217728));
        tgx.a(R.drawable.quantum_gm_ic_done_vd_theme_24, this.a.getText(R.string.sharing_action_accept), PendingIntent.getBroadcast(this.a, a(1002, shareTarget), new Intent("com.google.android.gms.nearby.sharing.ACTION_ACCEPT").setPackage(this.a.getPackageName()).putExtra("share_target_bytes", ivy.a(shareTarget)).putExtra("notification_id", a3), 134217728));
        tgx.u = wid.a(this.a);
        tgx.q = "nearby_sharing";
        tgx.a(this.a.getString(R.string.sharing_product_name));
        c(shareTarget);
        tgx.f();
        a(tgx);
        a("nearby_sharing", a3, tgx.b());
    }

    public final void a(String str, int i, Notification notification) {
        if (notification.getSmallIcon() == null) {
            ((anih) vvj.a.c()).a("Invalid notification (no valid small icon) %s", (Object) notification);
        } else {
            this.b.a(str, i, notification);
        }
    }

    public final void a(tgx tgx) {
        tgx.b(wid.e(this.a));
        tgx.b(new long[0]);
    }
}
