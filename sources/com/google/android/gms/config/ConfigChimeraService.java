package com.google.android.gms.config;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.config.internal.ConfigExperimentPayload;
import com.google.android.gms.config.internal.FetchConfigIpcResponse;
import com.google.android.gms.config.internal.PackageConfigTable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ConfigChimeraService extends Service {
    static final Charset h = Charset.forName("UTF-8");
    public static final /* synthetic */ int l = 0;
    private static final char[] n = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public final Object a = new Object();
    public Map b = null;
    public Map c = null;
    public Map d = null;
    public Map e = null;
    public final Object f = new Object();
    public Set g = null;
    public boolean i = false;
    public jnz j;
    public joq k;
    private PackageManager m;

    public static String a(List list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(list.get(i2));
            if (i2 != list.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public final int b(String str) {
        return a(str, "throttling_success_rate", 5, 1, 20);
    }

    public final int c(String str) {
        return a(str, "throttling_failure_rate", 5, 1, 20);
    }

    /* access modifiers changed from: package-private */
    public final boolean d(String str) {
        PackageInfo packageInfo;
        if (str == null) {
            Log.w("ConfigChimeraService", "specify package to override in __package__ extra");
            return false;
        }
        if (!"all_packages".equals(str)) {
            try {
                packageInfo = this.m.getPackageInfo(str, 64);
                if (packageInfo == null) {
                    Log.w("ConfigChimeraService", "failed to get target package info");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("ConfigChimeraService", "target package not installed");
                return false;
            }
        } else {
            packageInfo = null;
        }
        if (hxz.a() || !hxz.f(this)) {
            try {
                PackageInfo packageInfo2 = this.m.getPackageInfo("com.google.android.gms.config.override", 64);
                if (packageInfo2 == null) {
                    Log.w("ConfigChimeraService", "failed to get signal package info");
                    return false;
                } else if (packageInfo2.sharedUserId != null) {
                    Log.w("ConfigChimeraService", "signal package may not have a shared user id");
                    return false;
                } else {
                    HashSet hashSet = new HashSet();
                    for (Signature add : packageInfo2.signatures) {
                        hashSet.add(add);
                    }
                    for (Signature contains : packageInfo.signatures) {
                        if (!hashSet.contains(contains)) {
                            Log.w("ConfigChimeraService", "signatures aren't compatible; override disallowed");
                            return false;
                        }
                    }
                    return true;
                }
            } catch (PackageManager.NameNotFoundException e3) {
                Log.w("ConfigChimeraService", "signal package not installed");
                return false;
            }
        } else {
            Log.w("ConfigChimeraService", "non-user-build device with test-keys GmsCore; override allowed");
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str;
        if ("userdebug".equals(Build.TYPE) || "eng".equals(Build.TYPE)) {
            printWriter.print("=== dumping config for all packages\n");
            synchronized (this.a) {
                for (Map.Entry entry : this.b.entrySet()) {
                    String str2 = (String) entry.getKey();
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14);
                    sb.append("  -- package ");
                    sb.append(str2);
                    sb.append("\n");
                    printWriter.print(sb.toString());
                    for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                        String str3 = (String) entry2.getKey();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 18);
                        sb2.append("    -- namespace ");
                        sb2.append(str3);
                        sb2.append("\n");
                        printWriter.print(sb2.toString());
                        for (Map.Entry entry3 : ((TreeMap) entry2.getValue()).entrySet()) {
                            if (entry3.getValue() != null) {
                                String str4 = (String) entry3.getKey();
                                byte[] bArr = (byte[]) entry3.getValue();
                                if (bArr != null) {
                                    String str5 = new String(bArr, h);
                                    if (Arrays.equals(bArr, str5.getBytes(h))) {
                                        StringBuilder sb3 = new StringBuilder(str5.length() + 2);
                                        sb3.append("\"");
                                        sb3.append(str5);
                                        sb3.append("\"");
                                        str = sb3.toString();
                                    } else {
                                        StringBuilder sb4 = new StringBuilder();
                                        for (byte b2 : bArr) {
                                            sb4.append(n[(b2 >> 4) & 15]);
                                            sb4.append(n[b2 & 15]);
                                        }
                                        String sb5 = sb4.toString();
                                        StringBuilder sb6 = new StringBuilder(String.valueOf(sb5).length() + 2);
                                        sb6.append("<");
                                        sb6.append(sb5);
                                        sb6.append(">");
                                        str = sb6.toString();
                                    }
                                } else {
                                    str = "null";
                                }
                                StringBuilder sb7 = new StringBuilder(String.valueOf(str4).length() + 10 + String.valueOf(str).length());
                                sb7.append("      ");
                                sb7.append(str4);
                                sb7.append(" = ");
                                sb7.append(str);
                                sb7.append("\n");
                                printWriter.print(sb7.toString());
                            }
                        }
                    }
                }
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.config.START".equals(intent.getAction())) {
            return null;
        }
        b();
        return new joc(this, this);
    }

    public final void onCreate() {
        super.onCreate();
        this.k = new joq(this);
        this.m = getPackageManager();
        this.j = new jnz(this);
        synchronized (this.f) {
            this.g = new HashSet();
        }
        this.i = true;
        new Thread(new jnv(this)).start();
    }

    public final void onDestroy() {
        super.onDestroy();
        b();
        this.j.close();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x019b A[Catch:{ all -> 0x0201 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01c4 A[Catch:{ all -> 0x0201 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int onStartCommand(android.content.Intent r18, int r19, int r20) {
        /*
            r17 = this;
            r7 = r17
            r0 = r18
            r8 = 2
            if (r0 == 0) goto L_0x0378
            java.lang.String r1 = r18.getAction()
            java.lang.String r2 = "com.google.android.gms.config.OVERRIDE"
            boolean r1 = r2.equals(r1)
            r2 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0217
            r17.b()
            java.lang.String r1 = "__package__"
            java.lang.String r1 = r0.getStringExtra(r1)
            boolean r5 = r7.d(r1)
            if (r5 == 0) goto L_0x0378
            java.lang.String r5 = "__namespace__"
            java.lang.String r5 = r0.getStringExtra(r5)
            if (r5 != 0) goto L_0x0035
            java.lang.String r0 = "ConfigChimeraService"
            java.lang.String r1 = "specify namespace to override in __namespace__ extra"
            android.util.Log.w(r0, r1)
            goto L_0x0378
        L_0x0035:
            jnz r6 = r7.j
            android.database.sqlite.SQLiteDatabase r6 = r6.getWritableDatabase()
            java.lang.String r9 = "DELETE FROM override WHERE package = ? AND namespace = ? AND key = ?"
            android.database.sqlite.SQLiteStatement r9 = r6.compileStatement(r9)
            java.lang.String r10 = "INSERT OR REPLACE INTO override (package, namespace, key, value) VALUES (?, ?, ?, ?)"
            android.database.sqlite.SQLiteStatement r10 = r6.compileStatement(r10)
            r6.beginTransaction()
            android.os.Bundle r0 = r18.getExtras()     // Catch:{ all -> 0x0201 }
            java.util.Set r11 = r0.keySet()     // Catch:{ all -> 0x0201 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0201 }
        L_0x0056:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0201 }
            if (r12 != 0) goto L_0x00e5
            jnz r0 = r7.j     // Catch:{ all -> 0x0201 }
            r0.a = r4     // Catch:{ all -> 0x0201 }
            r6.setTransactionSuccessful()     // Catch:{ all -> 0x0201 }
            r9.close()
            r10.close()
            r6.endTransaction()     // Catch:{ IllegalStateException -> 0x00e1 }
            jnz r0 = r7.j
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String[] r5 = new java.lang.String[r4]
            r5[r2] = r1
            java.lang.String r6 = "SELECT namespace, key, value FROM main WHERE package = ? ORDER BY namespace, key"
            android.database.Cursor r5 = r0.rawQuery(r6, r5)
        L_0x0081:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00af
            java.lang.String r0 = r5.getString(r2)     // Catch:{ all -> 0x00dc }
            java.lang.String r6 = r5.getString(r4)     // Catch:{ all -> 0x00dc }
            byte[] r9 = r5.getBlob(r8)     // Catch:{ all -> 0x00dc }
            if (r6 == 0) goto L_0x0081
            if (r0 == 0) goto L_0x0081
            if (r9 == 0) goto L_0x0081
            java.lang.Object r10 = r3.get(r0)     // Catch:{ all -> 0x00dc }
            java.util.TreeMap r10 = (java.util.TreeMap) r10     // Catch:{ all -> 0x00dc }
            if (r10 != 0) goto L_0x00aa
            java.util.TreeMap r10 = new java.util.TreeMap     // Catch:{ all -> 0x00dc }
            r10.<init>()     // Catch:{ all -> 0x00dc }
            r3.put(r0, r10)     // Catch:{ all -> 0x00dc }
            goto L_0x00ab
        L_0x00aa:
        L_0x00ab:
            r10.put(r6, r9)     // Catch:{ all -> 0x00dc }
            goto L_0x0081
        L_0x00af:
            r5.close()
            jnz r0 = r7.j
            boolean r0 = r0.b
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = "experiment"
            r7.a((java.lang.String) r0, (java.lang.String) r1, (java.util.Map) r3)
        L_0x00bd:
            jnz r0 = r7.j
            boolean r0 = r0.a
            if (r0 == 0) goto L_0x00c8
            java.lang.String r0 = "override"
            r7.a((java.lang.String) r0, (java.lang.String) r1, (java.util.Map) r3)
        L_0x00c8:
            java.lang.Object r2 = r7.a
            monitor-enter(r2)
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x00d9 }
            if (r0 != 0) goto L_0x00d6
            java.util.Map r0 = r7.b     // Catch:{ all -> 0x00d9 }
            r0.put(r1, r3)     // Catch:{ all -> 0x00d9 }
        L_0x00d6:
            monitor-exit(r2)     // Catch:{ all -> 0x00d9 }
            goto L_0x0378
        L_0x00d9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00d9 }
            throw r0
        L_0x00dc:
            r0 = move-exception
            r5.close()
            throw r0
        L_0x00e1:
            r0 = move-exception
            r1 = r0
            goto L_0x020e
        L_0x00e5:
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0201 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0201 }
            if (r12 == 0) goto L_0x01fd
            java.lang.String r13 = "__package__"
            boolean r13 = r12.equals(r13)     // Catch:{ all -> 0x0201 }
            if (r13 != 0) goto L_0x01f9
            java.lang.String r13 = "__namespace__"
            boolean r13 = r12.equals(r13)     // Catch:{ all -> 0x0201 }
            if (r13 != 0) goto L_0x01f5
            java.lang.Object r13 = r0.get(r12)     // Catch:{ all -> 0x0201 }
            r14 = 4
            r15 = 3
            if (r13 != 0) goto L_0x0116
            r10.bindString(r4, r1)     // Catch:{ all -> 0x0201 }
            r10.bindString(r8, r5)     // Catch:{ all -> 0x0201 }
            r10.bindString(r15, r12)     // Catch:{ all -> 0x0201 }
            r10.bindNull(r14)     // Catch:{ all -> 0x0201 }
            r10.execute()     // Catch:{ all -> 0x0201 }
            goto L_0x0056
        L_0x0116:
            boolean r3 = r13 instanceof java.lang.String     // Catch:{ all -> 0x0201 }
            if (r3 == 0) goto L_0x0133
            r10.bindString(r4, r1)     // Catch:{ all -> 0x0201 }
            r10.bindString(r8, r5)     // Catch:{ all -> 0x0201 }
            r10.bindString(r15, r12)     // Catch:{ all -> 0x0201 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0201 }
            java.nio.charset.Charset r3 = h     // Catch:{ all -> 0x0201 }
            byte[] r3 = r13.getBytes(r3)     // Catch:{ all -> 0x0201 }
            r10.bindBlob(r14, r3)     // Catch:{ all -> 0x0201 }
            r10.execute()     // Catch:{ all -> 0x0201 }
            goto L_0x0056
        L_0x0133:
            boolean r3 = r13 instanceof java.lang.String[]     // Catch:{ all -> 0x0201 }
            if (r3 == 0) goto L_0x01db
            java.lang.String[] r13 = (java.lang.String[]) r13     // Catch:{ all -> 0x0201 }
            r3 = r13[r2]     // Catch:{ all -> 0x0201 }
            int r13 = r3.length()     // Catch:{ all -> 0x0201 }
            int r13 = r13 % r8
            if (r13 != 0) goto L_0x0198
            int r13 = r3.length()     // Catch:{ all -> 0x0201 }
            int r13 = r13 / r8
            byte[] r13 = new byte[r13]     // Catch:{ all -> 0x0201 }
        L_0x0149:
            int r14 = r3.length()     // Catch:{ all -> 0x0201 }
            if (r2 >= r14) goto L_0x0197
            char r14 = r3.charAt(r2)     // Catch:{ all -> 0x0201 }
            r15 = 48
            if (r14 < r15) goto L_0x015e
            r15 = 57
            if (r14 > r15) goto L_0x015e
            int r14 = r14 + -48
            goto L_0x0173
        L_0x015e:
            r15 = 65
            if (r14 < r15) goto L_0x0169
            r15 = 70
            if (r14 > r15) goto L_0x0169
            int r14 = r14 + -55
            goto L_0x0173
        L_0x0169:
            r15 = 97
            if (r14 < r15) goto L_0x0198
            r15 = 102(0x66, float:1.43E-43)
            if (r14 > r15) goto L_0x0195
            int r14 = r14 + -87
        L_0x0173:
            int r15 = r2 % 2
            if (r15 != 0) goto L_0x0185
            int r15 = r2 / 2
            byte r16 = r13[r15]     // Catch:{ all -> 0x0201 }
            r16 = r16 & 15
            int r14 = r14 << 4
            r14 = r16 | r14
            byte r14 = (byte) r14     // Catch:{ all -> 0x0201 }
            r13[r15] = r14     // Catch:{ all -> 0x0201 }
            goto L_0x018f
        L_0x0185:
            int r15 = r2 / 2
            byte r8 = r13[r15]     // Catch:{ all -> 0x0201 }
            r8 = r8 & 240(0xf0, float:3.36E-43)
            r8 = r8 | r14
            byte r8 = (byte) r8     // Catch:{ all -> 0x0201 }
            r13[r15] = r8     // Catch:{ all -> 0x0201 }
        L_0x018f:
            int r2 = r2 + 1
            r8 = 2
            r14 = 4
            r15 = 3
            goto L_0x0149
        L_0x0195:
            r13 = 0
            goto L_0x0199
        L_0x0197:
            goto L_0x0199
        L_0x0198:
            r13 = 0
        L_0x0199:
            if (r13 != 0) goto L_0x01c4
            java.lang.String r2 = "ConfigChimeraService"
            java.lang.String r8 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0201 }
            int r8 = r8.length()     // Catch:{ all -> 0x0201 }
            int r8 = r8 + 25
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0201 }
            r12.<init>(r8)     // Catch:{ all -> 0x0201 }
            java.lang.String r8 = "failed to parse \""
            r12.append(r8)     // Catch:{ all -> 0x0201 }
            r12.append(r3)     // Catch:{ all -> 0x0201 }
            java.lang.String r3 = "\" as hex"
            r12.append(r3)     // Catch:{ all -> 0x0201 }
            java.lang.String r3 = r12.toString()     // Catch:{ all -> 0x0201 }
            android.util.Log.w(r2, r3)     // Catch:{ all -> 0x0201 }
            r2 = 0
            r8 = 2
            goto L_0x0056
        L_0x01c4:
            r10.bindString(r4, r1)     // Catch:{ all -> 0x0201 }
            r2 = 2
            r10.bindString(r2, r5)     // Catch:{ all -> 0x0201 }
            r2 = 3
            r10.bindString(r2, r12)     // Catch:{ all -> 0x0201 }
            r2 = 4
            r10.bindBlob(r2, r13)     // Catch:{ all -> 0x0201 }
            r10.execute()     // Catch:{ all -> 0x0201 }
            r2 = 0
            r8 = 2
            goto L_0x0056
        L_0x01db:
            boolean r2 = r13 instanceof java.lang.Boolean     // Catch:{ all -> 0x0201 }
            if (r2 == 0) goto L_0x01f1
            r9.bindString(r4, r1)     // Catch:{ all -> 0x0201 }
            r2 = 2
            r9.bindString(r2, r5)     // Catch:{ all -> 0x0201 }
            r2 = 3
            r9.bindString(r2, r12)     // Catch:{ all -> 0x0201 }
            r9.execute()     // Catch:{ all -> 0x0201 }
            r2 = 0
            r8 = 2
            goto L_0x0056
        L_0x01f1:
            r2 = 0
            r8 = 2
            goto L_0x0056
        L_0x01f5:
            r2 = 0
            r8 = 2
            goto L_0x0056
        L_0x01f9:
            r2 = 0
            r8 = 2
            goto L_0x0056
        L_0x01fd:
            r2 = 0
            r8 = 2
            goto L_0x0056
        L_0x0201:
            r0 = move-exception
            r9.close()
            r10.close()
            r6.endTransaction()     // Catch:{ IllegalStateException -> 0x020c }
            throw r0
        L_0x020c:
            r0 = move-exception
            r1 = r0
        L_0x020e:
            java.lang.String r0 = "ConfigChimeraService"
            java.lang.String r2 = "Exception while ending the db transaction."
            android.util.Log.e(r0, r2, r1)
            goto L_0x0378
        L_0x0217:
            java.lang.String r1 = r18.getAction()
            java.lang.String r2 = "com.google.android.gms.config.INTERNAL_METADATA_OVERRIDE"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x031c
            r17.b()
            java.lang.String r1 = "__package__"
            java.lang.String r1 = r0.getStringExtra(r1)
            boolean r2 = r7.d(r1)
            if (r2 == 0) goto L_0x0378
            jnz r2 = r7.j
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()
            java.lang.String r3 = "DELETE FROM internal_metadata WHERE key = ?"
            android.database.sqlite.SQLiteStatement r3 = r2.compileStatement(r3)
            java.lang.String r5 = "INSERT OR REPLACE INTO internal_metadata (key, value) VALUES (?, ?)"
            android.database.sqlite.SQLiteStatement r5 = r2.compileStatement(r5)
            r2.beginTransaction()
            android.os.Bundle r0 = r18.getExtras()     // Catch:{ all -> 0x0307 }
            java.util.Set r6 = r0.keySet()     // Catch:{ all -> 0x0307 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0307 }
        L_0x0254:
            boolean r8 = r6.hasNext()     // Catch:{ all -> 0x0307 }
            if (r8 == 0) goto L_0x02bf
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0307 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0307 }
            if (r8 == 0) goto L_0x0254
            java.lang.String r9 = "__package__"
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x0307 }
            if (r9 != 0) goto L_0x0254
            java.lang.Object r9 = r0.get(r8)     // Catch:{ all -> 0x0307 }
            java.lang.String r10 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0307 }
            int r10 = r10.length()     // Catch:{ all -> 0x0307 }
            int r10 = r10 + r4
            int r11 = r8.length()     // Catch:{ all -> 0x0307 }
            int r10 = r10 + r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0307 }
            r11.<init>(r10)     // Catch:{ all -> 0x0307 }
            r11.append(r1)     // Catch:{ all -> 0x0307 }
            java.lang.String r10 = ":"
            r11.append(r10)     // Catch:{ all -> 0x0307 }
            r11.append(r8)     // Catch:{ all -> 0x0307 }
            java.lang.String r8 = r11.toString()     // Catch:{ all -> 0x0307 }
            if (r9 != 0) goto L_0x029d
            r5.bindString(r4, r8)     // Catch:{ all -> 0x0307 }
            r8 = 2
            r5.bindNull(r8)     // Catch:{ all -> 0x0307 }
            r5.execute()     // Catch:{ all -> 0x0307 }
            goto L_0x0254
        L_0x029d:
            boolean r10 = r9 instanceof java.lang.String     // Catch:{ all -> 0x0307 }
            if (r10 == 0) goto L_0x02b4
            r5.bindString(r4, r8)     // Catch:{ all -> 0x0307 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0307 }
            java.nio.charset.Charset r8 = h     // Catch:{ all -> 0x0307 }
            byte[] r8 = r9.getBytes(r8)     // Catch:{ all -> 0x0307 }
            r9 = 2
            r5.bindBlob(r9, r8)     // Catch:{ all -> 0x0307 }
            r5.execute()     // Catch:{ all -> 0x0307 }
            goto L_0x0254
        L_0x02b4:
            boolean r9 = r9 instanceof java.lang.Boolean     // Catch:{ all -> 0x0307 }
            if (r9 == 0) goto L_0x0254
            r3.bindString(r4, r8)     // Catch:{ all -> 0x0307 }
            r3.execute()     // Catch:{ all -> 0x0307 }
            goto L_0x0254
        L_0x02bf:
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x0307 }
            r3.close()
            r5.close()
            r2.endTransaction()     // Catch:{ IllegalStateException -> 0x0304 }
            jnz r0 = r7.j
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "SELECT key, value FROM internal_metadata"
            r3 = 0
            android.database.Cursor r2 = r0.rawQuery(r2, r3)
        L_0x02dd:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x02ff }
            if (r0 != 0) goto L_0x02f1
            r2.close()
            java.lang.Object r3 = r7.a
            monitor-enter(r3)
            r7.d = r1     // Catch:{ all -> 0x02ee }
            monitor-exit(r3)     // Catch:{ all -> 0x02ee }
            goto L_0x0378
        L_0x02ee:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x02ee }
            throw r0
        L_0x02f1:
            r0 = 0
            java.lang.String r3 = r2.getString(r0)     // Catch:{ all -> 0x02ff }
            byte[] r5 = r2.getBlob(r4)     // Catch:{ all -> 0x02ff }
            r1.put(r3, r5)     // Catch:{ all -> 0x02ff }
            goto L_0x02dd
        L_0x02ff:
            r0 = move-exception
            r2.close()
            throw r0
        L_0x0304:
            r0 = move-exception
            r1 = r0
            goto L_0x0314
        L_0x0307:
            r0 = move-exception
            r3.close()
            r5.close()
            r2.endTransaction()     // Catch:{ IllegalStateException -> 0x0312 }
            throw r0
        L_0x0312:
            r0 = move-exception
            r1 = r0
        L_0x0314:
            java.lang.String r0 = "ConfigChimeraService"
            java.lang.String r2 = "Exception while ending the db transaction."
            android.util.Log.e(r0, r2, r1)
            goto L_0x0378
        L_0x031c:
            r3 = 0
            java.lang.String r1 = r18.getAction()
            java.lang.String r2 = "com.google.android.gms.config.ACTION_PACKAGE_DATA_CLEARED"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0335
            java.lang.String r1 = r18.getAction()
            java.lang.String r2 = "com.google.android.gms.config.ACTION_PACKAGE_FULLY_REMOVED"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0378
        L_0x0335:
            java.lang.String r1 = r18.getAction()
            java.lang.String r2 = "com.google.android.gms.config.ACTION_PACKAGE_DATA_CLEARED"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0349
            java.lang.String r2 = "com.google.android.gms.config.ACTION_PACKAGE_FULLY_REMOVED"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0378
        L_0x0349:
            android.net.Uri r0 = r18.getData()
            java.lang.String r2 = r0.getSchemeSpecificPart()
            if (r2 == 0) goto L_0x0378
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0378
            java.lang.Object r1 = r7.a
            monitor-enter(r1)
            java.util.Map r0 = r7.d     // Catch:{ all -> 0x0375 }
            if (r0 == 0) goto L_0x0367
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0375 }
            r3.<init>(r0)     // Catch:{ all -> 0x0375 }
            r5 = r3
            goto L_0x0368
        L_0x0367:
            r5 = r3
        L_0x0368:
            monitor-exit(r1)     // Catch:{ all -> 0x0375 }
            a((java.util.Map) r5, (java.lang.String) r2)
            r3 = 0
            r4 = 0
            r6 = 0
            r1 = r17
            r1.a((java.lang.String) r2, (java.util.HashMap) r3, (defpackage.job) r4, (java.util.Map) r5, (java.util.List) r6)
            goto L_0x0378
        L_0x0375:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0375 }
            throw r0
        L_0x0378:
            r17.stopSelf()
            r1 = 2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.config.ConfigChimeraService.onStartCommand(android.content.Intent, int, int):int");
    }

    public final DataHolder b(List list) {
        ilm d2 = ilk.d();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ilk.a(d2, new ConfigExperimentPayload((byte[]) it.next()));
            }
        }
        return d2.a(0);
    }

    public static String a(Map map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append("@@");
            sb.append((String) entry.getValue());
            sb.append("##");
        }
        return sb.toString();
    }

    public final DataHolder b(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry2 : ((TreeMap) entry.getValue()).entrySet()) {
                    bundle2.putByteArray((String) entry2.getKey(), (byte[]) entry2.getValue());
                }
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
        PackageConfigTable packageConfigTable = new PackageConfigTable(bundle);
        ilm d2 = ilk.d();
        ilk.a(d2, packageConfigTable);
        return d2.a(0);
    }

    static List a(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(str2)));
                } catch (NumberFormatException e2) {
                    String valueOf = String.valueOf(str2);
                    Log.e("ConfigChimeraService", valueOf.length() == 0 ? new String("Cannot parse fetch metadata timestamp ") : "Cannot parse fetch metadata timestamp ".concat(valueOf), e2);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        try {
            synchronized (this.j) {
                while (this.i) {
                    this.j.wait();
                }
            }
        } catch (InterruptedException e2) {
            Log.e("ConfigChimeraService", "interrupted during initial load", e2);
        }
    }

    public static List a(List list, long j2, int i2) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
        }
        arrayList.add(0, Long.valueOf(j2));
        return arrayList.size() > i2 ? arrayList.subList(0, i2) : arrayList;
    }

    private static final void a(SQLiteDatabase sQLiteDatabase, String str, Map map) {
        byte[] bArr;
        Cursor rawQuery = sQLiteDatabase.rawQuery(str.length() == 0 ? new String("SELECT package, namespace, key, value FROM ") : "SELECT package, namespace, key, value FROM ".concat(str), (String[]) null);
        while (rawQuery.moveToNext()) {
            try {
                String string = rawQuery.getString(0);
                String string2 = rawQuery.getString(1);
                String string3 = rawQuery.getString(2);
                if (!rawQuery.isNull(3)) {
                    bArr = rawQuery.getBlob(3);
                } else {
                    bArr = null;
                }
                if (!(string == null || string2 == null || string3 == null)) {
                    HashMap hashMap = (HashMap) map.get(string);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        map.put(string, hashMap);
                    }
                    TreeMap treeMap = (TreeMap) hashMap.get(string2);
                    if (treeMap == null) {
                        treeMap = new TreeMap();
                        hashMap.put(string2, treeMap);
                    }
                    if (bArr != null) {
                        treeMap.put(string3, bArr);
                    } else {
                        treeMap.remove(string3);
                    }
                }
            } finally {
                rawQuery.close();
            }
        }
    }

    private final void a(String str, String str2, Map map) {
        byte[] bArr;
        StringBuilder sb = new StringBuilder(str.length() + 52);
        sb.append("SELECT namespace, key, value FROM ");
        sb.append(str);
        sb.append(" WHERE package = ?");
        Cursor rawQuery = this.j.getReadableDatabase().rawQuery(sb.toString(), new String[]{str2});
        while (rawQuery.moveToNext()) {
            try {
                String string = rawQuery.getString(0);
                String string2 = rawQuery.getString(1);
                if (!rawQuery.isNull(2)) {
                    bArr = rawQuery.getBlob(2);
                } else {
                    bArr = null;
                }
                "experiment".equals(str);
                if (!(string == null || string2 == null)) {
                    TreeMap treeMap = (TreeMap) map.get(string);
                    if (bArr != null) {
                        if (treeMap == null) {
                            treeMap = new TreeMap();
                            map.put(string, treeMap);
                        }
                        treeMap.put(string2, bArr);
                    } else if (treeMap != null) {
                        treeMap.remove(string2);
                    }
                }
            } finally {
                rawQuery.close();
            }
        }
    }

    public static final void a(Map map, String str) {
        if (map != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25);
            sb.append(str);
            sb.append(":http_read_timeout_millis");
            map.remove(sb.toString());
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 31);
            sb2.append(str);
            sb2.append(":http_connection_timeout_millis");
            map.remove(sb2.toString());
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 36);
            sb3.append(str);
            sb3.append(":throttling_failure_interval_seconds");
            map.remove(sb3.toString());
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 36);
            sb4.append(str);
            sb4.append(":throttling_success_interval_seconds");
            map.remove(sb4.toString());
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 24);
            sb5.append(str);
            sb5.append(":throttling_failure_rate");
            map.remove(sb5.toString());
            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 24);
            sb6.append(str);
            sb6.append(":throttling_success_rate");
            map.remove(sb6.toString());
        }
    }

    public final int a(String str, String str2, int i2, int i3, int i4) {
        HashMap hashMap;
        synchronized (this.a) {
            Map map = this.d;
            if (map != null) {
                hashMap = new HashMap(map);
            } else {
                hashMap = null;
            }
        }
        if (hashMap == null || hashMap.isEmpty()) {
            return i2;
        }
        if (!hashMap.isEmpty()) {
            String str3 = str2.length() == 0 ? new String("all_packages:") : "all_packages:".concat(str2);
            if (hashMap.get(str3) != null) {
                try {
                    i2 = Integer.parseInt(new String((byte[]) hashMap.get(str3), h));
                } catch (NumberFormatException e2) {
                    Log.w("ConfigChimeraService", "metadata not in the right format", e2);
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + str2.length());
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            String sb2 = sb.toString();
            if (hashMap.get(sb2) != null) {
                try {
                    i2 = Integer.parseInt(new String((byte[]) hashMap.get(sb2), h));
                } catch (NumberFormatException e3) {
                    Log.w("ConfigChimeraService", "metadata not in the right format", e3);
                }
            }
        }
        if (i2 > i4) {
            return i4;
        }
        return i2 < i3 ? i3 : i2;
    }

    /* JADX INFO: finally extract failed */
    public final void a() {
        int i2;
        HashMap hashMap;
        try {
            SQLiteDatabase readableDatabase = this.j.getReadableDatabase();
            HashMap hashMap2 = new HashMap();
            Cursor rawQuery = readableDatabase.rawQuery("SELECT package, namespace, key, value FROM main ORDER BY package, namespace, key", (String[]) null);
            String str = null;
            String str2 = null;
            HashMap hashMap3 = null;
            TreeMap treeMap = null;
            while (true) {
                try {
                    i2 = 3;
                    if (!rawQuery.moveToNext()) {
                        break;
                    }
                    String string = rawQuery.getString(0);
                    String string2 = rawQuery.getString(1);
                    String string3 = rawQuery.getString(2);
                    byte[] blob = rawQuery.getBlob(3);
                    if (!(string == null || string2 == null || string3 == null || blob == null)) {
                        if (!string.equals(str)) {
                            treeMap = new TreeMap();
                            HashMap hashMap4 = new HashMap();
                            hashMap4.put(string2, treeMap);
                            hashMap2.put(string, hashMap4);
                            hashMap3 = hashMap4;
                            str = string;
                            str2 = string2;
                        }
                        if (!string2.equals(str2)) {
                            TreeMap treeMap2 = new TreeMap();
                            hashMap3.put(string2, treeMap2);
                            treeMap = treeMap2;
                            str2 = string2;
                        }
                        treeMap.put(string3, blob);
                    }
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            }
            rawQuery.close();
            if (this.j.b) {
                a(readableDatabase, "experiment", (Map) hashMap2);
            }
            if (this.j.a) {
                a(readableDatabase, "override", (Map) hashMap2);
            }
            HashMap hashMap5 = new HashMap();
            Cursor rawQuery2 = readableDatabase.rawQuery("SELECT package, namespace_digest, recent_success_times, recent_failure_times, device_context_digest, app_context_digest FROM fetch_metadata", (String[]) null);
            while (rawQuery2.moveToNext()) {
                try {
                    String string4 = rawQuery2.getString(0);
                    String string5 = rawQuery2.getString(1);
                    String string6 = rawQuery2.getString(2);
                    String string7 = rawQuery2.getString(i2);
                    byte[] blob2 = rawQuery2.getBlob(4);
                    byte[] blob3 = rawQuery2.getBlob(5);
                    List a2 = a(string6);
                    List a3 = a(string7);
                    if (!TextUtils.isEmpty(string5)) {
                        HashMap hashMap6 = new HashMap();
                        for (String split : string5.split("##")) {
                            String[] split2 = split.split("@@");
                            if (split2 != null && split2.length == 2) {
                                hashMap6.put(split2[0], split2[1]);
                            }
                        }
                        hashMap = hashMap6;
                    } else {
                        hashMap = new HashMap();
                    }
                    hashMap5.put(string4, new job(a2, a3, hashMap, blob2, blob3));
                    i2 = 3;
                } catch (Throwable th2) {
                    rawQuery2.close();
                    throw th2;
                }
            }
            rawQuery2.close();
            HashMap hashMap7 = new HashMap();
            Cursor rawQuery3 = readableDatabase.rawQuery("SELECT key, value FROM internal_metadata", (String[]) null);
            while (rawQuery3.moveToNext()) {
                try {
                    hashMap7.put(rawQuery3.getString(0), rawQuery3.getBlob(1));
                } catch (Throwable th3) {
                    rawQuery3.close();
                    throw th3;
                }
            }
            rawQuery3.close();
            HashMap hashMap8 = new HashMap();
            Cursor rawQuery4 = readableDatabase.rawQuery("SELECT package, payload FROM experiment_payload", (String[]) null);
            while (rawQuery4.moveToNext()) {
                try {
                    String string8 = rawQuery4.getString(0);
                    byte[] blob4 = rawQuery4.getBlob(1);
                    List list = (List) hashMap8.get(string8);
                    if (list == null) {
                        list = new ArrayList();
                        hashMap8.put(string8, list);
                    }
                    list.add(blob4);
                } catch (Throwable th4) {
                    rawQuery4.close();
                    throw th4;
                }
            }
            rawQuery4.close();
            synchronized (this.a) {
                this.b = hashMap2;
                this.c = hashMap5;
                this.d = hashMap7;
                this.e = hashMap8;
            }
        } catch (Exception e2) {
            Log.e("ConfigChimeraService", "Cannot open config database.", e2);
        }
    }

    public final void a(acrz acrz) {
        if (acrz.e()) {
            acrz.c();
        }
    }

    public final void a(String str, HashMap hashMap, job job, Map map, List list) {
        SQLiteDatabase sQLiteDatabase;
        IllegalStateException illegalStateException;
        HashMap hashMap2;
        String str2 = str;
        HashMap hashMap3 = hashMap;
        job job2 = job;
        Map map2 = map;
        List list2 = list;
        try {
            sQLiteDatabase = this.j.getWritableDatabase();
        } catch (IllegalStateException e2) {
            Log.e("ConfigChimeraService", "Database not in a state to be opened. We are probably being destroyed.", e2);
            sQLiteDatabase = null;
        }
        if (sQLiteDatabase != null) {
            try {
                SQLiteStatement compileStatement = sQLiteDatabase.compileStatement("DELETE FROM main WHERE package = ?");
                SQLiteStatement compileStatement2 = sQLiteDatabase.compileStatement("INSERT INTO main (package, namespace, key, value) VALUES (?, ?, ?, ?)");
                SQLiteStatement compileStatement3 = sQLiteDatabase.compileStatement("DELETE FROM fetch_metadata WHERE package = ?");
                SQLiteStatement compileStatement4 = sQLiteDatabase.compileStatement("INSERT INTO fetch_metadata (package, namespace_digest, recent_success_times, recent_failure_times, device_context_digest, app_context_digest) VALUES (?, ?, ?, ?, ?, ?)");
                SQLiteStatement compileStatement5 = sQLiteDatabase.compileStatement("DELETE FROM internal_metadata");
                SQLiteStatement compileStatement6 = sQLiteDatabase.compileStatement("INSERT INTO internal_metadata (key, value) VALUES (?, ?)");
                SQLiteStatement compileStatement7 = sQLiteDatabase.compileStatement("DELETE FROM experiment_payload WHERE package = ?");
                SQLiteStatement compileStatement8 = sQLiteDatabase.compileStatement("INSERT INTO experiment_payload (package, payload) values (?, ?)");
                sQLiteDatabase.beginTransaction();
                try {
                    compileStatement.bindString(1, str2);
                    compileStatement.execute();
                    if (hashMap3 != null) {
                        try {
                            compileStatement2.bindString(1, str2);
                            Iterator it = hashMap.keySet().iterator();
                            while (it.hasNext()) {
                                Iterator it2 = it;
                                String str3 = (String) it.next();
                                TreeMap treeMap = (TreeMap) hashMap3.get(str3);
                                if (treeMap != null) {
                                    compileStatement2.bindString(2, str3);
                                    for (Iterator it3 = treeMap.entrySet().iterator(); it3.hasNext(); it3 = it3) {
                                        Map.Entry entry = (Map.Entry) it3.next();
                                        compileStatement2.bindString(3, (String) entry.getKey());
                                        compileStatement2.bindBlob(4, (byte[]) entry.getValue());
                                        compileStatement2.execute();
                                    }
                                    hashMap3 = hashMap;
                                    it = it2;
                                } else {
                                    hashMap3 = hashMap;
                                    it = it2;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            compileStatement.close();
                            compileStatement2.close();
                            compileStatement3.close();
                            compileStatement4.close();
                            compileStatement5.close();
                            compileStatement6.close();
                            compileStatement7.close();
                            compileStatement8.close();
                            try {
                                sQLiteDatabase.endTransaction();
                                throw th;
                            } catch (IllegalStateException e3) {
                                illegalStateException = e3;
                                Log.e("ConfigChimeraService", "Exception while ending the db transaction.", illegalStateException);
                            }
                        }
                    }
                    compileStatement3.bindString(1, str2);
                    compileStatement3.execute();
                    if (job2 != null) {
                        compileStatement4.bindString(1, str2);
                        compileStatement4.bindString(2, job.b());
                        compileStatement4.bindString(3, a(job2.d));
                        compileStatement4.bindString(4, job.a());
                        byte[] bArr = job2.b;
                        if (bArr != null) {
                            compileStatement4.bindBlob(5, bArr);
                        } else {
                            compileStatement4.bindNull(5);
                        }
                        byte[] bArr2 = job2.c;
                        if (bArr2 != null) {
                            compileStatement4.bindBlob(6, bArr2);
                        } else {
                            compileStatement4.bindNull(6);
                        }
                        compileStatement4.execute();
                    }
                    compileStatement5.execute();
                    if (map2 != null) {
                        for (Iterator it4 = map.entrySet().iterator(); it4.hasNext(); it4 = it4) {
                            Map.Entry entry2 = (Map.Entry) it4.next();
                            compileStatement6.bindString(1, (String) entry2.getKey());
                            compileStatement6.bindBlob(2, (byte[]) entry2.getValue());
                            compileStatement6.execute();
                        }
                    }
                    compileStatement7.bindString(1, str2);
                    compileStatement7.execute();
                    if (list2 != null && !list.isEmpty()) {
                        Iterator it5 = list.iterator();
                        while (it5.hasNext()) {
                            compileStatement8.bindString(1, str2);
                            compileStatement8.bindBlob(2, (byte[]) it5.next());
                            compileStatement8.execute();
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    compileStatement.close();
                    compileStatement2.close();
                    compileStatement3.close();
                    compileStatement4.close();
                    compileStatement5.close();
                    compileStatement6.close();
                    compileStatement7.close();
                    compileStatement8.close();
                    try {
                        sQLiteDatabase.endTransaction();
                        if (!this.j.b) {
                            hashMap2 = hashMap;
                        } else {
                            if (hashMap == null) {
                                hashMap2 = new HashMap();
                            } else {
                                hashMap2 = hashMap;
                            }
                            a("experiment", str2, (Map) hashMap2);
                        }
                        if (this.j.a) {
                            if (hashMap2 == null) {
                                hashMap2 = new HashMap();
                            }
                            a("override", str2, (Map) hashMap2);
                        }
                        synchronized (this.a) {
                            Map map3 = this.b;
                            if (map3 != null) {
                                if (hashMap2 == null) {
                                    map3.remove(str2);
                                } else {
                                    map3.put(str2, hashMap2);
                                }
                            }
                            Map map4 = this.c;
                            if (map4 != null) {
                                if (job2 != null) {
                                    map4.put(str2, job2);
                                } else {
                                    map4.remove(str2);
                                }
                            }
                            Map map5 = this.d;
                            if (map5 != null) {
                                map5.clear();
                                if (map2 != null) {
                                    this.d.putAll(map2);
                                }
                            }
                            Map map6 = this.e;
                            if (map6 != null) {
                                if (list2 != null) {
                                    map6.put(str2, list2);
                                } else {
                                    map6.remove(str2);
                                }
                            }
                        }
                    } catch (IllegalStateException e4) {
                        illegalStateException = e4;
                        Log.e("ConfigChimeraService", "Exception while ending the db transaction.", illegalStateException);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    compileStatement.close();
                    compileStatement2.close();
                    compileStatement3.close();
                    compileStatement4.close();
                    compileStatement5.close();
                    compileStatement6.close();
                    compileStatement7.close();
                    compileStatement8.close();
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            } catch (IllegalStateException e5) {
                Log.e("ConfigChimeraService", "Couldn't compile db statements.", e5);
            }
        }
    }

    public final void a(jop jop, int i2) {
        DataHolder b2 = b((Map) null);
        DataHolder b3 = b((List) null);
        jop.a(Status.a, new FetchConfigIpcResponse(i2, b2, b3));
        if (b2 != null && !b2.b()) {
            b2.close();
        }
        if (b3 != null && !b3.b()) {
            b3.close();
        }
    }

    public final boolean a(int i2, String str) {
        int i3 = -1;
        try {
            ApplicationInfo applicationInfo = this.m.getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                i3 = applicationInfo.uid;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("ConfigChimeraService", "no such package to check permission for", e2);
        }
        if (i2 == i3) {
            return true;
        }
        return false;
    }

    public final byte[] a(String str, Map map) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update((byte) 0);
            instance.update(str.getBytes(h));
            instance.update((byte) 0);
            for (Map.Entry entry : map.entrySet()) {
                instance.update(((String) entry.getKey()).getBytes(h));
                instance.update((byte) 0);
                instance.update(((String) entry.getValue()).getBytes(h));
                instance.update((byte) 0);
            }
            return instance.digest();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}
