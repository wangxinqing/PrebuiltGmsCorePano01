package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.drivingmode.DrivingModeLocationNotificationIntentOperation;
import java.util.concurrent.TimeUnit;

/* renamed from: lwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lwf extends lwj {
    public final jbs a;
    public boolean b;

    public lwf(Context context) {
        super(context);
        lww.a();
        this.a = lww.b(context);
    }

    private final PendingIntent b(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(lto.a());
        return PendingIntent.getService(this.c, 0, intent, 134217728);
    }

    static boolean e() {
        return awqj.b() && aycw.a.a().enableDrivingModeLaunchOneTapNotification();
    }

    private final PendingIntent m() {
        return b("com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_TIMEOUT");
    }

    /* access modifiers changed from: package-private */
    public final PendingIntent a(String str) {
        Intent startIntent = IntentOperation.getStartIntent(this.c, DrivingModeLocationNotificationIntentOperation.class, str);
        amrl.a((Object) startIntent);
        return PendingIntent.getService(this.c, 0, startIntent, 134217728);
    }

    public final void c() {
        l().edit().putLong("last_cancel_timestamp", System.currentTimeMillis()).commit();
        b();
    }

    public final je d() {
        if (!e()) {
            jc jcVar = new jc(0, this.c.getString(R.string.car_driving_mode_common_turn_on), h());
            jc jcVar2 = new jc(0, this.c.getString(R.string.car_driving_mode_notification_stop_title), i());
            jc jcVar3 = new jc(0, a(awqy.c(), R.plurals.car_driving_mode_notification_snooze_action_mins, R.plurals.car_driving_mode_notification_snooze_action_secs), a("com.google.android.gms.carsetup.drivingmode.NOTIFICATION_LAUNCH_APP_SNOOZE"));
            String a2 = a(awqy.b(), R.plurals.car_driving_mode_notification_eta_mins, R.plurals.car_driving_mode_notification_eta_secs);
            je f = f();
            f.b((CharSequence) a2);
            jd jdVar = new jd();
            jdVar.a((CharSequence) a2);
            f.a((jh) jdVar);
            f.a(jcVar3);
            f.a(jcVar2);
            f.a(jcVar);
            return f;
        }
        jc jcVar4 = new jc(0, this.c.getString(R.string.car_driving_mode_notification_not_driving_title), i());
        String string = this.c.getString(R.string.driving_detected_title);
        je f2 = f();
        f2.b((CharSequence) string);
        jd jdVar2 = new jd();
        jdVar2.a((CharSequence) string);
        f2.a((jh) jdVar2);
        f2.a(jcVar4);
        return f2;
    }

    public final je f() {
        PendingIntent h = h();
        PendingIntent i = i();
        je d = super.d();
        d.e(e() ? this.c.getString(R.string.car_driving_mode_notification_title_one_tap) : this.c.getString(R.string.car_driving_mode_notification_title));
        d.c();
        d.a(h);
        d.b(i);
        return d;
    }

    public final int g() {
        return 50384636;
    }

    public final PendingIntent h() {
        return b("com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_ACCEPT");
    }

    public final PendingIntent i() {
        return b("com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_CANCEL");
    }

    public final PendingIntent j() {
        return a("com.google.android.gms.carsetup.drivingmode.NOTIFICATION_LAUNCH_APP_SHOW");
    }

    public final void k() {
        this.a.a(j());
        this.a.a(m());
    }

    public final void b() {
        super.b();
        k();
        this.b = false;
    }

    public final String a(long j, int i, int i2) {
        int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(j);
        if (minutes == 0) {
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(j);
            return this.c.getResources().getQuantityString(i2, seconds, new Object[]{Integer.valueOf(seconds)});
        }
        return this.c.getResources().getQuantityString(i, minutes, new Object[]{Integer.valueOf(minutes)});
    }

    public final void a() {
        Long valueOf = Long.valueOf(l().getLong("last_cancel_timestamp", 0));
        if (Long.valueOf(System.currentTimeMillis()).longValue() > valueOf.longValue() + Long.valueOf(awqy.a.a().e()).longValue()) {
            super.a();
            Log.i("CAR.DRIVINGMODE", "Showing Driving Mode Launch notification.");
            lww.a();
            lww.e(this.c).a(anxx.DRIVING_MODE, anxw.DRIVING_MODE_LAUNCH_NOTIFICATION_SHOW);
            if (!e()) {
                this.a.b("CAR.DRIVINGMODE", 3, SystemClock.elapsedRealtime() + awqy.b(), m(), "");
            }
            this.b = true;
            return;
        }
        Log.i("CAR.DRIVINGMODE", "Notification didn't match showing requirement; abort showing.");
    }
}
