package com.google.android.gms.people.backuplegacy.cp2;

import android.accounts.Account;
import android.app.backup.BackupManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContactsLoggerIntentOperation extends IntentOperation {
    private final void a(Context context, boolean z) {
        boolean z2;
        boolean z3;
        Account a;
        wrg wrg = new wrg();
        wrg.c = System.currentTimeMillis();
        new xsd(getApplicationContext());
        new ybz();
        gsa gsa = new gsa(context);
        xip.a();
        if (((Boolean) xia.a.a()).booleanValue() || ((Boolean) xid.a.a()).booleanValue()) {
            xip.a();
            boolean z4 = false;
            if (((Boolean) xia.a.a()).booleanValue()) {
                z2 = Settings.Secure.getInt(context.getContentResolver(), "user_full_data_backup_aware", 0) != 0;
            } else {
                z2 = false;
            }
            if (!((Boolean) xid.a.a()).booleanValue()) {
                z3 = false;
            } else if (Settings.Secure.getInt(context.getContentResolver(), "backup_enabled:com.android.calllogbackup", 0) == 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            wml a2 = wml.a();
            boolean booleanValue = ((Boolean) xid.a.a()).booleanValue();
            aucd o = xlb.n.o();
            aucd o2 = xla.e.o();
            aucd o3 = xlc.m.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            xla xla = (xla) o2.b;
            int i = xla.a | 1;
            xla.a = i;
            xla.b = z2;
            int i2 = i | 2;
            xla.a = i2;
            xla.c = z3;
            xla.a = i2 | 4;
            xla.d = booleanValue;
            if (o.c) {
                o.c();
                o.c = false;
            }
            xlb xlb = (xlb) o.b;
            xla xla2 = (xla) o2.i();
            xla2.getClass();
            xlb.l = xla2;
            xlb.a |= 1024;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            xlc xlc = (xlc) o3.b;
            xlb xlb2 = (xlb) o.i();
            xlb2.getClass();
            xlc.l = xlb2;
            xlc.a |= 131072;
            a2.a((xlc) o3.i());
            if ((z2 || z3) && Build.VERSION.SDK_INT >= 23) {
                try {
                    if (new BackupManager(context).isBackupEnabled() && (a = gsa.a()) != null && !TextUtils.isEmpty(a.name)) {
                        wrg.a = a.name;
                        xip.a();
                        long j = wrg.c - wqw.a(context).getLong("contacts-logger-full-upload-timestamp", 0);
                        long longValue = Long.valueOf(aywy.a.a().aw()).longValue();
                        if (j < 0 || j > TimeUnit.DAYS.toMillis(longValue)) {
                            int i3 = wrh.a;
                        } else {
                            int i4 = wrh.a;
                            long j2 = wrg.c - wqw.a(context).getLong("contacts-logger-incremental-upload-timestamp", 0);
                            xip.a();
                            long longValue2 = Long.valueOf(aywy.a.a().ca()).longValue();
                            if (j2 <= 0 || j2 >= TimeUnit.MINUTES.toMillis(longValue2)) {
                                SharedPreferences a3 = wqw.a(context);
                                boolean z5 = a3.getBoolean("contacts-logger-pending-significant-update", false);
                                if (z && !z5) {
                                    a3.edit().putBoolean("contacts-logger-pending-significant-update", true).apply();
                                }
                                if (z || z5) {
                                    z4 = true;
                                }
                                wrg.d = true;
                                if (!z4) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        wro.a().a(new wrk(wqw.a(context), wrg, new wre(context, wrg), new ydd(context)));
                        return;
                    }
                } catch (SecurityException e) {
                    Log.e("ContactsLoggerDecision", "SecurityException: Unable to verify if backup is enabled.");
                    xip.a();
                    yde.a.a(context).a(e, ((Double) xic.a.a()).doubleValue());
                }
            }
            wml a4 = wml.a();
            aucd o4 = xlc.m.o();
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            xlc xlc2 = (xlc) o4.b;
            xlc2.a |= 32;
            xlc2.d = true;
            a4.a((xlc) o4.i());
        }
    }

    public final void onHandleIntent(Intent intent) {
        try {
            xip.a();
            if (((Boolean) xgt.a.a()).booleanValue()) {
                String action = intent.getAction();
                if (!"com.google.android.gms.icing.action.CONTACT_CHANGED".equals(action)) {
                    if ("com.google.android.gms.udc.action.SETTING_CHANGED".equals(action)) {
                        return;
                    }
                    if (!"android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        xdt.a("ContactsLoggerIntentOperation", "Received unexpected broadcast: %s", action);
                    } else if (!a()) {
                        Context applicationContext = getApplicationContext();
                        wml a = wml.a();
                        if (wml.a.nextDouble() < 1.0E-4d) {
                            aucd o = xlc.m.o();
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            xlc xlc = (xlc) o.b;
                            xlc.a |= 32768;
                            xlc.j = true;
                            a.a((xlc) o.i());
                        }
                        if (!a(intent)) {
                            b();
                            wml a2 = wml.a();
                            aucd o2 = xlc.m.o();
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            xlc xlc2 = (xlc) o2.b;
                            xlc2.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
                            xlc2.h = true;
                            a2.a((xlc) o2.i());
                            a(applicationContext, true);
                        }
                    }
                } else if (!a()) {
                    Context applicationContext2 = getApplicationContext();
                    wml a3 = wml.a();
                    if (wml.a.nextDouble() < 1.0E-4d) {
                        aucd o3 = xlc.m.o();
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        xlc xlc3 = (xlc) o3.b;
                        xlc3.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
                        xlc3.i = true;
                        a3.a((xlc) o3.i());
                    }
                    boolean z = intent.getExtras().getBoolean("com.google.android.gms.icing.extra.isSignificant", false);
                    if (a(intent)) {
                        SharedPreferences a4 = wqw.a(applicationContext2);
                        boolean z2 = a4.getBoolean("contacts-logger-pending-significant-update", false);
                        if (z && !z2) {
                            a4.edit().putBoolean("contacts-logger-pending-significant-update", true).apply();
                            return;
                        }
                        return;
                    }
                    b();
                    wml a5 = wml.a();
                    aucd o4 = xlc.m.o();
                    if (o4.c) {
                        o4.c();
                        o4.c = false;
                    }
                    xlc xlc4 = (xlc) o4.b;
                    int i = xlc4.a | 8;
                    xlc4.a = i;
                    xlc4.b = true;
                    if (z) {
                        xlc4.a = i | 16;
                        xlc4.c = true;
                    }
                    a5.a((xlc) o4.i());
                    a(applicationContext2, z);
                }
            }
        } catch (Exception e) {
            Context applicationContext3 = getApplicationContext();
            wml a6 = wml.a();
            aucd o5 = xlb.n.o();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            xlb xlb = (xlb) o5.b;
            xlb.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            xlb.j = true;
            xlb xlb2 = (xlb) o5.i();
            aucd o6 = xlc.m.o();
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            xlc xlc5 = (xlc) o6.b;
            xlb2.getClass();
            xlc5.l = xlb2;
            xlc5.a |= 131072;
            a6.a((xlc) o6.i());
            yde.a.a(applicationContext3).a(e, ((Double) xic.a.a()).doubleValue());
        }
    }

    private final void b() {
        wqw.a(getApplicationContext()).edit().putLong("intent-received-timestamp", System.currentTimeMillis()).apply();
    }

    private static boolean a() {
        return !((Boolean) xia.a.a()).booleanValue() && !((Boolean) xid.a.a()).booleanValue();
    }

    private final boolean a(Intent intent) {
        long j;
        long currentTimeMillis = System.currentTimeMillis() - wqw.a(getApplicationContext()).getLong("intent-received-timestamp", 0);
        String action = intent.getAction();
        if ("com.google.android.gms.icing.action.CONTACT_CHANGED".equals(action)) {
            j = TimeUnit.MINUTES.toMillis(Long.valueOf(aywy.a.a().bZ()).longValue());
        } else if ("com.google.android.gms.udc.action.SETTING_CHANGED".equals(action)) {
            j = TimeUnit.MINUTES.toMillis(Long.valueOf(aywy.a.a().cc()).longValue());
        } else {
            j = "android.intent.action.ACTION_POWER_CONNECTED".equals(action) ? TimeUnit.HOURS.toMillis(Long.valueOf(aywy.a.a().cb()).longValue()) : 0;
        }
        if (currentTimeMillis <= 0 || currentTimeMillis >= j) {
            return false;
        }
        TimeUnit.MILLISECONDS.toMinutes(j);
        return true;
    }
}
