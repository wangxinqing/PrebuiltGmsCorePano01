package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.location.internal.LocationHistoryUpgradeNotificationIntentOperation;

/* renamed from: aiof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aiof implements acvv {
    private final LocationHistoryUpgradeNotificationIntentOperation a;
    private final Account b;
    private final Context c;

    public aiof(LocationHistoryUpgradeNotificationIntentOperation locationHistoryUpgradeNotificationIntentOperation, Account account, Context context) {
        this.a = locationHistoryUpgradeNotificationIntentOperation;
        this.b = account;
        this.c = context;
    }

    public final void a(Object obj) {
        this.a.a(this.b, this.c, (ReportingState) obj);
    }
}
