package com.google.android.gms.romanesco.contactsupload.triggers;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContactsLoggerIntentOperation extends IntentOperation {
    public static final zsg a = zsg.a("ContactsLoggerIntent");
    private final long b = System.currentTimeMillis();

    static final gsa a(Context context) {
        return new gsa(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0107 A[Catch:{ InterruptedException | ExecutionException -> 0x0131 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0108 A[Catch:{ InterruptedException | ExecutionException -> 0x0131 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011b A[Catch:{ InterruptedException | ExecutionException -> 0x0131 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012c A[Catch:{ InterruptedException | ExecutionException -> 0x0131 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r11) {
        /*
            r10 = this;
            java.lang.String r0 = "romanesco-contacts-logger-pending-significant-update"
            java.lang.String r1 = "com.google.android.gms.udc.extra.facsCacheAccountName"
            defpackage.awzx.c()
            r2 = 0
            r3 = 1
            java.lang.String r4 = r11.getAction()     // Catch:{ Exception -> 0x01eb }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01eb }
            r5[r2] = r4     // Catch:{ Exception -> 0x01eb }
            java.lang.String r5 = "com.google.android.gms.icing.action.CONTACT_CHANGED"
            boolean r5 = r5.equals(r4)     // Catch:{ Exception -> 0x01eb }
            r6 = 4
            if (r5 == 0) goto L_0x0099
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ Exception -> 0x01eb }
            boolean r4 = defpackage.jkr.h()     // Catch:{ Exception -> 0x01eb }
            if (r4 != 0) goto L_0x0025
            goto L_0x0043
        L_0x0025:
            boolean r4 = defpackage.azfa.f()     // Catch:{ Exception -> 0x01eb }
            if (r4 == 0) goto L_0x0043
            gsa r4 = a((android.content.Context) r1)     // Catch:{ Exception -> 0x01eb }
            android.accounts.Account r4 = r4.a()     // Catch:{ Exception -> 0x01eb }
            if (r4 == 0) goto L_0x0043
            zsg r4 = a     // Catch:{ Exception -> 0x01eb }
            java.lang.String r5 = "Nofity BackupManager.dateChanged()"
            r4.b(r5)     // Catch:{ Exception -> 0x01eb }
            java.lang.String r4 = r1.getPackageName()     // Catch:{ Exception -> 0x01eb }
            android.app.backup.BackupManager.dataChanged(r4)     // Catch:{ Exception -> 0x01eb }
        L_0x0043:
            boolean r4 = a()     // Catch:{ Exception -> 0x01eb }
            if (r4 != 0) goto L_0x0098
            zsi r4 = defpackage.zsi.a()     // Catch:{ Exception -> 0x01eb }
            r5 = 3
            r4.e(r5)     // Catch:{ Exception -> 0x01eb }
            android.os.Bundle r4 = r11.getExtras()     // Catch:{ Exception -> 0x01eb }
            java.lang.String r7 = "com.google.android.gms.icing.extra.isSignificant"
            boolean r4 = r4.getBoolean(r7, r2)     // Catch:{ Exception -> 0x01eb }
            boolean r11 = r10.a((android.content.Intent) r11)     // Catch:{ Exception -> 0x01eb }
            if (r11 == 0) goto L_0x0079
            android.content.SharedPreferences r11 = defpackage.zti.a(r1)     // Catch:{ Exception -> 0x01eb }
            boolean r1 = r11.getBoolean(r0, r2)     // Catch:{ Exception -> 0x01eb }
            if (r4 == 0) goto L_0x0098
            if (r1 != 0) goto L_0x0098
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch:{ Exception -> 0x01eb }
            android.content.SharedPreferences$Editor r11 = r11.putBoolean(r0, r3)     // Catch:{ Exception -> 0x01eb }
            r11.apply()     // Catch:{ Exception -> 0x01eb }
            return
        L_0x0079:
            r10.b()     // Catch:{ Exception -> 0x01eb }
            if (r4 == 0) goto L_0x0086
            zsi r11 = defpackage.zsi.a()     // Catch:{ Exception -> 0x01eb }
            r11.d(r6)     // Catch:{ Exception -> 0x01eb }
            goto L_0x008d
        L_0x0086:
            zsi r11 = defpackage.zsi.a()     // Catch:{ Exception -> 0x01eb }
            r11.d(r5)     // Catch:{ Exception -> 0x01eb }
        L_0x008d:
            if (r4 == 0) goto L_0x0092
            avey r11 = defpackage.avey.SYNC_REASON_CONTACT_CHANGED_SIGNIFICANT     // Catch:{ Exception -> 0x01eb }
            goto L_0x0094
        L_0x0092:
            avey r11 = defpackage.avey.SYNC_REASON_CONTACT_CHANGED_INSIGNIFICANT     // Catch:{ Exception -> 0x01eb }
        L_0x0094:
            r10.a(r1, r4, r11)     // Catch:{ Exception -> 0x01eb }
            return
        L_0x0098:
            return
        L_0x0099:
            boolean r0 = defpackage.azej.b()     // Catch:{ Exception -> 0x01eb }
            r5 = 5
            if (r0 != 0) goto L_0x00a6
            boolean r0 = defpackage.azej.c()     // Catch:{ Exception -> 0x01eb }
            if (r0 == 0) goto L_0x013d
        L_0x00a6:
            boolean r0 = b(r4)     // Catch:{ Exception -> 0x01eb }
            if (r0 == 0) goto L_0x013d
            android.content.Context r0 = r10.getApplicationContext()     // Catch:{ Exception -> 0x01eb }
            zsi r4 = defpackage.zsi.a()     // Catch:{ Exception -> 0x01eb }
            r4.e(r6)     // Catch:{ Exception -> 0x01eb }
            boolean r4 = r10.a((android.content.Intent) r11)     // Catch:{ Exception -> 0x01eb }
            if (r4 != 0) goto L_0x013c
            java.lang.String r4 = r11.getStringExtra(r1)     // Catch:{ Exception -> 0x01eb }
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x01eb }
            if (r6 == 0) goto L_0x00cf
            zsg r11 = a     // Catch:{ Exception -> 0x01eb }
            java.lang.String r0 = "handleFacsCacheUpdatedIntent: account name is null or empty. Ignore it."
            r11.c(r0)     // Catch:{ Exception -> 0x01eb }
            return
        L_0x00cf:
            r10.b()     // Catch:{ Exception -> 0x01eb }
            agqx r6 = new agqx     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            agqu r7 = defpackage.zvf.a(r0)     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            r6.<init>(r7)     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            java.lang.String r7 = "com.google.android.gms.udc.action.FACS_CACHE_UPDATED_EXPLICIT"
            java.lang.String r8 = r11.getAction()     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            boolean r7 = r7.equals(r8)     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            r8 = 0
            if (r7 == 0) goto L_0x0104
            java.lang.String r1 = r11.getStringExtra(r1)     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            boolean r7 = defpackage.amst.a(r1)     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            if (r7 != 0) goto L_0x0104
            agqu r6 = r6.a     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            android.accounts.Account r7 = new android.accounts.Account     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            java.lang.String r9 = "com.google"
            r7.<init>(r1, r9)     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            agqt r1 = r6.a(r7)     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            aorr r11 = r1.a((android.content.Intent) r11)     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            goto L_0x0105
        L_0x0104:
            r11 = r8
        L_0x0105:
            if (r11 == 0) goto L_0x0108
            goto L_0x010d
        L_0x0108:
            aorr r11 = defpackage.aorl.a((java.lang.Object) r8)     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
        L_0x010d:
            r11.get()     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            zve r11 = new zve     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            r11.<init>(r0)     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            boolean r11 = r11.a(r4)     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            if (r11 == 0) goto L_0x012c
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            r11[r2] = r4     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            zsi r11 = defpackage.zsi.a()     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            r11.d(r5)     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            avey r11 = defpackage.avey.SYNC_REASON_FACS_CACHE_UPDATED     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            r10.a(r0, r3, r11)     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            return
        L_0x012c:
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            r11[r2] = r4     // Catch:{ ExecutionException -> 0x0133, InterruptedException -> 0x0131 }
            return
        L_0x0131:
            r11 = move-exception
            goto L_0x0134
        L_0x0133:
            r11 = move-exception
        L_0x0134:
            zsg r0 = a     // Catch:{ Exception -> 0x01eb }
            java.lang.String r1 = "Failed to handleFacsIntent."
            r0.a((java.lang.Throwable) r11, (java.lang.String) r1)     // Catch:{ Exception -> 0x01eb }
            return
        L_0x013c:
            return
        L_0x013d:
            boolean r0 = defpackage.azej.b()     // Catch:{ Exception -> 0x01eb }
            if (r0 != 0) goto L_0x014a
            boolean r0 = defpackage.azej.c()     // Catch:{ Exception -> 0x01eb }
            if (r0 == 0) goto L_0x014a
            goto L_0x01af
        L_0x014a:
            boolean r0 = a((java.lang.String) r4)     // Catch:{ Exception -> 0x01eb }
            if (r0 == 0) goto L_0x01af
            boolean r0 = defpackage.azdq.p()     // Catch:{ Exception -> 0x01eb }
            if (r0 == 0) goto L_0x01ae
            zsg r0 = a     // Catch:{ Exception -> 0x01eb }
            java.lang.String r1 = "handleUdcSettingChanged: Udc flag is enabled"
            r0.b(r1)     // Catch:{ Exception -> 0x01eb }
            android.content.Context r0 = r10.getApplicationContext()     // Catch:{ Exception -> 0x01eb }
            zsi r1 = defpackage.zsi.a()     // Catch:{ Exception -> 0x01eb }
            r1.e(r6)     // Catch:{ Exception -> 0x01eb }
            boolean r1 = r10.a((android.content.Intent) r11)     // Catch:{ Exception -> 0x01eb }
            if (r1 != 0) goto L_0x01ae
            r10.b()     // Catch:{ Exception -> 0x01eb }
            android.os.Bundle r1 = r11.getExtras()     // Catch:{ Exception -> 0x01eb }
            java.lang.String r4 = "com.google.android.gms.udc.extra.accountName"
            java.lang.String r1 = r1.getString(r4)     // Catch:{ Exception -> 0x01eb }
            java.lang.String r4 = "com.google.android.gms.udc.extra.settingIdList"
            int[] r11 = r11.getIntArrayExtra(r4)     // Catch:{ Exception -> 0x01eb }
            int r4 = r11.length     // Catch:{ Exception -> 0x01eb }
            r6 = 0
        L_0x0183:
            if (r6 >= r4) goto L_0x01ae
            r7 = r11[r6]     // Catch:{ Exception -> 0x01eb }
            r8 = 7
            if (r7 != r8) goto L_0x01ab
            zve r11 = new zve     // Catch:{ Exception -> 0x01eb }
            r11.<init>(r0)     // Catch:{ Exception -> 0x01eb }
            boolean r11 = r11.a(r1)     // Catch:{ Exception -> 0x01eb }
            if (r11 == 0) goto L_0x01a6
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01eb }
            r11[r2] = r1     // Catch:{ Exception -> 0x01eb }
            zsi r11 = defpackage.zsi.a()     // Catch:{ Exception -> 0x01eb }
            r11.d(r5)     // Catch:{ Exception -> 0x01eb }
            avey r11 = defpackage.avey.SYNC_REASON_UDC_SETTING_CHANGED     // Catch:{ Exception -> 0x01eb }
            r10.a(r0, r3, r11)     // Catch:{ Exception -> 0x01eb }
            return
        L_0x01a6:
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01eb }
            r11[r2] = r1     // Catch:{ Exception -> 0x01eb }
            return
        L_0x01ab:
            int r6 = r6 + 1
            goto L_0x0183
        L_0x01ae:
            return
        L_0x01af:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r0 = r0.equals(r4)     // Catch:{ Exception -> 0x01eb }
            if (r0 == 0) goto L_0x01df
            boolean r0 = a()     // Catch:{ Exception -> 0x01eb }
            if (r0 != 0) goto L_0x01de
            android.content.Context r0 = r10.getApplicationContext()     // Catch:{ Exception -> 0x01eb }
            zsi r1 = defpackage.zsi.a()     // Catch:{ Exception -> 0x01eb }
            r1.e(r5)     // Catch:{ Exception -> 0x01eb }
            boolean r11 = r10.a((android.content.Intent) r11)     // Catch:{ Exception -> 0x01eb }
            if (r11 != 0) goto L_0x01de
            r10.b()     // Catch:{ Exception -> 0x01eb }
            zsi r11 = defpackage.zsi.a()     // Catch:{ Exception -> 0x01eb }
            r1 = 6
            r11.d(r1)     // Catch:{ Exception -> 0x01eb }
            avey r11 = defpackage.avey.SYNC_REASON_POWER_CONNECTED     // Catch:{ Exception -> 0x01eb }
            r10.a(r0, r3, r11)     // Catch:{ Exception -> 0x01eb }
        L_0x01de:
            return
        L_0x01df:
            zsg r11 = a     // Catch:{ Exception -> 0x01eb }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01eb }
            r0[r2] = r4     // Catch:{ Exception -> 0x01eb }
            java.lang.String r1 = "Received unexpected broadcast: %s"
            r11.b(r1, r0)     // Catch:{ Exception -> 0x01eb }
            return
        L_0x01eb:
            r11 = move-exception
            zsg r0 = a
            java.lang.String r1 = "Unable to start contactsLogger process"
            r0.a((java.lang.Throwable) r11, (java.lang.String) r1)
            android.content.Context r0 = r10.getApplicationContext()
            zsi r1 = defpackage.zsi.a()
            aveg r4 = defpackage.aveg.q
            aucd r4 = r4.o()
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x0206
            goto L_0x020b
        L_0x0206:
            r4.c()
            r4.c = r2
        L_0x020b:
            aucj r5 = r4.b
            aveg r5 = (defpackage.aveg) r5
            r5.i = r3
            aucj r3 = r4.i()
            aveg r3 = (defpackage.aveg) r3
            aveu r4 = defpackage.aveu.p
            aucd r4 = r4.o()
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x0222
            goto L_0x0227
        L_0x0222:
            r4.c()
            r4.c = r2
        L_0x0227:
            aucj r2 = r4.b
            aveu r2 = (defpackage.aveu) r2
            r3.getClass()
            r2.g = r3
            r1.a((defpackage.aucd) r4)
            zsn r0 = defpackage.zso.a(r0)
            double r1 = defpackage.azfa.l()
            r0.a(r11, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.romanesco.contactsupload.triggers.ContactsLoggerIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    private static boolean a() {
        return !azdq.b() && !azdq.c() && !azdq.p();
    }

    private final void b() {
        zti.a(getApplicationContext()).edit().putLong("romanesco-intent-received-timestamp", System.currentTimeMillis()).apply();
    }

    private final boolean a(Intent intent) {
        long j;
        boolean z;
        long currentTimeMillis = System.currentTimeMillis() - zti.a(getApplicationContext()).getLong("romanesco-intent-received-timestamp", 0);
        String action = intent.getAction();
        if ("com.google.android.gms.icing.action.CONTACT_CHANGED".equals(action)) {
            j = TimeUnit.MINUTES.toMillis(azdq.a.a().F());
        } else {
            if (azej.c()) {
                z = b(action);
            } else {
                z = a(action);
            }
            if (z) {
                j = TimeUnit.MINUTES.toMillis(azdq.a.a().I());
            } else {
                j = "android.intent.action.ACTION_POWER_CONNECTED".equals(action) ? TimeUnit.HOURS.toMillis(azdq.a.a().H()) : 0;
            }
        }
        if (currentTimeMillis <= 0 || currentTimeMillis >= j) {
            return false;
        }
        new Object[1][0] = Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j));
        return true;
    }

    private static boolean b(String str) {
        return "com.google.android.gms.udc.action.FACS_CACHE_UPDATED_EXPLICIT".equals(str);
    }

    private static boolean a(String str) {
        return "com.google.android.gms.udc.action.SETTING_CHANGED".equals(str);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r16, boolean r17, defpackage.avey r18) {
        /*
            r15 = this;
            r0 = r16
            r1 = r15
            long r2 = r1.b
            gsa r4 = a((android.content.Context) r16)
            zuk r5 = new zuk
            r5.<init>()
            r5.c = r2
            zve r2 = new zve
            r2.<init>(r0)
            boolean r2 = defpackage.zul.a(r0, r2, r4, r5)
            r3 = 0
            if (r2 == 0) goto L_0x00de
            android.content.SharedPreferences r2 = defpackage.zti.a(r16)
            java.lang.String r4 = "romanesco-contacts-logger-full-upload-timestamp"
            r6 = 0
            long r8 = r2.getLong(r4, r6)
            long r10 = r5.c
            long r10 = r10 - r8
            azdq r2 = defpackage.azdq.a
            azef r2 = r2.a()
            long r8 = r2.C()
            r2 = 1
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 < 0) goto L_0x00d2
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.DAYS
            long r12 = r12.toMillis(r8)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0046
            goto L_0x00d2
        L_0x0046:
            boolean r8 = defpackage.zul.a
            if (r8 == 0) goto L_0x009d
            android.content.SharedPreferences r8 = defpackage.zti.a(r16)
            java.lang.String r9 = "romanesco-contacts-logger-incremental-upload-timestamp"
            long r8 = r8.getLong(r9, r6)
            long r10 = r5.c
            long r10 = r10 - r8
            azdq r8 = defpackage.azdq.a
            azef r8 = r8.a()
            long r8 = r8.G()
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 <= 0) goto L_0x0079
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MINUTES
            long r12 = r12.toMillis(r8)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x0070
            goto L_0x0079
        L_0x0070:
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r10[r3] = r8
            goto L_0x009d
        L_0x0079:
            android.content.SharedPreferences r4 = defpackage.zti.a(r16)
            java.lang.String r6 = "romanesco-contacts-logger-pending-significant-update"
            boolean r7 = r4.getBoolean(r6, r3)
            if (r17 == 0) goto L_0x0092
            if (r7 != 0) goto L_0x0092
            android.content.SharedPreferences$Editor r4 = r4.edit()
            android.content.SharedPreferences$Editor r4 = r4.putBoolean(r6, r2)
            r4.apply()
        L_0x0092:
            if (r17 == 0) goto L_0x0096
        L_0x0094:
            r3 = 1
            goto L_0x0098
        L_0x0096:
            if (r7 != 0) goto L_0x0094
        L_0x0098:
            r5.d = r3
            r5.e = r2
            goto L_0x00e0
        L_0x009d:
            boolean r8 = defpackage.zul.a
            if (r8 != 0) goto L_0x00de
            android.content.SharedPreferences r8 = defpackage.zti.a(r16)
            long r8 = r8.getLong(r4, r6)
            long r10 = r5.c
            long r10 = r10 - r8
            azdq r4 = defpackage.azdq.a
            azef r4 = r4.a()
            long r8 = r4.E()
            int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ce
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.HOURS
            long r6 = r4.toMillis(r8)
            int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x00c5
            goto L_0x00ce
        L_0x00c5:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            r2[r3] = r4
            goto L_0x00de
        L_0x00ce:
            defpackage.zul.a(r5)
            goto L_0x00e0
        L_0x00d2:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            r2[r3] = r4
            defpackage.zul.a(r5)
            goto L_0x00e0
        L_0x00de:
            r5.d = r3
        L_0x00e0:
            boolean r2 = r5.d
            if (r2 == 0) goto L_0x0180
            azem r2 = defpackage.azem.a
            azen r2 = r2.a()
            boolean r2 = r2.d()
            if (r2 == 0) goto L_0x00fc
            zuo r2 = new zuo
            r2.<init>(r0, r5)
            zvc r0 = defpackage.zvc.a()
            r0.a(r2)
        L_0x00fc:
            boolean r0 = defpackage.azem.b()
            if (r0 == 0) goto L_0x0180
            azem r0 = defpackage.azem.a
            azen r0 = r0.a()
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0180
            boolean r0 = r5.e
            if (r0 != 0) goto L_0x011f
            azem r0 = defpackage.azem.a
            azen r0 = r0.a()
            boolean r0 = r0.h()
            if (r0 != 0) goto L_0x011f
            goto L_0x0126
        L_0x011f:
            boolean r0 = defpackage.zul.a
            if (r0 == 0) goto L_0x0126
            avew r0 = defpackage.avew.SYNC_ID_UPLOAD_CONTACTS_INCREMENTAL
            goto L_0x0128
        L_0x0126:
            avew r0 = defpackage.avew.SYNC_ID_UPLOAD_CONTACTS_BATCH
        L_0x0128:
            qyp r2 = defpackage.ztg.a(r15)
            aorr r3 = r2.c(r0)
            aoqw r3 = defpackage.aoqw.c(r3)
            zvg r4 = new zvg
            r5 = r18
            r4.<init>(r5)
            aoqm r5 = defpackage.aoqm.a
            aorr r3 = defpackage.aopr.a((defpackage.aorr) r3, (defpackage.aoqb) r4, (java.util.concurrent.Executor) r5)
            amqy r4 = defpackage.zvh.a
            aoqm r5 = defpackage.aoqm.a
            java.lang.Class<java.lang.Exception> r6 = java.lang.Exception.class
            aorr r3 = defpackage.aooz.a((defpackage.aorr) r3, (java.lang.Class) r6, (defpackage.amqy) r4, (java.util.concurrent.Executor) r5)
            zvi r4 = new zvi
            r4.<init>(r2, r0)
            aoqm r2 = defpackage.aoqm.a
            aorr r2 = defpackage.aopr.a((defpackage.aorr) r3, (defpackage.aoqb) r4, (java.util.concurrent.Executor) r2)
            zvj r3 = new zvj
            r3.<init>(r0)
            aoqm r0 = defpackage.aoqm.a
            aorr r0 = defpackage.aopr.a((defpackage.aorr) r2, (defpackage.amqy) r3, (java.util.concurrent.Executor) r0)
            r0.get()     // Catch:{ ExecutionException -> 0x0176, InterruptedException -> 0x0165 }
            return
        L_0x0165:
            r0 = move-exception
            r2 = r0
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            zsg r0 = a
            java.lang.String r3 = "Thread interrupted unexpectedly!"
            r0.a((java.lang.Throwable) r2, (java.lang.String) r3)
            return
        L_0x0176:
            r0 = move-exception
            r2 = r0
            zsg r0 = a
            java.lang.String r3 = "Scheduling sync failed."
            r0.a((java.lang.Throwable) r2, (java.lang.String) r3)
            return
        L_0x0180:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.romanesco.contactsupload.triggers.ContactsLoggerIntentOperation.a(android.content.Context, boolean, avey):void");
    }
}
