package defpackage;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* renamed from: bof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bof extends ClassLoader {
    private static final Method d = a(ClassLoader.class, "getPackage", String.class);
    private static final Method e = a(ClassLoader.class, "getPackages", new Class[0]);
    private static final double f = Math.log(2.0d);
    private static final ClassLoader g = a();
    private static final Package[] j = new Package[0];
    final ClassLoader a;
    final String[] b;
    final String[] c;
    private final ClassLoader h;
    private final oi i;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.String[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050 A[LOOP:0: B:19:0x0044->B:23:0x0050, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f A[LOOP:1: B:25:0x0055->B:28:0x005f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bof(java.lang.ClassLoader r6, java.lang.ClassLoader r7, boolean r8, java.lang.String[] r9) {
        /*
            r5 = this;
            r5.<init>(r6)
            r0 = 1
            r1 = 0
            if (r7 != 0) goto L_0x0014
            defpackage.amrl.a((java.lang.Object) r6)
            java.lang.ClassLoader r2 = g
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0014
            r2 = 0
            goto L_0x0015
        L_0x0014:
            r2 = 1
        L_0x0015:
            defpackage.amrl.a((boolean) r2)
            r5.h = r6
            if (r7 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            java.lang.ClassLoader r7 = g
        L_0x001f:
            r5.a = r7
            boolean r6 = r7.equals(r6)
            r6 = r6 ^ r0
            defpackage.amrl.a((boolean) r6)
            if (r9 == 0) goto L_0x0030
            int r6 = r9.length
            if (r6 <= 0) goto L_0x0030
            r6 = 1
            goto L_0x0031
        L_0x0030:
            r6 = 0
        L_0x0031:
            defpackage.amrl.a((boolean) r6)
            int r6 = r9.length
            if (r8 == 0) goto L_0x003f
            java.lang.Object r7 = r9.clone()
            r9 = r7
            java.lang.String[] r9 = (java.lang.String[]) r9
            goto L_0x0040
        L_0x003f:
        L_0x0040:
            java.util.Arrays.sort(r9)
            r7 = 0
        L_0x0044:
            java.lang.String r8 = "!"
            if (r7 >= r6) goto L_0x0053
            r2 = r9[r7]
            boolean r2 = r2.startsWith(r8)
            if (r2 != 0) goto L_0x0054
            int r7 = r7 + 1
            goto L_0x0044
        L_0x0053:
        L_0x0054:
            r2 = r7
        L_0x0055:
            if (r2 >= r6) goto L_0x006a
            r3 = r9[r2]
            boolean r3 = r3.startsWith(r8)
            if (r3 == 0) goto L_0x006a
            r3 = r9[r2]
            java.lang.String r3 = r3.substring(r0)
            r9[r2] = r3
            int r2 = r2 + 1
            goto L_0x0055
        L_0x006a:
            int r2 = r2 - r7
            if (r2 != 0) goto L_0x0070
            java.lang.String[] r7 = new java.lang.String[r1]
            goto L_0x008e
        L_0x0070:
            if (r2 == r6) goto L_0x0089
            java.lang.String[] r8 = new java.lang.String[r2]
            int r0 = r6 - r2
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.System.arraycopy(r9, r7, r8, r1, r2)
            if (r7 <= 0) goto L_0x0080
            java.lang.System.arraycopy(r9, r1, r0, r1, r7)
        L_0x0080:
            int r2 = r2 + r7
            int r1 = r6 - r2
            java.lang.System.arraycopy(r9, r2, r0, r7, r1)
            r7 = r8
            r9 = r0
            goto L_0x008e
        L_0x0089:
            java.lang.String[] r7 = new java.lang.String[r1]
            r4 = r9
            r9 = r7
            r7 = r4
        L_0x008e:
            r5.b = r9
            r5.c = r7
            double r6 = (double) r6
            double r6 = java.lang.Math.log(r6)
            double r8 = f
            double r6 = r6 / r8
            long r6 = java.lang.Math.round(r6)
            int r7 = (int) r6
            r6 = 3
            if (r7 < r6) goto L_0x00ae
            oi r6 = new oi
            r8 = 8
            int r7 = java.lang.Math.min(r8, r7)
            r6.<init>(r7)
            goto L_0x00af
        L_0x00ae:
            r6 = 0
        L_0x00af:
            r5.i = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bof.<init>(java.lang.ClassLoader, java.lang.ClassLoader, boolean, java.lang.String[]):void");
    }

    public static ClassLoader a() {
        ClassLoader classLoader;
        try {
            classLoader = ClassLoader.getSystemClassLoader();
        } catch (SecurityException e2) {
            classLoader = null;
        }
        if (classLoader == null) {
            try {
                classLoader = bof.class.getClassLoader();
                if (classLoader == null) {
                    throw new NullPointerException("ClassLoader is null");
                }
            } catch (NullPointerException | SecurityException e3) {
                throw ((AssertionError) new AssertionError("Cannot access own ClassLoader").initCause(e3));
            }
        }
        while (true) {
            try {
                ClassLoader parent = classLoader.getParent();
                if (parent == null) {
                    break;
                }
                classLoader = parent;
            } catch (SecurityException e4) {
            }
        }
        return classLoader;
    }

    private static String b(String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + str2.length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final Package getPackage(String str) {
        if (str.startsWith("java.")) {
            return super.getPackage(str);
        }
        if (a(str, true)) {
            ClassLoader classLoader = this.h;
            if (classLoader == null) {
                return super.getPackage(str);
            }
            return (Package) a(d, (Object) classLoader, str);
        }
        return (Package) a(d, (Object) this.a, str);
    }

    /* access modifiers changed from: protected */
    public final Package[] getPackages() {
        int i2;
        int i3;
        ClassLoader classLoader = this.h;
        Package[] packages = classLoader != null ? (Package[]) a(e, (Object) classLoader, new Object[0]) : super.getPackages();
        Package[] packageArr = (Package[]) a(e, (Object) this.a, new Object[0]);
        if (packages != null) {
            i2 = packages.length;
        } else {
            i2 = 0;
        }
        if (packageArr != null) {
            i3 = packageArr.length;
        } else {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return j;
        }
        Map a2 = qug.a.a(Math.min(i2, this.b.length * 3) + i3);
        if (packageArr != null) {
            for (int i4 = 0; i4 < i3; i4++) {
                Package packageR = packageArr[i4];
                if (!packageR.getName().startsWith("java.")) {
                    a2.put(packageR.getName(), packageR);
                }
            }
        }
        if (packages != null) {
            for (int i5 = 0; i5 < i2; i5++) {
                Package packageR2 = packages[i5];
                if (packageR2.getName().startsWith("java.") || a(packageR2.getName(), true)) {
                    a2.put(packageR2.getName(), packageR2);
                }
            }
        }
        Collection values = a2.values();
        return (Package[]) values.toArray(new Package[values.size()]);
    }

    /* access modifiers changed from: protected */
    public final Class loadClass(String str, boolean z) {
        Class<?> cls;
        if (str.startsWith("java.")) {
            cls = g.loadClass(str);
        } else if (!a(str, false)) {
            cls = this.a.loadClass(str);
        } else {
            ClassLoader classLoader = this.h;
            if (classLoader == null) {
                classLoader = g;
            }
            cls = classLoader.loadClass(str);
        }
        if (z) {
            resolveClass(cls);
        }
        return cls;
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object a(java.lang.reflect.Method r3, java.lang.Object r4, java.lang.Object... r5) {
        /*
            java.lang.String r0 = "Error calling method "
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch:{ IllegalAccessException -> 0x004b, IllegalArgumentException -> 0x0049, InvocationTargetException -> 0x0007 }
            return r3
        L_0x0007:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r4 = r5
        L_0x0010:
            boolean r5 = r4 instanceof java.lang.Error
            if (r5 == 0) goto L_0x0018
            java.lang.Error r4 = (java.lang.Error) r4
            throw r4
        L_0x0018:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = java.lang.String.valueOf(r3)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 21
            r2.<init>(r1)
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            java.lang.String r0 = r4.getMessage()
            java.lang.String r3 = b(r3, r0)
            r5.<init>(r3)
            java.lang.Throwable r3 = r5.initCause(r4)
            java.lang.AssertionError r3 = (java.lang.AssertionError) r3
            throw r3
        L_0x0049:
            r4 = move-exception
            goto L_0x004c
        L_0x004b:
            r4 = move-exception
        L_0x004c:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r5 = r5 + 21
            r1.<init>(r5)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r5 = r4.getMessage()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            if (r5 != 0) goto L_0x0072
            goto L_0x0076
        L_0x0072:
            java.lang.String r3 = b(r5, r3)
        L_0x0076:
            r0.<init>(r3)
            java.lang.Throwable r3 = r0.initCause(r4)
            java.lang.AssertionError r3 = (java.lang.AssertionError) r3
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bof.a(java.lang.reflect.Method, java.lang.Object, java.lang.Object[]):java.lang.Object");
    }

    private static final String a(String str, String str2, boolean z) {
        if (a(str, str2)) {
            return str2;
        }
        if (!z || !a(str2, str)) {
            return null;
        }
        return str;
    }

    private static final String a(String[] strArr, String str, boolean z) {
        String str2;
        int length = strArr.length;
        if (length != 1) {
            if (length != 2) {
                int binarySearch = Arrays.binarySearch(strArr, str);
                if (binarySearch >= 0) {
                    return strArr[binarySearch];
                }
                int i2 = -(binarySearch + 1);
                if (i2 > 0) {
                    str2 = a(str, strArr[i2 - 1], z);
                } else {
                    str2 = null;
                }
                return (str2 != null || !z || i2 >= length) ? str2 : a(str, strArr[i2], true);
            }
            String a2 = a(str, strArr[1], z);
            if (a2 != null) {
                return a2;
            }
        }
        return a(str, strArr[0], z);
    }

    private static Method a(Class cls, String str, Class... clsArr) {
        String str2 = "()";
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            try {
                declaredMethod.setAccessible(true);
            } catch (SecurityException e2) {
                String name = cls.getName();
                if (clsArr.length != 0) {
                    str2 = "(...)";
                }
                int length = String.valueOf(name).length();
                StringBuilder sb = new StringBuilder(length + 36 + str.length() + str2.length());
                sb.append("Unable to set method ");
                sb.append(name);
                sb.append(".");
                sb.append(str);
                sb.append(str2);
                sb.append(" as accessable");
                Log.w("ChimeraFiltCL", sb.toString(), e2);
            }
            return declaredMethod;
        } catch (NoSuchMethodException | SecurityException e3) {
            String name2 = cls.getName();
            if (clsArr.length != 0) {
                str2 = "(...)";
            }
            int length2 = String.valueOf(name2).length();
            StringBuilder sb2 = new StringBuilder(length2 + 2 + str.length() + str2.length());
            sb2.append(name2);
            sb2.append(": ");
            sb2.append(str);
            sb2.append(str2);
            throw ((NoSuchMethodError) new NoSuchMethodError(b(sb2.toString(), e3.getMessage())).initCause(e3));
        }
    }

    private static boolean a(String str, String str2) {
        if (str2.length() == 0) {
            return true;
        }
        if (!str.startsWith(str2)) {
            return false;
        }
        if (str.length() == str2.length() || str.charAt(str2.length()) == '.' || str.charAt(str2.length()) == '$') {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, boolean z) {
        int i2;
        String a2;
        Boolean bool;
        oi oiVar = this.i;
        if (!(oiVar == null || (bool = (Boolean) oiVar.a((Object) str)) == null)) {
            if (!z) {
                return bool.booleanValue();
            }
            if (bool.booleanValue()) {
                return true;
            }
        }
        String[] strArr = this.b;
        int i3 = -1;
        boolean z2 = false;
        if (strArr.length != 0) {
            String a3 = a(strArr, str, z);
            i2 = a3 != null ? a3.length() : -1;
        } else {
            i2 = 0;
        }
        String[] strArr2 = this.c;
        if (!(strArr2.length == 0 || (a2 = a(strArr2, str, false)) == null)) {
            i3 = a2.length();
        }
        if (i2 > i3) {
            z2 = true;
        }
        if (z2 && z && i2 > str.length()) {
            return true;
        }
        oi oiVar2 = this.i;
        if (oiVar2 != null) {
            oiVar2.a((Object) str, (Object) Boolean.valueOf(z2));
        }
        return z2;
    }
}
