package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;

/* renamed from: lwu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lwu extends lwj {
    public final SharedPreferences a = super.l();

    public lwu(Context context) {
        super(context);
    }

    private static int a(SharedPreferences sharedPreferences) {
        int i = sharedPreferences.getInt("setup_notification_count", 0);
        StringBuilder sb = new StringBuilder(67);
        sb.append("Current car setup notification remind me later count at:");
        sb.append(i);
        sb.toString();
        return i;
    }

    public static boolean b(Context context) {
        SharedPreferences a2 = lwj.a(context);
        if (!a2.getBoolean("do_not_show_notification_again", false) && awqs.c() && axzs.c() && axzy.b() && awqd.d()) {
            lvy lvy = new lvy(context);
            if (lvy.a() || lvy.b() || ((long) a(a2)) >= awqs.b()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final je d() {
        Intent component = new Intent().setComponent(lto.c());
        Intent startIntent = IntentOperation.getStartIntent(this.c, lwt.class, "com.google.android.drivingmode.SETUP_REMIND_ME_LATER");
        Intent startIntent2 = IntentOperation.getStartIntent(this.c, lwt.class, "com.google.android.drivingmode.SETUP_CLEAR_NOTIFICATION");
        PendingIntent activity = PendingIntent.getActivity(this.c, 0, component, 134217728);
        PendingIntent service = PendingIntent.getService(this.c, 0, startIntent2, 134217728);
        je d = super.d();
        d.e(this.c.getString(R.string.dm_setup_notification_title));
        d.b((CharSequence) this.c.getString(R.string.dm_setup_notification_text));
        d.a(activity);
        d.b(service);
        d.a(0, (CharSequence) this.c.getString(R.string.dm_setup_notification_setup_action_text), activity);
        if (((long) a(this.a)) != awqs.b() - 1) {
            d.a(0, (CharSequence) this.c.getString(R.string.dm_setup_notification_remind_me_later_action_text), PendingIntent.getService(this.c, 0, startIntent, 134217728));
        } else {
            d.a(0, (CharSequence) this.c.getString(R.string.common_no_thanks), service);
        }
        return d;
    }

    public final int g() {
        return 50384740;
    }

    public final void a() {
        if (b(this.c)) {
            Log.i("CAR.DRIVINGMODE", "Showing Driving Mode Set up Notification");
            super.a();
            return;
        }
        Log.i("CAR.DRIVINGMODE", "Not showing Driving Mode Set up Notification");
    }

    public final void b() {
        super.b();
        int i = this.a.getInt("setup_notification_count", 0) + 1;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Increasing set up notification shown count:");
        sb.append(i);
        sb.toString();
        this.a.edit().putInt("setup_notification_count", i).apply();
    }
}
