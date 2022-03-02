package com.google.android.gms.common.download;

import android.app.DownloadManager;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.StatFs;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DownloadIntentOperation extends IntentOperation {
    private static final Object c = new Object();
    private static final Object d = new Object();
    private static final Pattern e = Pattern.compile("[a-zA-Z0-9_\\.]+");
    private static boolean f = false;
    acrz a;
    acry b;

    static SharedPreferences a(Context context) {
        return context.getSharedPreferences("DownloadService", 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File b(android.content.Context r2, java.lang.String r3) {
        /*
            java.lang.Object r0 = d
            monitor-enter(r0)
            com.google.android.gms.common.download.DownloadDetails r3 = defpackage.ipt.c(r2, r3)     // Catch:{ all -> 0x0018 }
            if (r3 == 0) goto L_0x0015
            boolean r1 = b((android.content.Context) r2, (com.google.android.gms.common.download.DownloadDetails) r3)     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x0015
            java.io.File r2 = defpackage.ipu.a(r2, r3)     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r2
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            r2 = 0
            return r2
        L_0x0018:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.download.DownloadIntentOperation.b(android.content.Context, java.lang.String):java.io.File");
    }

    private final void c() {
        a(awud.a.a().b());
    }

    public static void d(Context context, String str) {
        synchronized (d) {
            Uri a2 = ipt.a(str);
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("enabled", 0);
            contentValues.put("retries", 0);
            context.getContentResolver().update(a2, contentValues, (String) null, (String[]) null);
        }
    }

    public static Status e(Context context, String str) {
        DownloadDetails c2 = ipt.c(context, str);
        if (c2 == null) {
            return a(context, 13);
        }
        if (!a(context, c2)) {
            return a(context, 7011);
        }
        if (a(context, c2.a)) {
            return a(context, 7010);
        }
        if (!a(context, c2.c)) {
            return a(context, 7012);
        }
        Cursor query = context.getContentResolver().query(ipt.a(str), ipt.e, (String) null, (String[]) null, (String) null);
        long j = -1;
        if (query != null) {
            try {
                if (query.moveToNext() && !query.isNull(1)) {
                    j = query.getLong(1);
                }
            } finally {
                query.close();
            }
        }
        int i = 0;
        Cursor a2 = ipt.a((DownloadManager) context.getSystemService("download"), new DownloadManager.Query().setFilterById(new long[]{j}));
        if (a2 != null) {
            int columnIndex = a2.getColumnIndex("status");
            if (columnIndex != -1) {
                try {
                    if (a2.moveToNext()) {
                        i = a2.getInt(columnIndex);
                    }
                } finally {
                    a2.close();
                }
            } else {
                throw new IllegalArgumentException("Unable to resolve 'COLUMN_STATUS'!");
            }
        }
        if ((i & 7) != 0) {
            return a(context, 7001);
        }
        return a(context, 7000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0234, code lost:
        r2.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0238, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x023c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0240, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0244, code lost:
        r2 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x024c, code lost:
        if (r2.hasNext() != false) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x024e, code lost:
        r2 = new java.io.File(defpackage.ipu.b(r19));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x025b, code lost:
        if (r2.exists() != false) goto L_0x025e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0262, code lost:
        if (r2.isDirectory() == false) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0264, code lost:
        r3 = r2.list();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0268, code lost:
        if (r3 == null) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x026a, code lost:
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x026c, code lost:
        if (r7 >= r4) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x026e, code lost:
        r8 = r3[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0274, code lost:
        if (r0.contains(r8) != false) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0276, code lost:
        new java.io.File(r2, r8).delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x027e, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0281, code lost:
        r0 = (android.app.DownloadManager) getSystemService("download");
        r2 = defpackage.ipt.a(r0, new android.app.DownloadManager.Query().setFilterByStatus(16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0298, code lost:
        if (r2 == null) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x029e, code lost:
        if (r2.moveToNext() == false) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02a0, code lost:
        r3 = r2.getLong(r2.getColumnIndexOrThrow("_id"));
        r7 = a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02ae, code lost:
        if (r7 == null) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02b0, code lost:
        defpackage.ipt.a((android.content.Context) r1, r7);
        r0.remove(new long[]{r3});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02c0, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02c3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02c4, code lost:
        r2 = defpackage.ipt.a(r0, new android.app.DownloadManager.Query().setFilterByStatus(8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02d3, code lost:
        if (r2 == null) goto L_0x0319;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02d9, code lost:
        if (r2.moveToNext() == false) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02db, code lost:
        r3 = r2.getLong(r2.getColumnIndexOrThrow("_id"));
        r0 = a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02e9, code lost:
        if (r0 == null) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02ef, code lost:
        if (a((android.content.Context) r1, r0) != false) goto L_0x030c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02f1, code lost:
        r0 = com.google.android.chimera.IntentOperation.getStartIntent((android.content.Context) r1, com.google.android.gms.common.download.DownloadCompleteIntentOperation.class, "android.intent.action.DOWNLOAD_COMPLETE");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02f9, code lost:
        if (r0 == null) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02fb, code lost:
        r0.putExtra("extra_download_id", r3);
        startService(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0304, code lost:
        android.util.Log.e("GmsDownloadIntentOp", "IntentOperation.getStartIntent() returned null!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x030c, code lost:
        defpackage.ipt.b((android.content.Context) r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0314, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0315, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0318, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0319, code lost:
        c();
        r2 = c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x031e, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:?, code lost:
        f = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0321, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0322, code lost:
        b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0325, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        r3 = (com.google.android.gms.common.download.DownloadDetails) r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        r4 = (android.app.DownloadManager) getSystemService("download");
        r7 = new android.app.DownloadManager.Request(android.net.Uri.parse(r3.b)).setTitle(r3.a).setVisibleInDownloadsUi(false).setAllowedOverRoaming(false);
        r8 = getContentResolver().query(defpackage.ipt.a(r3.a), defpackage.ipt.f, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0365, code lost:
        if (r8 != null) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0367, code lost:
        android.util.Log.wtf("DownloadServiceState", "getNotification Cursor was null", new java.lang.Exception());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0373, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0379, code lost:
        if (r8.moveToNext() != false) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x037b, code lost:
        android.util.Log.w("DownloadServiceState", "No pending download found.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0388, code lost:
        if (r8.isNull(2) != false) goto L_0x03a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x038f, code lost:
        if (r8.isNull(3) != false) goto L_0x03a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0391, code lost:
        r12 = new android.util.Pair(r8.getString(2), r8.getString(3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03a2, code lost:
        r8.close();
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03a6, code lost:
        if (r12 == null) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03a8, code lost:
        r7.setTitle((java.lang.CharSequence) r12.first);
        r7.setDescription((java.lang.CharSequence) r12.second);
        r7.setNotificationVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03ba, code lost:
        r7.setNotificationVisibility(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03be, code lost:
        r8 = defpackage.ipt.a(r3.a);
        r11 = new android.content.ContentValues(2);
        r11.putNull("notificationTitle");
        r11.putNull("notificationDescription");
        getContentResolver().update(r8, r11, (java.lang.String) null, (java.lang.String[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        r7 = r4.enqueue(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:?, code lost:
        r3 = r3.a;
        r4 = new android.content.ContentValues();
        r4.put("dm_id", java.lang.Long.valueOf(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03fa, code lost:
        if (getContentResolver().update(defpackage.ipt.a(r3), r4, (java.lang.String) null, (java.lang.String[]) null) != 0) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03fc, code lost:
        android.util.Log.e("DownloadServiceState", "Failed to update DownloadManager id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0405, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x040e, code lost:
        throw new java.lang.IllegalArgumentException("Insert returned null", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x040f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0410, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0413, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0415, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x041a, code lost:
        monitor-enter(c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:?, code lost:
        f = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0423, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0427, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0429, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x042e, code lost:
        monitor-enter(c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        f = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0432, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0437, code lost:
        monitor-enter(c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:?, code lost:
        f = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0443, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0444, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0449, code lost:
        monitor-enter(c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        f = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x044d, code lost:
        b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0450, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013f, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r0 = new java.util.TreeSet();
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        new org.json.JSONArray(defpackage.awud.b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r3 = new java.util.HashSet();
        getSystemService("download");
        r4 = defpackage.ipt.a((android.app.DownloadManager) getSystemService("download"), new android.app.DownloadManager.Query().setFilterByStatus(15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0176, code lost:
        if (r4 != null) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r8 = r4.getColumnIndexOrThrow("_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0183, code lost:
        if (r4.moveToNext() == false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0185, code lost:
        r9 = defpackage.ipt.a((android.content.Context) r1, r4.getLong(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x018d, code lost:
        if (r9 == null) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x018f, code lost:
        r3.add(r9.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0198, code lost:
        r4 = defpackage.ipt.a((android.content.Context) r19);
        r8 = r4.length;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019f, code lost:
        if (r9 >= r8) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a1, code lost:
        r11 = r4[r9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a7, code lost:
        if (a((android.content.Context) r1, r11) == false) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a9, code lost:
        r0.add(r11.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b4, code lost:
        if (r3.contains(r11.a) == false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b8, code lost:
        r14 = defpackage.ipt.a(r11.a);
        r12 = defpackage.ipt.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c0, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r13 = getContentResolver().query(r14, defpackage.ipt.c, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d1, code lost:
        if (r13 != null) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d3, code lost:
        android.util.Log.wtf("DownloadServiceState", "getDownloadFailedCount Cursor was null", new java.lang.Exception());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01df, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e0, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e6, code lost:
        if (r13.moveToNext() != false) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01eb, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ec, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r14 = r13.getInt(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f6, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0204, code lost:
        if (((long) r14) > defpackage.awud.a.c().h()) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0207, code lost:
        if (r7 == false) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0209, code lost:
        r12 = defpackage.ipt.a(r11.a);
        r13 = new android.content.ContentValues(1);
        r13.put("retries", 0);
        getContentResolver().update(r12, r13, (java.lang.String) null, (java.lang.String[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x022a, code lost:
        if (a((android.content.Context) r1, r11.a) != false) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0232, code lost:
        if (a((android.content.Context) r1, r11.c) == false) goto L_0x0240;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r20) {
        /*
            r19 = this;
            r1 = r19
            long r2 = android.os.SystemClock.elapsedRealtime()
            android.content.SharedPreferences r4 = a((android.content.Context) r19)
            java.lang.String r0 = "boot"
            r5 = r20
            boolean r0 = r5.hasExtra(r0)
            r5 = 1
            r6 = 0
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = "ds__last_process__"
            r7 = 0
            long r9 = r4.getLong(r0, r7)
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x003b
            java.lang.String r0 = "ds__last_reset__"
            long r7 = r4.getLong(r0, r7)
            long r7 = r2 - r7
            awud r0 = defpackage.awud.a
            awue r0 = r0.a()
            long r9 = r0.g()
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r7 = 0
            goto L_0x004f
        L_0x003b:
            android.content.SharedPreferences$Editor r0 = r4.edit()
            java.lang.String r7 = "ds__next_alarm__"
            android.content.SharedPreferences$Editor r0 = r0.remove(r7)
            java.lang.String r7 = "ds__last_reset__"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r7, r2)
            r0.apply()
            r7 = 1
        L_0x004f:
            awud r0 = defpackage.awud.a
            awue r0 = r0.a()
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x005f
            r19.c()
            return
        L_0x005f:
            java.lang.String r0 = "ds__downloads_json__"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x011b
            android.content.SharedPreferences r0 = a((android.content.Context) r19)     // Catch:{ JSONException -> 0x00f7 }
            android.content.SharedPreferences$Editor r8 = r0.edit()     // Catch:{ JSONException -> 0x00f7 }
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r10 = "ds__downloads_json__"
            java.lang.String r11 = "[]"
            java.lang.String r10 = r0.getString(r10, r11)     // Catch:{ JSONException -> 0x00f7 }
            r9.<init>(r10)     // Catch:{ JSONException -> 0x00f7 }
            r10 = 0
        L_0x007e:
            int r11 = r9.length()     // Catch:{ JSONException -> 0x00f7 }
            if (r10 >= r11) goto L_0x00f1
            com.google.android.gms.common.download.DownloadDetails r11 = new com.google.android.gms.common.download.DownloadDetails     // Catch:{ JSONException -> 0x00f7 }
            org.json.JSONObject r12 = r9.getJSONObject(r10)     // Catch:{ JSONException -> 0x00f7 }
            r11.<init>((org.json.JSONObject) r12)     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r12 = r11.a     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r13 = "__enabled__"
            java.lang.String r12 = r12.concat(r13)     // Catch:{ JSONException -> 0x00f7 }
            boolean r12 = r0.getBoolean(r12, r6)     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r13 = r11.a     // Catch:{ JSONException -> 0x00f7 }
            com.google.android.gms.common.download.DownloadDetails r13 = defpackage.ipt.c(r1, r13)     // Catch:{ JSONException -> 0x00f7 }
            if (r13 == 0) goto L_0x00a6
            goto L_0x00a9
        L_0x00a6:
            defpackage.ipt.a(r1, r11, r12)     // Catch:{ JSONException -> 0x00f7 }
        L_0x00a9:
            java.lang.String r12 = r11.a     // Catch:{ JSONException -> 0x00f7 }
            android.content.SharedPreferences$Editor r12 = r8.remove(r12)     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r13 = r11.a     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r14 = "__enabled__"
            java.lang.String r13 = r13.concat(r14)     // Catch:{ JSONException -> 0x00f7 }
            android.content.SharedPreferences$Editor r12 = r12.remove(r13)     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r13 = r11.a     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r14 = "__sha1__"
            java.lang.String r13 = r13.concat(r14)     // Catch:{ JSONException -> 0x00f7 }
            android.content.SharedPreferences$Editor r12 = r12.remove(r13)     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r13 = r11.a     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r14 = "__dest__"
            java.lang.String r13 = r13.concat(r14)     // Catch:{ JSONException -> 0x00f7 }
            android.content.SharedPreferences$Editor r12 = r12.remove(r13)     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r11 = r11.a     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r13 = "__failed__"
            java.lang.String r11 = r11.concat(r13)     // Catch:{ JSONException -> 0x00f7 }
            r12.remove(r11)     // Catch:{ JSONException -> 0x00f7 }
            int r10 = r10 + 1
            goto L_0x007e
        L_0x00f1:
            r8.apply()     // Catch:{ JSONException -> 0x00f7 }
            goto L_0x00ff
        L_0x00f5:
            r0 = move-exception
            goto L_0x010d
        L_0x00f7:
            r0 = move-exception
            java.lang.String r0 = "GmsDownloadIntentOp"
            java.lang.String r8 = "Failed to migrate from SharedPreferences."
            android.util.Log.e(r0, r8)     // Catch:{ all -> 0x00f5 }
        L_0x00ff:
            android.content.SharedPreferences$Editor r0 = r4.edit()
            java.lang.String r8 = "ds__downloads_json__"
            android.content.SharedPreferences$Editor r0 = r0.remove(r8)
            r0.apply()
            goto L_0x011b
        L_0x010d:
            android.content.SharedPreferences$Editor r2 = r4.edit()
            java.lang.String r3 = "ds__downloads_json__"
            android.content.SharedPreferences$Editor r2 = r2.remove(r3)
            r2.apply()
            throw r0
        L_0x011b:
            boolean r0 = defpackage.jkf.a(r19)
            if (r0 != 0) goto L_0x0128
            r2 = 1800000(0x1b7740, double:8.89318E-318)
            r1.a((long) r2)
            return
        L_0x0128:
            java.lang.Object r8 = c
            monitor-enter(r8)
            boolean r0 = f     // Catch:{ all -> 0x0456 }
            if (r0 != 0) goto L_0x0454
            f = r5     // Catch:{ all -> 0x0456 }
            android.content.SharedPreferences$Editor r0 = r4.edit()     // Catch:{ all -> 0x0456 }
            java.lang.String r4 = "ds__last_process__"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r4, r2)     // Catch:{ all -> 0x0456 }
            r0.apply()     // Catch:{ all -> 0x0456 }
            monitor-exit(r8)     // Catch:{ all -> 0x0456 }
            r19.a()
            java.util.TreeSet r0 = new java.util.TreeSet     // Catch:{ all -> 0x0443 }
            r0.<init>()     // Catch:{ all -> 0x0443 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0443 }
            r2.<init>()     // Catch:{ all -> 0x0443 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0428 }
            java.lang.String r4 = defpackage.awud.b()     // Catch:{ JSONException -> 0x0428 }
            r3.<init>(r4)     // Catch:{ JSONException -> 0x0428 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0443 }
            r3.<init>()     // Catch:{ all -> 0x0443 }
            java.lang.String r4 = "download"
            r1.getSystemService(r4)     // Catch:{ all -> 0x0443 }
            java.lang.String r4 = "download"
            java.lang.Object r4 = r1.getSystemService(r4)     // Catch:{ all -> 0x0443 }
            android.app.DownloadManager r4 = (android.app.DownloadManager) r4     // Catch:{ all -> 0x0443 }
            android.app.DownloadManager$Query r8 = new android.app.DownloadManager$Query     // Catch:{ all -> 0x0443 }
            r8.<init>()     // Catch:{ all -> 0x0443 }
            r9 = 15
            android.app.DownloadManager$Query r8 = r8.setFilterByStatus(r9)     // Catch:{ all -> 0x0443 }
            android.database.Cursor r4 = defpackage.ipt.a((android.app.DownloadManager) r4, (android.app.DownloadManager.Query) r8)     // Catch:{ all -> 0x0443 }
            if (r4 != 0) goto L_0x0179
            goto L_0x0198
        L_0x0179:
            java.lang.String r8 = "_id"
            int r8 = r4.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x0423 }
        L_0x017f:
            boolean r9 = r4.moveToNext()     // Catch:{ all -> 0x0423 }
            if (r9 == 0) goto L_0x0195
            long r9 = r4.getLong(r8)     // Catch:{ all -> 0x0423 }
            com.google.android.gms.common.download.DownloadDetails r9 = defpackage.ipt.a((android.content.Context) r1, (long) r9)     // Catch:{ all -> 0x0423 }
            if (r9 == 0) goto L_0x017f
            java.lang.String r9 = r9.a     // Catch:{ all -> 0x0423 }
            r3.add(r9)     // Catch:{ all -> 0x0423 }
            goto L_0x017f
        L_0x0195:
            r4.close()     // Catch:{ all -> 0x0443 }
        L_0x0198:
            com.google.android.gms.common.download.DownloadDetails[] r4 = defpackage.ipt.a((android.content.Context) r19)     // Catch:{ all -> 0x0443 }
            int r8 = r4.length     // Catch:{ all -> 0x0443 }
            r9 = 0
        L_0x019e:
            r10 = 0
            if (r9 >= r8) goto L_0x0244
            r11 = r4[r9]     // Catch:{ all -> 0x0443 }
            boolean r12 = a((android.content.Context) r1, (com.google.android.gms.common.download.DownloadDetails) r11)     // Catch:{ all -> 0x0443 }
            if (r12 == 0) goto L_0x0240
            java.lang.String r12 = r11.a     // Catch:{ all -> 0x0443 }
            r0.add(r12)     // Catch:{ all -> 0x0443 }
            java.lang.String r12 = r11.a     // Catch:{ all -> 0x0443 }
            boolean r12 = r3.contains(r12)     // Catch:{ all -> 0x0443 }
            if (r12 == 0) goto L_0x01b8
            goto L_0x0240
        L_0x01b8:
            java.lang.String r12 = r11.a     // Catch:{ all -> 0x0443 }
            android.net.Uri r14 = defpackage.ipt.a((java.lang.String) r12)     // Catch:{ all -> 0x0443 }
            java.lang.Object r12 = defpackage.ipt.g     // Catch:{ all -> 0x0443 }
            monitor-enter(r12)     // Catch:{ all -> 0x0443 }
            android.content.ContentResolver r13 = r19.getContentResolver()     // Catch:{ all -> 0x023d }
            java.lang.String[] r15 = defpackage.ipt.c     // Catch:{ all -> 0x023d }
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r13 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x023d }
            if (r13 != 0) goto L_0x01e2
            java.lang.Exception r13 = new java.lang.Exception     // Catch:{ all -> 0x023d }
            r13.<init>()     // Catch:{ all -> 0x023d }
            java.lang.String r14 = "DownloadServiceState"
            java.lang.String r15 = "getDownloadFailedCount Cursor was null"
            android.util.Log.wtf(r14, r15, r13)     // Catch:{ all -> 0x023d }
            monitor-exit(r12)     // Catch:{ all -> 0x023d }
            r14 = 0
            goto L_0x01f7
        L_0x01e2:
            boolean r14 = r13.moveToNext()     // Catch:{ all -> 0x0238 }
            if (r14 != 0) goto L_0x01ee
            r13.close()     // Catch:{ all -> 0x023d }
            monitor-exit(r12)     // Catch:{ all -> 0x023d }
            r14 = 0
            goto L_0x01f7
        L_0x01ee:
            int r14 = r13.getInt(r5)     // Catch:{ all -> 0x0238 }
            r13.close()     // Catch:{ all -> 0x023d }
            monitor-exit(r12)     // Catch:{ all -> 0x023d }
        L_0x01f7:
            long r12 = (long) r14
            awud r14 = defpackage.awud.a     // Catch:{ all -> 0x0443 }
            awue r14 = r14.a()     // Catch:{ all -> 0x0443 }
            long r14 = r14.h()     // Catch:{ all -> 0x0443 }
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 > 0) goto L_0x0207
            goto L_0x0224
        L_0x0207:
            if (r7 == 0) goto L_0x0240
            java.lang.String r12 = r11.a     // Catch:{ all -> 0x0443 }
            android.net.Uri r12 = defpackage.ipt.a((java.lang.String) r12)     // Catch:{ all -> 0x0443 }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x0443 }
            r13.<init>(r5)     // Catch:{ all -> 0x0443 }
            java.lang.String r14 = "retries"
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0443 }
            r13.put(r14, r15)     // Catch:{ all -> 0x0443 }
            android.content.ContentResolver r14 = r19.getContentResolver()     // Catch:{ all -> 0x0443 }
            r14.update(r12, r13, r10, r10)     // Catch:{ all -> 0x0443 }
        L_0x0224:
            java.lang.String r10 = r11.a     // Catch:{ all -> 0x0443 }
            boolean r10 = a((android.content.Context) r1, (java.lang.String) r10)     // Catch:{ all -> 0x0443 }
            if (r10 != 0) goto L_0x0240
            long r12 = r11.c     // Catch:{ all -> 0x0443 }
            boolean r10 = a((android.content.Context) r1, (long) r12)     // Catch:{ all -> 0x0443 }
            if (r10 == 0) goto L_0x0240
            r2.add(r11)     // Catch:{ all -> 0x0443 }
            goto L_0x0240
        L_0x0238:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x023d }
            throw r0     // Catch:{ all -> 0x023d }
        L_0x023d:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x023d }
            throw r0     // Catch:{ all -> 0x0443 }
        L_0x0240:
            int r9 = r9 + 1
            goto L_0x019e
        L_0x0244:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0443 }
        L_0x0248:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0443 }
            if (r3 != 0) goto L_0x0329
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0443 }
            java.lang.String r3 = defpackage.ipu.b(r19)     // Catch:{ all -> 0x0443 }
            r2.<init>(r3)     // Catch:{ all -> 0x0443 }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x0443 }
            if (r3 != 0) goto L_0x025e
        L_0x025d:
            goto L_0x0281
        L_0x025e:
            boolean r3 = r2.isDirectory()     // Catch:{ all -> 0x0443 }
            if (r3 == 0) goto L_0x025d
            java.lang.String[] r3 = r2.list()     // Catch:{ all -> 0x0443 }
            if (r3 == 0) goto L_0x0281
            int r4 = r3.length     // Catch:{ all -> 0x0443 }
            r7 = 0
        L_0x026c:
            if (r7 >= r4) goto L_0x0281
            r8 = r3[r7]     // Catch:{ all -> 0x0443 }
            boolean r9 = r0.contains(r8)     // Catch:{ all -> 0x0443 }
            if (r9 != 0) goto L_0x027e
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x0443 }
            r9.<init>(r2, r8)     // Catch:{ all -> 0x0443 }
            r9.delete()     // Catch:{ all -> 0x0443 }
        L_0x027e:
            int r7 = r7 + 1
            goto L_0x026c
        L_0x0281:
            java.lang.String r0 = "download"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ all -> 0x0443 }
            android.app.DownloadManager r0 = (android.app.DownloadManager) r0     // Catch:{ all -> 0x0443 }
            android.app.DownloadManager$Query r2 = new android.app.DownloadManager$Query     // Catch:{ all -> 0x0443 }
            r2.<init>()     // Catch:{ all -> 0x0443 }
            r3 = 16
            android.app.DownloadManager$Query r2 = r2.setFilterByStatus(r3)     // Catch:{ all -> 0x0443 }
            android.database.Cursor r2 = defpackage.ipt.a((android.app.DownloadManager) r0, (android.app.DownloadManager.Query) r2)     // Catch:{ all -> 0x0443 }
            if (r2 == 0) goto L_0x02c4
        L_0x029a:
            boolean r3 = r2.moveToNext()     // Catch:{ all -> 0x02bf }
            if (r3 == 0) goto L_0x02bb
            java.lang.String r3 = "_id"
            int r3 = r2.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x02bf }
            long r3 = r2.getLong(r3)     // Catch:{ all -> 0x02bf }
            java.lang.String r7 = r1.a((android.database.Cursor) r2, (long) r3)     // Catch:{ all -> 0x02bf }
            if (r7 == 0) goto L_0x029a
            defpackage.ipt.a((android.content.Context) r1, (java.lang.String) r7)     // Catch:{ all -> 0x02bf }
            long[] r7 = new long[r5]     // Catch:{ all -> 0x02bf }
            r7[r6] = r3     // Catch:{ all -> 0x02bf }
            r0.remove(r7)     // Catch:{ all -> 0x02bf }
            goto L_0x029a
        L_0x02bb:
            r2.close()     // Catch:{ all -> 0x0443 }
            goto L_0x02c4
        L_0x02bf:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0443 }
            throw r0     // Catch:{ all -> 0x0443 }
        L_0x02c4:
            android.app.DownloadManager$Query r2 = new android.app.DownloadManager$Query     // Catch:{ all -> 0x0443 }
            r2.<init>()     // Catch:{ all -> 0x0443 }
            r3 = 8
            android.app.DownloadManager$Query r2 = r2.setFilterByStatus(r3)     // Catch:{ all -> 0x0443 }
            android.database.Cursor r2 = defpackage.ipt.a((android.app.DownloadManager) r0, (android.app.DownloadManager.Query) r2)     // Catch:{ all -> 0x0443 }
            if (r2 == 0) goto L_0x0319
        L_0x02d5:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0314 }
            if (r0 == 0) goto L_0x0310
            java.lang.String r0 = "_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0314 }
            long r3 = r2.getLong(r0)     // Catch:{ all -> 0x0314 }
            java.lang.String r0 = r1.a((android.database.Cursor) r2, (long) r3)     // Catch:{ all -> 0x0314 }
            if (r0 == 0) goto L_0x02d5
            boolean r0 = a((android.content.Context) r1, (java.lang.String) r0)     // Catch:{ all -> 0x0314 }
            if (r0 != 0) goto L_0x030c
            java.lang.Class<com.google.android.gms.common.download.DownloadCompleteIntentOperation> r0 = com.google.android.gms.common.download.DownloadCompleteIntentOperation.class
            java.lang.String r5 = "android.intent.action.DOWNLOAD_COMPLETE"
            android.content.Intent r0 = com.google.android.chimera.IntentOperation.getStartIntent((android.content.Context) r1, (java.lang.Class) r0, (java.lang.String) r5)     // Catch:{ all -> 0x0314 }
            if (r0 == 0) goto L_0x0304
            java.lang.String r5 = "extra_download_id"
            r0.putExtra(r5, r3)     // Catch:{ all -> 0x0314 }
            r1.startService(r0)     // Catch:{ all -> 0x0314 }
            goto L_0x02d5
        L_0x0304:
            java.lang.String r0 = "GmsDownloadIntentOp"
            java.lang.String r3 = "IntentOperation.getStartIntent() returned null!"
            android.util.Log.e(r0, r3)     // Catch:{ all -> 0x0314 }
            goto L_0x02d5
        L_0x030c:
            defpackage.ipt.b((android.content.Context) r1, (long) r3)     // Catch:{ all -> 0x0314 }
            goto L_0x02d5
        L_0x0310:
            r2.close()     // Catch:{ all -> 0x0443 }
            goto L_0x0319
        L_0x0314:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0443 }
            throw r0     // Catch:{ all -> 0x0443 }
        L_0x0319:
            r19.c()
            java.lang.Object r2 = c
            monitor-enter(r2)
            f = r6     // Catch:{ all -> 0x0326 }
            monitor-exit(r2)     // Catch:{ all -> 0x0326 }
        L_0x0322:
            r19.b()
            return
        L_0x0326:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0326 }
            throw r0
        L_0x0329:
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0443 }
            com.google.android.gms.common.download.DownloadDetails r3 = (com.google.android.gms.common.download.DownloadDetails) r3     // Catch:{ all -> 0x0443 }
            java.lang.String r4 = "download"
            java.lang.Object r4 = r1.getSystemService(r4)     // Catch:{ IllegalArgumentException -> 0x0414 }
            android.app.DownloadManager r4 = (android.app.DownloadManager) r4     // Catch:{ IllegalArgumentException -> 0x0414 }
            android.app.DownloadManager$Request r7 = new android.app.DownloadManager$Request     // Catch:{ IllegalArgumentException -> 0x0414 }
            java.lang.String r8 = r3.b     // Catch:{ IllegalArgumentException -> 0x0414 }
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch:{ IllegalArgumentException -> 0x0414 }
            r7.<init>(r8)     // Catch:{ IllegalArgumentException -> 0x0414 }
            java.lang.String r8 = r3.a     // Catch:{ IllegalArgumentException -> 0x0414 }
            android.app.DownloadManager$Request r7 = r7.setTitle(r8)     // Catch:{ IllegalArgumentException -> 0x0414 }
            android.app.DownloadManager$Request r7 = r7.setVisibleInDownloadsUi(r6)     // Catch:{ IllegalArgumentException -> 0x0414 }
            android.app.DownloadManager$Request r7 = r7.setAllowedOverRoaming(r6)     // Catch:{ IllegalArgumentException -> 0x0414 }
            java.lang.String r8 = r3.a     // Catch:{ IllegalArgumentException -> 0x0414 }
            android.net.Uri r12 = defpackage.ipt.a((java.lang.String) r8)     // Catch:{ IllegalArgumentException -> 0x0414 }
            android.content.ContentResolver r11 = r19.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0414 }
            java.lang.String[] r13 = defpackage.ipt.f     // Catch:{ IllegalArgumentException -> 0x0414 }
            r14 = 0
            r15 = 0
            r16 = 0
            android.database.Cursor r8 = r11.query(r12, r13, r14, r15, r16)     // Catch:{ IllegalArgumentException -> 0x0414 }
            r9 = 2
            if (r8 != 0) goto L_0x0375
            java.lang.Exception r8 = new java.lang.Exception     // Catch:{ IllegalArgumentException -> 0x0414 }
            r8.<init>()     // Catch:{ IllegalArgumentException -> 0x0414 }
            java.lang.String r11 = "DownloadServiceState"
            java.lang.String r12 = "getNotification Cursor was null"
            android.util.Log.wtf(r11, r12, r8)     // Catch:{ IllegalArgumentException -> 0x0414 }
            r12 = r10
            goto L_0x03a6
        L_0x0375:
            boolean r11 = r8.moveToNext()     // Catch:{ all -> 0x040f }
            if (r11 != 0) goto L_0x0383
            java.lang.String r11 = "DownloadServiceState"
            java.lang.String r12 = "No pending download found."
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x040f }
            goto L_0x03a2
        L_0x0383:
            boolean r11 = r8.isNull(r9)     // Catch:{ all -> 0x040f }
            if (r11 != 0) goto L_0x03a2
            r11 = 3
            boolean r12 = r8.isNull(r11)     // Catch:{ all -> 0x040f }
            if (r12 != 0) goto L_0x03a2
            android.util.Pair r12 = new android.util.Pair     // Catch:{ all -> 0x040f }
            java.lang.String r13 = r8.getString(r9)     // Catch:{ all -> 0x040f }
            java.lang.String r11 = r8.getString(r11)     // Catch:{ all -> 0x040f }
            r12.<init>(r13, r11)     // Catch:{ all -> 0x040f }
            r8.close()     // Catch:{ IllegalArgumentException -> 0x0414 }
            goto L_0x03a6
        L_0x03a2:
            r8.close()     // Catch:{ IllegalArgumentException -> 0x0414 }
            r12 = r10
        L_0x03a6:
            if (r12 == 0) goto L_0x03ba
            java.lang.Object r8 = r12.first     // Catch:{ IllegalArgumentException -> 0x0414 }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ IllegalArgumentException -> 0x0414 }
            r7.setTitle(r8)     // Catch:{ IllegalArgumentException -> 0x0414 }
            java.lang.Object r8 = r12.second     // Catch:{ IllegalArgumentException -> 0x0414 }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ IllegalArgumentException -> 0x0414 }
            r7.setDescription(r8)     // Catch:{ IllegalArgumentException -> 0x0414 }
            r7.setNotificationVisibility(r6)     // Catch:{ IllegalArgumentException -> 0x0414 }
            goto L_0x03be
        L_0x03ba:
            r7.setNotificationVisibility(r9)     // Catch:{ IllegalArgumentException -> 0x0414 }
        L_0x03be:
            java.lang.String r8 = r3.a     // Catch:{ IllegalArgumentException -> 0x0414 }
            android.net.Uri r8 = defpackage.ipt.a((java.lang.String) r8)     // Catch:{ IllegalArgumentException -> 0x0414 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ IllegalArgumentException -> 0x0414 }
            r11.<init>(r9)     // Catch:{ IllegalArgumentException -> 0x0414 }
            java.lang.String r9 = "notificationTitle"
            r11.putNull(r9)     // Catch:{ IllegalArgumentException -> 0x0414 }
            java.lang.String r9 = "notificationDescription"
            r11.putNull(r9)     // Catch:{ IllegalArgumentException -> 0x0414 }
            android.content.ContentResolver r9 = r19.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0414 }
            r9.update(r8, r11, r10, r10)     // Catch:{ IllegalArgumentException -> 0x0414 }
            long r7 = r4.enqueue(r7)     // Catch:{ NullPointerException -> 0x0405 }
            java.lang.String r3 = r3.a     // Catch:{ IllegalArgumentException -> 0x0414 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ IllegalArgumentException -> 0x0414 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x0414 }
            java.lang.String r9 = "dm_id"
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ IllegalArgumentException -> 0x0414 }
            r4.put(r9, r7)     // Catch:{ IllegalArgumentException -> 0x0414 }
            android.content.ContentResolver r7 = r19.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0414 }
            android.net.Uri r3 = defpackage.ipt.a((java.lang.String) r3)     // Catch:{ IllegalArgumentException -> 0x0414 }
            int r3 = r7.update(r3, r4, r10, r10)     // Catch:{ IllegalArgumentException -> 0x0414 }
            if (r3 != 0) goto L_0x0248
            java.lang.String r3 = "DownloadServiceState"
            java.lang.String r4 = "Failed to update DownloadManager id"
            android.util.Log.e(r3, r4)     // Catch:{ IllegalArgumentException -> 0x0414 }
            goto L_0x0248
        L_0x0405:
            r0 = move-exception
            r2 = r0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0414 }
            java.lang.String r3 = "Insert returned null"
            r0.<init>(r3, r2)     // Catch:{ IllegalArgumentException -> 0x0414 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0414 }
        L_0x040f:
            r0 = move-exception
            r8.close()     // Catch:{ IllegalArgumentException -> 0x0414 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0414 }
        L_0x0414:
            r0 = move-exception
            r19.c()
            java.lang.Object r2 = c
            monitor-enter(r2)
            f = r6     // Catch:{ all -> 0x0420 }
            monitor-exit(r2)     // Catch:{ all -> 0x0420 }
            goto L_0x0322
        L_0x0420:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0420 }
            throw r0
        L_0x0423:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0443 }
            throw r0     // Catch:{ all -> 0x0443 }
        L_0x0428:
            r0 = move-exception
            r19.c()     // Catch:{ all -> 0x0443 }
            java.lang.Object r2 = c     // Catch:{ all -> 0x0443 }
            monitor-enter(r2)     // Catch:{ all -> 0x0443 }
            f = r6     // Catch:{ all -> 0x0440 }
            monitor-exit(r2)     // Catch:{ all -> 0x0440 }
            r19.c()
            java.lang.Object r3 = c
            monitor-enter(r3)
            f = r6     // Catch:{ all -> 0x043d }
            monitor-exit(r3)     // Catch:{ all -> 0x043d }
            goto L_0x0322
        L_0x043d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x043d }
            throw r0
        L_0x0440:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0440 }
            throw r0     // Catch:{ all -> 0x0443 }
        L_0x0443:
            r0 = move-exception
            r19.c()
            java.lang.Object r2 = c
            monitor-enter(r2)
            f = r6     // Catch:{ all -> 0x0451 }
            monitor-exit(r2)     // Catch:{ all -> 0x0451 }
            r19.b()
            throw r0
        L_0x0451:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0451 }
            throw r0
        L_0x0454:
            monitor-exit(r8)     // Catch:{ all -> 0x0456 }
            return
        L_0x0456:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0456 }
            goto L_0x045a
        L_0x0459:
            throw r0
        L_0x045a:
            goto L_0x0459
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.download.DownloadIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    private static Status a(Context context, int i) {
        if (i == 7000) {
            return new Status(7000, context.getString(R.string.download_msg_pending), (PendingIntent) null);
        }
        if (i == 7001) {
            return new Status(7001, context.getString(R.string.download_msg_in_progress), (PendingIntent) null);
        }
        switch (i) {
            case 7010:
                return new Status(0);
            case 7011:
                return new Status(13, context.getString(R.string.download_msg_error_invalid), (PendingIntent) null);
            case 7012:
                return new Status(7002, context.getString(R.string.download_msg_not_allowed_space), (PendingIntent) null);
            default:
                return new Status(i);
        }
    }

    public static boolean c(Context context, DownloadDetails downloadDetails) {
        return a(context, downloadDetails, (String) null, (String) null);
    }

    public static boolean c(Context context, String str) {
        boolean b2;
        synchronized (d) {
            b2 = ipt.b(context, str);
        }
        return b2;
    }

    static boolean b(Context context, DownloadDetails downloadDetails) {
        File a2 = ipu.a(context, downloadDetails);
        if (!a2.exists()) {
            return false;
        }
        if (downloadDetails.d.equals(a(a2))) {
            return true;
        }
        if (!a2.getAbsolutePath().startsWith(context.getCacheDir().getAbsolutePath())) {
            return false;
        }
        a2.delete();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
            r1 = this;
            monitor-enter(r1)
            acry r0 = r1.b     // Catch:{ all -> 0x0016 }
            if (r0 != 0) goto L_0x000e
            acrz r0 = r1.a     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x000c
            r0.c()     // Catch:{ all -> 0x0016 }
        L_0x000c:
            monitor-exit(r1)
            return
        L_0x000e:
            r0.a()     // Catch:{ all -> 0x0016 }
            r0 = 0
            r1.b = r0     // Catch:{ all -> 0x0016 }
            monitor-exit(r1)
            return
        L_0x0016:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.download.DownloadIntentOperation.b():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0046 A[SYNTHETIC, Splitter:B:35:0x0046] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized java.lang.String a(java.io.File r5) {
        /*
            java.lang.Class<com.google.android.gms.common.download.DownloadIntentOperation> r0 = com.google.android.gms.common.download.DownloadIntentOperation.class
            monitor-enter(r0)
            java.lang.String r1 = "SHA1"
            java.security.MessageDigest r1 = defpackage.jhg.b((java.lang.String) r1)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x004c
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0038, all -> 0x0036 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x0038, all -> 0x0036 }
            r5 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
        L_0x0015:
            int r2 = r3.read(r5)     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            r4 = -1
            if (r2 != r4) goto L_0x002b
            byte[] r5 = r1.digest()     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            java.lang.String r5 = defpackage.jjp.a((byte[]) r5)     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            r3.close()     // Catch:{ IOException -> 0x0028 }
            goto L_0x0029
        L_0x0028:
            r1 = move-exception
        L_0x0029:
            monitor-exit(r0)
            return r5
        L_0x002b:
            r4 = 0
            r1.update(r5, r4, r2)     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            goto L_0x0015
        L_0x0030:
            r5 = move-exception
            r2 = r3
            goto L_0x0044
        L_0x0033:
            r5 = move-exception
            r2 = r3
            goto L_0x0039
        L_0x0036:
            r5 = move-exception
            goto L_0x0044
        L_0x0038:
            r5 = move-exception
        L_0x0039:
            java.lang.String r5 = ""
            if (r2 == 0) goto L_0x0029
            r2.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0029
        L_0x0041:
            r1 = move-exception
            goto L_0x0029
        L_0x0043:
            r5 = move-exception
        L_0x0044:
            if (r2 == 0) goto L_0x004b
            r2.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x004b
        L_0x004a:
            r1 = move-exception
        L_0x004b:
            throw r5     // Catch:{ all -> 0x0050 }
        L_0x004c:
            java.lang.String r5 = ""
            monitor-exit(r0)
            return r5
        L_0x0050:
            r5 = move-exception
            monitor-exit(r0)
            goto L_0x0054
        L_0x0053:
            throw r5
        L_0x0054:
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.download.DownloadIntentOperation.a(java.io.File):java.lang.String");
    }

    static boolean a(Context context, long j) {
        StatFs statFs;
        if (!a(context).getBoolean("ds__storage_low__", false)) {
            File cacheDir = context.getCacheDir();
            if (cacheDir != null) {
                statFs = new StatFs(cacheDir.getAbsolutePath());
            } else {
                statFs = null;
            }
            if (statFs == null || Math.max((double) ((((long) statFs.getFreeBlocks()) * ((long) statFs.getBlockSize())) - j), 0.0d) <= Math.min(Math.max((double) (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())), 1.0d) * awud.a.a().f(), (double) awud.a.a().a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    static boolean a(Context context, DownloadDetails downloadDetails) {
        int b2;
        if ((downloadDetails.e != null && !ipt.b(context, downloadDetails.a)) || (b2 = jlo.b()) < downloadDetails.f || b2 > downloadDetails.g || !e.matcher(downloadDetails.a).matches()) {
            return false;
        }
        if (awud.a.a().e() && !downloadDetails.b.startsWith("https")) {
            return false;
        }
        String str = downloadDetails.e;
        if (str == null || !str.contains("..")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r6, com.google.android.gms.common.download.DownloadDetails r7, java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "DownloadDetails required"
            defpackage.iva.a((java.lang.Object) r7, (java.lang.Object) r0)
            java.lang.Object r0 = d
            monitor-enter(r0)
            java.lang.String r1 = r7.a     // Catch:{ all -> 0x007e }
            com.google.android.gms.common.download.DownloadDetails r1 = defpackage.ipt.c(r6, r1)     // Catch:{ all -> 0x007e }
            r2 = 1
            if (r1 == 0) goto L_0x006b
            boolean r1 = r1.equals(r7)     // Catch:{ all -> 0x007e }
            r1 = r1 ^ r2
            if (r1 != 0) goto L_0x0066
            java.lang.String r1 = r7.a     // Catch:{ all -> 0x007e }
            android.net.Uri r1 = defpackage.ipt.a((java.lang.String) r1)     // Catch:{ all -> 0x007e }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x007e }
            r3.<init>(r2)     // Catch:{ all -> 0x007e }
            java.lang.String r4 = "enabled"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x007e }
            r3.put(r4, r5)     // Catch:{ all -> 0x007e }
            android.content.ContentResolver r4 = r6.getContentResolver()     // Catch:{ all -> 0x007e }
            r5 = 0
            r4.update(r1, r3, r5, r5)     // Catch:{ all -> 0x007e }
            java.lang.String r1 = r7.a     // Catch:{ all -> 0x007e }
            boolean r1 = a((android.content.Context) r6, (java.lang.String) r1)     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x003d
            goto L_0x007c
        L_0x003d:
            if (r8 == 0) goto L_0x007c
            if (r9 == 0) goto L_0x007c
            java.lang.String r7 = r7.a     // Catch:{ all -> 0x007e }
            android.net.Uri r7 = defpackage.ipt.a((java.lang.String) r7)     // Catch:{ all -> 0x007e }
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x007e }
            r3 = 2
            r1.<init>(r3)     // Catch:{ all -> 0x007e }
            java.lang.String r3 = "notificationTitle"
            r1.put(r3, r8)     // Catch:{ all -> 0x007e }
            java.lang.String r8 = "notificationDescription"
            r1.put(r8, r9)     // Catch:{ all -> 0x007e }
            android.content.ContentResolver r8 = r6.getContentResolver()     // Catch:{ all -> 0x007e }
            r8.update(r7, r1, r5, r5)     // Catch:{ all -> 0x007e }
            android.content.Intent r7 = defpackage.ipu.a(r6)     // Catch:{ all -> 0x007e }
            r6.startService(r7)     // Catch:{ all -> 0x007e }
            goto L_0x007c
        L_0x0066:
            defpackage.ipt.b(r6, r7, r2)     // Catch:{ all -> 0x007e }
            goto L_0x0075
        L_0x006b:
            android.net.Uri r7 = defpackage.ipt.a(r6, r7, r2)     // Catch:{ all -> 0x007e }
            if (r7 != 0) goto L_0x0075
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            r6 = 0
            return r6
        L_0x0075:
            android.content.Intent r7 = defpackage.ipu.a(r6)     // Catch:{ all -> 0x007e }
            r6.startService(r7)     // Catch:{ all -> 0x007e }
        L_0x007c:
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            return r2
        L_0x007e:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.download.DownloadIntentOperation.a(android.content.Context, com.google.android.gms.common.download.DownloadDetails, java.lang.String, java.lang.String):boolean");
    }

    public static boolean a(Context context, String str) {
        synchronized (d) {
            DownloadDetails c2 = ipt.c(context, str);
            if (c2 == null) {
                return false;
            }
            boolean b2 = b(context, c2);
            return b2;
        }
    }

    /* access modifiers changed from: package-private */
    public final String a(Cursor cursor, long j) {
        DownloadDetails c2;
        DownloadDetails a2 = ipt.a((Context) this, j);
        if (a2 != null) {
            return a2.a;
        }
        String string = cursor.getString(cursor.getColumnIndexOrThrow("title"));
        if (string == null || !e.matcher(string).matches() || (c2 = ipt.c(this, string)) == null) {
            return null;
        }
        return c2.a;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        acrz acrz = this.a;
        if (acrz != null) {
            if (acrz.e()) {
                return;
            }
        }
        acrz acrz2 = new acrz(this, 1, "GmsDownloadIntentOp", (String) null, "com.google.android.gms");
        this.a = acrz2;
        acrz2.a(false);
        if (!awud.a.a().j()) {
            this.a.a(60000);
        } else {
            this.b = this.a.b("DownloadIntentOperation", 60000);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(long j) {
        if (j < 60000) {
            j = 60000;
        }
        SharedPreferences a2 = a((Context) this);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j + elapsedRealtime;
        long j3 = a2.getLong("ds__next_alarm__", 0);
        if (j3 < elapsedRealtime || (j3 > elapsedRealtime && j3 > j2)) {
            new jbs(this).a(getClass().getSimpleName(), 3, j2, PendingIntent.getService(this, 0, ipu.a(this), 134217728), "com.google.android.gms");
            a2.edit().putLong("ds__next_alarm__", j2).apply();
        }
    }
}
