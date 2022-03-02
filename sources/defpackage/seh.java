package defpackage;

/* renamed from: seh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class seh {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        if (r6.equals(".") != false) goto L_0x007a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x004c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.net.Uri r13, android.content.Context r14) {
        /*
            defpackage.ahab.a((android.content.Context) r14)
            defpackage.ahab.a((android.net.Uri) r13)
            java.lang.String r14 = r13.getAuthority()
            java.lang.String r0 = "com.google.android.gms"
            boolean r14 = android.text.TextUtils.equals(r14, r0)
            if (r14 == 0) goto L_0x014a
            java.lang.String r14 = r13.getFragment()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto L_0x0125
            android.net.Uri r14 = r13.normalizeScheme()
            android.net.Uri$Builder r14 = r14.buildUpon()
            java.lang.String r0 = r13.getPath()
            defpackage.amrl.a((java.lang.Object) r0)
            int r1 = r0.length()
            java.lang.String r2 = "/"
            java.lang.String r3 = "."
            if (r1 == 0) goto L_0x00f0
            r1 = 47
            amsk r4 = defpackage.amsk.a((char) r1)
            amsk r4 = r4.a()
            java.lang.Iterable r4 = r4.a((java.lang.CharSequence) r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x004c:
            boolean r6 = r4.hasNext()
            r7 = 0
            if (r6 == 0) goto L_0x00a7
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            int r8 = r6.hashCode()
            r9 = 46
            r10 = 1
            java.lang.String r11 = ".."
            r12 = -1
            if (r8 == r9) goto L_0x0072
            r7 = 1472(0x5c0, float:2.063E-42)
            if (r8 == r7) goto L_0x006a
            goto L_0x0079
        L_0x006a:
            boolean r7 = r6.equals(r11)
            if (r7 == 0) goto L_0x0079
            r7 = 1
            goto L_0x007a
        L_0x0072:
            boolean r8 = r6.equals(r3)
            if (r8 == 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r7 = -1
        L_0x007a:
            if (r7 == 0) goto L_0x004c
            if (r7 == r10) goto L_0x0082
            r5.add(r6)
            goto L_0x004c
        L_0x0082:
            int r6 = r5.size()
            if (r6 <= 0) goto L_0x00a3
            int r6 = r5.size()
            int r6 = r6 + r12
            java.lang.Object r6 = r5.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = r6.equals(r11)
            if (r6 == 0) goto L_0x009a
            goto L_0x00a3
        L_0x009a:
            int r6 = r5.size()
            int r6 = r6 + r12
            r5.remove(r6)
            goto L_0x004c
        L_0x00a3:
            r5.add(r11)
            goto L_0x004c
        L_0x00a7:
            amre r4 = defpackage.amre.a((char) r1)
            java.lang.String r4 = r4.a((java.lang.Iterable) r5)
            char r0 = r0.charAt(r7)
            if (r0 != r1) goto L_0x00ca
            java.lang.String r0 = java.lang.String.valueOf(r4)
            int r1 = r0.length()
            if (r1 != 0) goto L_0x00c6
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2)
            goto L_0x00ca
        L_0x00c6:
            java.lang.String r4 = r2.concat(r0)
        L_0x00ca:
            java.lang.String r0 = "/../"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x00d9
            r0 = 3
            java.lang.String r4 = r4.substring(r0)
            goto L_0x00ca
        L_0x00d9:
            java.lang.String r0 = "/.."
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00e3
            goto L_0x00f1
        L_0x00e3:
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00ee
            r2 = r3
            goto L_0x00f1
        L_0x00ee:
            r2 = r4
            goto L_0x00f1
        L_0x00f0:
            r2 = r3
        L_0x00f1:
            android.net.Uri$Builder r14 = r14.path(r2)
            android.net.Uri r14 = r14.build()
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x0100
            return
        L_0x0100:
            ahbk r14 = new ahbk
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 35
            r1.<init>(r0)
            java.lang.String r0 = "Potential path traversal detected: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r14.<init>((java.lang.String) r13)
            throw r14
        L_0x0125:
            ahbk r14 = new ahbk
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 30
            r1.<init>(r0)
            java.lang.String r0 = "Fragment not supported (yet): "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r14.<init>((java.lang.String) r13)
            throw r14
        L_0x014a:
            ahbk r14 = new ahbk
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 53
            r1.<init>(r0)
            java.lang.String r0 = "Expected uri package to be [com.google.android.gms]: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r14.<init>((java.lang.String) r13)
            goto L_0x0170
        L_0x016f:
            throw r14
        L_0x0170:
            goto L_0x016f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.seh.a(android.net.Uri, android.content.Context):void");
    }
}
