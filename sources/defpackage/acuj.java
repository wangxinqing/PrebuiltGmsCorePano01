package defpackage;

/* renamed from: acuj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acuj extends acum {
    final /* synthetic */ avxe a;
    final /* synthetic */ avwu b;

    public acuj(avwu avwu, avxe avxe) {
        this.b = avwu;
        this.a = avxe;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r6) {
        /*
            r5 = this;
            avwu r0 = r5.b
            avxe r1 = r5.a
            boolean r2 = r1 instanceof defpackage.avxe
            if (r2 == 0) goto L_0x006a
            avxh r2 = new avxh
            r2.<init>(r1)
            avwt r0 = r0.a
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r2.a((java.io.OutputStream) r3)     // Catch:{ IOException -> 0x0061, IllegalArgumentException -> 0x0058 }
            byte[] r2 = r3.toByteArray()
            acux r0 = (defpackage.acux) r0
            android.content.ContentResolver r3 = r0.a
            org.apache.http.entity.AbstractHttpEntity r2 = android.net.http.AndroidHttpClient.getCompressedEntity(r2, r3)
            java.lang.String r3 = "application/atom+xml"
            r2.setContentType(r3)
            acuw r3 = new acuw
            r4 = 0
            r3.<init>(r4, r2)
            java.lang.String r2 = "https://android.clients.google.com/gsync/sub"
            java.io.InputStream r6 = r0.a(r3, r2, r6)
            if (r6 == 0) goto L_0x0050
            java.lang.Class r0 = r1.getClass()
            avxb r4 = defpackage.avxg.a(r0, r6)     // Catch:{ all -> 0x0049 }
            r4.f()     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x0046
            r4.d()
        L_0x0046:
            return
        L_0x0047:
            r6 = move-exception
            goto L_0x004a
        L_0x0049:
            r6 = move-exception
        L_0x004a:
            if (r4 == 0) goto L_0x004f
            r4.d()
        L_0x004f:
            throw r6
        L_0x0050:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "Unable to create entry."
            r6.<init>(r0)
            throw r6
        L_0x0058:
            r6 = move-exception
            avxa r0 = new avxa
            java.lang.String r1 = "Unable to serialize entry: "
            r0.<init>(r1, r6)
            throw r0
        L_0x0061:
            r6 = move-exception
            java.lang.String r0 = "GDataClient"
            java.lang.String r1 = "Unable to serialize entry."
            android.util.Log.e(r0, r1, r6)
            throw r6
        L_0x006a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Expected SubscribedFeedsEntry!"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acuj.a(java.lang.String):void");
    }
}
