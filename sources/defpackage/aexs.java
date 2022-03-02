package defpackage;

import android.accounts.Account;
import java.util.concurrent.Callable;

/* renamed from: aexs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aexs implements Callable {
    private final aeva a;
    private final Account b;
    private final int c;
    private final int d;
    private final aeri e;
    private final awdn f;
    private final aeta g;
    private final afeb h;
    private final String i;

    public aexs(aeri aeri, awdn awdn, aeva aeva, afeb afeb, String str, Account account, int i2, int i3, aeta aeta) {
        this.a = aeva;
        this.b = account;
        this.c = i2;
        this.d = i3;
        this.e = aeri;
        this.f = awdn;
        this.h = afeb;
        this.i = str;
        this.g = aeta;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0142  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List call() {
        /*
            r11 = this;
            awdn r0 = r11.f
            java.lang.Object r0 = r0.a()
            pia r0 = (defpackage.pia) r0
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r3 = r11.c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            int r3 = r11.d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "Reading latest footprint from %s/%s."
            r0.a(r3, r2)
            r0 = 0
            r2 = 3
            aeva r3 = r11.a     // Catch:{ IOException -> 0x011e, all -> 0x011c }
            android.accounts.Account r6 = r11.b     // Catch:{ IOException -> 0x011e, all -> 0x011c }
            int r7 = r11.c     // Catch:{ IOException -> 0x011e, all -> 0x011c }
            int r8 = r11.d     // Catch:{ IOException -> 0x011e, all -> 0x011c }
            aevc r0 = r3.a(r6, r7, r8)     // Catch:{ IOException -> 0x011e, all -> 0x011c }
            afeb r3 = r11.h     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            java.lang.String r6 = r11.i     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            android.accounts.Account r7 = r11.b     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            int r8 = r11.c     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            int r9 = r11.d     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            auku r10 = defpackage.auku.SYNC_LATEST_PER_SECONDARY_ID     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            aukh r8 = defpackage.aeuz.a(r8, r9, r10)     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            afdx r3 = r3.b(r6, r7, r8)     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            if (r3 != 0) goto L_0x0073
            awdn r3 = r11.f     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            java.lang.Object r3 = r3.a()     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            pia r3 = (defpackage.pia) r3     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            java.lang.String r7 = r11.i     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            r6[r4] = r7     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            int r7 = r11.c     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            r6[r5] = r7     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            int r7 = r11.d     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            r6[r1] = r7     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            java.lang.String r7 = "%s is not subscribed to corpus=%d, datatype=%d, returning empty list."
            r3.d(r7, r6)     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            java.util.List r1 = java.util.Collections.emptyList()     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            if (r0 == 0) goto L_0x0072
            r0.close()
        L_0x0072:
            return r1
        L_0x0073:
            aeri r6 = r11.e     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            boolean r6 = r6.J()     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            if (r6 == 0) goto L_0x008c
            afeb r6 = r11.h     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            java.lang.String r7 = r3.a()     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            android.accounts.Account r8 = r3.b()     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            aukh r9 = r3.c()     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            r6.a(r7, r8, r9)     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
        L_0x008c:
            aukf r3 = r3.e()     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            aeta r3 = defpackage.aeuz.a((defpackage.aukf) r3)     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            aeta r6 = defpackage.aeta.a     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            boolean r6 = r6.equals(r3)     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            if (r6 == 0) goto L_0x00c9
            awdn r3 = r11.f     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            java.lang.Object r3 = r3.a()     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            pia r3 = (defpackage.pia) r3     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            java.lang.String r7 = r11.i     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            r6[r4] = r7     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            int r7 = r11.c     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            r6[r5] = r7     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            int r7 = r11.d     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            r6[r1] = r7     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            java.lang.String r7 = "%s subscription filter for corpus=%d, datatype=%d is NONE, returning empty list."
            r3.c(r7, r6)     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            java.util.List r1 = java.util.Collections.emptyList()     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            if (r0 == 0) goto L_0x00c8
            r0.close()
        L_0x00c8:
            return r1
        L_0x00c9:
            afcv r6 = r0.c()     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            afdo r6 = r6.a()     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            amzt r7 = defpackage.amzy.j()     // Catch:{ all -> 0x010e }
            aeta r8 = r11.g     // Catch:{ all -> 0x010e }
            java.lang.String r9 = r11.i     // Catch:{ all -> 0x010e }
            java.util.List r8 = r0.a(r6, r8, r9)     // Catch:{ all -> 0x010e }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x010e }
        L_0x00e1:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x010e }
            if (r9 == 0) goto L_0x0101
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x010e }
            aetb r9 = (defpackage.aetb) r9     // Catch:{ all -> 0x010e }
            byte[] r10 = r9.b()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x00fd
            byte[] r10 = r9.b()     // Catch:{ all -> 0x010e }
            boolean r10 = r3.a(r10)     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x00e1
        L_0x00fd:
            r7.c(r9)     // Catch:{ all -> 0x010e }
            goto L_0x00e1
        L_0x0101:
            amzy r3 = r7.a()     // Catch:{ all -> 0x010e }
            r6.close()     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            if (r0 == 0) goto L_0x010d
            r0.close()
        L_0x010d:
            return r3
        L_0x010e:
            r3 = move-exception
            r6.close()     // Catch:{ all -> 0x0113 }
            goto L_0x0117
        L_0x0113:
            r6 = move-exception
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r6)     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
        L_0x0117:
            throw r3     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
        L_0x0118:
            r1 = move-exception
            goto L_0x0140
        L_0x011a:
            r3 = move-exception
            goto L_0x011f
        L_0x011c:
            r1 = move-exception
            goto L_0x0140
        L_0x011e:
            r3 = move-exception
        L_0x011f:
            aepg r6 = new aepg     // Catch:{ all -> 0x013f }
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x013f }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x013f }
            int r8 = r11.c     // Catch:{ all -> 0x013f }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x013f }
            r1[r4] = r8     // Catch:{ all -> 0x013f }
            int r4 = r11.d     // Catch:{ all -> 0x013f }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x013f }
            r1[r5] = r4     // Catch:{ all -> 0x013f }
            java.lang.String r4 = "Failed to read footprint from %s/%s."
            java.lang.String r1 = java.lang.String.format(r7, r4, r1)     // Catch:{ all -> 0x013f }
            r6.<init>(r2, r1, r3)     // Catch:{ all -> 0x013f }
            throw r6     // Catch:{ all -> 0x013f }
        L_0x013f:
            r1 = move-exception
        L_0x0140:
            if (r0 == 0) goto L_0x0145
            r0.close()
        L_0x0145:
            goto L_0x0147
        L_0x0146:
            throw r1
        L_0x0147:
            goto L_0x0146
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aexs.call():java.util.List");
    }
}
