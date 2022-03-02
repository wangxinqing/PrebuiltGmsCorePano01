package defpackage;

import android.content.Context;

/* renamed from: afnb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afnb implements afmw {
    public final agab a;
    public final afnf b;
    private final Context c;
    private final agzs d;

    public afnb(Context context, agab agab, agzs agzs, afnf afnf) {
        this.c = context;
        this.a = agab;
        this.d = agzs;
        this.b = afnf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072 A[Catch:{ IOException -> 0x00c3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aorr a(defpackage.afmv r11) {
        /*
            r10 = this;
            java.lang.String r0 = "OffroadFileDownloader"
            r1 = r11
            afmq r1 = (defpackage.afmq) r1
            android.net.Uri r2 = r1.a
            java.lang.String r7 = r2.getLastPathSegment()
            defpackage.amrl.a((java.lang.Object) r7)
            android.content.Context r2 = r10.c     // Catch:{ IOException -> 0x00c3 }
            ahal r3 = new ahal     // Catch:{ IOException -> 0x00c3 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x00c3 }
            r2 = r11
            afmq r2 = (defpackage.afmq) r2     // Catch:{ IOException -> 0x00c3 }
            android.net.Uri r2 = r2.a     // Catch:{ IOException -> 0x00c3 }
            java.lang.String r4 = r2.getScheme()     // Catch:{ IOException -> 0x00c3 }
            int r5 = r4.hashCode()
            r6 = -861391249(0xffffffffcca8366f, float:-8.8191864E7)
            r8 = 0
            r9 = 1
            if (r5 == r6) goto L_0x0039
            r6 = 3143036(0x2ff57c, float:4.404332E-39)
            if (r5 == r6) goto L_0x002f
            goto L_0x0043
        L_0x002f:
            java.lang.String r5 = "file"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0043
            r4 = 1
            goto L_0x0044
        L_0x0039:
            java.lang.String r5 = "android"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0043
            r4 = 0
            goto L_0x0044
        L_0x0043:
            r4 = -1
        L_0x0044:
            if (r4 == 0) goto L_0x0072
            if (r4 != r9) goto L_0x004d
            java.io.File r2 = defpackage.ahak.a(r2)     // Catch:{ IOException -> 0x00c3 }
            goto L_0x0078
        L_0x004d:
            ahbk r11 = new ahbk     // Catch:{ IOException -> 0x00c3 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x00c3 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x00c3 }
            int r3 = r3.length()     // Catch:{ IOException -> 0x00c3 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c3 }
            int r3 = r3 + 30
            r4.<init>(r3)     // Catch:{ IOException -> 0x00c3 }
            java.lang.String r3 = "Couldn't convert URI to path: "
            r4.append(r3)     // Catch:{ IOException -> 0x00c3 }
            r4.append(r2)     // Catch:{ IOException -> 0x00c3 }
            java.lang.String r2 = r4.toString()     // Catch:{ IOException -> 0x00c3 }
            r11.<init>((java.lang.String) r2)     // Catch:{ IOException -> 0x00c3 }
            throw r11     // Catch:{ IOException -> 0x00c3 }
        L_0x0072:
            ahab r3 = r3.a     // Catch:{ IOException -> 0x00c3 }
            java.io.File r2 = r3.b(r2)     // Catch:{ IOException -> 0x00c3 }
        L_0x0078:
            java.io.File r6 = r2.getParentFile()     // Catch:{ IOException -> 0x00c3 }
            defpackage.amrl.a((java.lang.Object) r6)
            agzs r2 = r10.d     // Catch:{ IOException -> 0x00a1 }
            r3 = r11
            afmq r3 = (defpackage.afmq) r3     // Catch:{ IOException -> 0x00a1 }
            android.net.Uri r3 = r3.a     // Catch:{ IOException -> 0x00a1 }
            ahca r4 = new ahca     // Catch:{ IOException -> 0x00a1 }
            r4.<init>()     // Catch:{ IOException -> 0x00a1 }
            agzk[] r5 = new defpackage.agzk[r8]     // Catch:{ IOException -> 0x00a1 }
            java.lang.Object r2 = r2.a(r3, r4, r5)     // Catch:{ IOException -> 0x00a1 }
            agae r2 = (defpackage.agae) r2     // Catch:{ IOException -> 0x00a1 }
            afmz r0 = new afmz
            r3 = r0
            r4 = r10
            r5 = r11
            r8 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            aorr r11 = defpackage.ahe.a(r0)
            return r11
        L_0x00a1:
            r11 = move-exception
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r8] = r0
            android.net.Uri r0 = r1.a
            r2[r9] = r0
            java.lang.String r0 = "%s: Unable to create mobstore ResponseWriter for file %s"
            defpackage.afsh.a((java.lang.Throwable) r11, (java.lang.String) r0, (java.lang.Object[]) r2)
            afkd r0 = defpackage.afkf.a()
            afke r1 = defpackage.afke.UNABLE_TO_CREATE_MOBSTORE_RESPONSE_WRITER_ERROR
            r0.a = r1
            r0.c = r11
            afkf r11 = r0.a()
            aorr r11 = defpackage.aorl.a((java.lang.Throwable) r11)
            return r11
        L_0x00c3:
            r11 = move-exception
            android.net.Uri r1 = r1.a
            java.lang.String r2 = "%s: The file uri is malformed, uri = %s"
            defpackage.afsh.a((java.lang.String) r2, (java.lang.Object) r0, (java.lang.Object) r1)
            afkd r0 = defpackage.afkf.a()
            afke r1 = defpackage.afke.MALFORMED_FILE_URI_ERROR
            r0.a = r1
            r0.c = r11
            afkf r11 = r0.a()
            aorr r11 = defpackage.aorl.a((java.lang.Throwable) r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afnb.a(afmv):aorr");
    }
}
