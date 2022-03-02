package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: aayw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aayw {
    private static final String[] b = {"full_path", "time_ms", "sha256_digest", "is_setuid_root", "is_symlink", "symlink_target", "file_permissions", "file_owner", "file_group", "se_linux_security_context"};
    public SQLiteDatabase a;
    private final aayv c;

    public aayw(Context context) {
        this.c = new aayv(context);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.a = this.c.getWritableDatabase();
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.c.close();
        this.a = null;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        SQLiteDatabase sQLiteDatabase = this.a;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.a.endTransaction();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x00a3=Splitter:B:29:0x00a3, B:36:0x00ad=Splitter:B:36:0x00ad} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List d() {
        /*
            r10 = this;
            monitor-enter(r10)
            r10.a()     // Catch:{ all -> 0x00c3 }
            android.database.sqlite.SQLiteDatabase r0 = r10.a     // Catch:{ all -> 0x00be }
            java.lang.String r1 = "files_info"
            java.lang.String[] r2 = b     // Catch:{ all -> 0x00be }
            java.lang.String r3 = "is_setuid_root=1"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00be }
            int r1 = r0.getCount()     // Catch:{ all -> 0x00b2 }
            r2 = 0
            if (r1 == 0) goto L_0x00a8
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00b2 }
            r3.<init>()     // Catch:{ all -> 0x00b2 }
            r4 = 0
            r5 = 0
        L_0x0022:
            if (r5 >= r1) goto L_0x009e
            r0.moveToNext()     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = r0.getString(r4)     // Catch:{ all -> 0x00b2 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00b2 }
            if (r7 != 0) goto L_0x0094
            aaxz r7 = new aaxz     // Catch:{ all -> 0x00b2 }
            r7.<init>()     // Catch:{ all -> 0x00b2 }
            r7.a = r6     // Catch:{ all -> 0x00b2 }
            r6 = 1
            r7.c = r6     // Catch:{ all -> 0x00b2 }
            long r8 = r0.getLong(r6)     // Catch:{ all -> 0x00b2 }
            r7.b = r8     // Catch:{ all -> 0x00b2 }
            r8 = 2
            byte[] r8 = r0.getBlob(r8)     // Catch:{ all -> 0x00b2 }
            r7.g = r8     // Catch:{ all -> 0x00b2 }
            r8 = 3
            int r8 = r0.getInt(r8)     // Catch:{ all -> 0x00b2 }
            if (r8 != r6) goto L_0x0051
            r8 = 1
            goto L_0x0052
        L_0x0051:
            r8 = 0
        L_0x0052:
            r7.d = r8     // Catch:{ all -> 0x00b2 }
            r8 = 4
            int r8 = r0.getInt(r8)     // Catch:{ all -> 0x00b2 }
            if (r8 != r6) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r6 = 0
        L_0x005d:
            r7.e = r6     // Catch:{ all -> 0x00b2 }
            r6 = 5
            java.lang.String r6 = r0.getString(r6)     // Catch:{ all -> 0x00b2 }
            r7.f = r6     // Catch:{ all -> 0x00b2 }
            aayf r6 = new aayf     // Catch:{ all -> 0x00b2 }
            r6.<init>()     // Catch:{ all -> 0x00b2 }
            r7.i = r6     // Catch:{ all -> 0x00b2 }
            aayf r6 = r7.i     // Catch:{ all -> 0x00b2 }
            r8 = 6
            int r8 = r0.getInt(r8)     // Catch:{ all -> 0x00b2 }
            r6.c = r8     // Catch:{ all -> 0x00b2 }
            aayf r6 = r7.i     // Catch:{ all -> 0x00b2 }
            r8 = 7
            int r8 = r0.getInt(r8)     // Catch:{ all -> 0x00b2 }
            r6.b = r8     // Catch:{ all -> 0x00b2 }
            aayf r6 = r7.i     // Catch:{ all -> 0x00b2 }
            r8 = 8
            int r8 = r0.getInt(r8)     // Catch:{ all -> 0x00b2 }
            r6.a = r8     // Catch:{ all -> 0x00b2 }
            aayf r6 = r7.i     // Catch:{ all -> 0x00b2 }
            r8 = 9
            java.lang.String r8 = r0.getString(r8)     // Catch:{ all -> 0x00b2 }
            r6.e = r8     // Catch:{ all -> 0x00b2 }
            goto L_0x0095
        L_0x0094:
            r7 = r2
        L_0x0095:
            if (r7 != 0) goto L_0x0098
            goto L_0x009b
        L_0x0098:
            r3.add(r7)     // Catch:{ all -> 0x00b2 }
        L_0x009b:
            int r5 = r5 + 1
            goto L_0x0022
        L_0x009e:
            if (r0 == 0) goto L_0x00a3
            r0.close()     // Catch:{ all -> 0x00be }
        L_0x00a3:
            r10.b()     // Catch:{ all -> 0x00c3 }
            monitor-exit(r10)
            return r3
        L_0x00a8:
            if (r0 == 0) goto L_0x00ad
            r0.close()     // Catch:{ all -> 0x00be }
        L_0x00ad:
            r10.b()     // Catch:{ all -> 0x00c3 }
            monitor-exit(r10)
            return r2
        L_0x00b2:
            r1 = move-exception
            if (r0 == 0) goto L_0x00bd
            r0.close()     // Catch:{ all -> 0x00b9 }
            goto L_0x00bd
        L_0x00b9:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r0)     // Catch:{ all -> 0x00be }
        L_0x00bd:
            throw r1     // Catch:{ all -> 0x00be }
        L_0x00be:
            r0 = move-exception
            r10.b()     // Catch:{ all -> 0x00c3 }
            throw r0     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            monitor-exit(r10)
            goto L_0x00c7
        L_0x00c6:
            throw r0
        L_0x00c7:
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aayw.d():java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void e() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.database.sqlite.SQLiteDatabase r0 = r2.a     // Catch:{ SQLException -> 0x000d, all -> 0x000a }
            java.lang.String r1 = "DROP TABLE files_info"
            r0.execSQL(r1)     // Catch:{ SQLException -> 0x000d, all -> 0x000a }
        L_0x0008:
            monitor-exit(r2)
            return
        L_0x000a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x000d:
            r0 = move-exception
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aayw.e():void");
    }
}
