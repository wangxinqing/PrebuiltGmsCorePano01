package com.google.android.gms.chimera.container;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class TestSetupIntentOperation extends IntentOperation {
    private static void a(Context context, boolean z) {
        byte b;
        byte[] bArr = new byte[1];
        if (!z) {
            b = 48;
        } else {
            b = 49;
        }
        bArr[0] = b;
        File a = bkq.a(context);
        bkq.a(bArr, new File(a, ".tmp-.config_updated"), new File(a, ".config_updated"), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0207, code lost:
        if (defpackage.aekv.b(r25) != false) goto L_0x0209;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0098 A[SYNTHETIC, Splitter:B:22:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r26) {
        /*
            r25 = this;
            r8 = r25
            r0 = r26
            java.lang.String r1 = r26.getAction()
            java.lang.String r2 = "com.google.android.gms.chimera.container.UPDATE_CONFIG_FOR_TESTING"
            boolean r2 = r2.equals(r1)
            java.lang.String r7 = "TestIntentOp"
            if (r2 != 0) goto L_0x002c
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "Unknown action: "
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0024
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x0028
        L_0x0024:
            java.lang.String r0 = r1.concat(r0)
        L_0x0028:
            android.util.Log.e(r7, r0)
            return
        L_0x002c:
            java.lang.String r1 = "required_packages"
            java.lang.String r1 = r0.getStringExtra(r1)
            if (r1 == 0) goto L_0x0049
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x003c
            goto L_0x0049
        L_0x003c:
            java.lang.String r2 = ","
            java.lang.String[] r1 = r1.split(r2)
            anax r1 = defpackage.anax.a((java.lang.Object[]) r1)
            r9 = r1
            goto L_0x004c
        L_0x0049:
            anfv r1 = defpackage.anfv.a
            r9 = r1
        L_0x004c:
            r1 = 22
            java.lang.String r2 = "max_scans"
            int r10 = r0.getIntExtra(r2, r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 5
            java.lang.String r3 = "scan_interval_sec"
            int r2 = r0.getIntExtra(r3, r2)
            long r2 = (long) r2
            long r11 = r1.toMillis(r2)
            java.lang.String r1 = "optimization_required"
            r13 = 1
            boolean r1 = r0.getBooleanExtra(r1, r13)
            if (r1 != 0) goto L_0x0076
            defpackage.bkn.b()
            boolean r1 = defpackage.hei.h()
            if (r1 != 0) goto L_0x0076
            r15 = 0
            goto L_0x0077
        L_0x0076:
            r15 = 1
        L_0x0077:
            java.lang.String r1 = "chimera_check"
            boolean r1 = r0.getBooleanExtra(r1, r13)
            java.lang.String r2 = "ph_check"
            boolean r16 = r0.getBooleanExtra(r2, r13)
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = (long) r10
            long r4 = r4 * r11
            long r17 = r2 + r4
            ob r6 = new ob
            r0 = 16
            r6.<init>((int) r0)
            java.lang.String r5 = "Failed to read Chimera config"
            if (r1 != 0) goto L_0x00ad
            boolean r13 = r8.a((java.util.Set) r9, (java.util.Set) r6)     // Catch:{ IOException -> 0x00a3, InvalidConfigException -> 0x00a1 }
            r14 = r6
            r23 = r11
            goto L_0x01df
        L_0x00a1:
            r0 = move-exception
            goto L_0x00a4
        L_0x00a3:
            r0 = move-exception
        L_0x00a4:
            android.util.Log.e(r7, r5, r0)
            r14 = r6
            r23 = r11
            r13 = 0
            goto L_0x01df
        L_0x00ad:
            ob r0 = new ob
            r1 = 8
            r0.<init>((int) r1)
            defpackage.hey.a()
            blu r4 = defpackage.blu.a((android.content.Context) r25)
            r3 = 0
            r19 = 0
        L_0x00be:
            if (r3 >= r10) goto L_0x01da
            long r1 = android.os.SystemClock.elapsedRealtime()
            int r20 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r20 < 0) goto L_0x00ce
            r14 = r6
            r23 = r11
            r13 = 0
            goto L_0x01df
        L_0x00ce:
            if (r3 > 0) goto L_0x00d1
            goto L_0x00d4
        L_0x00d1:
            android.os.SystemClock.sleep(r11)
        L_0x00d4:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r20 = android.os.SystemClock.elapsedRealtime()
            long r13 = r17 - r20
            long r1 = r1.toSeconds(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r14 = 71
            r13.<init>(r14)
            java.lang.String r14 = "TEST SETUP (Chimera): "
            r13.append(r14)
            r13.append(r3)
            java.lang.String r14 = " of "
            r13.append(r14)
            r13.append(r10)
            java.lang.String r14 = " - "
            r13.append(r14)
            r13.append(r1)
            java.lang.String r1 = r13.toString()
            a(r1)
            r0.clear()
            boolean r1 = r25.a()
            if (r1 != 0) goto L_0x011f
            java.lang.String r1 = "Modules initializing"
            a(r1)
            r22 = r3
            r14 = r6
            r23 = r11
            r1 = 1
            r2 = 0
            r11 = r4
            r12 = r5
            goto L_0x01c7
        L_0x011f:
            java.lang.String r13 = "Modules are ready"
            if (r19 != 0) goto L_0x01d1
            java.util.Set r14 = defpackage.hey.c(r25)
            java.util.Set r20 = defpackage.hey.b()
            r21 = 1
            r1 = r25
            r2 = r14
            r22 = r3
            r3 = r20
            r23 = r11
            r11 = r4
            r4 = r14
            r12 = r5
            r5 = r21
            r14 = r6
            r6 = r0
            boolean r1 = defpackage.hey.a((android.content.Context) r1, (java.util.Set) r2, (java.util.Set) r3, (java.util.Set) r4, (boolean) r5, (java.util.Collection) r6)
            if (r1 == 0) goto L_0x01a9
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 14
            r3.<init>(r2)
            java.lang.String r2 = "installedApks="
            r3.append(r2)
            r3.append(r1)
            r3.toString()
            r1 = 0
            r2 = 0
            r11.a((java.util.Set) r0, (defpackage.bpq) r1, (boolean) r2)
            if (r15 == 0) goto L_0x016b
            r11.a((boolean) r2)
        L_0x016b:
            r1 = 1
            defpackage.hey.a((boolean) r1)
            if (r15 != 0) goto L_0x018a
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L_0x0186
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 > r4) goto L_0x0186
            boolean r3 = defpackage.awxs.f()
            if (r3 == 0) goto L_0x0186
            r3 = 1
            goto L_0x0187
        L_0x0186:
            r3 = 0
        L_0x0187:
            com.google.android.gms.chimera.container.DexOptIntentOperation.a(r8, r3)
        L_0x018a:
            r14.clear()
            boolean r3 = r8.a((java.util.Set) r9, (java.util.Set) r14)     // Catch:{ IOException -> 0x01a3, InvalidConfigException -> 0x01a1 }
            if (r3 == 0) goto L_0x019e
            boolean r4 = r25.a()     // Catch:{ IOException -> 0x01a3, InvalidConfigException -> 0x01a1 }
            if (r4 == 0) goto L_0x019e
            a(r13)     // Catch:{ IOException -> 0x01a3, InvalidConfigException -> 0x01a1 }
            r13 = 1
            goto L_0x01df
        L_0x019e:
            r19 = r3
            goto L_0x01ab
        L_0x01a1:
            r0 = move-exception
            goto L_0x01a4
        L_0x01a3:
            r0 = move-exception
        L_0x01a4:
            android.util.Log.e(r7, r12, r0)
            r13 = 0
            goto L_0x01df
        L_0x01a9:
            r1 = 1
            r2 = 0
        L_0x01ab:
            if (r19 != 0) goto L_0x01b0
            java.lang.String r3 = "not ready"
            goto L_0x01b2
        L_0x01b0:
            java.lang.String r3 = "initializing"
        L_0x01b2:
            java.lang.String r4 = "Modules "
            int r5 = r3.length()
            if (r5 != 0) goto L_0x01c0
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
            goto L_0x01c4
        L_0x01c0:
            java.lang.String r3 = r4.concat(r3)
        L_0x01c4:
            a(r3)
        L_0x01c7:
            int r3 = r22 + 1
            r4 = r11
            r5 = r12
            r6 = r14
            r11 = r23
            r13 = 1
            goto L_0x00be
        L_0x01d1:
            r14 = r6
            r23 = r11
            r1 = 1
            a(r13)
            r13 = 1
            goto L_0x01df
        L_0x01da:
            r14 = r6
            r23 = r11
            r2 = 0
            r13 = 0
        L_0x01df:
            if (r13 != 0) goto L_0x01e2
            goto L_0x01f6
        L_0x01e2:
            if (r16 == 0) goto L_0x01f6
            boolean r0 = defpackage.aekv.a(r25)
            if (r0 != 0) goto L_0x01f6
            r1 = r25
            r2 = r10
            r3 = r23
            r5 = r17
            r7 = r14
            boolean r13 = r1.a(r2, r3, r5, r7)
        L_0x01f6:
            boolean r0 = defpackage.aekv.a()
            if (r0 == 0) goto L_0x0209
            android.content.Context r0 = r25.createDeviceProtectedStorageContext()
            a((android.content.Context) r0, (boolean) r13)
            boolean r0 = defpackage.aekv.b(r25)
            if (r0 == 0) goto L_0x020c
        L_0x0209:
            a((android.content.Context) r8, (boolean) r13)
        L_0x020c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 50
            r0.<init>(r1)
            java.lang.String r1 = "UPDATE_CONFIG_FOR_TESTING completed: success="
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chimera.container.TestSetupIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    private static void a(String str) {
        Log.i("TestIntentOp", str);
    }

    private final boolean a() {
        boolean e = bkv.a((Context) this).e();
        StringBuilder sb = new StringBuilder(30);
        sb.append("modulesInit in progress: ");
        sb.append(e);
        sb.toString();
        return !e;
    }

    private final boolean a(int i, long j, long j2, Set set) {
        Intent startIntent;
        int i2 = 0;
        while (i2 < i && SystemClock.elapsedRealtime() < j2) {
            if (i2 > 0) {
                SystemClock.sleep(j);
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(j2 - SystemClock.elapsedRealtime());
            StringBuilder sb = new StringBuilder(73);
            sb.append("TEST SETUP (Phenotype): ");
            sb.append(i2);
            sb.append(" of ");
            sb.append(i);
            sb.append(" - ");
            sb.append(seconds);
            a(sb.toString());
            ArrayList a = anda.a(((ob) set).b);
            yey a2 = yef.a((Context) this);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                a.add(a2.i((String) it.next()));
            }
            try {
                acws.a(acws.b((Collection) a), 30, TimeUnit.SECONDS);
                return true;
            } catch (ExecutionException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("TestIntentOp", valueOf.length() == 0 ? new String("Failed to get P/H config from required packages: ") : "Failed to get P/H config from required packages: ".concat(valueOf));
                Throwable cause = e.getCause();
                if ((cause instanceof ibr) && ((ibr) cause).a() == 29503 && (startIntent = IntentOperation.getStartIntent((Context) this, "com.google.android.gms.common.config.PhenotypeRegistrationOperation", "com.google.android.chimera.MODULE_CONFIGURATION_CHANGED")) != null) {
                    startService(startIntent);
                }
            } catch (InterruptedException | TimeoutException e2) {
                Log.e("TestIntentOp", "Something went wrong when getting P/H config", e2);
            }
        }
        return false;
        i2++;
    }

    private final boolean a(Set set, Set set2) {
        byte[] byteArray;
        set2.add("com.google.android.gms");
        if (set.isEmpty()) {
            return true;
        }
        try {
            Collection<ModuleManager.ModuleInfo> allModules = ModuleManager.get(this).getAllModules();
            Set b = qug.b();
            for (ModuleManager.ModuleInfo moduleInfo : allModules) {
                b.add(moduleInfo.moduleApk.apkPackageName);
                if (set.contains(moduleInfo.moduleApk.apkPackageName) && (byteArray = moduleInfo.getMetadata(this).getByteArray("com.google.android.gms.phenotype.registration.proto")) != null && byteArray.length > 0) {
                    aucx aucx = ((nim) aucj.a((aucj) nim.b, byteArray, aubs.b())).a;
                    int size = aucx.size();
                    for (int i = 0; i < size; i++) {
                        nil nil = (nil) aucx.get(i);
                        if (!nil.g) {
                            set2.add(nil.b);
                        }
                    }
                }
            }
            String valueOf = String.valueOf(set);
            String valueOf2 = String.valueOf(b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26 + String.valueOf(valueOf2).length());
            sb.append("requiredPackages=");
            sb.append(valueOf);
            sb.append(" allApks=");
            sb.append(valueOf2);
            sb.toString();
            String valueOf3 = String.valueOf(set2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 29);
            sb2.append("required P/H config packages=");
            sb2.append(valueOf3);
            sb2.toString();
            return b.containsAll(set);
        } catch (InvalidConfigException e) {
            Log.e("TestIntentOp", "Unable to get Chimera module info collection", e);
            return false;
        }
    }
}
