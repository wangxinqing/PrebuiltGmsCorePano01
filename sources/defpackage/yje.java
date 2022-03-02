package defpackage;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.phonesky.recovery.NotificationClickedIntentOperation;

/* renamed from: yje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yje {
    private final Context a;
    private final yjf b;
    private final yjc c;
    private final yjd d;

    public yje(Context context) {
        yjf yjf = new yjf(context, new yjd(context));
        yjc yjc = new yjc(new jnh(context));
        yjd yjd = new yjd(context);
        this.a = context;
        this.b = yjf;
        this.c = yjc;
        this.d = yjd;
    }

    public final void a() {
        if (!jix.b(this.a) || azas.a.a().b()) {
            long b2 = yjb.b(this.a);
            boolean a2 = this.c.a(azas.c());
            if (b2 != -1) {
                long currentTimeMillis = System.currentTimeMillis() - b2;
                if (currentTimeMillis < azas.b() && !a2) {
                    yjb.c(this.a);
                    this.d.a(4);
                    yja.a("Package successfully uninstalled", new Object[0]);
                    return;
                } else if (currentTimeMillis < azas.a.a().a()) {
                    yja.b("Notification recently shown", new Object[0]);
                    return;
                }
            }
            this.b.a();
            yjb.c(this.a);
            if (a2) {
                yja.a("Should show recovery notification", new Object[0]);
                yjf yjf = this.b;
                if (!yjf.c.a()) {
                    yja.b("Missing NotificationManager", new Object[0]);
                    yjf.b.a(2, 3);
                    return;
                }
                if (jkr.e() && ((iwq) yjf.c.b()).a("com.google.android.gms.phonesky.recovery.ShowNotification") == null) {
                    ((iwq) yjf.c.b()).a(new NotificationChannel("com.google.android.gms.phonesky.recovery.ShowNotification", yjf.a(R.string.notification_channel_name), 2));
                }
                iwq iwq = (iwq) yjf.c.b();
                Context context = yjf.a;
                PendingIntent service = PendingIntent.getService(context, 1, IntentOperation.getStartIntent(context, NotificationClickedIntentOperation.class, "com.google.android.gms.phonesky.recovery.CLICK"), 134217728);
                je jeVar = new je(yjf.a, "com.google.android.gms.phonesky.recovery.ShowNotification");
                jeVar.b(hdg.a(yjf.a, R.drawable.quantum_ic_play_prism_grey600_24));
                jeVar.b(true);
                jeVar.j = -1;
                jeVar.e(yjf.a(R.string.notification_content_title));
                jeVar.b((CharSequence) yjf.a(R.string.notification_content_text));
                jeVar.f = service;
                jeVar.a(hdg.a(yjf.a, R.drawable.quantum_ic_done_grey600_24), (CharSequence) yjf.a(R.string.common_continue), service);
                if (jkr.c()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("android.substName", yjf.a(R.string.notification_app_name));
                    jeVar.a(bundle);
                }
                iwq.a(1, jeVar.b());
                Context context2 = yjf.a;
                long currentTimeMillis2 = System.currentTimeMillis();
                SharedPreferences.Editor edit = yjb.a(context2).edit();
                edit.putLong("last_shown_timestamp_ms", currentTimeMillis2);
                edit.apply();
                yjf.b.a(2);
                return;
            }
            return;
        }
        yja.b("Latchsky device, recovery not supported", new Object[0]);
    }
}
