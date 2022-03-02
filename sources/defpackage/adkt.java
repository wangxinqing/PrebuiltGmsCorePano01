package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import android.os.RecoverySystem;
import android.os.SystemClock;
import android.provider.Settings;
import com.google.android.gms.update.control.ChimeraGcmTaskService;

/* renamed from: adkt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adkt {
    public static final iwd a = adnt.d("DeviceControl");
    public static final adra b = new adra("control.device.passive_device_idle_monitoring_enabled", false);
    public static final adrk c = new adrk("control.device.device_idle_at", -1L);
    public static final adrk d = new adrk("control.device.lskf_captured_at", -1L);
    public static final adqz e = new adks();
    private static final adrk h = new adrk("control.device.reboot_count", 0L);
    private static final adrk i = new adrk("control.device.last_elapsed_realtime", -1L);
    private static final adrk j = new adrk("control.device.provisioned_at", 0L);
    private static final adrk k = new adrk("control.device.boot_count", -1L);
    private static final adrk l = new adrk("control.device.resume_on_reboot_prepared_at", -1L);
    public final Context f;
    public final adrn g = ((adrn) adrn.a.b());

    public adkt(Context context) {
        this.f = context;
    }

    public final void a() {
        this.g.a(b.b(true));
        ChimeraGcmTaskService.a(this.f);
    }

    public final void b() {
        this.g.a(b);
        ChimeraGcmTaskService.b(this.f);
    }

    public final long d() {
        g();
        return ((Long) this.g.b(h)).longValue();
    }

    public final boolean e() {
        return ((Long) this.g.b(l)).longValue() == d();
    }

    public final boolean f() {
        if (((Boolean) ((adla) adla.h.b()).k.b(adla.f)).booleanValue() || ((Long) this.g.b(d)).longValue() == ((adkt) e.b()).d()) {
            return true;
        }
        return false;
    }

    public final void g() {
        long j2;
        long j3;
        Context context = this.f;
        if (jkr.c()) {
            j2 = (long) Settings.Global.getInt(context.getContentResolver(), "boot_count", -1);
        } else {
            j2 = -1;
        }
        try {
            j3 = ((Long) this.g.b(k)).longValue();
        } catch (NumberFormatException e2) {
            a.e("Unexpected boot count data corruption.", new Object[0]);
            j3 = -1;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long longValue = ((Long) this.g.b(i)).longValue();
        this.g.a(new adrc(k, Long.valueOf(j2)), new adrc(i, Long.valueOf(elapsedRealtime)));
        if ((j2 == -1 || j3 == -1 || j2 != j3) && longValue != -1 && elapsedRealtime < longValue) {
            adrn adrn = this.g;
            adrk adrk = h;
            adrn.a(new adrc(adrk, Long.valueOf(((Long) this.g.b(adrk)).longValue() + 1)));
        }
    }

    public final void a(PendingIntent pendingIntent) {
        a.c("Prepare resume on reboot.", new Object[0]);
        long d2 = d();
        Context context = this.f;
        String valueOf = String.valueOf(d2);
        IntentSender intentSender = pendingIntent.getIntentSender();
        if (!jkr.i()) {
            a.d("Attempting to use unattended reboot on unsupported platform", new Object[0]);
        } else {
            RecoverySystem.prepareForUnattendedUpdate(context, String.valueOf(valueOf), intentSender);
        }
        this.g.a(l.b(Long.valueOf(d2)));
    }

    public final long c() {
        long currentTimeMillis = System.currentTimeMillis();
        long longValue = ((Long) this.g.b(j)).longValue();
        if (longValue != 0 && longValue <= currentTimeMillis) {
            return longValue;
        }
        if (Settings.Secure.getInt(this.f.getContentResolver(), "device_provisioned", 0) == 0) {
            currentTimeMillis = 0;
        }
        this.g.a(j.b(Long.valueOf(currentTimeMillis)));
        return currentTimeMillis;
    }
}
