package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.Service;
import java.io.Closeable;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* renamed from: ofn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ofn implements Closeable {
    private static final String[] a = {"child_ids", "is_feeling_lucky"};
    private static final String[] b = {"id", "type", "title", "snippet", "url", "api_url", "intent_url", "setting_action_definition", "navigation_action_url", "etag", "visited_time"};
    private static final String[] c = {"id", "snippet", "title", "url", "type", "etag", "is_in_dark_mode"};
    @Deprecated
    private final ofm d;
    private Context e;

    public ofn(Context context) {
        this.d = new ofm(context);
        if (ofq.b(axqw.b())) {
            this.e = context;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        return r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00af A[Catch:{ all -> 0x00a8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized defpackage.oab a(java.lang.String r10, java.lang.String[] r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            android.database.sqlite.SQLiteDatabase r0 = r9.a()     // Catch:{ all -> 0x00b3 }
            boolean r1 = r0.isOpen()     // Catch:{ all -> 0x00b3 }
            r8 = 0
            if (r1 == 0) goto L_0x0068
            java.lang.String r1 = "help_responses"
            java.lang.String[] r2 = c     // Catch:{ all -> 0x00ab }
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r10
            r4 = r11
            android.database.Cursor r10 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00ab }
            boolean r11 = r10.moveToNext()     // Catch:{ all -> 0x00a8 }
            if (r11 == 0) goto L_0x00a2
            java.lang.String r11 = "snippet"
            int r11 = r10.getColumnIndex(r11)     // Catch:{ all -> 0x00a8 }
            java.lang.String r3 = r10.getString(r11)     // Catch:{ all -> 0x00a8 }
            boolean r11 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x00a8 }
            if (r11 != 0) goto L_0x009c
            java.lang.String r11 = "title"
            int r11 = r10.getColumnIndex(r11)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "url"
            int r0 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = "type"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = "etag"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = "id"
            int r4 = r10.getColumnIndex(r4)     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = r10.getString(r4)     // Catch:{ all -> 0x00a8 }
            int r1 = r10.getInt(r1)     // Catch:{ all -> 0x00a8 }
            r5 = 2
            if (r1 == r5) goto L_0x0081
            r5 = 14
            if (r1 == r5) goto L_0x006a
            java.lang.String r11 = "gH_HelpResponseDatabase"
            java.lang.String r0 = "Found leaf content with not supported type."
            android.util.Log.e(r11, r0)     // Catch:{ all -> 0x00a8 }
            if (r10 == 0) goto L_0x0068
            r10.close()     // Catch:{ all -> 0x00b3 }
        L_0x0068:
            monitor-exit(r9)
            return r8
        L_0x006a:
            java.lang.String r11 = r10.getString(r11)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = r10.getString(r2)     // Catch:{ all -> 0x00a8 }
            oab r11 = defpackage.oab.a((java.lang.String) r4, (java.lang.String) r11, (java.lang.String) r0, (java.lang.String) r3, (java.lang.String) r1)     // Catch:{ all -> 0x00a8 }
            if (r10 == 0) goto L_0x007f
            r10.close()     // Catch:{ all -> 0x00b3 }
        L_0x007f:
            monitor-exit(r9)
            return r11
        L_0x0081:
            java.lang.String r1 = r10.getString(r11)     // Catch:{ all -> 0x00a8 }
            java.lang.String r11 = r10.getString(r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = r10.getString(r2)     // Catch:{ all -> 0x00a8 }
            r6 = 1
            r0 = r4
            r2 = r11
            r4 = r5
            r5 = r6
            oab r11 = defpackage.oab.a(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00a8 }
            if (r10 == 0) goto L_0x007f
            r10.close()     // Catch:{ all -> 0x00b3 }
            goto L_0x007f
        L_0x009c:
            if (r10 == 0) goto L_0x0068
            r10.close()     // Catch:{ all -> 0x00b3 }
            goto L_0x0068
        L_0x00a2:
            if (r10 == 0) goto L_0x0068
            r10.close()     // Catch:{ all -> 0x00b3 }
            goto L_0x0068
        L_0x00a8:
            r11 = move-exception
            r8 = r10
            goto L_0x00ad
        L_0x00ab:
            r10 = move-exception
            r11 = r10
        L_0x00ad:
            if (r8 == 0) goto L_0x00b2
            r8.close()     // Catch:{ all -> 0x00b3 }
        L_0x00b2:
            throw r11     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x00b7
        L_0x00b6:
            throw r10
        L_0x00b7:
            goto L_0x00b6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofn.a(java.lang.String, java.lang.String[]):oab");
    }

    private static final ContentValues c(oab oab, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", oab.b);
        e();
        contentValues.put("app_package_name", str);
        contentValues.put("type", Integer.valueOf(oab.c));
        contentValues.put("saved_timestamp", Long.valueOf(System.currentTimeMillis()));
        int i = oab.c;
        if (i != 0) {
            if (i != 1) {
                if (!(i == 2 || i == 7)) {
                    if (i == 8) {
                        contentValues.put("title", oab.d);
                        contentValues.put("snippet", oab.r());
                        contentValues.put("url", oab.e);
                        contentValues.put("intent_url", oab.g);
                    } else if (i != 9) {
                        if (i != 11) {
                            if (i == 12) {
                                contentValues.put("title", oab.d);
                                contentValues.put("snippet", oab.r());
                                contentValues.put("url", oab.e);
                                contentValues.put("setting_action_definition", oab.v().k());
                            } else if (i != 22) {
                                switch (i) {
                                    case UrlRequest.Status.READING_RESPONSE /*14*/:
                                        break;
                                    case Service.START_CONTINUATION_MASK:
                                    case 16:
                                        break;
                                    default:
                                        String valueOf = String.valueOf(oab);
                                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                                        sb.append("The type of HelpResponse is not supported: ");
                                        sb.append(valueOf);
                                        throw new IllegalStateException(sb.toString());
                                }
                            } else {
                                contentValues.put("title", oab.d);
                                contentValues.put("snippet", oab.r());
                                contentValues.put("url", oab.e);
                                contentValues.put("navigation_action_url", oab.i);
                            }
                        }
                    }
                }
                contentValues.put("title", oab.d);
                contentValues.put("snippet", oab.r());
                contentValues.put("url", oab.e);
                contentValues.put("etag", oab.l);
                contentValues.put("is_in_dark_mode", Boolean.valueOf(oab.k));
            }
            contentValues.put("title", oab.d);
            contentValues.put("snippet", oab.r());
            contentValues.put("url", oab.e);
            contentValues.put("api_url", oab.f);
            contentValues.put("etag", oab.l);
            contentValues.put("visited_time", Long.valueOf(oab.m));
        } else {
            contentValues.put("child_ids", TextUtils.join(",", oab.s));
            contentValues.put("is_feeling_lucky", Boolean.valueOf(oab.j));
        }
        return contentValues;
    }

    public static void e() {
        axnj.c();
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase b() {
        try {
            return c().getWritableDatabase();
        } catch (SQLiteException e2) {
            Log.e("gH_HelpResponseDatabase", "Error opening Help Response database.", e2);
            return null;
        }
    }

    public final synchronized void close() {
        nzi.a(c());
    }

    public final synchronized boolean d() {
        boolean z;
        SQLiteDatabase a2 = a();
        if (a2.isOpen()) {
            Cursor rawQuery = a2.rawQuery("SELECT * FROM help_responses", (String[]) null);
            boolean moveToFirst = rawQuery.moveToFirst();
            rawQuery.close();
            z = !moveToFirst;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized void b(String str) {
        SQLiteDatabase b2 = b();
        if (b2 != null && b2.isOpen() && !b2.isReadOnly()) {
            b2.delete("help_responses", "app_package_name=?", new String[]{str});
        }
    }

    public final synchronized void b(String str, String str2) {
        SQLiteDatabase b2 = b();
        if (b2 != null && b2.isOpen() && !b2.isReadOnly()) {
            b2.delete("help_responses", "id=? AND app_package_name=?", new String[]{str, str2});
        }
    }

    public final synchronized void b(oab oab, String str) {
        SQLiteDatabase b2;
        if (oab.t && (b2 = b()) != null && b2.isOpen() && !b2.isReadOnly()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("etag", oab.l);
            b2.update("help_responses", contentValues, "id=? AND app_package_name=?", new String[]{oab.b, str});
        }
    }

    /* access modifiers changed from: package-private */
    public final ofm c() {
        return ofq.b(axqw.b()) ? ofm.a(this.e) : this.d;
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase a() {
        return c().getReadableDatabase();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "etag"
            android.database.sqlite.SQLiteDatabase r1 = r10.a()
            boolean r2 = r1.isOpen()
            r9 = 0
            if (r2 == 0) goto L_0x004e
            r2 = 1
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0046 }
            r3 = 0
            r5[r3] = r11     // Catch:{ all -> 0x0046 }
            java.lang.String[] r11 = new java.lang.String[r2]     // Catch:{ all -> 0x0046 }
            r11[r3] = r0     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = "help_responses"
            java.lang.String r4 = "url=? AND etag IS NOT NULL"
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r11
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0046 }
            int r0 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0043 }
        L_0x0027:
            boolean r1 = r11.moveToNext()     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x003d
            java.lang.String r1 = r11.getString(r0)     // Catch:{ all -> 0x0043 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0043 }
            if (r2 != 0) goto L_0x0027
            if (r11 == 0) goto L_0x003c
            r11.close()
        L_0x003c:
            return r1
        L_0x003d:
            if (r11 == 0) goto L_0x0042
            r11.close()
        L_0x0042:
            return r9
        L_0x0043:
            r0 = move-exception
            r9 = r11
            goto L_0x0048
        L_0x0046:
            r11 = move-exception
            r0 = r11
        L_0x0048:
            if (r9 == 0) goto L_0x004d
            r9.close()
        L_0x004d:
            throw r0
        L_0x004e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofn.a(java.lang.String):java.lang.String");
    }

    public final synchronized Map a(List list, String str) {
        return a((String[]) list.toArray(new String[list.size()]), str);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01e4, code lost:
        return r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01eb A[SYNTHETIC, Splitter:B:74:0x01eb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.Map a(java.lang.String[] r21, java.lang.String r22) {
        /*
            r20 = this;
            monitor-enter(r20)
            android.database.sqlite.SQLiteDatabase r1 = r20.a()     // Catch:{ all -> 0x01f5 }
            boolean r0 = r1.isOpen()     // Catch:{ all -> 0x01f5 }
            if (r0 == 0) goto L_0x01ef
            java.lang.String r0 = "\",\""
            r2 = r21
            java.lang.String r0 = android.text.TextUtils.join(r0, r2)     // Catch:{ all -> 0x01e7 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01e7 }
            int r2 = r2.length()     // Catch:{ all -> 0x01e7 }
            int r2 = r2 + 33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e7 }
            r3.<init>(r2)     // Catch:{ all -> 0x01e7 }
            java.lang.String r2 = "app_package_name=? AND id IN (\""
            r3.append(r2)     // Catch:{ all -> 0x01e7 }
            r3.append(r0)     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = "\")"
            r3.append(r0)     // Catch:{ all -> 0x01e7 }
            java.lang.String r4 = r3.toString()     // Catch:{ all -> 0x01e7 }
            r9 = 1
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch:{ all -> 0x01e7 }
            r0 = 0
            r5[r0] = r22     // Catch:{ all -> 0x01e7 }
            java.lang.String r2 = "help_responses"
            e()     // Catch:{ all -> 0x01e7 }
            java.lang.String[] r3 = b     // Catch:{ all -> 0x01e7 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = "id"
            int r2 = r1.getColumnIndex(r0)     // Catch:{ all -> 0x01e5 }
            e()     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = "type"
            int r3 = r1.getColumnIndex(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = "title"
            int r4 = r1.getColumnIndex(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = "snippet"
            int r5 = r1.getColumnIndex(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = "url"
            int r6 = r1.getColumnIndex(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = "api_url"
            int r7 = r1.getColumnIndex(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = "etag"
            int r8 = r1.getColumnIndex(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = "visited_time"
            int r10 = r1.getColumnIndex(r0)     // Catch:{ all -> 0x01e5 }
            nz r11 = new nz     // Catch:{ all -> 0x01e5 }
            r11.<init>()     // Catch:{ all -> 0x01e5 }
        L_0x007f:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x01de
            java.lang.String r12 = r1.getString(r2)     // Catch:{ all -> 0x01e5 }
            e()     // Catch:{ all -> 0x01e5 }
            int r0 = r1.getInt(r3)     // Catch:{ all -> 0x01e5 }
            java.lang.String r13 = r1.getString(r4)     // Catch:{ all -> 0x01e5 }
            java.lang.String r14 = r1.getString(r5)     // Catch:{ all -> 0x01e5 }
            java.lang.String r15 = r1.getString(r6)     // Catch:{ all -> 0x01e5 }
            boolean r16 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x01e5 }
            if (r16 != 0) goto L_0x01db
            boolean r16 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x01e5 }
            if (r16 != 0) goto L_0x01db
            boolean r16 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x01e5 }
            if (r16 != 0) goto L_0x01db
            if (r0 == r9) goto L_0x01b7
            r9 = 22
            if (r0 == r9) goto L_0x019e
            r9 = 7
            if (r0 == r9) goto L_0x018f
            r9 = 8
            if (r0 == r9) goto L_0x0169
            r9 = 9
            if (r0 == r9) goto L_0x015a
            r9 = 11
            if (r0 == r9) goto L_0x0136
            r9 = 12
            if (r0 == r9) goto L_0x0106
            r9 = 15
            if (r0 == r9) goto L_0x00f3
            r9 = 16
            if (r0 == r9) goto L_0x00d1
            goto L_0x01db
        L_0x00d1:
            java.lang.String r16 = r1.getString(r7)     // Catch:{ all -> 0x01e5 }
            boolean r0 = android.text.TextUtils.isEmpty(r16)     // Catch:{ all -> 0x01e5 }
            if (r0 != 0) goto L_0x00f1
            java.lang.String r17 = r1.getString(r8)     // Catch:{ all -> 0x01e5 }
            long r18 = r1.getLong(r10)     // Catch:{ all -> 0x01e5 }
            oab r0 = defpackage.oab.c(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01e5 }
            e()     // Catch:{ all -> 0x01e5 }
            java.lang.String r9 = r0.b     // Catch:{ all -> 0x01e5 }
            r11.put(r9, r0)     // Catch:{ all -> 0x01e5 }
            r9 = 1
            goto L_0x007f
        L_0x00f1:
            r9 = 1
            goto L_0x007f
        L_0x00f3:
            java.lang.String r0 = r1.getString(r8)     // Catch:{ all -> 0x01e5 }
            oab r0 = defpackage.oab.b(r12, r13, r15, r14, r0)     // Catch:{ all -> 0x01e5 }
            e()     // Catch:{ all -> 0x01e5 }
            java.lang.String r9 = r0.b     // Catch:{ all -> 0x01e5 }
            r11.put(r9, r0)     // Catch:{ all -> 0x01e5 }
            r9 = 1
            goto L_0x007f
        L_0x0106:
            java.lang.String r0 = "setting_action_definition"
            int r0 = r1.getColumnIndex(r0)     // Catch:{ all -> 0x01e5 }
            byte[] r0 = r1.getBlob(r0)     // Catch:{ all -> 0x01e5 }
            aubs r9 = defpackage.aubs.c()     // Catch:{ auda -> 0x012b }
            avmc r12 = defpackage.avmc.d     // Catch:{ auda -> 0x012b }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r12, (byte[]) r0, (defpackage.aubs) r9)     // Catch:{ auda -> 0x012b }
            avmc r0 = (defpackage.avmc) r0     // Catch:{ auda -> 0x012b }
            oab r0 = defpackage.oab.a((java.lang.String) r13, (java.lang.String) r14, (defpackage.avmc) r0, (java.lang.String) r15)     // Catch:{ all -> 0x01e5 }
            e()     // Catch:{ all -> 0x01e5 }
            java.lang.String r9 = r0.b     // Catch:{ all -> 0x01e5 }
            r11.put(r9, r0)     // Catch:{ all -> 0x01e5 }
            r9 = 1
            goto L_0x007f
        L_0x012b:
            r0 = move-exception
            java.lang.String r9 = "gH_HelpResponseDatabase"
            java.lang.String r12 = "Failed to parse AndroidSettingDefinition proto"
            android.util.Log.e(r9, r12, r0)     // Catch:{ all -> 0x01e5 }
            r9 = 1
            goto L_0x007f
        L_0x0136:
            java.lang.String r16 = r1.getString(r7)     // Catch:{ all -> 0x01e5 }
            boolean r0 = android.text.TextUtils.isEmpty(r16)     // Catch:{ all -> 0x01e5 }
            if (r0 != 0) goto L_0x0157
            java.lang.String r17 = r1.getString(r8)     // Catch:{ all -> 0x01e5 }
            long r18 = r1.getLong(r10)     // Catch:{ all -> 0x01e5 }
            oab r0 = defpackage.oab.b(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01e5 }
            e()     // Catch:{ all -> 0x01e5 }
            java.lang.String r9 = r0.b     // Catch:{ all -> 0x01e5 }
            r11.put(r9, r0)     // Catch:{ all -> 0x01e5 }
            r9 = 1
            goto L_0x007f
        L_0x0157:
            r9 = 1
            goto L_0x007f
        L_0x015a:
            oab r0 = defpackage.oab.b(r13, r14, r15)     // Catch:{ all -> 0x01e5 }
            e()     // Catch:{ all -> 0x01e5 }
            java.lang.String r9 = r0.b     // Catch:{ all -> 0x01e5 }
            r11.put(r9, r0)     // Catch:{ all -> 0x01e5 }
            r9 = 1
            goto L_0x007f
        L_0x0169:
            java.lang.String r0 = "intent_url"
            int r0 = r1.getColumnIndex(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.String r9 = r1.getString(r7)     // Catch:{ all -> 0x01e5 }
            boolean r12 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x01e5 }
            if (r12 != 0) goto L_0x017f
            r15 = r9
            goto L_0x0180
        L_0x017f:
        L_0x0180:
            oab r0 = defpackage.oab.a((java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r0, (java.lang.String) r15)     // Catch:{ all -> 0x01e5 }
            e()     // Catch:{ all -> 0x01e5 }
            java.lang.String r9 = r0.b     // Catch:{ all -> 0x01e5 }
            r11.put(r9, r0)     // Catch:{ all -> 0x01e5 }
            r9 = 1
            goto L_0x007f
        L_0x018f:
            oab r0 = defpackage.oab.a((java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15)     // Catch:{ all -> 0x01e5 }
            e()     // Catch:{ all -> 0x01e5 }
            java.lang.String r9 = r0.b     // Catch:{ all -> 0x01e5 }
            r11.put(r9, r0)     // Catch:{ all -> 0x01e5 }
            r9 = 1
            goto L_0x007f
        L_0x019e:
            java.lang.String r0 = "navigation_action_url"
            int r0 = r1.getColumnIndex(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x01e5 }
            oab r0 = defpackage.oab.b(r13, r14, r0, r15)     // Catch:{ all -> 0x01e5 }
            e()     // Catch:{ all -> 0x01e5 }
            java.lang.String r9 = r0.b     // Catch:{ all -> 0x01e5 }
            r11.put(r9, r0)     // Catch:{ all -> 0x01e5 }
            r9 = 1
            goto L_0x007f
        L_0x01b7:
            java.lang.String r16 = r1.getString(r7)     // Catch:{ all -> 0x01e5 }
            boolean r0 = android.text.TextUtils.isEmpty(r16)     // Catch:{ all -> 0x01e5 }
            if (r0 != 0) goto L_0x01d8
            java.lang.String r17 = r1.getString(r8)     // Catch:{ all -> 0x01e5 }
            long r18 = r1.getLong(r10)     // Catch:{ all -> 0x01e5 }
            oab r0 = defpackage.oab.a((java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (long) r18)     // Catch:{ all -> 0x01e5 }
            e()     // Catch:{ all -> 0x01e5 }
            java.lang.String r9 = r0.b     // Catch:{ all -> 0x01e5 }
            r11.put(r9, r0)     // Catch:{ all -> 0x01e5 }
            r9 = 1
            goto L_0x007f
        L_0x01d8:
            r9 = 1
            goto L_0x007f
        L_0x01db:
            r9 = 1
            goto L_0x007f
        L_0x01de:
            if (r1 == 0) goto L_0x01e3
            r1.close()     // Catch:{ all -> 0x01f5 }
        L_0x01e3:
            monitor-exit(r20)
            return r11
        L_0x01e5:
            r0 = move-exception
            goto L_0x01e9
        L_0x01e7:
            r0 = move-exception
            r1 = 0
        L_0x01e9:
            if (r1 == 0) goto L_0x01ee
            r1.close()     // Catch:{ all -> 0x01f5 }
        L_0x01ee:
            throw r0     // Catch:{ all -> 0x01f5 }
        L_0x01ef:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x01f5 }
            monitor-exit(r20)
            return r0
        L_0x01f5:
            r0 = move-exception
            monitor-exit(r20)
            goto L_0x01f9
        L_0x01f8:
            throw r0
        L_0x01f9:
            goto L_0x01f8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofn.a(java.lang.String[], java.lang.String):java.util.Map");
    }

    public final synchronized oab a(String str, String str2, boolean z) {
        String[] strArr;
        strArr = new String[3];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = !z ? "0" : "1";
        return a("id=? AND app_package_name=? AND is_in_dark_mode=?", strArr);
    }

    public final synchronized oab a(String str, boolean z) {
        String[] strArr;
        strArr = new String[3];
        strArr[0] = str;
        strArr[1] = Integer.toString(2);
        strArr[2] = !z ? "0" : "1";
        return a("url=? AND type=? AND is_in_dark_mode=?", strArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        return r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a8 A[Catch:{ all -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.omf a(android.content.Context r11, java.lang.String r12, int r13, java.lang.String r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            android.database.sqlite.SQLiteDatabase r0 = r10.a()     // Catch:{ all -> 0x00b2 }
            boolean r1 = r0.isOpen()     // Catch:{ all -> 0x00b2 }
            if (r1 == 0) goto L_0x00ac
            r1 = 2
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ all -> 0x00a4 }
            r8 = 0
            r4[r8] = r12     // Catch:{ all -> 0x00a4 }
            r9 = 1
            r4[r9] = r14     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = "help_responses"
            java.lang.String[] r2 = a     // Catch:{ all -> 0x00a4 }
            java.lang.String r3 = "id=? AND app_package_name=?"
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a4 }
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x00a2 }
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = "child_ids"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x00a2 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00a2 }
            if (r2 != 0) goto L_0x008e
            java.lang.String r2 = "is_feeling_lucky"
            int r2 = r0.getColumnIndex(r2)     // Catch:{ all -> 0x00a2 }
            int r2 = r0.getInt(r2)     // Catch:{ all -> 0x00a2 }
            if (r2 != r9) goto L_0x0045
            r2 = 1
            goto L_0x0046
        L_0x0045:
            r2 = 0
        L_0x0046:
            nz r3 = new nz     // Catch:{ all -> 0x00a2 }
            r3.<init>()     // Catch:{ all -> 0x00a2 }
            oab r2 = defpackage.oab.a((java.lang.String) r12, (boolean) r2)     // Catch:{ all -> 0x00a2 }
            r3.put(r12, r2)     // Catch:{ all -> 0x00a2 }
            java.lang.String r4 = ","
            java.lang.String[] r1 = r1.split(r4)     // Catch:{ all -> 0x00a2 }
            java.util.Map r14 = r10.a((java.lang.String[]) r1, (java.lang.String) r14)     // Catch:{ all -> 0x00a2 }
            int r4 = r1.length     // Catch:{ all -> 0x00a2 }
        L_0x005d:
            if (r8 >= r4) goto L_0x0074
            r5 = r1[r8]     // Catch:{ all -> 0x00a2 }
            java.lang.Object r5 = r14.get(r5)     // Catch:{ all -> 0x00a2 }
            oab r5 = (defpackage.oab) r5     // Catch:{ all -> 0x00a2 }
            if (r5 == 0) goto L_0x0071
            r2.a((defpackage.oab) r5)     // Catch:{ all -> 0x00a2 }
            java.lang.String r6 = r5.b     // Catch:{ all -> 0x00a2 }
            r3.put(r6, r5)     // Catch:{ all -> 0x00a2 }
        L_0x0071:
            int r8 = r8 + 1
            goto L_0x005d
        L_0x0074:
            int r14 = r3.h     // Catch:{ all -> 0x00a2 }
            if (r14 <= r9) goto L_0x0084
            omf r11 = new omf     // Catch:{ all -> 0x00a2 }
            r11.<init>(r12, r3, r13)     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x0082
            r0.close()     // Catch:{ all -> 0x00b2 }
        L_0x0082:
            monitor-exit(r10)
            return r11
        L_0x0084:
            omf r11 = defpackage.omf.b(r13, r11)     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x0082
            r0.close()     // Catch:{ all -> 0x00b2 }
            goto L_0x0082
        L_0x008e:
            omf r11 = defpackage.omf.b(r13, r11)     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x0082
            r0.close()     // Catch:{ all -> 0x00b2 }
            goto L_0x0082
        L_0x0098:
            omf r11 = defpackage.omf.b(r13, r11)     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x0082
            r0.close()     // Catch:{ all -> 0x00b2 }
            goto L_0x0082
        L_0x00a2:
            r11 = move-exception
            goto L_0x00a6
        L_0x00a4:
            r11 = move-exception
            r0 = 0
        L_0x00a6:
            if (r0 == 0) goto L_0x00ab
            r0.close()     // Catch:{ all -> 0x00b2 }
        L_0x00ab:
            throw r11     // Catch:{ all -> 0x00b2 }
        L_0x00ac:
            omf r11 = defpackage.omf.b(r13, r11)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r10)
            return r11
        L_0x00b2:
            r11 = move-exception
            monitor-exit(r10)
            goto L_0x00b6
        L_0x00b5:
            throw r11
        L_0x00b6:
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofn.a(android.content.Context, java.lang.String, int, java.lang.String):omf");
    }

    public final synchronized void a(long j) {
        SQLiteDatabase b2 = b();
        if (b2 != null && b2.isOpen() && !b2.isReadOnly()) {
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder(38);
            sb.append("saved_timestamp < ");
            sb.append(currentTimeMillis - j);
            b2.delete("help_responses", sb.toString(), (String[]) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r0 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        if (r0 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        if (r0 != null) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066 A[SYNTHETIC, Splitter:B:32:0x0066] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            android.database.sqlite.SQLiteDatabase r0 = r9.b()     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0058
            boolean r1 = r0.isOpen()     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0058
            boolean r1 = r0.isReadOnly()     // Catch:{ all -> 0x006a }
            if (r1 != 0) goto L_0x0058
            r1 = 2
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ all -> 0x0062 }
            r8 = 0
            r4[r8] = r10     // Catch:{ all -> 0x0062 }
            r1 = 1
            r4[r1] = r11     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = "help_responses"
            java.lang.String[] r2 = a     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = "id=? AND app_package_name=?"
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0062 }
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = "child_ids"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x0060 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0060 }
            if (r2 != 0) goto L_0x005a
            r9.b((java.lang.String) r10, (java.lang.String) r11)     // Catch:{ all -> 0x0060 }
            java.lang.String r10 = ","
            java.lang.String[] r10 = r1.split(r10)     // Catch:{ all -> 0x0060 }
        L_0x0048:
            int r1 = r10.length     // Catch:{ all -> 0x0060 }
            if (r8 >= r1) goto L_0x0053
            r1 = r10[r8]     // Catch:{ all -> 0x0060 }
            r9.b((java.lang.String) r1, (java.lang.String) r11)     // Catch:{ all -> 0x0060 }
            int r8 = r8 + 1
            goto L_0x0048
        L_0x0053:
            if (r0 == 0) goto L_0x0058
        L_0x0055:
            r0.close()     // Catch:{ all -> 0x006a }
        L_0x0058:
            monitor-exit(r9)
            return
        L_0x005a:
            if (r0 == 0) goto L_0x0058
            goto L_0x0055
        L_0x005d:
            if (r0 == 0) goto L_0x0058
            goto L_0x0055
        L_0x0060:
            r10 = move-exception
            goto L_0x0064
        L_0x0062:
            r10 = move-exception
            r0 = 0
        L_0x0064:
            if (r0 == 0) goto L_0x0069
            r0.close()     // Catch:{ all -> 0x006a }
        L_0x0069:
            throw r10     // Catch:{ all -> 0x006a }
        L_0x006a:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x006e
        L_0x006d:
            throw r10
        L_0x006e:
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofn.a(java.lang.String, java.lang.String):void");
    }

    public final synchronized void a(oab oab, String str) {
        SQLiteDatabase b2;
        if (oab.t && (b2 = b()) != null && b2.isOpen() && !b2.isReadOnly()) {
            b2.replace("help_responses", (String) null, c(oab, str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.omf r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.database.sqlite.SQLiteDatabase r0 = r4.b()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x004e
            boolean r1 = r0.isOpen()     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x004e
            boolean r1 = r0.isReadOnly()     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x004e
            r0.beginTransaction()     // Catch:{ all -> 0x0050 }
            java.util.Map r5 = r5.b     // Catch:{ all -> 0x0049 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ all -> 0x0049 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0049 }
        L_0x0020:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0041
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x0049 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0049 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0049 }
            oab r1 = (defpackage.oab) r1     // Catch:{ all -> 0x0049 }
            boolean r2 = r1.r     // Catch:{ all -> 0x0049 }
            if (r2 != 0) goto L_0x0020
            java.lang.String r2 = "help_responses"
            r3 = 0
            android.content.ContentValues r1 = c(r1, r6)     // Catch:{ all -> 0x0049 }
            r0.replace(r2, r3, r1)     // Catch:{ all -> 0x0049 }
            goto L_0x0020
        L_0x0041:
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x0049 }
            r0.endTransaction()     // Catch:{ all -> 0x0050 }
            monitor-exit(r4)
            return
        L_0x0049:
            r5 = move-exception
            r0.endTransaction()     // Catch:{ all -> 0x0050 }
            throw r5     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r4)
            return
        L_0x0050:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x0054
        L_0x0053:
            throw r5
        L_0x0054:
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofn.a(omf, java.lang.String):void");
    }
}
