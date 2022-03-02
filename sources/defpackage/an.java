package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: an  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class an {
    private static final Map a = new HashMap();
    private static final Map b = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        if (r5.booleanValue() == false) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(java.lang.Class r10) {
        /*
            java.lang.String r0 = "."
            java.util.Map r1 = a
            java.lang.Object r1 = r1.get(r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L_0x0131
            java.lang.String r1 = r10.getCanonicalName()
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0126
            r1 = 0
            r4 = 0
            java.lang.Package r5 = r10.getPackage()     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            java.lang.String r6 = r10.getCanonicalName()     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            if (r5 != 0) goto L_0x0023
            java.lang.String r5 = ""
            goto L_0x0027
        L_0x0023:
            java.lang.String r5 = r5.getName()     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
        L_0x0027:
            boolean r7 = r5.isEmpty()     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            if (r7 == 0) goto L_0x002e
            goto L_0x0037
        L_0x002e:
            int r7 = r5.length()     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            int r7 = r7 + r3
            java.lang.String r6 = r6.substring(r7)     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
        L_0x0037:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            r7.<init>()     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            java.lang.String r8 = "_"
            java.lang.String r6 = r6.replace(r0, r8)     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            r7.append(r6)     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            java.lang.String r6 = "_LifecycleAdapter"
            r7.append(r6)     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            java.lang.String r6 = r7.toString()     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            boolean r7 = r5.isEmpty()     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            if (r7 != 0) goto L_0x0067
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            r7.<init>()     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            r7.append(r5)     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            r7.append(r0)     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            r7.append(r6)     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            java.lang.String r6 = r7.toString()     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            goto L_0x0068
        L_0x0067:
        L_0x0068:
            java.lang.Class r0 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            r5[r4] = r10     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r5)     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            boolean r5 = r0.isAccessible()     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            if (r5 == 0) goto L_0x007b
            goto L_0x0089
        L_0x007b:
            r0.setAccessible(r3)     // Catch:{ ClassNotFoundException -> 0x0087, NoSuchMethodException -> 0x0080 }
            goto L_0x0089
        L_0x0080:
            r10 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r10)
            throw r0
        L_0x0087:
            r0 = move-exception
            r0 = r1
        L_0x0089:
            if (r0 != 0) goto L_0x011c
            s r0 = defpackage.s.a
            java.util.Map r5 = r0.b
            java.lang.Object r5 = r5.get(r10)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L_0x00a1
            boolean r0 = r5.booleanValue()
            if (r0 != 0) goto L_0x009e
            goto L_0x00c7
        L_0x009e:
            r2 = 1
            goto L_0x0127
        L_0x00a1:
            java.lang.reflect.Method[] r5 = r0.a(r10)
            int r6 = r5.length
            r7 = 0
        L_0x00a7:
            if (r7 >= r6) goto L_0x00be
            r8 = r5[r7]
            java.lang.Class<android.arch.lifecycle.OnLifecycleEvent> r9 = android.arch.lifecycle.OnLifecycleEvent.class
            java.lang.annotation.Annotation r8 = r8.getAnnotation(r9)
            android.arch.lifecycle.OnLifecycleEvent r8 = (android.arch.lifecycle.OnLifecycleEvent) r8
            if (r8 == 0) goto L_0x00bb
            r0.a(r10, r5)
            r2 = 1
            goto L_0x0127
        L_0x00bb:
            int r7 = r7 + 1
            goto L_0x00a7
        L_0x00be:
            java.util.Map r0 = r0.b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            r0.put(r10, r5)
        L_0x00c7:
            java.lang.Class r0 = r10.getSuperclass()
            boolean r5 = b(r0)
            if (r5 == 0) goto L_0x00e5
            int r1 = a((java.lang.Class) r0)
            if (r1 == r3) goto L_0x009e
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Map r5 = b
            java.lang.Object r0 = r5.get(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r1.<init>(r0)
            goto L_0x00e6
        L_0x00e5:
        L_0x00e6:
            java.lang.Class[] r0 = r10.getInterfaces()
            int r5 = r0.length
        L_0x00eb:
            if (r4 >= r5) goto L_0x0114
            r6 = r0[r4]
            boolean r7 = b(r6)
            if (r7 != 0) goto L_0x00f6
            goto L_0x0111
        L_0x00f6:
            int r7 = a((java.lang.Class) r6)
            if (r7 != r3) goto L_0x00fe
            r2 = 1
            goto L_0x0127
        L_0x00fe:
            if (r1 == 0) goto L_0x0101
            goto L_0x0106
        L_0x0101:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0106:
            java.util.Map r7 = b
            java.lang.Object r6 = r7.get(r6)
            java.util.Collection r6 = (java.util.Collection) r6
            r1.addAll(r6)
        L_0x0111:
            int r4 = r4 + 1
            goto L_0x00eb
        L_0x0114:
            if (r1 == 0) goto L_0x009e
            java.util.Map r0 = b
            r0.put(r10, r1)
            goto L_0x0127
        L_0x011c:
            java.util.Map r1 = b
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.put(r10, r0)
            goto L_0x0127
        L_0x0126:
            r2 = 1
        L_0x0127:
            java.util.Map r0 = a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.put(r10, r1)
            return r2
        L_0x0131:
            int r10 = r1.intValue()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an.a(java.lang.Class):int");
    }

    private static boolean b(Class cls) {
        return cls != null && ai.class.isAssignableFrom(cls);
    }

    private static ab a(Constructor constructor, Object obj) {
        try {
            return (ab) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    static ah a(Object obj) {
        boolean z = obj instanceof ah;
        boolean z2 = obj instanceof z;
        if (z && z2) {
            return new aa((z) obj, (ah) obj);
        }
        if (z2) {
            return new aa((z) obj, (ah) null);
        }
        if (z) {
            return (ah) obj;
        }
        Class<?> cls = obj.getClass();
        if (a((Class) cls) != 2) {
            return new bd(obj);
        }
        List list = (List) b.get(cls);
        if (list.size() == 1) {
            return new bg(a((Constructor) list.get(0), obj));
        }
        ab[] abVarArr = new ab[list.size()];
        for (int i = 0; i < list.size(); i++) {
            abVarArr[i] = a((Constructor) list.get(i), obj);
        }
        return new t(abVarArr);
    }
}
