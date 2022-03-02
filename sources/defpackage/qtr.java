package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: qtr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qtr extends jjj {
    public static final String[] a = {"_id", "msg_type", "date"};
    public static final String[] b = {"_id", "msg_type"};
    private static qtr e;
    public final Context c;
    public final aplf d;

    public static String a(String str, Integer num) {
        String str2;
        if (!"sms".equals(str)) {
            str2 = "content://mms/";
        } else {
            str2 = "content://sms/";
        }
        String valueOf = String.valueOf(num);
        StringBuilder sb = new StringBuilder(str2.length() + String.valueOf(valueOf).length());
        sb.append(str2);
        sb.append(valueOf);
        return sb.toString();
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        qoi.a("Upgrading mmssms DB from version %d to version %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i != i2) {
            onCreate(sQLiteDatabase);
            qtp.g(this.c);
        }
    }

    public qtr(Context context, String str, aplf aplf) {
        super(context, str, str, 3);
        this.c = context;
        this.d = aplf;
    }

    public static synchronized qtr a(Context context) {
        qtr qtr;
        synchronized (qtr.class) {
            if (e == null) {
                e = new qtr(context, "ipa_mmssms.db", aplf.a(context));
            }
            qtr = e;
        }
        return qtr;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.util.List r29, java.lang.String r30, defpackage.qtv r31) {
        /*
            r28 = this;
            r1 = r28
            r0 = r30
            r2 = r31
            java.lang.String r3 = "read"
            android.database.sqlite.SQLiteDatabase r13 = r28.a()
            r14 = 0
            if (r13 != 0) goto L_0x0015
            java.lang.String r0 = "Got null db in SmsCorpusDbOpenHelper.updateReadStatus"
            defpackage.qoi.b(r0)
            return r14
        L_0x0015:
            r13.beginTransaction()
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x01be }
            r4.<init>()     // Catch:{ all -> 0x01be }
            r15 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x01be }
            r4.put(r3, r5)     // Catch:{ all -> 0x01be }
            java.util.Iterator r5 = r29.iterator()     // Catch:{ all -> 0x01be }
            r16 = 0
        L_0x002b:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x01be }
            r12 = 2
            if (r6 == 0) goto L_0x004d
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x01be }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x01be }
            java.lang.String[] r7 = new java.lang.String[r12]     // Catch:{ all -> 0x01be }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x01be }
            r7[r14] = r6     // Catch:{ all -> 0x01be }
            r7[r15] = r0     // Catch:{ all -> 0x01be }
            java.lang.String r6 = "mmssms"
            java.lang.String r8 = "_id=? AND msg_type=?"
            int r6 = r13.update(r6, r4, r8, r7)     // Catch:{ all -> 0x01be }
            int r16 = r16 + r6
            goto L_0x002b
        L_0x004d:
            r13.setTransactionSuccessful()     // Catch:{ all -> 0x01be }
            r13.endTransaction()
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)
            r4[r14] = r5
            r4[r15] = r0
            boolean r5 = defpackage.axvz.j()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4[r12] = r5
            boolean r4 = defpackage.axvz.j()
            r5 = 8
            if (r4 == 0) goto L_0x007e
            qta r4 = new qta
            aplf r6 = r1.d
            long r7 = defpackage.axvz.q()
            int r8 = (int) r7
            r4.<init>(r6, r5, r8)
            r11 = r4
            goto L_0x008b
        L_0x007e:
            qtc r4 = new qtc
            aplf r6 = r1.d
            long r7 = defpackage.axvz.q()
            int r8 = (int) r7
            r4.<init>(r6, r5, r8)
            r11 = r4
        L_0x008b:
            int r10 = r29.size()
            r9 = 0
        L_0x0090:
            if (r9 >= r10) goto L_0x01b9
            r8 = r29
            java.lang.Object r4 = r8.get(r9)
            r17 = r4
            java.lang.Integer r17 = (java.lang.Integer) r17
            boolean r4 = defpackage.axvz.j()
            java.lang.String r7 = "sms"
            r6 = 0
            if (r4 != 0) goto L_0x00d6
            boolean r4 = r7.equals(r0)
            if (r4 == 0) goto L_0x00b4
            int r4 = r17.intValue()
            qtg r4 = r2.a((int) r4)
            goto L_0x00bc
        L_0x00b4:
            int r4 = r17.intValue()
            qtg r4 = r2.b((int) r4)
        L_0x00bc:
            if (r4 == 0) goto L_0x00cc
            aplu r6 = r4.a(r13)
            r23 = r9
            r18 = r10
            r27 = r11
            r4 = 2
            r7 = 1
            goto L_0x01a6
        L_0x00cc:
            r23 = r9
            r18 = r10
            r27 = r11
            r4 = 2
            r7 = 1
            goto L_0x01a6
        L_0x00d6:
            java.lang.String[] r5 = new java.lang.String[r15]
            java.lang.String r4 = "msg_box"
            r5[r14] = r4
            java.lang.String[] r4 = new java.lang.String[r12]
            java.lang.String r18 = java.lang.String.valueOf(r17)
            r4[r14] = r18
            r4[r15] = r0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            java.lang.String r22 = "mmssms"
            java.lang.String r23 = "_id=? AND msg_type=?"
            r24 = r4
            r4 = r13
            r25 = r5
            r5 = r22
            r15 = r6
            r6 = r25
            r26 = r7
            r7 = r23
            r8 = r24
            r23 = r9
            r9 = r18
            r18 = r10
            r10 = r19
            r27 = r11
            r11 = r20
            r12 = r21
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r4 == 0) goto L_0x0130
            boolean r5 = r4.moveToNext()     // Catch:{ all -> 0x0124 }
            if (r5 == 0) goto L_0x0130
            java.lang.Integer r6 = defpackage.jit.a((android.database.Cursor) r4, (int) r14, (java.lang.Integer) r15)     // Catch:{ all -> 0x0124 }
            r4.close()
            goto L_0x0138
        L_0x0124:
            r0 = move-exception
            r2 = r0
            r4.close()     // Catch:{ all -> 0x012a }
            goto L_0x012f
        L_0x012a:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r3)
        L_0x012f:
            throw r2
        L_0x0130:
            if (r4 == 0) goto L_0x0136
            r4.close()
            goto L_0x0137
        L_0x0136:
        L_0x0137:
            r6 = r15
        L_0x0138:
            if (r6 == 0) goto L_0x01a3
            r4 = 2
            java.lang.String[] r5 = new java.lang.String[r4]
            r5[r14] = r3
            boolean r6 = defpackage.qtg.a((java.lang.Integer) r6, (java.lang.String) r0)
            if (r6 != 0) goto L_0x0148
            java.lang.String r6 = "sent"
            goto L_0x014a
        L_0x0148:
            java.lang.String r6 = "inbox"
        L_0x014a:
            r7 = 1
            r5[r7] = r6
            r6 = r26
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0175
            java.lang.String r6 = java.lang.String.valueOf(r17)
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r8 = r8 + 14
            r9.<init>(r8)
            java.lang.String r8 = "content://sms/"
            r9.append(r8)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            goto L_0x0194
        L_0x0175:
            java.lang.String r6 = java.lang.String.valueOf(r17)
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r8 = r8 + 14
            r9.<init>(r8)
            java.lang.String r8 = "content://mms/"
            r9.append(r8)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
        L_0x0194:
            aply r8 = defpackage.aplz.a()
            r8.b(r6)
            r8.a((java.lang.String[]) r5)
            aplu r6 = r8.a()
            goto L_0x01a6
        L_0x01a3:
            r4 = 2
            r7 = 1
            r6 = r15
        L_0x01a6:
            if (r6 != 0) goto L_0x01ab
            r5 = r27
            goto L_0x01b0
        L_0x01ab:
            r5 = r27
            r5.a(r6)
        L_0x01b0:
            int r9 = r23 + 1
            r11 = r5
            r10 = r18
            r12 = 2
            r15 = 1
            goto L_0x0090
        L_0x01b9:
            r5 = r11
            r5.b()
            return r16
        L_0x01be:
            r0 = move-exception
            r13.endTransaction()
            goto L_0x01c4
        L_0x01c3:
            throw r0
        L_0x01c4:
            goto L_0x01c3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtr.a(java.util.List, java.lang.String, qtv):int");
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase a() {
        try {
            return getWritableDatabase();
        } catch (SQLiteException e2) {
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    public final qtq a(String str, Iterator it) {
        long j;
        long j2;
        String str2 = str;
        SQLiteDatabase a2 = a();
        if (a2 == null) {
            qoi.b("Got null db SmsCorpusDbOpenHelper.processNewMessages for %s", str2);
            return new qtq(0, (oq) null);
        }
        qtc qtc = new qtc(this.d, 7, (int) axvz.q());
        oq oqVar = null;
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            qtg qtg = (qtg) it.next();
            if (qtg != null) {
                a2.beginTransaction();
                try {
                    ContentValues contentValues = new ContentValues();
                    jit.a(contentValues, "_id", Integer.valueOf(qtg.a()));
                    jit.a(contentValues, "msg_type", qtg.b());
                    jit.a(contentValues, "msg_box", qtg.d());
                    if (!"sms".equals(qtg.b())) {
                        j = TimeUnit.MILLISECONDS.toSeconds(qtg.f());
                    } else {
                        j = qtg.f();
                    }
                    contentValues.put("date", Long.valueOf(j));
                    jit.a(contentValues, "read", Integer.valueOf(qtg.m() ? 1 : 0));
                    jit.a(contentValues, "phone_numbers", amre.a(",").a((Iterable) qtg.p()));
                    a2.insert("mmssms", (String) null, contentValues);
                    if (!"sms".equals(str2)) {
                        j2 = TimeUnit.MILLISECONDS.toSeconds(qtg.f());
                    } else {
                        j2 = qtg.f();
                    }
                    if (!qtg.m()) {
                        i2++;
                    }
                    i++;
                    oqVar = new oq(Long.valueOf(j2), Integer.valueOf(qtg.a()));
                    a2.setTransactionSuccessful();
                    qtc.a(qtg.a(a2));
                    a2.endTransaction();
                } catch (Throwable th) {
                    a2.endTransaction();
                    throw th;
                }
            }
        }
        qtc.b();
        Object[] objArr = {Integer.valueOf(i), str2, Integer.valueOf(i2)};
        return new qtq(i, oqVar);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        new Object[1][0] = "DROP TABLE IF EXISTS mmssms";
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS mmssms");
        new Object[1][0] = "CREATE TABLE mmssms(msg_type TEXT NOT NULL,_id INTEGER NOT NULL,msg_box INTEGER,date INTEGER NOT NULL,read INTEGER NOT NULL DEFAULT 0,phone_numbers TEXT,PRIMARY KEY(msg_type,_id) ON CONFLICT REPLACE)";
        sQLiteDatabase.execSQL("CREATE TABLE mmssms(msg_type TEXT NOT NULL,_id INTEGER NOT NULL,msg_box INTEGER,date INTEGER NOT NULL,read INTEGER NOT NULL DEFAULT 0,phone_numbers TEXT,PRIMARY KEY(msg_type,_id) ON CONFLICT REPLACE)");
        if (axvz.l()) {
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS contact_annotation");
                sQLiteDatabase.execSQL("CREATE TABLE contact_annotation(phone_number TEXT NOT NULL,contact_name TEXT NOT NULL,PRIMARY KEY(phone_number,contact_name) ON CONFLICT REPLACE)");
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                new Object[1][0] = "contact_annotation";
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }
    }
}
