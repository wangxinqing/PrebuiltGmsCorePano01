package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.stats.controlledevents.ControlledEventsOperation;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.concurrent.TimeUnit;

/* renamed from: acsi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acsi {
    private static PendingIntent a(Intent intent) {
        return IntentOperation.getPendingIntent((Context) ihs.b(), ControlledEventsOperation.class, intent, 0, 0);
    }

    private static long b(int i, int i2) {
        return ZonedDateTime.of(Instant.now().atZone(aoou.a).toLocalDate(), LocalTime.ofSecondOfDay((long) ((amrx.a.nextInt(i2 - i) + i) * 60)), aoou.a).toInstant().toEpochMilli();
    }

    public static void a() {
        if (azmv.b()) {
            for (String next : b().getAll().keySet()) {
                if (!next.equals("NextAlarmId")) {
                    a(Integer.parseInt(next));
                }
            }
            b().edit().clear().apply();
            if (azmv.a.a().g()) {
                a("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_WAKELOCK");
            }
            if (azmv.a.a().d()) {
                a("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_BLE_SCAN");
            }
            if (azmv.a.a().h()) {
                a("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_REPEATED_WAKEUP");
            }
            if (azmv.a.a().f()) {
                a("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_PROCESS_CRASH");
            }
        }
    }

    private static SharedPreferences b() {
        return ihs.b().getSharedPreferences("ControlledEventsSharedPrefs", 0);
    }

    public static void a(int i) {
        jbs jbs = new jbs(ihs.b());
        PendingIntent pendingIntent = null;
        String string = b().getString(String.valueOf(i), (String) null);
        if (!amrk.a(string)) {
            pendingIntent = a(new Intent(string));
        }
        if (pendingIntent != null) {
            jbs.a(pendingIntent);
            pendingIntent.cancel();
            b().edit().remove(String.valueOf(i)).apply();
        }
    }

    public static void a(int i, int i2) {
        a(i, i2, Instant.now().toEpochMilli() + TimeUnit.SECONDS.toMillis(azmv.a.a().p()));
    }

    private static void a(int i, int i2, long j) {
        Intent intent = new Intent("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_REPEATED_WAKEUP");
        intent.putExtra("wakeup_duration", azmv.a.a().u()).putExtra("wakeup_remaining_alarms", i).putExtra("wakeup_number_of_attempts", i2);
        a(intent, j);
    }

    private static void a(Intent intent, long j) {
        jbs jbs = new jbs(ihs.b());
        SharedPreferences b = b();
        int i = b.getInt("NextAlarmId", 0);
        b.edit().putInt("NextAlarmId", i + 1).apply();
        intent.putExtra("alarm_id_extra", i);
        b().edit().putString(String.valueOf(i), intent.getAction()).apply();
        jbs.b("ControlledEventsAlarm", 0, j, a(intent));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.String r6) {
        /*
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r6)
            int r1 = r6.hashCode()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -579664806: goto L_0x002f;
                case -402052697: goto L_0x0025;
                case 871387742: goto L_0x001b;
                case 2085626924: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0039
        L_0x0011:
            java.lang.String r1 = "com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_WAKELOCK"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0039
            r6 = 0
            goto L_0x003a
        L_0x001b:
            java.lang.String r1 = "com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_BLE_SCAN"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0039
            r6 = 1
            goto L_0x003a
        L_0x0025:
            java.lang.String r1 = "com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_REPEATED_WAKEUP"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0039
            r6 = 3
            goto L_0x003a
        L_0x002f:
            java.lang.String r1 = "com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_PROCESS_CRASH"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0039
            r6 = 2
            goto L_0x003a
        L_0x0039:
            r6 = -1
        L_0x003a:
            if (r6 == 0) goto L_0x00b8
            if (r6 == r5) goto L_0x008d
            if (r6 == r4) goto L_0x0072
            if (r6 == r3) goto L_0x0049
            java.lang.String r6 = "ControlledEventsSchedulerUnknownAction"
            defpackage.acsh.a(r6)
            return
        L_0x0049:
            azmv r6 = defpackage.azmv.a
            azmw r6 = r6.a()
            long r0 = r6.r()
            int r6 = (int) r0
            azmv r0 = defpackage.azmv.a
            azmw r0 = r0.a()
            long r0 = r0.t()
            int r1 = (int) r0
            azmv r0 = defpackage.azmv.a
            azmw r0 = r0.a()
            long r3 = r0.q()
            int r0 = (int) r3
            long r0 = b(r1, r0)
            a(r6, r2, r0)
            return
        L_0x0072:
            azmv r6 = defpackage.azmv.a
            azmw r6 = r6.a()
            long r1 = r6.j()
            int r6 = (int) r1
            azmv r1 = defpackage.azmv.a
            azmw r1 = r1.a()
            long r1 = r1.i()
            int r2 = (int) r1
            long r1 = b(r6, r2)
            goto L_0x00f1
        L_0x008d:
            azmv r6 = defpackage.azmv.a
            azmw r6 = r6.a()
            long r1 = r6.a()
            java.lang.String r6 = "bluetooth_low_energy_scan_duration"
            r0.putExtra(r6, r1)
            azmv r6 = defpackage.azmv.a
            azmw r6 = r6.a()
            long r1 = r6.c()
            int r6 = (int) r1
            azmv r1 = defpackage.azmv.a
            azmw r1 = r1.a()
            long r1 = r1.b()
            int r2 = (int) r1
            long r1 = b(r6, r2)
            goto L_0x00f1
        L_0x00b8:
            azmv r6 = defpackage.azmv.a
            azmw r6 = r6.a()
            long r1 = r6.m()
            java.lang.String r6 = "wakelock_duration"
            android.content.Intent r6 = r0.putExtra(r6, r1)
            azmv r1 = defpackage.azmv.a
            azmw r1 = r1.a()
            boolean r1 = r1.l()
            java.lang.String r2 = "wakelock_busy"
            r6.putExtra(r2, r1)
            azmv r6 = defpackage.azmv.a
            azmw r6 = r6.a()
            long r1 = r6.o()
            int r6 = (int) r1
            azmv r1 = defpackage.azmv.a
            azmw r1 = r1.a()
            long r1 = r1.n()
            int r2 = (int) r1
            long r1 = b(r6, r2)
        L_0x00f1:
            a((android.content.Intent) r0, (long) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acsi.a(java.lang.String):void");
    }
}
