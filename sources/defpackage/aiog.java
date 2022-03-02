package defpackage;

import android.accounts.Account;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.R;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.location.internal.LocationHistoryUpgradeNotificationIntentOperation;

/* renamed from: aiog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aiog implements acvv {
    private final ajmm a;
    private final Account b;
    private final Context c;
    private final iwq d;
    private final int e;
    private final aioh f;

    public aiog(ajmm ajmm, Account account, Context context, iwq iwq, int i, aioh aioh) {
        this.a = ajmm;
        this.b = account;
        this.c = context;
        this.d = iwq;
        this.e = i;
        this.f = aioh;
    }

    public final void a(Object obj) {
        String str;
        ajmm ajmm = this.a;
        Account account = this.b;
        Context context = this.c;
        iwq iwq = this.d;
        int i = this.e;
        aioh aioh = this.f;
        if (!((ReportingState) obj).a || !rma.a(ajmm.a(account).b())) {
            aioh.a(account);
            return;
        }
        PendingIntent a2 = LocationHistoryUpgradeNotificationIntentOperation.a(context, account, "com.google.android.location.internal.LOCATION_HISTORY_UPGRADE_NOTIFICATION_CLICKED", i);
        PendingIntent a3 = LocationHistoryUpgradeNotificationIntentOperation.a(context, account, "com.google.android.location.internal.LOCATION_HISTORY_UPGRADE_NOTIFICATION_CLEARED", i);
        Notification.Builder builder = new Notification.Builder(context, "privacy-features-channel");
        if (ayeh.a.a().locationHistoryNotificationForQAlternativeTitle()) {
            str = context.getString(R.string.location_history_upgrade_notification_title_alternative);
        } else {
            str = context.getString(R.string.location_history_upgrade_notification_title);
        }
        iwq.a("6Dcl2tQlEemxP7t6xUHQ9g", i, builder.setContentTitle(str).setStyle(new Notification.BigTextStyle().bigText(context.getString(R.string.location_history_upgrade_notification_content))).setSmallIcon(hdg.a(context, R.drawable.ic_signal_location)).setContentIntent(a2).setDeleteIntent(a3).setSubText(account.name).setAutoCancel(true).build());
    }
}
