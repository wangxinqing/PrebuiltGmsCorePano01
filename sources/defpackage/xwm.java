package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: xwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum xwm {
    ;
    
    private static final String[] b = null;
    private ContentResolver c;
    private Set d;
    private Set e;
    private final ycw f;

    static {
        b = new String[]{"system_id", "title", "account_name", "auto_add", "favorites", "_id", "sourceid", "group_is_read_only"};
    }

    private xwm(String str) {
        this.f = ybx.a;
    }

    private final void a(long j, ContentValues contentValues) {
        a(xvw.a(ContentUris.withAppendedId(ContactsContract.Groups.CONTENT_URI, j)), contentValues, (String) null);
    }

    private final void a(ContentValues contentValues, Account account) {
        contentValues.put("group_visible", 1);
        contentValues.put("group_is_read_only", 1);
        this.c.insert(xvw.a(ContactsContract.Groups.CONTENT_URI, account), contentValues);
    }

    /* JADX INFO: finally extract failed */
    private final void b(Context context, Account account, yaz yaz) {
        String str;
        Account account2 = account;
        String str2 = account2.name;
        if (!this.d.contains(str2)) {
            String str3 = account2.name;
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", "My Contacts");
            contentValues.put("system_id", "Contacts");
            contentValues.put("sourceid", "6");
            contentValues.put("auto_add", 1);
            a(contentValues, account2);
        }
        if (!this.e.contains(str2)) {
            String str4 = account2.name;
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("title", "Starred in Android");
            contentValues2.put("favorites", 1);
            a(contentValues2, account2);
        }
        String str5 = account2.name;
        xip.a();
        if (!Boolean.valueOf(ayrj.a.a().r()).booleanValue()) {
            if (aytd.c()) {
                String str6 = account2.name;
                xsg c2 = xvm.a(context).c();
                if (!c2.b || !c2.c.equals(str6) || !c2.d.contains(1)) {
                    return;
                }
            } else {
                return;
            }
        }
        String str7 = account2.name;
        ContentResolver contentResolver = this.c;
        Uri uri = ContactsContract.Groups.CONTENT_URI;
        String[] strArr = xvw.a;
        Cursor query = contentResolver.query(uri, new String[]{"_id"}, "account_name IS NULL AND account_type IS NULL AND data_set IS NULL", (String[]) null, (String) null);
        if (query != null) {
            try {
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("account_name", str7);
                contentValues3.put("account_type", account2.type);
                while (true) {
                    str = "account_name IS NULL AND account_type IS NULL AND data_set IS NULL";
                    if (!query.moveToNext()) {
                        break;
                    }
                    yaz yaz2 = yaz;
                    a(ContentUris.withAppendedId(ContactsContract.Groups.CONTENT_URI, query.getLong(0)), contentValues3, str);
                }
                query.close();
                xwi xwi = new xwi(this.c, account2);
                String str8 = xwi.b.name;
                String[] strArr2 = {"_id"};
                if (aysl.a.a().a()) {
                    str = "account_name IS NULL AND account_type IS NULL AND data_set IS NULL AND deleted = 0";
                }
                Cursor query2 = xwi.a.query(ContactsContract.RawContacts.CONTENT_URI, strArr2, str, (String[]) null, (String) null);
                if (query2 != null) {
                    try {
                        ContentValues contentValues4 = new ContentValues();
                        contentValues4.put("account_name", str8);
                        contentValues4.put("account_type", xwi.b.type);
                        int i = 0;
                        while (query2.moveToNext()) {
                            xwi.a(ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, query2.getLong(0)), contentValues4, str);
                            i++;
                        }
                        query2.close();
                        xwi.a(str8, i, yaz);
                    } catch (Throwable th) {
                        query2.close();
                        throw th;
                    }
                } else {
                    throw new xye(new RemoteException("Unable to query CP2"));
                }
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        } else {
            throw new xye(new RemoteException("Unable to query CP2"));
        }
    }

    private final void a(Uri uri, ContentValues contentValues, String str) {
        ContentResolver contentResolver = this.c;
        String[] strArr = xvw.a;
        contentResolver.update(uri, contentValues, str, (String[]) null);
    }

    private final void a(xwb xwb) {
        boolean z;
        this.d = new HashSet();
        this.e = new HashSet();
        while (true) {
            try {
                xvu a2 = xwb.b();
                if (a2 != null) {
                    String n = a2.n();
                    String l = a2.l();
                    if (!TextUtils.isEmpty(n)) {
                        String k = a2.k();
                        if (!"Contacts".equals(k)) {
                            if (k == null) {
                                if (a2.j() == null) {
                                    if (!"System Group: My Contacts".equals(a2.l())) {
                                    }
                                }
                            }
                            if (a2.k() != null) {
                                String l2 = a2.l();
                                if (l2 == null || !l2.startsWith("System Group: ")) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (!z) {
                                    if (!a2.d() && a2.c()) {
                                    }
                                }
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("auto_add", 0);
                                contentValues.put("group_is_read_only", 1);
                                if (z) {
                                    contentValues.put("title", l2.substring(14));
                                }
                                a(a2.g().longValue(), contentValues);
                            }
                            if ("Starred in Android".equals(l)) {
                                this.e.add(n);
                                if (a2.a()) {
                                    if (!a2.c()) {
                                    }
                                }
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("favorites", 1);
                                contentValues2.put("group_is_read_only", 1);
                                a(a2.g().longValue(), contentValues2);
                            }
                        }
                        this.d.add(n);
                        if ("My Contacts".equals(a2.l())) {
                            if ("Contacts".equals(a2.k()) && "6".equals(a2.j()) && a2.d() && a2.c()) {
                            }
                        }
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("title", "My Contacts");
                        contentValues3.put("system_id", "Contacts");
                        contentValues3.put("sourceid", "6");
                        contentValues3.put("auto_add", 1);
                        contentValues3.put("group_is_read_only", 1);
                        a(a2.g().longValue(), contentValues3);
                    }
                } else {
                    return;
                }
            } finally {
                xwb.f();
            }
        }
    }

    private static void a(yaz yaz, int i) {
        yaz.a(xjo.CONTACT, xkj.BEFORE_PREPARE_TO_SYNC, xjm.CP2, i);
    }

    public final synchronized void a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        this.c = contentResolver;
        Uri uri = ContactsContract.Groups.CONTENT_URI;
        String[] strArr = b;
        String[] strArr2 = xvw.a;
        xwb a2 = xwb.a(contentResolver, uri, strArr, "account_type='com.google' AND data_set IS NULL", (String[]) null, "_id");
        if (a2 != null) {
            a(a2);
            anhj a3 = this.f.b(context).iterator();
            while (a3.hasNext()) {
                b(context, (Account) a3.next(), (yaz) null);
            }
        } else {
            throw new xye(new RemoteException("Unable to query CP2"));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0270, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0271, code lost:
        r2 = r0;
        r3 = r13;
        r11 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04db, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04dc, code lost:
        r2 = r0;
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a2, code lost:
        if (defpackage.aytd.m() != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x065b, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x06db, code lost:
        r3 = r13;
        r11 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0723, code lost:
        r3.c();
        r3.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0195, code lost:
        if (defpackage.xvo.a(r8, r3) == false) goto L_0x01a5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03cb A[SYNTHETIC, Splitter:B:169:0x03cb] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x048a A[SYNTHETIC, Splitter:B:211:0x048a] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x04bb A[Catch:{ RemoteException -> 0x065a, all -> 0x0655 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04bc A[Catch:{ RemoteException -> 0x065a, all -> 0x0655 }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x04ca A[SYNTHETIC, Splitter:B:223:0x04ca] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x04ed A[Catch:{ RemoteException -> 0x065a, all -> 0x0655 }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x04ef A[Catch:{ RemoteException -> 0x065a, all -> 0x0655 }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x05a8 A[Catch:{ RemoteException -> 0x065a, all -> 0x0655 }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x05a9 A[Catch:{ RemoteException -> 0x065a, all -> 0x0655 }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x05fa A[SYNTHETIC, Splitter:B:276:0x05fa] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x061c A[Catch:{ RemoteException -> 0x065a, all -> 0x0655 }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0641 A[Catch:{ nja -> 0x0198, all -> 0x0748 }] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0642 A[Catch:{ nja -> 0x0198, all -> 0x0748 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x065a A[ExcHandler: RemoteException (e android.os.RemoteException), Splitter:B:211:0x048a] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0671 A[SYNTHETIC, Splitter:B:310:0x0671] */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x06da A[ExcHandler: RemoteException (e android.os.RemoteException), Splitter:B:100:0x0256] */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0722 A[Catch:{ nja -> 0x0198, all -> 0x0748 }] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0723 A[Catch:{ nja -> 0x0198, all -> 0x0748 }] */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0484 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.content.Context r27, android.accounts.Account r28, defpackage.yaz r29) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            r9 = r28
            r10 = r29
            monitor-enter(r26)
            android.content.ContentResolver r3 = r27.getContentResolver()     // Catch:{ all -> 0x0748 }
            r1.c = r3     // Catch:{ all -> 0x0748 }
            android.net.Uri r4 = android.provider.ContactsContract.Groups.CONTENT_URI     // Catch:{ all -> 0x0748 }
            java.lang.String[] r5 = b     // Catch:{ all -> 0x0748 }
            r11 = 1
            java.lang.String[] r7 = new java.lang.String[r11]     // Catch:{ all -> 0x0748 }
            java.lang.String r6 = r9.name     // Catch:{ all -> 0x0748 }
            r12 = 0
            r7[r12] = r6     // Catch:{ all -> 0x0748 }
            java.lang.String r6 = "account_type='com.google' AND data_set IS NULL AND account_name = ?"
            java.lang.String r8 = "_id"
            xwb r3 = defpackage.xwb.a(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0748 }
            if (r3 == 0) goto L_0x073b
            r1.a((defpackage.xwb) r3)     // Catch:{ all -> 0x0748 }
            r26.b(r27, r28, r29)     // Catch:{ all -> 0x0748 }
            boolean r3 = defpackage.aytd.c()     // Catch:{ all -> 0x0748 }
            if (r3 == 0) goto L_0x0739
            xna r3 = defpackage.xna.e     // Catch:{ all -> 0x0748 }
            aucd r13 = r3.o()     // Catch:{ all -> 0x0748 }
            aytd r3 = defpackage.aytd.a     // Catch:{ all -> 0x0748 }
            ayte r3 = r3.a()     // Catch:{ all -> 0x0748 }
            boolean r3 = r3.b()     // Catch:{ all -> 0x0748 }
            r4 = 3
            r14 = 2
            if (r3 != 0) goto L_0x0080
            java.lang.String r3 = r9.name     // Catch:{ all -> 0x0748 }
            xvm r5 = defpackage.xvm.a((android.content.Context) r27)     // Catch:{ all -> 0x0748 }
            xsg r5 = r5.c()     // Catch:{ all -> 0x0748 }
            boolean r6 = r5.b     // Catch:{ all -> 0x0748 }
            if (r6 == 0) goto L_0x0068
            java.lang.String r6 = r5.c     // Catch:{ all -> 0x0748 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0748 }
            if (r3 == 0) goto L_0x0068
            aucs r3 = r5.d     // Catch:{ all -> 0x0748 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0748 }
            boolean r3 = r3.contains(r5)     // Catch:{ all -> 0x0748 }
            if (r3 == 0) goto L_0x0068
            goto L_0x0080
        L_0x0068:
            boolean r2 = r13.c     // Catch:{ all -> 0x0748 }
            if (r2 != 0) goto L_0x006d
            goto L_0x0072
        L_0x006d:
            r13.c()     // Catch:{ all -> 0x0748 }
            r13.c = r12     // Catch:{ all -> 0x0748 }
        L_0x0072:
            aucj r2 = r13.b     // Catch:{ all -> 0x0748 }
            xna r2 = (defpackage.xna) r2     // Catch:{ all -> 0x0748 }
            r2.b = r14     // Catch:{ all -> 0x0748 }
            int r3 = r2.a     // Catch:{ all -> 0x0748 }
            r3 = r3 | r11
            r2.a = r3     // Catch:{ all -> 0x0748 }
            r3 = r13
            goto L_0x0704
        L_0x0080:
            boolean r3 = r13.c     // Catch:{ all -> 0x0748 }
            if (r3 != 0) goto L_0x0085
            goto L_0x008a
        L_0x0085:
            r13.c()     // Catch:{ all -> 0x0748 }
            r13.c = r12     // Catch:{ all -> 0x0748 }
        L_0x008a:
            aucj r3 = r13.b     // Catch:{ all -> 0x0748 }
            xna r3 = (defpackage.xna) r3     // Catch:{ all -> 0x0748 }
            r3.b = r4     // Catch:{ all -> 0x0748 }
            int r5 = r3.a     // Catch:{ all -> 0x0748 }
            r5 = r5 | r11
            r3.a = r5     // Catch:{ all -> 0x0748 }
            boolean r3 = defpackage.aytd.n()     // Catch:{ all -> 0x0748 }
            r5 = 4
            r6 = 0
            if (r3 == 0) goto L_0x009e
            goto L_0x00a4
        L_0x009e:
            boolean r3 = defpackage.aytd.m()     // Catch:{ all -> 0x0748 }
            if (r3 == 0) goto L_0x01e9
        L_0x00a4:
            java.lang.String r3 = r9.name     // Catch:{ all -> 0x0748 }
            xvo r7 = new xvo     // Catch:{ all -> 0x0748 }
            r7.<init>(r2)     // Catch:{ all -> 0x0748 }
            int r8 = r7.b()     // Catch:{ nja -> 0x0198 }
            android.net.Uri r16 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ nja -> 0x0198 }
            android.net.Uri$Builder r4 = r16.buildUpon()     // Catch:{ nja -> 0x0198 }
            java.lang.String r15 = "account_name"
            android.net.Uri$Builder r3 = r4.appendQueryParameter(r15, r3)     // Catch:{ nja -> 0x0198 }
            java.lang.String r4 = "account_type"
            java.lang.String r15 = "com.google"
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r4, r15)     // Catch:{ nja -> 0x0198 }
            android.net.Uri r3 = r3.build()     // Catch:{ nja -> 0x0198 }
            int r3 = r7.a((android.net.Uri) r3, (java.lang.String) r6)     // Catch:{ nja -> 0x0198 }
            int r3 = r3 + r8
            boolean r4 = defpackage.aytd.f()     // Catch:{ nja -> 0x0198 }
            if (r4 != 0) goto L_0x00d3
            goto L_0x00d6
        L_0x00d3:
            a((defpackage.yaz) r10, (int) r3)     // Catch:{ nja -> 0x0198 }
        L_0x00d6:
            boolean r4 = defpackage.aytd.n()     // Catch:{ nja -> 0x0198 }
            if (r4 == 0) goto L_0x013c
            long r14 = (long) r8     // Catch:{ nja -> 0x0198 }
            aytd r4 = defpackage.aytd.a     // Catch:{ nja -> 0x0198 }
            ayte r4 = r4.a()     // Catch:{ nja -> 0x0198 }
            long r19 = r4.J()     // Catch:{ nja -> 0x0198 }
            int r4 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r4 >= 0) goto L_0x00fa
            long r3 = (long) r3     // Catch:{ nja -> 0x0198 }
            aytd r14 = defpackage.aytd.a     // Catch:{ nja -> 0x0198 }
            ayte r14 = r14.a()     // Catch:{ nja -> 0x0198 }
            long r14 = r14.K()     // Catch:{ nja -> 0x0198 }
            int r19 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r19 < 0) goto L_0x013c
        L_0x00fa:
            boolean r2 = defpackage.aytd.g()     // Catch:{ nja -> 0x0198 }
            if (r2 != 0) goto L_0x0102
            goto L_0x01a5
        L_0x0102:
            xmz r2 = defpackage.xmz.d     // Catch:{ nja -> 0x0198 }
            aucd r2 = r2.o()     // Catch:{ nja -> 0x0198 }
            boolean r3 = r2.c     // Catch:{ nja -> 0x0198 }
            if (r3 != 0) goto L_0x010d
            goto L_0x0112
        L_0x010d:
            r2.c()     // Catch:{ nja -> 0x0198 }
            r2.c = r12     // Catch:{ nja -> 0x0198 }
        L_0x0112:
            aucj r3 = r2.b     // Catch:{ nja -> 0x0198 }
            xmz r3 = (defpackage.xmz) r3     // Catch:{ nja -> 0x0198 }
            int r4 = r3.a     // Catch:{ nja -> 0x0198 }
            r4 = r4 | r11
            r3.a = r4     // Catch:{ nja -> 0x0198 }
            r3.b = r8     // Catch:{ nja -> 0x0198 }
            boolean r3 = r13.c     // Catch:{ nja -> 0x0198 }
            if (r3 != 0) goto L_0x0122
            goto L_0x0127
        L_0x0122:
            r13.c()     // Catch:{ nja -> 0x0198 }
            r13.c = r12     // Catch:{ nja -> 0x0198 }
        L_0x0127:
            aucj r3 = r13.b     // Catch:{ nja -> 0x0198 }
            xna r3 = (defpackage.xna) r3     // Catch:{ nja -> 0x0198 }
            aucj r2 = r2.i()     // Catch:{ nja -> 0x0198 }
            xmz r2 = (defpackage.xmz) r2     // Catch:{ nja -> 0x0198 }
            r2.getClass()     // Catch:{ nja -> 0x0198 }
            r3.d = r2     // Catch:{ nja -> 0x0198 }
            int r2 = r3.a     // Catch:{ nja -> 0x0198 }
            r2 = r2 | r5
            r3.a = r2     // Catch:{ nja -> 0x0198 }
            goto L_0x01a5
        L_0x013c:
            boolean r3 = defpackage.aytd.m()     // Catch:{ nja -> 0x0198 }
            if (r3 != 0) goto L_0x0144
            goto L_0x01e9
        L_0x0144:
            if (r8 <= 0) goto L_0x014b
            int r3 = r7.a()     // Catch:{ nja -> 0x0198 }
            goto L_0x014c
        L_0x014b:
            r3 = 0
        L_0x014c:
            boolean r4 = defpackage.aytd.g()     // Catch:{ nja -> 0x0198 }
            if (r4 == 0) goto L_0x0191
            xmz r4 = defpackage.xmz.d     // Catch:{ nja -> 0x0198 }
            aucd r4 = r4.o()     // Catch:{ nja -> 0x0198 }
            boolean r7 = r4.c     // Catch:{ nja -> 0x0198 }
            if (r7 != 0) goto L_0x015d
            goto L_0x0162
        L_0x015d:
            r4.c()     // Catch:{ nja -> 0x0198 }
            r4.c = r12     // Catch:{ nja -> 0x0198 }
        L_0x0162:
            aucj r7 = r4.b     // Catch:{ nja -> 0x0198 }
            xmz r7 = (defpackage.xmz) r7     // Catch:{ nja -> 0x0198 }
            int r14 = r7.a     // Catch:{ nja -> 0x0198 }
            r14 = r14 | r11
            r7.a = r14     // Catch:{ nja -> 0x0198 }
            r7.b = r8     // Catch:{ nja -> 0x0198 }
            r15 = 2
            r14 = r14 | r15
            r7.a = r14     // Catch:{ nja -> 0x0198 }
            r7.c = r3     // Catch:{ nja -> 0x0198 }
            boolean r7 = r13.c     // Catch:{ nja -> 0x0198 }
            if (r7 != 0) goto L_0x0178
            goto L_0x017d
        L_0x0178:
            r13.c()     // Catch:{ nja -> 0x0198 }
            r13.c = r12     // Catch:{ nja -> 0x0198 }
        L_0x017d:
            aucj r7 = r13.b     // Catch:{ nja -> 0x0198 }
            xna r7 = (defpackage.xna) r7     // Catch:{ nja -> 0x0198 }
            aucj r4 = r4.i()     // Catch:{ nja -> 0x0198 }
            xmz r4 = (defpackage.xmz) r4     // Catch:{ nja -> 0x0198 }
            r4.getClass()     // Catch:{ nja -> 0x0198 }
            r7.d = r4     // Catch:{ nja -> 0x0198 }
            int r4 = r7.a     // Catch:{ nja -> 0x0198 }
            r4 = r4 | r5
            r7.a = r4     // Catch:{ nja -> 0x0198 }
        L_0x0191:
            boolean r3 = defpackage.xvo.a((int) r8, (int) r3)     // Catch:{ nja -> 0x0198 }
            if (r3 != 0) goto L_0x01e9
            goto L_0x01a5
        L_0x0198:
            r0 = move-exception
            boolean r2 = defpackage.aytd.f()     // Catch:{ all -> 0x0748 }
            if (r2 == 0) goto L_0x01a5
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            a((defpackage.yaz) r10, (int) r2)     // Catch:{ all -> 0x0748 }
        L_0x01a5:
            xmy r2 = defpackage.xmy.m     // Catch:{ all -> 0x0748 }
            aucd r2 = r2.o()     // Catch:{ all -> 0x0748 }
            boolean r3 = r2.c     // Catch:{ all -> 0x0748 }
            if (r3 == 0) goto L_0x01b4
            r2.c()     // Catch:{ all -> 0x0748 }
            r2.c = r12     // Catch:{ all -> 0x0748 }
        L_0x01b4:
            aucj r3 = r2.b     // Catch:{ all -> 0x0748 }
            xmy r3 = (defpackage.xmy) r3     // Catch:{ all -> 0x0748 }
            r4 = 3
            r3.b = r4     // Catch:{ all -> 0x0748 }
            int r4 = r3.a     // Catch:{ all -> 0x0748 }
            r4 = r4 | r11
            r3.a = r4     // Catch:{ all -> 0x0748 }
            boolean r3 = r13.c     // Catch:{ all -> 0x0748 }
            if (r3 != 0) goto L_0x01c5
            goto L_0x01ca
        L_0x01c5:
            r13.c()     // Catch:{ all -> 0x0748 }
            r13.c = r12     // Catch:{ all -> 0x0748 }
        L_0x01ca:
            aucj r3 = r13.b     // Catch:{ all -> 0x0748 }
            xna r3 = (defpackage.xna) r3     // Catch:{ all -> 0x0748 }
            aucj r2 = r2.i()     // Catch:{ all -> 0x0748 }
            xmy r2 = (defpackage.xmy) r2     // Catch:{ all -> 0x0748 }
            r2.getClass()     // Catch:{ all -> 0x0748 }
            r3.c = r2     // Catch:{ all -> 0x0748 }
            int r2 = r3.a     // Catch:{ all -> 0x0748 }
            r4 = 2
            r2 = r2 | r4
            r3.a = r2     // Catch:{ all -> 0x0748 }
            java.lang.String r2 = "FSA2_GoogleAccountUtil"
            java.lang.String r3 = "Device is opt-in backup and sync but there are too many contacts."
            android.util.Log.w(r2, r3)     // Catch:{ all -> 0x0748 }
            r3 = r13
            goto L_0x0704
        L_0x01e9:
            aytd r3 = defpackage.aytd.a     // Catch:{ all -> 0x0748 }
            ayte r3 = r3.a()     // Catch:{ all -> 0x0748 }
            boolean r3 = r3.E()     // Catch:{ all -> 0x0748 }
            if (r3 == 0) goto L_0x0245
            java.lang.String r3 = r9.name     // Catch:{ all -> 0x0748 }
            wss r4 = defpackage.wss.a((android.content.Context) r27)     // Catch:{ all -> 0x0748 }
            int r3 = r4.g(r3)     // Catch:{ all -> 0x0748 }
            if (r3 > 0) goto L_0x0202
            goto L_0x0245
        L_0x0202:
            xmy r2 = defpackage.xmy.m     // Catch:{ all -> 0x0748 }
            aucd r2 = r2.o()     // Catch:{ all -> 0x0748 }
            boolean r3 = r2.c     // Catch:{ all -> 0x0748 }
            if (r3 == 0) goto L_0x0211
            r2.c()     // Catch:{ all -> 0x0748 }
            r2.c = r12     // Catch:{ all -> 0x0748 }
        L_0x0211:
            aucj r3 = r2.b     // Catch:{ all -> 0x0748 }
            xmy r3 = (defpackage.xmy) r3     // Catch:{ all -> 0x0748 }
            r3.b = r5     // Catch:{ all -> 0x0748 }
            int r4 = r3.a     // Catch:{ all -> 0x0748 }
            r4 = r4 | r11
            r3.a = r4     // Catch:{ all -> 0x0748 }
            boolean r3 = r13.c     // Catch:{ all -> 0x0748 }
            if (r3 != 0) goto L_0x0221
            goto L_0x0226
        L_0x0221:
            r13.c()     // Catch:{ all -> 0x0748 }
            r13.c = r12     // Catch:{ all -> 0x0748 }
        L_0x0226:
            aucj r3 = r13.b     // Catch:{ all -> 0x0748 }
            xna r3 = (defpackage.xna) r3     // Catch:{ all -> 0x0748 }
            aucj r2 = r2.i()     // Catch:{ all -> 0x0748 }
            xmy r2 = (defpackage.xmy) r2     // Catch:{ all -> 0x0748 }
            r2.getClass()     // Catch:{ all -> 0x0748 }
            r3.c = r2     // Catch:{ all -> 0x0748 }
            int r2 = r3.a     // Catch:{ all -> 0x0748 }
            r4 = 2
            r2 = r2 | r4
            r3.a = r2     // Catch:{ all -> 0x0748 }
            java.lang.String r2 = "FSA2_GoogleAccountUtil"
            java.lang.String r3 = "Device is opt-in backup and sync but last sync wasn't successful"
            android.util.Log.w(r2, r3)     // Catch:{ all -> 0x0748 }
            r3 = r13
            goto L_0x0704
        L_0x0245:
            java.lang.String r3 = r9.name     // Catch:{ all -> 0x0748 }
            xmy r3 = defpackage.xmy.m     // Catch:{ all -> 0x0748 }
            aucd r14 = r3.o()     // Catch:{ all -> 0x0748 }
            wmh r5 = new wmh     // Catch:{ all -> 0x0748 }
            wlz r3 = defpackage.ayql.b()     // Catch:{ all -> 0x0748 }
            r5.<init>(r3)     // Catch:{ all -> 0x0748 }
            wss r15 = defpackage.wss.a((android.content.Context) r27)     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            java.lang.String r3 = r9.name     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            android.content.SharedPreferences r4 = r15.a     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            java.lang.String r7 = "focus_last_device_contact_and_group_migrate_status_"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            int r8 = r3.length()     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            if (r8 != 0) goto L_0x0276
            java.lang.String r3 = new java.lang.String     // Catch:{ RemoteException -> 0x06da, all -> 0x0270 }
            r3.<init>(r7)     // Catch:{ RemoteException -> 0x06da, all -> 0x0270 }
            goto L_0x027a
        L_0x0270:
            r0 = move-exception
            r2 = r0
            r3 = r13
            r11 = r14
            goto L_0x0718
        L_0x0276:
            java.lang.String r3 = r7.concat(r3)     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
        L_0x027a:
            int r3 = r4.getInt(r3, r12)     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            int r3 = defpackage.xjt.a(r3)     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            if (r3 == 0) goto L_0x0285
            goto L_0x0286
        L_0x0285:
            r3 = 1
        L_0x0286:
            boolean r4 = r14.c     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            if (r4 != 0) goto L_0x028b
            goto L_0x0290
        L_0x028b:
            r14.c()     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            r14.c = r12     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
        L_0x0290:
            aucj r4 = r14.b     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            xmy r4 = (defpackage.xmy) r4     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            r7 = 2
            r4.b = r7     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            int r7 = r4.a     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            r7 = r7 | r11
            r4.a = r7     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            java.lang.String r4 = r9.name     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            r7 = 3
            r15.e(r4, r7)     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            xwi r4 = new xwi     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            android.content.ContentResolver r7 = r1.c     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            r4.<init>(r7, r9)     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            wmb r7 = defpackage.wmb.DEVICE     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            android.accounts.Account r8 = r4.b     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            java.lang.String r8 = r8.name     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            boolean r19 = defpackage.aytd.p()     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            if (r19 == 0) goto L_0x02c9
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ RemoteException -> 0x06da, all -> 0x0270 }
            java.lang.String r17 = "_id"
            r6[r12] = r17     // Catch:{ RemoteException -> 0x06da, all -> 0x0270 }
            java.lang.String r17 = "account_type"
            r6[r11] = r17     // Catch:{ RemoteException -> 0x06da, all -> 0x0270 }
            java.lang.String r17 = "data_set"
            r18 = 2
            r6[r18] = r17     // Catch:{ RemoteException -> 0x06da, all -> 0x0270 }
            r22 = r6
            goto L_0x02d8
        L_0x02c9:
            r6 = 2
            java.lang.String[] r11 = new java.lang.String[r6]     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            java.lang.String r6 = "_id"
            r11[r12] = r6     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            java.lang.String r6 = "account_type"
            r17 = 1
            r11[r17] = r6     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            r22 = r11
        L_0x02d8:
            android.content.ContentResolver r6 = r4.a     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            android.net.Uri r21 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            java.lang.String r11 = "account_type != \"com.google\""
            boolean r20 = defpackage.aytd.l()     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            if (r20 == 0) goto L_0x02e6
            java.lang.String r11 = "account_type != \"com.google\" AND (sourceid IS NULL AND sync1 IS NULL AND sync2 IS NULL AND sync3 IS NULL AND sync4 IS NULL ) "
        L_0x02e6:
            boolean r20 = defpackage.aytd.k()     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            if (r20 != 0) goto L_0x02ef
            r23 = r11
            goto L_0x02f7
        L_0x02ef:
            java.lang.String r12 = " AND (data_set IS NULL ) "
            java.lang.String r11 = r11.concat(r12)     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            r23 = r11
        L_0x02f7:
            java.lang.String[] r11 = defpackage.xvw.a     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            r24 = 0
            r25 = 0
            r20 = r6
            android.database.Cursor r6 = r20.query(r21, r22, r23, r24, r25)     // Catch:{ RemoteException -> 0x06da, all -> 0x06d5 }
            if (r6 == 0) goto L_0x068c
            android.accounts.Account r11 = r4.b     // Catch:{ all -> 0x066a }
            java.lang.String r11 = r11.type     // Catch:{ all -> 0x066a }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x066a }
            r12.<init>()     // Catch:{ all -> 0x066a }
            java.lang.String r10 = "account_name"
            r12.put(r10, r8)     // Catch:{ all -> 0x066a }
            java.lang.String r10 = "account_type"
            r12.put(r10, r11)     // Catch:{ all -> 0x066a }
            aytd r10 = defpackage.aytd.a     // Catch:{ all -> 0x066a }
            ayte r10 = r10.a()     // Catch:{ all -> 0x066a }
            boolean r10 = r10.x()     // Catch:{ all -> 0x066a }
            if (r10 != 0) goto L_0x0325
            goto L_0x032a
        L_0x0325:
            java.lang.String r10 = "sourceid"
            r12.putNull(r10)     // Catch:{ all -> 0x066a }
        L_0x032a:
            aytd r10 = defpackage.aytd.a     // Catch:{ all -> 0x066a }
            ayte r10 = r10.a()     // Catch:{ all -> 0x066a }
            boolean r10 = r10.w()     // Catch:{ all -> 0x066a }
            if (r10 != 0) goto L_0x0337
            goto L_0x033c
        L_0x0337:
            java.lang.String r10 = "data_set"
            r12.putNull(r10)     // Catch:{ all -> 0x066a }
        L_0x033c:
            wvq r10 = defpackage.wvq.d     // Catch:{ all -> 0x066a }
            aucd r10 = r10.o()     // Catch:{ all -> 0x066a }
            xse r11 = defpackage.xse.c     // Catch:{ all -> 0x066a }
            aucd r11 = r11.o()     // Catch:{ all -> 0x066a }
            r20 = r13
            wmb r13 = defpackage.wmb.DEVICE     // Catch:{ all -> 0x0665 }
            boolean r2 = r11.c     // Catch:{ all -> 0x0665 }
            if (r2 != 0) goto L_0x0351
            goto L_0x0357
        L_0x0351:
            r11.c()     // Catch:{ all -> 0x0665 }
            r2 = 0
            r11.c = r2     // Catch:{ all -> 0x0665 }
        L_0x0357:
            aucj r2 = r11.b     // Catch:{ all -> 0x0665 }
            xse r2 = (defpackage.xse) r2     // Catch:{ all -> 0x0665 }
            int r13 = r13.j     // Catch:{ all -> 0x0665 }
            r2.b = r13     // Catch:{ all -> 0x0665 }
            int r13 = r2.a     // Catch:{ all -> 0x0665 }
            r17 = 1
            r13 = r13 | 1
            r2.a = r13     // Catch:{ all -> 0x0665 }
            aucj r2 = r11.i()     // Catch:{ all -> 0x0665 }
            xse r2 = (defpackage.xse) r2     // Catch:{ all -> 0x0665 }
            boolean r11 = r10.c     // Catch:{ all -> 0x0665 }
            if (r11 != 0) goto L_0x0372
            goto L_0x0378
        L_0x0372:
            r10.c()     // Catch:{ all -> 0x0665 }
            r11 = 0
            r10.c = r11     // Catch:{ all -> 0x0665 }
        L_0x0378:
            aucj r11 = r10.b     // Catch:{ all -> 0x0665 }
            wvq r11 = (defpackage.wvq) r11     // Catch:{ all -> 0x0665 }
            r2.getClass()     // Catch:{ all -> 0x0665 }
            r11.b = r2     // Catch:{ all -> 0x0665 }
            int r2 = r11.a     // Catch:{ all -> 0x0665 }
            r13 = 1
            r2 = r2 | r13
            r11.a = r2     // Catch:{ all -> 0x0665 }
            aucj r2 = r10.i()     // Catch:{ all -> 0x0665 }
            wvq r2 = (defpackage.wvq) r2     // Catch:{ all -> 0x0665 }
            byte[] r2 = r2.k()     // Catch:{ all -> 0x0665 }
            aytd r10 = defpackage.aytd.a     // Catch:{ all -> 0x0665 }
            ayte r10 = r10.a()     // Catch:{ all -> 0x0665 }
            boolean r10 = r10.H()     // Catch:{ all -> 0x0665 }
            if (r10 == 0) goto L_0x03c3
            aytd r10 = defpackage.aytd.a     // Catch:{ all -> 0x03bc }
            ayte r10 = r10.a()     // Catch:{ all -> 0x03bc }
            boolean r10 = r10.I()     // Catch:{ all -> 0x03bc }
            if (r10 == 0) goto L_0x03b6
            java.lang.String r10 = "sync1"
            r11 = 2
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r11)     // Catch:{ all -> 0x03bc }
            r12.put(r10, r2)     // Catch:{ all -> 0x03bc }
            r2 = 1
            r10 = 0
            goto L_0x03c5
        L_0x03b6:
            java.lang.String r10 = "sync1"
            r12.put(r10, r2)     // Catch:{ all -> 0x03bc }
            goto L_0x03c3
        L_0x03bc:
            r0 = move-exception
            r2 = r0
            r11 = r14
            r3 = r20
            goto L_0x066e
        L_0x03c3:
            r2 = 1
            r10 = 0
        L_0x03c5:
            boolean r11 = r6.moveToNext()     // Catch:{ all -> 0x065f }
            if (r11 == 0) goto L_0x0484
            aytd r11 = defpackage.aytd.a     // Catch:{ all -> 0x047d }
            ayte r11 = r11.a()     // Catch:{ all -> 0x047d }
            boolean r11 = r11.a()     // Catch:{ all -> 0x047d }
            if (r11 != 0) goto L_0x03d9
            r11 = r14
            goto L_0x03ed
        L_0x03d9:
            r11 = r14
            long r13 = (long) r10
            aytd r21 = defpackage.aytd.a     // Catch:{ all -> 0x047b }
            ayte r21 = r21.a()     // Catch:{ all -> 0x047b }
            long r21 = r21.s()     // Catch:{ all -> 0x047b }
            int r23 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r23 < 0) goto L_0x03ed
            r14 = r3
            r2 = 0
            goto L_0x0487
        L_0x03ed:
            r13 = 1
            java.lang.String r14 = r6.getString(r13)     // Catch:{ all -> 0x047b }
            boolean r13 = defpackage.aytd.p()     // Catch:{ all -> 0x047b }
            if (r13 == 0) goto L_0x0401
            r13 = 2
            java.lang.String r21 = r6.getString(r13)     // Catch:{ all -> 0x047b }
            r13 = r21
            goto L_0x0402
        L_0x0401:
            r13 = 0
        L_0x0402:
            com.google.android.gms.people.account.categories.ClassifyAccountTypeResult r13 = r5.a(r14, r13)     // Catch:{ all -> 0x047b }
            wmb r13 = r13.c     // Catch:{ all -> 0x047b }
            if (r13 != r7) goto L_0x0476
            wmb r13 = defpackage.wmb.DEVICE     // Catch:{ all -> 0x047b }
            if (r7 == r13) goto L_0x040f
            goto L_0x0442
        L_0x040f:
            if (r2 == 0) goto L_0x0442
            boolean r2 = r15.n(r8)     // Catch:{ all -> 0x047b }
            if (r2 != 0) goto L_0x0441
            r2 = 0
            defpackage.iva.b((java.lang.String) r2)     // Catch:{ all -> 0x047b }
            android.content.SharedPreferences r2 = r15.a     // Catch:{ all -> 0x047b }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x047b }
            java.lang.String r13 = "focus_seen_device_contacts_before_"
            java.lang.String r14 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x047b }
            int r21 = r14.length()     // Catch:{ all -> 0x047b }
            if (r21 != 0) goto L_0x0433
            java.lang.String r14 = new java.lang.String     // Catch:{ all -> 0x047b }
            r14.<init>(r13)     // Catch:{ all -> 0x047b }
            goto L_0x0437
        L_0x0433:
            java.lang.String r14 = r13.concat(r14)     // Catch:{ all -> 0x047b }
        L_0x0437:
            r13 = 1
            android.content.SharedPreferences$Editor r2 = r2.putBoolean(r14, r13)     // Catch:{ all -> 0x047b }
            r2.commit()     // Catch:{ all -> 0x047b }
            r2 = 0
            goto L_0x0442
        L_0x0441:
            r2 = 0
        L_0x0442:
            r21 = r2
            r14 = r3
            r13 = 0
            long r2 = r6.getLong(r13)     // Catch:{ all -> 0x047b }
            android.net.Uri r13 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x047b }
            android.net.Uri r2 = android.content.ContentUris.withAppendedId(r13, r2)     // Catch:{ all -> 0x047b }
            aytd r3 = defpackage.aytd.a     // Catch:{ all -> 0x047b }
            ayte r3 = r3.a()     // Catch:{ all -> 0x047b }
            r3.Q()     // Catch:{ all -> 0x047b }
            ayta r3 = defpackage.ayta.a     // Catch:{ all -> 0x047b }
            aytb r3 = r3.a()     // Catch:{ all -> 0x047b }
            boolean r3 = r3.f()     // Catch:{ all -> 0x047b }
            if (r3 != 0) goto L_0x046b
            int r10 = r10 + 1
            r2 = r21
            goto L_0x0477
        L_0x046b:
            r3 = 0
            int r2 = r4.a((android.net.Uri) r2, (android.content.ContentValues) r12, (java.lang.String) r3)     // Catch:{ all -> 0x047b }
            if (r2 <= 0) goto L_0x0473
            int r10 = r10 + r2
        L_0x0473:
            r2 = r21
            goto L_0x0477
        L_0x0476:
            r14 = r3
        L_0x0477:
            r3 = r14
            r14 = r11
            goto L_0x03c5
        L_0x047b:
            r0 = move-exception
            goto L_0x047f
        L_0x047d:
            r0 = move-exception
            r11 = r14
        L_0x047f:
            r2 = r0
            r3 = r20
            goto L_0x066f
        L_0x0484:
            r11 = r14
            r14 = r3
            r2 = 1
        L_0x0487:
            if (r10 > 0) goto L_0x048a
            goto L_0x04a1
        L_0x048a:
            boolean r3 = r11.c     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            if (r3 != 0) goto L_0x048f
            goto L_0x0495
        L_0x048f:
            r11.c()     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            r3 = 0
            r11.c = r3     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
        L_0x0495:
            aucj r3 = r11.b     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            xmy r3 = (defpackage.xmy) r3     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            int r4 = r3.a     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            r12 = 2
            r4 = r4 | r12
            r3.a = r4     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            r3.c = r10     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
        L_0x04a1:
            r6.close()     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            java.lang.String r3 = "FSA2_DeviceContactsMigrater"
            java.lang.String r4 = "Moved %d %s contacts to Google"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            defpackage.xdt.a((java.lang.String) r3, (java.lang.String) r4, (java.lang.Object) r6, (java.lang.Object) r7)     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            aysu r3 = defpackage.aysu.a     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            aysv r3 = r3.a()     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            boolean r3 = r3.c()     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            if (r3 == 0) goto L_0x04bc
            goto L_0x04c1
        L_0x04bc:
            r3 = 0
            defpackage.xwi.a((java.lang.String) r8, (int) r10, (defpackage.yaz) r3)     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
        L_0x04c1:
            xwg r12 = new xwg     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            r12.<init>(r10, r2)     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            boolean r2 = r12.b     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            if (r2 != 0) goto L_0x04e1
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            r2.<init>()     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            java.lang.String r3 = "upload"
            r4 = 1
            r2.putBoolean(r3, r4)     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            java.lang.String r3 = "com.android.contacts"
            android.content.ContentResolver.requestSync(r9, r3, r2)     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            goto L_0x04e1
        L_0x04db:
            r0 = move-exception
            r2 = r0
            r3 = r20
            goto L_0x0718
        L_0x04e1:
            aytd r2 = defpackage.aytd.a     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            ayte r2 = r2.a()     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            boolean r2 = r2.v()     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            if (r2 != 0) goto L_0x04ef
            goto L_0x059c
        L_0x04ef:
            java.lang.String r2 = r9.name     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            int r3 = r12.a     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            int r4 = defpackage.xwk.a     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            aytd r4 = defpackage.aytd.a     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            ayte r4 = r4.a()     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            boolean r4 = r4.M()     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            if (r4 == 0) goto L_0x0502
            goto L_0x0567
        L_0x0502:
            if (r3 > 0) goto L_0x0567
            boolean r3 = r15.n(r2)     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            if (r3 == 0) goto L_0x059c
            r3 = r14
            r4 = 2
            if (r3 != r4) goto L_0x0567
            android.content.SharedPreferences r3 = r15.a     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            java.lang.String r4 = "focus_last_group_migration_start_time_"
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            int r7 = r6.length()     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            if (r7 != 0) goto L_0x0522
            java.lang.String r6 = new java.lang.String     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            r6.<init>(r4)     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            goto L_0x0526
        L_0x0522:
            java.lang.String r6 = r4.concat(r6)     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
        L_0x0526:
            r7 = 0
            long r3 = r3.getLong(r6, r7)     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            long r3 = r6 - r3
            aytd r8 = defpackage.aytd.a     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            ayte r8 = r8.a()     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            long r13 = r8.A()     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            r21 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r21
            int r8 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x059c
            android.content.SharedPreferences r3 = r15.a     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            java.lang.String r4 = "focus_last_group_migration_start_time_"
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            int r8 = r2.length()     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            if (r8 != 0) goto L_0x055c
            java.lang.String r2 = new java.lang.String     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            r2.<init>(r4)     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            goto L_0x0560
        L_0x055c:
            java.lang.String r2 = r4.concat(r2)     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
        L_0x0560:
            android.content.SharedPreferences$Editor r2 = r3.putLong(r2, r6)     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            r2.apply()     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
        L_0x0567:
            xwk r2 = new xwk     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            android.content.ContentResolver r4 = r1.c     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            r3 = r2
            r6 = r28
            r7 = r29
            r8 = r11
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            java.lang.String r3 = "account_type!='com.google' AND system_id IS NULL AND group_is_read_only IS 0"
            xwb r3 = r2.a((java.lang.String) r3)     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            java.util.Map r3 = r2.a((defpackage.xwb) r3)     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            r4 = 0
            r2.a(r3, r4)     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            aytd r3 = defpackage.aytd.a     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            ayte r3 = r3.a()     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            boolean r3 = r3.t()     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            if (r3 == 0) goto L_0x059c
            java.lang.String r3 = "account_type != \"com.google\" AND deleted = 0 AND (group_is_read_only = 1 OR system_id IS NOT NULL)"
            xwb r3 = r2.a((java.lang.String) r3)     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            java.util.Map r3 = r2.a((defpackage.xwb) r3)     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            r4 = 1
            r2.a(r3, r4)     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
        L_0x059c:
            aytd r2 = defpackage.aytd.a     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            ayte r2 = r2.a()     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            boolean r2 = r2.n()     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            if (r2 != 0) goto L_0x05a9
            goto L_0x05ee
        L_0x05a9:
            xvo r2 = new xvo     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            r3 = r27
            r2.<init>(r3)     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            int r2 = r2.b()     // Catch:{ nja -> 0x05cc }
            boolean r3 = r11.c     // Catch:{ nja -> 0x05cc }
            if (r3 != 0) goto L_0x05b9
            goto L_0x05bf
        L_0x05b9:
            r11.c()     // Catch:{ nja -> 0x05cc }
            r3 = 0
            r11.c = r3     // Catch:{ nja -> 0x05cc }
        L_0x05bf:
            aucj r3 = r11.b     // Catch:{ nja -> 0x05cc }
            xmy r3 = (defpackage.xmy) r3     // Catch:{ nja -> 0x05cc }
            int r4 = r3.a     // Catch:{ nja -> 0x05cc }
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            r3.a = r4     // Catch:{ nja -> 0x05cc }
            r3.l = r2     // Catch:{ nja -> 0x05cc }
            goto L_0x05ee
        L_0x05cc:
            r0 = move-exception
            boolean r2 = r11.c     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            if (r2 != 0) goto L_0x05d2
            goto L_0x05d8
        L_0x05d2:
            r11.c()     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            r2 = 0
            r11.c = r2     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
        L_0x05d8:
            aucj r2 = r11.b     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            xmy r2 = (defpackage.xmy) r2     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            int r3 = r2.a     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            r2.a = r3     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r2.l = r3     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            java.lang.String r2 = "FSA2_GoogleAccountUtil"
            java.lang.String r3 = "Cannot query the device contact count after sweep."
            android.util.Log.e(r2, r3)     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
        L_0x05ee:
            aytd r2 = defpackage.aytd.a     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            ayte r2 = r2.a()     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            boolean r2 = r2.p()     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            if (r2 == 0) goto L_0x0617
            boolean r2 = r12.b     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            if (r2 != 0) goto L_0x0617
            boolean r2 = r11.c     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            if (r2 != 0) goto L_0x0603
            goto L_0x0609
        L_0x0603:
            r11.c()     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            r2 = 0
            r11.c = r2     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
        L_0x0609:
            aucj r2 = r11.b     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            xmy r2 = (defpackage.xmy) r2     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            r3 = 5
            r2.b = r3     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            int r3 = r2.a     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            r4 = 1
            r3 = r3 | r4
            r2.a = r3     // Catch:{ RemoteException -> 0x065a, all -> 0x04db }
            goto L_0x062f
        L_0x0617:
            boolean r2 = r11.c     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            if (r2 != 0) goto L_0x061c
        L_0x061b:
            goto L_0x0623
        L_0x061c:
            r11.c()     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            r2 = 0
            r11.c = r2     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            goto L_0x061b
        L_0x0623:
            aucj r2 = r11.b     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            xmy r2 = (defpackage.xmy) r2     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            r3 = 1
            r2.b = r3     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            int r4 = r2.a     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            r3 = r3 | r4
            r2.a = r3     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
        L_0x062f:
            java.lang.String r2 = r9.name     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            r3 = 2
            r15.e(r2, r3)     // Catch:{ RemoteException -> 0x065a, all -> 0x0655 }
            aucj r2 = r11.i()     // Catch:{ all -> 0x0748 }
            xmy r2 = (defpackage.xmy) r2     // Catch:{ all -> 0x0748 }
            r3 = r20
            boolean r4 = r3.c     // Catch:{ all -> 0x0748 }
            if (r4 != 0) goto L_0x0642
            goto L_0x0648
        L_0x0642:
            r3.c()     // Catch:{ all -> 0x0748 }
            r4 = 0
            r3.c = r4     // Catch:{ all -> 0x0748 }
        L_0x0648:
            aucj r4 = r3.b     // Catch:{ all -> 0x0748 }
            xna r4 = (defpackage.xna) r4     // Catch:{ all -> 0x0748 }
            r2.getClass()     // Catch:{ all -> 0x0748 }
            r4.c = r2     // Catch:{ all -> 0x0748 }
            int r2 = r4.a     // Catch:{ all -> 0x0748 }
            goto L_0x0700
        L_0x0655:
            r0 = move-exception
            r3 = r20
            goto L_0x06d8
        L_0x065a:
            r0 = move-exception
            r3 = r20
            goto L_0x06dd
        L_0x065f:
            r0 = move-exception
            r11 = r14
            r3 = r20
            r2 = r0
            goto L_0x066f
        L_0x0665:
            r0 = move-exception
            r11 = r14
            r3 = r20
            goto L_0x066d
        L_0x066a:
            r0 = move-exception
            r3 = r13
            r11 = r14
        L_0x066d:
            r2 = r0
        L_0x066e:
            r10 = 0
        L_0x066f:
            if (r10 <= 0) goto L_0x0688
            boolean r4 = r11.c     // Catch:{ RemoteException -> 0x06d3 }
            if (r4 != 0) goto L_0x0676
            goto L_0x067c
        L_0x0676:
            r11.c()     // Catch:{ RemoteException -> 0x06d3 }
            r4 = 0
            r11.c = r4     // Catch:{ RemoteException -> 0x06d3 }
        L_0x067c:
            aucj r4 = r11.b     // Catch:{ RemoteException -> 0x06d3 }
            xmy r4 = (defpackage.xmy) r4     // Catch:{ RemoteException -> 0x06d3 }
            int r5 = r4.a     // Catch:{ RemoteException -> 0x06d3 }
            r7 = 2
            r5 = r5 | r7
            r4.a = r5     // Catch:{ RemoteException -> 0x06d3 }
            r4.c = r10     // Catch:{ RemoteException -> 0x06d3 }
        L_0x0688:
            r6.close()     // Catch:{ RemoteException -> 0x06d3 }
            throw r2     // Catch:{ RemoteException -> 0x06d3 }
        L_0x068c:
            r3 = r13
            r11 = r14
            xmx r2 = defpackage.xmx.c     // Catch:{ RemoteException -> 0x06d3 }
            aucd r2 = r2.o()     // Catch:{ RemoteException -> 0x06d3 }
            boolean r4 = r2.c     // Catch:{ RemoteException -> 0x06d3 }
            if (r4 != 0) goto L_0x0699
            goto L_0x069f
        L_0x0699:
            r2.c()     // Catch:{ RemoteException -> 0x06d3 }
            r4 = 0
            r2.c = r4     // Catch:{ RemoteException -> 0x06d3 }
        L_0x069f:
            aucj r4 = r2.b     // Catch:{ RemoteException -> 0x06d3 }
            xmx r4 = (defpackage.xmx) r4     // Catch:{ RemoteException -> 0x06d3 }
            r5 = 1
            r4.b = r5     // Catch:{ RemoteException -> 0x06d3 }
            int r6 = r4.a     // Catch:{ RemoteException -> 0x06d3 }
            r5 = r5 | r6
            r4.a = r5     // Catch:{ RemoteException -> 0x06d3 }
            aucj r2 = r2.i()     // Catch:{ RemoteException -> 0x06d3 }
            xmx r2 = (defpackage.xmx) r2     // Catch:{ RemoteException -> 0x06d3 }
            boolean r4 = r11.c     // Catch:{ RemoteException -> 0x06d3 }
            if (r4 != 0) goto L_0x06b6
            goto L_0x06bc
        L_0x06b6:
            r11.c()     // Catch:{ RemoteException -> 0x06d3 }
            r4 = 0
            r11.c = r4     // Catch:{ RemoteException -> 0x06d3 }
        L_0x06bc:
            aucj r4 = r11.b     // Catch:{ RemoteException -> 0x06d3 }
            xmy r4 = (defpackage.xmy) r4     // Catch:{ RemoteException -> 0x06d3 }
            r2.getClass()     // Catch:{ RemoteException -> 0x06d3 }
            r4.k = r2     // Catch:{ RemoteException -> 0x06d3 }
            int r2 = r4.a     // Catch:{ RemoteException -> 0x06d3 }
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r4.a = r2     // Catch:{ RemoteException -> 0x06d3 }
            android.os.RemoteException r2 = new android.os.RemoteException     // Catch:{ RemoteException -> 0x06d3 }
            java.lang.String r4 = "Unable to query CP2"
            r2.<init>(r4)     // Catch:{ RemoteException -> 0x06d3 }
            throw r2     // Catch:{ RemoteException -> 0x06d3 }
        L_0x06d3:
            r0 = move-exception
            goto L_0x06dd
        L_0x06d5:
            r0 = move-exception
            r3 = r13
            r11 = r14
        L_0x06d8:
            r2 = r0
            goto L_0x0718
        L_0x06da:
            r0 = move-exception
            r3 = r13
            r11 = r14
        L_0x06dd:
            java.lang.String r2 = "FSA2_GoogleAccountUtil"
            java.lang.String r4 = "@prepareToSync Failed to migrate the groups."
            android.util.Log.e(r2, r4)     // Catch:{ all -> 0x0716 }
            aucj r2 = r11.i()     // Catch:{ all -> 0x0748 }
            xmy r2 = (defpackage.xmy) r2     // Catch:{ all -> 0x0748 }
            boolean r4 = r3.c     // Catch:{ all -> 0x0748 }
            if (r4 != 0) goto L_0x06ef
            goto L_0x06f5
        L_0x06ef:
            r3.c()     // Catch:{ all -> 0x0748 }
            r4 = 0
            r3.c = r4     // Catch:{ all -> 0x0748 }
        L_0x06f5:
            aucj r4 = r3.b     // Catch:{ all -> 0x0748 }
            xna r4 = (defpackage.xna) r4     // Catch:{ all -> 0x0748 }
            r2.getClass()     // Catch:{ all -> 0x0748 }
            r4.c = r2     // Catch:{ all -> 0x0748 }
            int r2 = r4.a     // Catch:{ all -> 0x0748 }
        L_0x0700:
            r5 = 2
            r2 = r2 | r5
            r4.a = r2     // Catch:{ all -> 0x0748 }
        L_0x0704:
            aucj r2 = r3.i()     // Catch:{ all -> 0x0748 }
            xna r2 = (defpackage.xna) r2     // Catch:{ all -> 0x0748 }
            amri r2 = defpackage.amri.b(r2)     // Catch:{ all -> 0x0748 }
            r3 = r29
            ybh r3 = (defpackage.ybh) r3     // Catch:{ all -> 0x0748 }
            r3.x = r2     // Catch:{ all -> 0x0748 }
            monitor-exit(r26)
            return
        L_0x0716:
            r0 = move-exception
            goto L_0x06d8
        L_0x0718:
            aucj r4 = r11.i()     // Catch:{ all -> 0x0748 }
            xmy r4 = (defpackage.xmy) r4     // Catch:{ all -> 0x0748 }
            boolean r5 = r3.c     // Catch:{ all -> 0x0748 }
            if (r5 != 0) goto L_0x0723
            goto L_0x0729
        L_0x0723:
            r3.c()     // Catch:{ all -> 0x0748 }
            r5 = 0
            r3.c = r5     // Catch:{ all -> 0x0748 }
        L_0x0729:
            aucj r3 = r3.b     // Catch:{ all -> 0x0748 }
            xna r3 = (defpackage.xna) r3     // Catch:{ all -> 0x0748 }
            r4.getClass()     // Catch:{ all -> 0x0748 }
            r3.c = r4     // Catch:{ all -> 0x0748 }
            int r4 = r3.a     // Catch:{ all -> 0x0748 }
            r5 = 2
            r4 = r4 | r5
            r3.a = r4     // Catch:{ all -> 0x0748 }
            throw r2     // Catch:{ all -> 0x0748 }
        L_0x0739:
            monitor-exit(r26)
            return
        L_0x073b:
            xye r2 = new xye     // Catch:{ all -> 0x0748 }
            android.os.RemoteException r3 = new android.os.RemoteException     // Catch:{ all -> 0x0748 }
            java.lang.String r4 = "Unable to query CP2"
            r3.<init>(r4)     // Catch:{ all -> 0x0748 }
            r2.<init>(r3)     // Catch:{ all -> 0x0748 }
            throw r2     // Catch:{ all -> 0x0748 }
        L_0x0748:
            r0 = move-exception
            r2 = r0
            monitor-exit(r26)
            goto L_0x074d
        L_0x074c:
            throw r2
        L_0x074d:
            goto L_0x074c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwm.a(android.content.Context, android.accounts.Account, yaz):void");
    }
}
