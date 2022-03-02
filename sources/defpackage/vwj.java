package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: vwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vwj {
    public final jiq a;
    private final Context b;

    public vwj(Context context, jiq jiq) {
        this.b = context;
        this.a = jiq;
    }

    public static vwj a(Context context) {
        return new vwj(context, jiu.a);
    }

    public final void b() {
        c().edit().remove("dont_show_notification_again").remove("most_recent_notification_dismissed_timestamp").apply();
        ((anih) ((anih) vvj.a.d()).a("vwj", "b", 94, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Resetting the fast init notification blacklist.");
    }

    public final SharedPreferences c() {
        return this.b.getSharedPreferences("nearbysharing:fastinitblacklist:state", 0);
    }

    public final void a() {
        c().edit().putLong("most_recent_notification_dismissed_timestamp", this.a.a()).apply();
        ((anih) ((anih) vvj.a.d()).a("vwj", "a", 76, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("User dismissed the fast init notification. Not showing the notification until %s.", (Object) DateFormat.getDateTimeInstance().format(new Date(System.currentTimeMillis() + ayni.u())));
    }

    public final boolean a(boolean z, boolean z2) {
        if (this.a.a() - c().getLong("most_recent_notification_dismissed_timestamp", 0) < ayni.u()) {
            ((anih) ((anih) vvj.a.d()).a("vwj", "a", 45, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Not showing fast init notifications: the user recently dismissed the notification.");
            return true;
        } else if (z) {
            return !z2;
        } else {
            return c().getBoolean("dont_show_notification_again", false);
        }
    }
}
