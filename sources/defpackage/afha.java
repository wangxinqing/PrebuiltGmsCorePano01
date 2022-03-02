package defpackage;

import android.accounts.Account;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.Map;
import java.util.Set;

/* renamed from: afha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afha implements afhn {
    private final awdn a;
    private final awdn b;
    private final aeri c;
    private final Map d;
    private final awdn e;
    private final awdn f;
    private final awdn g;
    private final afbx h;
    private final Object i = new Object();
    private Set j;
    private final afcx k;
    private final afca l;

    public afha(awdn awdn, awdn awdn2, aeri aeri, afcx afcx, Map map, awdn awdn3, awdn awdn4, awdn awdn5, afbx afbx, afca afca) {
        this.a = awdn;
        this.b = awdn2;
        this.c = aeri;
        this.k = afcx;
        this.d = map;
        this.e = awdn3;
        this.f = awdn4;
        this.h = afbx;
        this.l = afca;
        this.g = awdn5;
    }

    private final String a(aukh aukh) {
        return ((aerh) this.d.get(aukg.a(aukh.a))).a(aukh);
    }

    private final Map b(auke auke) {
        anab h2 = anaf.h();
        aucx aucx = auke.a;
        int size = aucx.size();
        for (int i2 = 0; i2 < size; i2++) {
            aukd aukd = (aukd) aucx.get(i2);
            aukh aukh = aukd.c;
            if (aukh == null) {
                aukh = aukh.c;
            }
            if (aukg.a(aukh.a) == aukg.CHANNELID_NOT_SET) {
                ((pia) this.a.a()).c("Skipping wipeout for unknown channel", new Object[0]);
            } else if (!this.d.containsKey(aukg.a(aukh.a))) {
                ((pia) this.a.a()).d("Skipping wipeout for unsupported channel: ", aukg.a(aukh.a));
            } else {
                h2.a(a(aukh), aukd);
            }
        }
        return h2.a();
    }

    private final boolean c(Account account, aukh aukh) {
        try {
            ((affw) this.f.a()).a(aukh, account);
            ((aerj) ((Map) this.g.a()).get(aukg.a(aukh.a))).a(account, aukh);
            for (afdx a2 : ((afeb) this.e.a()).a(account, aukh)) {
                ((afeb) this.e.a()).a(a2.a(), account, aukh, afdz.WIPEOUT);
            }
            return true;
        } catch (Exception e2) {
            pia pia = (pia) this.a.a();
            ((pia) this.a.a()).e("Failed to wipe local state", new Object[0]);
            a(e2);
            return false;
        }
    }

    private final void a() {
        if (this.c.f()) {
            this.l.a();
            return;
        }
        try {
            this.h.a();
        } catch (afdm e2) {
            ((pia) this.a.a()).e("Failed to clear wipeout metadata", new Object[0]);
            a((Exception) e2);
        }
    }

    private final void a(Exception exc) {
        ((pdg) this.b.a()).a("MDH wipeout failure", exc);
    }

    public final void a(Account account, aukh aukh) {
        Object obj;
        Cursor query;
        Throwable th;
        Cursor query2;
        Throwable th2;
        Account account2 = account;
        aukh aukh2 = aukh;
        if (!this.c.u()) {
            String a2 = a(aukh2);
            try {
                SQLiteDatabase c2 = this.k.c();
                c2.beginTransaction();
                try {
                    query2 = c2.query("wipeout", new String[]{"last_sync_timestamp"}, "account = ? AND channel_key = ?", new String[]{account2.name, a2}, (String) null, (String) null, (String) null);
                    if (query2 == null) {
                        ((pia) this.a.a()).e("Query to %s returned null cursor.", "wipeout");
                        a();
                        a((Exception) new NullPointerException("Cursor is null"));
                        c2.endTransaction();
                        return;
                    }
                    if (!query2.moveToFirst()) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("account", account2.name);
                        contentValues.put("channel_key", a2);
                        contentValues.put("channel_id", aukh.k());
                        contentValues.put("last_sync_timestamp", Long.valueOf(System.currentTimeMillis()));
                        c2.insert("wipeout", (String) null, contentValues);
                    } else if (query2.isNull(0)) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("last_sync_timestamp", Long.valueOf(System.currentTimeMillis()));
                        c2.update("wipeout", contentValues2, "account = ? AND channel_key = ?", new String[]{account2.name, a2});
                    }
                    c2.setTransactionSuccessful();
                    query2.close();
                    c2.endTransaction();
                    return;
                } catch (SQLiteException e2) {
                    try {
                        ((pia) this.a.a()).e("Failed to mark remote data persisted", new Object[0]);
                        if (this.c.t()) {
                            a();
                            a((Exception) e2);
                        } else {
                            throw e2;
                        }
                    } catch (Throwable th3) {
                        c2.endTransaction();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    apev.a(th2, th4);
                }
            } catch (afdm e3) {
                ((pia) this.a.a()).e("Failed to mark remote data persisted", new Object[0]);
                a();
                a((Exception) e3);
                return;
            }
        } else {
            String a3 = a(aukh2);
            try {
                SQLiteDatabase c3 = this.k.c();
                try {
                    Object obj2 = this.i;
                    synchronized (obj2) {
                        try {
                            Set set = this.j;
                            if (set != null) {
                                set.add(afgy.a(account2, a3));
                            }
                            c3.beginTransaction();
                            try {
                                obj = obj2;
                                try {
                                    query = c3.query("wipeout", new String[]{"last_sync_timestamp"}, "account = ? AND channel_key = ?", new String[]{account2.name, a3}, (String) null, (String) null, (String) null);
                                    if (query != null) {
                                        if (!query.moveToFirst()) {
                                            ContentValues contentValues3 = new ContentValues();
                                            contentValues3.put("account", account2.name);
                                            contentValues3.put("channel_key", a3);
                                            contentValues3.put("channel_id", aukh.k());
                                            contentValues3.put("last_sync_timestamp", Long.valueOf(System.currentTimeMillis()));
                                            c3.insert("wipeout", (String) null, contentValues3);
                                        } else if (query.isNull(0)) {
                                            ContentValues contentValues4 = new ContentValues();
                                            contentValues4.put("last_sync_timestamp", Long.valueOf(System.currentTimeMillis()));
                                            c3.update("wipeout", contentValues4, "account = ? AND channel_key = ?", new String[]{account2.name, a3});
                                        }
                                        c3.setTransactionSuccessful();
                                        query.close();
                                        c3.endTransaction();
                                        return;
                                    }
                                    throw new SQLiteException("Cursor is null");
                                } catch (Throwable th5) {
                                    th = th5;
                                    c3.endTransaction();
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                obj = obj2;
                                c3.endTransaction();
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            throw th;
                        }
                    }
                } catch (SQLiteException e4) {
                    ((pia) this.a.a()).e("Failed to mark remote data persisted", new Object[0]);
                    if (this.c.t()) {
                        a();
                        a((Exception) e4);
                        return;
                    }
                    throw e4;
                }
            } catch (afdm e5) {
                ((pia) this.a.a()).e("Failed to mark remote data persisted", new Object[0]);
                a();
                a((Exception) e5);
                return;
            }
        }
        throw th;
        throw th2;
    }

    public final void b(Account account, aukh aukh) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_sync_timestamp", Long.valueOf(System.currentTimeMillis()));
        if (!this.c.u()) {
            String a2 = a(aukh);
            try {
                SQLiteDatabase c2 = this.k.c();
                c2.beginTransaction();
                try {
                    if (c2.update("wipeout", contentValues, "account = ? AND channel_key = ?", new String[]{account.name, a2}) == 0) {
                        ContentValues contentValues2 = new ContentValues(contentValues);
                        contentValues2.put("account", account.name);
                        contentValues2.put("channel_key", a2);
                        contentValues2.put("channel_id", aukh.k());
                        c2.insert("wipeout", (String) null, contentValues2);
                    }
                    c2.setTransactionSuccessful();
                } catch (SQLiteException e2) {
                    ((pia) this.a.a()).e("Failed to update wipeout data", new Object[0]);
                    if (this.c.t()) {
                        a();
                        a((Exception) e2);
                    } else {
                        throw e2;
                    }
                } catch (Throwable th) {
                    c2.endTransaction();
                    throw th;
                }
                c2.endTransaction();
            } catch (afdm e3) {
                ((pia) this.a.a()).e("Failed to update wipeout data", e3, new Object[0]);
                a();
                a((Exception) e3);
            }
        } else {
            String a3 = a(aukh);
            try {
                SQLiteDatabase c3 = this.k.c();
                try {
                    synchronized (this.i) {
                        Set set = this.j;
                        if (set != null) {
                            set.add(afgy.a(account, a3));
                        }
                        try {
                            c3.beginTransaction();
                            if (c3.update("wipeout", contentValues, "account = ? AND channel_key = ?", new String[]{account.name, a3}) == 0) {
                                ContentValues contentValues3 = new ContentValues(contentValues);
                                contentValues3.put("account", account.name);
                                contentValues3.put("channel_key", a3);
                                contentValues3.put("channel_id", aukh.k());
                                c3.insert("wipeout", (String) null, contentValues3);
                            }
                            c3.setTransactionSuccessful();
                        } finally {
                            c3.endTransaction();
                        }
                    }
                } catch (SQLiteException e4) {
                    ((pia) this.a.a()).e("Failed to update wipeout data", new Object[0]);
                    if (this.c.t()) {
                        a();
                        a((Exception) e4);
                        return;
                    }
                    throw e4;
                }
            } catch (afdm e5) {
                ((pia) this.a.a()).e("Failed to update wipeout data", e5, new Object[0]);
                a();
                a((Exception) e5);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008a, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        ((defpackage.pia) r14.a.a()).e("Failed to parse channel id proto.", r15, new java.lang.Object[0]);
        a();
        a((java.lang.Exception) r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cc, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cd, code lost:
        if (r2 != null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d7, code lost:
        throw r15;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x002d, B:15:0x007a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.auke r15) {
        /*
            r14 = this;
            java.lang.String r0 = "Failed to enforce wipeout policy"
            r1 = 0
            afcx r2 = r14.k     // Catch:{ afdm -> 0x00f6 }
            android.database.sqlite.SQLiteDatabase r3 = r2.a()     // Catch:{ afdm -> 0x00f6 }
            java.lang.String r4 = "wipeout"
            r2 = 4
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00d8 }
            java.lang.String r2 = "account"
            r5[r1] = r2     // Catch:{ SQLiteException -> 0x00d8 }
            java.lang.String r2 = "channel_key"
            r11 = 1
            r5[r11] = r2     // Catch:{ SQLiteException -> 0x00d8 }
            java.lang.String r2 = "last_sync_timestamp"
            r12 = 2
            r5[r12] = r2     // Catch:{ SQLiteException -> 0x00d8 }
            java.lang.String r2 = "channel_id"
            r13 = 3
            r5[r13] = r2     // Catch:{ SQLiteException -> 0x00d8 }
            java.lang.String r6 = "last_sync_timestamp IS NOT NULL"
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00d8 }
            if (r2 != 0) goto L_0x004e
            awdn r15 = r14.a     // Catch:{ all -> 0x00cc }
            java.lang.Object r15 = r15.a()     // Catch:{ all -> 0x00cc }
            pia r15 = (defpackage.pia) r15     // Catch:{ all -> 0x00cc }
            java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ all -> 0x00cc }
            java.lang.String r4 = "wipeout"
            r3[r1] = r4     // Catch:{ all -> 0x00cc }
            java.lang.String r4 = "Query to %s returned null cursor."
            r15.e(r4, r3)     // Catch:{ all -> 0x00cc }
            r14.a()     // Catch:{ all -> 0x00cc }
            java.lang.NullPointerException r15 = new java.lang.NullPointerException     // Catch:{ all -> 0x00cc }
            java.lang.String r3 = "Cursor is null"
            r15.<init>(r3)     // Catch:{ all -> 0x00cc }
            r14.a((java.lang.Exception) r15)     // Catch:{ all -> 0x00cc }
            return
        L_0x004e:
            java.util.Map r15 = r14.b(r15)     // Catch:{ all -> 0x00cc }
            r2.moveToFirst()     // Catch:{ all -> 0x00cc }
        L_0x0055:
            boolean r3 = r2.isAfterLast()     // Catch:{ all -> 0x00cc }
            if (r3 != 0) goto L_0x00c8
            android.accounts.Account r3 = new android.accounts.Account     // Catch:{ all -> 0x00cc }
            java.lang.String r4 = r2.getString(r1)     // Catch:{ all -> 0x00cc }
            java.lang.String r5 = "com.google"
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00cc }
            java.lang.String r4 = r2.getString(r11)     // Catch:{ all -> 0x00cc }
            java.lang.Object r4 = r15.get(r4)     // Catch:{ all -> 0x00cc }
            aukd r4 = (defpackage.aukd) r4     // Catch:{ all -> 0x00cc }
            long r5 = r2.getLong(r12)     // Catch:{ all -> 0x00cc }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00cc }
            if (r4 != 0) goto L_0x00a4
            byte[] r4 = r2.getBlob(r13)     // Catch:{ auda -> 0x008a }
            aukh r5 = defpackage.aukh.c     // Catch:{ auda -> 0x008a }
            aucj r4 = defpackage.aucj.a((defpackage.aucj) r5, (byte[]) r4)     // Catch:{ auda -> 0x008a }
            aukh r4 = (defpackage.aukh) r4     // Catch:{ auda -> 0x008a }
            r14.c(r3, r4)     // Catch:{ auda -> 0x008a }
            goto L_0x00c4
        L_0x008a:
            r15 = move-exception
            awdn r3 = r14.a     // Catch:{ all -> 0x00cc }
            java.lang.Object r3 = r3.a()     // Catch:{ all -> 0x00cc }
            pia r3 = (defpackage.pia) r3     // Catch:{ all -> 0x00cc }
            java.lang.String r4 = "Failed to parse channel id proto."
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x00cc }
            r3.e(r4, r15, r5)     // Catch:{ all -> 0x00cc }
            r14.a()     // Catch:{ all -> 0x00cc }
            r14.a((java.lang.Exception) r15)     // Catch:{ all -> 0x00cc }
            r2.close()     // Catch:{ SQLiteException -> 0x00d8 }
            return
        L_0x00a4:
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00cc }
            long r8 = r5.longValue()     // Catch:{ all -> 0x00cc }
            long r6 = r6 - r8
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ all -> 0x00cc }
            int r8 = r4.f     // Catch:{ all -> 0x00cc }
            long r8 = (long) r8     // Catch:{ all -> 0x00cc }
            long r8 = r5.toMillis(r8)     // Catch:{ all -> 0x00cc }
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x00c4
            aukh r4 = r4.c     // Catch:{ all -> 0x00cc }
            if (r4 == 0) goto L_0x00bf
            goto L_0x00c1
        L_0x00bf:
            aukh r4 = defpackage.aukh.c     // Catch:{ all -> 0x00cc }
        L_0x00c1:
            r14.c(r3, r4)     // Catch:{ all -> 0x00cc }
        L_0x00c4:
            r2.moveToNext()     // Catch:{ all -> 0x00cc }
            goto L_0x0055
        L_0x00c8:
            r2.close()     // Catch:{ SQLiteException -> 0x00d8 }
            return
        L_0x00cc:
            r15 = move-exception
            if (r2 == 0) goto L_0x00d7
            r2.close()     // Catch:{ all -> 0x00d3 }
            goto L_0x00d7
        L_0x00d3:
            r2 = move-exception
            defpackage.apev.a((java.lang.Throwable) r15, (java.lang.Throwable) r2)     // Catch:{ SQLiteException -> 0x00d8 }
        L_0x00d7:
            throw r15     // Catch:{ SQLiteException -> 0x00d8 }
        L_0x00d8:
            r15 = move-exception
            awdn r2 = r14.a
            java.lang.Object r2 = r2.a()
            pia r2 = (defpackage.pia) r2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2.e(r0, r1)
            aeri r0 = r14.c
            boolean r0 = r0.t()
            if (r0 == 0) goto L_0x00f5
            r14.a()
            r14.a((java.lang.Exception) r15)
            return
        L_0x00f5:
            throw r15
        L_0x00f6:
            r15 = move-exception
            awdn r2 = r14.a
            java.lang.Object r2 = r2.a()
            pia r2 = (defpackage.pia) r2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2.e(r0, r1)
            r14.a()
            r14.a((java.lang.Exception) r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afha.a(auke):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0173, code lost:
        r3 = r1.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0175, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r11.removeAll(r1.j);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r4 = r1.k.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r4.beginTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r0 = r11.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x018c, code lost:
        if (r0.hasNext() == false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x018e, code lost:
        r5 = (defpackage.afgy) r0.next();
        r4.delete("wipeout", "account = ? AND channel_key = ?", new java.lang.String[]{r5.a().name, r5.b()});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01ac, code lost:
        r4.setTransactionSuccessful();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        r4.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        ((defpackage.pia) r1.a.a()).e("Failed to remove wipeout entries", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01cb, code lost:
        if (r1.c.t() != false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01cd, code lost:
        a();
        a((java.lang.Exception) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01d4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r4.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01d8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01da, code lost:
        ((defpackage.pia) r1.a.a()).e("Failed to remove wipeout entries", r0, new java.lang.Object[0]);
        a();
        a((java.lang.Exception) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0208, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x020b, code lost:
        monitor-enter(r1.i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        r1.j = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r3 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0210, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        ((defpackage.pia) r1.a.a()).e("Query to %s returned null cursor.", "wipeout");
        a();
        a((java.lang.Exception) new java.lang.NullPointerException("Cursor is null"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        r2 = r1.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1.j = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0 = b(r18);
        r3.moveToFirst();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        if (r3.isAfterLast() != false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        r4 = new android.accounts.Account(r3.getString(0), "com.google");
        r5 = r3.getString(1);
        r6 = (defpackage.aukd) r0.get(r5);
        r7 = java.lang.Long.valueOf(r3.getLong(2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
        if (r6 != null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b2, code lost:
        if (c(r4, (defpackage.aukh) defpackage.aucj.a((defpackage.aucj) defpackage.aukh.c, r3.getBlob(3))) == false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        r11.add(defpackage.afgy.a(r4, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bb, code lost:
        r7 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00be, code lost:
        r7 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        ((defpackage.pia) r1.a.a()).e("Failed to parse channel id proto.", r0, new java.lang.Object[0]);
        a();
        a((java.lang.Exception) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00dc, code lost:
        monitor-enter(r1.i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r1.j = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f9, code lost:
        if ((java.lang.System.currentTimeMillis() - r7.longValue()) <= java.util.concurrent.TimeUnit.DAYS.toMillis((long) r6.f)) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fb, code lost:
        r7 = r6.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fd, code lost:
        if (r7 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0100, code lost:
        r7 = defpackage.aukh.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0106, code lost:
        if (c(r4, r7) == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0108, code lost:
        r11.add(defpackage.afgy.a(r4, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0115, code lost:
        if (r19.contains(r4) != false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0117, code lost:
        r6 = r6.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0119, code lost:
        if (r6 == null) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011c, code lost:
        r6 = defpackage.aukh.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0122, code lost:
        if (c(r4, r6) == false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0124, code lost:
        r11.add(defpackage.afgy.a(r4, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x012b, code lost:
        r3.moveToNext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012e, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0131, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0134, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0144, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0147, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0168, code lost:
        a();
        a((java.lang.Exception) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x016e, code lost:
        if (r3 != null) goto L_0x0170;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0200 A[SYNTHETIC, Splitter:B:146:0x0200] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0204 A[SYNTHETIC, Splitter:B:150:0x0204] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0168 A[Catch:{ all -> 0x0201 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.auke r18, java.util.Set r19) {
        /*
            r17 = this;
            r1 = r17
            aeri r0 = r1.c
            boolean r0 = r0.u()
            if (r0 == 0) goto L_0x022b
            r2 = 0
            afcx r0 = r1.k     // Catch:{ afdm -> 0x0214 }
            android.database.sqlite.SQLiteDatabase r3 = r0.a()     // Catch:{ afdm -> 0x0214 }
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            r12 = 2
            r13 = 1
            r14 = 0
            java.lang.Object r15 = r1.i     // Catch:{ SQLiteException -> 0x014f, all -> 0x014b }
            monitor-enter(r15)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014b }
            java.util.Set r0 = r1.j     // Catch:{ all -> 0x0140 }
            if (r0 != 0) goto L_0x0138
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0140 }
            r0.<init>()     // Catch:{ all -> 0x0140 }
            r1.j = r0     // Catch:{ all -> 0x0140 }
            java.lang.String r4 = "wipeout"
            r0 = 4
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "account"
            r5[r2] = r0     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "channel_key"
            r5[r13] = r0     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "last_sync_timestamp"
            r5[r12] = r0     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "channel_id"
            r10 = 3
            r5[r10] = r0     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = "last_sync_timestamp IS NOT NULL"
            r7 = 0
            r8 = 0
            r9 = 0
            r0 = 0
            r10 = r0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0140 }
            monitor-exit(r15)     // Catch:{ all -> 0x0136 }
            if (r3 != 0) goto L_0x0075
            awdn r0 = r1.a     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            java.lang.Object r0 = r0.a()     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            pia r0 = (defpackage.pia) r0     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            java.lang.String r5 = "wipeout"
            r4[r2] = r5     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            java.lang.String r5 = "Query to %s returned null cursor."
            r0.e(r5, r4)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            r17.a()     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            java.lang.String r4 = "Cursor is null"
            r0.<init>(r4)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            r1.a((java.lang.Exception) r0)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            java.lang.Object r2 = r1.i
            monitor-enter(r2)
            r1.j = r14     // Catch:{ all -> 0x0072 }
            monitor-exit(r2)     // Catch:{ all -> 0x0072 }
            return
        L_0x0072:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0072 }
            throw r0
        L_0x0075:
            java.util.Map r0 = r17.b(r18)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
        L_0x007c:
            boolean r4 = r3.isAfterLast()     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            if (r4 != 0) goto L_0x0170
            android.accounts.Account r4 = new android.accounts.Account     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            java.lang.String r5 = r3.getString(r2)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            java.lang.String r6 = "com.google"
            r4.<init>(r5, r6)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            java.lang.String r5 = r3.getString(r13)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            java.lang.Object r6 = r0.get(r5)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            aukd r6 = (defpackage.aukd) r6     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            long r7 = r3.getLong(r12)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            if (r6 != 0) goto L_0x00e4
            r8 = 3
            byte[] r6 = r3.getBlob(r8)     // Catch:{ auda -> 0x00c1 }
            aukh r7 = defpackage.aukh.c     // Catch:{ auda -> 0x00c1 }
            aucj r6 = defpackage.aucj.a((defpackage.aucj) r7, (byte[]) r6)     // Catch:{ auda -> 0x00c1 }
            aukh r6 = (defpackage.aukh) r6     // Catch:{ auda -> 0x00c1 }
            boolean r6 = r1.c(r4, r6)     // Catch:{ auda -> 0x00c1 }
            if (r6 == 0) goto L_0x00be
            afgy r4 = defpackage.afgy.a(r4, r5)     // Catch:{ auda -> 0x00c1 }
            r11.add(r4)     // Catch:{ auda -> 0x00c1 }
            r7 = r19
            goto L_0x012b
        L_0x00be:
            r7 = r19
            goto L_0x012b
        L_0x00c1:
            r0 = move-exception
            awdn r4 = r1.a     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            java.lang.Object r4 = r4.a()     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            pia r4 = (defpackage.pia) r4     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            java.lang.String r5 = "Failed to parse channel id proto."
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            r4.e(r5, r0, r6)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            r17.a()     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            r1.a((java.lang.Exception) r0)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            r3.close()     // Catch:{ all -> 0x0208 }
            java.lang.Object r2 = r1.i
            monitor-enter(r2)
            r1.j = r14     // Catch:{ all -> 0x00e1 }
            monitor-exit(r2)     // Catch:{ all -> 0x00e1 }
            return
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00e1 }
            throw r0
        L_0x00e4:
            r8 = 3
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            long r15 = r7.longValue()     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            long r9 = r9 - r15
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            int r15 = r6.f     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            long r14 = (long) r15     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            long r14 = r7.toMillis(r14)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            int r7 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r7 <= 0) goto L_0x010f
            aukh r7 = r6.c     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            if (r7 == 0) goto L_0x0100
            goto L_0x0102
        L_0x0100:
            aukh r7 = defpackage.aukh.c     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
        L_0x0102:
            boolean r7 = r1.c(r4, r7)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            if (r7 == 0) goto L_0x010f
            afgy r7 = defpackage.afgy.a(r4, r5)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            r11.add(r7)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
        L_0x010f:
            r7 = r19
            boolean r9 = r7.contains(r4)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            if (r9 != 0) goto L_0x012b
            aukh r6 = r6.c     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            if (r6 == 0) goto L_0x011c
            goto L_0x011e
        L_0x011c:
            aukh r6 = defpackage.aukh.c     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
        L_0x011e:
            boolean r6 = r1.c(r4, r6)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            if (r6 == 0) goto L_0x012b
            afgy r4 = defpackage.afgy.a(r4, r5)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            r11.add(r4)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
        L_0x012b:
            r3.moveToNext()     // Catch:{ SQLiteException -> 0x0134, all -> 0x0131 }
            r14 = 0
            goto L_0x007c
        L_0x0131:
            r0 = move-exception
            goto L_0x0202
        L_0x0134:
            r0 = move-exception
            goto L_0x0151
        L_0x0136:
            r0 = move-exception
            goto L_0x0142
        L_0x0138:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0140 }
            java.lang.String r3 = "Concurrent wipeout is not allowed."
            r0.<init>(r3)     // Catch:{ all -> 0x0140 }
            throw r0     // Catch:{ all -> 0x0140 }
        L_0x0140:
            r0 = move-exception
            r3 = 0
        L_0x0142:
            monitor-exit(r15)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ SQLiteException -> 0x0147, all -> 0x0144 }
        L_0x0144:
            r0 = move-exception
            goto L_0x0202
        L_0x0147:
            r0 = move-exception
            goto L_0x0151
        L_0x0149:
            r0 = move-exception
            goto L_0x0142
        L_0x014b:
            r0 = move-exception
            r3 = 0
            goto L_0x0202
        L_0x014f:
            r0 = move-exception
            r3 = 0
        L_0x0151:
            awdn r4 = r1.a     // Catch:{ all -> 0x0201 }
            java.lang.Object r4 = r4.a()     // Catch:{ all -> 0x0201 }
            pia r4 = (defpackage.pia) r4     // Catch:{ all -> 0x0201 }
            java.lang.String r5 = "Failed to enforce wipeout policy"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0201 }
            r4.e(r5, r6)     // Catch:{ all -> 0x0201 }
            aeri r4 = r1.c     // Catch:{ all -> 0x0201 }
            boolean r4 = r4.t()     // Catch:{ all -> 0x0201 }
            if (r4 == 0) goto L_0x0200
            r17.a()     // Catch:{ all -> 0x0201 }
            r1.a((java.lang.Exception) r0)     // Catch:{ all -> 0x0201 }
            if (r3 == 0) goto L_0x0173
        L_0x0170:
            r3.close()     // Catch:{ all -> 0x0208 }
        L_0x0173:
            java.lang.Object r3 = r1.i     // Catch:{ all -> 0x0208 }
            monitor-enter(r3)     // Catch:{ all -> 0x0208 }
            java.util.Set r0 = r1.j     // Catch:{ all -> 0x01fd }
            r11.removeAll(r0)     // Catch:{ all -> 0x01fd }
            afcx r0 = r1.k     // Catch:{ afdm -> 0x01d9 }
            android.database.sqlite.SQLiteDatabase r4 = r0.c()     // Catch:{ afdm -> 0x01d9 }
            r4.beginTransaction()     // Catch:{ all -> 0x01fd }
            java.util.Iterator r0 = r11.iterator()     // Catch:{ SQLiteException -> 0x01b5 }
        L_0x0188:
            boolean r5 = r0.hasNext()     // Catch:{ SQLiteException -> 0x01b5 }
            if (r5 == 0) goto L_0x01ac
            java.lang.Object r5 = r0.next()     // Catch:{ SQLiteException -> 0x01b5 }
            afgy r5 = (defpackage.afgy) r5     // Catch:{ SQLiteException -> 0x01b5 }
            java.lang.String r6 = "wipeout"
            java.lang.String[] r7 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x01b5 }
            android.accounts.Account r8 = r5.a()     // Catch:{ SQLiteException -> 0x01b5 }
            java.lang.String r8 = r8.name     // Catch:{ SQLiteException -> 0x01b5 }
            r7[r2] = r8     // Catch:{ SQLiteException -> 0x01b5 }
            java.lang.String r5 = r5.b()     // Catch:{ SQLiteException -> 0x01b5 }
            r7[r13] = r5     // Catch:{ SQLiteException -> 0x01b5 }
            java.lang.String r5 = "account = ? AND channel_key = ?"
            r4.delete(r6, r5, r7)     // Catch:{ SQLiteException -> 0x01b5 }
            goto L_0x0188
        L_0x01ac:
            r4.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x01b5 }
        L_0x01af:
            r4.endTransaction()     // Catch:{ all -> 0x01fd }
            goto L_0x01ef
        L_0x01b3:
            r0 = move-exception
            goto L_0x01d5
        L_0x01b5:
            r0 = move-exception
            awdn r5 = r1.a     // Catch:{ all -> 0x01b3 }
            java.lang.Object r5 = r5.a()     // Catch:{ all -> 0x01b3 }
            pia r5 = (defpackage.pia) r5     // Catch:{ all -> 0x01b3 }
            java.lang.String r6 = "Failed to remove wipeout entries"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01b3 }
            r5.e(r6, r2)     // Catch:{ all -> 0x01b3 }
            aeri r2 = r1.c     // Catch:{ all -> 0x01b3 }
            boolean r2 = r2.t()     // Catch:{ all -> 0x01b3 }
            if (r2 == 0) goto L_0x01d4
            r17.a()     // Catch:{ all -> 0x01b3 }
            r1.a((java.lang.Exception) r0)     // Catch:{ all -> 0x01b3 }
            goto L_0x01af
        L_0x01d4:
            throw r0     // Catch:{ all -> 0x01b3 }
        L_0x01d5:
            r4.endTransaction()     // Catch:{ all -> 0x01fd }
            throw r0     // Catch:{ all -> 0x01fd }
        L_0x01d9:
            r0 = move-exception
            awdn r4 = r1.a     // Catch:{ all -> 0x01fd }
            java.lang.Object r4 = r4.a()     // Catch:{ all -> 0x01fd }
            pia r4 = (defpackage.pia) r4     // Catch:{ all -> 0x01fd }
            java.lang.String r5 = "Failed to remove wipeout entries"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01fd }
            r4.e(r5, r0, r2)     // Catch:{ all -> 0x01fd }
            r17.a()     // Catch:{ all -> 0x01fd }
            r1.a((java.lang.Exception) r0)     // Catch:{ all -> 0x01fd }
        L_0x01ef:
            r2 = 0
            r1.j = r2     // Catch:{ all -> 0x01fd }
            monitor-exit(r3)     // Catch:{ all -> 0x01fd }
            java.lang.Object r4 = r1.i
            monitor-enter(r4)
            r1.j = r2     // Catch:{ all -> 0x01fa }
            monitor-exit(r4)     // Catch:{ all -> 0x01fa }
            return
        L_0x01fa:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01fa }
            throw r0
        L_0x01fd:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01fd }
            throw r0     // Catch:{ all -> 0x0208 }
        L_0x0200:
            throw r0     // Catch:{ all -> 0x0201 }
        L_0x0201:
            r0 = move-exception
        L_0x0202:
            if (r3 == 0) goto L_0x0207
            r3.close()     // Catch:{ all -> 0x0208 }
        L_0x0207:
            throw r0     // Catch:{ all -> 0x0208 }
        L_0x0208:
            r0 = move-exception
            java.lang.Object r3 = r1.i
            monitor-enter(r3)
            r2 = 0
            r1.j = r2     // Catch:{ all -> 0x0211 }
            monitor-exit(r3)     // Catch:{ all -> 0x0211 }
            throw r0
        L_0x0211:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0211 }
            throw r0
        L_0x0214:
            r0 = move-exception
            awdn r3 = r1.a
            java.lang.Object r3 = r3.a()
            pia r3 = (defpackage.pia) r3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "Failed to enforce wipeout policy"
            r3.e(r4, r2)
            r17.a()
            r1.a((java.lang.Exception) r0)
            return
        L_0x022b:
            r17.a((defpackage.auke) r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afha.a(auke, java.util.Set):void");
    }
}
