package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.net.Uri;
import android.provider.ContactsContract;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: xwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xwk {
    public static final /* synthetic */ int a = 0;
    private static final String[] e = {"_id", "title", "account_type"};
    private static final String[] f = {"_id", "title", "account_type", "data_set"};
    private final wmh b;
    private final ContentResolver c;
    private final Account d;
    private final xyn g;
    private final aucd h;

    public xwk(ContentResolver contentResolver, wmh wmh, Account account, yaz yaz, aucd aucd) {
        xyn xyn = new xyn(new xvw(account, contentResolver, yaz, false), account, contentResolver);
        this.c = contentResolver;
        this.b = wmh;
        this.d = account;
        this.h = aucd;
        this.g = xyn;
    }

    public final Map a(xwb xwb) {
        TreeMap b2 = anet.b();
        while (true) {
            try {
                xvu a2 = xwb.b();
                if (a2 == null) {
                    break;
                } else if (this.b.a(a2.o(), a2.p()).c == wmb.DEVICE) {
                    b2.put(a2.g(), a2.l());
                }
            } catch (Throwable th) {
                if (xwb != null) {
                    xwb.f();
                }
                throw th;
            }
        }
        if (xwb != null) {
            xwb.f();
        }
        return b2;
    }

    public final xwb a(String str) {
        String[] strArr;
        if (aytd.d()) {
            strArr = f;
        } else {
            strArr = e;
        }
        ContentResolver contentResolver = this.c;
        Uri uri = ContactsContract.Groups.CONTENT_URI;
        String[] strArr2 = xvw.a;
        return xwb.b(contentResolver, uri, strArr, str, (String[]) null, "_id");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x022f, code lost:
        if (r25 == false) goto L_0x0231;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Map r24, boolean r25) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            java.lang.String r2 = "\""
            r3 = 1
            r4 = 0
            java.util.Collection r5 = r24.values()     // Catch:{ RemoteException -> 0x0367 }
            java.util.TreeMap r6 = defpackage.anet.b()     // Catch:{ RemoteException -> 0x0367 }
            boolean r7 = r5.isEmpty()     // Catch:{ RemoteException -> 0x0367 }
            r8 = 2
            if (r7 == 0) goto L_0x0018
            goto L_0x0076
        L_0x0018:
            android.content.ContentResolver r9 = r1.c     // Catch:{ RemoteException -> 0x0367 }
            android.net.Uri r7 = android.provider.ContactsContract.Groups.CONTENT_URI     // Catch:{ RemoteException -> 0x0367 }
            android.accounts.Account r10 = r1.d     // Catch:{ RemoteException -> 0x0367 }
            android.net.Uri r10 = defpackage.xvw.a((android.net.Uri) r7, (android.accounts.Account) r10)     // Catch:{ RemoteException -> 0x0367 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0367 }
            r7.<init>()     // Catch:{ RemoteException -> 0x0367 }
            java.lang.String r11 = "title IN ("
            r7.append(r11)     // Catch:{ RemoteException -> 0x0367 }
            java.lang.String r11 = "\",\""
            java.lang.String r5 = android.text.TextUtils.join(r11, r5)     // Catch:{ RemoteException -> 0x0367 }
            java.lang.String r11 = java.lang.String.valueOf(r5)     // Catch:{ RemoteException -> 0x0367 }
            int r11 = r11.length()     // Catch:{ RemoteException -> 0x0367 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0367 }
            int r11 = r11 + r8
            r12.<init>(r11)     // Catch:{ RemoteException -> 0x0367 }
            r12.append(r2)     // Catch:{ RemoteException -> 0x0367 }
            r12.append(r5)     // Catch:{ RemoteException -> 0x0367 }
            r12.append(r2)     // Catch:{ RemoteException -> 0x0367 }
            java.lang.String r2 = r12.toString()     // Catch:{ RemoteException -> 0x0367 }
            r7.append(r2)     // Catch:{ RemoteException -> 0x0367 }
            java.lang.String r2 = ")"
            r7.append(r2)     // Catch:{ RemoteException -> 0x0367 }
            java.lang.String r12 = r7.toString()     // Catch:{ RemoteException -> 0x0367 }
            java.lang.String r14 = "title"
            r11 = 0
            r13 = 0
            xwb r2 = defpackage.xwb.b(r9, r10, r11, r12, r13, r14)     // Catch:{ RemoteException -> 0x0367 }
        L_0x0061:
            xvu r5 = r2.b()     // Catch:{ all -> 0x0362 }
            if (r5 == 0) goto L_0x0073
            java.lang.String r7 = r5.l()     // Catch:{ all -> 0x0362 }
            java.lang.Long r5 = r5.g()     // Catch:{ all -> 0x0362 }
            r6.put(r7, r5)     // Catch:{ all -> 0x0362 }
            goto L_0x0061
        L_0x0073:
            r2.f()     // Catch:{ RemoteException -> 0x0367 }
        L_0x0076:
            java.util.TreeMap r2 = defpackage.anet.b()     // Catch:{ RemoteException -> 0x0367 }
            java.util.Set r5 = r24.keySet()     // Catch:{ RemoteException -> 0x0367 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ RemoteException -> 0x0367 }
        L_0x0082:
            boolean r7 = r5.hasNext()     // Catch:{ RemoteException -> 0x0367 }
            if (r7 == 0) goto L_0x00a4
            java.lang.Object r7 = r5.next()     // Catch:{ RemoteException -> 0x0367 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ RemoteException -> 0x0367 }
            java.lang.Object r9 = r0.get(r7)     // Catch:{ RemoteException -> 0x0367 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ RemoteException -> 0x0367 }
            boolean r10 = r6.containsKey(r9)     // Catch:{ RemoteException -> 0x0367 }
            if (r10 == 0) goto L_0x0082
            java.lang.Object r9 = r6.get(r9)     // Catch:{ RemoteException -> 0x0367 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ RemoteException -> 0x0367 }
            r2.put(r7, r9)     // Catch:{ RemoteException -> 0x0367 }
            goto L_0x0082
        L_0x00a4:
            java.util.TreeMap r5 = defpackage.anet.b()     // Catch:{ RemoteException -> 0x031b }
            java.util.Set r6 = r24.keySet()     // Catch:{ RemoteException -> 0x031b }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x031b }
        L_0x00b0:
            boolean r7 = r6.hasNext()     // Catch:{ RemoteException -> 0x031b }
            r9 = 0
            java.lang.String r10 = "system_id IS NULL AND group_is_read_only IS 0"
            if (r7 == 0) goto L_0x01ac
            java.lang.Object r7 = r6.next()     // Catch:{ RemoteException -> 0x031b }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ RemoteException -> 0x031b }
            java.lang.Object r12 = r0.get(r7)     // Catch:{ RemoteException -> 0x031b }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ RemoteException -> 0x031b }
            boolean r13 = r2.containsKey(r7)     // Catch:{ RemoteException -> 0x031b }
            if (r13 != 0) goto L_0x01a9
            boolean r13 = r5.containsKey(r12)     // Catch:{ RemoteException -> 0x031b }
            if (r13 == 0) goto L_0x00db
            java.lang.Object r9 = r5.get(r12)     // Catch:{ RemoteException -> 0x031b }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ RemoteException -> 0x031b }
            r2.put(r7, r9)     // Catch:{ RemoteException -> 0x031b }
            goto L_0x00b0
        L_0x00db:
            if (r25 == 0) goto L_0x0155
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ RemoteException -> 0x031b }
            r9.<init>()     // Catch:{ RemoteException -> 0x031b }
            java.lang.String r10 = "title"
            r9.put(r10, r12)     // Catch:{ RemoteException -> 0x031b }
            java.lang.String r10 = "group_visible"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)     // Catch:{ RemoteException -> 0x031b }
            r9.put(r10, r11)     // Catch:{ RemoteException -> 0x031b }
            android.accounts.Account r10 = r1.d     // Catch:{ RemoteException -> 0x031b }
            android.net.Uri r11 = android.provider.ContactsContract.Groups.CONTENT_URI     // Catch:{ RemoteException -> 0x031b }
            android.net.Uri r10 = defpackage.xvw.a(r11, r10, r4)     // Catch:{ RemoteException -> 0x031b }
            android.content.ContentResolver r11 = r1.c     // Catch:{ RemoteException -> 0x031b }
            android.net.Uri r9 = r11.insert(r10, r9)     // Catch:{ RemoteException -> 0x031b }
            if (r9 == 0) goto L_0x0130
            long r9 = android.content.ContentUris.parseId(r9)     // Catch:{ RemoteException -> 0x031b }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ RemoteException -> 0x031b }
            r2.put(r7, r9)     // Catch:{ RemoteException -> 0x031b }
            r5.put(r12, r9)     // Catch:{ RemoteException -> 0x031b }
            aucd r7 = r1.h     // Catch:{ RemoteException -> 0x031b }
            aucj r9 = r7.b     // Catch:{ RemoteException -> 0x031b }
            xmy r9 = (defpackage.xmy) r9     // Catch:{ RemoteException -> 0x031b }
            int r9 = r9.e     // Catch:{ RemoteException -> 0x031b }
            int r9 = r9 + r3
            boolean r10 = r7.c     // Catch:{ RemoteException -> 0x031b }
            if (r10 != 0) goto L_0x011c
            goto L_0x0121
        L_0x011c:
            r7.c()     // Catch:{ RemoteException -> 0x031b }
            r7.c = r4     // Catch:{ RemoteException -> 0x031b }
        L_0x0121:
            aucj r7 = r7.b     // Catch:{ RemoteException -> 0x031b }
            xmy r7 = (defpackage.xmy) r7     // Catch:{ RemoteException -> 0x031b }
            xmy r10 = defpackage.xmy.m     // Catch:{ RemoteException -> 0x031b }
            int r10 = r7.a     // Catch:{ RemoteException -> 0x031b }
            r10 = r10 | 16
            r7.a = r10     // Catch:{ RemoteException -> 0x031b }
            r7.e = r9     // Catch:{ RemoteException -> 0x031b }
            goto L_0x00b0
        L_0x0130:
            android.os.RemoteException r0 = new android.os.RemoteException     // Catch:{ RemoteException -> 0x031b }
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ RemoteException -> 0x031b }
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ RemoteException -> 0x031b }
            int r5 = r5.length()     // Catch:{ RemoteException -> 0x031b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x031b }
            int r5 = r5 + 58
            r6.<init>(r5)     // Catch:{ RemoteException -> 0x031b }
            java.lang.String r5 = "ContentResolver.insert returns null Uri. Uri to insert: %s"
            r6.append(r5)     // Catch:{ RemoteException -> 0x031b }
            r6.append(r2)     // Catch:{ RemoteException -> 0x031b }
            java.lang.String r2 = r6.toString()     // Catch:{ RemoteException -> 0x031b }
            r0.<init>(r2)     // Catch:{ RemoteException -> 0x031b }
            throw r0     // Catch:{ RemoteException -> 0x031b }
        L_0x0155:
            long r13 = r7.longValue()     // Catch:{ RemoteException -> 0x031b }
            android.content.ContentValues r15 = new android.content.ContentValues     // Catch:{ RemoteException -> 0x031b }
            r15.<init>()     // Catch:{ RemoteException -> 0x031b }
            java.lang.String r8 = "account_name"
            android.accounts.Account r11 = r1.d     // Catch:{ RemoteException -> 0x031b }
            java.lang.String r11 = r11.name     // Catch:{ RemoteException -> 0x031b }
            r15.put(r8, r11)     // Catch:{ RemoteException -> 0x031b }
            java.lang.String r8 = "account_type"
            android.accounts.Account r11 = r1.d     // Catch:{ RemoteException -> 0x031b }
            java.lang.String r11 = r11.type     // Catch:{ RemoteException -> 0x031b }
            r15.put(r8, r11)     // Catch:{ RemoteException -> 0x031b }
            java.lang.String r8 = "sourceid"
            r15.putNull(r8)     // Catch:{ RemoteException -> 0x031b }
            android.net.Uri r8 = android.provider.ContactsContract.Groups.CONTENT_URI     // Catch:{ RemoteException -> 0x031b }
            android.net.Uri r8 = android.content.ContentUris.withAppendedId(r8, r13)     // Catch:{ RemoteException -> 0x031b }
            android.content.ContentResolver r11 = r1.c     // Catch:{ RemoteException -> 0x031b }
            java.lang.String[] r13 = defpackage.xvw.a     // Catch:{ RemoteException -> 0x031b }
            r11.update(r8, r15, r10, r9)     // Catch:{ RemoteException -> 0x031b }
            r5.put(r12, r7)     // Catch:{ RemoteException -> 0x031b }
            aucd r7 = r1.h     // Catch:{ RemoteException -> 0x031b }
            aucj r8 = r7.b     // Catch:{ RemoteException -> 0x031b }
            xmy r8 = (defpackage.xmy) r8     // Catch:{ RemoteException -> 0x031b }
            int r8 = r8.d     // Catch:{ RemoteException -> 0x031b }
            int r8 = r8 + r3
            boolean r9 = r7.c     // Catch:{ RemoteException -> 0x031b }
            if (r9 != 0) goto L_0x0193
            goto L_0x0198
        L_0x0193:
            r7.c()     // Catch:{ RemoteException -> 0x031b }
            r7.c = r4     // Catch:{ RemoteException -> 0x031b }
        L_0x0198:
            aucj r7 = r7.b     // Catch:{ RemoteException -> 0x031b }
            xmy r7 = (defpackage.xmy) r7     // Catch:{ RemoteException -> 0x031b }
            xmy r9 = defpackage.xmy.m     // Catch:{ RemoteException -> 0x031b }
            int r9 = r7.a     // Catch:{ RemoteException -> 0x031b }
            r11 = 4
            r9 = r9 | r11
            r7.a = r9     // Catch:{ RemoteException -> 0x031b }
            r7.d = r8     // Catch:{ RemoteException -> 0x031b }
            r8 = 2
            goto L_0x00b0
        L_0x01a9:
            r8 = 2
            goto L_0x00b0
        L_0x01ac:
            r11 = 4
            aytd r0 = defpackage.aytd.a     // Catch:{ RemoteException -> 0x02d5 }
            ayte r0 = r0.a()     // Catch:{ RemoteException -> 0x02d5 }
            long r5 = r0.N()     // Catch:{ RemoteException -> 0x02d5 }
            java.util.Set r0 = r2.entrySet()     // Catch:{ RemoteException -> 0x02d5 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RemoteException -> 0x02d5 }
            r7 = 0
        L_0x01c0:
            boolean r8 = r0.hasNext()     // Catch:{ RemoteException -> 0x02d5 }
            if (r8 == 0) goto L_0x01f4
            java.lang.Object r8 = r0.next()     // Catch:{ RemoteException -> 0x02d5 }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ RemoteException -> 0x02d5 }
            r8.getKey()     // Catch:{ RemoteException -> 0x02d5 }
            r8.getValue()     // Catch:{ RemoteException -> 0x02d5 }
            xyn r12 = r1.g     // Catch:{ RemoteException -> 0x02d5 }
            java.lang.Object r13 = r8.getKey()     // Catch:{ RemoteException -> 0x02d5 }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ RemoteException -> 0x02d5 }
            long r17 = r13.longValue()     // Catch:{ RemoteException -> 0x02d5 }
            java.lang.Object r8 = r8.getValue()     // Catch:{ RemoteException -> 0x02d5 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ RemoteException -> 0x02d5 }
            long r19 = r8.longValue()     // Catch:{ RemoteException -> 0x02d5 }
            r16 = r12
            r21 = r5
            int r8 = r16.a((long) r17, (long) r19, (long) r21)     // Catch:{ RemoteException -> 0x02d5 }
            if (r8 < 0) goto L_0x01c0
            int r7 = r7 + r8
            goto L_0x01c0
        L_0x01f4:
            if (r7 <= 0) goto L_0x022f
            if (r25 != 0) goto L_0x0213
            aucd r0 = r1.h     // Catch:{ RemoteException -> 0x02d5 }
            boolean r5 = r0.c     // Catch:{ RemoteException -> 0x02d5 }
            if (r5 != 0) goto L_0x01ff
            goto L_0x0204
        L_0x01ff:
            r0.c()     // Catch:{ RemoteException -> 0x02d5 }
            r0.c = r4     // Catch:{ RemoteException -> 0x02d5 }
        L_0x0204:
            aucj r0 = r0.b     // Catch:{ RemoteException -> 0x02d5 }
            xmy r0 = (defpackage.xmy) r0     // Catch:{ RemoteException -> 0x02d5 }
            xmy r5 = defpackage.xmy.m     // Catch:{ RemoteException -> 0x02d5 }
            int r5 = r0.a     // Catch:{ RemoteException -> 0x02d5 }
            r5 = r5 | 512(0x200, float:7.175E-43)
            r0.a = r5     // Catch:{ RemoteException -> 0x02d5 }
            r0.j = r7     // Catch:{ RemoteException -> 0x02d5 }
            goto L_0x0231
        L_0x0213:
            aucd r0 = r1.h     // Catch:{ RemoteException -> 0x02d5 }
            boolean r5 = r0.c     // Catch:{ RemoteException -> 0x02d5 }
            if (r5 != 0) goto L_0x021a
            goto L_0x021f
        L_0x021a:
            r0.c()     // Catch:{ RemoteException -> 0x02d5 }
            r0.c = r4     // Catch:{ RemoteException -> 0x02d5 }
        L_0x021f:
            aucj r0 = r0.b     // Catch:{ RemoteException -> 0x02d5 }
            xmy r0 = (defpackage.xmy) r0     // Catch:{ RemoteException -> 0x02d5 }
            xmy r5 = defpackage.xmy.m     // Catch:{ RemoteException -> 0x02d5 }
            int r5 = r0.a     // Catch:{ RemoteException -> 0x02d5 }
            r5 = r5 | 256(0x100, float:3.59E-43)
            r0.a = r5     // Catch:{ RemoteException -> 0x02d5 }
            r0.i = r7     // Catch:{ RemoteException -> 0x02d5 }
            goto L_0x02af
        L_0x022f:
            if (r25 != 0) goto L_0x02af
        L_0x0231:
            java.util.Set r0 = r2.keySet()
            android.net.Uri r5 = android.provider.ContactsContract.Groups.CONTENT_URI
            android.net.Uri$Builder r5 = r5.buildUpon()
            java.lang.String r6 = "caller_is_syncadapter"
            java.lang.String r7 = "true"
            android.net.Uri$Builder r5 = r5.appendQueryParameter(r6, r7)
            android.net.Uri r5 = r5.build()
            android.content.ContentResolver r6 = r1.c
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r4] = r10
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            amqy r0 = defpackage.xwj.a
            java.util.List r0 = defpackage.anda.a((java.util.List) r8, (defpackage.amqy) r0)
            java.lang.String r8 = ","
            java.lang.String r0 = android.text.TextUtils.join(r8, r0)
            r7[r3] = r0
            java.lang.String r0 = "(%s) AND (_id in (%s))"
            java.lang.String r0 = java.lang.String.format(r0, r7)
            java.lang.String[] r3 = defpackage.xvw.a
            int r0 = r6.delete(r5, r0, r9)
            if (r0 <= 0) goto L_0x0289
            aucd r3 = r1.h
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x0276
            goto L_0x027b
        L_0x0276:
            r3.c()
            r3.c = r4
        L_0x027b:
            aucj r3 = r3.b
            xmy r3 = (defpackage.xmy) r3
            xmy r5 = defpackage.xmy.m
            int r5 = r3.a
            r5 = r5 | 32
            r3.a = r5
            r3.f = r0
        L_0x0289:
            int r3 = r2.size()
            if (r3 <= r0) goto L_0x02d4
            aucd r3 = r1.h
            int r2 = r2.size()
            int r2 = r2 - r0
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x029b
            goto L_0x02a0
        L_0x029b:
            r3.c()
            r3.c = r4
        L_0x02a0:
            aucj r0 = r3.b
            xmy r0 = (defpackage.xmy) r0
            xmy r3 = defpackage.xmy.m
            int r3 = r0.a
            r3 = r3 | 64
            r0.a = r3
            r0.g = r2
            return
        L_0x02af:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x02d4
            aucd r0 = r1.h
            int r2 = r2.size()
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x02c0
            goto L_0x02c5
        L_0x02c0:
            r0.c()
            r0.c = r4
        L_0x02c5:
            aucj r0 = r0.b
            xmy r0 = (defpackage.xmy) r0
            xmy r3 = defpackage.xmy.m
            int r3 = r0.a
            r3 = r3 | 128(0x80, float:1.794E-43)
            r0.a = r3
            r0.h = r2
            return
        L_0x02d4:
            return
        L_0x02d5:
            r0 = move-exception
            xmx r2 = defpackage.xmx.c
            aucd r2 = r2.o()
            if (r25 != 0) goto L_0x02df
            goto L_0x02e0
        L_0x02df:
            r11 = 6
        L_0x02e0:
            boolean r5 = r2.c
            if (r5 != 0) goto L_0x02e5
            goto L_0x02ea
        L_0x02e5:
            r2.c()
            r2.c = r4
        L_0x02ea:
            aucj r5 = r2.b
            xmx r5 = (defpackage.xmx) r5
            int r11 = r11 + -1
            r5.b = r11
            int r6 = r5.a
            r3 = r3 | r6
            r5.a = r3
            aucj r2 = r2.i()
            xmx r2 = (defpackage.xmx) r2
            aucd r3 = r1.h
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x0304
            goto L_0x0309
        L_0x0304:
            r3.c()
            r3.c = r4
        L_0x0309:
            aucj r3 = r3.b
            xmy r3 = (defpackage.xmy) r3
            xmy r4 = defpackage.xmy.m
            r2.getClass()
            r3.k = r2
            int r2 = r3.a
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r3.a = r2
            throw r0
        L_0x031b:
            r0 = move-exception
            aucd r2 = r1.h
            xmx r5 = defpackage.xmx.c
            aucd r5 = r5.o()
            if (r25 != 0) goto L_0x0328
            r6 = 3
            goto L_0x0329
        L_0x0328:
            r6 = 5
        L_0x0329:
            boolean r7 = r5.c
            if (r7 != 0) goto L_0x032e
            goto L_0x0333
        L_0x032e:
            r5.c()
            r5.c = r4
        L_0x0333:
            aucj r7 = r5.b
            xmx r7 = (defpackage.xmx) r7
            int r6 = r6 + -1
            r7.b = r6
            int r6 = r7.a
            r3 = r3 | r6
            r7.a = r3
            aucj r3 = r5.i()
            xmx r3 = (defpackage.xmx) r3
            boolean r5 = r2.c
            if (r5 != 0) goto L_0x034b
            goto L_0x0350
        L_0x034b:
            r2.c()
            r2.c = r4
        L_0x0350:
            aucj r2 = r2.b
            xmy r2 = (defpackage.xmy) r2
            xmy r4 = defpackage.xmy.m
            r3.getClass()
            r2.k = r3
            int r3 = r2.a
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r2.a = r3
            throw r0
        L_0x0362:
            r0 = move-exception
            r2.f()     // Catch:{ RemoteException -> 0x0367 }
            throw r0     // Catch:{ RemoteException -> 0x0367 }
        L_0x0367:
            r0 = move-exception
            aucd r2 = r1.h
            xmx r5 = defpackage.xmx.c
            aucd r5 = r5.o()
            if (r25 != 0) goto L_0x0375
            r6 = 8
            goto L_0x0376
        L_0x0375:
            r6 = 7
        L_0x0376:
            boolean r7 = r5.c
            if (r7 != 0) goto L_0x037b
            goto L_0x0380
        L_0x037b:
            r5.c()
            r5.c = r4
        L_0x0380:
            aucj r7 = r5.b
            xmx r7 = (defpackage.xmx) r7
            int r6 = r6 + -1
            r7.b = r6
            int r6 = r7.a
            r3 = r3 | r6
            r7.a = r3
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x0392
            goto L_0x0397
        L_0x0392:
            r2.c()
            r2.c = r4
        L_0x0397:
            aucj r2 = r2.b
            xmy r2 = (defpackage.xmy) r2
            aucj r3 = r5.i()
            xmx r3 = (defpackage.xmx) r3
            xmy r4 = defpackage.xmy.m
            r3.getClass()
            r2.k = r3
            int r3 = r2.a
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r2.a = r3
            goto L_0x03b0
        L_0x03af:
            throw r0
        L_0x03b0:
            goto L_0x03af
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwk.a(java.util.Map, boolean):void");
    }
}
