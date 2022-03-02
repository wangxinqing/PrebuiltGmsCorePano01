package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* renamed from: lxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lxb extends bhw implements lxc {
    public final Set a;
    SharedPreferences b;
    private final Context c;
    private final ltp d;
    private final lts e;
    private final SharedPreferences.OnSharedPreferenceChangeListener f;

    public lxb() {
        super("com.google.android.gms.drivingmode.IDrivingModeManager");
    }

    private final lxg a() {
        try {
            return lxg.b(this.b.getInt("strongest_start_source", -1));
        } catch (IllegalArgumentException e2) {
            this.e.a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_MISSING_TRIGGER_SOURCE);
            Log.w("CAR.DRIVINGMODE", "Unable to find DrivingMode TriggerSource: returning ACTIVITY_RECOGNITION and setting it as the current value");
            a(lxg.ACTIVITY_RECOGNITION);
            return lxg.ACTIVITY_RECOGNITION;
        }
    }

    private final void b(String str, boolean z) {
        String str2;
        if (luj.a(str).d(this.c)) {
            Intent intent = new Intent();
            intent.setPackage(aycw.f());
            intent.setAction(aycw.a.a().morrisBroadcastIntent());
            if (!z) {
                str2 = "DISABLED";
            } else {
                str2 = "ENABLED";
            }
            intent.putExtra("com.google.android.gms.car.drivingMode", str2);
            this.c.sendBroadcast(intent);
        }
    }

    private final void c(String str, boolean z) {
        String str2;
        anxw anxw;
        luj a2 = luj.a(str);
        ComponentName b2 = a2.b(this.c);
        if (b2 == null) {
            Log.w("CAR.DRIVINGMODE", "Invalid component name, dropping request to send intent.");
            this.e.a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_CANNOT_RESOLVE_APP_LAUNCH_INTENT);
            return;
        }
        Intent component = new Intent("android.intent.action.MAIN").addCategory("com.google.android.gms.car.drivingMode.category.DEFAULT").setComponent(b2);
        if (!z) {
            str2 = "DISABLED";
        } else {
            str2 = "ENABLED";
        }
        Intent addFlags = component.putExtra("com.google.android.gms.car.drivingMode", str2).addFlags(268435456);
        if (a2.c() != 2) {
            anxw = !z ? anxw.DRIVING_MODE_STOP_THIRDPARTY_BEHAVIOR : anxw.DRIVING_MODE_START_THIRDPARTY_BEHAVIOR;
        } else {
            anxw = !z ? anxw.DRIVING_MODE_STOP_GEARHEAD_BEHAVIOR : anxw.DRIVING_MODE_START_GEARHEAD_BEHAVIOR;
        }
        this.e.a(anxx.DRIVING_MODE, anxw);
        this.c.startActivity(addFlags);
    }

    private final void g(boolean z) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && h() && ltn.a(this.c)) {
            boolean isEnabled = defaultAdapter.isEnabled();
            if (z) {
                this.b.edit().putBoolean("previous_bluetooth_state", isEnabled).apply();
                if (!isEnabled) {
                    defaultAdapter.enable();
                    return;
                }
                return;
            }
            boolean z2 = this.b.getBoolean("previous_bluetooth_state", isEnabled);
            if (isEnabled && !z2) {
                defaultAdapter.disable();
            }
        }
    }

    public final void d(boolean z) {
        this.b.edit().putBoolean("prompt_before_launch", z).apply();
    }

    public final void e(boolean z) {
        this.b.edit().putBoolean("bluetooth_on_while_driving", z).apply();
    }

    public final void f(boolean z) {
        this.b.edit().putBoolean("setup_completed", z).apply();
    }

    public final boolean h() {
        return this.b.getBoolean("bluetooth_on_while_driving", true);
    }

    public final boolean i() {
        return this.b.getBoolean("setup_completed", false);
    }

    public final int j() {
        int i = this.b.getInt("pending_trigger_source", -1);
        if (i != -1) {
            return i;
        }
        this.e.a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_MISSING_PENDING_TRIGGER_SOURCE);
        Log.w("CAR.DRIVINGMODE", "Unable to find DrivingMode TriggerSource: returning ACTIVITY_RECOGNITION and setting it as the current value");
        b(lxg.ACTIVITY_RECOGNITION);
        return lxg.ACTIVITY_RECOGNITION.ordinal();
    }

    public final void k() {
        this.b.edit().remove("pending_trigger_source").apply();
    }

    public final boolean l() {
        long millis = TimeUnit.MINUTES.toMillis(awqv.a.a().a());
        if (millis != 0 && this.b.contains("PREF_LAST_EXPLICIT_EXIT_MILLIS_millis")) {
            long j = this.b.getLong("PREF_LAST_EXPLICIT_EXIT_MILLIS_millis", 0);
            if (j > SystemClock.elapsedRealtime()) {
                this.b.edit().remove("PREF_LAST_EXPLICIT_EXIT_MILLIS_millis").apply();
                return false;
            } else if (SystemClock.elapsedRealtime() - j < millis) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        return this.b.getBoolean("bluetooth_auto_launch", false);
    }

    public final boolean e() {
        return this.b.getBoolean("pocket_detection", true);
    }

    public final boolean f() {
        return this.b.getBoolean("activity_recognition_launch", false);
    }

    public lxb(Context context) {
        super("com.google.android.gms.drivingmode.IDrivingModeManager");
        this.a = new CopyOnWriteArraySet();
        this.f = new lwg(this);
        this.c = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("driving_mode_prefs", 0);
        this.b = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.f);
        lww.a();
        this.d = lww.d(context);
        lww.a();
        this.e = lww.e(context);
    }

    private final void a(lxg lxg) {
        this.b.edit().putInt("strongest_start_source", lxg.ordinal()).apply();
        String valueOf = String.valueOf(lxg);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("Setting strongest TriggerSource to: ");
        sb.append(valueOf);
        sb.toString();
    }

    private final void b(lxg lxg) {
        this.b.edit().putInt("pending_trigger_source", lxg.ordinal()).apply();
    }

    public final void a(int i) {
        lxg b2 = lxg.b(i);
        amrl.a(b2.a(), "TriggerSource %s cannot be set as PendingAutoLaunchTriggerSource", (Object) b2);
        if (b()) {
            return;
        }
        if (!this.b.contains("pending_trigger_source") || b2.compareTo(lxg.b(j())) >= 0) {
            b(b2);
        }
    }

    public final void b(int i) {
        boolean z;
        lxg b2 = lxg.b(i);
        if (b2 != lxg.FORCE) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, (Object) "Cannot update Driving Mode with FORCE TriggerSource");
        if (b2 != lxg.ANDROID_AUTO && a().compareTo(b2) < 0) {
            a(b2);
        }
    }

    public final void b(String str) {
        this.b.edit().putString("behavior", str).apply();
    }

    public final boolean g() {
        return this.b.getBoolean("prompt_before_launch", true);
    }

    public final void b(boolean z) {
        this.b.edit().putBoolean("pocket_detection", z).apply();
    }

    public final boolean b() {
        return this.b.getBoolean("activated", false);
    }

    public final boolean b(boolean z, int i) {
        lxg b2 = lxg.b(i);
        if (!b()) {
            String valueOf = String.valueOf(b2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
            sb.append("Stop signal received with TriggerSource ");
            sb.append(valueOf);
            sb.append(" while already stopped");
            sb.toString();
            return true;
        } else if (!awqv.a.a().b() || !b2.a() || a().compareTo(b2) <= 0) {
            String valueOf2 = String.valueOf(b2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 36);
            sb2.append("Ending driving mode. TriggerSource: ");
            sb2.append(valueOf2);
            Log.i("CAR.DRIVINGMODE", sb2.toString());
            this.b.edit().remove("strongest_start_source").apply();
            g(false);
            this.b.edit().putBoolean("activated", false).apply();
            if (z) {
                String c2 = c();
                if ("car_pref_key_driving_mode_behavior_dnd_preference".equals(c2)) {
                    this.e.a(anxx.DRIVING_MODE, anxw.DRIVING_MODE_STOP_DND_BEHAVIOR);
                    ltp ltp = this.d;
                    if (!ltp.a()) {
                        Log.i("CAR.DRIVINGMODE", "Dropping disable request, no permissions");
                    } else {
                        ltp.a(false);
                    }
                } else if ("car_pref_key_driving_mode_behavior_none_preference".equals(c2)) {
                    this.e.a(anxx.DRIVING_MODE, anxw.DRIVING_MODE_STOP_EMPTY_BEHAVIOR);
                } else if ("car_pref_key_driving_mode_behavior_morris_preference".equals(c2)) {
                    this.e.a(anxx.DRIVING_MODE, anxw.DRIVING_MODE_STOP_MORRIS_BEHAVIOR);
                    b(c2, false);
                } else {
                    c(c2, false);
                }
            }
            if (!b2.a() && b2 != lxg.FORCE) {
                this.b.edit().putLong("PREF_LAST_EXPLICIT_EXIT_MILLIS_millis", SystemClock.elapsedRealtime()).apply();
            }
            return true;
        } else {
            String valueOf3 = String.valueOf(b2);
            String valueOf4 = String.valueOf(a());
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 88 + String.valueOf(valueOf4).length());
            sb3.append("Stop signal received with TriggerSource ");
            sb3.append(valueOf3);
            sb3.append(". Not stopping because current TriggerSource is ");
            sb3.append(valueOf4);
            sb3.toString();
            return false;
        }
    }

    public final String c() {
        if (this.b.contains("behavior")) {
            String string = this.b.getString("behavior", "car_pref_key_driving_mode_behavior_none_preference");
            luj a2 = luj.a(string);
            if (a2.c(this.c) && a2.d(this.c)) {
                return string;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 46);
            sb.append("Got invalid behavior key (");
            sb.append(string);
            sb.append("); reset to default.");
            Log.i("CAR.DRIVINGMODE", sb.toString());
            this.e.a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_SETTINGS_RESET_INVALID_BEHAVIOR);
        }
        luj e2 = luj.e(this.c);
        b(e2.a());
        return e2.a();
    }

    public final void a(String str, boolean z) {
        this.b.edit().putBoolean(str, z).apply();
    }

    public final void a(boolean z) {
        this.b.edit().putBoolean("bluetooth_auto_launch", z).apply();
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r7v4, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r6, android.os.Parcel r7, android.os.Parcel r8) {
        /*
            r5 = this;
            java.lang.String r0 = "com.google.android.gms.drivingmode.IDrivingModeListener"
            r1 = 0
            r2 = 0
            r3 = 1
            switch(r6) {
                case 1: goto L_0x01bd;
                case 2: goto L_0x01aa;
                case 3: goto L_0x0197;
                case 4: goto L_0x0175;
                case 5: goto L_0x0153;
                case 6: goto L_0x0143;
                case 7: goto L_0x0133;
                case 8: goto L_0x0127;
                case 9: goto L_0x011b;
                case 10: goto L_0x010f;
                case 11: goto L_0x0103;
                case 12: goto L_0x00f7;
                case 13: goto L_0x00eb;
                case 14: goto L_0x00df;
                case 15: goto L_0x00d3;
                case 16: goto L_0x00c7;
                case 17: goto L_0x00bb;
                case 18: goto L_0x00af;
                case 19: goto L_0x00a3;
                case 20: goto L_0x0059;
                case 21: goto L_0x004d;
                case 22: goto L_0x0041;
                case 23: goto L_0x0035;
                case 24: goto L_0x0029;
                case 25: goto L_0x0021;
                case 26: goto L_0x0015;
                case 27: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            return r2
        L_0x0009:
            boolean r6 = r5.l()
            r8.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r8, (boolean) r6)
            goto L_0x01c7
        L_0x0015:
            int r6 = r7.readInt()
            r5.b((int) r6)
            r8.writeNoException()
            goto L_0x01c7
        L_0x0021:
            r5.k()
            r8.writeNoException()
            goto L_0x01c7
        L_0x0029:
            int r6 = r5.j()
            r8.writeNoException()
            r8.writeInt(r6)
            goto L_0x01c7
        L_0x0035:
            int r6 = r7.readInt()
            r5.a((int) r6)
            r8.writeNoException()
            goto L_0x01c7
        L_0x0041:
            boolean r6 = defpackage.bhx.a(r7)
            r5.f(r6)
            r8.writeNoException()
            goto L_0x01c7
        L_0x004d:
            boolean r6 = r5.i()
            r8.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r8, (boolean) r6)
            goto L_0x01c7
        L_0x0059:
            java.util.ArrayList r6 = r7.createStringArrayList()
            android.content.SharedPreferences r7 = r5.b
            android.content.SharedPreferences$Editor r7 = r7.edit()
            android.content.SharedPreferences r0 = r5.b
            java.util.Map r0 = r0.getAll()
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0071:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0089
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = "bt_autolaunch"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0071
            r7.remove(r1)
            goto L_0x0071
        L_0x0089:
            int r0 = r6.size()
        L_0x008d:
            if (r2 >= r0) goto L_0x009b
            java.lang.Object r1 = r6.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r7.putBoolean(r1, r3)
            int r2 = r2 + 1
            goto L_0x008d
        L_0x009b:
            r7.apply()
            r8.writeNoException()
            goto L_0x01c7
        L_0x00a3:
            boolean r6 = defpackage.bhx.a(r7)
            r5.e(r6)
            r8.writeNoException()
            goto L_0x01c7
        L_0x00af:
            boolean r6 = r5.h()
            r8.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r8, (boolean) r6)
            goto L_0x01c7
        L_0x00bb:
            boolean r6 = defpackage.bhx.a(r7)
            r5.d(r6)
            r8.writeNoException()
            goto L_0x01c7
        L_0x00c7:
            boolean r6 = r5.g()
            r8.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r8, (boolean) r6)
            goto L_0x01c7
        L_0x00d3:
            boolean r6 = defpackage.bhx.a(r7)
            r5.c(r6)
            r8.writeNoException()
            goto L_0x01c7
        L_0x00df:
            boolean r6 = r5.f()
            r8.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r8, (boolean) r6)
            goto L_0x01c7
        L_0x00eb:
            boolean r6 = defpackage.bhx.a(r7)
            r5.b((boolean) r6)
            r8.writeNoException()
            goto L_0x01c7
        L_0x00f7:
            boolean r6 = r5.e()
            r8.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r8, (boolean) r6)
            goto L_0x01c7
        L_0x0103:
            boolean r6 = defpackage.bhx.a(r7)
            r5.a((boolean) r6)
            r8.writeNoException()
            goto L_0x01c7
        L_0x010f:
            boolean r6 = r5.d()
            r8.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r8, (boolean) r6)
            goto L_0x01c7
        L_0x011b:
            java.lang.String r6 = r7.readString()
            r5.b((java.lang.String) r6)
            r8.writeNoException()
            goto L_0x01c7
        L_0x0127:
            java.lang.String r6 = r5.c()
            r8.writeNoException()
            r8.writeString(r6)
            goto L_0x01c7
        L_0x0133:
            java.lang.String r6 = r7.readString()
            boolean r7 = defpackage.bhx.a(r7)
            r5.a((java.lang.String) r6, (boolean) r7)
            r8.writeNoException()
            goto L_0x01c7
        L_0x0143:
            java.lang.String r6 = r7.readString()
            boolean r6 = r5.a((java.lang.String) r6)
            r8.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r8, (boolean) r6)
            goto L_0x01c7
        L_0x0153:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x016b
            android.os.IInterface r7 = r6.queryLocalInterface(r0)
            boolean r0 = r7 instanceof defpackage.lwz
            if (r0 == 0) goto L_0x0165
            r1 = r7
            lwz r1 = (defpackage.lwz) r1
            goto L_0x016c
        L_0x0165:
            lwz r1 = new lwz
            r1.<init>(r6)
            goto L_0x016c
        L_0x016b:
        L_0x016c:
            java.util.Set r6 = r5.a
            r6.remove(r1)
            r8.writeNoException()
            goto L_0x01c7
        L_0x0175:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x018d
            android.os.IInterface r7 = r6.queryLocalInterface(r0)
            boolean r0 = r7 instanceof defpackage.lwz
            if (r0 == 0) goto L_0x0187
            r1 = r7
            lwz r1 = (defpackage.lwz) r1
            goto L_0x018e
        L_0x0187:
            lwz r1 = new lwz
            r1.<init>(r6)
            goto L_0x018e
        L_0x018d:
        L_0x018e:
            java.util.Set r6 = r5.a
            r6.add(r1)
            r8.writeNoException()
            goto L_0x01c7
        L_0x0197:
            boolean r6 = defpackage.bhx.a(r7)
            int r7 = r7.readInt()
            boolean r6 = r5.b((boolean) r6, (int) r7)
            r8.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r8, (boolean) r6)
            goto L_0x01c7
        L_0x01aa:
            boolean r6 = defpackage.bhx.a(r7)
            int r7 = r7.readInt()
            boolean r6 = r5.a((boolean) r6, (int) r7)
            r8.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r8, (boolean) r6)
            goto L_0x01c7
        L_0x01bd:
            boolean r6 = r5.b()
            r8.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r8, (boolean) r6)
        L_0x01c7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxb.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    public final void c(boolean z) {
        this.b.edit().putBoolean("activity_recognition_launch", z).apply();
    }

    public final boolean a(String str) {
        return this.b.getBoolean(str, false);
    }

    public final boolean a(boolean z, int i) {
        lxg b2 = lxg.b(i);
        amrl.a(b2 != lxg.FORCE, (Object) "Cannot start Driving Mode with FORCE TriggerSource");
        if (b()) {
            String valueOf = String.valueOf(b2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 108);
            sb.append("Duplicate start signal received with TriggerSource ");
            sb.append(valueOf);
            sb.append(". checking if Strongest TriggerSource needs to be updated");
            sb.toString();
            if (b2 != lxg.ANDROID_AUTO && a().compareTo(b2) < 0) {
                a(b2);
            }
            return false;
        }
        lww.a();
        lww.g(this.c).b();
        String valueOf2 = String.valueOf(b2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
        sb2.append("Starting driving mode. TriggerSource: ");
        sb2.append(valueOf2);
        Log.i("CAR.DRIVINGMODE", sb2.toString());
        a(b2);
        g(true);
        this.b.edit().putBoolean("activated", true).apply();
        if (z) {
            String c2 = c();
            if ("car_pref_key_driving_mode_behavior_dnd_preference".equals(c2)) {
                this.e.a(anxx.DRIVING_MODE, anxw.DRIVING_MODE_START_DND_BEHAVIOR);
                ltp ltp = this.d;
                if (!ltp.a()) {
                    Log.i("CAR.DRIVINGMODE", "Dropping enable request, no permissions");
                } else {
                    ltp.a(true);
                }
            } else if ("car_pref_key_driving_mode_behavior_none_preference".equals(c2)) {
                this.e.a(anxx.DRIVING_MODE, anxw.DRIVING_MODE_START_EMPTY_BEHAVIOR);
            } else if ("car_pref_key_driving_mode_behavior_morris_preference".equals(c2)) {
                this.e.a(anxx.DRIVING_MODE, anxw.DRIVING_MODE_START_MORRIS_BEHAVIOR);
                b(c2, true);
            } else {
                c(c2, true);
            }
        }
        this.b.edit().remove("PREF_LAST_EXPLICIT_EXIT_MILLIS_millis").apply();
        return true;
    }
}
