package com.google.android.gms.people.service;

import android.content.Context;
import android.database.Cursor;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.util.Log;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeletedNullContactsCleanupChimeraService extends qwf {
    private static long a(boolean z) {
        if (!z) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime();
    }

    public static void b(Context context) {
        if (ayxh.f()) {
            wss a = wss.a(context);
            long d = ayxh.d();
            boolean h = ayxh.h();
            boolean i = ayxh.i();
            boolean g = ayxh.g();
            boolean j = ayxh.j();
            long e = ayxh.e();
            if (!a.a.getBoolean("deleted_null_contacts_cleanup_enabled", false) || a.a.getLong("deleted_null_contacts_cleanup_periodic_interval_seconds", 0) != d || a.a.getBoolean("deleted_null_contacts_cleanup_requires_charging", false) != h || a.a.getBoolean("deleted_null_contacts_cleanup_requires_device_idle", false) != i || a.a.getBoolean("deleted_null_contacts_cleanup_persisted", false) != g || a.a.getBoolean("deleted_null_contacts_cleanup_use_flex", false) != j || (j && a.a.getLong("deleted_null_contacts_cleanup_flex_seconds", 0) != e)) {
                Log.i("DeletedNullContactsCleanup", "Flags changed. Will re-scheduling the service.");
                a(context);
                return;
            }
            return;
        }
        c(context);
    }

    private final void c() {
        Cursor query = getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id"}, (String) null, (String[]) null, (String) null);
        if (query != null) {
            try {
                query.getCount();
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        if (query != null) {
            query.close();
            return;
        }
        return;
        throw th;
    }

    public static void a(Context context) {
        Log.i("DeletedNullContactsCleanup", "Scheduling the service.");
        qxi qxi = new qxi();
        qxi.i = "com.google.android.gms.people.service.DeletedNullContactsCleanupService";
        qxi.k = "DeletedNullContactsCleanupPeriodicTask";
        int i = 2;
        qxi.a(2);
        qxi.a(ayxh.h() ? 1 : 0, (axcc.b() || ayxh.h()) ? 1 : 0);
        qxi.a(ayxh.i());
        qxi.b(1);
        qxi.n = ayxh.g();
        long d = ayxh.d();
        if (axcc.h()) {
            qxi.a(qxe.a(d));
        } else {
            qxi.a = d;
        }
        if (ayxh.j()) {
            qxi.b = ayxh.e();
        }
        wss.a(context).a(ayxh.f(), ayxh.d(), ayxh.h(), ayxh.i(), ayxh.g(), ayxh.j(), ayxh.e());
        try {
            qwq.a(context).a((qxx) qxi.b());
        } catch (IllegalArgumentException e) {
            Log.e("DeletedNullContactsCleanup", "Error when scheduling the periodic task.", e);
            i = 8;
        }
        wml a = wml.a();
        aucd o = xlg.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xlg xlg = (xlg) o.b;
        xlg.b = i - 1;
        int i2 = xlg.a | 1;
        xlg.a = i2;
        xlg.e = 1;
        xlg.a = i2 | 32;
        a.a((xlg) o.i());
    }

    public static void c(Context context) {
        int i;
        Log.i("DeletedNullContactsCleanup", "Canceling the service.");
        wss.a(context).a(ayxh.f(), ayxh.d(), ayxh.h(), ayxh.i(), ayxh.g(), ayxh.j(), ayxh.e());
        try {
            qwq.a(context).a("com.google.android.gms.people.service.DeletedNullContactsCleanupService");
            i = 2;
        } catch (IllegalArgumentException e) {
            Log.e("DeletedNullContactsCleanup", "Error when canceling the service.", e);
            i = 8;
        }
        wml a = wml.a();
        aucd o = xlg.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xlg xlg = (xlg) o.b;
        xlg.b = i - 1;
        int i2 = xlg.a | 1;
        xlg.a = i2;
        xlg.e = 3;
        xlg.a = i2 | 32;
        a.a((xlg) o.i());
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r18 = this;
            java.lang.String r0 = "contact_last_updated_timestamp"
            java.lang.String r1 = "_id"
            java.lang.String r2 = "DeletedNullContactsCleanup"
            r3 = 1024(0x400, float:1.435E-42)
            java.util.HashSet r3 = defpackage.angm.a((int) r3)
            android.content.ContentResolver r4 = r18.getContentResolver()
            android.net.Uri r5 = android.provider.ContactsContract.RawContacts.CONTENT_URI
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]
            r11 = 0
            java.lang.String r12 = "contact_id"
            r6[r11] = r12
            java.lang.String r7 = "deleted!=1"
            r8 = 0
            r9 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9)
            boolean r5 = a((android.database.Cursor) r4)
            if (r5 != 0) goto L_0x0146
            int r5 = r4.getCount()     // Catch:{ OperationApplicationException -> 0x0135, RemoteException -> 0x0133, all -> 0x0131 }
            if (r5 <= 0) goto L_0x0040
            int r5 = r4.getColumnIndex(r12)     // Catch:{ OperationApplicationException -> 0x0135, RemoteException -> 0x0133, all -> 0x0131 }
        L_0x0032:
            boolean r6 = r4.moveToNext()     // Catch:{ OperationApplicationException -> 0x0135, RemoteException -> 0x0133, all -> 0x0131 }
            if (r6 == 0) goto L_0x0040
            java.lang.String r6 = r4.getString(r5)     // Catch:{ OperationApplicationException -> 0x0135, RemoteException -> 0x0133, all -> 0x0131 }
            r3.add(r6)     // Catch:{ OperationApplicationException -> 0x0135, RemoteException -> 0x0133, all -> 0x0131 }
            goto L_0x0032
        L_0x0040:
            android.content.ContentResolver r12 = r18.getContentResolver()     // Catch:{ OperationApplicationException -> 0x0135, RemoteException -> 0x0133, all -> 0x0131 }
            android.net.Uri r13 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch:{ OperationApplicationException -> 0x0135, RemoteException -> 0x0133, all -> 0x0131 }
            r5 = 2
            java.lang.String[] r14 = new java.lang.String[r5]     // Catch:{ OperationApplicationException -> 0x0135, RemoteException -> 0x0133, all -> 0x0131 }
            r14[r11] = r1     // Catch:{ OperationApplicationException -> 0x0135, RemoteException -> 0x0133, all -> 0x0131 }
            r14[r10] = r0     // Catch:{ OperationApplicationException -> 0x0135, RemoteException -> 0x0133, all -> 0x0131 }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r4 = r12.query(r13, r14, r15, r16, r17)     // Catch:{ OperationApplicationException -> 0x0135, RemoteException -> 0x0133, all -> 0x0131 }
            boolean r5 = a((android.database.Cursor) r4)     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            if (r5 != 0) goto L_0x0129
            int r5 = r4.getCount()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            if (r5 <= 0) goto L_0x0123
            int r1 = r4.getColumnIndex(r1)     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            r4.getColumnIndex(r0)     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            r0.<init>()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            r0 = 0
        L_0x006f:
            boolean r5 = r4.moveToNext()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            if (r5 == 0) goto L_0x009e
            java.lang.String r5 = r4.getString(r1)     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            boolean r6 = r3.contains(r5)     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            if (r6 != 0) goto L_0x006f
            int r0 = r0 + 1
            java.lang.String r6 = "Dangling contacts id : "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            int r7 = r5.length()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            if (r7 != 0) goto L_0x0093
            java.lang.String r5 = new java.lang.String     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            r5.<init>(r6)     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            goto L_0x0097
        L_0x0093:
            java.lang.String r5 = r6.concat(r5)     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
        L_0x0097:
            android.util.Log.i(r2, r5)     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            defpackage.ayxf.c()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            goto L_0x006f
        L_0x009e:
            r18.c()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            defpackage.ayxf.c()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            r18.c()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            xlf r1 = defpackage.xlf.d     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            aucd r1 = r1.o()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            defpackage.ayxf.c()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            boolean r3 = r1.c     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            if (r3 != 0) goto L_0x00b5
            goto L_0x00ba
        L_0x00b5:
            r1.c()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            r1.c = r11     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
        L_0x00ba:
            aucj r3 = r1.b     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            xlf r3 = (defpackage.xlf) r3     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            int r5 = r3.a     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            r5 = r5 | r10
            r3.a = r5     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            r3.b = r0     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            ayxh r0 = defpackage.ayxh.a     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            ayxi r0 = r0.a()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            boolean r0 = r0.a()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            if (r0 == 0) goto L_0x00f6
            android.content.Context r0 = r18.getApplicationContext()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            java.lang.String r3 = "new_contact_aggregator"
            r5 = -1
            int r0 = android.provider.Settings.Global.getInt(r0, r3, r5)     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            boolean r3 = r1.c     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            if (r3 != 0) goto L_0x00e5
            goto L_0x00ea
        L_0x00e5:
            r1.c()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            r1.c = r11     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
        L_0x00ea:
            aucj r3 = r1.b     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            xlf r3 = (defpackage.xlf) r3     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            int r5 = r3.a     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            r5 = r5 | 8
            r3.a = r5     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            r3.c = r0     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
        L_0x00f6:
            defpackage.wml.a()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            aucj r0 = r1.i()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            xlf r0 = (defpackage.xlf) r0     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            xol r1 = defpackage.xol.w     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            aucd r1 = r1.o()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            boolean r3 = r1.c     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            if (r3 != 0) goto L_0x010a
            goto L_0x010f
        L_0x010a:
            r1.c()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            r1.c = r11     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
        L_0x010f:
            aucj r3 = r1.b     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            xol r3 = (defpackage.xol) r3     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            r0.getClass()     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            r3.u = r0     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            int r0 = r3.a     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            r5 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 | r5
            r3.a = r0     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
            r0 = 0
            defpackage.wmm.a(r0, r1)     // Catch:{ OperationApplicationException -> 0x012f, RemoteException -> 0x012d }
        L_0x0123:
            if (r4 == 0) goto L_0x013e
        L_0x0125:
            r4.close()
            return
        L_0x0129:
            if (r4 == 0) goto L_0x012c
            goto L_0x0125
        L_0x012c:
            return
        L_0x012d:
            r0 = move-exception
            goto L_0x0136
        L_0x012f:
            r0 = move-exception
            goto L_0x0136
        L_0x0131:
            r0 = move-exception
            goto L_0x0140
        L_0x0133:
            r0 = move-exception
            goto L_0x0136
        L_0x0135:
            r0 = move-exception
        L_0x0136:
            java.lang.String r0 = "Failed to cleanup the dangling contacts"
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x013f }
            if (r4 == 0) goto L_0x013e
            goto L_0x0125
        L_0x013e:
            return
        L_0x013f:
            r0 = move-exception
        L_0x0140:
            if (r4 == 0) goto L_0x0145
            r4.close()
        L_0x0145:
            throw r0
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.service.DeletedNullContactsCleanupChimeraService.b():void");
    }

    private static boolean a(Cursor cursor) {
        if (cursor != null) {
            return false;
        }
        Log.e("DeletedNullContactsCleanup", "Failed to query dangling contacts.");
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0140 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0141 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.qxz r17) {
        /*
            r16 = this;
            ayxh r0 = defpackage.ayxh.a
            ayxi r0 = r0.a()
            boolean r1 = r0.p()
            long r2 = a((boolean) r1)
            r0 = r17
            java.lang.String r4 = r0.a
            java.lang.String r5 = "DeletedNullContactsCleanupPeriodicTask"
            boolean r0 = r5.equals(r4)
            java.lang.String r8 = "DeletedNullContactsCleanup"
            java.lang.String r9 = "DeletedNullContactsCleanupOneoffTask"
            r10 = 2
            r11 = 0
            if (r0 != 0) goto L_0x0033
            boolean r0 = r9.equals(r4)
            if (r0 == 0) goto L_0x0027
            goto L_0x0033
        L_0x0027:
            java.lang.String r0 = "Unknown tag received. Will not run"
            android.util.Log.e(r8, r0)
            r0 = 4
            r14 = 0
            r12 = r16
            goto L_0x00c0
        L_0x0033:
            boolean r0 = r5.equals(r4)
            if (r0 == 0) goto L_0x003f
            boolean r0 = defpackage.ayxh.f()
            if (r0 != 0) goto L_0x004f
        L_0x003f:
            boolean r0 = r9.equals(r4)
            if (r0 == 0) goto L_0x00b7
            boolean r0 = defpackage.ayxh.b()
            if (r0 != 0) goto L_0x004f
            r12 = r16
            goto L_0x00b9
        L_0x004f:
            java.lang.String r0 = "android.permission.WRITE_CONTACTS"
            r12 = r16
            int r0 = defpackage.kf.a((android.content.Context) r12, (java.lang.String) r0)
            if (r0 == 0) goto L_0x005e
            r0 = 5
            r14 = 0
            goto L_0x00c0
        L_0x005e:
            r13 = 0
            android.content.ContentResolver r0 = r16.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0092, IllegalStateException -> 0x008e, UnsupportedOperationException -> 0x008c, SQLiteException -> 0x008a, SecurityException -> 0x0088 }
            android.net.Uri r14 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ IllegalArgumentException -> 0x0092, IllegalStateException -> 0x008e, UnsupportedOperationException -> 0x008c, SQLiteException -> 0x008a, SecurityException -> 0x0088 }
            java.lang.String r15 = "account_name IS NULL AND account_type IS NULL AND data_set IS NULL AND deleted=1"
            int r14 = r0.delete(r14, r15, r13)     // Catch:{ IllegalArgumentException -> 0x0092, IllegalStateException -> 0x008e, UnsupportedOperationException -> 0x008c, SQLiteException -> 0x008a, SecurityException -> 0x0088 }
            ayxh r0 = defpackage.ayxh.a     // Catch:{ IllegalArgumentException -> 0x0086, IllegalStateException -> 0x0084, UnsupportedOperationException -> 0x0082, SQLiteException -> 0x0080, SecurityException -> 0x007e }
            ayxi r0 = r0.a()     // Catch:{ IllegalArgumentException -> 0x0086, IllegalStateException -> 0x0084, UnsupportedOperationException -> 0x0082, SQLiteException -> 0x0080, SecurityException -> 0x007e }
            boolean r0 = r0.b()     // Catch:{ IllegalArgumentException -> 0x0086, IllegalStateException -> 0x0084, UnsupportedOperationException -> 0x0082, SQLiteException -> 0x0080, SecurityException -> 0x007e }
            if (r0 != 0) goto L_0x0079
            r0 = 2
            goto L_0x0095
        L_0x0079:
            r16.b()     // Catch:{ IllegalArgumentException -> 0x0086, IllegalStateException -> 0x0084, UnsupportedOperationException -> 0x0082, SQLiteException -> 0x0080, SecurityException -> 0x007e }
            r0 = 2
            goto L_0x0095
        L_0x007e:
            r0 = move-exception
            goto L_0x0090
        L_0x0080:
            r0 = move-exception
            goto L_0x0090
        L_0x0082:
            r0 = move-exception
            goto L_0x0090
        L_0x0084:
            r0 = move-exception
            goto L_0x0090
        L_0x0086:
            r0 = move-exception
            goto L_0x0094
        L_0x0088:
            r0 = move-exception
            goto L_0x008f
        L_0x008a:
            r0 = move-exception
            goto L_0x008f
        L_0x008c:
            r0 = move-exception
            goto L_0x008f
        L_0x008e:
            r0 = move-exception
        L_0x008f:
            r14 = 0
        L_0x0090:
            r0 = 7
            goto L_0x0095
        L_0x0092:
            r0 = move-exception
            r14 = 0
        L_0x0094:
            r0 = 6
        L_0x0095:
            wss r15 = defpackage.wss.a((android.content.Context) r16)
            long r6 = java.lang.System.currentTimeMillis()
            defpackage.iva.b((java.lang.String) r13)
            android.content.SharedPreferences r13 = r15.a
            android.content.SharedPreferences$Editor r13 = r13.edit()
            java.lang.String r15 = "deleted_null_contacts_cleanup_last_run_timestamp"
            android.content.SharedPreferences$Editor r6 = r13.putLong(r15, r6)
            r6.commit()
            if (r14 <= 0) goto L_0x00c0
            java.lang.String r6 = "Cleaned-up %d deleted null contacts"
            defpackage.xdt.a((java.lang.String) r8, (java.lang.String) r6, (int) r14)
            goto L_0x00c0
        L_0x00b7:
            r12 = r16
        L_0x00b9:
            java.lang.String r0 = "The service is disabled. Will cancel it."
            android.util.Log.e(r8, r0)
            r0 = 3
            r14 = 0
        L_0x00c0:
            wml r6 = defpackage.wml.a()
            xlg r7 = defpackage.xlg.f
            aucd r7 = r7.o()
            boolean r8 = r7.c
            if (r8 != 0) goto L_0x00cf
            goto L_0x00d4
        L_0x00cf:
            r7.c()
            r7.c = r11
        L_0x00d4:
            aucj r8 = r7.b
            xlg r8 = (defpackage.xlg) r8
            int r13 = r0 + -1
            r8.b = r13
            int r13 = r8.a
            r15 = 1
            r13 = r13 | r15
            r8.a = r13
            r13 = r13 | r10
            r8.a = r13
            r8.c = r14
            long r13 = a((boolean) r1)
            long r13 = r13 - r2
            boolean r1 = r7.c
            if (r1 != 0) goto L_0x00f1
            goto L_0x00f6
        L_0x00f1:
            r7.c()
            r7.c = r11
        L_0x00f6:
            aucj r1 = r7.b
            xlg r1 = (defpackage.xlg) r1
            int r2 = r1.a
            r2 = r2 | 16
            r1.a = r2
            r1.d = r13
            int r3 = r4.hashCode()
            r8 = -1860432143(0xffffffff911c0ef1, float:-1.2310834E-28)
            r13 = -1
            if (r3 == r8) goto L_0x011a
            r5 = 1861281503(0x6ef0e6df, float:3.7277754E28)
            if (r3 == r5) goto L_0x0112
            goto L_0x0122
        L_0x0112:
            boolean r3 = r4.equals(r9)
            if (r3 == 0) goto L_0x0122
            r3 = 1
            goto L_0x0123
        L_0x011a:
            boolean r3 = r4.equals(r5)
            if (r3 == 0) goto L_0x0122
            r3 = 0
            goto L_0x0123
        L_0x0122:
            r3 = -1
        L_0x0123:
            if (r3 == 0) goto L_0x012a
            if (r3 == r15) goto L_0x0128
            goto L_0x012b
        L_0x0128:
            r15 = 6
            goto L_0x012b
        L_0x012a:
            r15 = 3
        L_0x012b:
            int r15 = r15 + r13
            r1.e = r15
            r2 = r2 | 32
            r1.a = r2
            aucj r1 = r7.i()
            xlg r1 = (defpackage.xlg) r1
            r6.a((defpackage.xlg) r1)
            b(r16)
            if (r0 != r10) goto L_0x0141
            return r11
        L_0x0141:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.service.DeletedNullContactsCleanupChimeraService.a(qxz):int");
    }
}
