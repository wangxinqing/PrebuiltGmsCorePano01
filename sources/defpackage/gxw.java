package defpackage;

import android.app.NotificationChannel;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.R;
import com.google.android.gms.checkin.eventlog.EventLogChimeraService;

/* renamed from: gxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gxw {
    public static final iwd a = gzk.a("CheckinOperation");
    public final Context b;
    public final gym c;
    public final Bundle d;
    public final boolean e;
    public final gyb f;
    public final gxs g;
    public final gzj h;
    public final gzh i;
    public amri j = ampu.a;

    public gxw(Context context, Bundle bundle) {
        this.d = bundle;
        boolean a2 = EventLogChimeraService.a(context);
        this.e = a2;
        this.b = context;
        this.c = new gym(context, a2);
        this.f = (gyb) gyb.a.b();
        this.g = (gxs) gxs.a.b();
        this.i = new gzh(context, ampt.a);
        this.h = gzj.a(context);
    }

    public static long a() {
        amri b2 = ((gyp) gyp.a.b()).b();
        if (b2.a()) {
            return ((gyn) b2.b()).a - SystemClock.elapsedRealtime();
        }
        return 0;
    }

    public final void a(int i2) {
        String str = "checkin failed";
        if (i2 == 0) {
            str = "checkin succeeded";
        } else if (i2 != 2 && i2 == 3) {
            str = "checkin rescheduled";
        }
        iwq a2 = iwq.a(this.b);
        if (a2 == null) {
            a.e("Unable to get notification manager", new Object[0]);
            return;
        }
        if (jkr.e()) {
            a2.a(new NotificationChannel("checkin.default_notification_channel", this.b.getString(R.string.checkin_module_name), 3));
        }
        je jeVar = new je(this.b, "checkin.default_notification_channel");
        jeVar.b(17301642);
        jeVar.a(System.currentTimeMillis());
        jeVar.d(str);
        jeVar.a(true);
        jeVar.e(str);
        a2.a(17301642, jeVar.b());
    }

    public final void a(String str) {
        if (!gwk.l(this.b).getString("CheckinService_lastSimOperator", "").equals(str)) {
            gwk.l(this.b).edit().putString("CheckinService_lastSimOperator", str).apply();
        }
    }
}
