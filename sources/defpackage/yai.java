package defpackage;

import android.net.Uri;

/* renamed from: yai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class yai {
    final xwn a;
    protected final yaz b;
    protected final boolean c = ((Boolean) xih.a.a()).booleanValue();
    private final String d;
    private final xvp e;
    private final xyu f;
    private final Uri g;

    protected yai(String str, xwn xwn, xyu xyu, xvp xvp, Uri uri, yaz yaz) {
        this.d = str;
        this.f = xyu;
        this.a = xwn;
        this.e = xvp;
        this.g = uri;
        this.b = yaz;
        xip.a();
    }

    /* access modifiers changed from: protected */
    public abstract xvv a();

    /* access modifiers changed from: protected */
    public abstract xvv a(xvv xvv, boolean z, yah yah);

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0093, code lost:
        if (r1 == null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009b, code lost:
        if (android.text.TextUtils.isEmpty(r1.a) == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a3, code lost:
        if (android.text.TextUtils.isEmpty(r1.b) != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a5, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ad, code lost:
        if (android.text.TextUtils.isEmpty(r1.b) != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b5, code lost:
        r12.b(r1.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ba, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c9, code lost:
        throw new defpackage.xye(new defpackage.xyd(d()));
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.yaq r12) {
        /*
            r11 = this;
            r0 = 1
            defpackage.iva.b((boolean) r0)
            xvv r1 = r11.a()
            java.lang.String r2 = r1.a
            java.lang.String r1 = r1.b
            xwn r3 = r11.a
            xwo r3 = r3.a
            boolean r3 = r3.a
            if (r3 == 0) goto L_0x001a
            yaz r3 = r11.b
            ybh r3 = (defpackage.ybh) r3
            r3.g = r0
        L_0x001a:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x0062
            r11.c()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L_0x0062
            xyu r3 = r11.f
            android.net.Uri r4 = r11.g
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r6 = "sync2"
            java.lang.String r7 = "SWEEP_MARK"
            r5.put(r6, r7)
            android.accounts.Account r6 = r3.a
            android.net.Uri r4 = defpackage.xvw.a((android.net.Uri) r4, (android.accounts.Account) r6)
            android.content.ContentProviderOperation$Builder r4 = android.content.ContentProviderOperation.newUpdate(r4)
            android.content.ContentProviderOperation$Builder r4 = r4.withValues(r5)
            r5 = 0
            java.lang.String r6 = "sourceid IS NOT NULL"
            android.content.ContentProviderOperation$Builder r4 = r4.withSelection(r6, r5)
            android.content.ContentProviderOperation r4 = r4.build()
            java.lang.String r5 = r4.toString()
            java.lang.String r6 = "%40g"
            java.lang.String r7 = "%%40g"
            r5.replace(r6, r7)
            java.lang.String r5 = "mark"
            r3.a(r4, r5)
        L_0x0062:
            yah r3 = new yah
            r3.<init>(r11, r12)
            defpackage.xip.a()
            ayrj r4 = defpackage.ayrj.a
            aytn r4 = r4.a()
            long r4 = r4.aN()
            int r5 = (int) r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            int r4 = r4.intValue()
            r5 = 0
            r6 = 0
        L_0x007f:
            xvv r7 = new xvv
            r7.<init>(r2, r1)
            r1 = r4
        L_0x0085:
            xvp r8 = r11.e
            r8.a()
            if (r6 != 0) goto L_0x008e
            r8 = 1
            goto L_0x008f
        L_0x008e:
            r8 = 0
        L_0x008f:
            xvv r1 = r11.a(r7, r8, r3)     // Catch:{ babk -> 0x00ca }
            if (r1 == 0) goto L_0x00bb
            java.lang.String r7 = r1.a
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x00a5
            java.lang.String r7 = r1.b
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00bb
        L_0x00a5:
            int r6 = r6 + 1
            java.lang.String r7 = r1.b
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00b5
            java.lang.String r1 = r1.b
            r12.a((java.lang.String) r1)
            goto L_0x007f
        L_0x00b5:
            java.lang.String r0 = r1.a
            r12.b(r0)
            return
        L_0x00bb:
            xye r12 = new xye
            xyd r0 = new xyd
            int r1 = r11.d()
            r0.<init>((int) r1)
            r12.<init>(r0)
            throw r12
        L_0x00ca:
            r8 = move-exception
            babj r9 = r8.a
            babg r9 = r9.r
            babg r10 = defpackage.babg.FAILED_PRECONDITION
            if (r9 != r10) goto L_0x00df
            java.lang.String r9 = r8.getMessage()
            java.lang.String r10 = "EXPIRED_SYNC_TOKEN"
            boolean r9 = r9.contains(r10)
            if (r9 != 0) goto L_0x00f4
        L_0x00df:
            babj r9 = r8.a
            babg r9 = r9.r
            babg r10 = defpackage.babg.ABORTED
            if (r9 != r10) goto L_0x0117
            java.lang.String r9 = r8.getMessage()
            java.lang.String r10 = "INVALID_PAGE_TOKEN"
            boolean r9 = r9.contains(r10)
            if (r9 != 0) goto L_0x00f4
            goto L_0x0117
        L_0x00f4:
            if (r6 != 0) goto L_0x0104
            java.lang.String r0 = r11.d
            java.lang.String r1 = "Stale sync token in first page, reverting to full sync"
            android.util.Log.w(r0, r1)
            r11.b()
            r11.a((defpackage.yaq) r12)
            return
        L_0x0104:
            java.lang.String r12 = r11.d
            java.lang.String r0 = "Stale sync token in non-first page, terminating and restart a new sync"
            android.util.Log.e(r12, r0)
            xye r12 = new xye
            xyd r0 = new xyd
            r1 = 6
            r0.<init>((int) r1)
            r12.<init>(r0)
            throw r12
        L_0x0117:
            babj r9 = r8.a
            babg r9 = r9.r
            babg r10 = defpackage.babg.DEADLINE_EXCEEDED
            if (r9 != r10) goto L_0x0147
            int r1 = r1 + -1
            if (r1 <= 0) goto L_0x0134
            java.lang.String r8 = r11.d
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r9[r5] = r10
            java.lang.String r10 = "Deadline exceeded. %d remaining attempts."
            defpackage.xdt.a((java.lang.String) r8, (java.lang.String) r10, (java.lang.Object[]) r9)
            goto L_0x0085
        L_0x0134:
            java.lang.String r12 = r11.d
            java.lang.String r0 = "Too many times deadline exceeded."
            android.util.Log.e(r12, r0)
            xye r12 = new xye
            xyd r0 = new xyd
            r1 = 7
            r0.<init>((int) r1)
            r12.<init>(r0)
            throw r12
        L_0x0147:
            xye r12 = new xye
            r12.<init>(r8)
            goto L_0x014e
        L_0x014d:
            throw r12
        L_0x014e:
            goto L_0x014d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yai.a(yaq):void");
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(Object obj);

    /* access modifiers changed from: protected */
    public abstract void b();

    /* access modifiers changed from: protected */
    public abstract void c();

    /* access modifiers changed from: protected */
    public abstract int d();
}
