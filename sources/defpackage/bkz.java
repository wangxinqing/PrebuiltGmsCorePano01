package defpackage;

/* renamed from: bkz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bkz {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        new java.lang.String("No default constructor, try Dagger injection for: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        "No default constructor, try Dagger injection for: ".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r5 = r5.getDeclaredMethod("provideInstance", new java.lang.Class[0]).invoke((java.lang.Object) null, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r5 = java.lang.String.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r5.length() == 0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        r5 = new java.lang.String("Can't find Chimera impl class ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        r5 = "Can't find Chimera impl class ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        android.util.Log.e("DaggerHelper", r5);
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3 = java.lang.String.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r3.length() == 0) goto L_0x001b;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036 A[ExcHandler: NoSuchMethodException | InvocationTargetException (e java.lang.Throwable), Splitter:B:1:0x0003] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040 A[ExcHandler: ClassNotFoundException (e java.lang.ClassNotFoundException), Splitter:B:1:0x0003] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object a(java.lang.ClassLoader r5, java.lang.String r6, java.lang.Class r7) {
        /*
            java.lang.String r0 = "DaggerHelper"
            r1 = 0
            java.lang.Class r5 = r5.loadClass(r6)     // Catch:{ ClassNotFoundException -> 0x0040, NoSuchMethodException -> 0x0038, InvocationTargetException -> 0x0036, IllegalAccessException -> 0x0034 }
            java.lang.Object r5 = r5.newInstance()     // Catch:{ InstantiationException -> 0x000e, IllegalAccessException -> 0x000c, ClassNotFoundException -> 0x0040, NoSuchMethodException -> 0x0038, InvocationTargetException -> 0x0036 }
            goto L_0x005b
        L_0x000c:
            r2 = move-exception
            goto L_0x000f
        L_0x000e:
            r2 = move-exception
        L_0x000f:
            java.lang.String r2 = "No default constructor, try Dagger injection for: "
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ ClassNotFoundException -> 0x0040, NoSuchMethodException -> 0x0038, InvocationTargetException -> 0x0036, IllegalAccessException -> 0x0034 }
            int r4 = r3.length()     // Catch:{ ClassNotFoundException -> 0x0040, NoSuchMethodException -> 0x0038, InvocationTargetException -> 0x0036, IllegalAccessException -> 0x0034 }
            if (r4 != 0) goto L_0x0021
            java.lang.String r3 = new java.lang.String     // Catch:{ ClassNotFoundException -> 0x0040, NoSuchMethodException -> 0x0038, InvocationTargetException -> 0x0036, IllegalAccessException -> 0x0034 }
            r3.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x0040, NoSuchMethodException -> 0x0038, InvocationTargetException -> 0x0036, IllegalAccessException -> 0x0034 }
            goto L_0x0024
        L_0x0021:
            r2.concat(r3)     // Catch:{ ClassNotFoundException -> 0x0040, NoSuchMethodException -> 0x0038, InvocationTargetException -> 0x0036, IllegalAccessException -> 0x0034 }
        L_0x0024:
            java.lang.String r2 = "provideInstance"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x0040, NoSuchMethodException -> 0x0038, InvocationTargetException -> 0x0036, IllegalAccessException -> 0x0034 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r2, r4)     // Catch:{ ClassNotFoundException -> 0x0040, NoSuchMethodException -> 0x0038, InvocationTargetException -> 0x0036, IllegalAccessException -> 0x0034 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x0040, NoSuchMethodException -> 0x0038, InvocationTargetException -> 0x0036, IllegalAccessException -> 0x0034 }
            java.lang.Object r5 = r5.invoke(r1, r2)     // Catch:{ ClassNotFoundException -> 0x0040, NoSuchMethodException -> 0x0038, InvocationTargetException -> 0x0036, IllegalAccessException -> 0x0034 }
            goto L_0x005b
        L_0x0034:
            r5 = move-exception
            goto L_0x0039
        L_0x0036:
            r5 = move-exception
            goto L_0x0039
        L_0x0038:
            r5 = move-exception
        L_0x0039:
            java.lang.String r2 = "Failed to instantiate Chimera impl"
            android.util.Log.e(r0, r2, r5)
            r5 = r1
            goto L_0x005b
        L_0x0040:
            r5 = move-exception
            java.lang.String r5 = java.lang.String.valueOf(r6)
            java.lang.String r2 = "Can't find Chimera impl class "
            int r3 = r5.length()
            if (r3 != 0) goto L_0x0053
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
            goto L_0x0057
        L_0x0053:
            java.lang.String r5 = r2.concat(r5)
        L_0x0057:
            android.util.Log.e(r0, r5)
            r5 = r1
        L_0x005b:
            java.lang.Object r5 = r7.cast(r5)     // Catch:{ ClassCastException -> 0x0060 }
            return r5
        L_0x0060:
            r5 = move-exception
            java.lang.String r7 = java.lang.String.valueOf(r6)
            int r7 = r7.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r7 = r7 + 44
            r2.<init>(r7)
            java.lang.String r7 = "Chimera impl "
            r2.append(r7)
            r2.append(r6)
            java.lang.String r6 = " is not with the expected type."
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            android.util.Log.e(r0, r6, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkz.a(java.lang.ClassLoader, java.lang.String, java.lang.Class):java.lang.Object");
    }
}
