package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.R;

/* renamed from: ajle  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajle {
    public static void a(Context context, Account account, boolean z) {
        int i;
        Intent intent = new Intent("com.google.android.gms.location.settings.LOCATION_HISTORY");
        if (account != null) {
            intent.putExtra("account", account);
        }
        intent.putExtra("settings_changed_notification", true);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 134217728);
        if (!z) {
            i = R.string.location_ulr_history_disabled_text;
        } else {
            i = R.string.location_ulr_history_enabled_text;
        }
        je jeVar = new je(context);
        jeVar.d(context.getString(i));
        jeVar.e(context.getString(R.string.location_ulr_setting_label));
        jeVar.b((CharSequence) context.getString(i));
        jeVar.b(hdg.a(context, R.drawable.ic_location_on));
        jeVar.a(true);
        jeVar.f = activity;
        iwq.a(context).a(28492843, jeVar.b());
    }
}
