package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.R;

/* renamed from: lwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class lwj {
    public final Context c;
    final iwq d;

    public lwj(Context context) {
        this.c = context;
        this.d = iwq.a(context);
    }

    public static SharedPreferences a(Context context) {
        return context.getApplicationContext().getSharedPreferences("driving_mode_notification_prefs", 0);
    }

    public void b() {
        this.d.a("car_driving_mode.default_notification_channel", g());
    }

    /* access modifiers changed from: protected */
    public je d() {
        je jeVar = new je(this.c, "car_driving_mode.default_notification_channel");
        jeVar.a(-1);
        jeVar.j = 2;
        jeVar.u = this.c.getResources().getColor(R.color.car_light_blue_500);
        jeVar.b(hdg.a(this.c, R.drawable.quantum_gm_ic_directions_car_vd_theme_24));
        jeVar.a(true);
        return jeVar;
    }

    /* access modifiers changed from: protected */
    public abstract int g();

    /* access modifiers changed from: protected */
    public final SharedPreferences l() {
        return a(this.c);
    }

    public void a() {
        a(g(), d().b());
    }

    public final void a(int i, Notification notification) {
        if (jkr.e() && this.d.a("car_driving_mode.default_notification_channel") == null) {
            this.d.a(new NotificationChannel("car_driving_mode.default_notification_channel", this.c.getString(R.string.car_driving_mode_notification_channel_name), 4));
        }
        this.d.a("car_driving_mode.default_notification_channel", i, notification);
    }
}
