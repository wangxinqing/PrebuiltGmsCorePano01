package defpackage;

import java.io.File;

/* renamed from: aayq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aayq {
    ;
    
    private final File b;

    private aayq(String str) {
        this.b = new File("/sys/fs/selinux/enforce");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041 A[SYNTHETIC, Splitter:B:19:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b A[SYNTHETIC, Splitter:B:26:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067 A[SYNTHETIC, Splitter:B:34:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.aayp a() {
        /*
            aayp r0 = new aayp
            r0.<init>()
            aayq r1 = a
            boolean r1 = r1.b()
            r0.a = r1
            aayq r1 = a
            boolean r2 = r1.b()
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L_0x0051
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0047, all -> 0x003e }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0047, all -> 0x003e }
            java.io.File r1 = r1.b     // Catch:{ IOException -> 0x0047, all -> 0x003e }
            r6.<init>(r1)     // Catch:{ IOException -> 0x0047, all -> 0x003e }
            r2.<init>(r6)     // Catch:{ IOException -> 0x0047, all -> 0x003e }
            int r1 = r2.read()     // Catch:{ IOException -> 0x003c, all -> 0x0039 }
            char r1 = (char) r1
            r6 = 49
            if (r1 != r6) goto L_0x0033
            r2.close()     // Catch:{ IOException -> 0x0031 }
            goto L_0x0052
        L_0x0031:
            r1 = move-exception
            goto L_0x0052
        L_0x0033:
            r2.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x0051
        L_0x0037:
            r1 = move-exception
            goto L_0x004f
        L_0x0039:
            r0 = move-exception
            r4 = r2
            goto L_0x003f
        L_0x003c:
            r1 = move-exception
            goto L_0x0049
        L_0x003e:
            r0 = move-exception
        L_0x003f:
            if (r4 == 0) goto L_0x0046
            r4.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x0046
        L_0x0045:
            r1 = move-exception
        L_0x0046:
            throw r0
        L_0x0047:
            r1 = move-exception
            r2 = r4
        L_0x0049:
            if (r2 == 0) goto L_0x004f
            r2.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x0051
        L_0x004f:
            r3 = 0
            goto L_0x0052
        L_0x0051:
            r3 = 0
        L_0x0052:
            r0.b = r3
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "/selinux_version"
            r1.<init>(r2)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L_0x0072
            byte[] r1 = defpackage.aaza.b((java.io.File) r1)
            if (r1 == 0) goto L_0x0072
            java.lang.String r2 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x006f }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch:{ UnsupportedEncodingException -> 0x006f }
            goto L_0x0073
        L_0x006f:
            r1 = move-exception
            r2 = r4
            goto L_0x0073
        L_0x0072:
            r2 = r4
        L_0x0073:
            r0.c = r2
            boolean r1 = defpackage.aaza.a()
            if (r1 == 0) goto L_0x0090
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "/sepolicy"
            r1.<init>(r2)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L_0x008d
            byte[] r4 = defpackage.aaza.a((java.io.File) r1)
            goto L_0x008e
        L_0x008d:
        L_0x008e:
            r0.d = r4
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aayq.a():aayp");
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.b.exists();
    }
}
