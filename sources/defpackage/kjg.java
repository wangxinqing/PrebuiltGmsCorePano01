package defpackage;

import android.content.Context;

/* renamed from: kjg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kjg extends kja {
    private static final ith f = new ith("MultipartUploader", "");
    private String g;

    private kjg(Context context, kjl kjl, kht kht, kjn kjn) {
        super(context, kjl, kht, kjn);
    }

    public static kjg a(Context context, kjl kjl, kht kht, kjn kjn) {
        if (kjl.e <= 4194304) {
            return new kjg(context, kjl, kht, kjn);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "multipart";
    }

    public final amzy e() {
        String str = this.g;
        return str != null ? amzy.a((Object) str) : amzy.h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e6 A[Catch:{ all -> 0x00fe }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.lnj a(defpackage.kjk r6, defpackage.lic r7, com.google.android.gms.common.internal.ClientContext r8) {
        /*
            r5 = this;
            r0 = 3
            r5.e = r0
            kjl r0 = r5.b
            long r0 = r0.e
            r6.a(r0)
            r0 = 0
            android.content.Context r1 = r5.a     // Catch:{ IOException -> 0x00df, all -> 0x00dd }
            java.net.URL r2 = r5.b()     // Catch:{ IOException -> 0x00df, all -> 0x00dd }
            java.lang.String r3 = r5.d()     // Catch:{ IOException -> 0x00df, all -> 0x00dd }
            kje r7 = defpackage.kjd.a(r1, r2, r3, r8, r7)     // Catch:{ IOException -> 0x00df, all -> 0x00dd }
            kjl r1 = r5.b     // Catch:{ IOException -> 0x00df, all -> 0x00dd }
            java.lang.String r1 = r1.f     // Catch:{ IOException -> 0x00df, all -> 0x00dd }
            if (r1 != 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            java.lang.String r2 = "If-Match"
            r7.a((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ IOException -> 0x00df, all -> 0x00dd }
        L_0x0025:
            kjl r1 = r5.b     // Catch:{ IOException -> 0x00df, all -> 0x00dd }
            java.lang.String r1 = r1.b     // Catch:{ IOException -> 0x00df, all -> 0x00dd }
            r7.c(r1)     // Catch:{ IOException -> 0x00df, all -> 0x00dd }
            kjl r1 = r5.b     // Catch:{ all -> 0x00d7 }
            lsr r1 = r1.a()     // Catch:{ all -> 0x00d7 }
            kjl r2 = r5.b     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = r2.b()     // Catch:{ all -> 0x00d5 }
            r7.f()     // Catch:{ all -> 0x00d5 }
            r7.b(r2)     // Catch:{ all -> 0x00d5 }
            lhb r2 = r7.e()     // Catch:{ all -> 0x00d5 }
            defpackage.jjt.a(r1, r2)     // Catch:{ all -> 0x00d5 }
            int r2 = r7.a     // Catch:{ all -> 0x00d5 }
            r3 = 1
            int r2 = r2 + r3
            r7.a = r2     // Catch:{ all -> 0x00d5 }
            r1.a()     // Catch:{ all -> 0x00d5 }
            defpackage.jjt.a((java.io.Closeable) r1)     // Catch:{ IOException -> 0x00df, all -> 0x00dd }
            int r0 = r7.a()     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            ith r1 = f     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            r2[r3] = r4     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            java.lang.String r3 = "HTTP upload status %d"
            r1.a((java.lang.String) r3, (java.lang.Object[]) r2)     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            java.lang.String r1 = "X-GUploader-UploadID"
            java.lang.String r1 = r7.a(r1)     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            r5.g = r1     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            r1 = 201(0xc9, float:2.82E-43)
            if (r0 != r1) goto L_0x0072
            goto L_0x00b5
        L_0x0072:
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L_0x00b5
            java.io.InputStream r6 = r7.c()     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            lrx r6 = defpackage.lry.a((java.io.InputStream) r6)     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            defpackage.lry.a(r0, r6)     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            kjl r8 = r5.b     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            java.lang.Integer r8 = r8.h     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            int r8 = r8.intValue()     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            if (r0 == r8) goto L_0x00ad
            kjj r8 = new kjj     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            r2 = 37
            r1.<init>(r2)     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            java.lang.String r2 = "Upload failed HTTP status "
            r1.append(r2)     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            r1.append(r0)     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            kcx r2 = new kcx     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            boolean r3 = defpackage.kbn.a(r0, r6)     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            r2.<init>(r3, r0, r6)     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            r8.<init>(r1, r2)     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            throw r8     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
        L_0x00ad:
            kji r6 = new kji     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            java.lang.String r8 = "Conflict uploading"
            r6.<init>(r8)     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            throw r6     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
        L_0x00b5:
            r6.a()     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            java.io.InputStream r6 = r7.b()     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            com.google.android.gms.drive.internal.model.File r6 = defpackage.kjn.a(r6)     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            java.lang.String r0 = "X-Server-Object-Version"
            java.lang.String r0 = r7.a(r0)     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            lnl r1 = new lnl     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            r1.<init>(r6, r8, r0)     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            defpackage.jjt.a((java.io.Closeable) r7)
            return r1
        L_0x00cf:
            r6 = move-exception
            r0 = r7
            goto L_0x00ff
        L_0x00d2:
            r6 = move-exception
            r0 = r7
            goto L_0x00e0
        L_0x00d5:
            r6 = move-exception
            goto L_0x00d9
        L_0x00d7:
            r6 = move-exception
            r1 = r0
        L_0x00d9:
            defpackage.jjt.a((java.io.Closeable) r1)     // Catch:{ IOException -> 0x00df, all -> 0x00dd }
            throw r6     // Catch:{ IOException -> 0x00df, all -> 0x00dd }
        L_0x00dd:
            r6 = move-exception
            goto L_0x00ff
        L_0x00df:
            r6 = move-exception
        L_0x00e0:
            java.lang.Class r7 = r6.getClass()     // Catch:{ all -> 0x00fe }
            if (r7 == 0) goto L_0x00f6
            java.lang.Class r7 = r6.getClass()     // Catch:{ all -> 0x00fe }
            java.lang.Class<lhp> r8 = defpackage.lhp.class
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x00fe }
            if (r7 != 0) goto L_0x00f3
            goto L_0x00f6
        L_0x00f3:
            lhp r6 = (defpackage.lhp) r6     // Catch:{ all -> 0x00fe }
            throw r6     // Catch:{ all -> 0x00fe }
        L_0x00f6:
            kjj r7 = new kjj     // Catch:{ all -> 0x00fe }
            java.lang.String r8 = "Upload exception"
            r7.<init>(r8, r6)     // Catch:{ all -> 0x00fe }
            throw r7     // Catch:{ all -> 0x00fe }
        L_0x00fe:
            r6 = move-exception
        L_0x00ff:
            defpackage.jjt.a((java.io.Closeable) r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjg.a(kjk, lic, com.google.android.gms.common.internal.ClientContext):lnj");
    }
}
