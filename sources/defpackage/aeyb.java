package defpackage;

import android.accounts.Account;
import java.util.concurrent.Callable;

/* renamed from: aeyb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeyb implements Callable {
    private final aeva a;
    private final Account b;
    private final int c;
    private final int d;
    private final awdn e;
    private final String f;
    private final auay g;
    private final auay h;

    public aeyb(awdn awdn, aeva aeva, String str, Account account, int i, int i2, byte[] bArr, byte[] bArr2) {
        this.a = aeva;
        this.b = account;
        this.c = i;
        this.d = i2;
        this.e = awdn;
        this.f = str;
        this.g = bArr != null ? auay.a(bArr) : null;
        this.h = auay.a(bArr2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r10 = this;
            awdn r0 = r10.e
            java.lang.Object r0 = r0.a()
            pia r0 = (defpackage.pia) r0
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            auay r3 = r10.h
            int r3 = r3.a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            int r3 = r10.c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r2[r5] = r3
            int r3 = r10.d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 2
            r2[r6] = r3
            java.lang.String r3 = "Writing %d bytes of data to Footprints %s/%s."
            r0.a(r3, r2)
            r0 = 0
            aeva r2 = r10.a     // Catch:{ aevb -> 0x0098, IOException -> 0x006b, all -> 0x0069 }
            android.accounts.Account r3 = r10.b     // Catch:{ aevb -> 0x0098, IOException -> 0x006b, all -> 0x0069 }
            int r7 = r10.c     // Catch:{ aevb -> 0x0098, IOException -> 0x006b, all -> 0x0069 }
            int r8 = r10.d     // Catch:{ aevb -> 0x0098, IOException -> 0x006b, all -> 0x0069 }
            aevc r0 = r2.a(r3, r7, r8)     // Catch:{ aevb -> 0x0098, IOException -> 0x006b, all -> 0x0069 }
            afcv r2 = r0.c()     // Catch:{ aevb -> 0x0067, IOException -> 0x0065, all -> 0x0063 }
            afdp r2 = r2.b()     // Catch:{ aevb -> 0x0067, IOException -> 0x0065, all -> 0x0063 }
            java.lang.String r3 = r10.f     // Catch:{ all -> 0x0059 }
            auay r7 = r10.g     // Catch:{ all -> 0x0059 }
            auay r8 = r10.h     // Catch:{ all -> 0x0059 }
            r0.a((defpackage.afdp) r2, (java.lang.String) r3, (defpackage.auay) r7, (defpackage.auay) r8)     // Catch:{ all -> 0x0059 }
            r2.b()     // Catch:{ all -> 0x0059 }
            r2.close()     // Catch:{ aevb -> 0x0067, IOException -> 0x0065, all -> 0x0063 }
            if (r0 == 0) goto L_0x0058
            r0.close()
        L_0x0058:
            return
        L_0x0059:
            r3 = move-exception
            r2.close()     // Catch:{ all -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r2 = move-exception
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r2)     // Catch:{ aevb -> 0x0067, IOException -> 0x0065, all -> 0x0063 }
        L_0x0062:
            throw r3     // Catch:{ aevb -> 0x0067, IOException -> 0x0065, all -> 0x0063 }
        L_0x0063:
            r1 = move-exception
            goto L_0x00c6
        L_0x0065:
            r2 = move-exception
            goto L_0x006c
        L_0x0067:
            r2 = move-exception
            goto L_0x0099
        L_0x0069:
            r1 = move-exception
            goto L_0x00c6
        L_0x006b:
            r2 = move-exception
        L_0x006c:
            aepg r3 = new aepg     // Catch:{ all -> 0x00c5 }
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00c5 }
            java.lang.Object[] r8 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c5 }
            auay r9 = r10.h     // Catch:{ all -> 0x00c5 }
            int r9 = r9.a()     // Catch:{ all -> 0x00c5 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00c5 }
            r8[r4] = r9     // Catch:{ all -> 0x00c5 }
            int r4 = r10.c     // Catch:{ all -> 0x00c5 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00c5 }
            r8[r5] = r4     // Catch:{ all -> 0x00c5 }
            int r4 = r10.d     // Catch:{ all -> 0x00c5 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00c5 }
            r8[r6] = r4     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = "Failed to write %d bytes to Footprints %s/%s."
            java.lang.String r4 = java.lang.String.format(r7, r4, r8)     // Catch:{ all -> 0x00c5 }
            r3.<init>(r1, r4, r2)     // Catch:{ all -> 0x00c5 }
            throw r3     // Catch:{ all -> 0x00c5 }
        L_0x0098:
            r2 = move-exception
        L_0x0099:
            aepg r3 = new aepg     // Catch:{ all -> 0x00c5 }
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00c5 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c5 }
            auay r8 = r10.h     // Catch:{ all -> 0x00c5 }
            int r8 = r8.a()     // Catch:{ all -> 0x00c5 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00c5 }
            r1[r4] = r8     // Catch:{ all -> 0x00c5 }
            int r4 = r10.c     // Catch:{ all -> 0x00c5 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00c5 }
            r1[r5] = r4     // Catch:{ all -> 0x00c5 }
            int r4 = r10.d     // Catch:{ all -> 0x00c5 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00c5 }
            r1[r6] = r4     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = "Illegal use of secondary ID while writing %d bytes to Footprints %s/%s."
            java.lang.String r1 = java.lang.String.format(r7, r4, r1)     // Catch:{ all -> 0x00c5 }
            r3.<init>(r6, r1, r2)     // Catch:{ all -> 0x00c5 }
            throw r3     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r1 = move-exception
        L_0x00c6:
            if (r0 == 0) goto L_0x00cb
            r0.close()
        L_0x00cb:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeyb.a():void");
    }

    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return null;
    }
}
