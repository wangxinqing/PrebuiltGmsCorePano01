package defpackage;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: cjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cjr {
    public static final Set b;
    public final HashMap a;

    static {
        HashSet hashSet = new HashSet();
        b = hashSet;
        hashSet.add(10002);
    }

    protected cjr() {
        if (cbi.m().a("ContextManagerStore") == null) {
            byte[] bArr = new byte[32];
            new bxq().a.nextBytes(bArr);
            bxr m = cbi.m();
            iva.c("ContextManagerStore");
            if (m.a("ContextManagerStore") != null) {
                juk juk = new juk((bsz) null);
                juu juu = new juu();
                juu.b();
                TimeFilterImpl a2 = juu.a();
                juo juo = new juo();
                juo.a("ContextManagerStore");
                juk.a(4, a2, juo.a());
                cbi.q().b(juk.a());
                m.a.remove("ContextManagerStore");
            }
            aucd o = atpa.c.o();
            auay a3 = auay.a(bArr);
            if (o.c) {
                o.c();
                o.c = false;
            }
            atpa atpa = (atpa) o.b;
            a3.getClass();
            atpa.a |= 1;
            atpa.b = a3;
            atpa atpa2 = (atpa) o.i();
            juh juh = new juh((bsz) null, 4);
            juh.a(atpa2.k());
            juh.a(jun.a("ContextManagerStore", (String) null, (String) null));
            cbi.q().a(juh.a());
            m.a.put("ContextManagerStore", atpa2);
        }
        this.a = new HashMap();
    }

    private final long a(ContextData contextData, SQLiteDatabase sQLiteDatabase) {
        long j;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", contextData.d());
        contentValues.put("context_name", Integer.valueOf(contextData.g()));
        contentValues.put("context_family", Integer.valueOf(contextData.f()));
        contentValues.put("module_id", contextData.e().c());
        contentValues.put("version", Integer.valueOf(contextData.e().b()));
        ciw.a(contentValues, contextData.j());
        contentValues.put("proto_blob", contextData.b());
        ciw.a(contentValues, contextData.l());
        long a2 = cbi.i().a();
        contentValues.put("sync_state", 0);
        contentValues.put("sync_state_mod_time_millis", Long.valueOf(a2));
        byte[] a3 = cbi.m().a("ContextManagerStore");
        try {
            byte[] b2 = contextData.b();
            byte[] doFinal = bxp.a(1, a3).doFinal(b2);
            bxp.a++;
            bxp.b += (long) b2.length;
            bxp.c += (long) doFinal.length;
            contentValues.put("proto_blob", doFinal);
        } catch (GeneralSecurityException e) {
            ((anih) ((anih) bxk.a.b()).a("cjr", "a", 98, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StoreReadWrite] Could not encrypt context");
        }
        try {
            j = sQLiteDatabase2.insertOrThrow("context", (String) null, contentValues);
        } catch (SQLException e2) {
            new Object[1][0] = Integer.valueOf(contextData.g());
            j = -1;
        }
        if (j != -1) {
            return j;
        }
        ArrayList a4 = a(sQLiteDatabase, "context", contextData.d(), "_id", "context_id", "version");
        if (jir.a((Collection) a4)) {
            return -1;
        }
        if (a4.size() > 1) {
            ((anih) ((anih) bxk.a.b()).a("cjr", "a", 128, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StoreReadWrite] More than one row with same id in context table. This is impossible.");
        }
        int b3 = contextData.e().b();
        cjq cjq = (cjq) a4.get(0);
        if (cjq.b >= b3) {
            return cjq.a;
        }
        try {
            return sQLiteDatabase2.insertWithOnConflict("context", (String) null, contentValues, 5);
        } catch (SQLException e3) {
            new Object[1][0] = Integer.valueOf(contextData.g());
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ae, code lost:
        if (r2 != null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d8, code lost:
        if (r2 != null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00da, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00dd, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList b(com.google.android.gms.contextmanager.internal.ContextDataFilterImpl r20, defpackage.bsz r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r5 = "cjr"
            java.lang.String r6 = "b"
            java.lang.String r7 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r8 = r19
            boolean r9 = r8.a(r1)
            if (r9 == 0) goto L_0x00e5
            java.lang.String r9 = defpackage.cjp.a((com.google.android.gms.contextmanager.internal.ContextDataFilterImpl) r20)
            java.lang.String r10 = "start_time"
            java.lang.String r17 = defpackage.cjp.a((defpackage.jxo) r0, (java.lang.String) r10)
            java.lang.String r18 = defpackage.cjp.a((defpackage.jxo) r20)
            java.lang.String[] r12 = new java.lang.String[r2]
            java.lang.String r0 = "proto_blob"
            r12[r4] = r0
            r2 = 0
            civ r0 = defpackage.cbi.o()     // Catch:{ SQLException -> 0x00bb, GeneralSecurityException -> 0x00b9, all -> 0x00b7 }
            bsx r10 = defpackage.cbi.y()     // Catch:{ SQLException -> 0x00bb, GeneralSecurityException -> 0x00b9, all -> 0x00b7 }
            r10.a((defpackage.bsz) r1)     // Catch:{ SQLException -> 0x00bb, GeneralSecurityException -> 0x00b9, all -> 0x00b7 }
            cis r0 = r0.a     // Catch:{ SQLException -> 0x00bb, GeneralSecurityException -> 0x00b9, all -> 0x00b7 }
            jjj r0 = r0.a((defpackage.bsz) r1)     // Catch:{ SQLException -> 0x00bb, GeneralSecurityException -> 0x00b9, all -> 0x00b7 }
            android.database.sqlite.SQLiteDatabase r10 = r0.getReadableDatabase()     // Catch:{ SQLException -> 0x00bb, GeneralSecurityException -> 0x00b9, all -> 0x00b7 }
            java.lang.String r11 = "context"
            r14 = 0
            r15 = 0
            r16 = 0
            r13 = r9
            android.database.Cursor r2 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLException -> 0x00bb, GeneralSecurityException -> 0x00b9, all -> 0x00b7 }
        L_0x0052:
            boolean r0 = r2.moveToNext()     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            if (r0 == 0) goto L_0x00ae
            byte[] r0 = r2.getBlob(r4)     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            if (r0 == 0) goto L_0x0098
            bxr r1 = defpackage.cbi.m()     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            java.lang.String r10 = "ContextManagerStore"
            byte[] r1 = r1.a(r10)     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            r10 = 2
            javax.crypto.Cipher r1 = defpackage.bxp.a(r10, r1)     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            byte[] r0 = r1.doFinal(r0)     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            com.google.android.gms.contextmanager.ContextData r1 = new com.google.android.gms.contextmanager.ContextData     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            r1.<init>((byte[]) r0)     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            r1.c()     // Catch:{ IllegalStateException -> 0x007d }
            r3.add(r1)     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            goto L_0x0052
        L_0x007d:
            r0 = move-exception
            r1 = r0
            jjg r0 = defpackage.bxk.a     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            anie r0 = r0.b()     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            anih r0 = (defpackage.anih) r0     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            r0.a((java.lang.Throwable) r1)     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            r1 = 252(0xfc, float:3.53E-43)
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r6, (int) r1, (java.lang.String) r7)     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            anih r0 = (defpackage.anih) r0     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            java.lang.String r1 = "[StoreReadWrite] Could not deserialize stored context."
            r0.a((java.lang.String) r1)     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            goto L_0x0052
        L_0x0098:
            jjg r0 = defpackage.bxk.a     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            anie r0 = r0.b()     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            anih r0 = (defpackage.anih) r0     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            r1 = 238(0xee, float:3.34E-43)
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r6, (int) r1, (java.lang.String) r7)     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            anih r0 = (defpackage.anih) r0     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            java.lang.String r1 = "[StoreReadWrite] ContextData proto bytes are null on read for query %s."
            r0.a((java.lang.String) r1, (java.lang.Object) r9)     // Catch:{ SQLException -> 0x00b5, GeneralSecurityException -> 0x00b3, all -> 0x00b1 }
            goto L_0x0052
        L_0x00ae:
            if (r2 == 0) goto L_0x00dd
            goto L_0x00da
        L_0x00b1:
            r0 = move-exception
            goto L_0x00df
        L_0x00b3:
            r0 = move-exception
            goto L_0x00bc
        L_0x00b5:
            r0 = move-exception
            goto L_0x00bc
        L_0x00b7:
            r0 = move-exception
            goto L_0x00df
        L_0x00b9:
            r0 = move-exception
            goto L_0x00bc
        L_0x00bb:
            r0 = move-exception
        L_0x00bc:
            jjg r1 = defpackage.bxk.a     // Catch:{ all -> 0x00de }
            anie r1 = r1.b()     // Catch:{ all -> 0x00de }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x00de }
            r1.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00de }
            r4 = 258(0x102, float:3.62E-43)
            anie r1 = r1.a((java.lang.String) r5, (java.lang.String) r6, (int) r4, (java.lang.String) r7)     // Catch:{ all -> 0x00de }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x00de }
            java.lang.String r4 = "[StoreReadWrite]  %s"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00de }
            r1.a((java.lang.String) r4, (java.lang.Object) r0)     // Catch:{ all -> 0x00de }
            if (r2 == 0) goto L_0x00dd
        L_0x00da:
            r2.close()
        L_0x00dd:
            return r3
        L_0x00de:
            r0 = move-exception
        L_0x00df:
            if (r2 == 0) goto L_0x00e4
            r2.close()
        L_0x00e4:
            throw r0
        L_0x00e5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjr.b(com.google.android.gms.contextmanager.internal.ContextDataFilterImpl, bsz):java.util.ArrayList");
    }

    private final long a(List list, SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (a((ContextData) it.next(), sQLiteDatabase) == -1) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (SQLiteException | IllegalStateException e) {
                        anih anih = (anih) bxk.a.b();
                        anih.a((Throwable) e);
                        ((anih) anih.a("cjr", "a", 386, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StoreReadWrite]  %s", (Object) e.getMessage());
                    }
                    return -1;
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            try {
                sQLiteDatabase.endTransaction();
                return 1;
            } catch (SQLiteException | IllegalStateException e2) {
                anih anih2 = (anih) bxk.a.b();
                anih2.a((Throwable) e2);
                ((anih) anih2.a("cjr", "a", 386, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StoreReadWrite]  %s", (Object) e2.getMessage());
                return 1;
            }
        } catch (SQLException e3) {
            anih anih3 = (anih) bxk.a.b();
            anih3.a((Throwable) e3);
            ((anih) anih3.a("cjr", "a", 380, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StoreReadWrite]  %s", (Object) e3.getMessage());
            try {
                sQLiteDatabase.endTransaction();
            } catch (SQLiteException | IllegalStateException e4) {
                anih anih4 = (anih) bxk.a.b();
                anih4.a((Throwable) e4);
                ((anih) anih4.a("cjr", "a", 386, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StoreReadWrite]  %s", (Object) e4.getMessage());
            }
            return -1;
        } catch (Throwable th) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (SQLiteException | IllegalStateException e5) {
                anih anih5 = (anih) bxk.a.b();
                anih5.a((Throwable) e5);
                ((anih) anih5.a("cjr", "a", 386, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StoreReadWrite]  %s", (Object) e5.getMessage());
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        r2 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0052 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.ArrayList a(android.database.sqlite.SQLiteDatabase r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r14 = this;
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]
            r0 = 0
            r3[r0] = r18
            r9 = 1
            r3[r9] = r20
            java.lang.String r10 = "cjr"
            java.lang.String r11 = "a"
            java.lang.String r12 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r13 = 0
            defpackage.cji.b()     // Catch:{ SQLException -> 0x005b, all -> 0x0059 }
            cjh r1 = defpackage.cji.a()     // Catch:{ SQLException -> 0x005b, all -> 0x0059 }
            r2 = r17
            r4 = r19
            r1.a(r4, r2, r9)     // Catch:{ SQLException -> 0x005b, all -> 0x0059 }
            java.lang.String r4 = r1.b()     // Catch:{ SQLException -> 0x005b, all -> 0x0059 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r15
            r2 = r16
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLException -> 0x005b, all -> 0x0059 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLException -> 0x0055, all -> 0x0052 }
            r2.<init>()     // Catch:{ SQLException -> 0x0055, all -> 0x0052 }
        L_0x0032:
            boolean r3 = r1.moveToNext()     // Catch:{ SQLException -> 0x0050, all -> 0x0052 }
            if (r3 == 0) goto L_0x0049
            long r3 = r1.getLong(r0)     // Catch:{ SQLException -> 0x0050, all -> 0x0052 }
            int r5 = r1.getInt(r9)     // Catch:{ SQLException -> 0x0050, all -> 0x0052 }
            cjq r6 = new cjq     // Catch:{ SQLException -> 0x0050, all -> 0x0052 }
            r6.<init>(r3, r5)     // Catch:{ SQLException -> 0x0050, all -> 0x0052 }
            r2.add(r6)     // Catch:{ SQLException -> 0x0050, all -> 0x0052 }
            goto L_0x0032
        L_0x0049:
            if (r1 != 0) goto L_0x004c
            goto L_0x007b
        L_0x004c:
            r1.close()
            return r2
        L_0x0050:
            r0 = move-exception
            goto L_0x0057
        L_0x0052:
            r0 = move-exception
            r13 = r1
            goto L_0x0081
        L_0x0055:
            r0 = move-exception
            r2 = r13
        L_0x0057:
            r13 = r1
            goto L_0x005d
        L_0x0059:
            r0 = move-exception
            goto L_0x0081
        L_0x005b:
            r0 = move-exception
            r2 = r13
        L_0x005d:
            jjg r1 = defpackage.bxk.a     // Catch:{ all -> 0x0080 }
            anie r1 = r1.b()     // Catch:{ all -> 0x0080 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0080 }
            r1.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0080 }
            r3 = 420(0x1a4, float:5.89E-43)
            anie r1 = r1.a((java.lang.String) r10, (java.lang.String) r11, (int) r3, (java.lang.String) r12)     // Catch:{ all -> 0x0080 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0080 }
            java.lang.String r3 = "[StoreReadWrite] %s"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0080 }
            r1.a((java.lang.String) r3, (java.lang.Object) r0)     // Catch:{ all -> 0x0080 }
            if (r13 != 0) goto L_0x007c
        L_0x007b:
            return r2
        L_0x007c:
            r13.close()
            return r2
        L_0x0080:
            r0 = move-exception
        L_0x0081:
            if (r13 == 0) goto L_0x0086
            r13.close()
        L_0x0086:
            goto L_0x0088
        L_0x0087:
            throw r0
        L_0x0088:
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjr.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public static List a(bsz bsz, HashMap hashMap) {
        ArrayList arrayList = (ArrayList) hashMap.get(bsz);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        hashMap.put(bsz, arrayList2);
        return arrayList2;
    }

    public final int a(ContextDataFilterImpl contextDataFilterImpl, bsz bsz) {
        a(bsz);
        try {
            return cbi.o().a(bsz).delete("context", cjp.a(contextDataFilterImpl), (String[]) null);
        } catch (SQLException e) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("cjr", "a", 162, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StoreReadWrite]  %s", (Object) e.getMessage());
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public final int a(String str, String str2, String[] strArr, int i, long j, bsz bsz) {
        iva.b(ContextData.a(i));
        cji.b();
        cjh a2 = cji.a();
        a2.a(str2, (Object[]) strArr);
        String b2 = a2.b();
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_state", Integer.valueOf(i));
        contentValues.put("sync_state_mod_time_millis", Long.valueOf(j));
        try {
            return cbi.o().a(bsz).update(str, contentValues, b2, (String[]) null);
        } catch (SQLException e) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("cjr", "a", 309, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StoreReadWrite]  %s", (Object) e.getMessage());
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public final int a(Collection collection, int i, long j, bsz bsz) {
        int i2 = 0;
        if (collection != null && !collection.isEmpty()) {
            String[] strArr = new String[collection.size()];
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                strArr[i2] = ((ContextData) it.next()).d();
                i2++;
            }
            return a("context", "context_id", strArr, i, j, bsz);
        }
        ((anih) ((anih) bxk.a.c()).a("cjr", "a", 275, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StoreReadWrite] Empty context data batch to update syncState to %s", (Object) Integer.toString(i));
        return 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(com.google.android.gms.contextmanager.ContextData r4, defpackage.bsz r5) {
        /*
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.util.HashMap r0 = r3.a
            java.util.List r0 = a((defpackage.bsz) r5, (java.util.HashMap) r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r4)
            java.util.HashMap r4 = r3.a
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x0040
            java.util.Iterator r4 = r4.iterator()
        L_0x001f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r0 = r4.next()
            com.google.android.gms.contextmanager.ContextData r0 = (com.google.android.gms.contextmanager.ContextData) r0
            java.util.Set r1 = b
            int r0 = r0.g()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x001f
            boolean r4 = r3.a(r5)
            goto L_0x005b
        L_0x0040:
            java.util.HashMap r4 = r3.a
            java.util.List r4 = a((defpackage.bsz) r5, (java.util.HashMap) r4)
            int r4 = r4.size()
            awuz r0 = defpackage.awuz.a
            awva r0 = r0.a()
            long r0 = r0.r()
            int r1 = (int) r0
            if (r4 < r1) goto L_0x007b
            boolean r4 = r3.a(r5)
        L_0x005b:
            if (r4 != 0) goto L_0x007b
            jjg r4 = defpackage.bxk.a
            anie r4 = r4.b()
            anih r4 = (defpackage.anih) r4
            r5 = 83
            java.lang.String r0 = "cjr"
            java.lang.String r1 = "a"
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r4 = r4.a((java.lang.String) r0, (java.lang.String) r1, (int) r5, (java.lang.String) r2)
            anih r4 = (defpackage.anih) r4
            java.lang.String r5 = "[StoreReadWrite] Cache flush failed when writing to database in insert."
            r4.a((java.lang.String) r5)
            r4 = -1
            return r4
        L_0x007b:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjr.a(com.google.android.gms.contextmanager.ContextData, bsz):long");
    }

    public final boolean a(bsz bsz) {
        HashMap hashMap;
        try {
            if (a(a(bsz, this.a), cbi.o().a(bsz)) != 1) {
                ((anih) ((anih) bxk.a.b()).a("cjr", "a", 333, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StoreReadWrite] Context Cache flush failed for account: %s", (Object) bsz);
                hashMap = this.a;
                hashMap.remove(bsz);
                return false;
            }
            this.a.remove(bsz);
            return true;
        } catch (SQLException e) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("cjr", "a", 337, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StoreReadWrite]  %s", (Object) e.getMessage());
            hashMap = this.a;
        } catch (Throwable th) {
            this.a.remove(bsz);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str, bsz bsz) {
        a(bsz);
        cji.b();
        cjh a2 = cji.a();
        a2.a("context_id", str, true);
        try {
            if (cbi.o().a(bsz).delete("context", a2.b(), (String[]) null) > 0) {
                return true;
            }
            return false;
        } catch (SQLException e) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("cjr", "a", 185, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StoreReadWrite]  %s", (Object) e.getMessage());
            return false;
        }
    }
}
