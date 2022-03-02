package defpackage;

/* renamed from: aayl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aayl {
    private static final String[] a = {"su"};
    private static final String[] b = {"/system/bin", "/system/xbin"};
    private static final String[] c = {"/bin", "/xbin"};

    static {
        aayl.class.getCanonicalName();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0097 A[SYNTHETIC, Splitter:B:34:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1 A[SYNTHETIC, Splitter:B:41:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.List a() {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            aayh r1 = new aayh
            r1.<init>()
            java.lang.String r2 = "PATH"
            java.lang.String r2 = java.lang.System.getenv(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 0
            if (r3 != 0) goto L_0x001e
            java.lang.String r3 = ":"
            java.lang.String[] r2 = r2.split(r3)
            goto L_0x001f
        L_0x001e:
            r2 = r4
        L_0x001f:
            r3 = 0
            if (r2 != 0) goto L_0x0023
            goto L_0x0037
        L_0x0023:
            int r5 = r2.length
            if (r5 == 0) goto L_0x0037
            java.lang.String[] r6 = b
            int r7 = r6.length
            int r7 = r7 + r5
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String[] r6 = (java.lang.String[]) r6
            java.lang.String[] r7 = b
            int r7 = r7.length
            java.lang.System.arraycopy(r2, r3, r6, r7, r5)
            goto L_0x0039
        L_0x0037:
            java.lang.String[] r6 = b
        L_0x0039:
            java.io.File r2 = new java.io.File
            java.lang.String r5 = "/proc/self/mountinfo"
            r2.<init>(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r7 = r2.exists()
            if (r7 == 0) goto L_0x00a7
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ IOException -> 0x009d, all -> 0x0094 }
            java.io.FileReader r8 = new java.io.FileReader     // Catch:{ IOException -> 0x009d, all -> 0x0094 }
            r8.<init>(r2)     // Catch:{ IOException -> 0x009d, all -> 0x0094 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x009d, all -> 0x0094 }
        L_0x0055:
            java.lang.String r2 = r7.readLine()     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            if (r2 == 0) goto L_0x0089
            java.lang.String r8 = "\\s+"
            java.lang.String[] r2 = r2.split(r8)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            int r8 = r2.length     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r9 = 10
            if (r8 < r9) goto L_0x0055
            r8 = 9
            r9 = r2[r8]     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            if (r9 != 0) goto L_0x0055
            r8 = r2[r8]     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            java.lang.String r9 = "/dev/block/loop"
            boolean r8 = r8.startsWith(r9)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            if (r8 == 0) goto L_0x0055
            r8 = 4
            r9 = r2[r8]     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            if (r9 != 0) goto L_0x0055
            r2 = r2[r8]     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r5.add(r2)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            goto L_0x0055
        L_0x0089:
            r7.close()     // Catch:{ IOException -> 0x008d }
            goto L_0x00a7
        L_0x008d:
            r2 = move-exception
            goto L_0x00a7
        L_0x008f:
            r0 = move-exception
            r4 = r7
            goto L_0x0095
        L_0x0092:
            r2 = move-exception
            goto L_0x009f
        L_0x0094:
            r0 = move-exception
        L_0x0095:
            if (r4 == 0) goto L_0x009c
            r4.close()     // Catch:{ IOException -> 0x009b }
            goto L_0x009c
        L_0x009b:
            r1 = move-exception
        L_0x009c:
            throw r0
        L_0x009d:
            r2 = move-exception
            r7 = r4
        L_0x009f:
            if (r7 == 0) goto L_0x00a6
            r7.close()     // Catch:{ IOException -> 0x00a5 }
            goto L_0x00fe
        L_0x00a5:
            r2 = move-exception
        L_0x00a6:
            goto L_0x00fe
        L_0x00a7:
            int r2 = r5.size()
            if (r2 <= 0) goto L_0x00fd
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r4 = r5.size()
            r7 = 0
        L_0x00b7:
            if (r7 >= r4) goto L_0x00f3
            java.lang.Object r8 = r5.get(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.io.File r9 = new java.io.File
            r9.<init>(r8)
            boolean r9 = r9.isDirectory()
            if (r9 == 0) goto L_0x00f0
            java.lang.String[] r9 = c
            int r10 = r9.length
            r11 = 0
        L_0x00ce:
            if (r11 >= r10) goto L_0x00f0
            r12 = r9[r11]
            java.lang.String r13 = java.lang.String.valueOf(r8)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r14 = r12.length()
            if (r14 != 0) goto L_0x00e6
            java.lang.String r12 = new java.lang.String
            r12.<init>(r13)
            goto L_0x00ea
        L_0x00e6:
            java.lang.String r12 = r13.concat(r12)
        L_0x00ea:
            r2.add(r12)
            int r11 = r11 + 1
            goto L_0x00ce
        L_0x00f0:
            int r7 = r7 + 1
            goto L_0x00b7
        L_0x00f3:
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r4)
            r4 = r2
            java.lang.String[] r4 = (java.lang.String[]) r4
            goto L_0x00fe
        L_0x00fd:
        L_0x00fe:
            if (r6 != 0) goto L_0x0102
            r6 = r4
            goto L_0x0111
        L_0x0102:
            if (r4 == 0) goto L_0x0111
            int r2 = r6.length
            int r5 = r4.length
            int r7 = r2 + r5
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String[] r6 = (java.lang.String[]) r6
            java.lang.System.arraycopy(r4, r3, r6, r2, r5)
        L_0x0111:
            java.lang.String[] r2 = a
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            if (r6 != 0) goto L_0x011b
            goto L_0x0140
        L_0x011b:
            if (r2 == 0) goto L_0x0140
            int r5 = r6.length
            r7 = 0
        L_0x011f:
            if (r7 >= r5) goto L_0x0140
            r8 = r6[r7]
            int r9 = r2.length
            r10 = 0
        L_0x0125:
            if (r10 >= r9) goto L_0x013d
            r11 = r2[r10]
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r3] = r8
            r13 = 1
            r12[r13] = r11
            java.lang.String r11 = "%s/%s"
            java.lang.String r11 = java.lang.String.format(r11, r12)
            r4.add(r11)
            int r10 = r10 + 1
            goto L_0x0125
        L_0x013d:
            int r7 = r7 + 1
            goto L_0x011f
        L_0x0140:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>(r4)
        L_0x0145:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x01b1
            java.lang.Object r3 = r2.poll()
            java.lang.String r3 = (java.lang.String) r3
            java.io.File r5 = new java.io.File
            r5.<init>(r3)
            boolean r6 = r5.exists()
            if (r6 == 0) goto L_0x0145
            boolean r6 = r5.isFile()
            if (r6 == 0) goto L_0x0145
            aaxz r6 = new aaxz
            r6.<init>()
            r6.a = r3
            boolean r7 = r5.exists()
            r6.c = r7
            byte[] r7 = defpackage.aaza.a((java.io.File) r5)
            r6.g = r7
            boolean r3 = r1.a((java.lang.String) r3)     // Catch:{ aayg -> 0x017c }
            r6.h = r3     // Catch:{ aayg -> 0x017c }
            goto L_0x017d
        L_0x017c:
            r3 = move-exception
        L_0x017d:
            aayf r3 = r1.a((java.io.File) r5)     // Catch:{ aayg -> 0x01ac }
            r6.i = r3     // Catch:{ aayg -> 0x01ac }
            boolean r3 = r1.b(r5)     // Catch:{ aayg -> 0x01ac }
            r6.e = r3     // Catch:{ aayg -> 0x01ac }
            if (r3 == 0) goto L_0x01ad
            java.lang.String r3 = r1.c(r5)     // Catch:{ aayg -> 0x01ac }
            r6.f = r3     // Catch:{ aayg -> 0x01ac }
            java.lang.String r3 = r6.f     // Catch:{ aayg -> 0x01ac }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ aayg -> 0x01ac }
            if (r3 != 0) goto L_0x01ad
            java.lang.String r3 = r6.f     // Catch:{ aayg -> 0x01ac }
            boolean r3 = r4.contains(r3)     // Catch:{ aayg -> 0x01ac }
            if (r3 != 0) goto L_0x01ad
            java.lang.String r3 = r6.f     // Catch:{ aayg -> 0x01ac }
            r4.add(r3)     // Catch:{ aayg -> 0x01ac }
            java.lang.String r3 = r6.f     // Catch:{ aayg -> 0x01ac }
            r2.offer(r3)     // Catch:{ aayg -> 0x01ac }
            goto L_0x01ad
        L_0x01ac:
            r3 = move-exception
        L_0x01ad:
            r0.add(r6)
            goto L_0x0145
        L_0x01b1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aayl.a():java.util.List");
    }
}
