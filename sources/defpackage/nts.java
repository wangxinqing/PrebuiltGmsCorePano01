package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: nts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nts {
    private static final String[] f = {"rmq_id"};
    private static final String[] g = {"rmq_id", "data", "type"};
    protected long a = -1;
    public final Context b;
    final ntq c;
    public final anfc d = amzh.f();
    public final Map e = new nz();
    private final ntq h;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final synchronized int a(defpackage.ntq r11, java.lang.String r12, java.util.List r13) {
        /*
            java.lang.Class<nts> r0 = defpackage.nts.class
            monitor-enter(r0)
            int r1 = r13.size()     // Catch:{ all -> 0x0050 }
            r2 = 0
            if (r1 == 0) goto L_0x004e
            android.database.sqlite.SQLiteDatabase r11 = r11.b()     // Catch:{ all -> 0x0050 }
            if (r11 == 0) goto L_0x004e
            r3 = 0
            r4 = 0
        L_0x0012:
            if (r3 >= r1) goto L_0x004c
            int r5 = r3 + 100
            int r5 = java.lang.Math.min(r5, r1)     // Catch:{ all -> 0x0050 }
            int r6 = r5 - r3
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x0050 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r7.<init>()     // Catch:{ all -> 0x0050 }
            r8 = 0
        L_0x0024:
            if (r3 < r5) goto L_0x0030
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0050 }
            int r5 = r11.delete(r12, r5, r6)     // Catch:{ all -> 0x0050 }
            int r4 = r4 + r5
            goto L_0x0012
        L_0x0030:
            if (r8 > 0) goto L_0x0033
            goto L_0x0038
        L_0x0033:
            java.lang.String r9 = " OR "
            r7.append(r9)     // Catch:{ all -> 0x0050 }
        L_0x0038:
            java.lang.String r9 = "rmq_id=?"
            r7.append(r9)     // Catch:{ all -> 0x0050 }
            int r9 = r8 + 1
            int r10 = r3 + 1
            java.lang.Object r3 = r13.get(r3)     // Catch:{ all -> 0x0050 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0050 }
            r6[r8] = r3     // Catch:{ all -> 0x0050 }
            r8 = r9
            r3 = r10
            goto L_0x0024
        L_0x004c:
            monitor-exit(r0)
            return r4
        L_0x004e:
            monitor-exit(r0)
            return r2
        L_0x0050:
            r11 = move-exception
            monitor-exit(r0)
            goto L_0x0054
        L_0x0053:
            throw r11
        L_0x0054:
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nts.a(ntq, java.lang.String, java.util.List):int");
    }

    private final synchronized long e() {
        SQLiteDatabase a2 = this.c.a();
        long j = 0;
        if (a2 == null) {
            return 0;
        }
        Cursor query = a2.query("outgoingRmqMessages", f, (String) null, (String[]) null, (String) null, (String) null, "rmq_id DESC", "1");
        try {
            if (query.moveToFirst()) {
                j = query.getLong(query.getColumnIndexOrThrow("rmq_id"));
            }
            return j;
        } finally {
            query.close();
        }
    }

    private final synchronized ntq f() {
        return !aekv.a(this.b) ? this.c : this.h;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long b() {
        /*
            r12 = this;
            monitor-enter(r12)
            android.content.Context r0 = r12.b     // Catch:{ all -> 0x0041 }
            boolean r0 = defpackage.aekv.a(r0)     // Catch:{ all -> 0x0041 }
            r1 = 0
            if (r0 != 0) goto L_0x003f
            ntq r0 = r12.c     // Catch:{ all -> 0x0041 }
            android.database.sqlite.SQLiteDatabase r3 = r0.a()     // Catch:{ all -> 0x0041 }
            if (r3 == 0) goto L_0x0038
            java.lang.String r4 = "lastrmqid"
            java.lang.String[] r5 = f     // Catch:{ all -> 0x0041 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r10 = "rmq_id DESC"
            java.lang.String r11 = "1"
            android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0041 }
            boolean r3 = r0.moveToFirst()     // Catch:{ all -> 0x003a }
            if (r3 == 0) goto L_0x0034
            java.lang.String r1 = "rmq_id"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x003a }
            long r1 = r0.getLong(r1)     // Catch:{ all -> 0x003a }
            goto L_0x0035
        L_0x0034:
        L_0x0035:
            r0.close()     // Catch:{ all -> 0x0041 }
        L_0x0038:
            monitor-exit(r12)
            return r1
        L_0x003a:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0041 }
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r12)
            return r1
        L_0x0041:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nts.b():long");
    }

    public final synchronized List c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ntq ntq = this.h;
        if (ntq != null) {
            a(ntq, (List) arrayList);
        }
        if (aekv.b(this.b)) {
            a(this.c, (List) arrayList);
        }
        return arrayList;
    }

    public final synchronized long d() {
        long j;
        j = this.a + 1;
        this.a = j;
        return j;
    }

    public nts(Context context) {
        this.b = context;
        this.c = new ntq(context, "rmq.db");
        ntq ntq = null;
        if (aekv.a() && nrq.a(context)) {
            ntq = new ntq(context.createDeviceProtectedStorageContext(), "rmq.db");
        }
        this.h = ntq;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final synchronized void a(defpackage.ntq r10, java.util.List r11) {
        /*
            java.lang.Class<nts> r0 = defpackage.nts.class
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r2 = r10.a()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x003b
            android.database.sqlite.SQLiteQueryBuilder r1 = new android.database.sqlite.SQLiteQueryBuilder     // Catch:{ all -> 0x003d }
            r1.<init>()     // Catch:{ all -> 0x003d }
            java.lang.String r10 = "s2dRmqIds"
            r1.setTables(r10)     // Catch:{ all -> 0x003d }
            java.lang.String[] r3 = f     // Catch:{ all -> 0x003d }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r8 = "rmq_id ASC"
            r9 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x003d }
            if (r10 == 0) goto L_0x0034
        L_0x0022:
            boolean r1 = r10.moveToNext()     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0031
            r1 = 0
            java.lang.String r1 = r10.getString(r1)     // Catch:{ all -> 0x0036 }
            r11.add(r1)     // Catch:{ all -> 0x0036 }
            goto L_0x0022
        L_0x0031:
            r10.close()     // Catch:{ all -> 0x003d }
        L_0x0034:
            monitor-exit(r0)
            return
        L_0x0036:
            r11 = move-exception
            r10.close()     // Catch:{ all -> 0x003d }
            throw r11     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r0)
            return
        L_0x003d:
            r10 = move-exception
            monitor-exit(r0)
            goto L_0x0041
        L_0x0040:
            throw r10
        L_0x0041:
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nts.a(ntq, java.util.List):void");
    }

    public final synchronized int a(String str, List list) {
        int i;
        i = 0;
        if (list.size() != 0) {
            ntq ntq = this.h;
            if (ntq != null) {
                i = a(ntq, str, list);
            }
            if (aekv.b(this.b)) {
                i += a(this.c, str, list);
            }
        }
        return i;
    }

    public final int a(List list) {
        if (aekv.a(this.b) || list.isEmpty()) {
            return 0;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            synchronized (this.d) {
                ntx ntx = (ntx) this.e.remove(str);
                if (ntx != null) {
                    this.d.remove(ntx);
                }
            }
        }
        Iterator it2 = list.iterator();
        long j = -1;
        while (it2.hasNext()) {
            try {
                long parseLong = Long.parseLong((String) it2.next());
                if (parseLong > j) {
                    j = parseLong;
                }
            } catch (NumberFormatException e2) {
            }
        }
        long j2 = j + 1;
        if (j2 >= this.a) {
            try {
                a(j2);
            } catch (Exception e3) {
            }
        }
        return a("outgoingRmqMessages", list);
    }

    public final void a() {
        if (!aekv.a(this.b) && this.a < 0) {
            if (!aekv.a(this.b)) {
                long e2 = e();
                if (e2 == 0) {
                    e2 = b();
                }
                this.a = e2 + 1;
            }
            a(new ntr());
        }
    }

    public final synchronized void a(long j) {
        SQLiteDatabase b2;
        if (!aekv.a(this.b) && (b2 = this.c.b()) != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_id", 1);
            contentValues.put("rmq_id", Long.valueOf(j));
            b2.replace("lastrmqid", (String) null, contentValues);
        }
    }

    public final synchronized void a(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("rmq_id", str);
                SQLiteDatabase b2 = f().b();
                if (b2 != null) {
                    b2.insert("s2dRmqIds", (String) null, contentValues);
                }
            }
        }
    }

    public final synchronized void a(ntr ntr) {
        SQLiteDatabase a2;
        Cursor query;
        if (!(aekv.a(this.b) || (a2 = this.c.a()) == null || (query = a2.query("outgoingRmqMessages", g, "type!=0", (String[]) null, (String) null, (String) null, "rmq_id ASC", (String) null)) == null)) {
            int columnIndex = query.getColumnIndex("data");
            int columnIndex2 = query.getColumnIndex("rmq_id");
            synchronized (this.d) {
                this.e.clear();
                this.d.clear();
                while (query.moveToNext()) {
                    try {
                        long j = query.getLong(columnIndex2);
                        amnc amnc = (amnc) nuu.a((byte) 8, query.getBlob(columnIndex));
                        ntr.a(j, amnc);
                        ntx a3 = ntx.a(amnc);
                        a(a3);
                        this.e.put(amnc.h, a3);
                    } catch (IOException e2) {
                        Log.w("GCM", "Found invalid message in the RMQ");
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                query.close();
            }
        }
    }

    public final synchronized boolean a(long j, amnc amnc) {
        SQLiteDatabase b2 = this.c.b();
        if (b2 == null) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rmq_id", Long.valueOf(j));
        contentValues.put("data", amnc.k());
        contentValues.put("type", (byte) 8);
        long insert = b2.insert("outgoingRmqMessages", (String) null, contentValues);
        synchronized (this.d) {
            this.e.put(amnc.h, ntx.a(amnc));
        }
        if (insert >= 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(ntx ntx) {
        synchronized (this.d) {
            if (((long) this.d.a(ntx)) >= axlc.a.a().ab()) {
                return false;
            }
            this.d.add(ntx);
            return true;
        }
    }
}
