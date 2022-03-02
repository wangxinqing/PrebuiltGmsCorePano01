package defpackage;

/* renamed from: bok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bok {
    public static int a(boz boz, String str) {
        bpa a = boz.a(str);
        if (a != null) {
            return a.e();
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r11, defpackage.boz r12, defpackage.bpa r13, java.lang.String r14, int r15, int r16) {
        /*
            java.lang.String r1 = "DowngradeHelper"
            java.lang.String r0 = java.lang.String.valueOf(r14)
            int r2 = r0.length()
            java.lang.String r3 = "Calling downgrade handler: "
            if (r2 != 0) goto L_0x0014
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            goto L_0x0017
        L_0x0014:
            r3.concat(r0)
        L_0x0017:
            boo r4 = defpackage.boo.a()     // Catch:{ InvalidConfigException -> 0x00b0, bop -> 0x00ae }
            defpackage.bkn.b()     // Catch:{ InvalidConfigException -> 0x00b0, bop -> 0x00ae }
            boolean r8 = defpackage.hei.b()     // Catch:{ InvalidConfigException -> 0x00b0, bop -> 0x00ae }
            defpackage.bkn.b()     // Catch:{ InvalidConfigException -> 0x00b0, bop -> 0x00ae }
            boolean r9 = defpackage.hei.i()     // Catch:{ InvalidConfigException -> 0x00b0, bop -> 0x00ae }
            defpackage.bkn.b()     // Catch:{ InvalidConfigException -> 0x00b0, bop -> 0x00ae }
            boolean r10 = defpackage.hei.c()     // Catch:{ InvalidConfigException -> 0x00b0, bop -> 0x00ae }
            r5 = r11
            r6 = r12
            r7 = r13
            android.content.Context r0 = r4.a((android.content.Context) r5, (defpackage.boz) r6, (defpackage.bpa) r7, (boolean) r8, (boolean) r9, (boolean) r10)     // Catch:{ InvalidConfigException -> 0x00b0, bop -> 0x00ae }
            java.lang.ClassLoader r2 = r0.getClassLoader()     // Catch:{ InvalidConfigException -> 0x0092, NoSuchMethodException -> 0x0090, InstantiationException -> 0x008e, ClassNotFoundException -> 0x008c, IllegalAccessException -> 0x008a, InvocationTargetException -> 0x0088 }
            r3 = r14
            java.lang.Class r2 = r2.loadClass(r14)     // Catch:{ InvalidConfigException -> 0x0086, NoSuchMethodException -> 0x0084, InstantiationException -> 0x0082, ClassNotFoundException -> 0x0080, IllegalAccessException -> 0x007e, InvocationTargetException -> 0x007c }
            java.lang.Class<com.google.android.chimera.config.ModuleDowngradeHandler> r4 = com.google.android.chimera.config.ModuleDowngradeHandler.class
            java.lang.Class r2 = r2.asSubclass(r4)     // Catch:{ InvalidConfigException -> 0x0086, NoSuchMethodException -> 0x0084, InstantiationException -> 0x0082, ClassNotFoundException -> 0x0080, IllegalAccessException -> 0x007e, InvocationTargetException -> 0x007c }
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ InvalidConfigException -> 0x0086, NoSuchMethodException -> 0x0084, InstantiationException -> 0x0082, ClassNotFoundException -> 0x0080, IllegalAccessException -> 0x007e, InvocationTargetException -> 0x007c }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r5)     // Catch:{ InvalidConfigException -> 0x0086, NoSuchMethodException -> 0x0084, InstantiationException -> 0x0082, ClassNotFoundException -> 0x0080, IllegalAccessException -> 0x007e, InvocationTargetException -> 0x007c }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ InvalidConfigException -> 0x0086, NoSuchMethodException -> 0x0084, InstantiationException -> 0x0082, ClassNotFoundException -> 0x0080, IllegalAccessException -> 0x007e, InvocationTargetException -> 0x007c }
            java.lang.Object r2 = r2.newInstance(r4)     // Catch:{ InvalidConfigException -> 0x0086, NoSuchMethodException -> 0x0084, InstantiationException -> 0x0082, ClassNotFoundException -> 0x0080, IllegalAccessException -> 0x007e, InvocationTargetException -> 0x007c }
            com.google.android.chimera.config.ModuleDowngradeHandler r2 = (com.google.android.chimera.config.ModuleDowngradeHandler) r2     // Catch:{ InvalidConfigException -> 0x0086, NoSuchMethodException -> 0x0084, InstantiationException -> 0x0082, ClassNotFoundException -> 0x0080, IllegalAccessException -> 0x007e, InvocationTargetException -> 0x007c }
            r3 = r15
            r4 = r16
            r2.prepareForDowngrade(r0, r15, r4)     // Catch:{ Exception -> 0x005c }
            return
        L_0x005c:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = r13.b()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "Failed to execute downgrade handler for "
            int r4 = r0.length()
            if (r4 != 0) goto L_0x0074
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            goto L_0x0078
        L_0x0074:
            java.lang.String r0 = r3.concat(r0)
        L_0x0078:
            android.util.Log.e(r1, r0, r2)
            return
        L_0x007c:
            r0 = move-exception
            goto L_0x0094
        L_0x007e:
            r0 = move-exception
            goto L_0x0094
        L_0x0080:
            r0 = move-exception
            goto L_0x0094
        L_0x0082:
            r0 = move-exception
            goto L_0x0094
        L_0x0084:
            r0 = move-exception
            goto L_0x0094
        L_0x0086:
            r0 = move-exception
            goto L_0x0094
        L_0x0088:
            r0 = move-exception
            goto L_0x0093
        L_0x008a:
            r0 = move-exception
            goto L_0x0093
        L_0x008c:
            r0 = move-exception
            goto L_0x0093
        L_0x008e:
            r0 = move-exception
            goto L_0x0093
        L_0x0090:
            r0 = move-exception
            goto L_0x0093
        L_0x0092:
            r0 = move-exception
        L_0x0093:
            r3 = r14
        L_0x0094:
            java.lang.String r2 = java.lang.String.valueOf(r14)
            java.lang.String r3 = "Failed to create downgrade handler instance for "
            int r4 = r2.length()
            if (r4 != 0) goto L_0x00a6
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
            goto L_0x00aa
        L_0x00a6:
            java.lang.String r2 = r3.concat(r2)
        L_0x00aa:
            android.util.Log.e(r1, r2, r0)
            return
        L_0x00ae:
            r0 = move-exception
            goto L_0x00b1
        L_0x00b0:
            r0 = move-exception
        L_0x00b1:
            java.lang.String r2 = r13.b()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Failed to load downgrade handler for "
            int r4 = r2.length()
            if (r4 != 0) goto L_0x00c7
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
            goto L_0x00cb
        L_0x00c7:
            java.lang.String r2 = r3.concat(r2)
        L_0x00cb:
            android.util.Log.e(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bok.a(android.content.Context, boz, bpa, java.lang.String, int, int):void");
    }
}
