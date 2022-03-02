package defpackage;

/* renamed from: adkf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adkf {
    private static final iwd c = adnt.c("SystemUpdatePolicyCompat");
    private static final adkf d = new adkf(0, Long.MAX_VALUE);
    public final int a;
    public final long b;

    private adkf(int i, long j) {
        this.a = i;
        this.b = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0098 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.adkf a(android.content.Context r11, long r12) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            boolean r2 = defpackage.ayox.e()
            if (r2 == 0) goto L_0x012f
            boolean r2 = defpackage.jkr.b()
            if (r2 == 0) goto L_0x012f
            java.lang.String r2 = "device_policy"
            java.lang.Object r11 = r11.getSystemService(r2)
            android.app.admin.DevicePolicyManager r11 = (android.app.admin.DevicePolicyManager) r11
            r2 = 0
            android.app.admin.SystemUpdatePolicy r11 = r11.getSystemUpdatePolicy()     // Catch:{ RuntimeException -> 0x0132 }
            if (r11 == 0) goto L_0x012f
            boolean r3 = defpackage.jkr.g()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 3
            r7 = 1
            if (r3 == 0) goto L_0x00ab
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "android.app.admin.SystemUpdatePolicy$InstallationOption"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ IllegalAccessException -> 0x008a, InvocationTargetException -> 0x0088, NoSuchMethodException -> 0x0086, ClassNotFoundException -> 0x0084 }
            java.lang.Class<android.app.admin.SystemUpdatePolicy> r8 = android.app.admin.SystemUpdatePolicy.class
            java.lang.Class[] r9 = new java.lang.Class[r7]     // Catch:{ IllegalAccessException -> 0x008a, InvocationTargetException -> 0x0088, NoSuchMethodException -> 0x0086, ClassNotFoundException -> 0x0084 }
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch:{ IllegalAccessException -> 0x008a, InvocationTargetException -> 0x0088, NoSuchMethodException -> 0x0086, ClassNotFoundException -> 0x0084 }
            r9[r2] = r10     // Catch:{ IllegalAccessException -> 0x008a, InvocationTargetException -> 0x0088, NoSuchMethodException -> 0x0086, ClassNotFoundException -> 0x0084 }
            java.lang.String r10 = "getInstallationOptionAt"
            java.lang.reflect.Method r8 = r8.getMethod(r10, r9)     // Catch:{ IllegalAccessException -> 0x008a, InvocationTargetException -> 0x0088, NoSuchMethodException -> 0x0086, ClassNotFoundException -> 0x0084 }
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ IllegalAccessException -> 0x008a, InvocationTargetException -> 0x0088, NoSuchMethodException -> 0x0086, ClassNotFoundException -> 0x0084 }
            java.lang.Long r9 = java.lang.Long.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x008a, InvocationTargetException -> 0x0088, NoSuchMethodException -> 0x0086, ClassNotFoundException -> 0x0084 }
            r7[r2] = r9     // Catch:{ IllegalAccessException -> 0x008a, InvocationTargetException -> 0x0088, NoSuchMethodException -> 0x0086, ClassNotFoundException -> 0x0084 }
            java.lang.Object r11 = r8.invoke(r11, r7)     // Catch:{ IllegalAccessException -> 0x008a, InvocationTargetException -> 0x0088, NoSuchMethodException -> 0x0086, ClassNotFoundException -> 0x0084 }
            if (r11 == 0) goto L_0x0081
            java.lang.String r7 = "getType"
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ IllegalAccessException -> 0x008a, InvocationTargetException -> 0x0088, NoSuchMethodException -> 0x0086, ClassNotFoundException -> 0x0084 }
            java.lang.reflect.Method r7 = r5.getMethod(r7, r8)     // Catch:{ IllegalAccessException -> 0x008a, InvocationTargetException -> 0x0088, NoSuchMethodException -> 0x0086, ClassNotFoundException -> 0x0084 }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x008a, InvocationTargetException -> 0x0088, NoSuchMethodException -> 0x0086, ClassNotFoundException -> 0x0084 }
            java.lang.Object r7 = r7.invoke(r11, r8)     // Catch:{ IllegalAccessException -> 0x008a, InvocationTargetException -> 0x0088, NoSuchMethodException -> 0x0086, ClassNotFoundException -> 0x0084 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ IllegalAccessException -> 0x008a, InvocationTargetException -> 0x0088, NoSuchMethodException -> 0x0086, ClassNotFoundException -> 0x0084 }
            java.lang.String r3 = "getEffectiveTime"
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ IllegalAccessException -> 0x007e, InvocationTargetException -> 0x007c, NoSuchMethodException -> 0x007a, ClassNotFoundException -> 0x0078 }
            java.lang.reflect.Method r3 = r5.getMethod(r3, r8)     // Catch:{ IllegalAccessException -> 0x007e, InvocationTargetException -> 0x007c, NoSuchMethodException -> 0x007a, ClassNotFoundException -> 0x0078 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x007e, InvocationTargetException -> 0x007c, NoSuchMethodException -> 0x007a, ClassNotFoundException -> 0x0078 }
            java.lang.Object r11 = r3.invoke(r11, r5)     // Catch:{ IllegalAccessException -> 0x007e, InvocationTargetException -> 0x007c, NoSuchMethodException -> 0x007a, ClassNotFoundException -> 0x0078 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ IllegalAccessException -> 0x007e, InvocationTargetException -> 0x007c, NoSuchMethodException -> 0x007a, ClassNotFoundException -> 0x0078 }
            r4 = r11
            goto L_0x0095
        L_0x0078:
            r11 = move-exception
            goto L_0x007f
        L_0x007a:
            r11 = move-exception
            goto L_0x007f
        L_0x007c:
            r11 = move-exception
            goto L_0x007f
        L_0x007e:
            r11 = move-exception
        L_0x007f:
            r3 = r7
            goto L_0x008b
        L_0x0081:
            adkf r11 = d     // Catch:{ IllegalAccessException -> 0x008a, InvocationTargetException -> 0x0088, NoSuchMethodException -> 0x0086, ClassNotFoundException -> 0x0084 }
            return r11
        L_0x0084:
            r11 = move-exception
            goto L_0x008b
        L_0x0086:
            r11 = move-exception
            goto L_0x008b
        L_0x0088:
            r11 = move-exception
            goto L_0x008b
        L_0x008a:
            r11 = move-exception
        L_0x008b:
            iwd r5 = c
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r7 = "Error getting installation option"
            r5.d(r7, r11, r2)
            r7 = r3
        L_0x0095:
            if (r7 != 0) goto L_0x0098
        L_0x0097:
            goto L_0x00a8
        L_0x0098:
            if (r4 == 0) goto L_0x0097
            adkf r11 = new adkf
            int r2 = r7.intValue()
            long r3 = r4.longValue()
            r11.<init>(r2, r3)
            goto L_0x0108
        L_0x00a8:
            adkf r11 = d
            return r11
        L_0x00ab:
            int r3 = r11.getPolicyType()
            if (r3 == r7) goto L_0x0103
            r8 = 2
            if (r3 == r8) goto L_0x00d9
            if (r3 == r6) goto L_0x00d3
            iwd r11 = c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 32
            r4.<init>(r5)
            java.lang.String r5 = "Unknown policy type: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r11.e(r3, r2)
            adkf r11 = d
            goto L_0x0108
        L_0x00d3:
            adkf r11 = new adkf
            r11.<init>(r6, r4)
            goto L_0x0108
        L_0x00d9:
            adkg r2 = new adkg
            int r3 = r11.getInstallWindowStart()
            long r3 = (long) r3
            int r11 = r11.getInstallWindowEnd()
            long r8 = (long) r11
            r2.<init>(r3, r8)
            boolean r11 = r2.a((long) r0)
            if (r11 == 0) goto L_0x00f8
            adkf r11 = new adkf
            long r2 = r2.c(r0)
            r11.<init>(r7, r2)
            goto L_0x0108
        L_0x00f8:
            adkf r11 = new adkf
            r3 = 4
            long r4 = r2.b(r0)
            r11.<init>(r3, r4)
            goto L_0x0108
        L_0x0103:
            adkf r11 = new adkf
            r11.<init>(r7, r4)
        L_0x0108:
            int r2 = r11.a
            if (r2 != r6) goto L_0x012e
            adjz r2 = defpackage.adke.h
            java.lang.Object r2 = r2.a()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x012c
            ayox r2 = defpackage.ayox.a
            ayoy r2 = r2.a()
            long r2 = r2.n()
            long r12 = r12 + r2
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x012e
            adkf r11 = d
            return r11
        L_0x012c:
            adkf r11 = d
        L_0x012e:
            return r11
        L_0x012f:
            adkf r11 = d
            return r11
        L_0x0132:
            r11 = move-exception
            iwd r11 = c
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.String r13 = "Error getting device policy. This might be WAI given that there is a bug in Android framework API."
            r11.d(r13, r12)
            adkf r11 = d
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adkf.a(android.content.Context, long):adkf");
    }
}
