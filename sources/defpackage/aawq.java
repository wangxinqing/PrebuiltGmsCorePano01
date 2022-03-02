package defpackage;

import java.io.File;

/* renamed from: aawq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aawq {
    ;
    
    private final File b;

    private aawq(String str) {
        this.b = new File("/sys/fs/selinux/enforce");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045 A[SYNTHETIC, Splitter:B:23:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e A[SYNTHETIC, Splitter:B:29:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0055 A[Catch:{ IOException -> 0x0037 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.aawp a() {
        /*
            aawp r0 = new aawp
            r0.<init>()
            aawq r1 = a
            boolean r1 = r1.b()
            r0.a = r1
            aawq r1 = a
            boolean r2 = r1.b()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x005b
            r2 = 0
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x004b, all -> 0x0042 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x004b, all -> 0x0042 }
            java.io.File r1 = r1.b     // Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x004b, all -> 0x0042 }
            r6.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x004b, all -> 0x0042 }
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x004b, all -> 0x0042 }
            int r1 = r5.read()     // Catch:{ FileNotFoundException -> 0x003f, IOException -> 0x003c, all -> 0x0039 }
            char r1 = (char) r1
            r2 = 49
            if (r1 != r2) goto L_0x0033
            r5.close()     // Catch:{ IOException -> 0x0031 }
            goto L_0x005c
        L_0x0031:
            r1 = move-exception
            goto L_0x005c
        L_0x0033:
            r5.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x005b
        L_0x0037:
            r1 = move-exception
            goto L_0x0059
        L_0x0039:
            r0 = move-exception
            r2 = r5
            goto L_0x0043
        L_0x003c:
            r1 = move-exception
            r2 = r5
            goto L_0x004c
        L_0x003f:
            r1 = move-exception
            r2 = r5
            goto L_0x0053
        L_0x0042:
            r0 = move-exception
        L_0x0043:
            if (r2 == 0) goto L_0x004a
            r2.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x004a
        L_0x0049:
            r1 = move-exception
        L_0x004a:
            throw r0
        L_0x004b:
            r1 = move-exception
        L_0x004c:
            if (r2 == 0) goto L_0x0059
            r2.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x005b
        L_0x0052:
            r1 = move-exception
        L_0x0053:
            if (r2 == 0) goto L_0x0059
            r2.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x005b
        L_0x0059:
            r3 = 0
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            r0.b = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aawq.a():aawp");
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.b.exists();
    }
}
