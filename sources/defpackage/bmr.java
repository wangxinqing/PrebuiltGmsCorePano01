package defpackage;

/* renamed from: bmr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bmr extends bmq {
    public final String a;
    public final String b;

    public bmr(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0027=Splitter:B:11:0x0027, B:62:0x009f=Splitter:B:62:0x009f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.bmr a(java.lang.String r13) {
        /*
            java.lang.String r0 = "ChimeraModuleApk"
            java.lang.String r1 = "Failed parsing module.yaml from apk "
            r2 = 0
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x00cf }
            r3.<init>(r13)     // Catch:{ IOException -> 0x00cf }
            java.lang.String r4 = "assets/module.yaml"
            java.util.zip.ZipEntry r4 = r3.getEntry(r4)     // Catch:{ all -> 0x00c5 }
            if (r4 != 0) goto L_0x002b
            java.lang.String r4 = "assets/module.yaml not present in "
            java.lang.String r5 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x00c5 }
            int r6 = r5.length()     // Catch:{ all -> 0x00c5 }
            if (r6 != 0) goto L_0x0024
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x00c5 }
            r5.<init>(r4)     // Catch:{ all -> 0x00c5 }
            goto L_0x0027
        L_0x0024:
            r4.concat(r5)     // Catch:{ all -> 0x00c5 }
        L_0x0027:
            r3.close()     // Catch:{ IOException -> 0x00cf }
            return r2
        L_0x002b:
            java.io.InputStream r4 = r3.getInputStream(r4)     // Catch:{ all -> 0x00c5 }
            if (r4 == 0) goto L_0x0098
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x008e }
            r5.<init>(r4)     // Catch:{ all -> 0x008e }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x0084 }
            r6.<init>(r5)     // Catch:{ all -> 0x0084 }
            java.lang.String r7 = "^\\s*(.+?): \"(.*?)\"$"
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r7)     // Catch:{ all -> 0x007a }
            r8 = r2
            r9 = r8
        L_0x0043:
            java.lang.String r10 = r6.readLine()     // Catch:{ all -> 0x007a }
            if (r10 == 0) goto L_0x0073
            java.util.regex.Matcher r10 = r7.matcher(r10)     // Catch:{ all -> 0x007a }
            boolean r11 = r10.matches()     // Catch:{ all -> 0x007a }
            if (r11 == 0) goto L_0x0071
            r11 = 1
            java.lang.String r11 = r10.group(r11)     // Catch:{ all -> 0x007a }
            r12 = 2
            java.lang.String r10 = r10.group(r12)     // Catch:{ all -> 0x007a }
            java.lang.String r12 = "module_name"
            boolean r12 = r12.equals(r11)     // Catch:{ all -> 0x007a }
            if (r12 == 0) goto L_0x0067
            r9 = r10
            goto L_0x0072
        L_0x0067:
            java.lang.String r12 = "module_version"
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x007a }
            if (r11 == 0) goto L_0x0071
            r8 = r10
            goto L_0x0072
        L_0x0071:
        L_0x0072:
            goto L_0x0043
        L_0x0073:
            r6.close()     // Catch:{ all -> 0x0084 }
            r5.close()     // Catch:{ all -> 0x008e }
            goto L_0x009a
        L_0x007a:
            r7 = move-exception
            r6.close()     // Catch:{ all -> 0x007f }
            goto L_0x0083
        L_0x007f:
            r6 = move-exception
            defpackage.apev.a((java.lang.Throwable) r7, (java.lang.Throwable) r6)     // Catch:{ all -> 0x0084 }
        L_0x0083:
            throw r7     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r6 = move-exception
            r5.close()     // Catch:{ all -> 0x0089 }
            goto L_0x008d
        L_0x0089:
            r5 = move-exception
            defpackage.apev.a((java.lang.Throwable) r6, (java.lang.Throwable) r5)     // Catch:{ all -> 0x008e }
        L_0x008d:
            throw r6     // Catch:{ all -> 0x008e }
        L_0x008e:
            r5 = move-exception
            r4.close()     // Catch:{ all -> 0x0093 }
            goto L_0x0097
        L_0x0093:
            r4 = move-exception
            defpackage.apev.a((java.lang.Throwable) r5, (java.lang.Throwable) r4)     // Catch:{ all -> 0x00c5 }
        L_0x0097:
            throw r5     // Catch:{ all -> 0x00c5 }
        L_0x0098:
            r8 = r2
            r9 = r8
        L_0x009a:
            if (r4 == 0) goto L_0x009f
            r4.close()     // Catch:{ all -> 0x00c5 }
        L_0x009f:
            r3.close()     // Catch:{ IOException -> 0x00cf }
            if (r9 != 0) goto L_0x00a5
            goto L_0x00ad
        L_0x00a5:
            if (r8 == 0) goto L_0x00ad
            bmr r13 = new bmr
            r13.<init>(r9, r8)
            return r13
        L_0x00ad:
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r3 = r13.length()
            if (r3 != 0) goto L_0x00bd
            java.lang.String r13 = new java.lang.String
            r13.<init>(r1)
            goto L_0x00c1
        L_0x00bd:
            java.lang.String r13 = r1.concat(r13)
        L_0x00c1:
            android.util.Log.w(r0, r13)
            return r2
        L_0x00c5:
            r4 = move-exception
            r3.close()     // Catch:{ all -> 0x00ca }
            goto L_0x00ce
        L_0x00ca:
            r3 = move-exception
            defpackage.apev.a((java.lang.Throwable) r4, (java.lang.Throwable) r3)     // Catch:{ IOException -> 0x00cf }
        L_0x00ce:
            throw r4     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            r3 = move-exception
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r4 = r13.length()
            if (r4 != 0) goto L_0x00e0
            java.lang.String r13 = new java.lang.String
            r13.<init>(r1)
            goto L_0x00e4
        L_0x00e0:
            java.lang.String r13 = r1.concat(r13)
        L_0x00e4:
            android.util.Log.e(r0, r13, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmr.a(java.lang.String):bmr");
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return this.b;
    }
}
