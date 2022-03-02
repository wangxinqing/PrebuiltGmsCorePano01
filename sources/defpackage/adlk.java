package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* renamed from: adlk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adlk {
    public static PendingIntent a(Context context, int i) {
        return PendingIntent.getService(context, i, a(context), 134217728);
    }

    public static PendingIntent b(Context context) {
        return PendingIntent.getService(context, 1, IntentOperation.getStartIntent(context, "com.google.android.gms.update.execution.InstallationIntentOperation", "com.google.android.gms.update.SCHEDULED_INSTALL"), 134217728);
    }

    public static Intent a(Context context) {
        return IntentOperation.getStartIntent(context, "com.google.android.gms.update.execution.InstallationIntentOperation", "com.google.android.gms.update.INSTALL_UPDATE");
    }
}
