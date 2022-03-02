package com.google.android.gms.people.service.galprovider;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.util.Log;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayDeque;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PeopleGalChimeraProvider extends ContentProvider {
    private static final UriMatcher b;
    public xpp a;
    private final ArrayDeque c = new ArrayDeque();
    private qub d;
    private Context e;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "directories", 0);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "contacts/filter/*", 1);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "contacts/lookup/*/entities", 2);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "contacts/lookup/*/#/entities", 3);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "data/emails/filter/*", 4);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "data/phones/filter/*", 5);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "phone_lookup/*", 6);
        b = uriMatcher;
    }

    public PeopleGalChimeraProvider() {
    }

    private final Cursor a(Uri uri, int i, String[] strArr, String str, Account account, aucd aucd) {
        boolean z;
        String queryParameter = uri.getQueryParameter("limit");
        long a2 = ayuk.a.a().a();
        if (queryParameter != null) {
            try {
                a2 = Long.parseLong(queryParameter);
            } catch (NumberFormatException e2) {
                StringBuilder sb = new StringBuilder(queryParameter.length() + 34);
                sb.append("query: invalid limit parameter: '");
                sb.append(queryParameter);
                sb.append("'");
                Log.e("PeopleGalProvider", sb.toString());
            }
        }
        long j = a2;
        if (i == 5) {
            z = true;
        } else {
            z = false;
        }
        return (Cursor) xpv.a(this.c, new xqc(this, i, strArr, account, Uri.encode(uri.getLastPathSegment()), str, j, z, aucd), "GalFilterThread", ayuk.f());
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final String getType(Uri uri) {
        if (b.match(uri) == 1) {
            return "vnd.android.cursor.item/contact";
        }
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public final boolean onCreate() {
        Context context = this.e;
        if (context == null) {
            context = getContext();
        }
        this.e = context;
        this.d = qub.a(context);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x0198  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri r10, java.lang.String r11) {
        /*
            r9 = this;
            ayuk r0 = defpackage.ayuk.a
            ayul r0 = r0.a()
            boolean r0 = r0.f()
            r1 = 0
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = java.lang.String.valueOf(r10)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 13
            r3.<init>(r2)
            java.lang.String r2 = "openFile uri="
            r3.append(r2)
            r3.append(r0)
            r3.toString()
            xlj r0 = defpackage.xlj.g
            aucd r0 = r0.o()
            boolean r2 = r0.c
            r3 = 0
            if (r2 != 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            r0.c()
            r0.c = r3
        L_0x003c:
            aucj r2 = r0.b
            xlj r2 = (defpackage.xlj) r2
            r4 = 8
            r2.b = r4
            int r4 = r2.a
            r5 = 1
            r4 = r4 | r5
            r2.a = r4
            r2 = 2
            java.lang.String r4 = "account_name"
            java.lang.String r4 = r10.getQueryParameter(r4)     // Catch:{ all -> 0x0183 }
            android.accounts.Account r4 = r9.a(r4, r0)     // Catch:{ all -> 0x0183 }
            if (r4 != 0) goto L_0x0089
            aucj r10 = r0.b
            xlj r10 = (defpackage.xlj) r10
            int r10 = r10.c
            int r10 = defpackage.xka.a(r10)
            if (r10 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            if (r10 != r5) goto L_0x007b
        L_0x0066:
            boolean r10 = r0.c
            if (r10 != 0) goto L_0x006b
            goto L_0x0070
        L_0x006b:
            r0.c()
            r0.c = r3
        L_0x0070:
            aucj r10 = r0.b
            xlj r10 = (defpackage.xlj) r10
            r10.c = r5
            int r11 = r10.a
            r11 = r11 | r2
            r10.a = r11
        L_0x007b:
            wml r10 = defpackage.wml.a()
            aucj r11 = r0.i()
            xlj r11 = (defpackage.xlj) r11
            r10.a((defpackage.xlj) r11, (java.lang.String) r1)
            return r1
        L_0x0089:
            java.lang.String r6 = r4.name     // Catch:{ all -> 0x0183 }
            java.lang.String r7 = "r"
            boolean r11 = r7.equals(r11)     // Catch:{ all -> 0x0180 }
            java.lang.String r7 = "PeopleGalProvider"
            if (r11 == 0) goto L_0x0132
            android.content.Context r11 = r9.e     // Catch:{ all -> 0x0180 }
            xuu r11 = defpackage.xuu.a(r11)     // Catch:{ all -> 0x0180 }
            boolean r11 = r11.a()     // Catch:{ all -> 0x0180 }
            if (r11 != 0) goto L_0x00ed
            boolean r10 = r0.c     // Catch:{ all -> 0x0180 }
            if (r10 != 0) goto L_0x00a6
            goto L_0x00ab
        L_0x00a6:
            r0.c()     // Catch:{ all -> 0x0180 }
            r0.c = r3     // Catch:{ all -> 0x0180 }
        L_0x00ab:
            aucj r10 = r0.b     // Catch:{ all -> 0x0180 }
            xlj r10 = (defpackage.xlj) r10     // Catch:{ all -> 0x0180 }
            r10.c = r2     // Catch:{ all -> 0x0180 }
            int r11 = r10.a     // Catch:{ all -> 0x0180 }
            r11 = r11 | r2
            r10.a = r11     // Catch:{ all -> 0x0180 }
            java.lang.String r10 = "Don't have Contacts permission."
            android.util.Log.e(r7, r10)     // Catch:{ all -> 0x0180 }
            aucj r10 = r0.b
            xlj r10 = (defpackage.xlj) r10
            int r10 = r10.c
            int r10 = defpackage.xka.a(r10)
            if (r10 != 0) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            if (r10 != r5) goto L_0x00df
        L_0x00ca:
            boolean r10 = r0.c
            if (r10 != 0) goto L_0x00cf
            goto L_0x00d4
        L_0x00cf:
            r0.c()
            r0.c = r3
        L_0x00d4:
            aucj r10 = r0.b
            xlj r10 = (defpackage.xlj) r10
            r10.c = r5
            int r11 = r10.a
            r11 = r11 | r2
            r10.a = r11
        L_0x00df:
            wml r10 = defpackage.wml.a()
            aucj r11 = r0.i()
            xlj r11 = (defpackage.xlj) r11
            r10.a((defpackage.xlj) r11, (java.lang.String) r6)
            return r1
        L_0x00ed:
            java.util.ArrayDeque r11 = r9.c     // Catch:{ all -> 0x0180 }
            xqb r1 = new xqb     // Catch:{ all -> 0x0180 }
            r1.<init>(r9, r10, r4, r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r10 = "GalOpenFileThread"
            long r7 = defpackage.ayuk.i()     // Catch:{ all -> 0x0180 }
            java.lang.Object r10 = defpackage.xpv.a(r11, r1, r10, r7)     // Catch:{ all -> 0x0180 }
            android.os.ParcelFileDescriptor r10 = (android.os.ParcelFileDescriptor) r10     // Catch:{ all -> 0x0180 }
            aucj r11 = r0.b
            xlj r11 = (defpackage.xlj) r11
            int r11 = r11.c
            int r11 = defpackage.xka.a(r11)
            if (r11 != 0) goto L_0x010d
            goto L_0x010f
        L_0x010d:
            if (r11 != r5) goto L_0x0124
        L_0x010f:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x0114
            goto L_0x0119
        L_0x0114:
            r0.c()
            r0.c = r3
        L_0x0119:
            aucj r11 = r0.b
            xlj r11 = (defpackage.xlj) r11
            r11.c = r5
            int r1 = r11.a
            r1 = r1 | r2
            r11.a = r1
        L_0x0124:
            wml r11 = defpackage.wml.a()
            aucj r0 = r0.i()
            xlj r0 = (defpackage.xlj) r0
            r11.a((defpackage.xlj) r0, (java.lang.String) r6)
            return r10
        L_0x0132:
            boolean r10 = r0.c     // Catch:{ all -> 0x0180 }
            if (r10 != 0) goto L_0x0137
            goto L_0x013c
        L_0x0137:
            r0.c()     // Catch:{ all -> 0x0180 }
            r0.c = r3     // Catch:{ all -> 0x0180 }
        L_0x013c:
            aucj r10 = r0.b     // Catch:{ all -> 0x0180 }
            xlj r10 = (defpackage.xlj) r10     // Catch:{ all -> 0x0180 }
            r11 = 10
            r10.c = r11     // Catch:{ all -> 0x0180 }
            int r11 = r10.a     // Catch:{ all -> 0x0180 }
            r11 = r11 | r2
            r10.a = r11     // Catch:{ all -> 0x0180 }
            java.lang.String r10 = "mode must be \"r\""
            android.util.Log.e(r7, r10)     // Catch:{ all -> 0x0180 }
            aucj r10 = r0.b
            xlj r10 = (defpackage.xlj) r10
            int r10 = r10.c
            int r10 = defpackage.xka.a(r10)
            if (r10 != 0) goto L_0x015b
            goto L_0x015d
        L_0x015b:
            if (r10 != r5) goto L_0x0172
        L_0x015d:
            boolean r10 = r0.c
            if (r10 != 0) goto L_0x0162
            goto L_0x0167
        L_0x0162:
            r0.c()
            r0.c = r3
        L_0x0167:
            aucj r10 = r0.b
            xlj r10 = (defpackage.xlj) r10
            r10.c = r5
            int r11 = r10.a
            r11 = r11 | r2
            r10.a = r11
        L_0x0172:
            wml r10 = defpackage.wml.a()
            aucj r11 = r0.i()
            xlj r11 = (defpackage.xlj) r11
            r10.a((defpackage.xlj) r11, (java.lang.String) r6)
            return r1
        L_0x0180:
            r10 = move-exception
            r1 = r6
            goto L_0x0184
        L_0x0183:
            r10 = move-exception
        L_0x0184:
            aucj r11 = r0.b
            xlj r11 = (defpackage.xlj) r11
            int r11 = r11.c
            int r11 = defpackage.xka.a(r11)
            if (r11 != 0) goto L_0x0191
            goto L_0x0193
        L_0x0191:
            if (r11 != r5) goto L_0x01a8
        L_0x0193:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x0198
            goto L_0x019d
        L_0x0198:
            r0.c()
            r0.c = r3
        L_0x019d:
            aucj r11 = r0.b
            xlj r11 = (defpackage.xlj) r11
            r11.c = r5
            int r3 = r11.a
            r2 = r2 | r3
            r11.a = r2
        L_0x01a8:
            wml r11 = defpackage.wml.a()
            aucj r0 = r0.i()
            xlj r0 = (defpackage.xlj) r0
            r11.a((defpackage.xlj) r0, (java.lang.String) r1)
            throw r10
        L_0x01b6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider.openFile(android.net.Uri, java.lang.String):android.os.ParcelFileDescriptor");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:197:0x05b1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x05b2, code lost:
        r8 = r9;
        r19 = r13;
        r2 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0bf5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0bf6, code lost:
        r8 = r9;
        r19 = r13;
        r13 = 2;
        r2 = "PeopleGalProvider";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0c9a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0c9c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0ca2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0ca3, code lost:
        r8 = r9;
        r19 = r13;
        r13 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0cc2, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0cf3, code lost:
        if (r15.c != false) goto L_0x0cf6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0cf6, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0cfc, code lost:
        ((defpackage.xlj) r15.b).a(r13);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:319:0x089e, B:449:0x0c1d] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0c9c A[ExcHandler: all (th java.lang.Throwable), PHI: r13 r19 
      PHI: (r13v7 int) = (r13v8 int), (r13v8 int), (r13v8 int), (r13v10 int), (r13v10 int), (r13v11 int), (r13v11 int), (r13v11 int), (r13v11 int) binds: [B:442:0x0c03, B:449:0x0c1d, B:450:?, B:387:0x0a6b, B:407:0x0af7, B:319:0x089e, B:338:0x0927, B:361:0x09cb, B:362:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r19v7 long) = (r19v8 long), (r19v8 long), (r19v8 long), (r19v10 long), (r19v10 long), (r19v11 long), (r19v11 long), (r19v11 long), (r19v11 long) binds: [B:442:0x0c03, B:449:0x0c1d, B:450:?, B:387:0x0a6b, B:407:0x0af7, B:319:0x089e, B:338:0x0927, B:361:0x09cb, B:362:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:319:0x089e] */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x0ca2 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x0cc2  */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x0cf1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor query(android.net.Uri r22, java.lang.String[] r23, java.lang.String r24, java.lang.String[] r25, java.lang.String r26) {
        /*
            r21 = this;
            r9 = r21
            r0 = r22
            java.lang.String r10 = "PeopleGalProvider"
            java.lang.String r11 = " completed."
            java.lang.String r12 = "Method "
            long r13 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r1 = java.lang.String.valueOf(r22)
            java.lang.String r2 = java.util.Arrays.toString(r23)
            java.lang.String r3 = java.util.Arrays.toString(r25)
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            java.lang.String r5 = java.lang.String.valueOf(r2)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r24)
            int r6 = r6.length()
            java.lang.String r7 = java.lang.String.valueOf(r3)
            int r7 = r7.length()
            java.lang.String r8 = java.lang.String.valueOf(r26)
            int r8 = r8.length()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r4 = r4 + 55
            int r4 = r4 + r5
            int r4 = r4 + r6
            int r4 = r4 + r7
            int r4 = r4 + r8
            r15.<init>(r4)
            java.lang.String r4 = "query: uri="
            r15.append(r4)
            r15.append(r1)
            java.lang.String r1 = "  projection="
            r15.append(r1)
            r15.append(r2)
            java.lang.String r1 = "  selection=["
            r15.append(r1)
            r1 = r24
            r15.append(r1)
            java.lang.String r1 = "]  args="
            r15.append(r1)
            r15.append(r3)
            java.lang.String r1 = "  order=["
            r15.append(r1)
            r5 = r26
            r15.append(r5)
            java.lang.String r1 = "]"
            r15.append(r1)
            r15.toString()
            xlj r1 = defpackage.xlj.g
            aucd r15 = r1.o()
            r1 = 0
            r8 = 2
            r7 = 0
            r6 = 1
            android.content.Context r2 = r9.e     // Catch:{ Exception -> 0x0ca8, all -> 0x0ca2 }
            xuu r2 = defpackage.xuu.a(r2)     // Catch:{ Exception -> 0x0ca8, all -> 0x0ca2 }
            boolean r2 = r2.b()     // Catch:{ Exception -> 0x0ca8, all -> 0x0ca2 }
            if (r2 == 0) goto L_0x0bfd
            android.content.UriMatcher r2 = b     // Catch:{ Exception -> 0x0bf5, all -> 0x0ca2 }
            int r3 = r2.match(r0)     // Catch:{ Exception -> 0x0bf5, all -> 0x0ca2 }
            java.lang.String r4 = "GalHandleContactThread"
            java.lang.String r2 = "account_name"
            switch(r3) {
                case 0: goto L_0x0a65;
                case 1: goto L_0x0898;
                case 2: goto L_0x073b;
                case 3: goto L_0x05b9;
                case 4: goto L_0x03e6;
                case 5: goto L_0x0225;
                case 6: goto L_0x00b6;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            r8 = r9
            r19 = r13
            r13 = 2
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.b
            int r6 = defpackage.xjy.a(r0)
            if (r6 == 0) goto L_0x0b7e
            goto L_0x0b7f
        L_0x00b6:
            java.lang.String r5 = r0.getQueryParameter(r2)     // Catch:{ Exception -> 0x0ca8, all -> 0x0ca2 }
            java.util.List r2 = r22.getPathSegments()     // Catch:{ Exception -> 0x021a, all -> 0x0210 }
            int r2 = r2.size()     // Catch:{ Exception -> 0x021a, all -> 0x0210 }
            if (r2 > r6) goto L_0x00c8
            java.lang.String r0 = ""
            goto L_0x00cc
        L_0x00c8:
            java.lang.String r0 = r22.getLastPathSegment()     // Catch:{ Exception -> 0x021a, all -> 0x0210 }
        L_0x00cc:
            r4 = r0
            boolean r0 = defpackage.ayuk.d()     // Catch:{ Exception -> 0x021a, all -> 0x0210 }
            if (r0 != 0) goto L_0x0152
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.b
            int r0 = defpackage.xjy.a(r0)
            if (r0 == 0) goto L_0x00e0
            goto L_0x00e1
        L_0x00e0:
            r0 = 1
        L_0x00e1:
            java.lang.String r0 = defpackage.xjy.b(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 18
            r3.<init>(r2)
            r3.append(r12)
            r3.append(r0)
            r3.append(r11)
            r3.toString()
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.c
            int r0 = defpackage.xka.a(r0)
            if (r0 != 0) goto L_0x0111
            goto L_0x0114
        L_0x0111:
            if (r0 == r6) goto L_0x0114
            goto L_0x0129
        L_0x0114:
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x0119
            goto L_0x011e
        L_0x0119:
            r15.c()
            r15.c = r7
        L_0x011e:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            r0.c = r6
            int r2 = r0.a
            r2 = r2 | r8
            r0.a = r2
        L_0x0129:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r13
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x0133
            goto L_0x0138
        L_0x0133:
            r15.c()
            r15.c = r7
        L_0x0138:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r4 = r0.a
            r4 = r4 | 8
            r0.a = r4
            r0.e = r2
            wml r0 = defpackage.wml.a()
            aucj r2 = r15.i()
            xlj r2 = (defpackage.xlj) r2
            r0.a((defpackage.xlj) r2, (java.lang.String) r5)
            return r1
        L_0x0152:
            boolean r0 = r15.c     // Catch:{ Exception -> 0x021a, all -> 0x0210 }
            if (r0 != 0) goto L_0x0157
            goto L_0x015c
        L_0x0157:
            r15.c()     // Catch:{ Exception -> 0x021a, all -> 0x0210 }
            r15.c = r7     // Catch:{ Exception -> 0x021a, all -> 0x0210 }
        L_0x015c:
            aucj r0 = r15.b     // Catch:{ Exception -> 0x021a, all -> 0x0210 }
            xlj r0 = (defpackage.xlj) r0     // Catch:{ Exception -> 0x021a, all -> 0x0210 }
            r1 = 7
            r0.b = r1     // Catch:{ Exception -> 0x021a, all -> 0x0210 }
            int r1 = r0.a     // Catch:{ Exception -> 0x021a, all -> 0x0210 }
            r1 = r1 | r6
            r0.a = r1     // Catch:{ Exception -> 0x021a, all -> 0x0210 }
            java.util.ArrayDeque r0 = r9.c     // Catch:{ Exception -> 0x021a, all -> 0x0210 }
            xqa r3 = new xqa     // Catch:{ Exception -> 0x021a, all -> 0x0210 }
            r1 = r3
            r2 = r21
            r8 = r3
            r3 = r23
            r22 = r5
            r7 = 1
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x020c, all -> 0x0208 }
            java.lang.String r1 = "GalPhoneLookupThread"
            long r2 = defpackage.ayuk.f()     // Catch:{ Exception -> 0x020c, all -> 0x0208 }
            java.lang.Object r0 = defpackage.xpv.a(r0, r8, r1, r2)     // Catch:{ Exception -> 0x020c, all -> 0x0208 }
            android.database.Cursor r0 = (android.database.Cursor) r0     // Catch:{ Exception -> 0x020c, all -> 0x0208 }
            aucj r1 = r15.b
            xlj r1 = (defpackage.xlj) r1
            int r1 = r1.b
            int r6 = defpackage.xjy.a(r1)
            if (r6 == 0) goto L_0x0192
            goto L_0x0193
        L_0x0192:
            r6 = 1
        L_0x0193:
            java.lang.String r1 = defpackage.xjy.b(r6)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 18
            r3.<init>(r2)
            r3.append(r12)
            r3.append(r1)
            r3.append(r11)
            r3.toString()
            aucj r1 = r15.b
            xlj r1 = (defpackage.xlj) r1
            int r1 = r1.c
            int r1 = defpackage.xka.a(r1)
            if (r1 != 0) goto L_0x01c3
            goto L_0x01c5
        L_0x01c3:
            if (r1 != r7) goto L_0x01dc
        L_0x01c5:
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x01ca
            goto L_0x01d0
        L_0x01ca:
            r15.c()
            r1 = 0
            r15.c = r1
        L_0x01d0:
            aucj r1 = r15.b
            xlj r1 = (defpackage.xlj) r1
            r1.c = r7
            int r2 = r1.a
            r3 = 2
            r2 = r2 | r3
            r1.a = r2
        L_0x01dc:
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r13
            boolean r3 = r15.c
            if (r3 != 0) goto L_0x01e6
            goto L_0x01ec
        L_0x01e6:
            r15.c()
            r3 = 0
            r15.c = r3
        L_0x01ec:
            aucj r3 = r15.b
            xlj r3 = (defpackage.xlj) r3
            int r4 = r3.a
            r4 = r4 | 8
            r3.a = r4
            r3.e = r1
            wml r1 = defpackage.wml.a()
            aucj r2 = r15.i()
            xlj r2 = (defpackage.xlj) r2
            r3 = r22
            r1.a((defpackage.xlj) r2, (java.lang.String) r3)
            return r0
        L_0x0208:
            r0 = move-exception
            r3 = r22
            goto L_0x0213
        L_0x020c:
            r0 = move-exception
            r3 = r22
            goto L_0x021d
        L_0x0210:
            r0 = move-exception
            r3 = r5
            r7 = 1
        L_0x0213:
            r1 = r3
        L_0x0214:
            r8 = r9
            r19 = r13
            r13 = 2
            goto L_0x0cb5
        L_0x021a:
            r0 = move-exception
            r3 = r5
            r7 = 1
        L_0x021d:
            r1 = r3
            r8 = r9
            r2 = r10
            r19 = r13
        L_0x0222:
            r13 = 2
            goto L_0x0cae
        L_0x0225:
            r7 = 1
            boolean r4 = defpackage.ayuk.e()     // Catch:{ Exception -> 0x0ca8, all -> 0x0ca2 }
            if (r4 != 0) goto L_0x02ae
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.b
            int r6 = defpackage.xjy.a(r0)
            if (r6 == 0) goto L_0x0239
            goto L_0x023a
        L_0x0239:
            r6 = 1
        L_0x023a:
            java.lang.String r0 = defpackage.xjy.b(r6)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 18
            r3.<init>(r2)
            r3.append(r12)
            r3.append(r0)
            r3.append(r11)
            r3.toString()
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.c
            int r0 = defpackage.xka.a(r0)
            if (r0 != 0) goto L_0x026a
            goto L_0x026d
        L_0x026a:
            if (r0 == r7) goto L_0x026d
            goto L_0x0284
        L_0x026d:
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x0272
            goto L_0x0278
        L_0x0272:
            r15.c()
            r2 = 0
            r15.c = r2
        L_0x0278:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            r0.c = r7
            int r2 = r0.a
            r3 = 2
            r2 = r2 | r3
            r0.a = r2
        L_0x0284:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r13
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x028e
            goto L_0x0294
        L_0x028e:
            r15.c()
            r4 = 0
            r15.c = r4
        L_0x0294:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r4 = r0.a
            r4 = r4 | 8
            r0.a = r4
            r0.e = r2
            wml r0 = defpackage.wml.a()
            aucj r2 = r15.i()
            xlj r2 = (defpackage.xlj) r2
            r0.a((defpackage.xlj) r2, (java.lang.String) r1)
            return r1
        L_0x02ae:
            boolean r4 = r15.c     // Catch:{ Exception -> 0x0ca8, all -> 0x0ca2 }
            if (r4 != 0) goto L_0x02b3
            goto L_0x02b9
        L_0x02b3:
            r15.c()     // Catch:{ Exception -> 0x0ca8, all -> 0x0ca2 }
            r4 = 0
            r15.c = r4     // Catch:{ Exception -> 0x0ca8, all -> 0x0ca2 }
        L_0x02b9:
            aucj r4 = r15.b     // Catch:{ Exception -> 0x0ca8, all -> 0x0ca2 }
            xlj r4 = (defpackage.xlj) r4     // Catch:{ Exception -> 0x0ca8, all -> 0x0ca2 }
            r6 = 3
            r4.b = r6     // Catch:{ Exception -> 0x0ca8, all -> 0x0ca2 }
            int r6 = r4.a     // Catch:{ Exception -> 0x0ca8, all -> 0x0ca2 }
            r6 = r6 | r7
            r4.a = r6     // Catch:{ Exception -> 0x0ca8, all -> 0x0ca2 }
            java.lang.String r2 = r0.getQueryParameter(r2)     // Catch:{ Exception -> 0x0ca8, all -> 0x0ca2 }
            android.accounts.Account r6 = r9.a(r2, r15)     // Catch:{ Exception -> 0x0ca8, all -> 0x0ca2 }
            if (r6 != 0) goto L_0x0351
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.b
            int r6 = defpackage.xjy.a(r0)
            if (r6 == 0) goto L_0x02dc
            goto L_0x02dd
        L_0x02dc:
            r6 = 1
        L_0x02dd:
            java.lang.String r0 = defpackage.xjy.b(r6)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 18
            r3.<init>(r2)
            r3.append(r12)
            r3.append(r0)
            r3.append(r11)
            r3.toString()
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.c
            int r0 = defpackage.xka.a(r0)
            if (r0 != 0) goto L_0x030d
            goto L_0x0310
        L_0x030d:
            if (r0 == r7) goto L_0x0310
            goto L_0x0327
        L_0x0310:
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x0315
            goto L_0x031b
        L_0x0315:
            r15.c()
            r2 = 0
            r15.c = r2
        L_0x031b:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            r0.c = r7
            int r2 = r0.a
            r3 = 2
            r2 = r2 | r3
            r0.a = r2
        L_0x0327:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r13
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x0331
            goto L_0x0337
        L_0x0331:
            r15.c()
            r8 = 0
            r15.c = r8
        L_0x0337:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r4 = r0.a
            r4 = r4 | 8
            r0.a = r4
            r0.e = r2
            wml r0 = defpackage.wml.a()
            aucj r2 = r15.i()
            xlj r2 = (defpackage.xlj) r2
            r0.a((defpackage.xlj) r2, (java.lang.String) r1)
            return r1
        L_0x0351:
            r8 = 0
            java.lang.String r4 = r6.name     // Catch:{ Exception -> 0x0ca8, all -> 0x0ca2 }
            r1 = r21
            r2 = r22
            r8 = r4
            r4 = r23
            r5 = r26
            r16 = r10
            r10 = 1
            r7 = r15
            android.database.Cursor r0 = r1.a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x05a8, all -> 0x05a4 }
            aucj r1 = r15.b
            xlj r1 = (defpackage.xlj) r1
            int r1 = r1.b
            int r6 = defpackage.xjy.a(r1)
            if (r6 == 0) goto L_0x0372
            goto L_0x0373
        L_0x0372:
            r6 = 1
        L_0x0373:
            java.lang.String r1 = defpackage.xjy.b(r6)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 18
            r3.<init>(r2)
            r3.append(r12)
            r3.append(r1)
            r3.append(r11)
            r3.toString()
            aucj r1 = r15.b
            xlj r1 = (defpackage.xlj) r1
            int r1 = r1.c
            int r1 = defpackage.xka.a(r1)
            if (r1 != 0) goto L_0x03a3
            goto L_0x03a5
        L_0x03a3:
            if (r1 != r10) goto L_0x03bc
        L_0x03a5:
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x03aa
            goto L_0x03b0
        L_0x03aa:
            r15.c()
            r1 = 0
            r15.c = r1
        L_0x03b0:
            aucj r1 = r15.b
            xlj r1 = (defpackage.xlj) r1
            r1.c = r10
            int r2 = r1.a
            r3 = 2
            r2 = r2 | r3
            r1.a = r2
        L_0x03bc:
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r13
            boolean r3 = r15.c
            if (r3 != 0) goto L_0x03c6
            goto L_0x03cc
        L_0x03c6:
            r15.c()
            r3 = 0
            r15.c = r3
        L_0x03cc:
            aucj r3 = r15.b
            xlj r3 = (defpackage.xlj) r3
            int r4 = r3.a
            r4 = r4 | 8
            r3.a = r4
            r3.e = r1
            wml r1 = defpackage.wml.a()
            aucj r2 = r15.i()
            xlj r2 = (defpackage.xlj) r2
            r1.a((defpackage.xlj) r2, (java.lang.String) r8)
            return r0
        L_0x03e6:
            r16 = r10
            r10 = 1
            boolean r4 = defpackage.ayuk.e()     // Catch:{ Exception -> 0x05b1, all -> 0x0ca2 }
            if (r4 != 0) goto L_0x0471
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.b
            int r6 = defpackage.xjy.a(r0)
            if (r6 == 0) goto L_0x03fc
            goto L_0x03fd
        L_0x03fc:
            r6 = 1
        L_0x03fd:
            java.lang.String r0 = defpackage.xjy.b(r6)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 18
            r3.<init>(r2)
            r3.append(r12)
            r3.append(r0)
            r3.append(r11)
            r3.toString()
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.c
            int r0 = defpackage.xka.a(r0)
            if (r0 != 0) goto L_0x042d
            goto L_0x0430
        L_0x042d:
            if (r0 == r10) goto L_0x0430
            goto L_0x0447
        L_0x0430:
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x0435
            goto L_0x043b
        L_0x0435:
            r15.c()
            r2 = 0
            r15.c = r2
        L_0x043b:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            r0.c = r10
            int r2 = r0.a
            r3 = 2
            r2 = r2 | r3
            r0.a = r2
        L_0x0447:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r13
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x0451
            goto L_0x0457
        L_0x0451:
            r15.c()
            r4 = 0
            r15.c = r4
        L_0x0457:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r4 = r0.a
            r4 = r4 | 8
            r0.a = r4
            r0.e = r2
            wml r0 = defpackage.wml.a()
            aucj r2 = r15.i()
            xlj r2 = (defpackage.xlj) r2
            r0.a((defpackage.xlj) r2, (java.lang.String) r1)
            return r1
        L_0x0471:
            boolean r4 = r15.c     // Catch:{ Exception -> 0x05b1, all -> 0x0ca2 }
            if (r4 != 0) goto L_0x0476
            goto L_0x047c
        L_0x0476:
            r15.c()     // Catch:{ Exception -> 0x05b1, all -> 0x0ca2 }
            r4 = 0
            r15.c = r4     // Catch:{ Exception -> 0x05b1, all -> 0x0ca2 }
        L_0x047c:
            aucj r4 = r15.b     // Catch:{ Exception -> 0x05b1, all -> 0x0ca2 }
            xlj r4 = (defpackage.xlj) r4     // Catch:{ Exception -> 0x05b1, all -> 0x0ca2 }
            r6 = 4
            r4.b = r6     // Catch:{ Exception -> 0x05b1, all -> 0x0ca2 }
            int r6 = r4.a     // Catch:{ Exception -> 0x05b1, all -> 0x0ca2 }
            r6 = r6 | r10
            r4.a = r6     // Catch:{ Exception -> 0x05b1, all -> 0x0ca2 }
            java.lang.String r2 = r0.getQueryParameter(r2)     // Catch:{ Exception -> 0x05b1, all -> 0x0ca2 }
            android.accounts.Account r6 = r9.a(r2, r15)     // Catch:{ Exception -> 0x05b1, all -> 0x0ca2 }
            if (r6 != 0) goto L_0x0514
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.b
            int r6 = defpackage.xjy.a(r0)
            if (r6 == 0) goto L_0x049f
            goto L_0x04a0
        L_0x049f:
            r6 = 1
        L_0x04a0:
            java.lang.String r0 = defpackage.xjy.b(r6)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 18
            r3.<init>(r2)
            r3.append(r12)
            r3.append(r0)
            r3.append(r11)
            r3.toString()
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.c
            int r0 = defpackage.xka.a(r0)
            if (r0 != 0) goto L_0x04d0
            goto L_0x04d3
        L_0x04d0:
            if (r0 == r10) goto L_0x04d3
            goto L_0x04ea
        L_0x04d3:
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x04d8
            goto L_0x04de
        L_0x04d8:
            r15.c()
            r2 = 0
            r15.c = r2
        L_0x04de:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            r0.c = r10
            int r2 = r0.a
            r3 = 2
            r2 = r2 | r3
            r0.a = r2
        L_0x04ea:
            long r2 = android.os.SystemClock.elapsedRealtime()
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x04f3
            goto L_0x04f9
        L_0x04f3:
            r15.c()
            r4 = 0
            r15.c = r4
        L_0x04f9:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r4 = r0.a
            r4 = r4 | 8
            r0.a = r4
            long r2 = r2 - r13
            r0.e = r2
            wml r0 = defpackage.wml.a()
            aucj r2 = r15.i()
            xlj r2 = (defpackage.xlj) r2
            r0.a((defpackage.xlj) r2, (java.lang.String) r1)
            return r1
        L_0x0514:
            java.lang.String r8 = r6.name     // Catch:{ Exception -> 0x05b1, all -> 0x0ca2 }
            r1 = r21
            r2 = r22
            r4 = r23
            r5 = r26
            r7 = r15
            android.database.Cursor r0 = r1.a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x05a8, all -> 0x05a4 }
            aucj r1 = r15.b
            xlj r1 = (defpackage.xlj) r1
            int r1 = r1.b
            int r6 = defpackage.xjy.a(r1)
            if (r6 == 0) goto L_0x0530
            goto L_0x0531
        L_0x0530:
            r6 = 1
        L_0x0531:
            java.lang.String r1 = defpackage.xjy.b(r6)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 18
            r3.<init>(r2)
            r3.append(r12)
            r3.append(r1)
            r3.append(r11)
            r3.toString()
            aucj r1 = r15.b
            xlj r1 = (defpackage.xlj) r1
            int r1 = r1.c
            int r1 = defpackage.xka.a(r1)
            if (r1 != 0) goto L_0x0561
            goto L_0x0563
        L_0x0561:
            if (r1 != r10) goto L_0x057a
        L_0x0563:
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x0568
            goto L_0x056e
        L_0x0568:
            r15.c()
            r1 = 0
            r15.c = r1
        L_0x056e:
            aucj r1 = r15.b
            xlj r1 = (defpackage.xlj) r1
            r1.c = r10
            int r2 = r1.a
            r3 = 2
            r2 = r2 | r3
            r1.a = r2
        L_0x057a:
            long r1 = android.os.SystemClock.elapsedRealtime()
            boolean r3 = r15.c
            if (r3 != 0) goto L_0x0583
            goto L_0x0589
        L_0x0583:
            r15.c()
            r3 = 0
            r15.c = r3
        L_0x0589:
            aucj r3 = r15.b
            xlj r3 = (defpackage.xlj) r3
            int r4 = r3.a
            r4 = r4 | 8
            r3.a = r4
            long r1 = r1 - r13
            r3.e = r1
            wml r1 = defpackage.wml.a()
            aucj r2 = r15.i()
            xlj r2 = (defpackage.xlj) r2
            r1.a((defpackage.xlj) r2, (java.lang.String) r8)
            return r0
        L_0x05a4:
            r0 = move-exception
            r1 = r8
            goto L_0x0214
        L_0x05a8:
            r0 = move-exception
            r1 = r8
            r8 = r9
            r19 = r13
            r2 = r16
            goto L_0x0222
        L_0x05b1:
            r0 = move-exception
            r8 = r9
            r19 = r13
            r2 = r16
            goto L_0x0cad
        L_0x05b9:
            r16 = r10
            r10 = 1
            java.lang.String r8 = r0.getQueryParameter(r2)     // Catch:{ Exception -> 0x0735, all -> 0x072f }
            java.util.List r2 = r22.getPathSegments()     // Catch:{ Exception -> 0x0725, all -> 0x071b }
            r3 = 2
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x0725, all -> 0x071b }
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0725, all -> 0x071b }
            java.util.List r0 = r22.getPathSegments()     // Catch:{ Exception -> 0x0725, all -> 0x071b }
            r2 = 3
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0725, all -> 0x071b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0725, all -> 0x071b }
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0725, all -> 0x071b }
            boolean r0 = defpackage.ayuk.b()     // Catch:{ Exception -> 0x0725, all -> 0x071b }
            if (r0 != 0) goto L_0x065f
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.b
            int r6 = defpackage.xjy.a(r0)
            if (r6 == 0) goto L_0x05ee
            goto L_0x05ef
        L_0x05ee:
            r6 = 1
        L_0x05ef:
            java.lang.String r0 = defpackage.xjy.b(r6)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 18
            r3.<init>(r2)
            r3.append(r12)
            r3.append(r0)
            r3.append(r11)
            r3.toString()
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.c
            int r0 = defpackage.xka.a(r0)
            if (r0 != 0) goto L_0x061f
            goto L_0x0621
        L_0x061f:
            if (r0 != r10) goto L_0x063a
        L_0x0621:
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x0626
            goto L_0x062c
        L_0x0626:
            r15.c()
            r2 = 0
            r15.c = r2
        L_0x062c:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            r0.c = r10
            int r2 = r0.a
            r17 = 2
            r2 = r2 | 2
            r0.a = r2
        L_0x063a:
            long r2 = android.os.SystemClock.elapsedRealtime()
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x0643
            goto L_0x0649
        L_0x0643:
            r15.c()
            r4 = 0
            r15.c = r4
        L_0x0649:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            long r2 = r2 - r13
            r0.a((long) r2)
            wml r0 = defpackage.wml.a()
            aucj r2 = r15.i()
            xlj r2 = (defpackage.xlj) r2
            r0.a((defpackage.xlj) r2, (java.lang.String) r8)
            return r1
        L_0x065f:
            r17 = 2
            boolean r0 = r15.c     // Catch:{ Exception -> 0x0725, all -> 0x071b }
            if (r0 != 0) goto L_0x0666
            goto L_0x066c
        L_0x0666:
            r15.c()     // Catch:{ Exception -> 0x0725, all -> 0x071b }
            r1 = 0
            r15.c = r1     // Catch:{ Exception -> 0x0725, all -> 0x071b }
        L_0x066c:
            aucj r0 = r15.b     // Catch:{ Exception -> 0x0725, all -> 0x071b }
            xlj r0 = (defpackage.xlj) r0     // Catch:{ Exception -> 0x0725, all -> 0x071b }
            r1 = 6
            r0.b = r1     // Catch:{ Exception -> 0x0725, all -> 0x071b }
            int r1 = r0.a     // Catch:{ Exception -> 0x0725, all -> 0x071b }
            r1 = r1 | r10
            r0.a = r1     // Catch:{ Exception -> 0x0725, all -> 0x071b }
            java.util.ArrayDeque r0 = r9.c     // Catch:{ Exception -> 0x0725, all -> 0x071b }
            xpz r3 = new xpz     // Catch:{ Exception -> 0x0725, all -> 0x071b }
            r1 = r3
            r2 = r21
            r10 = r3
            r3 = r23
            r9 = r4
            r4 = r5
            r5 = r8
            r18 = r8
            r19 = r13
            r13 = 2
            r8 = r15
            r1.<init>(r2, r3, r4, r5, r6, r8)     // Catch:{ Exception -> 0x0717, all -> 0x0713 }
            long r1 = defpackage.ayuk.f()     // Catch:{ Exception -> 0x0717, all -> 0x0713 }
            java.lang.Object r0 = defpackage.xpv.a(r0, r10, r9, r1)     // Catch:{ Exception -> 0x0717, all -> 0x0713 }
            android.database.Cursor r0 = (android.database.Cursor) r0     // Catch:{ Exception -> 0x0717, all -> 0x0713 }
            aucj r1 = r15.b
            xlj r1 = (defpackage.xlj) r1
            int r1 = r1.b
            int r6 = defpackage.xjy.a(r1)
            if (r6 == 0) goto L_0x06a5
            goto L_0x06a6
        L_0x06a5:
            r6 = 1
        L_0x06a6:
            java.lang.String r1 = defpackage.xjy.b(r6)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 18
            r3.<init>(r2)
            r3.append(r12)
            r3.append(r1)
            r3.append(r11)
            r3.toString()
            aucj r1 = r15.b
            xlj r1 = (defpackage.xlj) r1
            int r1 = r1.c
            int r1 = defpackage.xka.a(r1)
            if (r1 != 0) goto L_0x06d6
            goto L_0x06d9
        L_0x06d6:
            r2 = 1
            if (r1 != r2) goto L_0x06eb
        L_0x06d9:
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x06de
            goto L_0x06e4
        L_0x06de:
            r15.c()
            r1 = 0
            r15.c = r1
        L_0x06e4:
            aucj r1 = r15.b
            xlj r1 = (defpackage.xlj) r1
            r1.a((int) r13)
        L_0x06eb:
            long r1 = android.os.SystemClock.elapsedRealtime()
            boolean r3 = r15.c
            if (r3 != 0) goto L_0x06f4
            goto L_0x06fa
        L_0x06f4:
            r15.c()
            r3 = 0
            r15.c = r3
        L_0x06fa:
            aucj r3 = r15.b
            xlj r3 = (defpackage.xlj) r3
            long r1 = r1 - r19
            r3.a((long) r1)
            wml r1 = defpackage.wml.a()
            aucj r2 = r15.i()
            xlj r2 = (defpackage.xlj) r2
            r3 = r18
            r1.a((defpackage.xlj) r2, (java.lang.String) r3)
            return r0
        L_0x0713:
            r0 = move-exception
            r3 = r18
            goto L_0x0720
        L_0x0717:
            r0 = move-exception
            r3 = r18
            goto L_0x072a
        L_0x071b:
            r0 = move-exception
            r3 = r8
            r19 = r13
            r13 = 2
        L_0x0720:
            r8 = r21
            r1 = r3
            goto L_0x0cb5
        L_0x0725:
            r0 = move-exception
            r3 = r8
            r19 = r13
            r13 = 2
        L_0x072a:
            r8 = r21
            r1 = r3
            goto L_0x088a
        L_0x072f:
            r0 = move-exception
            r19 = r13
            r13 = 2
            goto L_0x088f
        L_0x0735:
            r0 = move-exception
            r19 = r13
            r13 = 2
            goto L_0x0894
        L_0x073b:
            r9 = r4
            r16 = r10
            r19 = r13
            r13 = 2
            java.lang.String r7 = r0.getQueryParameter(r2)     // Catch:{ Exception -> 0x0893, all -> 0x088e }
            java.util.List r0 = r22.getPathSegments()     // Catch:{ Exception -> 0x0886, all -> 0x0880 }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ Exception -> 0x0886, all -> 0x0880 }
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0886, all -> 0x0880 }
            boolean r0 = defpackage.ayuk.b()     // Catch:{ Exception -> 0x0886, all -> 0x0880 }
            if (r0 != 0) goto L_0x07d5
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.b
            int r6 = defpackage.xjy.a(r0)
            if (r6 == 0) goto L_0x0763
            goto L_0x0764
        L_0x0763:
            r6 = 1
        L_0x0764:
            java.lang.String r0 = defpackage.xjy.b(r6)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 18
            r3.<init>(r2)
            r3.append(r12)
            r3.append(r0)
            r3.append(r11)
            r3.toString()
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.c
            int r0 = defpackage.xka.a(r0)
            if (r0 != 0) goto L_0x0794
            goto L_0x0798
        L_0x0794:
            r2 = 1
            if (r0 == r2) goto L_0x0798
            goto L_0x07aa
        L_0x0798:
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x079d
            goto L_0x07a3
        L_0x079d:
            r15.c()
            r2 = 0
            r15.c = r2
        L_0x07a3:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            r0.a((int) r13)
        L_0x07aa:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r19
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x07b5
            goto L_0x07bb
        L_0x07b5:
            r15.c()
            r4 = 0
            r15.c = r4
        L_0x07bb:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r4 = r0.a
            r4 = r4 | 8
            r0.a = r4
            r0.e = r2
            wml r0 = defpackage.wml.a()
            aucj r2 = r15.i()
            xlj r2 = (defpackage.xlj) r2
            r0.a((defpackage.xlj) r2, (java.lang.String) r7)
            return r1
        L_0x07d5:
            boolean r0 = r15.c     // Catch:{ Exception -> 0x0886, all -> 0x0880 }
            if (r0 != 0) goto L_0x07da
            goto L_0x07e0
        L_0x07da:
            r15.c()     // Catch:{ Exception -> 0x0886, all -> 0x0880 }
            r1 = 0
            r15.c = r1     // Catch:{ Exception -> 0x0886, all -> 0x0880 }
        L_0x07e0:
            aucj r0 = r15.b     // Catch:{ Exception -> 0x0886, all -> 0x0880 }
            xlj r0 = (defpackage.xlj) r0     // Catch:{ Exception -> 0x0886, all -> 0x0880 }
            r1 = 5
            r0.b = r1     // Catch:{ Exception -> 0x0886, all -> 0x0880 }
            int r1 = r0.a     // Catch:{ Exception -> 0x0886, all -> 0x0880 }
            r2 = 1
            r1 = r1 | r2
            r0.a = r1     // Catch:{ Exception -> 0x0886, all -> 0x0880 }
            r8 = r21
            r0 = r9
            java.util.ArrayDeque r9 = r8.c     // Catch:{ Exception -> 0x087e, all -> 0x087c }
            xpy r10 = new xpy     // Catch:{ Exception -> 0x087e, all -> 0x087c }
            r1 = r10
            r2 = r21
            r3 = r23
            r5 = r7
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x087e, all -> 0x087c }
            long r1 = defpackage.ayuk.f()     // Catch:{ Exception -> 0x087e, all -> 0x087c }
            java.lang.Object r0 = defpackage.xpv.a(r9, r10, r0, r1)     // Catch:{ Exception -> 0x087e, all -> 0x087c }
            android.database.Cursor r0 = (android.database.Cursor) r0     // Catch:{ Exception -> 0x087e, all -> 0x087c }
            aucj r1 = r15.b
            xlj r1 = (defpackage.xlj) r1
            int r1 = r1.b
            int r6 = defpackage.xjy.a(r1)
            if (r6 == 0) goto L_0x0815
            goto L_0x0816
        L_0x0815:
            r6 = 1
        L_0x0816:
            java.lang.String r1 = defpackage.xjy.b(r6)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 18
            r3.<init>(r2)
            r3.append(r12)
            r3.append(r1)
            r3.append(r11)
            r3.toString()
            aucj r1 = r15.b
            xlj r1 = (defpackage.xlj) r1
            int r1 = r1.a()
            r2 = 1
            if (r1 != r2) goto L_0x0856
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x0849
            goto L_0x084f
        L_0x0849:
            r15.c()
            r1 = 0
            r15.c = r1
        L_0x084f:
            aucj r1 = r15.b
            xlj r1 = (defpackage.xlj) r1
            r1.a((int) r13)
        L_0x0856:
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r19
            boolean r3 = r15.c
            if (r3 != 0) goto L_0x0861
            goto L_0x0867
        L_0x0861:
            r15.c()
            r3 = 0
            r15.c = r3
        L_0x0867:
            aucj r3 = r15.b
            xlj r3 = (defpackage.xlj) r3
            r3.a((long) r1)
            wml r1 = defpackage.wml.a()
            aucj r2 = r15.i()
            xlj r2 = (defpackage.xlj) r2
            r1.a((defpackage.xlj) r2, (java.lang.String) r7)
            return r0
        L_0x087c:
            r0 = move-exception
            goto L_0x0883
        L_0x087e:
            r0 = move-exception
            goto L_0x0889
        L_0x0880:
            r0 = move-exception
            r8 = r21
        L_0x0883:
            r1 = r7
            goto L_0x0cb5
        L_0x0886:
            r0 = move-exception
            r8 = r21
        L_0x0889:
            r1 = r7
        L_0x088a:
            r2 = r16
            goto L_0x0cae
        L_0x088e:
            r0 = move-exception
        L_0x088f:
            r8 = r21
            goto L_0x0cb5
        L_0x0893:
            r0 = move-exception
        L_0x0894:
            r8 = r21
            goto L_0x0c9f
        L_0x0898:
            r8 = r9
            r16 = r10
            r19 = r13
            r13 = 2
            boolean r4 = defpackage.ayuk.e()     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
            if (r4 != 0) goto L_0x0927
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.b
            int r6 = defpackage.xjy.a(r0)
            if (r6 == 0) goto L_0x08b1
            goto L_0x08b2
        L_0x08b1:
            r6 = 1
        L_0x08b2:
            java.lang.String r0 = defpackage.xjy.b(r6)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 18
            r3.<init>(r2)
            r3.append(r12)
            r3.append(r0)
            r3.append(r11)
            r3.toString()
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.c
            int r0 = defpackage.xka.a(r0)
            if (r0 != 0) goto L_0x08e2
            goto L_0x08e5
        L_0x08e2:
            r2 = 1
            if (r0 != r2) goto L_0x08fc
        L_0x08e5:
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x08ea
            goto L_0x08f0
        L_0x08ea:
            r15.c()
            r2 = 0
            r15.c = r2
        L_0x08f0:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            r2 = 1
            r0.c = r2
            int r2 = r0.a
            r2 = r2 | r13
            r0.a = r2
        L_0x08fc:
            long r2 = android.os.SystemClock.elapsedRealtime()
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x0905
            goto L_0x090b
        L_0x0905:
            r15.c()
            r4 = 0
            r15.c = r4
        L_0x090b:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r4 = r0.a
            r4 = r4 | 8
            r0.a = r4
            long r2 = r2 - r19
            r0.e = r2
            wml r0 = defpackage.wml.a()
            aucj r2 = r15.i()
            xlj r2 = (defpackage.xlj) r2
            r0.a((defpackage.xlj) r2, (java.lang.String) r1)
            return r1
        L_0x0927:
            boolean r4 = r15.c     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
            if (r4 != 0) goto L_0x092c
            goto L_0x0932
        L_0x092c:
            r15.c()     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
            r4 = 0
            r15.c = r4     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
        L_0x0932:
            aucj r4 = r15.b     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
            xlj r4 = (defpackage.xlj) r4     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
            r4.b = r13     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
            int r6 = r4.a     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
            r7 = 1
            r6 = r6 | r7
            r4.a = r6     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
            java.lang.String r2 = r0.getQueryParameter(r2)     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
            android.accounts.Account r6 = r8.a(r2, r15)     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
            if (r6 != 0) goto L_0x09cb
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.b
            int r6 = defpackage.xjy.a(r0)
            if (r6 == 0) goto L_0x0955
            goto L_0x0956
        L_0x0955:
            r6 = 1
        L_0x0956:
            java.lang.String r0 = defpackage.xjy.b(r6)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 18
            r3.<init>(r2)
            r3.append(r12)
            r3.append(r0)
            r3.append(r11)
            r3.toString()
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.c
            int r0 = defpackage.xka.a(r0)
            if (r0 != 0) goto L_0x0986
            goto L_0x0989
        L_0x0986:
            r2 = 1
            if (r0 != r2) goto L_0x09a0
        L_0x0989:
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x098e
            goto L_0x0994
        L_0x098e:
            r15.c()
            r2 = 0
            r15.c = r2
        L_0x0994:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            r2 = 1
            r0.c = r2
            int r2 = r0.a
            r2 = r2 | r13
            r0.a = r2
        L_0x09a0:
            long r2 = android.os.SystemClock.elapsedRealtime()
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x09a9
            goto L_0x09af
        L_0x09a9:
            r15.c()
            r4 = 0
            r15.c = r4
        L_0x09af:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r4 = r0.a
            r4 = r4 | 8
            r0.a = r4
            long r2 = r2 - r19
            r0.e = r2
            wml r0 = defpackage.wml.a()
            aucj r2 = r15.i()
            xlj r2 = (defpackage.xlj) r2
            r0.a((defpackage.xlj) r2, (java.lang.String) r1)
            return r1
        L_0x09cb:
            java.lang.String r9 = r6.name     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
            r1 = r21
            r2 = r22
            r4 = r23
            r5 = r26
            r7 = r15
            android.database.Cursor r0 = r1.a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0a61, all -> 0x0a5d }
            aucj r1 = r15.b
            xlj r1 = (defpackage.xlj) r1
            int r1 = r1.b
            int r6 = defpackage.xjy.a(r1)
            if (r6 == 0) goto L_0x09e7
            goto L_0x09e8
        L_0x09e7:
            r6 = 1
        L_0x09e8:
            java.lang.String r1 = defpackage.xjy.b(r6)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 18
            r3.<init>(r2)
            r3.append(r12)
            r3.append(r1)
            r3.append(r11)
            r3.toString()
            aucj r1 = r15.b
            xlj r1 = (defpackage.xlj) r1
            int r1 = r1.c
            int r1 = defpackage.xka.a(r1)
            if (r1 != 0) goto L_0x0a18
            goto L_0x0a1b
        L_0x0a18:
            r2 = 1
            if (r1 != r2) goto L_0x0a32
        L_0x0a1b:
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x0a20
            goto L_0x0a26
        L_0x0a20:
            r15.c()
            r1 = 0
            r15.c = r1
        L_0x0a26:
            aucj r1 = r15.b
            xlj r1 = (defpackage.xlj) r1
            r2 = 1
            r1.c = r2
            int r2 = r1.a
            r2 = r2 | r13
            r1.a = r2
        L_0x0a32:
            long r1 = android.os.SystemClock.elapsedRealtime()
            boolean r3 = r15.c
            if (r3 != 0) goto L_0x0a3b
            goto L_0x0a41
        L_0x0a3b:
            r15.c()
            r3 = 0
            r15.c = r3
        L_0x0a41:
            aucj r3 = r15.b
            xlj r3 = (defpackage.xlj) r3
            int r4 = r3.a
            r4 = r4 | 8
            r3.a = r4
            long r1 = r1 - r19
            r3.e = r1
            wml r1 = defpackage.wml.a()
            aucj r2 = r15.i()
            xlj r2 = (defpackage.xlj) r2
            r1.a((defpackage.xlj) r2, (java.lang.String) r9)
            return r0
        L_0x0a5d:
            r0 = move-exception
            r1 = r9
            goto L_0x0cb5
        L_0x0a61:
            r0 = move-exception
            r1 = r9
            goto L_0x088a
        L_0x0a65:
            r8 = r9
            r16 = r10
            r19 = r13
            r13 = 2
            boolean r0 = defpackage.ayuk.c()     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
            if (r0 != 0) goto L_0x0af5
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.b
            int r6 = defpackage.xjy.a(r0)
            if (r6 == 0) goto L_0x0a7e
            goto L_0x0a7f
        L_0x0a7e:
            r6 = 1
        L_0x0a7f:
            java.lang.String r0 = defpackage.xjy.b(r6)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 18
            r3.<init>(r2)
            r3.append(r12)
            r3.append(r0)
            r3.append(r11)
            r3.toString()
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.c
            int r0 = defpackage.xka.a(r0)
            if (r0 != 0) goto L_0x0aaf
            goto L_0x0ab3
        L_0x0aaf:
            r2 = 1
            if (r0 == r2) goto L_0x0ab3
            goto L_0x0aca
        L_0x0ab3:
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x0ab8
            goto L_0x0abe
        L_0x0ab8:
            r15.c()
            r2 = 0
            r15.c = r2
        L_0x0abe:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            r2 = 1
            r0.c = r2
            int r2 = r0.a
            r2 = r2 | r13
            r0.a = r2
        L_0x0aca:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r19
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x0ad5
            goto L_0x0adb
        L_0x0ad5:
            r15.c()
            r4 = 0
            r15.c = r4
        L_0x0adb:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r4 = r0.a
            r4 = r4 | 8
            r0.a = r4
            r0.e = r2
            wml r0 = defpackage.wml.a()
            aucj r2 = r15.i()
            xlj r2 = (defpackage.xlj) r2
            r0.a((defpackage.xlj) r2, (java.lang.String) r1)
            return r1
        L_0x0af5:
            r0 = r23
            android.database.Cursor r0 = r8.a((java.lang.String[]) r0)     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
            aucj r2 = r15.b
            xlj r2 = (defpackage.xlj) r2
            int r2 = r2.b
            int r6 = defpackage.xjy.a(r2)
            if (r6 == 0) goto L_0x0b08
            goto L_0x0b09
        L_0x0b08:
            r6 = 1
        L_0x0b09:
            java.lang.String r2 = defpackage.xjy.b(r6)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 18
            r4.<init>(r3)
            r4.append(r12)
            r4.append(r2)
            r4.append(r11)
            r4.toString()
            aucj r2 = r15.b
            xlj r2 = (defpackage.xlj) r2
            int r2 = r2.c
            int r2 = defpackage.xka.a(r2)
            if (r2 != 0) goto L_0x0b39
            goto L_0x0b3c
        L_0x0b39:
            r3 = 1
            if (r2 != r3) goto L_0x0b53
        L_0x0b3c:
            boolean r2 = r15.c
            if (r2 != 0) goto L_0x0b41
            goto L_0x0b47
        L_0x0b41:
            r15.c()
            r2 = 0
            r15.c = r2
        L_0x0b47:
            aucj r2 = r15.b
            xlj r2 = (defpackage.xlj) r2
            r3 = 1
            r2.c = r3
            int r3 = r2.a
            r3 = r3 | r13
            r2.a = r3
        L_0x0b53:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r19
            boolean r4 = r15.c
            if (r4 != 0) goto L_0x0b5e
            goto L_0x0b64
        L_0x0b5e:
            r15.c()
            r4 = 0
            r15.c = r4
        L_0x0b64:
            aucj r4 = r15.b
            xlj r4 = (defpackage.xlj) r4
            int r5 = r4.a
            r5 = r5 | 8
            r4.a = r5
            r4.e = r2
            wml r2 = defpackage.wml.a()
            aucj r3 = r15.i()
            xlj r3 = (defpackage.xlj) r3
            r2.a((defpackage.xlj) r3, (java.lang.String) r1)
            return r0
        L_0x0b7e:
            r6 = 1
        L_0x0b7f:
            java.lang.String r0 = defpackage.xjy.b(r6)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 18
            r3.<init>(r2)
            r3.append(r12)
            r3.append(r0)
            r3.append(r11)
            r3.toString()
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.c
            int r0 = defpackage.xka.a(r0)
            if (r0 != 0) goto L_0x0baf
            goto L_0x0bb3
        L_0x0baf:
            r2 = 1
            if (r0 == r2) goto L_0x0bb3
            goto L_0x0bca
        L_0x0bb3:
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x0bb8
            goto L_0x0bbe
        L_0x0bb8:
            r15.c()
            r2 = 0
            r15.c = r2
        L_0x0bbe:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            r2 = 1
            r0.c = r2
            int r2 = r0.a
            r2 = r2 | r13
            r0.a = r2
        L_0x0bca:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r19
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x0bd5
            goto L_0x0bdb
        L_0x0bd5:
            r15.c()
            r4 = 0
            r15.c = r4
        L_0x0bdb:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r4 = r0.a
            r4 = r4 | 8
            r0.a = r4
            r0.e = r2
            wml r0 = defpackage.wml.a()
            aucj r2 = r15.i()
            xlj r2 = (defpackage.xlj) r2
            r0.a((defpackage.xlj) r2, (java.lang.String) r1)
            return r1
        L_0x0bf5:
            r0 = move-exception
            r8 = r9
            r19 = r13
            r13 = 2
            r2 = r10
            goto L_0x0cae
        L_0x0bfd:
            r8 = r9
            r16 = r10
            r19 = r13
            r13 = 2
            boolean r0 = r15.c     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
            if (r0 != 0) goto L_0x0c08
            goto L_0x0c0e
        L_0x0c08:
            r15.c()     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
            r2 = 0
            r15.c = r2     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
        L_0x0c0e:
            aucj r0 = r15.b     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
            xlj r0 = (defpackage.xlj) r0     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
            r0.c = r13     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
            int r2 = r0.a     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
            r2 = r2 | r13
            r0.a = r2     // Catch:{ Exception -> 0x0c9e, all -> 0x0c9c }
            java.lang.String r0 = "Don't have Contacts permission."
            r2 = r16
            android.util.Log.e(r2, r0)     // Catch:{ Exception -> 0x0c9a, all -> 0x0c9c }
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.b
            int r6 = defpackage.xjy.a(r0)
            if (r6 == 0) goto L_0x0c2d
            goto L_0x0c2e
        L_0x0c2d:
            r6 = 1
        L_0x0c2e:
            java.lang.String r0 = defpackage.xjy.b(r6)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 18
            r3.<init>(r2)
            r3.append(r12)
            r3.append(r0)
            r3.append(r11)
            r3.toString()
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            int r0 = r0.c
            int r0 = defpackage.xka.a(r0)
            if (r0 != 0) goto L_0x0c5e
            goto L_0x0c62
        L_0x0c5e:
            r2 = 1
            if (r0 == r2) goto L_0x0c62
            goto L_0x0c74
        L_0x0c62:
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x0c67
            goto L_0x0c6d
        L_0x0c67:
            r15.c()
            r2 = 0
            r15.c = r2
        L_0x0c6d:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            r0.a((int) r13)
        L_0x0c74:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r19
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x0c7f
            goto L_0x0c85
        L_0x0c7f:
            r15.c()
            r4 = 0
            r15.c = r4
        L_0x0c85:
            aucj r0 = r15.b
            xlj r0 = (defpackage.xlj) r0
            r0.a((long) r2)
            wml r0 = defpackage.wml.a()
            aucj r2 = r15.i()
            xlj r2 = (defpackage.xlj) r2
            r0.a((defpackage.xlj) r2, (java.lang.String) r1)
            return r1
        L_0x0c9a:
            r0 = move-exception
            goto L_0x0cae
        L_0x0c9c:
            r0 = move-exception
            goto L_0x0cb5
        L_0x0c9e:
            r0 = move-exception
        L_0x0c9f:
            r2 = r16
            goto L_0x0cae
        L_0x0ca2:
            r0 = move-exception
            r8 = r9
            r19 = r13
            r13 = 2
            goto L_0x0cb5
        L_0x0ca8:
            r0 = move-exception
            r8 = r9
            r2 = r10
            r19 = r13
        L_0x0cad:
            r13 = 2
        L_0x0cae:
            java.lang.String r3 = "Gal task threw exception."
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x0cb4 }
            throw r0     // Catch:{ all -> 0x0cb4 }
        L_0x0cb4:
            r0 = move-exception
        L_0x0cb5:
            aucj r2 = r15.b
            xlj r2 = (defpackage.xlj) r2
            int r2 = r2.b
            int r6 = defpackage.xjy.a(r2)
            if (r6 == 0) goto L_0x0cc2
            goto L_0x0cc3
        L_0x0cc2:
            r6 = 1
        L_0x0cc3:
            java.lang.String r2 = defpackage.xjy.b(r6)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 18
            r4.<init>(r3)
            r4.append(r12)
            r4.append(r2)
            r4.append(r11)
            r4.toString()
            aucj r2 = r15.b
            xlj r2 = (defpackage.xlj) r2
            int r2 = r2.a()
            r3 = 1
            if (r2 != r3) goto L_0x0d03
            boolean r2 = r15.c
            if (r2 != 0) goto L_0x0cf6
            goto L_0x0cfc
        L_0x0cf6:
            r15.c()
            r2 = 0
            r15.c = r2
        L_0x0cfc:
            aucj r2 = r15.b
            xlj r2 = (defpackage.xlj) r2
            r2.a((int) r13)
        L_0x0d03:
            long r2 = android.os.SystemClock.elapsedRealtime()
            r15.b()
            aucj r4 = r15.b
            xlj r4 = (defpackage.xlj) r4
            long r2 = r2 - r19
            r4.a((long) r2)
            wml r2 = defpackage.wml.a()
            aucj r3 = r15.i()
            xlj r3 = (defpackage.xlj) r3
            r2.a((defpackage.xlj) r3, (java.lang.String) r1)
            goto L_0x0d22
        L_0x0d21:
            throw r0
        L_0x0d22:
            goto L_0x0d21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public PeopleGalChimeraProvider(Context context, xpp xpp) {
        this.e = context;
        this.a = xpp;
    }

    private final Cursor a(String[] strArr) {
        if (ayuk.a.a().b()) {
            MatrixCursor matrixCursor = new MatrixCursor(strArr);
            for (Account account : this.d.a("com.google")) {
                String valueOf = String.valueOf(account);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("handleDirectories: ");
                sb.append(valueOf);
                sb.toString();
                String str = account.name;
                if (!str.endsWith("@gmail.com") && !str.endsWith("@googlemail.com")) {
                    Object[] objArr = new Object[strArr.length];
                    for (int i = 0; i < strArr.length; i++) {
                        String str2 = strArr[i];
                        if ("accountName".equals(str2)) {
                            objArr[i] = str;
                        } else if ("accountType".equals(str2)) {
                            objArr[i] = account.type;
                        } else if ("typeResourceId".equals(str2)) {
                            objArr[i] = "Google Apps Contacts";
                        } else if ("displayName".equals(str2)) {
                            int indexOf = str.indexOf(64);
                            if (indexOf == -1 || indexOf >= str.length() - 2) {
                                objArr[i] = str;
                            } else {
                                char upperCase = Character.toUpperCase(str.charAt(indexOf + 1));
                                String substring = str.substring(indexOf + 2);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 1);
                                sb2.append(upperCase);
                                sb2.append(substring);
                                objArr[i] = sb2.toString();
                            }
                        } else if ("exportSupport".equals(str2)) {
                            objArr[i] = 1;
                        } else if ("shortcutSupport".equals(str2)) {
                            objArr[i] = 0;
                        } else if ("photoSupport".equals(str2)) {
                            objArr[i] = 3;
                        }
                    }
                    matrixCursor.addRow(objArr);
                }
            }
            return matrixCursor;
        }
        throw new UnsupportedOperationException();
    }

    public static Uri a(String str, boolean z, String str2) {
        Uri build = new Uri.Builder().scheme("content").authority("com.google.contacts.gal.provider").appendEncodedPath("people_photo/").appendQueryParameter("account_name", str).appendQueryParameter("lookup", str2).build();
        return z ? build.buildUpon().appendQueryParameter("sz", Long.toString(ayuk.h())).build() : build;
    }

    public static boolean a(amgi amgi) {
        if (amgi.e.size() <= 0 || ((amgp) amgi.e.get(0)).d) {
            return false;
        }
        return true;
    }

    public final Account a(String str, aucd aucd) {
        if (str != null) {
            for (Account account : this.d.a("com.google")) {
                if (account.name.equals(str)) {
                    return account;
                }
            }
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            xlj xlj = (xlj) aucd.b;
            xlj xlj2 = xlj.g;
            xlj.c = 5;
            xlj.a |= 2;
            Log.e("PeopleGalProvider", str.length() == 0 ? new String("Account not found: ") : "Account not found: ".concat(str));
            return null;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        xlj xlj3 = (xlj) aucd.b;
        xlj xlj4 = xlj.g;
        xlj3.c = 4;
        xlj3.a |= 2;
        Log.e("PeopleGalProvider", "Account name cannot be null.");
        return null;
    }

    /* JADX WARNING: type inference failed for: r9v39, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor a(java.lang.String[] r19, java.lang.String r20, java.lang.String r21, long r22, defpackage.aucd r24) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r0 = r20
            r3 = r21
            r4 = r22
            r6 = r24
            java.lang.String r7 = "Error getPeople grpc response: "
            java.lang.String r8 = java.lang.String.valueOf(r21)
            int r8 = r8.length()
            java.lang.String r9 = java.lang.String.valueOf(r20)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r8 = r8 + 39
            int r8 = r8 + r9
            r10.<init>(r8)
            java.lang.String r8 = "handleContact("
            r10.append(r8)
            r10.append(r3)
            java.lang.String r8 = ", "
            r10.append(r8)
            r10.append(r0)
            r10.append(r8)
            r10.append(r4)
            java.lang.String r8 = ")"
            r10.append(r8)
            r10.toString()
            java.lang.String r8 = "PeopleGalProvider"
            r9 = 0
            if (r0 == 0) goto L_0x06b5
            android.accounts.Account r10 = r1.a(r3, r6)
            if (r10 != 0) goto L_0x0055
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            r0.<init>(r2)
            return r0
        L_0x0055:
            aqvp r11 = defpackage.aqvp.g
            aucd r11 = r11.o()
            aqvo r11 = (defpackage.aqvo) r11
            aqwp r12 = defpackage.aqwp.d
            aucd r12 = r12.o()
            aucd r13 = defpackage.xpx.a()
            boolean r14 = r12.c
            if (r14 == 0) goto L_0x0070
            r12.c()
            r12.c = r9
        L_0x0070:
            aucj r14 = r12.b
            aqwp r14 = (defpackage.aqwp) r14
            aucj r13 = r13.i()
            aqur r13 = (defpackage.aqur) r13
            r13.getClass()
            r14.a = r13
            boolean r13 = r11.c
            if (r13 != 0) goto L_0x0084
            goto L_0x0089
        L_0x0084:
            r11.c()
            r11.c = r9
        L_0x0089:
            aucj r13 = r11.b
            aqvp r13 = (defpackage.aqvp) r13
            aucj r12 = r12.i()
            aqwp r12 = (defpackage.aqwp) r12
            r12.getClass()
            r13.d = r12
            aqww r12 = defpackage.aqww.d
            aucd r12 = r12.o()
            aqwu r12 = (defpackage.aqwu) r12
            aubw r13 = defpackage.aubw.b
            aucd r13 = r13.o()
            aubv r13 = (defpackage.aubv) r13
            java.lang.String r14 = "person.name"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.about"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.nickname"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.birthday"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.gender"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.occupation"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.other_keyword"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.email"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.address"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.im"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.organization"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.contact_group_membership"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.interest"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.user_defined"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.language"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.external_id"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.phone"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.website"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.relation"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.event"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.sip_address"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.client_data"
            r13.a((java.lang.String) r14)
            java.lang.String r14 = "person.photo"
            r13.a((java.lang.String) r14)
            boolean r14 = r12.c
            if (r14 != 0) goto L_0x0120
            goto L_0x0125
        L_0x0120:
            r12.c()
            r12.c = r9
        L_0x0125:
            aucj r14 = r12.b
            aqww r14 = (defpackage.aqww) r14
            aucj r13 = r13.i()
            aubw r13 = (defpackage.aubw) r13
            r13.getClass()
            r14.a = r13
            aqwx r13 = defpackage.aqwx.DOMAIN_PROFILE
            r12.a(r13)
            aqwx r13 = defpackage.aqwx.PROFILE
            r12.a(r13)
            boolean r13 = r11.c
            if (r13 != 0) goto L_0x0143
            goto L_0x0148
        L_0x0143:
            r11.c()
            r11.c = r9
        L_0x0148:
            aucj r13 = r11.b
            aqvp r13 = (defpackage.aqvp) r13
            aucj r12 = r12.i()
            aqww r12 = (defpackage.aqww) r12
            r12.getClass()
            r13.b = r12
            r11.a(r0)
            aucj r0 = r11.i()
            aqvp r0 = (defpackage.aqvp) r0
            com.google.android.gms.common.internal.ClientContext r10 = r1.a((android.accounts.Account) r10)
            xpp r11 = r1.a     // Catch:{ eif -> 0x0674, babk -> 0x0626 }
            aqvr r0 = r11.a((com.google.android.gms.common.internal.ClientContext) r10, (defpackage.aqvp) r0)     // Catch:{ eif -> 0x0674, babk -> 0x0626 }
            aucx r7 = r0.a
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0174
            goto L_0x05e3
        L_0x0174:
            aucx r7 = r0.a
            java.lang.Object r7 = r7.get(r9)
            aqwr r7 = (defpackage.aqwr) r7
            amgi r7 = r7.a
            if (r7 == 0) goto L_0x05e3
            aucx r0 = r0.a
            java.lang.Object r0 = r0.get(r9)
            aqwr r0 = (defpackage.aqwr) r0
            amgi r0 = r0.a
            if (r0 != 0) goto L_0x018e
            amgi r0 = defpackage.amgi.D
        L_0x018e:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r7 = 0
        L_0x0194:
            int r8 = r2.length
            if (r7 >= r8) goto L_0x01a3
            r8 = r2[r7]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r6.put(r8, r10)
            int r7 = r7 + 1
            goto L_0x0194
        L_0x01a3:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r8 = r0.b
            wsn r10 = defpackage.wsn.a
            aucx r11 = r0.d
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x01cf
            aucx r11 = r0.d
            java.util.List r11 = r10.a((java.util.List) r11, (java.lang.String) r8)
            if (r11 == 0) goto L_0x01cf
            boolean r12 = r11.isEmpty()
            if (r12 != 0) goto L_0x01cf
            java.lang.Object r11 = r11.get(r9)
            android.content.ContentValues r11 = (android.content.ContentValues) r11
            java.lang.Object[] r11 = defpackage.xqd.a(r6, r11, r4)
            r7.add(r11)
        L_0x01cf:
            aucx r11 = r0.i
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x01f2
            aucx r11 = r0.i
            java.util.List r11 = r10.a((java.util.List) r11, (java.lang.String) r8)
            if (r11 == 0) goto L_0x01f2
            boolean r12 = r11.isEmpty()
            if (r12 != 0) goto L_0x01f2
            java.lang.Object r11 = r11.get(r9)
            android.content.ContentValues r11 = (android.content.ContentValues) r11
            java.lang.Object[] r11 = defpackage.xqd.a(r6, r11, r4)
            r7.add(r11)
        L_0x01f2:
            aucx r11 = r0.l
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x0215
            aucx r11 = r0.l
            java.util.List r11 = r10.a((java.util.List) r11, (java.lang.String) r8)
            if (r11 == 0) goto L_0x0215
            boolean r12 = r11.isEmpty()
            if (r12 != 0) goto L_0x0215
            java.lang.Object r11 = r11.get(r9)
            android.content.ContentValues r11 = (android.content.ContentValues) r11
            java.lang.Object[] r11 = defpackage.xqd.a(r6, r11, r4)
            r7.add(r11)
        L_0x0215:
            aucx r11 = r0.k
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x0238
            aucx r11 = r0.k
            java.util.List r11 = r10.a((java.util.List) r11, (java.lang.String) r8)
            if (r11 == 0) goto L_0x0238
            boolean r12 = r11.isEmpty()
            if (r12 != 0) goto L_0x0238
            java.lang.Object r11 = r11.get(r9)
            android.content.ContentValues r11 = (android.content.ContentValues) r11
            java.lang.Object[] r11 = defpackage.xqd.a(r6, r11, r4)
            r7.add(r11)
        L_0x0238:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            aucx r12 = r0.f
            aucx r13 = r0.l
            aucx r14 = r0.n
            aucx r9 = r0.w
            r20 = r15
            r15 = r9
            r16 = r11
            r17 = r20
            defpackage.xwy.a(r12, r13, r14, r15, r16, r17)
            int r9 = r20.size()
            r12 = 0
        L_0x0259:
            if (r12 >= r9) goto L_0x026d
            r13 = r20
            java.lang.Object r14 = r13.get(r12)
            android.content.ContentValues r14 = (android.content.ContentValues) r14
            java.lang.Object[] r14 = defpackage.xqd.a(r6, r14, r4)
            r7.add(r14)
            int r12 = r12 + 1
            goto L_0x0259
        L_0x026d:
            aucx r9 = r0.g
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x029a
            aucx r9 = r0.g
            java.util.List r9 = defpackage.wsn.b(r9, r8)
            if (r9 == 0) goto L_0x029a
            boolean r12 = r9.isEmpty()
            if (r12 != 0) goto L_0x029a
            int r12 = r9.size()
            r13 = 0
        L_0x0288:
            if (r13 >= r12) goto L_0x029a
            java.lang.Object r14 = r9.get(r13)
            android.content.ContentValues r14 = (android.content.ContentValues) r14
            java.lang.Object[] r14 = defpackage.xqd.a(r6, r14, r4)
            r7.add(r14)
            int r13 = r13 + 1
            goto L_0x0288
        L_0x029a:
            aucx r9 = r0.o
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x02c8
            aucx r9 = r0.o
            java.util.List r9 = r10.a((java.util.List) r9, (java.lang.String) r8)
            if (r9 == 0) goto L_0x02c8
            boolean r12 = r9.isEmpty()
            if (r12 != 0) goto L_0x02c8
            java.util.Iterator r9 = r9.iterator()
        L_0x02b4:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x02c8
            java.lang.Object r12 = r9.next()
            android.content.ContentValues r12 = (android.content.ContentValues) r12
            java.lang.Object[] r12 = defpackage.xqd.a(r6, r12, r4)
            r7.add(r12)
            goto L_0x02b4
        L_0x02c8:
            aucx r9 = r0.q
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x02f6
            aucx r9 = r0.q
            java.util.List r9 = r10.a((java.util.List) r9, (java.lang.String) r8)
            if (r9 == 0) goto L_0x02f6
            boolean r12 = r9.isEmpty()
            if (r12 != 0) goto L_0x02f6
            java.util.Iterator r9 = r9.iterator()
        L_0x02e2:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x02f6
            java.lang.Object r12 = r9.next()
            android.content.ContentValues r12 = (android.content.ContentValues) r12
            java.lang.Object[] r12 = defpackage.xqd.a(r6, r12, r4)
            r7.add(r12)
            goto L_0x02e2
        L_0x02f6:
            aucx r9 = r0.m
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0324
            aucx r9 = r0.m
            java.util.List r9 = r10.a((java.util.List) r9, (java.lang.String) r8)
            if (r9 == 0) goto L_0x0324
            boolean r12 = r9.isEmpty()
            if (r12 != 0) goto L_0x0324
            java.util.Iterator r9 = r9.iterator()
        L_0x0310:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x0324
            java.lang.Object r12 = r9.next()
            android.content.ContentValues r12 = (android.content.ContentValues) r12
            java.lang.Object[] r12 = defpackage.xqd.a(r6, r12, r4)
            r7.add(r12)
            goto L_0x0310
        L_0x0324:
            aucx r9 = r0.C
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0352
            aucx r9 = r0.C
            java.util.List r9 = r10.a((java.util.List) r9, (java.lang.String) r8)
            if (r9 == 0) goto L_0x0352
            boolean r12 = r9.isEmpty()
            if (r12 != 0) goto L_0x0352
            java.util.Iterator r9 = r9.iterator()
        L_0x033e:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x0352
            java.lang.Object r12 = r9.next()
            android.content.ContentValues r12 = (android.content.ContentValues) r12
            java.lang.Object[] r12 = defpackage.xqd.a(r6, r12, r4)
            r7.add(r12)
            goto L_0x033e
        L_0x0352:
            aucx r9 = r0.v
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0381
            aucx r9 = r0.v
            java.util.List r9 = r10.a((java.util.List) r9, (java.lang.String) r8)
            if (r9 != 0) goto L_0x0363
            goto L_0x0381
        L_0x0363:
            boolean r12 = r9.isEmpty()
            if (r12 != 0) goto L_0x0381
            java.util.Iterator r9 = r9.iterator()
        L_0x036d:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x0381
            java.lang.Object r12 = r9.next()
            android.content.ContentValues r12 = (android.content.ContentValues) r12
            java.lang.Object[] r12 = defpackage.xqd.a(r6, r12, r4)
            r7.add(r12)
            goto L_0x036d
        L_0x0381:
            int r9 = r11.size()
            r12 = 0
        L_0x0386:
            if (r12 >= r9) goto L_0x0398
            java.lang.Object r13 = r11.get(r12)
            android.content.ContentValues r13 = (android.content.ContentValues) r13
            java.lang.Object[] r13 = defpackage.xqd.a(r6, r13, r4)
            r7.add(r13)
            int r12 = r12 + 1
            goto L_0x0386
        L_0x0398:
            aucx r9 = r0.s
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x03c6
            aucx r9 = r0.s
            java.util.List r9 = r10.a((java.util.List) r9, (java.lang.String) r8)
            if (r9 == 0) goto L_0x03c6
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto L_0x03c6
            java.util.Iterator r9 = r9.iterator()
        L_0x03b2:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x03c6
            java.lang.Object r11 = r9.next()
            android.content.ContentValues r11 = (android.content.ContentValues) r11
            java.lang.Object[] r11 = defpackage.xqd.a(r6, r11, r4)
            r7.add(r11)
            goto L_0x03b2
        L_0x03c6:
            aucx r9 = r0.y
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x03f4
            aucx r9 = r0.y
            java.util.List r9 = r10.a((java.util.List) r9, (java.lang.String) r8)
            if (r9 == 0) goto L_0x03f4
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto L_0x03f4
            java.util.Iterator r9 = r9.iterator()
        L_0x03e0:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x03f4
            java.lang.Object r11 = r9.next()
            android.content.ContentValues r11 = (android.content.ContentValues) r11
            java.lang.Object[] r11 = defpackage.xqd.a(r6, r11, r4)
            r7.add(r11)
            goto L_0x03e0
        L_0x03f4:
            aucx r9 = r0.z
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0422
            aucx r9 = r0.z
            java.util.List r9 = r10.a((java.util.List) r9, (java.lang.String) r8)
            if (r9 == 0) goto L_0x0422
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto L_0x0422
            java.util.Iterator r9 = r9.iterator()
        L_0x040e:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0422
            java.lang.Object r11 = r9.next()
            android.content.ContentValues r11 = (android.content.ContentValues) r11
            java.lang.Object[] r11 = defpackage.xqd.a(r6, r11, r4)
            r7.add(r11)
            goto L_0x040e
        L_0x0422:
            aucx r9 = r0.h
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0450
            aucx r9 = r0.h
            java.util.List r9 = r10.a((java.util.List) r9, (java.lang.String) r8)
            if (r9 == 0) goto L_0x0450
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto L_0x0450
            java.util.Iterator r9 = r9.iterator()
        L_0x043c:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0450
            java.lang.Object r11 = r9.next()
            android.content.ContentValues r11 = (android.content.ContentValues) r11
            java.lang.Object[] r11 = defpackage.xqd.a(r6, r11, r4)
            r7.add(r11)
            goto L_0x043c
        L_0x0450:
            aucx r9 = r0.j
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x047e
            aucx r9 = r0.j
            java.util.List r9 = r10.a((java.util.List) r9, (java.lang.String) r8)
            if (r9 == 0) goto L_0x047e
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto L_0x047e
            java.util.Iterator r9 = r9.iterator()
        L_0x046a:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x047e
            java.lang.Object r11 = r9.next()
            android.content.ContentValues r11 = (android.content.ContentValues) r11
            java.lang.Object[] r11 = defpackage.xqd.a(r6, r11, r4)
            r7.add(r11)
            goto L_0x046a
        L_0x047e:
            aucx r9 = r0.p
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x04ac
            aucx r9 = r0.p
            java.util.List r9 = r10.a((java.util.List) r9, (java.lang.String) r8)
            if (r9 == 0) goto L_0x04ac
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto L_0x04ac
            java.util.Iterator r9 = r9.iterator()
        L_0x0498:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x04ac
            java.lang.Object r11 = r9.next()
            android.content.ContentValues r11 = (android.content.ContentValues) r11
            java.lang.Object[] r11 = defpackage.xqd.a(r6, r11, r4)
            r7.add(r11)
            goto L_0x0498
        L_0x04ac:
            aucx r9 = r0.r
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x04da
            aucx r9 = r0.r
            java.util.List r9 = r10.a((java.util.List) r9, (java.lang.String) r8)
            if (r9 == 0) goto L_0x04da
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto L_0x04da
            java.util.Iterator r9 = r9.iterator()
        L_0x04c6:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x04da
            java.lang.Object r11 = r9.next()
            android.content.ContentValues r11 = (android.content.ContentValues) r11
            java.lang.Object[] r11 = defpackage.xqd.a(r6, r11, r4)
            r7.add(r11)
            goto L_0x04c6
        L_0x04da:
            aucx r9 = r0.u
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0508
            aucx r9 = r0.u
            java.util.List r8 = r10.a((java.util.List) r9, (java.lang.String) r8)
            if (r8 == 0) goto L_0x0508
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x0508
            java.util.Iterator r8 = r8.iterator()
        L_0x04f4:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0508
            java.lang.Object r9 = r8.next()
            android.content.ContentValues r9 = (android.content.ContentValues) r9
            java.lang.Object[] r9 = defpackage.xqd.a(r6, r9, r4)
            r7.add(r9)
            goto L_0x04f4
        L_0x0508:
            aucx r8 = r0.A
            r9 = 0
            amfc[] r10 = new defpackage.amfc[r9]
            java.lang.Object[] r8 = r8.toArray(r10)
            amfc[] r8 = (defpackage.amfc[]) r8
            java.util.List r8 = defpackage.xwy.a((defpackage.amfc[]) r8)
            if (r8 == 0) goto L_0x0536
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x0536
            int r9 = r8.size()
            r10 = 0
        L_0x0524:
            if (r10 >= r9) goto L_0x0536
            java.lang.Object r11 = r8.get(r10)
            android.content.ContentValues r11 = (android.content.ContentValues) r11
            java.lang.Object[] r11 = defpackage.xqd.a(r6, r11, r4)
            r7.add(r11)
            int r10 = r10 + 1
            goto L_0x0524
        L_0x0536:
            boolean r8 = r7.isEmpty()
            r9 = 0
            if (r8 != 0) goto L_0x05e2
            r8 = 0
            java.lang.Object r10 = r7.get(r8)
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            java.lang.Long r4 = java.lang.Long.valueOf(r22)
            java.lang.String r5 = "contact_id"
            defpackage.xqd.a(r10, r6, r5, r4)
            android.util.Pair r4 = defpackage.xpw.a(r0)
            if (r4 == 0) goto L_0x056e
            java.lang.Object r5 = r4.first
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = defpackage.xpw.a(r0, r5)
            java.lang.Object r8 = r4.first
            java.lang.String r11 = "display_name"
            defpackage.xqd.a(r10, r6, r11, r8)
            java.lang.Object r4 = r4.second
            java.lang.String r8 = "display_name_source"
            defpackage.xqd.a(r10, r6, r8, r4)
            java.lang.String r4 = "display_name_alt"
            defpackage.xqd.a(r10, r6, r4, r5)
        L_0x056e:
            java.lang.String r4 = "account_type"
            java.lang.String r5 = "com.google"
            defpackage.xqd.a(r10, r6, r4, r5)
            java.lang.String r4 = "account_name"
            defpackage.xqd.a(r10, r6, r4, r3)
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.String r8 = "raw_contact_is_read_only"
            defpackage.xqd.a(r10, r6, r8, r5)
            java.lang.String r8 = "is_read_only"
            defpackage.xqd.a(r10, r6, r8, r5)
            boolean r5 = a((defpackage.amgi) r0)
            if (r5 == 0) goto L_0x05b9
            java.lang.String r5 = r0.b
            r8 = 0
            android.net.Uri r5 = a(r3, r8, r5)
            if (r5 == 0) goto L_0x059e
            java.lang.String r5 = r5.toString()
            goto L_0x059f
        L_0x059e:
            r5 = r9
        L_0x059f:
            java.lang.String r8 = "photo_uri"
            defpackage.xqd.a(r10, r6, r8, r5)
            java.lang.String r0 = r0.b
            android.net.Uri r0 = a(r3, r4, r0)
            if (r0 == 0) goto L_0x05b2
            java.lang.String r9 = r0.toString()
            goto L_0x05b3
        L_0x05b2:
        L_0x05b3:
            java.lang.String r0 = "photo_thumb_uri"
            defpackage.xqd.a(r10, r6, r0, r9)
        L_0x05b9:
            android.database.MatrixCursor r9 = new android.database.MatrixCursor
            int r0 = r7.size()
            r9.<init>(r2, r0)
            r0 = 0
        L_0x05c3:
            int r2 = r7.size()
            if (r0 >= r2) goto L_0x05e2
            java.lang.Object r2 = r7.get(r0)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            if (r2 == 0) goto L_0x05df
            int r3 = r0 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "data_id"
            defpackage.xqd.a(r2, r6, r4, r3)
            r9.addRow(r2)
        L_0x05df:
            int r0 = r0 + 1
            goto L_0x05c3
        L_0x05e2:
            return r9
        L_0x05e3:
            java.lang.String r0 = java.lang.String.valueOf(r21)
            int r0 = r0.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r0 = r0 + 44
            r4.<init>(r0)
            java.lang.String r0 = "Can't find person: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = " for the given lookup key"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.e(r8, r0)
            boolean r0 = r6.c
            if (r0 != 0) goto L_0x060b
            goto L_0x0611
        L_0x060b:
            r24.c()
            r3 = 0
            r6.c = r3
        L_0x0611:
            aucj r0 = r6.b
            xlj r0 = (defpackage.xlj) r0
            xlj r3 = defpackage.xlj.g
            r3 = 7
            r0.c = r3
            int r3 = r0.a
            r3 = r3 | 2
            r0.a = r3
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            r0.<init>(r2)
            return r0
        L_0x0626:
            r0 = move-exception
            boolean r3 = r6.c
            if (r3 != 0) goto L_0x062c
            goto L_0x0632
        L_0x062c:
            r24.c()
            r3 = 0
            r6.c = r3
        L_0x0632:
            aucj r3 = r6.b
            xlj r3 = (defpackage.xlj) r3
            xlj r4 = defpackage.xlj.g
            r4 = 14
            r3.c = r4
            int r4 = r3.a
            r4 = r4 | 2
            r3.a = r4
            babj r5 = r0.a
            babg r5 = r5.r
            int r5 = r5.r
            r4 = r4 | 16
            r3.a = r4
            r3.f = r5
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 31
            r4.<init>(r3)
            r4.append(r7)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.e(r8, r0)
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            r0.<init>(r2)
            return r0
        L_0x0674:
            r0 = move-exception
            boolean r3 = r6.c
            if (r3 != 0) goto L_0x067a
            goto L_0x0680
        L_0x067a:
            r24.c()
            r3 = 0
            r6.c = r3
        L_0x0680:
            aucj r3 = r6.b
            xlj r3 = (defpackage.xlj) r3
            xlj r4 = defpackage.xlj.g
            r4 = 3
            r3.c = r4
            int r4 = r3.a
            r4 = r4 | 2
            r3.a = r4
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 31
            r4.<init>(r3)
            r4.append(r7)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.e(r8, r0)
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            r0.<init>(r2)
            return r0
        L_0x06b5:
            java.lang.String r0 = "lookup key cannot be null."
            android.util.Log.e(r8, r0)
            boolean r0 = r6.c
            if (r0 != 0) goto L_0x06c0
            goto L_0x06c6
        L_0x06c0:
            r24.c()
            r3 = 0
            r6.c = r3
        L_0x06c6:
            aucj r0 = r6.b
            xlj r0 = (defpackage.xlj) r0
            xlj r3 = defpackage.xlj.g
            r3 = 6
            r0.c = r3
            int r3 = r0.a
            r3 = r3 | 2
            r0.a = r3
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider.a(java.lang.String[], java.lang.String, java.lang.String, long, aucd):android.database.Cursor");
    }

    public final ClientContext a(Account account) {
        ClientContext a2 = xpl.a(this.e, account);
        if (this.a == null) {
            Context context = this.e;
            this.a = xpp.a(context, context.getApplicationInfo().uid);
        }
        return a2;
    }
}
