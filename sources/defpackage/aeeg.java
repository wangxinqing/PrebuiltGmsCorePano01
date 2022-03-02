package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: aeeg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeeg {
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final AtomicBoolean e = new AtomicBoolean();
    static HashMap f;
    static final HashMap g = new HashMap();
    static final HashMap h = new HashMap();
    static final HashMap i = new HashMap();
    static final HashMap j = new HashMap();
    static String[] k = new String[0];
    private static Object l;
    private static boolean m;

    public static int a(ContentResolver contentResolver, String str, int i2) {
        Object a2 = a(contentResolver);
        Integer num = (Integer) a(h, str, (Object) Integer.valueOf(i2));
        if (num != null) {
            return num.intValue();
        }
        String a3 = a(contentResolver, str);
        if (a3 != null) {
            try {
                int parseInt = Integer.parseInt(a3);
                num = Integer.valueOf(parseInt);
                i2 = parseInt;
            } catch (NumberFormatException e2) {
            }
        }
        a(a2, h, str, num);
        return i2;
    }

    private static void b(ContentResolver contentResolver) {
        if (f == null) {
            e.set(false);
            f = new HashMap();
            l = new Object();
            m = false;
            contentResolver.registerContentObserver(a, true, new aeef());
        } else if (e.getAndSet(false)) {
            f.clear();
            g.clear();
            h.clear();
            i.clear();
            j.clear();
            l = new Object();
            m = false;
        }
    }

    private static void c(ContentResolver contentResolver, String[] strArr) {
        f.putAll(a(contentResolver, strArr));
        m = true;
    }

    public static void b(ContentResolver contentResolver, String... strArr) {
        String[] strArr2;
        if (r0 != 0) {
            synchronized (aeeg.class) {
                b(contentResolver);
                HashSet hashSet = new HashSet((((k.length + r0) * 4) / 3) + 1);
                hashSet.addAll(Arrays.asList(k));
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (hashSet.add(str)) {
                        arrayList.add(str);
                    }
                }
                if (!arrayList.isEmpty()) {
                    k = (String[]) hashSet.toArray(new String[hashSet.size()]);
                    strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                } else {
                    strArr2 = new String[0];
                }
                if (!m || f.isEmpty()) {
                    c(contentResolver, k);
                } else if (strArr2.length != 0) {
                    c(contentResolver, strArr2);
                }
            }
        }
    }

    public static long a(ContentResolver contentResolver, String str, long j2) {
        Object a2 = a(contentResolver);
        Long l2 = (Long) a(i, str, (Object) Long.valueOf(j2));
        if (l2 != null) {
            return l2.longValue();
        }
        String a3 = a(contentResolver, str);
        if (a3 != null) {
            try {
                long parseLong = Long.parseLong(a3);
                l2 = Long.valueOf(parseLong);
                j2 = parseLong;
            } catch (NumberFormatException e2) {
            }
        }
        a(a2, i, str, l2);
        return j2;
    }

    public static Object a(ContentResolver contentResolver) {
        Object obj;
        synchronized (aeeg.class) {
            b(contentResolver);
            obj = l;
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object a(java.util.HashMap r2, java.lang.String r3, java.lang.Object r4) {
        /*
            java.lang.Class<aeeg> r0 = defpackage.aeeg.class
            monitor-enter(r0)
            boolean r1 = r2.containsKey(r3)     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0014
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0017 }
            if (r2 == 0) goto L_0x0011
            r4 = r2
            goto L_0x0012
        L_0x0011:
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return r4
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            r2 = 0
            return r2
        L_0x0017:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeeg.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    @Deprecated
    public static String a(ContentResolver contentResolver, String str) {
        return a(contentResolver, str, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (f.isEmpty() != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        r8 = r8.query(a, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r9}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r8 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0063, code lost:
        if (r8.moveToFirst() == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        r0 = r8.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
        if (r0 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006f, code lost:
        if (r0.equals(r10) != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0072, code lost:
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0073, code lost:
        a(r1, r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0076, code lost:
        if (r0 != null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0079, code lost:
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007d, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        a(r1, r9, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0083, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0084, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0087, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0088, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0097, code lost:
        return r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.ContentResolver r8, java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.Class<aeeg> r0 = defpackage.aeeg.class
            monitor-enter(r0)
            b(r8)     // Catch:{ all -> 0x0098 }
            java.lang.Object r1 = l     // Catch:{ all -> 0x0098 }
            java.util.HashMap r2 = f     // Catch:{ all -> 0x0098 }
            boolean r2 = r2.containsKey(r9)     // Catch:{ all -> 0x0098 }
            if (r2 != 0) goto L_0x0089
            java.lang.String[] r2 = k     // Catch:{ all -> 0x0098 }
            int r3 = r2.length     // Catch:{ all -> 0x0098 }
            r4 = 0
            r5 = 0
        L_0x0015:
            if (r5 >= r3) goto L_0x004d
            r6 = r2[r5]     // Catch:{ all -> 0x0098 }
            boolean r6 = r9.startsWith(r6)     // Catch:{ all -> 0x0098 }
            if (r6 != 0) goto L_0x0022
            int r5 = r5 + 1
            goto L_0x0015
        L_0x0022:
            boolean r1 = m     // Catch:{ all -> 0x0098 }
            if (r1 != 0) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            java.util.HashMap r1 = f     // Catch:{ all -> 0x0098 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0098 }
            if (r1 == 0) goto L_0x004b
        L_0x002f:
            java.lang.String[] r1 = k     // Catch:{ all -> 0x0098 }
            c(r8, r1)     // Catch:{ all -> 0x0098 }
            java.util.HashMap r8 = f     // Catch:{ all -> 0x0098 }
            boolean r8 = r8.containsKey(r9)     // Catch:{ all -> 0x0098 }
            if (r8 == 0) goto L_0x004b
            java.util.HashMap r8 = f     // Catch:{ all -> 0x0098 }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ all -> 0x0098 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0098 }
            if (r8 == 0) goto L_0x0048
            r10 = r8
            goto L_0x0049
        L_0x0048:
        L_0x0049:
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            return r10
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            return r10
        L_0x004d:
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            android.net.Uri r3 = a
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]
            r6[r4] = r9
            r4 = 0
            r5 = 0
            r7 = 0
            r2 = r8
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)
            if (r8 == 0) goto L_0x0088
            boolean r2 = r8.moveToFirst()     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x007e
            java.lang.String r0 = r8.getString(r0)     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0073
            boolean r2 = r0.equals(r10)     // Catch:{ all -> 0x0083 }
            if (r2 != 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r0 = r10
        L_0x0073:
            a((java.lang.Object) r1, (java.lang.String) r9, (java.lang.String) r0)     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r10 = r0
        L_0x007a:
            r8.close()
            return r10
        L_0x007e:
            r0 = 0
            a((java.lang.Object) r1, (java.lang.String) r9, (java.lang.String) r0)     // Catch:{ all -> 0x0083 }
            goto L_0x007a
        L_0x0083:
            r9 = move-exception
            r8.close()
            throw r9
        L_0x0088:
            return r10
        L_0x0089:
            java.util.HashMap r8 = f     // Catch:{ all -> 0x0098 }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ all -> 0x0098 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0098 }
            if (r8 == 0) goto L_0x0095
            r10 = r8
            goto L_0x0096
        L_0x0095:
        L_0x0096:
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            return r10
        L_0x0098:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            goto L_0x009c
        L_0x009b:
            throw r8
        L_0x009c:
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeeg.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    public static Map a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(b, (String[]) null, (String) null, strArr, (String) null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    private static void a(Object obj, String str, String str2) {
        synchronized (aeeg.class) {
            if (obj == l) {
                f.put(str, str2);
            }
        }
    }

    private static void a(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (aeeg.class) {
            if (obj == l) {
                hashMap.put(str, obj2);
                f.remove(str);
            }
        }
    }

    public static boolean a(ContentResolver contentResolver, String str, boolean z) {
        Object a2 = a(contentResolver);
        Boolean bool = (Boolean) a(g, str, (Object) Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String a3 = a(contentResolver, str);
        if (a3 != null && !a3.equals("")) {
            if (c.matcher(a3).matches()) {
                bool = true;
                z = true;
            } else if (d.matcher(a3).matches()) {
                bool = false;
                z = false;
            } else {
                Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + a3 + "\") as boolean");
            }
        }
        a(a2, g, str, bool);
        return z;
    }
}
