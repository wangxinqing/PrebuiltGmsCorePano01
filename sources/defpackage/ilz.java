package defpackage;

import android.content.Context;

/* renamed from: ilz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ilz extends isu {
    private static final String[] b = {"com.google.android.gms", "com.google.android.gms:car", "com.google.android.gms.feedback", "com.google.android.gms.nearby.connection", "com.google.android.gms.persistent", "com.google.android.gms.room", "com.google.android.gms:snet", "com.google.android.gms.ui", "com.google.android.gms.wearable", "com.google.android.gms.unstable", "com.google.process.gapps", "com.google.process.location", "com.google.android.gms.learning"};
    private final ing c;

    public ilz(Context context, ism ism, ing ing) {
        super(context);
        iva.a((Object) ism, (Object) "exceptionHandlerUtils cannot be null");
        iva.a((Object) ing, (Object) "fixerFramework can not be null");
        this.c = ing;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        android.util.Log.w(r13, "Not shushing due to whitelist override.");
        r0 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0433 A[SYNTHETIC, Splitter:B:218:0x0433] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x052a A[SYNTHETIC, Splitter:B:263:0x052a] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x052f A[SYNTHETIC, Splitter:B:268:0x052f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.Thread r46, java.lang.Throwable r47) {
        /*
            r45 = this;
            r1 = r45
            r2 = r47
            java.lang.String r3 = "crash_count"
            java.lang.String r4 = "crash_hash"
            java.lang.String r5 = "latest_notification_time"
            java.lang.String r6 = "latest_tme"
            java.lang.String r7 = "start_time"
            java.lang.String r8 = "count"
            java.lang.String r9 = "stack_trace"
            java.lang.String r10 = "Error closing database."
            java.lang.String r11 = "latest_error_dialog_time"
            java.lang.String r12 = "\n"
            java.lang.String r13 = "DeviceDoctorHandler"
            boolean r0 = r2 instanceof java.lang.OutOfMemoryError     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0035
            awyw r0 = defpackage.awyw.a     // Catch:{ all -> 0x002f }
            awyx r0 = r0.a()     // Catch:{ all -> 0x002f }
            boolean r0 = r0.p()     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x002b
            goto L_0x0035
        L_0x002b:
            defpackage.jjc.a()     // Catch:{ all -> 0x002f }
            goto L_0x0035
        L_0x002f:
            r0 = move-exception
            java.lang.String r14 = "Failed trying to dump open files."
            android.util.Log.e(r13, r14, r0)
        L_0x0035:
            boolean r0 = r2 instanceof java.lang.Error
            if (r0 != 0) goto L_0x0552
            awyw r0 = defpackage.awyw.a
            awyx r0 = r0.a()
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0550
            int r0 = android.os.Build.VERSION.SDK_INT
            boolean r0 = defpackage.aamy.a()     // Catch:{ aamx -> 0x0539 }
            if (r0 != 0) goto L_0x0050
            r12 = r2
            goto L_0x0541
        L_0x0050:
            ilw r17 = new ilw     // Catch:{ RuntimeException -> 0x050e, all -> 0x0506 }
            r17.<init>()     // Catch:{ RuntimeException -> 0x050e, all -> 0x0506 }
            java.lang.String r0 = "The throwable cannot be null."
            defpackage.iva.a((java.lang.Object) r2, (java.lang.Object) r0)     // Catch:{ RuntimeException -> 0x0501, all -> 0x04fb }
            java.lang.String r0 = "DeviceDrDatabaseHelper"
            java.lang.String r15 = "Cleaning stale data from database!"
            android.util.Log.i(r0, r15)     // Catch:{ RuntimeException -> 0x0501, all -> 0x04fb }
            java.util.List r0 = defpackage.ilw.e()     // Catch:{ RuntimeException -> 0x0501, all -> 0x04fb }
            r15 = 0
        L_0x0066:
            int r14 = r0.size()     // Catch:{ RuntimeException -> 0x0501, all -> 0x04fb }
            if (r15 < r14) goto L_0x04c8
            defpackage.ilw.d()     // Catch:{ RuntimeException -> 0x0501, all -> 0x04fb }
            android.database.sqlite.SQLiteDatabase r14 = r17.getWritableDatabase()     // Catch:{ RuntimeException -> 0x0501, all -> 0x04fb }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ RuntimeException -> 0x0501, all -> 0x04fb }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ RuntimeException -> 0x0501, all -> 0x04fb }
            long r0 = r0.toSeconds(r1)     // Catch:{ RuntimeException -> 0x0501, all -> 0x04fb }
            java.lang.Throwable r2 = r47.getCause()     // Catch:{ RuntimeException -> 0x0501, all -> 0x04fb }
            r15 = r47
        L_0x0083:
            if (r2 != 0) goto L_0x04a0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0501, all -> 0x04fb }
            r2.<init>()     // Catch:{ RuntimeException -> 0x0501, all -> 0x04fb }
            java.lang.Class r20 = r15.getClass()     // Catch:{ RuntimeException -> 0x0501, all -> 0x04fb }
            r28 = r10
            java.lang.String r10 = r20.getName()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r2.append(r10)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r2.append(r12)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            java.lang.StackTraceElement[] r10 = r15.getStackTrace()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            int r15 = r10.length     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r20 = r10
            r10 = 0
        L_0x00a2:
            if (r10 < r15) goto L_0x0444
            java.lang.String r2 = r2.toString()     // Catch:{ RuntimeException -> 0x0440, all -> 0x043c }
            java.lang.String r10 = "UTF-8"
            java.nio.charset.Charset r10 = java.nio.charset.Charset.forName(r10)     // Catch:{ RuntimeException -> 0x0440, all -> 0x043c }
            byte[] r2 = r2.getBytes(r10)     // Catch:{ RuntimeException -> 0x0440, all -> 0x043c }
            java.lang.String r10 = "SHA1"
            byte[] r2 = defpackage.jhg.a((byte[]) r2, (java.lang.String) r10)     // Catch:{ RuntimeException -> 0x0440, all -> 0x043c }
            java.lang.String r2 = defpackage.jjp.a((byte[]) r2)     // Catch:{ RuntimeException -> 0x0440, all -> 0x043c }
            java.lang.Throwable r10 = defpackage.jis.a((java.lang.Throwable) r47)     // Catch:{ RuntimeException -> 0x0440, all -> 0x043c }
            if (r10 == 0) goto L_0x00d7
            java.lang.String r10 = android.util.Log.getStackTraceString(r10)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            int r15 = r10.length()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r29 = r12
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r15 <= r12) goto L_0x00db
            int r15 = r15 + -16384
            java.lang.String r10 = r10.substring(r15)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            goto L_0x00db
        L_0x00d7:
            r29 = r12
            java.lang.String r10 = ""
        L_0x00db:
            r14.beginTransaction()     // Catch:{ RuntimeException -> 0x0440, all -> 0x043c }
            long r20 = defpackage.ilt.a     // Catch:{ all -> 0x0428 }
            long r20 = r0 - r20
            r12 = 6
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ all -> 0x0428 }
            r15 = 0
            r12[r15] = r9     // Catch:{ all -> 0x0428 }
            r15 = 1
            r12[r15] = r8     // Catch:{ all -> 0x0428 }
            r15 = 2
            r12[r15] = r7     // Catch:{ all -> 0x0428 }
            r22 = 3
            r12[r22] = r6     // Catch:{ all -> 0x0428 }
            r22 = 4
            r12[r22] = r11     // Catch:{ all -> 0x0428 }
            r15 = 5
            r12[r15] = r5     // Catch:{ all -> 0x0428 }
            r15 = 2
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ all -> 0x0428 }
            r19 = 0
            r15[r19] = r2     // Catch:{ all -> 0x0428 }
            java.lang.String r20 = java.lang.Long.toString(r20)     // Catch:{ all -> 0x0428 }
            r16 = 1
            r15[r16] = r20     // Catch:{ all -> 0x0428 }
            java.lang.String r21 = "crash_count"
            java.lang.String r23 = "crash_hash = ? AND latest_tme > ?"
            r25 = 0
            r26 = 0
            r27 = 0
            r20 = r14
            r22 = r12
            r24 = r15
            android.database.Cursor r12 = r20.query(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0428 }
            boolean r15 = r12.moveToFirst()     // Catch:{ all -> 0x0421 }
            if (r15 == 0) goto L_0x012c
            ilu r15 = defpackage.ilt.a(r12, r2)     // Catch:{ all -> 0x0421 }
            if (r12 == 0) goto L_0x013a
            r12.close()     // Catch:{ all -> 0x0132 }
            goto L_0x013a
        L_0x012c:
            if (r12 == 0) goto L_0x0139
            r12.close()     // Catch:{ all -> 0x0132 }
            goto L_0x0139
        L_0x0132:
            r0 = move-exception
            r2 = r45
        L_0x0135:
            r3 = r28
            goto L_0x0438
        L_0x0139:
            r15 = 0
        L_0x013a:
            r20 = 0
            r22 = 1
            if (r15 != 0) goto L_0x014a
            r26 = r20
            r24 = r22
            r21 = r13
            r22 = r26
            r12 = r0
            goto L_0x0162
        L_0x014a:
            r21 = r13
            long r12 = r15.c     // Catch:{ all -> 0x041a }
            long r22 = r12 + r22
            long r12 = r15.d     // Catch:{ all -> 0x041a }
            r24 = r12
            long r12 = r15.f     // Catch:{ all -> 0x041a }
            r26 = r12
            long r12 = r15.g     // Catch:{ all -> 0x041a }
            r43 = r12
            r12 = r24
            r24 = r22
            r22 = r43
        L_0x0162:
            android.content.ContentValues r15 = new android.content.ContentValues     // Catch:{ all -> 0x041a }
            r15.<init>()     // Catch:{ all -> 0x041a }
            r15.put(r4, r2)     // Catch:{ all -> 0x041a }
            r15.put(r9, r10)     // Catch:{ all -> 0x041a }
            java.lang.Long r2 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x041a }
            r15.put(r7, r2)     // Catch:{ all -> 0x041a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x041a }
            r15.put(r6, r0)     // Catch:{ all -> 0x041a }
            java.lang.Long r0 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x041a }
            r15.put(r8, r0)     // Catch:{ all -> 0x041a }
            java.lang.Long r0 = java.lang.Long.valueOf(r26)     // Catch:{ all -> 0x041a }
            r15.put(r11, r0)     // Catch:{ all -> 0x041a }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x041a }
            r15.put(r5, r0)     // Catch:{ all -> 0x041a }
            r0 = 5
            r1 = 0
            long r12 = r14.insertWithOnConflict(r3, r1, r15, r0)     // Catch:{ all -> 0x041a }
            r0 = -1
            java.lang.String r2 = "CrashCountTable"
            int r10 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x0210
            r14.setTransactionSuccessful()     // Catch:{ all -> 0x041a }
            boolean r0 = r15.containsKey(r4)     // Catch:{ all -> 0x041a }
            if (r0 != 0) goto L_0x01a8
            goto L_0x0205
        L_0x01a8:
            boolean r0 = r15.containsKey(r9)     // Catch:{ all -> 0x041a }
            if (r0 == 0) goto L_0x0205
            boolean r0 = r15.containsKey(r8)     // Catch:{ all -> 0x041a }
            if (r0 == 0) goto L_0x0205
            boolean r0 = r15.containsKey(r6)     // Catch:{ all -> 0x041a }
            if (r0 == 0) goto L_0x0205
            boolean r0 = r15.containsKey(r7)     // Catch:{ all -> 0x041a }
            if (r0 == 0) goto L_0x0205
            boolean r0 = r15.containsKey(r5)     // Catch:{ all -> 0x041a }
            if (r0 == 0) goto L_0x0205
            boolean r0 = r15.containsKey(r11)     // Catch:{ all -> 0x041a }
            if (r0 == 0) goto L_0x0205
            ilu r0 = new ilu     // Catch:{ all -> 0x041a }
            java.lang.String r31 = r15.getAsString(r4)     // Catch:{ all -> 0x041a }
            java.lang.String r32 = r15.getAsString(r9)     // Catch:{ all -> 0x041a }
            java.lang.Long r1 = r15.getAsLong(r8)     // Catch:{ all -> 0x041a }
            long r33 = r1.longValue()     // Catch:{ all -> 0x041a }
            java.lang.Long r1 = r15.getAsLong(r7)     // Catch:{ all -> 0x041a }
            long r35 = r1.longValue()     // Catch:{ all -> 0x041a }
            java.lang.Long r1 = r15.getAsLong(r6)     // Catch:{ all -> 0x041a }
            long r37 = r1.longValue()     // Catch:{ all -> 0x041a }
            java.lang.Long r1 = r15.getAsLong(r11)     // Catch:{ all -> 0x041a }
            long r39 = r1.longValue()     // Catch:{ all -> 0x041a }
            java.lang.Long r1 = r15.getAsLong(r5)     // Catch:{ all -> 0x041a }
            long r41 = r1.longValue()     // Catch:{ all -> 0x041a }
            r30 = r0
            r30.<init>(r31, r32, r33, r35, r37, r39, r41)     // Catch:{ all -> 0x041a }
            goto L_0x020b
        L_0x0205:
            java.lang.String r0 = "Missing an expected column from the database."
            android.util.Log.i(r2, r0)     // Catch:{ all -> 0x041a }
            r0 = 0
        L_0x020b:
            r14.endTransaction()     // Catch:{ RuntimeException -> 0x0223, all -> 0x0220 }
            r1 = r0
            goto L_0x0219
        L_0x0210:
            java.lang.String r0 = "Insert of crash failed due to an unknown error."
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x041a }
            r14.endTransaction()     // Catch:{ RuntimeException -> 0x0413, all -> 0x040c }
            r1 = 0
        L_0x0219:
            java.lang.String r0 = "Crash Hash: "
            if (r1 == 0) goto L_0x0226
            java.lang.String r2 = r1.a     // Catch:{ RuntimeException -> 0x0223, all -> 0x0220 }
            goto L_0x0228
        L_0x0220:
            r0 = move-exception
            goto L_0x040f
        L_0x0223:
            r0 = move-exception
            goto L_0x0416
        L_0x0226:
            java.lang.String r2 = "null"
        L_0x0228:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ RuntimeException -> 0x0413, all -> 0x040c }
            int r4 = r2.length()     // Catch:{ RuntimeException -> 0x0413, all -> 0x040c }
            if (r4 != 0) goto L_0x0238
            java.lang.String r2 = new java.lang.String     // Catch:{ RuntimeException -> 0x0223, all -> 0x0220 }
            r2.<init>(r0)     // Catch:{ RuntimeException -> 0x0223, all -> 0x0220 }
            goto L_0x023c
        L_0x0238:
            java.lang.String r2 = r0.concat(r2)     // Catch:{ RuntimeException -> 0x0413, all -> 0x040c }
        L_0x023c:
            r13 = r21
            android.util.Log.w(r13, r2)     // Catch:{ RuntimeException -> 0x0440, all -> 0x043c }
            ina r0 = defpackage.inb.c()     // Catch:{ RuntimeException -> 0x0440, all -> 0x043c }
            aogr r2 = defpackage.aogr.UNCAUGHT_EXCEPTION_HANDLER     // Catch:{ RuntimeException -> 0x0440, all -> 0x043c }
            r0.a = r2     // Catch:{ RuntimeException -> 0x0440, all -> 0x043c }
            r2 = r45
            android.content.Context r4 = r2.a     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r0.b = r4     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r0.g = r1     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            inb r0 = r0.a()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            boolean r4 = defpackage.awyw.h()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            if (r4 == 0) goto L_0x025c
            goto L_0x025f
        L_0x025c:
            defpackage.imr.a()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
        L_0x025f:
            ing r4 = r2.c     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r4.a((defpackage.inb) r0)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            if (r1 == 0) goto L_0x03f4
            awyw r0 = defpackage.awyw.a     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            awyx r0 = r0.a()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            boolean r0 = r0.P()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            if (r0 == 0) goto L_0x03f1
            java.lang.String r4 = android.util.Log.getStackTraceString(r47)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            java.lang.String r0 = defpackage.jkt.a()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            if (r0 == 0) goto L_0x027e
            r5 = r0
            goto L_0x0281
        L_0x027e:
            java.lang.String r0 = "(null process name)"
            r5 = r0
        L_0x0281:
            r12 = r47
            boolean r0 = r12 instanceof defpackage.imd     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            if (r0 != 0) goto L_0x03e9
            java.util.Random r0 = new java.util.Random     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            float r0 = r0.nextFloat()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            double r6 = (double) r0     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            awyw r0 = defpackage.awyw.a     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            awyx r0 = r0.a()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            double r8 = r0.N()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r10 = 1073741824(0x40000000, float:2.0)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x02a9
            java.lang.String r0 = "Not shushing crash due to random threshold."
            android.util.Log.w(r13, r0)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r0 = 0
            goto L_0x033a
        L_0x02a9:
            java.lang.String[] r0 = b     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            boolean r0 = defpackage.jhx.a((java.lang.String[]) r0, (java.lang.String) r5)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            if (r0 != 0) goto L_0x02b9
            java.lang.String r0 = "Not shushing due to process not found in the whitelist."
            android.util.Log.w(r13, r0)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r0 = 0
            goto L_0x033a
        L_0x02b9:
            java.lang.String r0 = defpackage.awyw.j()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            boolean r0 = r0.isEmpty()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            if (r0 != 0) goto L_0x031f
            java.lang.String r6 = defpackage.awyw.j()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            java.lang.String r0 = r1.a     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            if (r7 == 0) goto L_0x02d0
        L_0x02cf:
            goto L_0x031f
        L_0x02d0:
            boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            if (r7 != 0) goto L_0x02cf
            r7 = 44
            amsk r7 = defpackage.amsk.a((char) r7)     // Catch:{ IllegalArgumentException -> 0x0305 }
            amsk r7 = r7.b()     // Catch:{ IllegalArgumentException -> 0x0305 }
            amsk r7 = r7.a()     // Catch:{ IllegalArgumentException -> 0x0305 }
            java.lang.Iterable r7 = r7.a((java.lang.CharSequence) r6)     // Catch:{ IllegalArgumentException -> 0x0305 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ IllegalArgumentException -> 0x0305 }
        L_0x02ec:
            boolean r8 = r7.hasNext()     // Catch:{ IllegalArgumentException -> 0x0305 }
            if (r8 == 0) goto L_0x031f
            java.lang.Object r8 = r7.next()     // Catch:{ IllegalArgumentException -> 0x0305 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IllegalArgumentException -> 0x0305 }
            boolean r8 = defpackage.ampw.a(r8, r0)     // Catch:{ IllegalArgumentException -> 0x0305 }
            if (r8 == 0) goto L_0x02ec
            java.lang.String r0 = "Not shushing due to whitelist override."
            android.util.Log.w(r13, r0)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r0 = 0
            goto L_0x033a
        L_0x0305:
            r0 = move-exception
            java.lang.String r7 = "Failed to parse string list: "
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            int r8 = r6.length()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            if (r8 != 0) goto L_0x0318
            java.lang.String r6 = new java.lang.String     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r6.<init>(r7)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            goto L_0x031c
        L_0x0318:
            java.lang.String r6 = r7.concat(r6)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
        L_0x031c:
            android.util.Log.e(r13, r6, r0)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
        L_0x031f:
            long r6 = r1.e     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            long r8 = r1.f     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            long r6 = r6 - r8
            r8 = 3600(0xe10, double:1.7786E-320)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0333
            java.lang.String r0 = "Shushing crash due to popup frequency."
            android.util.Log.w(r13, r0)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r0 = 1073741825(0x40000001, float:2.0000002)
            goto L_0x033a
        L_0x0333:
            java.lang.String r0 = "Shushing crash."
            android.util.Log.w(r13, r0)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x033a:
            r6 = r0 & r10
            if (r6 != 0) goto L_0x0380
            java.lang.String r0 = r1.a     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            java.lang.String r1 = "crashHash cannot be null"
            defpackage.iva.a((java.lang.Object) r0, (java.lang.Object) r1)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            defpackage.ilw.d()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            android.database.sqlite.SQLiteDatabase r1 = r17.getWritableDatabase()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            long r4 = r4.toSeconds(r5)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r7 = 0
            r6[r7] = r0     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r0.put(r11, r4)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r1.beginTransaction()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            java.lang.String r4 = "crash_hash = ?"
            int r0 = r1.update(r3, r0, r4, r6)     // Catch:{ all -> 0x037b }
            if (r0 <= 0) goto L_0x0376
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x037b }
        L_0x0376:
            r1.endTransaction()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r14 = 0
            goto L_0x03d6
        L_0x037b:
            r0 = move-exception
            r1.endTransaction()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            throw r0     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
        L_0x0380:
            boolean r1 = r12 instanceof defpackage.imd     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            if (r1 != 0) goto L_0x03e2
            int r1 = android.os.Process.myPid()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            java.lang.String r3 = r46.getName()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r6.<init>()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            java.lang.String r7 = "FATAL EXCEPTION: "
            r6.append(r7)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r6.append(r3)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r3 = r29
            r6.append(r3)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            if (r7 == 0) goto L_0x03a5
            goto L_0x03b2
        L_0x03a5:
            java.lang.String r7 = "Process: "
            r6.append(r7)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r6.append(r5)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            java.lang.String r5 = ", "
            r6.append(r5)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
        L_0x03b2:
            java.lang.String r5 = "PID: "
            r6.append(r5)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r6.append(r1)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r6.append(r3)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            if (r5 != 0) goto L_0x03c9
            r6.append(r4)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r6.append(r3)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
        L_0x03c9:
            java.lang.String r3 = r6.toString()     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            android.util.Log.e(r13, r3)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            android.content.Context r3 = r2.a     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            defpackage.jhg.a(r3, r1, r4, r0)     // Catch:{ RuntimeException -> 0x049b, all -> 0x0496 }
            r14 = 1
        L_0x03d6:
            r17.close()     // Catch:{ RuntimeException -> 0x03da }
            goto L_0x03e1
        L_0x03da:
            r0 = move-exception
            r1 = r0
            r3 = r28
            android.util.Log.w(r13, r3, r1)
        L_0x03e1:
            return r14
        L_0x03e2:
            r3 = r28
            r0 = r12
            imd r0 = (defpackage.imd) r0     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
            r1 = 0
            throw r1     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
        L_0x03e9:
            r3 = r28
            r0 = r12
            imd r0 = (defpackage.imd) r0     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
            r18 = 0
            throw r18     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
        L_0x03f1:
            r3 = r28
            goto L_0x03f6
        L_0x03f4:
            r3 = r28
        L_0x03f6:
            if (r1 == 0) goto L_0x03fe
            java.lang.String r0 = "Shush is disabled."
            android.util.Log.w(r13, r0)     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
            goto L_0x0403
        L_0x03fe:
            java.lang.String r0 = "No data from the database helper."
            android.util.Log.w(r13, r0)     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
        L_0x0403:
            r17.close()     // Catch:{ RuntimeException -> 0x0408 }
            goto L_0x0528
        L_0x0408:
            r0 = move-exception
            r1 = r0
            goto L_0x0525
        L_0x040c:
            r0 = move-exception
            r2 = r45
        L_0x040f:
            r13 = r21
            goto L_0x0497
        L_0x0413:
            r0 = move-exception
            r2 = r45
        L_0x0416:
            r13 = r21
            goto L_0x049c
        L_0x041a:
            r0 = move-exception
            r2 = r45
            r13 = r21
            goto L_0x0135
        L_0x0421:
            r0 = move-exception
            r2 = r45
            r3 = r28
            r15 = r12
            goto L_0x0431
        L_0x0428:
            r0 = move-exception
            r2 = r45
            r3 = r28
            r18 = 0
            r15 = r18
        L_0x0431:
            if (r15 == 0) goto L_0x0436
            r15.close()     // Catch:{ all -> 0x0437 }
        L_0x0436:
            throw r0     // Catch:{ all -> 0x0437 }
        L_0x0437:
            r0 = move-exception
        L_0x0438:
            r14.endTransaction()     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
            throw r0     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
        L_0x043c:
            r0 = move-exception
            r2 = r45
            goto L_0x0497
        L_0x0440:
            r0 = move-exception
            r2 = r45
            goto L_0x049c
        L_0x0444:
            r21 = r0
            r23 = r3
            r1 = r12
            r3 = r28
            r18 = 0
            r12 = r47
            r0 = r20[r10]     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
            java.lang.String r24 = r0.getClassName()     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
            boolean r24 = defpackage.jis.a((java.lang.String) r24)     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
            if (r24 == 0) goto L_0x0475
            r24 = r4
            java.lang.StackTraceElement r4 = new java.lang.StackTraceElement     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
            r25 = r5
            java.lang.String r5 = r0.getClassName()     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
            java.lang.String r0 = r0.getMethodName()     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
            r26 = r6
            java.lang.String r6 = "File"
            r27 = r7
            r7 = -1
            r4.<init>(r5, r0, r6, r7)     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
            r0 = r4
            goto L_0x047d
        L_0x0475:
            r24 = r4
            r25 = r5
            r26 = r6
            r27 = r7
        L_0x047d:
            r2.append(r0)     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
            r2.append(r1)     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
            int r10 = r10 + 1
            r12 = r1
            r28 = r3
            r0 = r21
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            goto L_0x00a2
        L_0x0496:
            r0 = move-exception
        L_0x0497:
            r3 = r28
            goto L_0x04fd
        L_0x049b:
            r0 = move-exception
        L_0x049c:
            r3 = r28
            goto L_0x0503
        L_0x04a0:
            r21 = r0
            r23 = r3
            r24 = r4
            r25 = r5
            r26 = r6
            r27 = r7
            r3 = r10
            r1 = r12
            r18 = 0
            r12 = r47
            java.lang.Throwable r0 = r2.getCause()     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
            r12 = r1
            r15 = r2
            r10 = r3
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r2 = r0
            r0 = r21
            goto L_0x0083
        L_0x04c8:
            r23 = r3
            r24 = r4
            r25 = r5
            r26 = r6
            r27 = r7
            r3 = r10
            r1 = r12
            r18 = 0
            r12 = r2
            java.lang.Object r2 = r0.get(r15)     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
            ily r2 = (defpackage.ily) r2     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
            android.database.sqlite.SQLiteDatabase r4 = r17.getWritableDatabase()     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
            r2.b(r4)     // Catch:{ RuntimeException -> 0x04f9, all -> 0x04f7 }
            int r15 = r15 + 1
            r10 = r3
            r2 = r12
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r12 = r1
            r1 = r45
            goto L_0x0066
        L_0x04f7:
            r0 = move-exception
            goto L_0x04fd
        L_0x04f9:
            r0 = move-exception
            goto L_0x0503
        L_0x04fb:
            r0 = move-exception
            r3 = r10
        L_0x04fd:
            r1 = r0
            r15 = r17
            goto L_0x052d
        L_0x0501:
            r0 = move-exception
            r3 = r10
        L_0x0503:
            r15 = r17
            goto L_0x0514
        L_0x0506:
            r0 = move-exception
            r3 = r10
            r18 = 0
            r1 = r0
            r15 = r18
            goto L_0x052d
        L_0x050e:
            r0 = move-exception
            r3 = r10
            r18 = 0
            r15 = r18
        L_0x0514:
            java.lang.String r1 = "Hit a RuntimeException while trying to handle the crash."
            android.util.Log.w(r13, r1, r0)     // Catch:{ all -> 0x052b }
            boolean r1 = r0 instanceof android.database.sqlite.SQLiteException     // Catch:{ all -> 0x052b }
            if (r1 == 0) goto L_0x052a
            if (r15 == 0) goto L_0x0528
            r15.close()     // Catch:{ RuntimeException -> 0x0523 }
            goto L_0x0528
        L_0x0523:
            r0 = move-exception
            r1 = r0
        L_0x0525:
            android.util.Log.w(r13, r3, r1)
        L_0x0528:
            r1 = 0
            return r1
        L_0x052a:
            throw r0     // Catch:{ all -> 0x052b }
        L_0x052b:
            r0 = move-exception
            r1 = r0
        L_0x052d:
            if (r15 == 0) goto L_0x0538
            r15.close()     // Catch:{ RuntimeException -> 0x0533 }
            goto L_0x0538
        L_0x0533:
            r0 = move-exception
            r2 = r0
            android.util.Log.w(r13, r3, r2)
        L_0x0538:
            throw r1
        L_0x0539:
            r0 = move-exception
            r12 = r2
            r1 = r0
            java.lang.String r0 = "Unable to get the information!"
            android.util.Log.w(r13, r0, r1)
        L_0x0541:
            java.lang.String r0 = "Ignoring crash due to lack of permissions."
            android.util.Log.w(r13, r0, r12)
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            r1 = 1
            return r1
        L_0x0550:
            r1 = 0
            return r1
        L_0x0552:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ilz.a(java.lang.Thread, java.lang.Throwable):boolean");
    }
}
