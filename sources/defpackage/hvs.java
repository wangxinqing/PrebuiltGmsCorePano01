package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: hvs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hvs implements hvg {
    private final jjj a;
    private final hvt b;
    private final hvq c;
    private final hvu d = new hvu();
    private final hty e;
    private final long f;
    private final Context g;

    public hvs(jjj jjj, long j, ahei ahei, Context context) {
        iva.a((Object) jjj);
        this.a = jjj;
        this.b = new hvt(jjj);
        this.c = new hvq(jjj, this);
        String[] strArr = hvo.a;
        this.e = new hty(context, ahei);
        this.f = j;
        this.g = context;
    }

    private final void a(avrm avrm) {
        byte[] a2 = hvi.a(avrm);
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        writableDatabase.beginTransactionNonExclusive();
        try {
            for (Long longValue : this.c.c(writableDatabase)) {
                this.c.a(writableDatabase, longValue.longValue(), a2);
            }
            writableDatabase.setTransactionSuccessful();
        } catch (SQLException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("Failed to write internal event ");
            sb.append(valueOf);
            sb.toString();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        writableDatabase.endTransaction();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
        r8 = new java.lang.StringBuilder(31);
        r8.append("SELECT: id=");
        r8.append(r13);
        r8.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(defpackage.avtn r17, defpackage.auay r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.String r2 = "INSERT: id="
            java.lang.String r3 = "play_logger_context"
            jjj r4 = r1.a
            android.database.sqlite.SQLiteDatabase r4 = r4.getWritableDatabase()
            r4.beginTransactionNonExclusive()
            hvt r5 = r1.b     // Catch:{ SQLException -> 0x0175 }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLException -> 0x0175 }
            java.lang.String r6 = "Clearcut Sqlite serialize PLC proto"
            android.os.Trace.beginSection(r6)     // Catch:{ SQLException -> 0x0175 }
            byte[] r6 = r17.k()     // Catch:{ SQLException -> 0x0175 }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLException -> 0x0175 }
            android.os.Trace.endSection()     // Catch:{ SQLException -> 0x0175 }
            int r7 = defpackage.hvt.a((byte[]) r6)     // Catch:{ SQLException -> 0x0175 }
            r8 = 1
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ SQLException -> 0x0175 }
            java.lang.String r10 = java.lang.Integer.toString(r7)     // Catch:{ SQLException -> 0x0175 }
            r11 = 0
            r9[r11] = r10     // Catch:{ SQLException -> 0x0175 }
            java.lang.String[] r10 = defpackage.hvt.a     // Catch:{ SQLException -> 0x0175 }
            java.lang.String r12 = "hash = ?"
            android.database.Cursor r5 = r5.a(r10, r12, r9)     // Catch:{ SQLException -> 0x0175 }
        L_0x0039:
            boolean r9 = r5.moveToNext()     // Catch:{ all -> 0x016e }
            java.lang.String r10 = " hash="
            r12 = 31
            if (r9 == 0) goto L_0x008a
            long r13 = r5.getLong(r11)     // Catch:{ all -> 0x016e }
            byte[] r9 = r5.getBlob(r8)     // Catch:{ all -> 0x016e }
            boolean r15 = defpackage.hvt.a(r9, r7)     // Catch:{ all -> 0x016e }
            if (r15 != 0) goto L_0x0070
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x016e }
            r12 = 74
            r9.<init>(r12)     // Catch:{ all -> 0x016e }
            java.lang.String r12 = "SQLite database row is corrupted: id="
            r9.append(r12)     // Catch:{ all -> 0x016e }
            r9.append(r13)     // Catch:{ all -> 0x016e }
            r9.append(r10)     // Catch:{ all -> 0x016e }
            r9.append(r7)     // Catch:{ all -> 0x016e }
            java.lang.String r10 = "SqlitePlayLoggerContextTable"
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x016e }
            android.util.Log.e(r10, r9)     // Catch:{ all -> 0x016e }
            goto L_0x0039
        L_0x0070:
            boolean r9 = java.util.Arrays.equals(r9, r6)     // Catch:{ all -> 0x016e }
            if (r9 == 0) goto L_0x0039
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x016e }
            r8.<init>(r12)     // Catch:{ all -> 0x016e }
            java.lang.String r9 = "SELECT: id="
            r8.append(r9)     // Catch:{ all -> 0x016e }
            r8.append(r13)     // Catch:{ all -> 0x016e }
            r8.toString()     // Catch:{ all -> 0x016e }
            r5.close()     // Catch:{ SQLException -> 0x0175 }
            goto L_0x008f
        L_0x008a:
            r5.close()     // Catch:{ SQLException -> 0x0175 }
            r13 = -1
        L_0x008f:
            r8 = 0
            r5 = 0
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 >= 0) goto L_0x0126
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ SQLException -> 0x0175 }
            r13.<init>()     // Catch:{ SQLException -> 0x0175 }
            java.lang.String r14 = "hash"
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)     // Catch:{ SQLException -> 0x0175 }
            r13.put(r14, r15)     // Catch:{ SQLException -> 0x0175 }
            r13.put(r3, r6)     // Catch:{ SQLException -> 0x0175 }
            java.lang.String r6 = "qos_tier"
            int r14 = r0.a     // Catch:{ SQLException -> 0x0175 }
            r14 = r14 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x00b6
            int r14 = r0.k     // Catch:{ SQLException -> 0x0175 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLException -> 0x0175 }
            goto L_0x00b7
        L_0x00b6:
            r14 = r5
        L_0x00b7:
            r13.put(r6, r14)     // Catch:{ SQLException -> 0x0175 }
            long r13 = r4.insertOrThrow(r3, r5, r13)     // Catch:{ SQLException -> 0x0175 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLException -> 0x0175 }
            r3.<init>(r12)     // Catch:{ SQLException -> 0x0175 }
            r3.append(r2)     // Catch:{ SQLException -> 0x0175 }
            r3.append(r13)     // Catch:{ SQLException -> 0x0175 }
            r3.toString()     // Catch:{ SQLException -> 0x0175 }
            int r3 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x0125
            android.database.SQLException r3 = new android.database.SQLException     // Catch:{ SQLException -> 0x0175 }
            java.lang.String r5 = java.lang.String.valueOf(r17)     // Catch:{ SQLException -> 0x0175 }
            int r6 = r0.a     // Catch:{ SQLException -> 0x0175 }
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x00e3
            int r0 = r0.k     // Catch:{ SQLException -> 0x0175 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLException -> 0x0175 }
            goto L_0x00e5
        L_0x00e3:
            java.lang.String r0 = "null"
        L_0x00e5:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ SQLException -> 0x0175 }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ SQLException -> 0x0175 }
            int r6 = r6.length()     // Catch:{ SQLException -> 0x0175 }
            java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch:{ SQLException -> 0x0175 }
            int r8 = r8.length()     // Catch:{ SQLException -> 0x0175 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ SQLException -> 0x0175 }
            int r6 = r6 + 72
            int r6 = r6 + r8
            r9.<init>(r6)     // Catch:{ SQLException -> 0x0175 }
            r9.append(r2)     // Catch:{ SQLException -> 0x0175 }
            r9.append(r13)     // Catch:{ SQLException -> 0x0175 }
            r9.append(r10)     // Catch:{ SQLException -> 0x0175 }
            r9.append(r7)     // Catch:{ SQLException -> 0x0175 }
            java.lang.String r2 = " loggerContext="
            r9.append(r2)     // Catch:{ SQLException -> 0x0175 }
            r9.append(r5)     // Catch:{ SQLException -> 0x0175 }
            java.lang.String r2 = " qosTier="
            r9.append(r2)     // Catch:{ SQLException -> 0x0175 }
            r9.append(r0)     // Catch:{ SQLException -> 0x0175 }
            java.lang.String r0 = r9.toString()     // Catch:{ SQLException -> 0x0175 }
            r3.<init>(r0)     // Catch:{ SQLException -> 0x0175 }
            throw r3     // Catch:{ SQLException -> 0x0175 }
        L_0x0125:
            goto L_0x0127
        L_0x0126:
        L_0x0127:
            java.lang.String r0 = "SELECT MAX(_id) FROM log_event"
            long r2 = android.database.DatabaseUtils.longForQuery(r4, r0, r5)     // Catch:{ SQLException -> 0x0175 }
            r5 = -9223372036854775808
            long r2 = r2 + r5
            hvq r0 = r1.c     // Catch:{ SQLException -> 0x0175 }
            aubc r5 = r18.h()     // Catch:{ SQLException -> 0x0175 }
            r5.t()     // Catch:{ SQLException -> 0x0175 }
            avrm r6 = defpackage.avrm.t     // Catch:{ SQLException -> 0x0175 }
            aucd r6 = r6.o()     // Catch:{ SQLException -> 0x0175 }
            aucf r6 = (defpackage.aucf) r6     // Catch:{ SQLException -> 0x0175 }
            r6.a((defpackage.aubc) r5)     // Catch:{ SQLException -> 0x0175 }
            boolean r5 = r6.c     // Catch:{ SQLException -> 0x0175 }
            if (r5 != 0) goto L_0x0149
            goto L_0x014e
        L_0x0149:
            r6.c()     // Catch:{ SQLException -> 0x0175 }
            r6.c = r11     // Catch:{ SQLException -> 0x0175 }
        L_0x014e:
            aucj r5 = r6.b     // Catch:{ SQLException -> 0x0175 }
            avrm r5 = (defpackage.avrm) r5     // Catch:{ SQLException -> 0x0175 }
            int r7 = r5.a     // Catch:{ SQLException -> 0x0175 }
            r7 = r7 | 4
            r5.a = r7     // Catch:{ SQLException -> 0x0175 }
            r5.d = r2     // Catch:{ SQLException -> 0x0175 }
            aucj r2 = r6.i()     // Catch:{ SQLException -> 0x0175 }
            avrm r2 = (defpackage.avrm) r2     // Catch:{ SQLException -> 0x0175 }
            byte[] r2 = defpackage.hvi.a((defpackage.avrm) r2)     // Catch:{ SQLException -> 0x0175 }
            r0.a((android.database.sqlite.SQLiteDatabase) r4, (long) r13, (byte[]) r2)     // Catch:{ SQLException -> 0x0175 }
            r4.setTransactionSuccessful()     // Catch:{ SQLException -> 0x0175 }
            r4.endTransaction()
            return
        L_0x016e:
            r0 = move-exception
            r5.close()     // Catch:{ SQLException -> 0x0175 }
            throw r0     // Catch:{ SQLException -> 0x0175 }
        L_0x0173:
            r0 = move-exception
            goto L_0x017e
        L_0x0175:
            r0 = move-exception
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0173 }
            java.lang.String r3 = "Could not write to SQLite"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0173 }
            throw r2     // Catch:{ all -> 0x0173 }
        L_0x017e:
            r4.endTransaction()
            goto L_0x0183
        L_0x0182:
            throw r0
        L_0x0183:
            goto L_0x0182
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvs.b(avtn, auay):void");
    }

    public final long b(String str) {
        return 0;
    }

    /* JADX INFO: finally extract failed */
    public final List c(String str) {
        int i;
        int i2;
        int i3;
        HashMap hashMap = new HashMap();
        hvt hvt = this.b;
        HashMap hashMap2 = new HashMap();
        Cursor a2 = hvt.a();
        while (true) {
            try {
                i = 2;
                i2 = 1;
                i3 = 0;
                if (!a2.moveToNext()) {
                    break;
                }
                long j = a2.getLong(0);
                int i4 = a2.getInt(1);
                byte[] blob = a2.getBlob(2);
                if (!hvt.a(blob, i4)) {
                    StringBuilder sb = new StringBuilder(72);
                    sb.append("PlayLoggerContext is corrupted: id=");
                    sb.append(j);
                    sb.append(" hash=");
                    sb.append(i4);
                    Log.e("SqlitePlayLoggerContextTable", sb.toString());
                } else {
                    avtn a3 = hvi.a(blob);
                    if (a3 == null) {
                        StringBuilder sb2 = new StringBuilder(53);
                        sb2.append("Failed to deserialize PLC for id=");
                        sb2.append(j);
                        Log.e("SqlitePlayLoggerContextTable", sb2.toString());
                    } else if (a3.i.equals(str)) {
                        hashMap2.put(Long.valueOf(j), a3);
                    }
                }
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        }
        a2.close();
        for (Map.Entry entry : hashMap2.entrySet()) {
            hashMap.put((Long) entry.getKey(), hwt.a((avtn) entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        hvq hvq = this.c;
        String[] strArr = hvq.a;
        hvp a4 = hvq.a("play_logger_context_id", hvq.a((List) arrayList));
        Cursor query = hvq.c.getWritableDatabase().query(false, "log_event", strArr, a4.a, a4.b, (String) null, (String) null, "_id ASC", (String) null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        while (query.moveToNext()) {
            try {
                long j2 = query.getLong(i3);
                long j3 = query.getLong(i);
                int i5 = query.getInt(i2);
                byte[] blob2 = query.getBlob(3);
                if (!hvq.a(j3, blob2, i5)) {
                    StringBuilder sb3 = new StringBuilder(60);
                    sb3.append("Invalid LogEvent hash for log event id: ");
                    sb3.append(j2);
                    Log.e("SqliteLogStore", sb3.toString());
                } else {
                    arrayList3.add(Long.valueOf(j2));
                    PlayLoggerContext playLoggerContext = (PlayLoggerContext) hashMap.get(Long.valueOf(j3));
                    String str2 = playLoggerContext.a;
                    int i6 = playLoggerContext.b;
                    int i7 = playLoggerContext.c;
                    String str3 = playLoggerContext.d;
                    HashMap hashMap3 = hashMap;
                    int i8 = i6;
                    int i9 = i7;
                    String str4 = str3;
                    LogEventParcelable logEventParcelable = new LogEventParcelable(new PlayLoggerContext(str2, i8, i9, str4, playLoggerContext.e, playLoggerContext.f, playLoggerContext.g, playLoggerContext.h, playLoggerContext.i, playLoggerContext.j));
                    logEventParcelable.b = aubc.a(blob2).m();
                    arrayList2.add(logEventParcelable);
                    hashMap = hashMap3;
                    i = 2;
                    i2 = 1;
                    i3 = 0;
                }
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        for (List b2 : anda.a((List) arrayList3, 512)) {
            this.c.b(b2);
        }
        return arrayList2;
    }

    public final Map c() {
        return null;
    }

    public final void close() {
    }

    public final boolean d() {
        return a(this.a.getWritableDatabase());
    }

    public final long e() {
        SQLiteDatabase writableDatabase = this.b.b.getWritableDatabase();
        StringBuilder sb = new StringBuilder();
        sb.append("select count(*) from play_logger_context");
        if (!TextUtils.isEmpty((CharSequence) null)) {
            sb.append(" where null");
        }
        return DatabaseUtils.longForQuery(writableDatabase, sb.toString(), (String[]) null);
    }

    public final Map f() {
        HashMap hashMap = new HashMap();
        Cursor rawQuery = this.a.getWritableDatabase().rawQuery("SELECT sum(length(log_event.log_event)),play_logger_context.play_logger_context FROM log_event, play_logger_context WHERE log_event.play_logger_context_id == play_logger_context._id GROUP BY play_logger_context._id", (String[]) null);
        while (rawQuery.moveToNext()) {
            try {
                avtn a2 = hvi.a(rawQuery.getBlob(1));
                if (a2 == null) {
                    Log.e("SqliteLogStore", "Could not parse PlayLoggerContext proto.");
                } else {
                    long j = rawQuery.getLong(0);
                    if (j > 0) {
                        hashMap.put(a2, new huy(j));
                    }
                }
            } finally {
                rawQuery.close();
            }
        }
        return hashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: hva} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: hva} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: hva} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v41, resolved type: hva} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v47, resolved type: hva} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v48, resolved type: hva} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v49, resolved type: hva} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v50, resolved type: hva} */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b6, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0280 A[SYNTHETIC, Splitter:B:114:0x0280] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x01b8 A[EDGE_INSN: B:177:0x01b8->B:70:0x01b8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a5 A[LOOP:4: B:41:0x00fd->B:66:0x01a5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x022c A[SYNTHETIC, Splitter:B:98:0x022c] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:163:0x0303=Splitter:B:163:0x0303, B:150:0x02eb=Splitter:B:150:0x02eb} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.hva i() {
        /*
            r29 = this;
            r1 = r29
            java.lang.String r2 = "play_logger_context_id"
            java.lang.String r3 = "size"
            java.lang.String r4 = "SqliteLogStore"
            hva r5 = new hva
            r5.<init>()
            jjj r0 = r1.a     // Catch:{ IOException -> 0x030d, SQLiteException -> 0x030b }
            android.database.sqlite.SQLiteDatabase r6 = r0.getWritableDatabase()     // Catch:{ IOException -> 0x030d, SQLiteException -> 0x030b }
            r6.beginTransactionNonExclusive()     // Catch:{ IOException -> 0x030d, SQLiteException -> 0x030b }
            java.lang.String r0 = "SELECT play_logger_context._id FROM play_logger_context WHERE play_logger_context._id NOT IN (SELECT DISTINCT log_event.play_logger_context_id FROM log_event)"
            r7 = 0
            android.database.Cursor r8 = r6.rawQuery(r0, r7)     // Catch:{ all -> 0x02ff }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x02ff }
            r0.<init>()     // Catch:{ all -> 0x02ff }
        L_0x0022:
            boolean r9 = r8.moveToNext()     // Catch:{ all -> 0x02f5 }
            r10 = 0
            if (r9 == 0) goto L_0x0035
            long r9 = r8.getLong(r10)     // Catch:{ all -> 0x02f5 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x02f5 }
            r0.add(r9)     // Catch:{ all -> 0x02f5 }
            goto L_0x0022
        L_0x0035:
            r8.close()     // Catch:{ all -> 0x02ff }
        L_0x0038:
            boolean r8 = r0.isEmpty()     // Catch:{ all -> 0x02ff }
            r9 = 512(0x200, float:7.175E-43)
            java.lang.String r11 = "play_logger_context"
            java.lang.String r12 = "_id"
            if (r8 != 0) goto L_0x00a6
            int r8 = r0.size()     // Catch:{ all -> 0x02ff }
            int r8 = java.lang.Math.min(r8, r9)     // Catch:{ all -> 0x02ff }
            java.util.List r8 = r0.subList(r10, r8)     // Catch:{ all -> 0x02ff }
            long r13 = r5.h     // Catch:{ all -> 0x02ff }
            hvt r9 = r1.b     // Catch:{ all -> 0x02ff }
            int r15 = r8.size()     // Catch:{ all -> 0x02ff }
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ all -> 0x02ff }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ff }
            r10.<init>(r12)     // Catch:{ all -> 0x02ff }
            java.lang.String r12 = " IN ("
            r10.append(r12)     // Catch:{ all -> 0x02ff }
            r12 = 0
        L_0x0065:
            int r7 = r8.size()     // Catch:{ all -> 0x02ff }
            if (r12 < r7) goto L_0x0088
            java.lang.String r7 = ")"
            r10.append(r7)     // Catch:{ all -> 0x02ff }
            jjj r7 = r9.b     // Catch:{ all -> 0x02ff }
            android.database.sqlite.SQLiteDatabase r7 = r7.getWritableDatabase()     // Catch:{ all -> 0x02ff }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x02ff }
            int r7 = r7.delete(r11, r9, r15)     // Catch:{ all -> 0x02ff }
            long r9 = (long) r7     // Catch:{ all -> 0x02ff }
            long r13 = r13 + r9
            r5.h = r13     // Catch:{ all -> 0x02ff }
            r8.clear()     // Catch:{ all -> 0x02ff }
            r7 = 0
            r10 = 0
            goto L_0x0038
        L_0x0088:
            java.lang.Object r7 = r8.get(r12)     // Catch:{ all -> 0x02ff }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x02ff }
            long r16 = r7.longValue()     // Catch:{ all -> 0x02ff }
            java.lang.String r7 = java.lang.Long.toString(r16)     // Catch:{ all -> 0x02ff }
            r15[r12] = r7     // Catch:{ all -> 0x02ff }
            if (r12 == 0) goto L_0x009d
            java.lang.String r7 = ", ?"
            goto L_0x009f
        L_0x009d:
            java.lang.String r7 = "?"
        L_0x009f:
            r10.append(r7)     // Catch:{ all -> 0x02ff }
            int r12 = r12 + 1
            r7 = 0
            goto L_0x0065
        L_0x00a6:
            r6.setTransactionSuccessful()     // Catch:{ all -> 0x02ff }
            r6.endTransaction()     // Catch:{ IOException -> 0x030d, SQLiteException -> 0x030b }
            long r6 = r29.b()     // Catch:{ IOException -> 0x030d, SQLiteException -> 0x030b }
            long r13 = r1.f     // Catch:{ IOException -> 0x030d, SQLiteException -> 0x030b }
            int r0 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x02f2
            jjj r0 = r1.a     // Catch:{ IOException -> 0x030d, SQLiteException -> 0x030b }
            android.database.sqlite.SQLiteDatabase r6 = r0.getWritableDatabase()     // Catch:{ IOException -> 0x030d, SQLiteException -> 0x030b }
            long r7 = r29.b()     // Catch:{ IOException -> 0x030d, SQLiteException -> 0x030b }
            long r13 = r1.f     // Catch:{ IOException -> 0x030d, SQLiteException -> 0x030b }
            long r7 = r7 - r13
            r13 = 0
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x02ef
            hvq r10 = r1.c     // Catch:{ IOException -> 0x030d, SQLiteException -> 0x030b }
            r6.beginTransactionNonExclusive()     // Catch:{ IOException -> 0x030d, SQLiteException -> 0x030b }
        L_0x00ce:
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0294
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ hvm -> 0x028f, all -> 0x028a }
            r15.<init>()     // Catch:{ hvm -> 0x028f, all -> 0x028a }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ hvm -> 0x028f, all -> 0x028a }
            r13.<init>()     // Catch:{ hvm -> 0x028f, all -> 0x028a }
            jjj r0 = r10.c     // Catch:{ hvm -> 0x028f, all -> 0x028a }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ hvm -> 0x028f, all -> 0x028a }
            java.lang.String r14 = "SELECT log_event._id,LENGTH(log_event.log_event) AS size,log_event.play_logger_context_id,play_logger_context.play_logger_context FROM log_event, play_logger_context WHERE log_event.play_logger_context_id == play_logger_context._id LIMIT 512"
            r9 = 0
            android.database.Cursor r14 = r0.rawQuery(r14, r9)     // Catch:{ hvm -> 0x028f, all -> 0x028a }
            int r9 = r14.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x0279 }
            r18 = r7
            int r7 = r14.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0279 }
            int r8 = r14.getColumnIndexOrThrow(r11)     // Catch:{ all -> 0x0279 }
            r20 = r4
            int r4 = r14.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0277 }
        L_0x00fd:
            boolean r0 = r14.moveToNext()     // Catch:{ all -> 0x0277 }
            if (r0 == 0) goto L_0x01b6
            int r0 = r15.size()     // Catch:{ all -> 0x01b1 }
            r1 = 512(0x200, float:7.175E-43)
            if (r0 >= r1) goto L_0x01b6
            long r22 = r14.getLong(r9)     // Catch:{ all -> 0x01b1 }
            long r24 = r14.getLong(r7)     // Catch:{ all -> 0x01b1 }
            byte[] r0 = r14.getBlob(r8)     // Catch:{ all -> 0x01b1 }
            long r26 = r14.getLong(r4)     // Catch:{ all -> 0x01b1 }
            avtn r0 = defpackage.hvi.a((byte[]) r0)     // Catch:{ all -> 0x01b1 }
            java.lang.String r1 = "SqliteLogEventTable"
            if (r0 != 0) goto L_0x0135
            java.lang.String r0 = "Could not parse PlayLoggerContext proto."
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x01b1 }
            avtn r0 = defpackage.avtn.o     // Catch:{ all -> 0x01b1 }
            r28 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r26)     // Catch:{ all -> 0x01b1 }
            r13.add(r0)     // Catch:{ all -> 0x01b1 }
            r0 = r28
        L_0x0135:
            r26 = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x01b1 }
            r15.add(r4)     // Catch:{ all -> 0x01b1 }
            long r18 = r18 - r24
            r4 = r7
            r22 = r8
            long r7 = r5.b     // Catch:{ all -> 0x01b1 }
            long r7 = r7 + r24
            r5.b = r7     // Catch:{ all -> 0x01b1 }
            long r7 = r5.f     // Catch:{ all -> 0x01b1 }
            r23 = 1
            long r7 = r7 + r23
            r5.f = r7     // Catch:{ all -> 0x01b1 }
            java.lang.String r7 = defpackage.hwt.b(r0)     // Catch:{ all -> 0x01b1 }
            hvs r0 = r10.b     // Catch:{ IOException -> 0x0164 }
            hvc r8 = defpackage.hvc.OVERSIZE     // Catch:{ IOException -> 0x0164 }
            r23 = r4
            r4 = 1
            r0.a((java.lang.String) r7, (defpackage.hvd) r8, (int) r4)     // Catch:{ IOException -> 0x0162 }
            r24 = r9
            goto L_0x019f
        L_0x0162:
            r0 = move-exception
            goto L_0x0167
        L_0x0164:
            r0 = move-exception
            r23 = r4
        L_0x0167:
            hvc r4 = defpackage.hvc.OVERSIZE     // Catch:{ all -> 0x01b1 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x01b1 }
            java.lang.String r8 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x01b1 }
            int r8 = r8.length()     // Catch:{ all -> 0x01b1 }
            int r8 = r8 + 51
            java.lang.String r24 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x01b1 }
            int r24 = r24.length()     // Catch:{ all -> 0x01b1 }
            int r8 = r8 + r24
            r24 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b1 }
            r9.<init>(r8)     // Catch:{ all -> 0x01b1 }
            java.lang.String r8 = "Failed to record log drop for source: "
            r9.append(r8)     // Catch:{ all -> 0x01b1 }
            r9.append(r7)     // Catch:{ all -> 0x01b1 }
            java.lang.String r7 = " and reason: "
            r9.append(r7)     // Catch:{ all -> 0x01b1 }
            r9.append(r4)     // Catch:{ all -> 0x01b1 }
            java.lang.String r4 = r9.toString()     // Catch:{ all -> 0x01b1 }
            android.util.Log.e(r1, r4, r0)     // Catch:{ all -> 0x01b1 }
        L_0x019f:
            r7 = 0
            int r0 = (r18 > r7 ? 1 : (r18 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b8
            r1 = r29
            r8 = r22
            r7 = r23
            r9 = r24
            r4 = r26
            goto L_0x00fd
        L_0x01b1:
            r0 = move-exception
            r1 = r0
            r4 = r5
            goto L_0x027e
        L_0x01b6:
            r7 = 0
        L_0x01b8:
            if (r14 != 0) goto L_0x01bb
            goto L_0x01be
        L_0x01bb:
            r14.close()     // Catch:{ hvm -> 0x0275, all -> 0x0273 }
        L_0x01be:
            r10.b((java.util.List) r15)     // Catch:{ hvm -> 0x0275, all -> 0x0273 }
            java.util.Iterator r0 = r13.iterator()     // Catch:{ hvm -> 0x0275, all -> 0x0273 }
            r14 = r7
        L_0x01c6:
            boolean r1 = r0.hasNext()     // Catch:{ hvm -> 0x0275, all -> 0x0273 }
            if (r1 == 0) goto L_0x0236
            java.lang.Object r1 = r0.next()     // Catch:{ hvm -> 0x0275, all -> 0x0273 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ hvm -> 0x0275, all -> 0x0273 }
            jjj r4 = r10.c     // Catch:{ hvm -> 0x0275, all -> 0x0273 }
            android.database.sqlite.SQLiteDatabase r4 = r4.getWritableDatabase()     // Catch:{ hvm -> 0x0275, all -> 0x0273 }
            r9 = 1
            java.lang.String[] r7 = new java.lang.String[r9]     // Catch:{ hvm -> 0x0275, all -> 0x0273 }
            java.lang.String r1 = r1.toString()     // Catch:{ hvm -> 0x0275, all -> 0x0273 }
            r8 = 0
            r7[r8] = r1     // Catch:{ hvm -> 0x0275, all -> 0x0273 }
            java.lang.String r1 = "SELECT COUNT(log_event) AS cnt,SUM(LENGTH(log_event)) AS size FROM log_event WHERE play_logger_context_id= ?"
            android.database.Cursor r1 = r4.rawQuery(r1, r7)     // Catch:{ hvm -> 0x0275, all -> 0x0273 }
            java.lang.String r4 = "cnt"
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0227 }
            int r7 = r1.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0227 }
            r1.moveToNext()     // Catch:{ all -> 0x0227 }
            long r21 = r1.getLong(r4)     // Catch:{ all -> 0x0227 }
            long r8 = r1.getLong(r7)     // Catch:{ all -> 0x0227 }
            hvs r7 = r10.b     // Catch:{ all -> 0x0227 }
            r23 = r5
            long r4 = -r8
            r7.a((android.database.sqlite.SQLiteDatabase) r6, (long) r4)     // Catch:{ all -> 0x0223 }
            r7 = r10
            r5 = r11
            r4 = r23
            long r10 = r4.g     // Catch:{ all -> 0x0221 }
            long r10 = r10 + r21
            r4.g = r10     // Catch:{ all -> 0x0221 }
            long r10 = r4.c     // Catch:{ all -> 0x0221 }
            long r10 = r10 + r8
            r4.c = r10     // Catch:{ all -> 0x0221 }
            long r14 = r14 + r8
            if (r1 == 0) goto L_0x021a
            r1.close()     // Catch:{ hvm -> 0x02dd, all -> 0x02d7 }
        L_0x021a:
            r11 = r5
            r10 = r7
            r7 = 0
            r5 = r4
            goto L_0x01c6
        L_0x0221:
            r0 = move-exception
            goto L_0x0229
        L_0x0223:
            r0 = move-exception
            r4 = r23
            goto L_0x0229
        L_0x0227:
            r0 = move-exception
            r4 = r5
        L_0x0229:
            r2 = r0
            if (r1 == 0) goto L_0x0235
            r1.close()     // Catch:{ all -> 0x0230 }
            goto L_0x0235
        L_0x0230:
            r0 = move-exception
            r1 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r1)     // Catch:{ hvm -> 0x02dd, all -> 0x02d7 }
        L_0x0235:
            throw r2     // Catch:{ hvm -> 0x02dd, all -> 0x02d7 }
        L_0x0236:
            r4 = r5
            r7 = r10
            r5 = r11
            long[] r0 = defpackage.hvq.a((java.util.List) r13)     // Catch:{ hvm -> 0x02dd, all -> 0x02d7 }
            hvp r0 = defpackage.hvq.a((java.lang.String) r2, (long[]) r0)     // Catch:{ hvm -> 0x02dd, all -> 0x02d7 }
            java.lang.String r1 = "log_event"
            java.lang.String r8 = r0.a     // Catch:{ hvm -> 0x02dd, all -> 0x02d7 }
            java.lang.String[] r0 = r0.b     // Catch:{ hvm -> 0x02dd, all -> 0x02d7 }
            r6.delete(r1, r8, r0)     // Catch:{ hvm -> 0x02dd, all -> 0x02d7 }
            long[] r0 = defpackage.hvq.a((java.util.List) r13)     // Catch:{ hvm -> 0x02dd, all -> 0x02d7 }
            hvp r0 = defpackage.hvq.a((java.lang.String) r12, (long[]) r0)     // Catch:{ hvm -> 0x02dd, all -> 0x02d7 }
            long r8 = r4.d     // Catch:{ hvm -> 0x02dd, all -> 0x02d7 }
            int r1 = r13.size()     // Catch:{ hvm -> 0x02dd, all -> 0x02d7 }
            long r10 = (long) r1     // Catch:{ hvm -> 0x02dd, all -> 0x02d7 }
            long r8 = r8 + r10
            r4.d = r8     // Catch:{ hvm -> 0x02dd, all -> 0x02d7 }
            java.lang.String r1 = r0.a     // Catch:{ hvm -> 0x02dd, all -> 0x02d7 }
            java.lang.String[] r0 = r0.b     // Catch:{ hvm -> 0x02dd, all -> 0x02d7 }
            r6.delete(r5, r1, r0)     // Catch:{ hvm -> 0x02dd, all -> 0x02d7 }
            long r0 = r18 - r14
            r11 = r5
            r10 = r7
            r9 = 512(0x200, float:7.175E-43)
            r13 = 0
            r7 = r0
            r5 = r4
            r4 = r20
            r1 = r29
            goto L_0x00ce
        L_0x0273:
            r0 = move-exception
            goto L_0x028d
        L_0x0275:
            r0 = move-exception
            goto L_0x0292
        L_0x0277:
            r0 = move-exception
            goto L_0x027c
        L_0x0279:
            r0 = move-exception
            r20 = r4
        L_0x027c:
            r4 = r5
            r1 = r0
        L_0x027e:
            if (r14 == 0) goto L_0x0289
            r14.close()     // Catch:{ all -> 0x0284 }
            goto L_0x0289
        L_0x0284:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ hvm -> 0x02dd, all -> 0x02d7 }
        L_0x0289:
            throw r1     // Catch:{ hvm -> 0x02dd, all -> 0x02d7 }
        L_0x028a:
            r0 = move-exception
            r20 = r4
        L_0x028d:
            r4 = r5
            goto L_0x02d8
        L_0x028f:
            r0 = move-exception
            r20 = r4
        L_0x0292:
            r4 = r5
            goto L_0x02de
        L_0x0294:
            r20 = r4
            r4 = r5
            r6.setTransactionSuccessful()     // Catch:{ hvm -> 0x02dd, all -> 0x02d7 }
            r6.endTransaction()     // Catch:{ IOException -> 0x02d1, SQLiteException -> 0x02cf }
            long r0 = r29.b()     // Catch:{ IOException -> 0x02d1, SQLiteException -> 0x02cf }
            r2 = r29
            long r5 = r2.f     // Catch:{ IOException -> 0x02cd, SQLiteException -> 0x02cb }
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0316
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02cd, SQLiteException -> 0x02cb }
            r7 = 99
            r3.<init>(r7)     // Catch:{ IOException -> 0x02cd, SQLiteException -> 0x02cb }
            java.lang.String r7 = "Could not maintain storage below size limit: size="
            r3.append(r7)     // Catch:{ IOException -> 0x02cd, SQLiteException -> 0x02cb }
            r3.append(r0)     // Catch:{ IOException -> 0x02cd, SQLiteException -> 0x02cb }
            java.lang.String r0 = " > limit="
            r3.append(r0)     // Catch:{ IOException -> 0x02cd, SQLiteException -> 0x02cb }
            r3.append(r5)     // Catch:{ IOException -> 0x02cd, SQLiteException -> 0x02cb }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x02cd, SQLiteException -> 0x02cb }
            r1 = r20
            android.util.Log.w(r1, r0)     // Catch:{ IOException -> 0x0309, SQLiteException -> 0x0307 }
            goto L_0x0316
        L_0x02cb:
            r0 = move-exception
            goto L_0x02d4
        L_0x02cd:
            r0 = move-exception
            goto L_0x02d4
        L_0x02cf:
            r0 = move-exception
            goto L_0x02d2
        L_0x02d1:
            r0 = move-exception
        L_0x02d2:
            r2 = r29
        L_0x02d4:
            r1 = r20
            goto L_0x0311
        L_0x02d7:
            r0 = move-exception
        L_0x02d8:
            r2 = r29
            r1 = r20
            goto L_0x02eb
        L_0x02dd:
            r0 = move-exception
        L_0x02de:
            r2 = r29
            r1 = r20
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x02ea }
            java.lang.String r5 = "Error delete logs for cleanup."
            r3.<init>(r5, r0)     // Catch:{ all -> 0x02ea }
            throw r3     // Catch:{ all -> 0x02ea }
        L_0x02ea:
            r0 = move-exception
        L_0x02eb:
            r6.endTransaction()     // Catch:{ IOException -> 0x0309, SQLiteException -> 0x0307 }
            throw r0     // Catch:{ IOException -> 0x0309, SQLiteException -> 0x0307 }
        L_0x02ef:
            r2 = r1
            r4 = r5
            goto L_0x0316
        L_0x02f2:
            r2 = r1
            r4 = r5
            goto L_0x0316
        L_0x02f5:
            r0 = move-exception
            r2 = r1
            r1 = r4
            r4 = r5
            r8.close()     // Catch:{ all -> 0x02fd }
            throw r0     // Catch:{ all -> 0x02fd }
        L_0x02fd:
            r0 = move-exception
            goto L_0x0303
        L_0x02ff:
            r0 = move-exception
            r2 = r1
            r1 = r4
            r4 = r5
        L_0x0303:
            r6.endTransaction()     // Catch:{ IOException -> 0x0309, SQLiteException -> 0x0307 }
            throw r0     // Catch:{ IOException -> 0x0309, SQLiteException -> 0x0307 }
        L_0x0307:
            r0 = move-exception
            goto L_0x0311
        L_0x0309:
            r0 = move-exception
            goto L_0x0311
        L_0x030b:
            r0 = move-exception
            goto L_0x030e
        L_0x030d:
            r0 = move-exception
        L_0x030e:
            r2 = r1
            r1 = r4
            r4 = r5
        L_0x0311:
            java.lang.String r3 = "Failed to clean up after upload"
            android.util.Log.e(r1, r3, r0)
        L_0x0316:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvs.i():hva");
    }

    public final anaf j() {
        Cursor query;
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        writableDatabase.beginTransactionNonExclusive();
        try {
            anab h = anaf.h();
            query = writableDatabase.query("log_drop_counts", hvo.a, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            while (query.moveToNext()) {
                h.a(new hvf(query.getString(0), query.getString(2)), Integer.valueOf(query.getInt(1)));
            }
            query.close();
            anaf a2 = h.a();
            writableDatabase.delete("log_drop_counts", (String) null, (String[]) null);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            return a2;
        } catch (hvm e2) {
            try {
                throw new IOException("Failed to get/clear log drop count.", e2);
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            query.close();
            throw th2;
        }
    }

    public final String k() {
        return ((Build.VERSION.SDK_INT >= 24 && this.g.isDeviceProtectedStorage()) ? "DE" : "CE").concat("SqliteLogStore");
    }

    public final int[] d(String str) {
        Cursor query;
        int[] iArr;
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        writableDatabase.beginTransactionNonExclusive();
        try {
            query = writableDatabase.query("test_codes", new String[]{"test_code"}, "log_source = ?", new String[]{str}, (String) null, (String) null, (String) null);
            int count = query.getCount();
            if (count > 0) {
                iArr = new int[count];
                int i = 0;
                while (query.moveToNext()) {
                    iArr[i] = query.getInt(0);
                    i++;
                }
            } else {
                iArr = hvv.a;
            }
            query.close();
            writableDatabase.delete("test_codes", "log_source = ?", new String[]{str});
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            return iArr;
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public final /* bridge */ /* synthetic */ huz h() {
        return new hvr(this.a, this);
    }

    public final int[] e(String str) {
        return aoog.a((Collection) this.e.a(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d4 A[Catch:{ all -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d5 A[Catch:{ all -> 0x00f1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map a(defpackage.amzy r17) {
        /*
            r16 = this;
            r1 = r16
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            ihs r2 = defpackage.ihs.b()
            anax r2 = defpackage.hvi.a((android.content.Context) r2)
            r3 = 2
            java.lang.String[] r7 = new java.lang.String[r3]
            java.lang.String r3 = "_id"
            r14 = 0
            r7[r14] = r3
            java.lang.String r3 = "play_logger_context"
            r15 = 1
            r7[r15] = r3
            boolean r3 = r17.isEmpty()
            if (r3 != 0) goto L_0x008c
            r3 = 44
            amre r3 = defpackage.amre.a((char) r3)
            int r4 = r17.size()
            r5 = 63
            java.lang.Character r5 = java.lang.Character.valueOf(r5)
            java.util.List r4 = java.util.Collections.nCopies(r4, r5)
            java.lang.String r3 = r3.a((java.lang.Iterable) r4)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 14
            r5.<init>(r4)
            java.lang.String r4 = "qos_tier IN ("
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = ")"
            r5.append(r3)
            java.lang.String r8 = r5.toString()
            int r3 = r17.size()
            java.lang.String[] r9 = new java.lang.String[r3]
            r3 = 0
        L_0x0061:
            int r4 = r17.size()
            if (r3 >= r4) goto L_0x007a
            r4 = r17
            java.lang.Object r5 = r4.get(r3)
            avsd r5 = (defpackage.avsd) r5
            int r5 = r5.f
            java.lang.String r5 = java.lang.Integer.toString(r5)
            r9[r3] = r5
            int r3 = r3 + 1
            goto L_0x0061
        L_0x007a:
            jjj r3 = r1.a
            android.database.sqlite.SQLiteDatabase r4 = r3.getWritableDatabase()
            r5 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            java.lang.String r6 = "play_logger_context"
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x009f
        L_0x008c:
            jjj r3 = r1.a
            android.database.sqlite.SQLiteDatabase r4 = r3.getWritableDatabase()
            r5 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            java.lang.String r6 = "play_logger_context"
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x009f:
            boolean r4 = r3.moveToNext()     // Catch:{ all -> 0x00f1 }
            if (r4 == 0) goto L_0x00ed
            int r4 = r3.getInt(r14)     // Catch:{ all -> 0x00f1 }
            byte[] r5 = r3.getBlob(r15)     // Catch:{ all -> 0x00f1 }
            avtn r5 = defpackage.hvi.a((byte[]) r5)     // Catch:{ all -> 0x00f1 }
            if (r5 != 0) goto L_0x00bb
            java.lang.String r4 = "SqliteLogStore"
            java.lang.String r5 = "Could not parse PlayLoggerContext proto."
            android.util.Log.e(r4, r5)     // Catch:{ all -> 0x00f1 }
            goto L_0x009f
        L_0x00bb:
            if (r2 == 0) goto L_0x00ca
            java.lang.String r6 = defpackage.hwt.b(r5)     // Catch:{ all -> 0x00f1 }
            boolean r6 = r2.contains(r6)     // Catch:{ all -> 0x00f1 }
            if (r6 != 0) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            r6 = r5
            goto L_0x00ce
        L_0x00ca:
            avtn r6 = defpackage.hwt.c(r5)     // Catch:{ all -> 0x00f1 }
        L_0x00ce:
            boolean r7 = r0.containsKey(r6)     // Catch:{ all -> 0x00f1 }
            if (r7 == 0) goto L_0x00d5
            goto L_0x00dd
        L_0x00d5:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x00f1 }
            r7.<init>()     // Catch:{ all -> 0x00f1 }
            r0.put(r6, r7)     // Catch:{ all -> 0x00f1 }
        L_0x00dd:
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x00f1 }
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ all -> 0x00f1 }
            hvl r7 = new hvl     // Catch:{ all -> 0x00f1 }
            long r8 = (long) r4     // Catch:{ all -> 0x00f1 }
            r7.<init>(r5, r8)     // Catch:{ all -> 0x00f1 }
            r6.add(r7)     // Catch:{ all -> 0x00f1 }
            goto L_0x009f
        L_0x00ed:
            r3.close()
            return r0
        L_0x00f1:
            r0 = move-exception
            r3.close()
            goto L_0x00f7
        L_0x00f6:
            throw r0
        L_0x00f7:
            goto L_0x00f6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvs.a(amzy):java.util.Map");
    }

    public final void a(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("Writing internal event ");
        sb.append(i);
        sb.toString();
        aucf aucf = (aucf) avrm.t.o();
        long currentTimeMillis = System.currentTimeMillis();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrm avrm = (avrm) aucf.b;
        avrm.a |= 1;
        avrm.b = currentTimeMillis;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrm avrm2 = (avrm) aucf.b;
        avrm2.a |= 2;
        avrm2.c = elapsedRealtime;
        int a2 = avrl.a(i);
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrm avrm3 = (avrm) aucf.b;
        int i2 = a2 - 1;
        if (a2 != 0) {
            avrm3.n = i2;
            avrm3.a |= 1048576;
            a((avrm) aucf.i());
            return;
        }
        throw null;
    }

    public final long b() {
        return b(this.a.getWritableDatabase());
    }

    /* access modifiers changed from: package-private */
    public final long b(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.d.b(sQLiteDatabase);
        } catch (hvm e2) {
            throw new IOException("Could not get storage size.", e2);
        }
    }

    public final void b(int[] iArr, String str, Collection collection) {
        this.e.a(iArr, str, collection);
    }

    /* access modifiers changed from: package-private */
    public final void a(SQLiteDatabase sQLiteDatabase, long j) {
        hvu.a(sQLiteDatabase, this.d.b(sQLiteDatabase) + j);
    }

    public final void a(String str, hvd hvd, int i) {
        Cursor query;
        int i2;
        hsa.a(str, hvd.a(), 1);
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        writableDatabase.beginTransactionNonExclusive();
        try {
            String hvd2 = hvd.toString();
            query = writableDatabase.query("log_drop_counts", hvo.a, "_id = ? AND reason = ?", new String[]{str, hvd2}, (String) null, (String) null, (String) null);
            if (query.moveToNext()) {
                i2 = query.getInt(1);
            } else {
                i2 = 0;
            }
            if (query != null) {
                query.close();
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("_id", str);
            contentValues.put("storage_size", Integer.valueOf(i2 + 1));
            contentValues.put("reason", hvd2);
            if (writableDatabase.replace("log_drop_counts", (String) null, contentValues) >= 0) {
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return;
            }
            throw new hvm(String.format(Locale.getDefault(), "%s: Failed to write log drop count for %s.", new Object[]{"SqliteLogDropCountsTable", str}));
        } catch (hvm e2) {
            try {
                throw new IOException("Could not increment log drop count.", e2);
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
        throw th;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Collection r8) {
        /*
            r7 = this;
            java.lang.String r0 = "SqliteLogStore"
            int r1 = r8.size()
            r2 = 0
        L_0x0007:
            if (r2 >= r1) goto L_0x004d
            java.lang.Object r3 = r8.get(r2)
            hux r3 = (defpackage.hux) r3
            hvq r4 = r7.c     // Catch:{ SQLiteException -> 0x0044 }
            amzy r5 = r3.d     // Catch:{ SQLiteException -> 0x0044 }
            int r4 = r4.b((java.util.List) r5)     // Catch:{ SQLiteException -> 0x0044 }
            amzy r5 = r3.d
            int r5 = r5.size()
            if (r4 == r5) goto L_0x004a
            amzy r3 = r3.d
            int r3 = r3.size()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 72
            r5.<init>(r6)
            java.lang.String r6 = "Could not delete all rows: numDeleted="
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = " != numRows="
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.util.Log.e(r0, r3)
            goto L_0x004a
        L_0x0044:
            r3 = move-exception
            java.lang.String r4 = "Failed to delete log events by id list."
            android.util.Log.e(r0, r4, r3)
        L_0x004a:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvs.a(java.util.Collection):void");
    }

    public final void a(int[] iArr, String str, Collection collection) {
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        writableDatabase.beginTransactionNonExclusive();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!str2.equals(str)) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    for (int valueOf : iArr) {
                        contentValues.put("test_code", Integer.valueOf(valueOf));
                        writableDatabase.insert("test_codes", (String) null, contentValues);
                    }
                }
            }
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r6 = this;
            hvq r0 = r6.c
            java.lang.String r1 = "SELECT 1 FROM log_event A INNER JOIN  play_logger_context B ON A.play_logger_context_id=B._id WHERE B.qos_tier= ? LIMIT 1"
            jjj r0 = r0.c     // Catch:{ all -> 0x0029 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ all -> 0x0029 }
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x0029 }
            r4 = 3
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x0029 }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x0029 }
            android.database.Cursor r0 = r0.rawQuery(r1, r3)     // Catch:{ all -> 0x0029 }
            int r1 = r0.getCount()     // Catch:{ all -> 0x0027 }
            if (r1 <= 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            if (r0 == 0) goto L_0x0026
            r0.close()
        L_0x0026:
            return r2
        L_0x0027:
            r1 = move-exception
            goto L_0x002c
        L_0x0029:
            r0 = move-exception
            r1 = r0
            r0 = 0
        L_0x002c:
            if (r0 == 0) goto L_0x0031
            r0.close()
        L_0x0031:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvs.a():boolean");
    }

    /* access modifiers changed from: package-private */
    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        long b2 = b(sQLiteDatabase);
        long j = this.f;
        return b2 > j + j;
    }

    public final boolean a(avtn avtn, auay auay) {
        byte[] bArr = new byte[aubk.k(auay.a())];
        aubk.a(bArr).d(auay.a());
        b(avtn, auay.a(bArr).a(auay));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c9 A[SYNTHETIC, Splitter:B:32:0x00c9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            hvt r2 = r1.b
            android.database.Cursor r2 = r2.a()
        L_0x000a:
            boolean r3 = r2.moveToNext()     // Catch:{ all -> 0x00e5 }
            r4 = 0
            if (r3 == 0) goto L_0x00e1
            long r5 = r2.getLong(r4)     // Catch:{ all -> 0x00e5 }
            r3 = 1
            int r7 = r2.getInt(r3)     // Catch:{ all -> 0x00e5 }
            r8 = 2
            byte[] r8 = r2.getBlob(r8)     // Catch:{ all -> 0x00e5 }
            boolean r9 = defpackage.hvt.a(r8, r7)     // Catch:{ all -> 0x00e5 }
            java.lang.String r10 = "SqliteLogStore"
            if (r9 != 0) goto L_0x0046
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            r4 = 72
            r3.<init>(r4)     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = "PlayLoggerContext is corrupted: id="
            r3.append(r4)     // Catch:{ all -> 0x00e5 }
            r3.append(r5)     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = " hash="
            r3.append(r4)     // Catch:{ all -> 0x00e5 }
            r3.append(r7)     // Catch:{ all -> 0x00e5 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00e5 }
            android.util.Log.e(r10, r3)     // Catch:{ all -> 0x00e5 }
            goto L_0x000a
        L_0x0046:
            avtn r7 = defpackage.hvi.a((byte[]) r8)     // Catch:{ all -> 0x00e5 }
            if (r7 != 0) goto L_0x0052
            java.lang.String r3 = "Could not parse PlayLoggerContext proto."
            android.util.Log.e(r10, r3)     // Catch:{ all -> 0x00e5 }
            goto L_0x000a
        L_0x0052:
            int r8 = r7.a     // Catch:{ all -> 0x00e5 }
            r8 = r8 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x00cd
            java.lang.String r8 = r7.i     // Catch:{ all -> 0x00e5 }
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00e5 }
            if (r8 != 0) goto L_0x00cd
            hvq r8 = r1.c     // Catch:{ all -> 0x00e5 }
            java.lang.String[] r12 = new java.lang.String[r3]     // Catch:{ all -> 0x00e5 }
            java.lang.String r9 = "_id"
            r12[r4] = r9     // Catch:{ all -> 0x00e5 }
            java.lang.String r13 = "play_logger_context_id = ?"
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch:{ all -> 0x00e5 }
            java.lang.String r5 = java.lang.Long.toString(r5)     // Catch:{ all -> 0x00e5 }
            r14[r4] = r5     // Catch:{ all -> 0x00e5 }
            jjj r4 = r8.c     // Catch:{ all -> 0x00c5 }
            android.database.sqlite.SQLiteDatabase r9 = r4.getWritableDatabase()     // Catch:{ all -> 0x00c5 }
            r10 = 0
            java.lang.String r11 = "log_event"
            r15 = 0
            r16 = 0
            r17 = 0
            java.lang.String r18 = "1"
            android.database.Cursor r4 = r9.query(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00c5 }
            int r5 = r4.getCount()     // Catch:{ all -> 0x00c3 }
            if (r4 == 0) goto L_0x008f
            r4.close()     // Catch:{ all -> 0x00e5 }
        L_0x008f:
            if (r5 <= 0) goto L_0x000a
            java.lang.String r4 = r7.i     // Catch:{ all -> 0x00e5 }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00e5 }
            int r5 = r5.length()     // Catch:{ all -> 0x00e5 }
            int r5 = r5 + 41
            int r6 = r20.length()     // Catch:{ all -> 0x00e5 }
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            r6.<init>(r5)     // Catch:{ all -> 0x00e5 }
            java.lang.String r5 = "Found a log source "
            r6.append(r5)     // Catch:{ all -> 0x00e5 }
            r6.append(r4)     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = " that isn't equal to "
            r6.append(r4)     // Catch:{ all -> 0x00e5 }
            r6.append(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = "."
            r6.append(r0)     // Catch:{ all -> 0x00e5 }
            r6.toString()     // Catch:{ all -> 0x00e5 }
            r2.close()
            return r3
        L_0x00c3:
            r0 = move-exception
            goto L_0x00c7
        L_0x00c5:
            r0 = move-exception
            r4 = 0
        L_0x00c7:
            if (r4 == 0) goto L_0x00cc
            r4.close()     // Catch:{ all -> 0x00e5 }
        L_0x00cc:
            throw r0     // Catch:{ all -> 0x00e5 }
        L_0x00cd:
            java.lang.String r3 = "Log source was null or equal to "
            int r4 = r20.length()     // Catch:{ all -> 0x00e5 }
            if (r4 != 0) goto L_0x00dc
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x00e5 }
            r4.<init>(r3)     // Catch:{ all -> 0x00e5 }
            goto L_0x000a
        L_0x00dc:
            r3.concat(r0)     // Catch:{ all -> 0x00e5 }
            goto L_0x000a
        L_0x00e1:
            r2.close()
            return r4
        L_0x00e5:
            r0 = move-exception
            r2.close()
            goto L_0x00eb
        L_0x00ea:
            throw r0
        L_0x00eb:
            goto L_0x00ea
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvs.a(java.lang.String):boolean");
    }
}
