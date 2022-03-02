package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aaey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaey implements aaez {
    private static final String[] b = {"_id", "target_package", "target_class", "tag", "runtime", "flex_time", "period", "last_runtime", "user_id", "required_network_type", "requires_charging", "extras", "retry_strategy", "task_type", "job_id", "content_uris", "source", "source_version", "triggered_content_uris", "required_uris", "preferred_network_type", "preferred_charging_state", "required_idleness_state", "preferred_idleness_state"};
    private static final String[] c = {"service_kind"};
    private static final String[] d = {"persistence_level"};
    private final aaev a;

    private final SQLiteDatabase a(boolean z) {
        if (z) {
            return this.a.getWritableDatabase();
        }
        try {
            return this.a.getReadableDatabase();
        } catch (SQLiteException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("NetworkScheduler", valueOf.length() == 0 ? new String("Failed to open database. ") : "Failed to open database. ".concat(valueOf));
            return null;
        }
    }

    private final boolean f() {
        return this.a.a() && axbr.b();
    }

    private final synchronized void g() {
        SQLiteDatabase a2 = a(true);
        if (a2 == null) {
            Log.e("NetworkScheduler", "Failed to get the database");
            return;
        }
        a2.delete("pending_ops", "persistence_level = ?", new String[]{Integer.toString(0)});
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return a() && axbn.a.a().O();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: qwa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: qxi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: qxf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: qwa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: qwa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: qwa} */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0187, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x018a, code lost:
        r2 = r0;
        r7 = r5;
        r3 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01e4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01e5, code lost:
        r1 = r0;
        r7 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01ed, code lost:
        r2 = r0;
        r3 = r24;
        r7 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x03cc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x03ce, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x03d1, code lost:
        r7 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x03d4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x03d5, code lost:
        r7 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x03d8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x03db, code lost:
        r7 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x03de, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x03df, code lost:
        r7 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0413, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x041b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x041c, code lost:
        r3 = r41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x045e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x045f, code lost:
        r7 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x046b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x046e, code lost:
        r7 = r5;
        r3 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0473, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0476, code lost:
        r34 = r7;
        r3 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x047b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e5, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0100, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0103, code lost:
        r2 = r0;
        r34 = r7;
        r3 = r24;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x019e A[SYNTHETIC, Splitter:B:113:0x019e] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01aa A[Catch:{ IllegalArgumentException -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01af A[Catch:{ IllegalArgumentException -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01b2 A[Catch:{ IllegalArgumentException -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01df A[SYNTHETIC, Splitter:B:136:0x01df] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01e4 A[ExcHandler: all (r0v24 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r36 
      PHI: (r36v4 android.database.Cursor) = (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v6 android.database.Cursor), (r36v6 android.database.Cursor) binds: [B:231:0x0354, B:232:?, B:198:0x02ca, B:199:?, B:180:0x027f, B:181:?, B:146:0x01fa, B:147:?, B:162:0x0228, B:136:0x01df, B:130:0x01ce, B:131:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:130:0x01ce] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01fa A[SYNTHETIC, Splitter:B:146:0x01fa] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0236 A[Catch:{ SQLiteException | IllegalStateException -> 0x01ea, all -> 0x01e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x023c A[Catch:{ SQLiteException | IllegalStateException -> 0x01ea, all -> 0x01e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0260 A[SYNTHETIC, Splitter:B:174:0x0260] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x02a5 A[Catch:{ IllegalArgumentException -> 0x02d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0354 A[SYNTHETIC, Splitter:B:231:0x0354] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0363 A[Catch:{ IllegalArgumentException -> 0x03de, SQLiteException | IllegalStateException -> 0x03d8, all -> 0x045e }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0364 A[Catch:{ IllegalArgumentException -> 0x03de, SQLiteException | IllegalStateException -> 0x03d8, all -> 0x045e }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x03af A[Catch:{ JSONException -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0413 A[ExcHandler: SQLiteException | IllegalStateException (e java.lang.Throwable), PHI: r7 r41 
      PHI: (r7v31 android.database.Cursor) = (r7v42 android.database.Cursor), (r7v42 android.database.Cursor), (r7v42 android.database.Cursor), (r7v46 android.database.Cursor), (r7v46 android.database.Cursor), (r7v46 android.database.Cursor) binds: [B:243:0x0397, B:256:0x03c5, B:257:?, B:275:0x03f7, B:278:0x040c, B:279:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r41v7 java.lang.String) = (r41v13 java.lang.String), (r41v13 java.lang.String), (r41v13 java.lang.String), (r41v15 java.lang.String), (r41v15 java.lang.String), (r41v15 java.lang.String) binds: [B:243:0x0397, B:256:0x03c5, B:257:?, B:275:0x03f7, B:278:0x040c, B:279:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:243:0x0397] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0444 A[Catch:{ SQLiteException | IllegalStateException -> 0x0458 }] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x045e A[ExcHandler: all (th java.lang.Throwable), PHI: r36 
      PHI: (r36v2 android.database.Cursor) = (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v6 android.database.Cursor), (r36v6 android.database.Cursor) binds: [B:143:0x01f4, B:228:0x034c, B:233:0x035d, B:240:0x0383, B:241:?, B:206:0x02df, B:207:?, B:209:0x02f3, B:210:?, B:211:0x02f6, B:212:?, B:220:0x0333, B:169:0x0248, B:127:0x01c0, B:132:0x01d4] A[DONT_GENERATE, DONT_INLINE], Splitter:B:143:0x01f4] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x047b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:48:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e4 A[ExcHandler: all (r0v56 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:51:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.amzy c() {
        /*
            r43 = this;
            boolean r1 = r43.b()
            if (r1 == 0) goto L_0x0009
            r43.g()
        L_0x0009:
            qye r2 = new qye     // Catch:{ all -> 0x04f3 }
            java.lang.String r3 = "nts:db:readAll"
            r2.<init>(r3)     // Catch:{ all -> 0x04f3 }
            r3 = 0
            r4 = r43
            android.database.sqlite.SQLiteDatabase r5 = r4.a((boolean) r3)     // Catch:{ all -> 0x04dd }
            if (r5 == 0) goto L_0x04d1
            java.lang.String[] r6 = b     // Catch:{ all -> 0x04dd }
            boolean r7 = r43.f()     // Catch:{ all -> 0x04dd }
            r14 = 2
            r15 = 1
            if (r7 == 0) goto L_0x004f
            java.lang.String[][] r7 = new java.lang.String[r14][]     // Catch:{ all -> 0x0049 }
            r7[r3] = r6     // Catch:{ all -> 0x0049 }
            java.lang.String[] r6 = c     // Catch:{ all -> 0x0049 }
            r7[r15] = r6     // Catch:{ all -> 0x0049 }
            java.lang.Object[] r6 = defpackage.jhx.a((java.lang.Object[][]) r7)     // Catch:{ all -> 0x0049 }
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ all -> 0x0049 }
            boolean r7 = r43.a()     // Catch:{ all -> 0x0049 }
            if (r7 == 0) goto L_0x0047
            java.lang.String[][] r7 = new java.lang.String[r14][]     // Catch:{ all -> 0x0049 }
            r7[r3] = r6     // Catch:{ all -> 0x0049 }
            java.lang.String[] r6 = d     // Catch:{ all -> 0x0049 }
            r7[r15] = r6     // Catch:{ all -> 0x0049 }
            java.lang.Object[] r6 = defpackage.jhx.a((java.lang.Object[][]) r7)     // Catch:{ all -> 0x0049 }
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ all -> 0x0049 }
            r7 = r6
            goto L_0x0050
        L_0x0047:
            r7 = r6
            goto L_0x0050
        L_0x0049:
            r0 = move-exception
            r1 = r0
            r23 = r2
            goto L_0x04e1
        L_0x004f:
            r7 = r6
        L_0x0050:
            java.lang.String r6 = "pending_ops"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x04dd }
            java.lang.String r6 = "NetworkScheduler"
            if (r5 == 0) goto L_0x04b7
            boolean r7 = defpackage.axlx.c()     // Catch:{ all -> 0x04b1 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x04b1 }
            int r9 = r5.getCount()     // Catch:{ all -> 0x04b1 }
            r8.<init>(r9)     // Catch:{ all -> 0x04b1 }
            r5.moveToFirst()     // Catch:{ all -> 0x04b1 }
        L_0x0070:
            boolean r9 = r5.isAfterLast()     // Catch:{ all -> 0x04b1 }
            if (r9 != 0) goto L_0x04a2
            int r9 = r5.getInt(r3)     // Catch:{ SQLiteException -> 0x0483, IllegalStateException -> 0x0481 }
            java.lang.String r10 = r5.getString(r15)     // Catch:{ SQLiteException -> 0x0483, IllegalStateException -> 0x0481 }
            java.lang.String r11 = r5.getString(r14)     // Catch:{ SQLiteException -> 0x0483, IllegalStateException -> 0x0481 }
            r12 = 3
            java.lang.String r12 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x0483, IllegalStateException -> 0x0481 }
            r13 = 4
            long r16 = r5.getLong(r13)     // Catch:{ SQLiteException -> 0x0483, IllegalStateException -> 0x0481 }
            r13 = 5
            long r18 = r5.getLong(r13)     // Catch:{ SQLiteException -> 0x0483, IllegalStateException -> 0x0481 }
            r13 = 6
            long r20 = r5.getLong(r13)     // Catch:{ SQLiteException -> 0x0483, IllegalStateException -> 0x0481 }
            r13 = 7
            long r3 = r5.getLong(r13)     // Catch:{ SQLiteException -> 0x0483, IllegalStateException -> 0x0481 }
            r13 = 8
            int r13 = r5.getInt(r13)     // Catch:{ SQLiteException -> 0x0483, IllegalStateException -> 0x0481 }
            r1 = 9
            int r1 = r5.getInt(r1)     // Catch:{ SQLiteException -> 0x0483, IllegalStateException -> 0x0481 }
            r14 = 10
            int r14 = r5.getInt(r14)     // Catch:{ SQLiteException -> 0x0483, IllegalStateException -> 0x0481 }
            if (r14 != r15) goto L_0x00b1
            r14 = 1
            goto L_0x00b2
        L_0x00b1:
            r14 = 0
        L_0x00b2:
            r15 = 20
            boolean r23 = r5.isNull(r15)     // Catch:{ SQLiteException -> 0x0483, IllegalStateException -> 0x0481 }
            if (r23 != 0) goto L_0x00d4
            int r15 = r5.getInt(r15)     // Catch:{ SQLiteException -> 0x00c8, IllegalStateException -> 0x00c6, all -> 0x00bf }
            goto L_0x00d5
        L_0x00bf:
            r0 = move-exception
            r1 = r0
            r23 = r2
        L_0x00c3:
            r7 = r5
            goto L_0x04ce
        L_0x00c6:
            r0 = move-exception
            goto L_0x00c9
        L_0x00c8:
            r0 = move-exception
        L_0x00c9:
            r23 = r2
            r34 = r7
            r3 = r8
            r1 = 1
            r2 = r0
        L_0x00d0:
            r7 = r5
        L_0x00d1:
            r5 = 2
            goto L_0x048d
        L_0x00d4:
            r15 = r1
        L_0x00d5:
            r23 = r2
            r2 = 21
            boolean r24 = r5.isNull(r2)     // Catch:{ SQLiteException -> 0x047f, IllegalStateException -> 0x047d, all -> 0x047b }
            if (r24 != 0) goto L_0x00f0
            int r2 = r5.getInt(r2)     // Catch:{ SQLiteException -> 0x00e9, IllegalStateException -> 0x00e7, all -> 0x00e4 }
            goto L_0x00f1
        L_0x00e4:
            r0 = move-exception
            r1 = r0
            goto L_0x00c3
        L_0x00e7:
            r0 = move-exception
            goto L_0x00ea
        L_0x00e9:
            r0 = move-exception
        L_0x00ea:
            r2 = r0
            r34 = r7
            r3 = r8
        L_0x00ee:
            r1 = 1
            goto L_0x00d0
        L_0x00f0:
            r2 = r14
        L_0x00f1:
            r24 = r8
            r8 = 22
            boolean r25 = r5.isNull(r8)     // Catch:{ SQLiteException -> 0x0475, IllegalStateException -> 0x0473, all -> 0x047b }
            if (r25 != 0) goto L_0x0109
            int r8 = r5.getInt(r8)     // Catch:{ SQLiteException -> 0x0102, IllegalStateException -> 0x0100, all -> 0x00e4 }
            goto L_0x010a
        L_0x0100:
            r0 = move-exception
            goto L_0x0103
        L_0x0102:
            r0 = move-exception
        L_0x0103:
            r2 = r0
            r34 = r7
            r3 = r24
            goto L_0x00ee
        L_0x0109:
            r8 = 0
        L_0x010a:
            r25 = r3
            r3 = 23
            boolean r4 = r5.isNull(r3)     // Catch:{ SQLiteException -> 0x0475, IllegalStateException -> 0x0473, all -> 0x047b }
            if (r4 != 0) goto L_0x0119
            int r3 = r5.getInt(r3)     // Catch:{ SQLiteException -> 0x0102, IllegalStateException -> 0x0100, all -> 0x00e4 }
            goto L_0x011a
        L_0x0119:
            r3 = r8
        L_0x011a:
            boolean r4 = r43.f()     // Catch:{ SQLiteException -> 0x0475, IllegalStateException -> 0x0473, all -> 0x047b }
            if (r4 == 0) goto L_0x012d
            r4 = 24
            boolean r27 = r5.isNull(r4)     // Catch:{ SQLiteException -> 0x0102, IllegalStateException -> 0x0100, all -> 0x00e4 }
            if (r27 != 0) goto L_0x012d
            int r4 = r5.getInt(r4)     // Catch:{ SQLiteException -> 0x0102, IllegalStateException -> 0x0100, all -> 0x00e4 }
            goto L_0x012e
        L_0x012d:
            r4 = 0
        L_0x012e:
            boolean r27 = r43.a()     // Catch:{ SQLiteException -> 0x0475, IllegalStateException -> 0x0473, all -> 0x047b }
            if (r27 == 0) goto L_0x0149
            r27 = r9
            r9 = 25
            boolean r28 = r5.isNull(r9)     // Catch:{ SQLiteException -> 0x0102, IllegalStateException -> 0x0100, all -> 0x00e4 }
            if (r28 != 0) goto L_0x014b
            int r9 = r5.getInt(r9)     // Catch:{ SQLiteException -> 0x0102, IllegalStateException -> 0x0100, all -> 0x00e4 }
            r28 = r13
            r13 = 1
            if (r9 == r13) goto L_0x014d
            r13 = 0
            goto L_0x014e
        L_0x0149:
            r27 = r9
        L_0x014b:
            r28 = r13
        L_0x014d:
            r13 = 1
        L_0x014e:
            r9 = 11
            java.lang.String r9 = r5.getString(r9)     // Catch:{ SQLiteException -> 0x0475, IllegalStateException -> 0x0473, all -> 0x047b }
            r29 = r10
            r10 = 12
            java.lang.String r10 = r5.getString(r10)     // Catch:{ SQLiteException -> 0x0475, IllegalStateException -> 0x0473, all -> 0x047b }
            r30 = r4
            r4 = 13
            int r4 = r5.getInt(r4)     // Catch:{ SQLiteException -> 0x0475, IllegalStateException -> 0x0473, all -> 0x047b }
            r31 = r3
            r3 = 15
            java.lang.String r3 = r5.getString(r3)     // Catch:{ SQLiteException -> 0x0475, IllegalStateException -> 0x0473, all -> 0x047b }
            r32 = r8
            r8 = 16
            int r8 = r5.getInt(r8)     // Catch:{ SQLiteException -> 0x0475, IllegalStateException -> 0x0473, all -> 0x047b }
            r33 = r8
            r8 = 17
            int r8 = r5.getInt(r8)     // Catch:{ SQLiteException -> 0x0475, IllegalStateException -> 0x0473, all -> 0x047b }
            if (r7 == 0) goto L_0x0191
            r34 = r7
            r7 = 19
            java.lang.String r7 = r5.getString(r7)     // Catch:{ SQLiteException -> 0x0189, IllegalStateException -> 0x0187, all -> 0x00e4 }
            goto L_0x0194
        L_0x0187:
            r0 = move-exception
            goto L_0x018a
        L_0x0189:
            r0 = move-exception
        L_0x018a:
            r2 = r0
            r7 = r5
            r3 = r24
        L_0x018e:
            r1 = 1
            goto L_0x00d1
        L_0x0191:
            r34 = r7
            r7 = 0
        L_0x0194:
            r35 = r8
            r8 = 14
            boolean r36 = r5.isNull(r8)     // Catch:{ SQLiteException -> 0x046d, IllegalStateException -> 0x046b, all -> 0x047b }
            if (r36 != 0) goto L_0x01a3
            int r8 = r5.getInt(r8)     // Catch:{ SQLiteException -> 0x0189, IllegalStateException -> 0x0187, all -> 0x00e4 }
            goto L_0x01a4
        L_0x01a3:
            r8 = -1
        L_0x01a4:
            android.os.Bundle r10 = a((java.lang.String) r10)     // Catch:{ IllegalArgumentException -> 0x01ba }
            if (r10 == 0) goto L_0x01af
            qxl r10 = defpackage.qxl.a(r10)     // Catch:{ IllegalArgumentException -> 0x01ba }
            goto L_0x01b0
        L_0x01af:
            r10 = 0
        L_0x01b0:
            if (r10 != 0) goto L_0x01b7
            qxl r10 = defpackage.qxl.a     // Catch:{ IllegalArgumentException -> 0x01ba }
            r36 = r5
            goto L_0x01dd
        L_0x01b7:
            r36 = r5
            goto L_0x01dd
        L_0x01ba:
            r0 = move-exception
            r10 = r0
            r36 = r5
            java.lang.String r5 = "Error reading retry strategy, using default: "
            java.lang.String r10 = r10.getMessage()     // Catch:{ SQLiteException -> 0x0465, IllegalStateException -> 0x0463, all -> 0x045e }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteException -> 0x0465, IllegalStateException -> 0x0463, all -> 0x045e }
            int r37 = r10.length()     // Catch:{ SQLiteException -> 0x0465, IllegalStateException -> 0x0463, all -> 0x045e }
            if (r37 != 0) goto L_0x01d4
            java.lang.String r10 = new java.lang.String     // Catch:{ SQLiteException -> 0x01ec, IllegalStateException -> 0x01ea, all -> 0x01e4 }
            r10.<init>(r5)     // Catch:{ SQLiteException -> 0x01ec, IllegalStateException -> 0x01ea, all -> 0x01e4 }
            goto L_0x01d8
        L_0x01d4:
            java.lang.String r10 = r5.concat(r10)     // Catch:{ SQLiteException -> 0x0465, IllegalStateException -> 0x0463, all -> 0x045e }
        L_0x01d8:
            android.util.Log.w(r6, r10)     // Catch:{ SQLiteException -> 0x0465, IllegalStateException -> 0x0463, all -> 0x045e }
            qxl r10 = defpackage.qxl.a     // Catch:{ SQLiteException -> 0x0465, IllegalStateException -> 0x0463, all -> 0x045e }
        L_0x01dd:
            if (r9 == 0) goto L_0x01f3
            android.os.Bundle r5 = a((java.lang.String) r9)     // Catch:{ SQLiteException -> 0x01ec, IllegalStateException -> 0x01ea, all -> 0x01e4 }
            goto L_0x01f4
        L_0x01e4:
            r0 = move-exception
            r1 = r0
            r7 = r36
            goto L_0x04ce
        L_0x01ea:
            r0 = move-exception
            goto L_0x01ed
        L_0x01ec:
            r0 = move-exception
        L_0x01ed:
            r2 = r0
            r3 = r24
            r7 = r36
            goto L_0x018e
        L_0x01f3:
            r5 = 0
        L_0x01f4:
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch:{ SQLiteException -> 0x0465, IllegalStateException -> 0x0463, all -> 0x045e }
            if (r9 != 0) goto L_0x0244
            ob r9 = new ob     // Catch:{ SQLiteException -> 0x01ec, IllegalStateException -> 0x01ea, all -> 0x01e4 }
            r9.<init>()     // Catch:{ SQLiteException -> 0x01ec, IllegalStateException -> 0x01ea, all -> 0x01e4 }
            r37 = r8
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0222 }
            r8.<init>(r7)     // Catch:{ JSONException -> 0x0222 }
            r7 = 0
        L_0x0207:
            r38 = r3
            int r3 = r8.length()     // Catch:{ JSONException -> 0x0220 }
            if (r7 >= r3) goto L_0x021f
            java.lang.String r3 = r8.getString(r7)     // Catch:{ JSONException -> 0x0220 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ JSONException -> 0x0220 }
            r9.add(r3)     // Catch:{ JSONException -> 0x0220 }
            int r7 = r7 + 1
            r3 = r38
            goto L_0x0207
        L_0x021f:
            goto L_0x024a
        L_0x0220:
            r0 = move-exception
            goto L_0x0225
        L_0x0222:
            r0 = move-exception
            r38 = r3
        L_0x0225:
            r3 = r0
            java.lang.String r7 = "Error parsing required uris: "
            java.lang.String r3 = r3.getMessage()     // Catch:{ SQLiteException -> 0x01ec, IllegalStateException -> 0x01ea, all -> 0x01e4 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ SQLiteException -> 0x01ec, IllegalStateException -> 0x01ea, all -> 0x01e4 }
            int r8 = r3.length()     // Catch:{ SQLiteException -> 0x01ec, IllegalStateException -> 0x01ea, all -> 0x01e4 }
            if (r8 != 0) goto L_0x023c
            java.lang.String r3 = new java.lang.String     // Catch:{ SQLiteException -> 0x01ec, IllegalStateException -> 0x01ea, all -> 0x01e4 }
            r3.<init>(r7)     // Catch:{ SQLiteException -> 0x01ec, IllegalStateException -> 0x01ea, all -> 0x01e4 }
            goto L_0x0240
        L_0x023c:
            java.lang.String r3 = r7.concat(r3)     // Catch:{ SQLiteException -> 0x01ec, IllegalStateException -> 0x01ea, all -> 0x01e4 }
        L_0x0240:
            android.util.Log.w(r6, r3)     // Catch:{ SQLiteException -> 0x01ec, IllegalStateException -> 0x01ea, all -> 0x01e4 }
            goto L_0x024a
        L_0x0244:
            r38 = r3
            r37 = r8
            anfv r9 = defpackage.anfv.a     // Catch:{ SQLiteException -> 0x0465, IllegalStateException -> 0x0463, all -> 0x045e }
        L_0x024a:
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLiteException -> 0x0465, IllegalStateException -> 0x0463, all -> 0x045e }
            long r7 = r7 + r16
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteException -> 0x0465, IllegalStateException -> 0x0463, all -> 0x045e }
            long r7 = r7 - r16
            java.lang.String r3 = "JSON exception."
            r16 = r7
            java.lang.String r7 = "TaskInfo"
            r39 = 1000(0x3e8, double:4.94E-321)
            if (r4 != 0) goto L_0x02a5
            qxf r4 = new qxf     // Catch:{ IllegalArgumentException -> 0x029c }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x029c }
            r4.k = r12     // Catch:{ IllegalArgumentException -> 0x029c }
            r4.i = r11     // Catch:{ IllegalArgumentException -> 0x029c }
            r41 = r7
            long r7 = r18 / r39
            r42 = r11
            long r11 = r20 / r39
            r4.a(r7, r11)     // Catch:{ IllegalArgumentException -> 0x02d3 }
            r4.b(r1, r15)     // Catch:{ IllegalArgumentException -> 0x02d3 }
            r4.a(r14, r2)     // Catch:{ IllegalArgumentException -> 0x02d3 }
            r4.n = r13     // Catch:{ IllegalArgumentException -> 0x02d3 }
            r4.s = r5     // Catch:{ IllegalArgumentException -> 0x02d3 }
            r1 = 1
            r4.b((int) r1)     // Catch:{ IllegalArgumentException -> 0x0295, SQLiteException -> 0x028d, IllegalStateException -> 0x028b, all -> 0x01e4 }
            r4.r = r10     // Catch:{ IllegalArgumentException -> 0x02d3 }
            r4.a((java.util.Set) r9)     // Catch:{ IllegalArgumentException -> 0x02d3 }
            r7 = r42
            goto L_0x0339
        L_0x028b:
            r0 = move-exception
            goto L_0x028e
        L_0x028d:
            r0 = move-exception
        L_0x028e:
            r2 = r0
            r3 = r24
            r7 = r36
            goto L_0x00d1
        L_0x0295:
            r0 = move-exception
            r2 = r0
            r7 = r36
            r3 = r41
            goto L_0x02a2
        L_0x029c:
            r0 = move-exception
            r2 = r0
            r3 = r7
            r7 = r36
        L_0x02a1:
            r1 = 1
        L_0x02a2:
            r5 = 2
            goto L_0x041f
        L_0x02a5:
            r41 = r7
            r42 = r11
            r7 = 1
            if (r4 != r7) goto L_0x02da
            qxi r4 = new qxi     // Catch:{ IllegalArgumentException -> 0x02d3 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x02d3 }
            r4.k = r12     // Catch:{ IllegalArgumentException -> 0x02d3 }
            r7 = r42
            r4.i = r7     // Catch:{ IllegalArgumentException -> 0x02d3 }
            long r11 = r20 / r39
            r4.a = r11     // Catch:{ IllegalArgumentException -> 0x02d3 }
            long r11 = r18 / r39
            r4.b = r11     // Catch:{ IllegalArgumentException -> 0x02d3 }
            r4.b(r1, r15)     // Catch:{ IllegalArgumentException -> 0x02d3 }
            r4.a(r14, r2)     // Catch:{ IllegalArgumentException -> 0x02d3 }
            r4.n = r13     // Catch:{ IllegalArgumentException -> 0x02d3 }
            r4.s = r5     // Catch:{ IllegalArgumentException -> 0x02d3 }
            r1 = 1
            r4.b((int) r1)     // Catch:{ IllegalArgumentException -> 0x0295, SQLiteException -> 0x028d, IllegalStateException -> 0x028b, all -> 0x01e4 }
            r4.r = r10     // Catch:{ IllegalArgumentException -> 0x02d3 }
            r4.a((java.util.Set) r9)     // Catch:{ IllegalArgumentException -> 0x02d3 }
            goto L_0x0339
        L_0x02d3:
            r0 = move-exception
            r2 = r0
            r7 = r36
            r3 = r41
            goto L_0x02a1
        L_0x02da:
            r7 = r42
            r8 = 2
            if (r4 != r8) goto L_0x03f3
            qwa r4 = new qwa     // Catch:{ IllegalArgumentException -> 0x03ea, SQLiteException -> 0x03e4, IllegalStateException -> 0x03e2, all -> 0x045e }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x03ea, SQLiteException -> 0x03e4, IllegalStateException -> 0x03e2, all -> 0x045e }
            r4.k = r12     // Catch:{ IllegalArgumentException -> 0x03ea, SQLiteException -> 0x03e4, IllegalStateException -> 0x03e2, all -> 0x045e }
            r4.i = r7     // Catch:{ IllegalArgumentException -> 0x03ea, SQLiteException -> 0x03e4, IllegalStateException -> 0x03e2, all -> 0x045e }
            r4.b(r1, r15)     // Catch:{ IllegalArgumentException -> 0x03ea, SQLiteException -> 0x03e4, IllegalStateException -> 0x03e2, all -> 0x045e }
            r4.a(r14, r2)     // Catch:{ IllegalArgumentException -> 0x03ea, SQLiteException -> 0x03e4, IllegalStateException -> 0x03e2, all -> 0x045e }
            r4.n = r13     // Catch:{ IllegalArgumentException -> 0x03ea, SQLiteException -> 0x03e4, IllegalStateException -> 0x03e2, all -> 0x045e }
            r4.s = r5     // Catch:{ IllegalArgumentException -> 0x03ea, SQLiteException -> 0x03e4, IllegalStateException -> 0x03e2, all -> 0x045e }
            r1 = 1
            r4.b((int) r1)     // Catch:{ IllegalArgumentException -> 0x03de, SQLiteException -> 0x03da, IllegalStateException -> 0x03d8, all -> 0x045e }
            r4.r = r10     // Catch:{ IllegalArgumentException -> 0x03ea, SQLiteException -> 0x03e4, IllegalStateException -> 0x03e2, all -> 0x045e }
            r4.a((java.util.Set) r9)     // Catch:{ IllegalArgumentException -> 0x03ea, SQLiteException -> 0x03e4, IllegalStateException -> 0x03e2, all -> 0x045e }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x03ea, SQLiteException -> 0x03e4, IllegalStateException -> 0x03e2, all -> 0x045e }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x03ea, SQLiteException -> 0x03e4, IllegalStateException -> 0x03e2, all -> 0x045e }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0331 }
            r5 = r38
            r2.<init>(r5)     // Catch:{ JSONException -> 0x0331 }
            java.lang.String r5 = "uri_flags"
            org.json.JSONArray r5 = r2.getJSONArray(r5)     // Catch:{ JSONException -> 0x0331 }
            java.lang.String r8 = "uris"
            org.json.JSONArray r2 = r2.getJSONArray(r8)     // Catch:{ JSONException -> 0x0331 }
            int r8 = r5.length()     // Catch:{ JSONException -> 0x0331 }
            r9 = 0
        L_0x0318:
            if (r9 >= r8) goto L_0x0336
            int r10 = r5.getInt(r9)     // Catch:{ JSONException -> 0x0331 }
            java.lang.String r11 = r2.getString(r9)     // Catch:{ JSONException -> 0x0331 }
            qvz r12 = new qvz     // Catch:{ JSONException -> 0x0331 }
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch:{ JSONException -> 0x0331 }
            r12.<init>(r11, r10)     // Catch:{ JSONException -> 0x0331 }
            r1.add(r12)     // Catch:{ JSONException -> 0x0331 }
            int r9 = r9 + 1
            goto L_0x0318
        L_0x0331:
            r0 = move-exception
            r2 = r0
            android.util.Log.e(r6, r3, r2)     // Catch:{ IllegalArgumentException -> 0x03ea, SQLiteException -> 0x03e4, IllegalStateException -> 0x03e2, all -> 0x045e }
        L_0x0336:
            r4.a((java.util.Collection) r1)     // Catch:{ IllegalArgumentException -> 0x03ea, SQLiteException -> 0x03e4, IllegalStateException -> 0x03e2, all -> 0x045e }
        L_0x0339:
            qxr r1 = defpackage.qxr.a     // Catch:{ IllegalArgumentException -> 0x03ea, SQLiteException -> 0x03e4, IllegalStateException -> 0x03e2, all -> 0x045e }
            defpackage.iva.a((java.lang.Object) r1)     // Catch:{ IllegalArgumentException -> 0x03ea, SQLiteException -> 0x03e4, IllegalStateException -> 0x03e2, all -> 0x045e }
            r8 = r32
            r4.g = r8     // Catch:{ IllegalArgumentException -> 0x03ea, SQLiteException -> 0x03e4, IllegalStateException -> 0x03e2, all -> 0x045e }
            r1 = r31
            r4.h = r1     // Catch:{ IllegalArgumentException -> 0x03ea, SQLiteException -> 0x03e4, IllegalStateException -> 0x03e2, all -> 0x045e }
            r1 = 1
            if (r8 != r1) goto L_0x034b
            r2 = 1
            goto L_0x034c
        L_0x034b:
            r2 = 0
        L_0x034c:
            r4.p = r2     // Catch:{ IllegalArgumentException -> 0x03de, SQLiteException -> 0x03da, IllegalStateException -> 0x03d8, all -> 0x045e }
            boolean r2 = r43.f()     // Catch:{ IllegalArgumentException -> 0x03de, SQLiteException -> 0x03da, IllegalStateException -> 0x03d8, all -> 0x045e }
            if (r2 == 0) goto L_0x035d
            qxr r2 = defpackage.qxr.a     // Catch:{ IllegalArgumentException -> 0x0295, SQLiteException -> 0x028d, IllegalStateException -> 0x028b, all -> 0x01e4 }
            defpackage.iva.a((java.lang.Object) r2)     // Catch:{ IllegalArgumentException -> 0x0295, SQLiteException -> 0x028d, IllegalStateException -> 0x028b, all -> 0x01e4 }
            r2 = r30
            r4.j = r2     // Catch:{ IllegalArgumentException -> 0x0295, SQLiteException -> 0x028d, IllegalStateException -> 0x028b, all -> 0x01e4 }
        L_0x035d:
            boolean r2 = r43.a()     // Catch:{ IllegalArgumentException -> 0x03de, SQLiteException -> 0x03da, IllegalStateException -> 0x03d8, all -> 0x045e }
            if (r2 != 0) goto L_0x0364
            goto L_0x0366
        L_0x0364:
            r4.n = r13     // Catch:{ IllegalArgumentException -> 0x03de, SQLiteException -> 0x03da, IllegalStateException -> 0x03d8, all -> 0x045e }
        L_0x0366:
            qxx r2 = r4.b()     // Catch:{ IllegalArgumentException -> 0x03de, SQLiteException -> 0x03da, IllegalStateException -> 0x03d8, all -> 0x045e }
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch:{ IllegalArgumentException -> 0x03de, SQLiteException -> 0x03da, IllegalStateException -> 0x03d8, all -> 0x045e }
            r5 = r29
            r4.<init>(r5, r7)     // Catch:{ IllegalArgumentException -> 0x03de, SQLiteException -> 0x03da, IllegalStateException -> 0x03d8, all -> 0x045e }
            r7 = r16
            r5 = r28
            aabq r2 = defpackage.aabq.a(r2, r4, r7, r5)     // Catch:{ IllegalArgumentException -> 0x03de, SQLiteException -> 0x03da, IllegalStateException -> 0x03d8, all -> 0x045e }
            r4 = r27
            long r4 = (long) r4     // Catch:{ IllegalArgumentException -> 0x03de, SQLiteException -> 0x03da, IllegalStateException -> 0x03d8, all -> 0x045e }
            r2.e = r4     // Catch:{ IllegalArgumentException -> 0x03de, SQLiteException -> 0x03da, IllegalStateException -> 0x03d8, all -> 0x045e }
            r4 = r25
            r2.g = r4     // Catch:{ IllegalArgumentException -> 0x03de, SQLiteException -> 0x03da, IllegalStateException -> 0x03d8, all -> 0x045e }
            r5 = 2
            r2.l = r5     // Catch:{ IllegalArgumentException -> 0x03d4, SQLiteException -> 0x03d0, IllegalStateException -> 0x03ce, all -> 0x045e }
            r8 = r37
            r2.i = r8     // Catch:{ IllegalArgumentException -> 0x03d4, SQLiteException -> 0x03d0, IllegalStateException -> 0x03ce, all -> 0x045e }
            r4 = r33
            r7 = r35
            nwi r4 = defpackage.aadn.a((int) r4, (int) r7)     // Catch:{ IllegalArgumentException -> 0x03d4, SQLiteException -> 0x03d0, IllegalStateException -> 0x03ce, all -> 0x045e }
            r2.j = r4     // Catch:{ IllegalArgumentException -> 0x03d4, SQLiteException -> 0x03d0, IllegalStateException -> 0x03ce, all -> 0x045e }
            r4 = 18
            r7 = r36
            java.lang.String r4 = r7.getString(r4)     // Catch:{ IllegalArgumentException -> 0x03cc, SQLiteException -> 0x0415, IllegalStateException -> 0x0413 }
            if (r4 == 0) goto L_0x03ca
            boolean r8 = r4.isEmpty()     // Catch:{ IllegalArgumentException -> 0x03cc, SQLiteException -> 0x0415, IllegalStateException -> 0x0413 }
            if (r8 != 0) goto L_0x03ca
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ JSONException -> 0x03c3 }
            r8.<init>(r4)     // Catch:{ JSONException -> 0x03c3 }
            r4 = 0
        L_0x03a9:
            int r9 = r8.length()     // Catch:{ JSONException -> 0x03c3 }
            if (r4 >= r9) goto L_0x03c1
            java.lang.Object r9 = r8.get(r4)     // Catch:{ JSONException -> 0x03c3 }
            java.lang.String r9 = r9.toString()     // Catch:{ JSONException -> 0x03c3 }
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ JSONException -> 0x03c3 }
            r2.a((android.net.Uri) r9)     // Catch:{ JSONException -> 0x03c3 }
            int r4 = r4 + 1
            goto L_0x03a9
        L_0x03c1:
            goto L_0x0442
        L_0x03c3:
            r0 = move-exception
            r4 = r0
            android.util.Log.e(r6, r3, r4)     // Catch:{ IllegalArgumentException -> 0x03cc, SQLiteException -> 0x0415, IllegalStateException -> 0x0413 }
            goto L_0x0442
        L_0x03ca:
            goto L_0x0442
        L_0x03cc:
            r0 = move-exception
            goto L_0x03ef
        L_0x03ce:
            r0 = move-exception
            goto L_0x03d1
        L_0x03d0:
            r0 = move-exception
        L_0x03d1:
            r7 = r36
            goto L_0x0416
        L_0x03d4:
            r0 = move-exception
            r7 = r36
            goto L_0x03ef
        L_0x03d8:
            r0 = move-exception
            goto L_0x03db
        L_0x03da:
            r0 = move-exception
        L_0x03db:
            r7 = r36
            goto L_0x03e8
        L_0x03de:
            r0 = move-exception
            r7 = r36
            goto L_0x03ee
        L_0x03e2:
            r0 = move-exception
            goto L_0x03e5
        L_0x03e4:
            r0 = move-exception
        L_0x03e5:
            r7 = r36
            r1 = 1
        L_0x03e8:
            r5 = 2
            goto L_0x0416
        L_0x03ea:
            r0 = move-exception
            r7 = r36
            r1 = 1
        L_0x03ee:
            r5 = 2
        L_0x03ef:
            r2 = r0
            r3 = r41
            goto L_0x041f
        L_0x03f3:
            r7 = r36
            r1 = 1
            r5 = 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x041b, SQLiteException -> 0x0415, IllegalStateException -> 0x0413 }
            r3 = 89
            r2.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x041b, SQLiteException -> 0x0415, IllegalStateException -> 0x0413 }
            java.lang.String r3 = "TaskType must be either ContentUriTriggeredTask, OneoffTask, or PeriodicTask: "
            r2.append(r3)     // Catch:{ IllegalArgumentException -> 0x041b, SQLiteException -> 0x0415, IllegalStateException -> 0x0413 }
            r2.append(r4)     // Catch:{ IllegalArgumentException -> 0x041b, SQLiteException -> 0x0415, IllegalStateException -> 0x0413 }
            java.lang.String r2 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x041b, SQLiteException -> 0x0415, IllegalStateException -> 0x0413 }
            r3 = r41
            android.util.Log.e(r3, r2)     // Catch:{ IllegalArgumentException -> 0x0411, SQLiteException -> 0x0415, IllegalStateException -> 0x0413 }
            r2 = 0
            goto L_0x0442
        L_0x0411:
            r0 = move-exception
            goto L_0x041e
        L_0x0413:
            r0 = move-exception
            goto L_0x0416
        L_0x0415:
            r0 = move-exception
        L_0x0416:
            r2 = r0
            r3 = r24
            goto L_0x048d
        L_0x041b:
            r0 = move-exception
            r3 = r41
        L_0x041e:
            r2 = r0
        L_0x041f:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ SQLiteException -> 0x045a, IllegalStateException -> 0x0458 }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ SQLiteException -> 0x045a, IllegalStateException -> 0x0458 }
            int r4 = r4.length()     // Catch:{ SQLiteException -> 0x045a, IllegalStateException -> 0x0458 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x045a, IllegalStateException -> 0x0458 }
            int r4 = r4 + 40
            r8.<init>(r4)     // Catch:{ SQLiteException -> 0x045a, IllegalStateException -> 0x0458 }
            java.lang.String r4 = "Failed to construct Task from database: "
            r8.append(r4)     // Catch:{ SQLiteException -> 0x045a, IllegalStateException -> 0x0458 }
            r8.append(r2)     // Catch:{ SQLiteException -> 0x045a, IllegalStateException -> 0x0458 }
            java.lang.String r2 = r8.toString()     // Catch:{ SQLiteException -> 0x045a, IllegalStateException -> 0x0458 }
            android.util.Log.e(r3, r2)     // Catch:{ SQLiteException -> 0x045a, IllegalStateException -> 0x0458 }
            r2 = 0
        L_0x0442:
            if (r2 == 0) goto L_0x0455
            boolean r3 = r2.f     // Catch:{ SQLiteException -> 0x045a, IllegalStateException -> 0x0458 }
            if (r3 == 0) goto L_0x0452
            r3 = r24
            r3.add(r2)     // Catch:{ SQLiteException -> 0x0450, IllegalStateException -> 0x044e }
            goto L_0x0492
        L_0x044e:
            r0 = move-exception
            goto L_0x048c
        L_0x0450:
            r0 = move-exception
            goto L_0x048c
        L_0x0452:
            r3 = r24
            goto L_0x0492
        L_0x0455:
            r3 = r24
            goto L_0x0492
        L_0x0458:
            r0 = move-exception
            goto L_0x045b
        L_0x045a:
            r0 = move-exception
        L_0x045b:
            r3 = r24
            goto L_0x048c
        L_0x045e:
            r0 = move-exception
            r7 = r36
            goto L_0x04b5
        L_0x0463:
            r0 = move-exception
            goto L_0x0466
        L_0x0465:
            r0 = move-exception
        L_0x0466:
            r3 = r24
            r7 = r36
            goto L_0x0471
        L_0x046b:
            r0 = move-exception
            goto L_0x046e
        L_0x046d:
            r0 = move-exception
        L_0x046e:
            r7 = r5
            r3 = r24
        L_0x0471:
            r1 = 1
            goto L_0x048b
        L_0x0473:
            r0 = move-exception
            goto L_0x0476
        L_0x0475:
            r0 = move-exception
        L_0x0476:
            r34 = r7
            r3 = r24
            goto L_0x0489
        L_0x047b:
            r0 = move-exception
            goto L_0x04b4
        L_0x047d:
            r0 = move-exception
            goto L_0x0486
        L_0x047f:
            r0 = move-exception
            goto L_0x0486
        L_0x0481:
            r0 = move-exception
            goto L_0x0484
        L_0x0483:
            r0 = move-exception
        L_0x0484:
            r23 = r2
        L_0x0486:
            r34 = r7
            r3 = r8
        L_0x0489:
            r1 = 1
            r7 = r5
        L_0x048b:
            r5 = 2
        L_0x048c:
            r2 = r0
        L_0x048d:
            java.lang.String r4 = "Failed to load task from db"
            android.util.Log.e(r6, r4, r2)     // Catch:{ all -> 0x04cc }
        L_0x0492:
            r7.moveToNext()     // Catch:{ all -> 0x04cc }
            r4 = r43
            r8 = r3
            r5 = r7
            r2 = r23
            r7 = r34
            r3 = 0
            r14 = 2
            r15 = 1
            goto L_0x0070
        L_0x04a2:
            r23 = r2
            r7 = r5
            r3 = r8
            amzy r1 = defpackage.amzy.a((java.util.Collection) r3)     // Catch:{ all -> 0x04cc }
            r23.close()     // Catch:{ all -> 0x04c7 }
            r7.close()
            return r1
        L_0x04b1:
            r0 = move-exception
            r23 = r2
        L_0x04b4:
            r7 = r5
        L_0x04b5:
            r1 = r0
            goto L_0x04ce
        L_0x04b7:
            r23 = r2
            r7 = r5
            java.lang.String r1 = "Trying to initialise periodic task state from DB, but cursor is invalid."
            android.util.Log.e(r6, r1)     // Catch:{ all -> 0x04cc }
            amzy r1 = defpackage.amzy.h()     // Catch:{ all -> 0x04cc }
            r23.close()     // Catch:{ all -> 0x04c7 }
            return r1
        L_0x04c7:
            r0 = move-exception
            r1 = r0
            r2 = r1
            r1 = r7
            goto L_0x04f7
        L_0x04cc:
            r0 = move-exception
            goto L_0x04b5
        L_0x04ce:
            r22 = r7
            goto L_0x04e3
        L_0x04d1:
            r23 = r2
            amzy r1 = defpackage.amzy.h()     // Catch:{ all -> 0x04db }
            r23.close()     // Catch:{ all -> 0x04f3 }
            return r1
        L_0x04db:
            r0 = move-exception
            goto L_0x04e0
        L_0x04dd:
            r0 = move-exception
            r23 = r2
        L_0x04e0:
            r1 = r0
        L_0x04e1:
            r22 = 0
        L_0x04e3:
            r23.close()     // Catch:{ all -> 0x04e7 }
            goto L_0x04ec
        L_0x04e7:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x04ed }
        L_0x04ec:
            throw r1     // Catch:{ all -> 0x04ed }
        L_0x04ed:
            r0 = move-exception
            r1 = r0
            r2 = r1
            r1 = r22
            goto L_0x04f7
        L_0x04f3:
            r0 = move-exception
            r1 = r0
            r2 = r1
            r1 = 0
        L_0x04f7:
            if (r1 == 0) goto L_0x04fc
            r1.close()
        L_0x04fc:
            goto L_0x04fe
        L_0x04fd:
            throw r2
        L_0x04fe:
            goto L_0x04fd
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaey.c():amzy");
    }

    public final void d() {
        try {
            this.a.close();
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("NetworkScheduler", valueOf.length() == 0 ? new String("Failed to close. ") : "Failed to close. ".concat(valueOf));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.nwu e() {
        /*
            r11 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.a((boolean) r0)
            r2 = 0
            if (r1 != 0) goto L_0x000c
            r4 = r2
            r1 = 0
            goto L_0x0051
        L_0x000c:
            long r4 = r1.getMaximumSize()     // Catch:{ SQLiteException -> 0x002a }
            java.io.File r6 = new java.io.File     // Catch:{ SQLiteException -> 0x0025 }
            java.lang.String r7 = r1.getPath()     // Catch:{ SQLiteException -> 0x0025 }
            r6.<init>(r7)     // Catch:{ SQLiteException -> 0x0025 }
            long r2 = r6.length()     // Catch:{ SQLiteException -> 0x0025 }
            int r1 = r1.getVersion()     // Catch:{ SQLiteException -> 0x0025 }
            r9 = r2
            r2 = r4
            r4 = r9
            goto L_0x0051
        L_0x0025:
            r1 = move-exception
            r9 = r2
            r2 = r4
            r4 = r9
            goto L_0x002c
        L_0x002a:
            r1 = move-exception
            r4 = r2
        L_0x002c:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r6 = java.lang.String.valueOf(r1)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 29
            r7.<init>(r6)
            java.lang.String r6 = "Error reading database info: "
            r7.append(r6)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            java.lang.String r6 = "NetworkScheduler"
            android.util.Log.w(r6, r1)
            r1 = 0
        L_0x0051:
            nwu r6 = defpackage.nwu.f
            aucd r6 = r6.o()
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x005c
            goto L_0x0061
        L_0x005c:
            r6.c()
            r6.c = r0
        L_0x0061:
            aucj r0 = r6.b
            nwu r0 = (defpackage.nwu) r0
            r7 = 1
            r0.b = r7
            int r8 = r0.a
            r7 = r7 | r8
            r0.a = r7
            r7 = r7 | 4
            r0.a = r7
            r0.d = r2
            r2 = r7 | 2
            r0.a = r2
            r0.c = r4
            r2 = r2 | 8
            r0.a = r2
            long r1 = (long) r1
            r0.e = r1
            aucj r0 = r6.i()
            nwu r0 = (defpackage.nwu) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaey.e():nwu");
    }

    public aaey(Context context) {
        int i;
        boolean b2 = axbr.b();
        if (!b2) {
            i = 16;
        } else {
            i = 17;
        }
        if (b2 && axbr.c()) {
            i = 18;
        }
        this.a = new aaev(context, "ns.db", i);
    }

    static Bundle a(String str) {
        if (str == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2.length() == 1) {
                    String next2 = jSONObject2.keys().next();
                    int i = jSONObject2.getInt(next2);
                    if (i == 0) {
                        bundle.putInt(next, Integer.parseInt(next2));
                    } else if (i == 1) {
                        bundle.putDouble(next, Double.parseDouble(next2));
                    } else if (i == 2) {
                        bundle.putLong(next, Long.parseLong(next2));
                    } else if (i == 3) {
                        bundle.putBoolean(next, Boolean.parseBoolean(next2));
                    } else if (i == 4) {
                        bundle.putString(next, next2);
                    } else if (i == 5) {
                        bundle.putBundle(next, a(next2));
                    }
                } else {
                    Log.e("NetworkScheduler", str.length() == 0 ? new String("Failed to deserialize extra: ") : "Failed to deserialize extra: ".concat(str));
                    return null;
                }
            }
            return bundle;
        } catch (JSONException e) {
            Log.e("NetworkScheduler", str.length() == 0 ? new String("Invalid format for serialized extras: ") : "Invalid format for serialized extras: ".concat(str));
            return null;
        } catch (NumberFormatException e2) {
            Log.e("NetworkScheduler", str.length() == 0 ? new String("Failed to parse numbers from serializzed extras: ") : "Failed to parse numbers from serializzed extras: ".concat(str));
            return null;
        }
    }

    static String a(Bundle bundle) {
        int i;
        String str;
        JSONObject jSONObject = new JSONObject();
        for (String str2 : bundle.keySet()) {
            try {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    if (!(obj instanceof Integer)) {
                        i = !(obj instanceof Double) ? !(obj instanceof Long) ? !(obj instanceof Boolean) ? !(obj instanceof String) ? obj instanceof Bundle ? 5 : -1 : 4 : 3 : 2 : 1;
                    } else {
                        i = 0;
                    }
                    if (i != -1) {
                        if (i == 5) {
                            str = a((Bundle) obj);
                        } else {
                            str = obj.toString();
                        }
                        if (str != null) {
                            jSONObject2.put(str, i);
                            jSONObject.put(str2, jSONObject2);
                        }
                    }
                }
            } catch (JSONException e) {
                String valueOf = String.valueOf(bundle.get(str2));
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 51 + String.valueOf(valueOf).length());
                sb.append("Failed to serialize extra parameter: key: ");
                sb.append(str2);
                sb.append("; value: ");
                sb.append(valueOf);
                Log.e("NetworkScheduler", sb.toString());
                return null;
            }
        }
        return jSONObject.toString();
    }

    public final synchronized void a(aabq aabq) {
        SQLiteDatabase a2;
        iva.a((Object) aabq);
        if (aabq.e >= 0 && (a2 = a(true)) != null) {
            try {
                long j = aabq.e;
                StringBuilder sb = new StringBuilder(26);
                sb.append("_id = ");
                sb.append(j);
                a2.delete("pending_ops", sb.toString(), (String[]) null);
            } catch (RuntimeException e) {
                Log.e("NetworkScheduler", "Error removing task.", e);
            }
        }
    }

    public final synchronized void a(aabq aabq, aabq aabq2) {
        boolean z;
        String str;
        qye qye = new qye("nts:db:addOrUpdate");
        try {
            iva.a((Object) aabq);
            if (aabq2 == null || aabq.equals(aabq2)) {
                z = true;
            } else {
                z = false;
            }
            iva.a(z);
            if (aabq2 != null && aabq2.f) {
                if (aabq.f) {
                    aabq.e = aabq2.e;
                } else {
                    a(aabq2);
                }
            }
            if (aabq.f || b()) {
                SQLiteDatabase a2 = a(true);
                if (a2 != null) {
                    int i = aabq.o;
                    ContentValues contentValues = new ContentValues();
                    if (i == 0) {
                        qxg qxg = (qxg) aabq.n;
                        contentValues.put("flex_time", Long.valueOf(qxg.a * 1000));
                        contentValues.put("period", Long.valueOf(qxg.b * 1000));
                    } else if (i != 1) {
                        JSONObject jSONObject = new JSONObject();
                        Set<qvz> set = ((qwb) aabq.n).a;
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        for (qvz qvz : set) {
                            jSONArray.put(qvz.b);
                            jSONArray2.put(qvz.a);
                        }
                        jSONObject.put("uri_flags", jSONArray);
                        jSONObject.put("uris", jSONArray2);
                        str = jSONObject.toString();
                        contentValues.put("content_uris", str);
                        JSONArray jSONArray3 = new JSONArray();
                        for (Uri put : aabq.b()) {
                            jSONArray3.put(put);
                        }
                        contentValues.put("triggered_content_uris", jSONArray3.toString());
                        i = 2;
                    } else {
                        qxj qxj = (qxj) aabq.n;
                        contentValues.put("period", Long.valueOf(qxj.a * 1000));
                        contentValues.put("flex_time", Long.valueOf(qxj.b * 1000));
                    }
                    contentValues.put("runtime", Long.valueOf((aabq.d - SystemClock.elapsedRealtime()) + System.currentTimeMillis()));
                    contentValues.put("tag", aabq.e());
                    contentValues.put("target_package", aabq.a.b);
                    contentValues.put("target_class", aabq.g());
                    contentValues.put("user_id", Integer.valueOf((int) aabq.a.e));
                    contentValues.put("last_runtime", Long.valueOf(aabq.g));
                    if (f()) {
                        contentValues.put("service_kind", Integer.valueOf(aabq.n.f));
                    }
                    if (a()) {
                        contentValues.put("persistence_level", Integer.valueOf(aabq.n.j ? 1 : 0));
                    }
                    qxx qxx = aabq.n;
                    int i2 = qxx.n;
                    int i3 = qxx.p;
                    contentValues.put("required_network_type", Integer.valueOf(i2));
                    contentValues.put("requires_charging", Integer.valueOf(i3));
                    qxx qxx2 = aabq.n;
                    int i4 = qxx2.o;
                    int i5 = qxx2.q;
                    if (i4 != i2) {
                        contentValues.put("preferred_network_type", Integer.valueOf(i4));
                    }
                    if (i5 != i3) {
                        contentValues.put("preferred_charging_state", Integer.valueOf(i5));
                    }
                    int a3 = aabq.n.a(qxr.a);
                    int b2 = aabq.n.b(qxr.a);
                    contentValues.put("required_idleness_state", Integer.valueOf(a3));
                    if (b2 != a3) {
                        contentValues.put("preferred_idleness_state", Integer.valueOf(b2));
                    }
                    Bundle bundle = aabq.n.m;
                    if (bundle != null) {
                        contentValues.put("extras", a(bundle));
                    }
                    qxl qxl = aabq.n.l;
                    Bundle bundle2 = new Bundle();
                    qxl.b(bundle2);
                    contentValues.put("retry_strategy", a(bundle2));
                    contentValues.put("task_type", Integer.valueOf(i));
                    contentValues.put("job_id", Integer.valueOf(aabq.i));
                    contentValues.put("source", Integer.valueOf(aabq.k()));
                    contentValues.put("source_version", Integer.valueOf(aabq.l()));
                    if (axlx.c()) {
                        Set<Uri> set2 = aabq.n.k;
                        JSONArray jSONArray4 = new JSONArray();
                        for (Uri uri : set2) {
                            jSONArray4.put(uri.toString());
                        }
                        contentValues.put("required_uris", jSONArray4.toString());
                    }
                    long j = aabq.e;
                    if (j == -1) {
                        aabq.e = a2.insert("pending_ops", (String) null, contentValues);
                    } else {
                        contentValues.put("_id", Long.valueOf(j));
                        a2.replace("pending_ops", (String) null, contentValues);
                    }
                }
            }
        } catch (JSONException e) {
            Log.e("NetworkScheduler", "JSON exception.", e);
            str = null;
        } catch (Throwable th) {
            try {
                qye.close();
            } catch (Throwable th2) {
                apev.a(th, th2);
            }
            throw th;
        }
        qye.close();
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.a.b() && axbr.b() && axbr.c();
    }
}
