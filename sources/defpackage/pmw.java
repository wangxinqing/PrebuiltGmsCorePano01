package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Pair;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: pmw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pmw implements pmr {
    private static final String[] b = {"display_name", "nickname", "phonetic_name", "given_names"};
    private static final String[] c = {"label", "email"};
    private static final String[] d = {"label", "phone"};
    private static final String[] e = {"label", "postal"};
    private final Context f;
    private final png g;
    private final oyq h = new oyq(this.f);

    public pmw(Context context, png png) {
        this.f = context;
        this.g = png;
    }

    public static int a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor rawQuery = sQLiteDatabase.rawQuery(str.length() == 0 ? new String("SELECT COUNT(*) FROM ") : "SELECT COUNT(*) FROM ".concat(str), (String[]) null);
        try {
            if (rawQuery.moveToNext()) {
                int i = rawQuery.getInt(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return i;
            } else if (rawQuery == null) {
                return -1;
            } else {
                rawQuery.close();
                return -1;
            }
        } catch (Throwable th) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
    }

    static ContentValues b(long j, long j2, String str, int i, String str2, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("contact_id", Long.valueOf(j));
        contentValues.put("data_id", Long.valueOf(j2));
        contentValues.put("phone", str);
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("label", str2);
        contentValues.put("score", Integer.valueOf(i2));
        return contentValues;
    }

    static ContentValues c(long j, long j2, String str, int i, String str2, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("contact_id", Long.valueOf(j));
        contentValues.put("data_id", Long.valueOf(j2));
        contentValues.put("postal", str);
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("label", str2);
        contentValues.put("score", Integer.valueOf(i2));
        return contentValues;
    }

    public final Pair b(SQLiteDatabase sQLiteDatabase, Resources resources) {
        return a(sQLiteDatabase, resources, true, (Collection) null);
    }

    private static final int a(SQLiteDatabase sQLiteDatabase, String str, Iterable iterable) {
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            ContentValues contentValues = (ContentValues) it.next();
            pnz.c("Inserting into %s: %s", str, contentValues);
            i += sQLiteDatabase.insert(str, (String) null, contentValues) == -1 ? 0 : 1;
        }
        return i;
    }

    static final int a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        return sQLiteDatabase.delete(str, str2, (String[]) null);
    }

    static long a(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("contact_id");
        if (asLong != null) {
            return asLong.longValue();
        }
        return 0;
    }

    static ContentValues a(long j, long j2, String str, int i, String str2, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("contact_id", Long.valueOf(j));
        contentValues.put("data_id", Long.valueOf(j2));
        contentValues.put("email", str);
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("label", str2);
        contentValues.put("score", Integer.valueOf(i2));
        return contentValues;
    }

    static ContentValues a(long j, String str, String str2, String str3, String str4, long j2, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        ContentValues contentValues = new ContentValues();
        contentValues.clear();
        contentValues.put("contact_id", Long.valueOf(j));
        contentValues.put("lookup_key", str);
        contentValues.put("icon_uri", str2);
        contentValues.put("display_name", str3);
        contentValues.put("given_names", str4);
        contentValues.put("score", Long.valueOf(j2));
        contentValues.put("emails", str5);
        contentValues.put("nickname", str6);
        contentValues.put("note", str7);
        contentValues.put("organization", str8);
        contentValues.put("phone_numbers", str9);
        contentValues.put("postal_address", str10);
        contentValues.put("phonetic_name", str11);
        return contentValues;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: pms} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.util.Pair a(android.database.sqlite.SQLiteDatabase r37, android.content.res.Resources r38, boolean r39, java.util.Collection r40) {
        /*
            r36 = this;
            r1 = r36
            r2 = r37
            r0 = r38
            r3 = r40
            java.lang.String r4 = "contact_deleted_timestamp"
            java.lang.String r5 = "data_id"
            java.lang.String r6 = "postals"
            java.lang.String r7 = "phones"
            java.lang.String r8 = "emails"
            java.lang.String r9 = "contacts"
            if (r39 != 0) goto L_0x0018
            r12 = 1
            goto L_0x001d
        L_0x0018:
            if (r3 == 0) goto L_0x001c
            r12 = 0
            goto L_0x001d
        L_0x001c:
            r12 = 1
        L_0x001d:
            java.lang.String r13 = "Can not do a delta update with filterContactIds"
            defpackage.iva.b(r12, r13)
            android.content.SharedPreferences r12 = r36.a()
            java.lang.String r13 = "key_last_contacts_delta_delete_timestamp"
            r14 = 0
            long r16 = r12.getLong(r13, r14)
            android.content.SharedPreferences r12 = r36.a()
            java.lang.String r11 = "key_last_contacts_delta_update_timestamp"
            r19 = r13
            long r12 = r12.getLong(r11, r14)
            if (r39 == 0) goto L_0x004d
            android.content.SharedPreferences r14 = r36.a()
            boolean r14 = r14.contains(r11)
            if (r14 != 0) goto L_0x004d
            java.lang.String r14 = "Delta update with no prior full sync - doing full sync instead."
            defpackage.pnz.c(r14)
            r14 = 0
            goto L_0x004f
        L_0x004d:
            r14 = r39
        L_0x004f:
            if (r14 == 0) goto L_0x0053
            r15 = 0
            goto L_0x0058
        L_0x0053:
            if (r3 != 0) goto L_0x0057
            r15 = 1
            goto L_0x0058
        L_0x0057:
            r15 = 0
        L_0x0058:
            android.content.Context r10 = r1.f
            r23 = r11
            android.content.SharedPreferences r11 = r36.a()
            r24 = r5
            java.lang.String r5 = "key_person_indexer_enabled"
            r25 = r6
            r26 = r7
            r6 = 0
            boolean r7 = r11.getBoolean(r5, r6)
            boolean r6 = defpackage.axsj.d()
            if (r7 == r6) goto L_0x009e
            boolean r6 = defpackage.axsj.d()
            if (r6 != 0) goto L_0x008d
            aplf r6 = defpackage.aplf.a((android.content.Context) r10)
            r27 = r8
            r7 = 1
            java.lang.String[] r8 = new java.lang.String[r7]
            java.lang.String r7 = "Person"
            r22 = 0
            r8[r22] = r7
            r6.b((java.lang.String[]) r8)
            r7 = 0
            goto L_0x0092
        L_0x008d:
            r27 = r8
            if (r15 == 0) goto L_0x0092
            r7 = 1
        L_0x0092:
            android.content.SharedPreferences$Editor r6 = r11.edit()
            android.content.SharedPreferences$Editor r5 = r6.putBoolean(r5, r7)
            r5.commit()
            goto L_0x00a0
        L_0x009e:
            r27 = r8
        L_0x00a0:
            if (r7 == 0) goto L_0x00ac
            poe r6 = new poe
            aplf r7 = defpackage.aplf.a((android.content.Context) r10)
            r6.<init>(r7)
            goto L_0x00ad
        L_0x00ac:
            r6 = 0
        L_0x00ad:
            long r7 = android.os.SystemClock.elapsedRealtime()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r14)
            java.lang.String r11 = "Updating contacts db, delta=%b, filter=%s"
            defpackage.pnz.c(r11, r10, r3)
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.lang.String r11 = "contact_id"
            if (r14 == 0) goto L_0x0180
            png r3 = r1.g
            r14 = 1
            defpackage.iva.a((boolean) r14)
            java.lang.String r14 = java.lang.String.valueOf(r12)
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r5 = "contact_last_updated_timestamp>"
            int r28 = r14.length()
            if (r28 != 0) goto L_0x00df
            java.lang.String r14 = new java.lang.String
            r14.<init>(r5)
            goto L_0x00e3
        L_0x00df:
            java.lang.String r14 = r5.concat(r14)
        L_0x00e3:
            android.util.Pair r0 = r3.a((android.content.res.Resources) r0, (java.lang.String) r14)
            java.lang.Object r3 = r0.first
            pmt r3 = (defpackage.pmt) r3
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            r28 = r7
            long r7 = r0.longValue()
            long r12 = java.lang.Math.max(r7, r12)
            png r0 = r1.g
            java.lang.String r5 = "Delta API not supported"
            r7 = 1
            defpackage.iva.a((boolean) r7, (java.lang.Object) r5)
            java.lang.String[] r5 = new java.lang.String[r7]
            java.lang.String r7 = java.lang.Long.toString(r16)
            r8 = 0
            r5[r8] = r7
            java.lang.String r33 = "contact_deleted_timestamp>?"
            pni r0 = r0.a     // Catch:{ all -> 0x0178 }
            android.net.Uri r31 = android.provider.ContactsContract.DeletedContacts.CONTENT_URI     // Catch:{ all -> 0x0178 }
            r7 = 2
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ all -> 0x0178 }
            r7 = 0
            r8[r7] = r11     // Catch:{ all -> 0x0178 }
            r7 = 1
            r8[r7] = r4     // Catch:{ all -> 0x0178 }
            r35 = 0
            r30 = r0
            r32 = r8
            r34 = r5
            android.database.Cursor r5 = r30.a(r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0178 }
            if (r5 == 0) goto L_0x016a
            int r0 = r5.getColumnIndex(r11)     // Catch:{ all -> 0x0176 }
            int r4 = r5.getColumnIndex(r4)     // Catch:{ all -> 0x0176 }
            r30 = r12
            r12 = r16
            r7 = 0
        L_0x0135:
            boolean r14 = r5.moveToNext()     // Catch:{ all -> 0x0176 }
            if (r14 != 0) goto L_0x014e
            java.lang.String r0 = "Got %d deleted contacts since %d"
            java.lang.Long r4 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0176 }
            java.lang.Long r7 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0176 }
            defpackage.pnz.a((java.lang.String) r0, (java.lang.Object) r4, (java.lang.Object) r7)     // Catch:{ all -> 0x0176 }
            r5.close()
            r16 = r12
            goto L_0x0171
        L_0x014e:
            r32 = 1
            long r7 = r7 + r32
            long r32 = r5.getLong(r0)     // Catch:{ all -> 0x0176 }
            java.lang.Long r14 = java.lang.Long.valueOf(r32)     // Catch:{ all -> 0x0176 }
            r10.add(r14)     // Catch:{ all -> 0x0176 }
            r32 = r7
            long r7 = r5.getLong(r4)     // Catch:{ all -> 0x0176 }
            long r12 = java.lang.Math.max(r12, r7)     // Catch:{ all -> 0x0176 }
            r7 = r32
            goto L_0x0135
        L_0x016a:
            r30 = r12
            java.lang.String r0 = "Could not fetch deleted contacts - no contacts provider present?"
            defpackage.pnz.c(r0)     // Catch:{ all -> 0x0176 }
        L_0x0171:
            r4 = r16
            r12 = r30
            goto L_0x01b6
        L_0x0176:
            r0 = move-exception
            goto L_0x017a
        L_0x0178:
            r0 = move-exception
            r5 = 0
        L_0x017a:
            if (r5 == 0) goto L_0x017f
            r5.close()
        L_0x017f:
            throw r0
        L_0x0180:
            r28 = r7
            if (r3 != 0) goto L_0x01a0
            png r3 = r1.g
            java.lang.String r4 = ""
            android.util.Pair r0 = r3.a((android.content.res.Resources) r0, (java.lang.String) r4)
            java.lang.Object r3 = r0.first
            pmt r3 = (defpackage.pmt) r3
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            long r16 = java.lang.Math.max(r4, r12)
            r4 = r16
            r12 = r4
            goto L_0x01b6
        L_0x01a0:
            png r4 = r1.g
            java.lang.String r5 = "_id"
            java.lang.String r5 = a((java.lang.String) r5, (java.lang.Iterable) r3)
            android.util.Pair r0 = r4.a((android.content.res.Resources) r0, (java.lang.String) r5)
            java.lang.Object r0 = r0.first
            pmt r0 = (defpackage.pmt) r0
            r10.addAll(r3)
            r3 = r0
            r4 = r16
        L_0x01b6:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L_0x01bb:
            boolean r7 = r3.hasNext()     // Catch:{ all -> 0x05b4 }
            if (r7 == 0) goto L_0x01f2
            java.lang.Object r7 = r3.next()     // Catch:{ all -> 0x05b4 }
            pms r7 = (defpackage.pms) r7     // Catch:{ all -> 0x05b4 }
            android.content.ContentValues r8 = r7.a     // Catch:{ all -> 0x05b4 }
            long r16 = a((android.content.ContentValues) r8)     // Catch:{ all -> 0x05b4 }
            long r30 = a((android.content.ContentValues) r8)     // Catch:{ all -> 0x05b4 }
            r20 = 0
            int r14 = (r30 > r20 ? 1 : (r30 == r20 ? 0 : -1))
            if (r14 == 0) goto L_0x01bb
            java.lang.String r14 = "lookup_key"
            java.lang.Object r14 = r8.get(r14)     // Catch:{ all -> 0x05b4 }
            if (r14 == 0) goto L_0x01bb
            java.lang.String r14 = "display_name"
            java.lang.Object r8 = r8.get(r14)     // Catch:{ all -> 0x05b4 }
            if (r8 == 0) goto L_0x01bb
            java.lang.Long r8 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x05b4 }
            r0.put(r8, r7)     // Catch:{ all -> 0x05b4 }
            r10.remove(r8)     // Catch:{ all -> 0x05b4 }
            goto L_0x01bb
        L_0x01f2:
            r3.a()
            boolean r3 = r3.c()
            if (r3 != 0) goto L_0x020b
            android.util.Pair r0 = new android.util.Pair
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.<init>(r2, r3)
            return r0
        L_0x020b:
            if (r15 != 0) goto L_0x0215
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L_0x0215
            r3 = 0
            goto L_0x0216
        L_0x0215:
            r3 = 1
        L_0x0216:
            r37.beginTransaction()
            java.util.Set r7 = r0.keySet()     // Catch:{ all -> 0x05af }
            if (r15 == 0) goto L_0x0246
            java.lang.String r8 = ","
            java.lang.String r8 = android.text.TextUtils.join(r8, r7)     // Catch:{ all -> 0x05af }
            java.lang.String r10 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x05af }
            int r10 = r10.length()     // Catch:{ all -> 0x05af }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x05af }
            int r10 = r10 + 20
            r14.<init>(r10)     // Catch:{ all -> 0x05af }
            java.lang.String r10 = "contact_id NOT IN ("
            r14.append(r10)     // Catch:{ all -> 0x05af }
            r14.append(r8)     // Catch:{ all -> 0x05af }
            java.lang.String r8 = ")"
            r14.append(r8)     // Catch:{ all -> 0x05af }
            java.lang.String r8 = r14.toString()     // Catch:{ all -> 0x05af }
            goto L_0x024a
        L_0x0246:
            java.lang.String r8 = a((java.lang.Iterable) r10)     // Catch:{ all -> 0x05af }
        L_0x024a:
            if (r6 != 0) goto L_0x024f
            r38 = r3
            goto L_0x027f
        L_0x024f:
            pns r10 = new pns     // Catch:{ all -> 0x05af }
            r10.<init>(r2, r8)     // Catch:{ all -> 0x05af }
        L_0x0254:
            boolean r14 = r10.hasNext()     // Catch:{ all -> 0x05af }
            if (r14 == 0) goto L_0x027d
            java.lang.Object r14 = r10.next()     // Catch:{ all -> 0x05af }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ all -> 0x05af }
            long r16 = r14.longValue()     // Catch:{ all -> 0x05af }
            aplf r14 = r6.a     // Catch:{ all -> 0x05af }
            r38 = r3
            r40 = r10
            r3 = 1
            java.lang.String[] r10 = new java.lang.String[r3]     // Catch:{ all -> 0x05af }
            java.lang.String r3 = defpackage.poe.a((long) r16)     // Catch:{ all -> 0x05af }
            r16 = 0
            r10[r16] = r3     // Catch:{ all -> 0x05af }
            r14.a((java.lang.String[]) r10)     // Catch:{ all -> 0x05af }
            r3 = r38
            r10 = r40
            goto L_0x0254
        L_0x027d:
            r38 = r3
        L_0x027f:
            int r3 = a((android.database.sqlite.SQLiteDatabase) r2, (java.lang.String) r9, (java.lang.String) r8)     // Catch:{ all -> 0x05af }
            if (r3 <= 0) goto L_0x028f
            java.lang.String r10 = "Deleted %d contacts."
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x05af }
            defpackage.pnz.a((java.lang.String) r10, (java.lang.Object) r14)     // Catch:{ all -> 0x05af }
        L_0x028f:
            r10 = r27
            int r14 = a((android.database.sqlite.SQLiteDatabase) r2, (java.lang.String) r10, (java.lang.String) r8)     // Catch:{ all -> 0x05af }
            int r3 = r3 + r14
            r14 = r26
            int r16 = a((android.database.sqlite.SQLiteDatabase) r2, (java.lang.String) r14, (java.lang.String) r8)     // Catch:{ all -> 0x05af }
            int r3 = r3 + r16
            r16 = r6
            r6 = r25
            int r8 = a((android.database.sqlite.SQLiteDatabase) r2, (java.lang.String) r6, (java.lang.String) r8)     // Catch:{ all -> 0x05af }
            int r3 = r3 + r8
            if (r15 != 0) goto L_0x02af
            java.lang.String r7 = a((java.lang.Iterable) r7)     // Catch:{ all -> 0x05af }
            goto L_0x02b0
        L_0x02af:
            r7 = 0
        L_0x02b0:
            pny r8 = new pny     // Catch:{ all -> 0x05af }
            r8.<init>(r2, r7)     // Catch:{ all -> 0x05af }
            pmv r7 = new pmv     // Catch:{ all -> 0x05af }
            r7.<init>(r9, r11)     // Catch:{ all -> 0x05af }
            pmv r11 = new pmv     // Catch:{ all -> 0x05af }
            r15 = r24
            r11.<init>(r10, r15)     // Catch:{ all -> 0x05af }
            r40 = r3
            pmv r3 = new pmv     // Catch:{ all -> 0x05af }
            r3.<init>(r14, r15)     // Catch:{ all -> 0x05af }
            r26 = r14
            pmv r14 = new pmv     // Catch:{ all -> 0x05af }
            r14.<init>(r6, r15)     // Catch:{ all -> 0x05af }
            r15 = r38
        L_0x02d1:
            boolean r17 = r8.hasNext()     // Catch:{ all -> 0x05aa }
            if (r17 != 0) goto L_0x04fd
            r8.a()     // Catch:{ all -> 0x04f9 }
            int r8 = r0.size()     // Catch:{ all -> 0x04f9 }
            if (r8 <= 0) goto L_0x02e2
            r8 = 1
            goto L_0x02e3
        L_0x02e2:
            r8 = 0
        L_0x02e3:
            r8 = r8 | r15
            anax r3 = defpackage.anax.a(r7, r11, r3, r14)     // Catch:{ all -> 0x04f9 }
            anhj r3 = r3.iterator()     // Catch:{ all -> 0x04f9 }
            r7 = r40
            r11 = 0
            r14 = 0
        L_0x02f0:
            boolean r15 = r3.hasNext()     // Catch:{ all -> 0x04f9 }
            r20 = -1
            if (r15 == 0) goto L_0x03ce
            java.lang.Object r15 = r3.next()     // Catch:{ all -> 0x05af }
            pmv r15 = (defpackage.pmv) r15     // Catch:{ all -> 0x05af }
            r38 = r3
            java.lang.String r3 = r15.a     // Catch:{ all -> 0x05af }
            r40 = r14
            java.lang.String r14 = "Applying deltas: %s"
            defpackage.pnz.a((java.lang.String) r14, (java.lang.Object) r15)     // Catch:{ all -> 0x05af }
            java.util.Set r14 = r15.c     // Catch:{ all -> 0x05af }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x05af }
            r17 = r40
        L_0x0311:
            boolean r24 = r14.hasNext()     // Catch:{ all -> 0x05af }
            if (r24 == 0) goto L_0x033b
            java.lang.Object r24 = r14.next()     // Catch:{ all -> 0x05af }
            r25 = r14
            r14 = r24
            android.content.ContentValues r14 = (android.content.ContentValues) r14     // Catch:{ all -> 0x05af }
            r24 = r6
            java.lang.String r6 = "Inserting into %s: %s"
            defpackage.pnz.c(r6, r3, r14)     // Catch:{ all -> 0x05af }
            r6 = 0
            long r30 = r2.insert(r3, r6, r14)     // Catch:{ all -> 0x05af }
            int r6 = (r30 > r20 ? 1 : (r30 == r20 ? 0 : -1))
            if (r6 != 0) goto L_0x0333
            r6 = 0
            goto L_0x0334
        L_0x0333:
            r6 = 1
        L_0x0334:
            int r17 = r17 + r6
            r6 = r24
            r14 = r25
            goto L_0x0311
        L_0x033b:
            r24 = r6
            java.util.Map r6 = r15.e     // Catch:{ all -> 0x05af }
            java.util.Set r6 = r6.entrySet()     // Catch:{ all -> 0x05af }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x05af }
        L_0x0347:
            boolean r14 = r6.hasNext()     // Catch:{ all -> 0x05af }
            if (r14 == 0) goto L_0x03a7
            java.lang.Object r14 = r6.next()     // Catch:{ all -> 0x05af }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ all -> 0x05af }
            r40 = r6
            java.lang.String r6 = "Updating in %s: %s"
            r27 = r10
            java.lang.Object r10 = r14.getValue()     // Catch:{ all -> 0x05af }
            defpackage.pnz.c(r6, r3, r10)     // Catch:{ all -> 0x05af }
            java.lang.String r6 = r15.b     // Catch:{ all -> 0x05af }
            java.lang.Object r10 = r14.getKey()     // Catch:{ all -> 0x05af }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x05af }
            int r20 = r6.length()     // Catch:{ all -> 0x05af }
            r18 = 1
            int r20 = r20 + 1
            java.lang.String r21 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x05af }
            int r21 = r21.length()     // Catch:{ all -> 0x05af }
            r25 = r8
            int r8 = r20 + r21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05af }
            r1.<init>(r8)     // Catch:{ all -> 0x05af }
            r1.append(r6)     // Catch:{ all -> 0x05af }
            java.lang.String r6 = "="
            r1.append(r6)     // Catch:{ all -> 0x05af }
            r1.append(r10)     // Catch:{ all -> 0x05af }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x05af }
            java.lang.Object r6 = r14.getValue()     // Catch:{ all -> 0x05af }
            android.content.ContentValues r6 = (android.content.ContentValues) r6     // Catch:{ all -> 0x05af }
            r8 = 0
            int r1 = r2.update(r3, r6, r1, r8)     // Catch:{ all -> 0x05af }
            int r11 = r11 + r1
            r1 = r36
            r6 = r40
            r8 = r25
            r10 = r27
            goto L_0x0347
        L_0x03a7:
            r25 = r8
            r27 = r10
            java.lang.String r1 = "Deleting from %s: %s"
            java.util.Set r6 = r15.d     // Catch:{ all -> 0x05af }
            defpackage.pnz.c(r1, r3, r6)     // Catch:{ all -> 0x05af }
            java.lang.String r1 = r15.b     // Catch:{ all -> 0x05af }
            java.util.Set r6 = r15.d     // Catch:{ all -> 0x05af }
            java.lang.String r1 = a((java.lang.String) r1, (java.lang.Iterable) r6)     // Catch:{ all -> 0x05af }
            r6 = 0
            int r1 = r2.delete(r3, r1, r6)     // Catch:{ all -> 0x05af }
            int r7 = r7 + r1
            r1 = r36
            r3 = r38
            r14 = r17
            r6 = r24
            r8 = r25
            r10 = r27
            goto L_0x02f0
        L_0x03ce:
            r24 = r6
            r25 = r8
            r27 = r10
            r40 = r14
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x04f4 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x04f4 }
            r14 = r40
        L_0x03e0:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x04f4 }
            if (r1 != 0) goto L_0x048c
            java.lang.String r0 = "New timestamps: update=%d, delete=%d"
            java.lang.Long r1 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x04f4 }
            java.lang.Long r3 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x04f4 }
            defpackage.pnz.a((java.lang.String) r0, (java.lang.Object) r1, (java.lang.Object) r3)     // Catch:{ all -> 0x04f4 }
            android.content.SharedPreferences r0 = r36.a()     // Catch:{ all -> 0x04f4 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x04f4 }
            r1 = r23
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r12)     // Catch:{ all -> 0x04f4 }
            r6 = r19
            android.content.SharedPreferences$Editor r0 = r0.putLong(r6, r4)     // Catch:{ all -> 0x04f4 }
            r0.apply()     // Catch:{ all -> 0x04f4 }
            r37.setTransactionSuccessful()     // Catch:{ all -> 0x04f4 }
            r37.endTransaction()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r5 = 0
            r3[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r5 = 1
            r3[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r5 = 2
            r3[r5] = r4
            r4 = 3
            long r0 = r0 - r28
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3[r4] = r0
            java.lang.String r0 = "Contacts update done [inserted %d, updated %d deleted %d, took %d ms]"
            defpackage.pnz.b((java.lang.String) r0, (java.lang.Object[]) r3)
            aokt r0 = defpackage.aokt.f
            aucd r0 = r0.o()
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0445
            goto L_0x044b
        L_0x0445:
            r0.c()
            r10 = 0
            r0.c = r10
        L_0x044b:
            aucj r1 = r0.b
            aokt r1 = (defpackage.aokt) r1
            r9.getClass()
            int r3 = r1.a
            r17 = 1
            r3 = r3 | 1
            r1.a = r3
            r1.b = r9
            r18 = 2
            r3 = r3 | 2
            r1.a = r3
            r1.c = r14
            r2 = r2 | r3
            r1.a = r2
            r1.d = r7
            r2 = r2 | 8
            r1.a = r2
            r1.e = r11
            aucj r0 = r0.i()
            aokt r0 = (defpackage.aokt) r0
            r3 = r36
            oyq r1 = r3.h
            r1.a((defpackage.aokt) r0)
            android.util.Pair r0 = new android.util.Pair
            int r14 = r14 + r11
            int r14 = r14 + r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r25)
            r0.<init>(r1, r2)
            return r0
        L_0x048c:
            r3 = r36
            r6 = r19
            r1 = r23
            r10 = 0
            r17 = 1
            r18 = 2
            java.lang.Object r8 = r0.next()     // Catch:{ all -> 0x05af }
            pms r8 = (defpackage.pms) r8     // Catch:{ all -> 0x05af }
            if (r16 != 0) goto L_0x04a2
            r15 = r16
            goto L_0x04a7
        L_0x04a2:
            r15 = r16
            r15.a((defpackage.pms) r8)     // Catch:{ all -> 0x05af }
        L_0x04a7:
            android.content.ContentValues r10 = r8.a     // Catch:{ all -> 0x05af }
            r38 = r0
            java.lang.String r0 = "Inserting contact %s"
            defpackage.pnz.d(r0, r10)     // Catch:{ all -> 0x05af }
            r23 = r1
            r1 = 0
            long r30 = r2.insert(r9, r1, r10)     // Catch:{ all -> 0x05af }
            int r0 = (r30 > r20 ? 1 : (r30 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x04bd
            r0 = 0
            goto L_0x04be
        L_0x04bd:
            r0 = 1
        L_0x04be:
            int r14 = r14 + r0
            java.util.Map r0 = r8.c     // Catch:{ all -> 0x05af }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x05af }
            r10 = r27
            int r0 = a((android.database.sqlite.SQLiteDatabase) r2, (java.lang.String) r10, (java.lang.Iterable) r0)     // Catch:{ all -> 0x05af }
            int r14 = r14 + r0
            java.util.Map r0 = r8.d     // Catch:{ all -> 0x05af }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x05af }
            r1 = r26
            int r0 = a((android.database.sqlite.SQLiteDatabase) r2, (java.lang.String) r1, (java.lang.Iterable) r0)     // Catch:{ all -> 0x05af }
            int r14 = r14 + r0
            java.util.Map r0 = r8.e     // Catch:{ all -> 0x05af }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x05af }
            r8 = r24
            int r0 = a((android.database.sqlite.SQLiteDatabase) r2, (java.lang.String) r8, (java.lang.Iterable) r0)     // Catch:{ all -> 0x05af }
            int r14 = r14 + r0
            r0 = r38
            r26 = r1
            r19 = r6
            r24 = r8
            r27 = r10
            r16 = r15
            goto L_0x03e0
        L_0x04f4:
            r0 = move-exception
            r3 = r36
            goto L_0x05b0
        L_0x04f9:
            r0 = move-exception
            r3 = r1
            goto L_0x05b0
        L_0x04fd:
            r1 = r16
            r17 = 1
            r18 = 2
            r16 = r6
            r6 = r19
            pms r2 = r8.next()     // Catch:{ all -> 0x05aa }
            r19 = r4
            android.content.ContentValues r4 = r2.a     // Catch:{ all -> 0x05aa }
            long r24 = a((android.content.ContentValues) r4)     // Catch:{ all -> 0x05aa }
            java.lang.Long r5 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x05aa }
            java.lang.Object r21 = r0.get(r5)     // Catch:{ all -> 0x05aa }
            r24 = r6
            r6 = r21
            pms r6 = (defpackage.pms) r6     // Catch:{ all -> 0x05aa }
            if (r6 == 0) goto L_0x0598
            r21 = r9
            android.content.ContentValues r9 = r6.a     // Catch:{ all -> 0x05aa }
            boolean r4 = r4.equals(r9)     // Catch:{ all -> 0x05aa }
            if (r4 == 0) goto L_0x052e
            goto L_0x0538
        L_0x052e:
            java.lang.String r4 = "Contact %d has changed. Updating."
            defpackage.pnz.d(r4, r5)     // Catch:{ all -> 0x05aa }
            java.util.Map r4 = r7.e     // Catch:{ all -> 0x05aa }
            r4.put(r5, r9)     // Catch:{ all -> 0x05aa }
        L_0x0538:
            java.util.Map r4 = r6.c     // Catch:{ all -> 0x05aa }
            java.util.Map r9 = r2.c     // Catch:{ all -> 0x05aa }
            a((defpackage.pmv) r11, (java.util.Map) r4, (java.util.Map) r9)     // Catch:{ all -> 0x05aa }
            java.util.Map r4 = r6.d     // Catch:{ all -> 0x05aa }
            java.util.Map r9 = r2.d     // Catch:{ all -> 0x05aa }
            a((defpackage.pmv) r3, (java.util.Map) r4, (java.util.Map) r9)     // Catch:{ all -> 0x05aa }
            java.util.Map r4 = r6.e     // Catch:{ all -> 0x05aa }
            java.util.Map r9 = r2.e     // Catch:{ all -> 0x05aa }
            a((defpackage.pmv) r14, (java.util.Map) r4, (java.util.Map) r9)     // Catch:{ all -> 0x05aa }
            r0.remove(r5)     // Catch:{ all -> 0x05aa }
            if (r6 == r2) goto L_0x059a
            android.content.ContentValues r4 = r6.a     // Catch:{ all -> 0x05aa }
            android.content.ContentValues r5 = r2.a     // Catch:{ all -> 0x05aa }
            java.lang.String[] r9 = b     // Catch:{ all -> 0x05aa }
            boolean r4 = a((android.content.ContentValues) r4, (android.content.ContentValues) r5, (java.lang.String[]) r9)     // Catch:{ all -> 0x05aa }
            if (r4 != 0) goto L_0x0582
            java.util.Map r4 = r6.c     // Catch:{ all -> 0x05aa }
            java.util.Map r5 = r2.c     // Catch:{ all -> 0x05aa }
            java.lang.String[] r9 = c     // Catch:{ all -> 0x05aa }
            boolean r4 = a((java.util.Map) r4, (java.util.Map) r5, (java.lang.String[]) r9)     // Catch:{ all -> 0x05aa }
            if (r4 != 0) goto L_0x0582
            java.util.Map r4 = r6.d     // Catch:{ all -> 0x05aa }
            java.util.Map r5 = r2.d     // Catch:{ all -> 0x05aa }
            java.lang.String[] r9 = d     // Catch:{ all -> 0x05aa }
            boolean r4 = a((java.util.Map) r4, (java.util.Map) r5, (java.lang.String[]) r9)     // Catch:{ all -> 0x05aa }
            if (r4 != 0) goto L_0x0582
            java.util.Map r4 = r6.e     // Catch:{ all -> 0x05aa }
            java.util.Map r2 = r2.e     // Catch:{ all -> 0x05aa }
            java.lang.String[] r5 = e     // Catch:{ all -> 0x05aa }
            boolean r2 = a((java.util.Map) r4, (java.util.Map) r2, (java.lang.String[]) r5)     // Catch:{ all -> 0x05aa }
            if (r2 == 0) goto L_0x059a
        L_0x0582:
            if (r1 == 0) goto L_0x0587
            r1.a((defpackage.pms) r6)     // Catch:{ all -> 0x05aa }
        L_0x0587:
            r2 = r37
            r6 = r16
            r4 = r19
            r9 = r21
            r19 = r24
            r15 = 1
            r16 = r1
            r1 = r36
            goto L_0x02d1
        L_0x0598:
            r21 = r9
        L_0x059a:
            r2 = r37
            r6 = r16
            r4 = r19
            r9 = r21
            r19 = r24
            r16 = r1
            r1 = r36
            goto L_0x02d1
        L_0x05aa:
            r0 = move-exception
            r8.a()     // Catch:{ all -> 0x05af }
            throw r0     // Catch:{ all -> 0x05af }
        L_0x05af:
            r0 = move-exception
        L_0x05b0:
            r37.endTransaction()
            throw r0
        L_0x05b4:
            r0 = move-exception
            r3.a()
            goto L_0x05ba
        L_0x05b9:
            throw r0
        L_0x05ba:
            goto L_0x05b9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pmw.a(android.database.sqlite.SQLiteDatabase, android.content.res.Resources, boolean, java.util.Collection):android.util.Pair");
    }

    private static String a(Iterable iterable) {
        return a("contact_id", iterable);
    }

    static String a(String str, Iterable iterable) {
        if (iterable == null) {
            return null;
        }
        return String.format(Locale.US, "%s IN (%s)", new Object[]{str, TextUtils.join(",", iterable)});
    }

    private static final void a(pmv pmv, Map map, Map map2) {
        HashSet hashSet = new HashSet(map2.keySet());
        for (Map.Entry entry : map.entrySet()) {
            long longValue = ((Long) entry.getKey()).longValue();
            ContentValues contentValues = (ContentValues) entry.getValue();
            Long valueOf = Long.valueOf(longValue);
            hashSet.remove(valueOf);
            if (!map2.containsKey(valueOf)) {
                pmv.c.add(contentValues);
            } else if (!contentValues.equals(map2.get(valueOf))) {
                pmv.e.put(valueOf, contentValues);
            }
        }
        pmv.d.addAll(hashSet);
    }

    static final boolean a(ContentValues contentValues, ContentValues contentValues2, String[] strArr) {
        if (ius.a(contentValues, contentValues2)) {
            return false;
        }
        if (contentValues == null || contentValues2 == null) {
            return true;
        }
        for (String str : strArr) {
            if (!ius.a(contentValues.get(str), contentValues2.get(str))) {
                return true;
            }
        }
        return false;
    }

    static final boolean a(Map map, Map map2, String[] strArr) {
        if (map == map2) {
            return false;
        }
        if (map.size() == map2.size()) {
            Set<Long> keySet = map.keySet();
            if (keySet.equals(map2.keySet())) {
                for (Long l : keySet) {
                    if (a((ContentValues) map.get(l), (ContentValues) map2.get(l), strArr)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final SharedPreferences a() {
        return this.f.getSharedPreferences("icing_internal_corpora_prefs", 0);
    }

    public final Pair a(SQLiteDatabase sQLiteDatabase, Resources resources) {
        return a(sQLiteDatabase, resources, false, (Collection) null);
    }

    public final Pair a(SQLiteDatabase sQLiteDatabase, Resources resources, Collection collection) {
        return a(sQLiteDatabase, resources, false, collection);
    }
}
