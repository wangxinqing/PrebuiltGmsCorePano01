package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.TransactionTooLargeException;
import android.provider.ContactsContract;
import android.util.Log;
import java.util.regex.Pattern;

/* renamed from: xxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xxs extends xxu {
    private final xyu a;
    private final xyo b;
    private final xwn c;
    private final jiq d;
    private final xvw e;
    private final wss f;
    private final xwv g;
    private final xyp m;
    private final xxm n;
    private final xxw o;
    private final xxn p;
    private final amri q;
    private final amri r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xxs(xwv xwv, xwn xwn, ContentResolver contentResolver, xyu xyu, Account account, yaz yaz, xvp xvp, jiq jiq, wss wss, yav yav, amri amri, amri amri2) {
        super(contentResolver, account, yaz, yav, xvp);
        ContentResolver contentResolver2 = contentResolver;
        Account account2 = account;
        yaz yaz2 = yaz;
        xwv xwv2 = xwv;
        this.g = xwv2;
        this.a = xyu;
        this.c = xwn;
        this.b = new xyo(contentResolver2, account2, xvp);
        this.d = jiq;
        this.f = wss;
        this.e = new xvw(account2, contentResolver2, yaz2);
        this.m = new xyp(contentResolver2, account2, this.e, yaz2);
        xyg xyg = new xyg();
        xwv xwv3 = xwv;
        yaz yaz3 = yaz;
        this.n = new xxm(this.m, xwv3, this.e, yaz3, amri2, xyg, xvp);
        this.o = new xxw(this.m, xwv3, this.e, yaz3, xvp, this.b, xyg);
        this.p = new xxn(this.m, xwv2, this.e, yaz, xyg);
        this.q = amri;
        this.r = amri2;
    }

    private static int a(amri amri) {
        return ((Integer) amri.a((Object) -1)).intValue();
    }

    private final boolean c() {
        if (!this.r.a()) {
            return false;
        }
        xip.a();
        return ((Boolean) xgm.a.a()).booleanValue();
    }

    private final void d() {
        if (c()) {
            ((xxj) this.r.b()).e(1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x037e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x037e A[ExcHandler: eif | JSONException | xya (e java.lang.Throwable), Splitter:B:130:0x0367] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03e8 A[Catch:{ all -> 0x0421, eif | JSONException | xya -> 0x01fc, all -> 0x0426 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x041e A[Catch:{ all -> 0x0421, eif | JSONException | xya -> 0x01fc, all -> 0x0426 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r29 = this;
            r1 = r29
            java.lang.String r2 = "FSA_contactSyncUp"
            yav r0 = r1.l
            r0.a()
            boolean r4 = r29.c()     // Catch:{ all -> 0x0435 }
            xyo r0 = r1.b     // Catch:{ all -> 0x0426 }
            android.content.ContentResolver r5 = r0.a     // Catch:{ all -> 0x0426 }
            android.accounts.Account r6 = r0.b     // Catch:{ all -> 0x0426 }
            anax r7 = defpackage.xyo.e     // Catch:{ all -> 0x0426 }
            java.lang.String[] r8 = defpackage.xvw.a     // Catch:{ all -> 0x0426 }
            java.lang.String r8 = "data_set IS NULL AND (sourceid IS NULL OR dirty != 0 OR deleted != 0)"
            r9 = 0
            xvz r5 = defpackage.xvz.a(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0426 }
            java.util.EnumMap r6 = new java.util.EnumMap     // Catch:{ all -> 0x0421 }
            java.lang.Class<xyk> r7 = defpackage.xyk.class
            r6.<init>(r7)     // Catch:{ all -> 0x0421 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0421 }
            r7.<init>()     // Catch:{ all -> 0x0421 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0421 }
            r8.<init>()     // Catch:{ all -> 0x0421 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0421 }
            r10.<init>()     // Catch:{ all -> 0x0421 }
            defpackage.xip.a()     // Catch:{ all -> 0x0421 }
            xfs r11 = defpackage.xif.a     // Catch:{ all -> 0x0421 }
            java.lang.Object r11 = r11.a()     // Catch:{ all -> 0x0421 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ all -> 0x0421 }
            int r11 = r11.intValue()     // Catch:{ all -> 0x0421 }
            r12 = 0
        L_0x0044:
            xvs r13 = r5.b()     // Catch:{ all -> 0x0421 }
            if (r13 != 0) goto L_0x004b
            goto L_0x0072
        L_0x004b:
            if (r12 >= r11) goto L_0x0072
            xvp r14 = r0.c     // Catch:{ all -> 0x0421 }
            r14.a()     // Catch:{ all -> 0x0421 }
            boolean r14 = r13.h     // Catch:{ all -> 0x0421 }
            if (r14 == 0) goto L_0x005a
            r10.add(r13)     // Catch:{ all -> 0x0421 }
            goto L_0x006f
        L_0x005a:
            boolean r14 = defpackage.xyo.a(r13)     // Catch:{ all -> 0x0421 }
            if (r14 != 0) goto L_0x0044
            java.lang.String r14 = r13.a     // Catch:{ all -> 0x0421 }
            if (r14 != 0) goto L_0x0068
            r7.add(r13)     // Catch:{ all -> 0x0421 }
            goto L_0x006f
        L_0x0068:
            boolean r14 = r13.g     // Catch:{ all -> 0x0421 }
            if (r14 == 0) goto L_0x006f
            r8.add(r13)     // Catch:{ all -> 0x0421 }
        L_0x006f:
            int r12 = r12 + 1
            goto L_0x0044
        L_0x0072:
            xyk r11 = defpackage.xyk.INSERTED     // Catch:{ all -> 0x0421 }
            r6.put(r11, r7)     // Catch:{ all -> 0x0421 }
            xyk r7 = defpackage.xyk.UPDATED     // Catch:{ all -> 0x0421 }
            r6.put(r7, r8)     // Catch:{ all -> 0x0421 }
            xyk r7 = defpackage.xyk.DELETED     // Catch:{ all -> 0x0421 }
            r6.put(r7, r10)     // Catch:{ all -> 0x0421 }
            android.net.Uri r7 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x0421 }
            android.accounts.Account r8 = r0.b     // Catch:{ all -> 0x0421 }
            android.net.Uri r7 = defpackage.xvw.a((android.net.Uri) r7, (android.accounts.Account) r8)     // Catch:{ all -> 0x0421 }
            java.lang.String r8 = "data_set IS NULL"
            r0.a((android.net.Uri) r7, (java.lang.String) r8)     // Catch:{ all -> 0x0421 }
            r10.size()     // Catch:{ all -> 0x0421 }
            r5.f()     // Catch:{ all -> 0x0426 }
            xyk r0 = defpackage.xyk.INSERTED     // Catch:{ all -> 0x0426 }
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x0426 }
            r5 = r0
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0426 }
            xyk r0 = defpackage.xyk.UPDATED     // Catch:{ all -> 0x0426 }
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x0426 }
            r7 = r0
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x0426 }
            xyk r0 = defpackage.xyk.DELETED     // Catch:{ all -> 0x0426 }
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x0426 }
            r6 = r0
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x0426 }
            int r0 = r5.size()     // Catch:{ all -> 0x0426 }
            int r8 = r7.size()     // Catch:{ all -> 0x0426 }
            int r0 = r0 + r8
            int r8 = r6.size()     // Catch:{ all -> 0x0426 }
            int r8 = r8 + r0
            if (r8 != 0) goto L_0x00d2
            if (r4 == 0) goto L_0x00cf
            amri r0 = r1.r     // Catch:{ all -> 0x0435 }
            java.lang.Object r0 = r0.b()     // Catch:{ all -> 0x0435 }
            xxj r0 = (defpackage.xxj) r0     // Catch:{ all -> 0x0435 }
            r0.g()     // Catch:{ all -> 0x0435 }
            r3 = 0
            goto L_0x0345
        L_0x00cf:
            r3 = 0
            goto L_0x0345
        L_0x00d2:
            if (r4 != 0) goto L_0x00d5
            goto L_0x0100
        L_0x00d5:
            int r0 = r5.size()     // Catch:{ all -> 0x0426 }
            int r10 = r7.size()     // Catch:{ all -> 0x0426 }
            int r0 = r0 + r10
            defpackage.xip.a()     // Catch:{ all -> 0x0426 }
            xfs r10 = defpackage.xgo.a     // Catch:{ all -> 0x0426 }
            java.lang.Object r10 = r10.a()     // Catch:{ all -> 0x0426 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0426 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0426 }
            if (r10 != 0) goto L_0x00f0
            goto L_0x00f5
        L_0x00f0:
            int r10 = r6.size()     // Catch:{ all -> 0x0426 }
            int r0 = r0 + r10
        L_0x00f5:
            amri r10 = r1.r     // Catch:{ all -> 0x0426 }
            java.lang.Object r10 = r10.b()     // Catch:{ all -> 0x0426 }
            xxj r10 = (defpackage.xxj) r10     // Catch:{ all -> 0x0426 }
            r10.a((int) r0)     // Catch:{ all -> 0x0426 }
        L_0x0100:
            xvp r0 = r1.k     // Catch:{ all -> 0x0426 }
            r0.a()     // Catch:{ all -> 0x0426 }
            xvp r0 = r1.k     // Catch:{ all -> 0x0426 }
            r0.a()     // Catch:{ all -> 0x0426 }
            xxm r10 = r1.n     // Catch:{ all -> 0x0426 }
            yaz r11 = r10.c     // Catch:{ all -> 0x0426 }
            xnd r12 = defpackage.xnd.INSERT     // Catch:{ all -> 0x0426 }
            xjo r13 = defpackage.xjo.CONTACT     // Catch:{ all -> 0x0426 }
            r14 = 0
            r15 = 1
            int r16 = r5.size()     // Catch:{ all -> 0x0426 }
            r11.a(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0426 }
            int r11 = r5.size()     // Catch:{ all -> 0x0426 }
            ayrj r0 = defpackage.ayrj.a     // Catch:{ all -> 0x0426 }
            aytn r0 = r0.a()     // Catch:{ all -> 0x0426 }
            long r12 = r0.d()     // Catch:{ all -> 0x0426 }
            int r0 = (int) r12     // Catch:{ all -> 0x0426 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0426 }
            int r12 = r0.intValue()     // Catch:{ all -> 0x0426 }
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0426 }
            r13.<init>()     // Catch:{ all -> 0x0426 }
            r0 = 0
        L_0x0138:
            if (r0 >= r11) goto L_0x0226
            int r15 = r0 + r12
            int r3 = java.lang.Math.min(r15, r11)     // Catch:{ all -> 0x0426 }
            java.util.List r0 = r5.subList(r0, r3)     // Catch:{ all -> 0x0426 }
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0426 }
            r3.<init>()     // Catch:{ all -> 0x0426 }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ all -> 0x0426 }
        L_0x014d:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0426 }
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r0 = r17.next()     // Catch:{ all -> 0x0426 }
            r9 = r0
            xvs r9 = (defpackage.xvs) r9     // Catch:{ all -> 0x0426 }
            java.lang.String r0 = r9.c     // Catch:{ all -> 0x0426 }
            if (r0 == 0) goto L_0x016c
            r14 = 16
            long r19 = java.lang.Long.parseLong(r0, r14)     // Catch:{ NumberFormatException -> 0x0169 }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ NumberFormatException -> 0x0169 }
            goto L_0x016d
        L_0x0169:
            r0 = move-exception
            r0 = 0
            goto L_0x016d
        L_0x016c:
            r0 = 0
        L_0x016d:
            if (r0 != 0) goto L_0x01c3
            java.security.SecureRandom r0 = new java.security.SecureRandom     // Catch:{ all -> 0x0426 }
            r0.<init>()     // Catch:{ all -> 0x0426 }
            long r19 = r0.nextLong()     // Catch:{ all -> 0x0426 }
            r21 = 9223372034841509887(0x7fffffff87ffffff, double:NaN)
            long r19 = r19 & r21
            r21 = 134217728(0x8000000, double:6.63123685E-316)
            long r19 = r19 | r21
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0426 }
            xvw r14 = r10.b     // Catch:{ all -> 0x0426 }
            xvy r14 = r14.b     // Catch:{ all -> 0x0426 }
            r25 = r5
            java.lang.Long r5 = r9.d     // Catch:{ all -> 0x0426 }
            long r19 = r0.longValue()     // Catch:{ all -> 0x0426 }
            r26 = r0
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ all -> 0x0426 }
            r0.<init>()     // Catch:{ all -> 0x0426 }
            r27 = r8
            java.lang.String r8 = "sync2"
            r28 = r11
            java.lang.String r11 = java.lang.Long.toHexString(r19)     // Catch:{ all -> 0x0426 }
            r0.put(r8, r11)     // Catch:{ all -> 0x0426 }
            android.net.Uri r8 = r14.a     // Catch:{ all -> 0x0426 }
            r23 = 0
            r24 = 0
            r19 = r14
            r20 = r8
            r21 = r5
            r22 = r0
            r19.a((android.net.Uri) r20, (java.lang.Long) r21, (android.content.ContentValues) r22, (boolean) r23, (boolean) r24)     // Catch:{ all -> 0x0426 }
            android.content.ContentResolver r0 = r14.c     // Catch:{ all -> 0x0426 }
            xwp r5 = r14.b     // Catch:{ all -> 0x0426 }
            defpackage.xvw.a((android.content.ContentResolver) r0, (defpackage.xwp) r5)     // Catch:{ all -> 0x0426 }
            r0 = r26
            goto L_0x01c9
        L_0x01c3:
            r25 = r5
            r27 = r8
            r28 = r11
        L_0x01c9:
            r3.put(r9, r0)     // Catch:{ all -> 0x0426 }
            r5 = r25
            r8 = r27
            r11 = r28
            r9 = 0
            goto L_0x014d
        L_0x01d5:
            r25 = r5
            r27 = r8
            r28 = r11
            int r0 = r3.size()     // Catch:{ all -> 0x0426 }
            r5 = 1
            if (r0 == r5) goto L_0x0219
            boolean r0 = defpackage.ayso.b()     // Catch:{ babk -> 0x0204 }
            if (r0 != 0) goto L_0x01e9
            goto L_0x01ee
        L_0x01e9:
            xvp r0 = r10.e     // Catch:{ babk -> 0x0204 }
            r0.a()     // Catch:{ babk -> 0x0204 }
        L_0x01ee:
            xwv r0 = r10.a     // Catch:{ babk -> 0x0204 }
            xwu r0 = r0.a(r3)     // Catch:{ babk -> 0x0204 }
            java.util.List r5 = r0.a     // Catch:{ babk -> 0x0204 }
            r10.a((java.util.List) r5)     // Catch:{ babk -> 0x0204 }
            java.util.LinkedHashMap r3 = r0.b     // Catch:{ babk -> 0x0204 }
            goto L_0x0205
        L_0x01fc:
            r0 = move-exception
            goto L_0x0201
        L_0x01fe:
            r0 = move-exception
            goto L_0x0201
        L_0x0200:
            r0 = move-exception
        L_0x0201:
            r21 = r0
            goto L_0x0209
        L_0x0204:
            r0 = move-exception
        L_0x0205:
            r13.putAll(r3)     // Catch:{ eif -> 0x0200, JSONException -> 0x01fe, xya -> 0x01fc }
            goto L_0x021c
        L_0x0209:
            xjo r19 = defpackage.xjo.CONTACT     // Catch:{ all -> 0x0426 }
            r18 = 0
            xnd r20 = defpackage.xnd.INSERT     // Catch:{ all -> 0x0426 }
            yaz r0 = r10.c     // Catch:{ all -> 0x0426 }
            r23 = 1
            r22 = r0
            defpackage.xyi.a(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0426 }
            goto L_0x021c
        L_0x0219:
            r13.putAll(r3)     // Catch:{ all -> 0x0426 }
        L_0x021c:
            r0 = r15
            r5 = r25
            r8 = r27
            r11 = r28
            r9 = 0
            goto L_0x0138
        L_0x0226:
            r27 = r8
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x0426 }
            if (r0 != 0) goto L_0x0249
            int r0 = r13.size()     // Catch:{ all -> 0x0426 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0426 }
            r5 = 57
            r3.<init>(r5)     // Catch:{ all -> 0x0426 }
            java.lang.String r5 = "BulkInsertContacts single inserting "
            r3.append(r5)     // Catch:{ all -> 0x0426 }
            r3.append(r0)     // Catch:{ all -> 0x0426 }
            java.lang.String r0 = " contacts."
            r3.append(r0)     // Catch:{ all -> 0x0426 }
            r3.toString()     // Catch:{ all -> 0x0426 }
        L_0x0249:
            java.util.Set r0 = r13.entrySet()     // Catch:{ all -> 0x0426 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0426 }
        L_0x0251:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0426 }
            if (r0 != 0) goto L_0x034b
            xvp r0 = r1.k     // Catch:{ all -> 0x0426 }
            r0.a()     // Catch:{ all -> 0x0426 }
            java.util.Iterator r0 = r7.iterator()     // Catch:{ all -> 0x0426 }
        L_0x0260:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0426 }
            if (r3 == 0) goto L_0x0278
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0426 }
            xvs r3 = (defpackage.xvs) r3     // Catch:{ all -> 0x0426 }
            xxw r5 = r1.o     // Catch:{ all -> 0x0426 }
            boolean r3 = r5.a((defpackage.xvs) r3)     // Catch:{ all -> 0x0426 }
            if (r3 == 0) goto L_0x0260
            r29.d()     // Catch:{ all -> 0x0426 }
            goto L_0x0260
        L_0x0278:
            xvp r0 = r1.k     // Catch:{ all -> 0x0426 }
            r0.a()     // Catch:{ all -> 0x0426 }
            ayrq r0 = defpackage.ayrq.a     // Catch:{ all -> 0x0426 }
            ayrr r0 = r0.a()     // Catch:{ all -> 0x0426 }
            boolean r0 = r0.a()     // Catch:{ all -> 0x0426 }
            if (r0 == 0) goto L_0x0309
            xxn r0 = r1.p     // Catch:{ all -> 0x0426 }
            yaz r7 = r0.d     // Catch:{ all -> 0x0426 }
            xnd r8 = r0.a     // Catch:{ all -> 0x0426 }
            xjo r9 = defpackage.xjo.CONTACT     // Catch:{ all -> 0x0426 }
            int r12 = r6.size()     // Catch:{ all -> 0x0426 }
            r10 = 0
            r11 = 1
            r7.a(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0426 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0426 }
            r3.<init>()     // Catch:{ all -> 0x0426 }
            java.util.Iterator r5 = r6.iterator()     // Catch:{ all -> 0x0426 }
        L_0x02a3:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0426 }
            if (r6 == 0) goto L_0x02b9
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0426 }
            xvs r6 = (defpackage.xvs) r6     // Catch:{ all -> 0x0426 }
            boolean r7 = r0.b((defpackage.xvs) r6)     // Catch:{ all -> 0x0426 }
            if (r7 == 0) goto L_0x02a3
            r3.add(r6)     // Catch:{ all -> 0x0426 }
            goto L_0x02a3
        L_0x02b9:
            int r5 = r0.b((java.util.List) r3)     // Catch:{ all -> 0x0426 }
            if (r5 > 0) goto L_0x02e3
            boolean r5 = defpackage.aysx.b()     // Catch:{ all -> 0x0426 }
            if (r5 == 0) goto L_0x02e1
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0426 }
        L_0x02c9:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0426 }
            if (r5 == 0) goto L_0x02df
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0426 }
            xvs r5 = (defpackage.xvs) r5     // Catch:{ all -> 0x0426 }
            yaz r6 = r0.d     // Catch:{ all -> 0x0426 }
            xnn r5 = defpackage.xxk.f(r5)     // Catch:{ all -> 0x0426 }
            r6.a((defpackage.xnn) r5)     // Catch:{ all -> 0x0426 }
            goto L_0x02c9
        L_0x02df:
            r5 = 0
            goto L_0x02e4
        L_0x02e1:
            r5 = 0
            goto L_0x02e4
        L_0x02e3:
        L_0x02e4:
            if (r5 <= 0) goto L_0x0336
            defpackage.xip.a()     // Catch:{ all -> 0x0426 }
            xfs r0 = defpackage.xgo.a     // Catch:{ all -> 0x0426 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x0426 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0426 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0426 }
            if (r0 == 0) goto L_0x0336
            boolean r0 = r29.c()     // Catch:{ all -> 0x0426 }
            if (r0 == 0) goto L_0x0336
            amri r0 = r1.r     // Catch:{ all -> 0x0426 }
            java.lang.Object r0 = r0.b()     // Catch:{ all -> 0x0426 }
            xxj r0 = (defpackage.xxj) r0     // Catch:{ all -> 0x0426 }
            r0.e(r5)     // Catch:{ all -> 0x0426 }
            goto L_0x0336
        L_0x0309:
            java.util.Iterator r0 = r6.iterator()     // Catch:{ all -> 0x0426 }
        L_0x030d:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0426 }
            if (r3 == 0) goto L_0x0336
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0426 }
            xvs r3 = (defpackage.xvs) r3     // Catch:{ all -> 0x0426 }
            xxn r5 = r1.p     // Catch:{ all -> 0x0426 }
            boolean r3 = r5.a((defpackage.xvs) r3)     // Catch:{ all -> 0x0426 }
            if (r3 == 0) goto L_0x030d
            defpackage.xip.a()     // Catch:{ all -> 0x0426 }
            xfs r3 = defpackage.xgo.a     // Catch:{ all -> 0x0426 }
            java.lang.Object r3 = r3.a()     // Catch:{ all -> 0x0426 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0426 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0426 }
            if (r3 == 0) goto L_0x030d
            r29.d()     // Catch:{ all -> 0x0426 }
            goto L_0x030d
        L_0x0336:
            if (r4 == 0) goto L_0x0343
            amri r0 = r1.r     // Catch:{ all -> 0x0435 }
            java.lang.Object r0 = r0.b()     // Catch:{ all -> 0x0435 }
            xxj r0 = (defpackage.xxj) r0     // Catch:{ all -> 0x0435 }
            r0.g()     // Catch:{ all -> 0x0435 }
        L_0x0343:
            r3 = r27
        L_0x0345:
            yav r0 = r1.l
            r0.a(r2, r3)
            return
        L_0x034b:
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0426 }
            r5 = r0
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x0426 }
            java.lang.Object r0 = r5.getKey()     // Catch:{ eif -> 0x03cf, JSONException -> 0x03cd, xya -> 0x03cb, babk -> 0x03c9 }
            xvs r0 = (defpackage.xvs) r0     // Catch:{ eif -> 0x03cf, JSONException -> 0x03cd, xya -> 0x03cb, babk -> 0x03c9 }
            java.lang.Object r8 = r5.getValue()     // Catch:{ eif -> 0x03cf, JSONException -> 0x03cd, xya -> 0x03cb, babk -> 0x03c9 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ eif -> 0x03cf, JSONException -> 0x03cd, xya -> 0x03cb, babk -> 0x03c9 }
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap     // Catch:{ eif -> 0x03cf, JSONException -> 0x03cd, xya -> 0x03cb, babk -> 0x03c9 }
            anaf r0 = defpackage.anaf.a(r0, r8)     // Catch:{ eif -> 0x03cf, JSONException -> 0x03cd, xya -> 0x03cb, babk -> 0x03c9 }
            r9.<init>(r0)     // Catch:{ eif -> 0x03cf, JSONException -> 0x03cd, xya -> 0x03cb, babk -> 0x03c9 }
            boolean r0 = defpackage.ayso.b()     // Catch:{ babk -> 0x0387, eif -> 0x0382, JSONException -> 0x0380, xya -> 0x037e }
            if (r0 != 0) goto L_0x036e
            goto L_0x0373
        L_0x036e:
            xvp r0 = r10.e     // Catch:{ babk -> 0x0387, eif -> 0x0382, JSONException -> 0x0380, xya -> 0x037e }
            r0.a()     // Catch:{ babk -> 0x0387, eif -> 0x0382, JSONException -> 0x0380, xya -> 0x037e }
        L_0x0373:
            xwv r0 = r10.a     // Catch:{ babk -> 0x0387, eif -> 0x0382, JSONException -> 0x0380, xya -> 0x037e }
            xwu r0 = r0.a(r9)     // Catch:{ babk -> 0x0387, eif -> 0x0382, JSONException -> 0x0380, xya -> 0x037e }
            r10.a((defpackage.xwu) r0)     // Catch:{ babk -> 0x0387, eif -> 0x0382, JSONException -> 0x0380, xya -> 0x037e }
            goto L_0x0251
        L_0x037e:
            r0 = move-exception
            goto L_0x0383
        L_0x0380:
            r0 = move-exception
            goto L_0x0383
        L_0x0382:
            r0 = move-exception
        L_0x0383:
            r22 = r0
            r8 = 0
            goto L_0x03d3
        L_0x0387:
            r0 = move-exception
            xyg r8 = r10.d     // Catch:{ eif -> 0x03cf, JSONException -> 0x03cd, xya -> 0x03cb, babk -> 0x03c9 }
            wvo r11 = defpackage.wvo.BULK_INSERT     // Catch:{ eif -> 0x03cf, JSONException -> 0x03cd, xya -> 0x03cb, babk -> 0x03c9 }
            babj r12 = r0.a     // Catch:{ eif -> 0x03cf, JSONException -> 0x03cd, xya -> 0x03cb, babk -> 0x03c9 }
            babg r13 = r12.r     // Catch:{ eif -> 0x03cf, JSONException -> 0x03cd, xya -> 0x03cb, babk -> 0x03c9 }
            int r13 = r13.r     // Catch:{ eif -> 0x03cf, JSONException -> 0x03cd, xya -> 0x03cb, babk -> 0x03c9 }
            java.lang.String r12 = r12.s     // Catch:{ eif -> 0x03cf, JSONException -> 0x03cd, xya -> 0x03cb, babk -> 0x03c9 }
            int r8 = r8.a((defpackage.wvo) r11, (int) r13, (java.lang.String) r12)     // Catch:{ eif -> 0x03cf, JSONException -> 0x03cd, xya -> 0x03cb, babk -> 0x03c9 }
            int r11 = r8 + -1
            if (r8 == 0) goto L_0x03be
            r8 = 5
            if (r11 != r8) goto L_0x03bd
            boolean r0 = defpackage.ayso.b()     // Catch:{ eif -> 0x0382, JSONException -> 0x0380, xya -> 0x037e, babk -> 0x03bb }
            if (r0 != 0) goto L_0x03a6
            goto L_0x03ab
        L_0x03a6:
            xvp r0 = r10.e     // Catch:{ eif -> 0x0382, JSONException -> 0x0380, xya -> 0x037e, babk -> 0x03bb }
            r0.a()     // Catch:{ eif -> 0x0382, JSONException -> 0x0380, xya -> 0x037e, babk -> 0x03bb }
        L_0x03ab:
            xwv r0 = r10.a     // Catch:{ eif -> 0x0382, JSONException -> 0x0380, xya -> 0x037e, babk -> 0x03bb }
            r8 = 1
            aqun[] r11 = defpackage.xwv.a((java.util.LinkedHashMap) r9, (boolean) r8)     // Catch:{ eif -> 0x0382, JSONException -> 0x0380, xya -> 0x037e, babk -> 0x03bb }
            xwu r0 = r0.a((java.util.LinkedHashMap) r9, (defpackage.aqun[]) r11)     // Catch:{ eif -> 0x0382, JSONException -> 0x0380, xya -> 0x037e, babk -> 0x03bb }
            r10.a((defpackage.xwu) r0)     // Catch:{ eif -> 0x0382, JSONException -> 0x0380, xya -> 0x037e, babk -> 0x03bb }
            goto L_0x0251
        L_0x03bb:
            r0 = move-exception
            goto L_0x0383
        L_0x03bd:
            throw r0     // Catch:{ eif -> 0x0382, JSONException -> 0x0380, xya -> 0x037e, babk -> 0x03bb }
        L_0x03be:
            r8 = 0
            throw r8     // Catch:{ eif -> 0x03c7, JSONException -> 0x03c5, xya -> 0x03c3, babk -> 0x03c1 }
        L_0x03c1:
            r0 = move-exception
            goto L_0x03d1
        L_0x03c3:
            r0 = move-exception
            goto L_0x03d1
        L_0x03c5:
            r0 = move-exception
            goto L_0x03d1
        L_0x03c7:
            r0 = move-exception
            goto L_0x03d1
        L_0x03c9:
            r0 = move-exception
            goto L_0x03d0
        L_0x03cb:
            r0 = move-exception
            goto L_0x03d0
        L_0x03cd:
            r0 = move-exception
            goto L_0x03d0
        L_0x03cf:
            r0 = move-exception
        L_0x03d0:
            r8 = 0
        L_0x03d1:
            r22 = r0
        L_0x03d3:
            xjo r20 = defpackage.xjo.CONTACT     // Catch:{ all -> 0x0426 }
            r19 = 0
            xnd r21 = defpackage.xnd.INSERT     // Catch:{ all -> 0x0426 }
            yaz r0 = r10.c     // Catch:{ all -> 0x0426 }
            r24 = 1
            r23 = r0
            defpackage.xyi.a(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0426 }
            boolean r0 = defpackage.aysx.b()     // Catch:{ all -> 0x0426 }
            if (r0 == 0) goto L_0x041e
            yaz r0 = r10.c     // Catch:{ all -> 0x0426 }
            java.lang.Object r5 = r5.getKey()     // Catch:{ all -> 0x0426 }
            xvs r5 = (defpackage.xvs) r5     // Catch:{ all -> 0x0426 }
            xnn r9 = defpackage.xnn.c     // Catch:{ all -> 0x0426 }
            aucd r9 = r9.o()     // Catch:{ all -> 0x0426 }
            java.lang.Long r5 = r5.d     // Catch:{ all -> 0x0426 }
            long r11 = r5.longValue()     // Catch:{ all -> 0x0426 }
            boolean r5 = r9.c     // Catch:{ all -> 0x0426 }
            if (r5 != 0) goto L_0x0401
            goto L_0x0407
        L_0x0401:
            r9.c()     // Catch:{ all -> 0x0426 }
            r5 = 0
            r9.c = r5     // Catch:{ all -> 0x0426 }
        L_0x0407:
            aucj r5 = r9.b     // Catch:{ all -> 0x0426 }
            xnn r5 = (defpackage.xnn) r5     // Catch:{ all -> 0x0426 }
            int r13 = r5.a     // Catch:{ all -> 0x0426 }
            r14 = 1
            r13 = r13 | r14
            r5.a = r13     // Catch:{ all -> 0x0426 }
            r5.b = r11     // Catch:{ all -> 0x0426 }
            aucj r5 = r9.i()     // Catch:{ all -> 0x0426 }
            xnn r5 = (defpackage.xnn) r5     // Catch:{ all -> 0x0426 }
            r0.a((defpackage.xnn) r5)     // Catch:{ all -> 0x0426 }
            goto L_0x0251
        L_0x041e:
            r14 = 1
            goto L_0x0251
        L_0x0421:
            r0 = move-exception
            r5.f()     // Catch:{ all -> 0x0426 }
            throw r0     // Catch:{ all -> 0x0426 }
        L_0x0426:
            r0 = move-exception
            if (r4 == 0) goto L_0x0434
            amri r3 = r1.r     // Catch:{ all -> 0x0435 }
            java.lang.Object r3 = r3.b()     // Catch:{ all -> 0x0435 }
            xxj r3 = (defpackage.xxj) r3     // Catch:{ all -> 0x0435 }
            r3.g()     // Catch:{ all -> 0x0435 }
        L_0x0434:
            throw r0     // Catch:{ all -> 0x0435 }
        L_0x0435:
            r0 = move-exception
            yav r3 = r1.l
            r4 = 0
            r3.a(r2, r4)
            goto L_0x043e
        L_0x043d:
            throw r0
        L_0x043e:
            goto L_0x043d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxs.b():void");
    }

    private final void a(NullPointerException nullPointerException, boolean z) {
        if (a((Exception) nullPointerException, z)) {
            this.f.a(this.i.name, true);
        }
    }

    private final void a(xye xye) {
        xip.a();
        Exception exc = xye.a;
        if (exc instanceof OperationApplicationException) {
            String af = ayrj.a.a().af();
            String message = ((OperationApplicationException) exc).getMessage();
            if (message != null && Pattern.compile(af).matcher(message).find()) {
                this.f.a(this.i.name, true);
            }
        } else if (((Boolean) xfw.a.a()).booleanValue() && (xye.a instanceof TransactionTooLargeException)) {
            this.f.a(this.i.name, true);
        }
    }

    private final void a(boolean z, boolean z2) {
        try {
            this.e.b();
        } catch (xye e2) {
            if (z) {
                a(e2);
            }
            throw e2;
        } catch (NullPointerException e3) {
            if (z) {
                a(e3, z2);
            }
            throw e3;
        }
    }

    private static boolean a(Exception exc, boolean z) {
        if (exc instanceof NullPointerException) {
            xip.a();
            String a2 = ayrj.a.a().a();
            String message = exc.getMessage();
            if (!z || message == null || !message.contains(a2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: xye} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0311  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r27 = this;
            r1 = r27
            java.lang.String r2 = "FSA_contactSyncDown"
            yav r0 = r1.l
            r0.a()
            defpackage.xip.a()
            ayrj r0 = defpackage.ayrj.a
            aytn r0 = r0.a()
            boolean r0 = r0.ae()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r3 = r0.booleanValue()
            ayrj r0 = defpackage.ayrj.a
            aytn r0 = r0.a()
            boolean r0 = r0.bo()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r4 = r0.booleanValue()
            yaf r0 = new yaf
            xwv r6 = r1.g
            xwn r7 = r1.c
            xyu r8 = r1.a
            xvp r9 = r1.k
            android.net.Uri r10 = android.provider.ContactsContract.RawContacts.CONTENT_URI
            yaz r11 = r1.j
            wss r12 = r1.f
            android.accounts.Account r5 = r1.i
            java.lang.String r13 = r5.name
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            defpackage.xip.a()
            amri r5 = r1.q
            boolean r5 = r5.a()
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0065
            xfs r5 = defpackage.xgj.a
            java.lang.Object r5 = r5.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0065
            r5 = 1
            goto L_0x0066
        L_0x0065:
            r5 = 0
        L_0x0066:
            xfs r8 = defpackage.xfx.a     // Catch:{ all -> 0x030e }
            java.lang.Object r8 = r8.a()     // Catch:{ all -> 0x030e }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x030e }
            int r8 = r8.intValue()     // Catch:{ all -> 0x030e }
            yaq r9 = new yaq     // Catch:{ all -> 0x030e }
            r9.<init>(r8)     // Catch:{ all -> 0x030e }
            yak r10 = new yak     // Catch:{ all -> 0x030e }
            xvp r11 = r1.k     // Catch:{ all -> 0x030e }
            r10.<init>(r0, r11, r9)     // Catch:{ all -> 0x030e }
            r10.a()     // Catch:{ all -> 0x030e }
            yaq r10 = new yaq     // Catch:{ all -> 0x030e }
            r10.<init>(r8)     // Catch:{ all -> 0x030e }
            xyo r0 = r1.b     // Catch:{ all -> 0x030e }
            r0.a((defpackage.yaq) r9, (defpackage.yaq) r10)     // Catch:{ all -> 0x030e }
            r8 = 0
        L_0x008c:
            xvp r0 = r1.k     // Catch:{ all -> 0x030b }
            r0.a()     // Catch:{ all -> 0x030b }
            ayrz r0 = defpackage.ayrz.a     // Catch:{ all -> 0x030b }
            aysa r0 = r0.a()     // Catch:{ all -> 0x030b }
            boolean r0 = r0.f()     // Catch:{ all -> 0x030b }
            if (r0 == 0) goto L_0x00b1
        L_0x009d:
            long r11 = defpackage.ayrz.c()     // Catch:{ all -> 0x030b }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x030b }
            yao r0 = r10.a((long) r11, (java.util.concurrent.TimeUnit) r0)     // Catch:{ all -> 0x030b }
            if (r0 == 0) goto L_0x00ab
            r9 = r0
            goto L_0x00b6
        L_0x00ab:
            xvp r0 = r1.k     // Catch:{ all -> 0x030b }
            r0.a()     // Catch:{ all -> 0x030b }
            goto L_0x009d
        L_0x00b1:
            yao r0 = r10.a()     // Catch:{ all -> 0x030b }
            r9 = r0
        L_0x00b6:
            r10.b()     // Catch:{ all -> 0x030b }
            amzy r0 = r9.a()     // Catch:{ all -> 0x030b }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x030b }
        L_0x00c1:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x030b }
            r12 = 0
            r13 = 2
            if (r0 == 0) goto L_0x022d
            java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x030b }
            r14 = r0
            yad r14 = (defpackage.yad) r14     // Catch:{ all -> 0x030b }
            xvp r0 = r1.k     // Catch:{ all -> 0x030b }
            r0.a()     // Catch:{ all -> 0x030b }
            java.lang.Object r0 = r14.b     // Catch:{ all -> 0x030b }
            xvs r0 = (defpackage.xvs) r0     // Catch:{ all -> 0x030b }
            if (r0 == 0) goto L_0x016c
            java.lang.String r0 = r0.b     // Catch:{ all -> 0x030b }
            java.lang.Object r15 = r14.a     // Catch:{ all -> 0x030b }
            xvs r15 = (defpackage.xvs) r15     // Catch:{ all -> 0x030b }
            java.lang.String r15 = r15.b     // Catch:{ all -> 0x030b }
            boolean r0 = android.text.TextUtils.equals(r0, r15)     // Catch:{ all -> 0x030b }
            r0 = r0 ^ r6
            if (r0 != 0) goto L_0x016c
            defpackage.xip.a()     // Catch:{ all -> 0x030b }
            ayrj r0 = defpackage.ayrj.a     // Catch:{ all -> 0x030b }
            aytn r0 = r0.a()     // Catch:{ all -> 0x030b }
            boolean r0 = r0.ay()     // Catch:{ all -> 0x030b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x030b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x030b }
            if (r0 != 0) goto L_0x0102
            goto L_0x0122
        L_0x0102:
            yaz r15 = r1.j     // Catch:{ all -> 0x030b }
            xnd r16 = defpackage.xnd.UPDATE     // Catch:{ all -> 0x030b }
            xjo r17 = defpackage.xjo.CONTACT     // Catch:{ all -> 0x030b }
            r18 = 1
            r19 = 1
            r20 = 1
            r15.a(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x030b }
            yaz r0 = r1.j     // Catch:{ all -> 0x030b }
            xnd r22 = defpackage.xnd.UPDATE     // Catch:{ all -> 0x030b }
            xjo r23 = defpackage.xjo.CONTACT     // Catch:{ all -> 0x030b }
            r24 = 1
            r25 = 3
            r26 = 1
            r21 = r0
            r21.a(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x030b }
        L_0x0122:
            xfs r0 = defpackage.xge.a     // Catch:{ all -> 0x030b }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x030b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x030b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x030b }
            if (r0 == 0) goto L_0x020e
            java.lang.Object r0 = r14.b     // Catch:{ all -> 0x030b }
            if (r0 == 0) goto L_0x020e
            xvs r0 = (defpackage.xvs) r0     // Catch:{ all -> 0x030b }
            boolean r15 = r0.g     // Catch:{ all -> 0x030b }
            if (r15 != 0) goto L_0x020e
            java.lang.Object r14 = r14.a     // Catch:{ all -> 0x030b }
            xvs r14 = (defpackage.xvs) r14     // Catch:{ all -> 0x030b }
            java.util.List r14 = r14.I     // Catch:{ all -> 0x030b }
            java.util.List r0 = r0.I     // Catch:{ all -> 0x030b }
            amri r0 = defpackage.xzx.a((java.util.List) r14, (java.util.List) r0)     // Catch:{ all -> 0x030b }
            boolean r14 = r0.a()     // Catch:{ all -> 0x030b }
            if (r14 == 0) goto L_0x020e
            java.lang.Object r0 = r0.b()     // Catch:{ all -> 0x030b }
            yay r0 = (defpackage.yay) r0     // Catch:{ all -> 0x030b }
            int r14 = r0.b()     // Catch:{ all -> 0x030b }
            if (r14 == 0) goto L_0x016a
            xkf r12 = r0.a()     // Catch:{ all -> 0x030b }
            r12.name()     // Catch:{ all -> 0x030b }
            yaz r12 = r1.j     // Catch:{ all -> 0x030b }
            xnd r14 = defpackage.xnd.UPDATE     // Catch:{ all -> 0x030b }
            xjo r15 = defpackage.xjo.CONTACT     // Catch:{ all -> 0x030b }
            r12.a((defpackage.xnd) r14, (defpackage.xjo) r15, (defpackage.yay) r0, (int) r13)     // Catch:{ all -> 0x030b }
            goto L_0x020e
        L_0x016a:
            throw r12     // Catch:{ all -> 0x030b }
        L_0x016c:
            xyp r0 = r1.m     // Catch:{ all -> 0x030b }
            r0.a((defpackage.yad) r14, (boolean) r6)     // Catch:{ all -> 0x030b }
            if (r3 == 0) goto L_0x0209
            wss r0 = r1.f     // Catch:{ all -> 0x030b }
            android.accounts.Account r12 = r1.i     // Catch:{ all -> 0x030b }
            java.lang.String r12 = r12.name     // Catch:{ all -> 0x030b }
            android.content.SharedPreferences r0 = r0.a     // Catch:{ all -> 0x030b }
            java.lang.String r15 = "focus_sync_write_cp2_per_each_contact_"
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x030b }
            int r16 = r12.length()     // Catch:{ all -> 0x030b }
            if (r16 != 0) goto L_0x018d
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x030b }
            r12.<init>(r15)     // Catch:{ all -> 0x030b }
            goto L_0x0191
        L_0x018d:
            java.lang.String r12 = r15.concat(r12)     // Catch:{ all -> 0x030b }
        L_0x0191:
            boolean r0 = r0.getBoolean(r12, r7)     // Catch:{ all -> 0x030b }
            if (r0 == 0) goto L_0x0209
            xvw r0 = r1.e     // Catch:{ NullPointerException -> 0x01a0, xye -> 0x019e }
            r0.b()     // Catch:{ NullPointerException -> 0x01a0, xye -> 0x019e }
            goto L_0x020e
        L_0x019e:
            r0 = move-exception
            goto L_0x01a1
        L_0x01a0:
            r0 = move-exception
        L_0x01a1:
            boolean r12 = a((java.lang.Exception) r0, (boolean) r4)     // Catch:{ all -> 0x030b }
            if (r12 == 0) goto L_0x01a8
            goto L_0x01c6
        L_0x01a8:
            defpackage.xip.a()     // Catch:{ all -> 0x030b }
            xfs r12 = defpackage.xfw.a     // Catch:{ all -> 0x030b }
            java.lang.Object r12 = r12.a()     // Catch:{ all -> 0x030b }
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ all -> 0x030b }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x030b }
            if (r12 == 0) goto L_0x0208
            boolean r12 = r0 instanceof defpackage.xye     // Catch:{ all -> 0x030b }
            if (r12 == 0) goto L_0x0208
            r12 = r0
            xye r12 = (defpackage.xye) r12     // Catch:{ all -> 0x030b }
            java.lang.Exception r12 = r12.a     // Catch:{ all -> 0x030b }
            boolean r12 = r12 instanceof android.os.TransactionTooLargeException     // Catch:{ all -> 0x030b }
            if (r12 == 0) goto L_0x0208
        L_0x01c6:
            java.lang.Object[] r12 = new java.lang.Object[r13]     // Catch:{ all -> 0x030b }
            java.lang.Object r13 = r14.a     // Catch:{ all -> 0x030b }
            r12[r7] = r13     // Catch:{ all -> 0x030b }
            java.lang.Object r13 = r14.b     // Catch:{ all -> 0x030b }
            r12[r6] = r13     // Catch:{ all -> 0x030b }
            java.lang.String r13 = "FSA2_RawContactSyncer"
            java.lang.String r14 = "Exception when writing contact to CP2, api contact: %s, local contact: %s"
            defpackage.xdt.b(r13, r14, r12)     // Catch:{ all -> 0x030b }
            yaz r12 = r1.j     // Catch:{ all -> 0x030b }
            ybh r12 = (defpackage.ybh) r12     // Catch:{ all -> 0x030b }
            android.content.SyncResult r12 = r12.a     // Catch:{ all -> 0x030b }
            android.content.SyncStats r12 = r12.stats     // Catch:{ all -> 0x030b }
            long r13 = r12.numIoExceptions     // Catch:{ all -> 0x030b }
            r15 = 1
            long r13 = r13 + r15
            r12.numIoExceptions = r13     // Catch:{ all -> 0x030b }
            yaz r15 = r1.j     // Catch:{ all -> 0x030b }
            xnd r16 = defpackage.xnd.UPDATE     // Catch:{ all -> 0x030b }
            xjo r17 = defpackage.xjo.CONTACT     // Catch:{ all -> 0x030b }
            r18 = 1
            r19 = 2
            r20 = 1
            r15.a(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x030b }
            boolean r12 = r0 instanceof java.lang.NullPointerException     // Catch:{ all -> 0x030b }
            if (r12 != 0) goto L_0x01fc
            java.lang.String r12 = "TransactionTooLargeException"
            goto L_0x01fe
        L_0x01fc:
            java.lang.String r12 = "NPE_toLowerCase"
        L_0x01fe:
            yaz r13 = r1.j     // Catch:{ all -> 0x030b }
            xjo r14 = defpackage.xjo.CONTACT     // Catch:{ all -> 0x030b }
            xnd r15 = defpackage.xnd.UPDATE     // Catch:{ all -> 0x030b }
            r13.a((defpackage.xjo) r14, (defpackage.xnd) r15, (java.lang.String) r12, (java.lang.Exception) r0)     // Catch:{ all -> 0x030b }
            goto L_0x020e
        L_0x0208:
            throw r0     // Catch:{ all -> 0x030b }
        L_0x0209:
            xvw r0 = r1.e     // Catch:{ xye -> 0x0226, NullPointerException -> 0x021f }
            r0.a()     // Catch:{ xye -> 0x0226, NullPointerException -> 0x021f }
        L_0x020e:
            if (r5 == 0) goto L_0x021b
            amri r0 = r1.q     // Catch:{ all -> 0x030b }
            java.lang.Object r0 = r0.b()     // Catch:{ all -> 0x030b }
            xxg r0 = (defpackage.xxg) r0     // Catch:{ all -> 0x030b }
            r0.e(r6)     // Catch:{ all -> 0x030b }
        L_0x021b:
            int r8 = r8 + 1
            goto L_0x00c1
        L_0x021f:
            r0 = move-exception
            if (r3 == 0) goto L_0x0225
            r1.a((java.lang.NullPointerException) r0, (boolean) r4)     // Catch:{ all -> 0x030b }
        L_0x0225:
            throw r0     // Catch:{ all -> 0x030b }
        L_0x0226:
            r0 = move-exception
            if (r3 == 0) goto L_0x022c
            r1.a((defpackage.xye) r0)     // Catch:{ all -> 0x030b }
        L_0x022c:
            throw r0     // Catch:{ all -> 0x030b }
        L_0x022d:
            boolean r0 = r9.c()     // Catch:{ all -> 0x030b }
            if (r0 != 0) goto L_0x0276
            java.lang.String r0 = r9.b()     // Catch:{ all -> 0x030b }
            r1.a((boolean) r3, (boolean) r4)     // Catch:{ all -> 0x030b }
            xwn r9 = r1.c     // Catch:{ all -> 0x030b }
            xwo r11 = r9.a     // Catch:{ all -> 0x030b }
            xvk r11 = r11.a()     // Catch:{ all -> 0x030b }
            r12 = 5
            java.lang.Object r12 = r11.c(r12)     // Catch:{ all -> 0x030b }
            aucd r12 = (defpackage.aucd) r12     // Catch:{ all -> 0x030b }
            r12.a((defpackage.aucj) r11)     // Catch:{ all -> 0x030b }
            boolean r11 = r12.c     // Catch:{ all -> 0x030b }
            if (r11 != 0) goto L_0x0251
            goto L_0x0256
        L_0x0251:
            r12.c()     // Catch:{ all -> 0x030b }
            r12.c = r7     // Catch:{ all -> 0x030b }
        L_0x0256:
            aucj r11 = r12.b     // Catch:{ all -> 0x030b }
            xvk r11 = (defpackage.xvk) r11     // Catch:{ all -> 0x030b }
            xvk r14 = defpackage.xvk.g     // Catch:{ all -> 0x030b }
            r0.getClass()     // Catch:{ all -> 0x030b }
            int r14 = r11.a     // Catch:{ all -> 0x030b }
            r13 = r13 | r14
            r11.a = r13     // Catch:{ all -> 0x030b }
            r11.c = r0     // Catch:{ all -> 0x030b }
            aucj r0 = r12.i()     // Catch:{ all -> 0x030b }
            xvk r0 = (defpackage.xvk) r0     // Catch:{ all -> 0x030b }
            r9.a((defpackage.xvk) r0)     // Catch:{ all -> 0x030b }
            yaz r0 = r1.j     // Catch:{ all -> 0x030b }
            r0.b()     // Catch:{ all -> 0x030b }
            goto L_0x008c
        L_0x0276:
            java.lang.String r0 = r9.b()     // Catch:{ all -> 0x030b }
            r1.a((boolean) r3, (boolean) r4)     // Catch:{ all -> 0x030b }
            xwn r4 = r1.c     // Catch:{ all -> 0x030b }
            r4.a((java.lang.String) r0)     // Catch:{ all -> 0x030b }
            yaz r0 = r1.j     // Catch:{ all -> 0x030b }
            r0.b()     // Catch:{ all -> 0x030b }
            if (r3 == 0) goto L_0x0292
            wss r0 = r1.f     // Catch:{ all -> 0x030b }
            android.accounts.Account r3 = r1.i     // Catch:{ all -> 0x030b }
            java.lang.String r3 = r3.name     // Catch:{ all -> 0x030b }
            r0.a((java.lang.String) r3, (boolean) r7)     // Catch:{ all -> 0x030b }
        L_0x0292:
            xyu r0 = r1.a     // Catch:{ all -> 0x030b }
            android.net.Uri r3 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x030b }
            r0.a(r3)     // Catch:{ all -> 0x030b }
            xyu r0 = r1.a     // Catch:{ all -> 0x030b }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x030b }
            defpackage.xip.a()     // Catch:{ all -> 0x030b }
            ayrj r6 = defpackage.ayrj.a     // Catch:{ all -> 0x030b }
            aytn r6 = r6.a()     // Catch:{ all -> 0x030b }
            long r6 = r6.g()     // Catch:{ all -> 0x030b }
            int r7 = (int) r6     // Catch:{ all -> 0x030b }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x030b }
            int r6 = r6.intValue()     // Catch:{ all -> 0x030b }
            android.net.Uri r7 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x030b }
            android.accounts.Account r9 = r0.a     // Catch:{ all -> 0x030b }
            android.net.Uri r7 = defpackage.xvw.a((android.net.Uri) r7, (android.accounts.Account) r9)     // Catch:{ all -> 0x030b }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x030b }
            r10 = 71
            r9.<init>(r10)     // Catch:{ all -> 0x030b }
            java.lang.String r10 = "sourceid IS NULL AND sync3 IS NOT NULL AND sync3 < "
            r9.append(r10)     // Catch:{ all -> 0x030b }
            long r10 = (long) r6     // Catch:{ all -> 0x030b }
            r13 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r13
            long r3 = r3 - r10
            r9.append(r3)     // Catch:{ all -> 0x030b }
            java.lang.String r3 = r9.toString()     // Catch:{ all -> 0x030b }
            android.content.ContentProviderOperation$Builder r4 = android.content.ContentProviderOperation.newUpdate(r7)     // Catch:{ all -> 0x030b }
            java.lang.String r6 = "sync3"
            android.content.ContentProviderOperation$Builder r4 = r4.withValue(r6, r12)     // Catch:{ all -> 0x030b }
            android.content.ContentProviderOperation$Builder r3 = r4.withSelection(r3, r12)     // Catch:{ all -> 0x030b }
            android.content.ContentProviderOperation r3 = r3.build()     // Catch:{ all -> 0x030b }
            java.lang.String r4 = r3.toString()     // Catch:{ all -> 0x030b }
            java.lang.String r6 = "%40g"
            java.lang.String r7 = "%%40g"
            r4.replace(r6, r7)     // Catch:{ all -> 0x030b }
            java.lang.String r4 = "clearFlagForFailedInsertedContacts"
            r0.a(r3, r4)     // Catch:{ all -> 0x030b }
            if (r5 == 0) goto L_0x0305
            amri r0 = r1.q
            java.lang.Object r0 = r0.b()
            xxg r0 = (defpackage.xxg) r0
            r0.g()
        L_0x0305:
            yav r0 = r1.l
            r0.a(r2, r8)
            return
        L_0x030b:
            r0 = move-exception
            r7 = r8
            goto L_0x030f
        L_0x030e:
            r0 = move-exception
        L_0x030f:
            if (r5 == 0) goto L_0x031c
            amri r3 = r1.q
            java.lang.Object r3 = r3.b()
            xxg r3 = (defpackage.xxg) r3
            r3.g()
        L_0x031c:
            yav r3 = r1.l
            r3.a(r2, r7)
            goto L_0x0323
        L_0x0322:
            throw r0
        L_0x0323:
            goto L_0x0322
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxs.a():void");
    }

    public final void a(xkj xkj) {
        try {
            xyo xyo = this.b;
            Uri uri = ContactsContract.RawContacts.CONTENT_URI;
            Account account = xyo.b;
            String[] strArr = xvw.a;
            this.j.a(xjo.CONTACT, xkj, xjm.CP2, xyo.a(uri.buildUpon().appendQueryParameter("account_name", account.name).appendQueryParameter("account_type", account.type).appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("visible_contacts_only", "true").build(), "data_set IS NULL AND deleted = 0"));
            if (aysu.a.a().b() && xkj == xkj.AFTER_SYNC) {
                Log.i("FSA2_RawContactSyncer", xdt.a("contact count. before sweep: %d, before sync: %d, after sync down: %d, after sync up: %d", Integer.valueOf(a(this.j.a(xjo.CONTACT, xkj.BEFORE_PREPARE_TO_SYNC, xjm.CP2))), Integer.valueOf(a(this.j.a(xjo.CONTACT, xkj.BEFORE_SYNC, xjm.CP2))), Integer.valueOf(a(this.j.a(xjo.CONTACT, xkj.BETWEEN_SYNC_DOWN_AND_SYNC_UP, xjm.CP2))), Integer.valueOf(a(this.j.a(xjo.CONTACT, xkj.AFTER_SYNC, xjm.CP2)))));
            }
        } catch (xye e2) {
            this.j.a(xjo.CONTACT, xkj, xjm.CP2, -1);
        }
    }
}
