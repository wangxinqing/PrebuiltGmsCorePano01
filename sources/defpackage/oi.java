package defpackage;

import android.graphics.PorterDuff;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: oi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class oi {
    private final LinkedHashMap a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public oi() {
        this(6);
    }

    public static int a(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }

    private final int c(Object obj, Object obj2) {
        int b2 = b(obj, obj2);
        if (b2 >= 0) {
            return b2;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    /* access modifiers changed from: protected */
    public void a(Object obj, Object obj2, Object obj3) {
    }

    /* access modifiers changed from: protected */
    public int b(Object obj, Object obj2) {
        return 1;
    }

    /* access modifiers changed from: protected */
    public Object c(Object obj) {
        return null;
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.g;
        i2 = this.h + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0)});
    }

    public oi(int i) {
        if (i > 0) {
            this.c = i;
            this.a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r4.e++;
        r1 = r4.a.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r1 != null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r4.b += c(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r4.a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r1 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        a(r4.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        a(r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        r0 = c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r0 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        monitor-enter(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0053
            monitor-enter(r4)
            java.util.LinkedHashMap r0 = r4.a     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0048
            int r0 = r4.h     // Catch:{ all -> 0x0050 }
            int r0 = r0 + 1
            r4.h = r0     // Catch:{ all -> 0x0050 }
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r4.c(r5)
            if (r0 == 0) goto L_0x0046
            monitor-enter(r4)
            int r1 = r4.e     // Catch:{ all -> 0x0043 }
            int r1 = r1 + 1
            r4.e = r1     // Catch:{ all -> 0x0043 }
            java.util.LinkedHashMap r1 = r4.a     // Catch:{ all -> 0x0043 }
            java.lang.Object r1 = r1.put(r5, r0)     // Catch:{ all -> 0x0043 }
            if (r1 != 0) goto L_0x0031
            int r2 = r4.b     // Catch:{ all -> 0x0043 }
            int r3 = r4.c(r5, r0)     // Catch:{ all -> 0x0043 }
            int r2 = r2 + r3
            r4.b = r2     // Catch:{ all -> 0x0043 }
            goto L_0x0036
        L_0x0031:
            java.util.LinkedHashMap r2 = r4.a     // Catch:{ all -> 0x0043 }
            r2.put(r5, r1)     // Catch:{ all -> 0x0043 }
        L_0x0036:
            monitor-exit(r4)     // Catch:{ all -> 0x0043 }
            if (r1 != 0) goto L_0x003f
            int r5 = r4.c
            r4.a((int) r5)
            return r0
        L_0x003f:
            r4.a(r5, r0, r1)
            return r1
        L_0x0043:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0043 }
            throw r5
        L_0x0046:
            r5 = 0
            return r5
        L_0x0048:
            int r5 = r4.g     // Catch:{ all -> 0x0050 }
            int r5 = r5 + 1
            r4.g = r5     // Catch:{ all -> 0x0050 }
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            return r0
        L_0x0050:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            throw r5
        L_0x0053:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi.a(java.lang.Object):java.lang.Object");
    }

    public final Object b(Object obj) {
        Object remove;
        if (obj != null) {
            synchronized (this) {
                remove = this.a.remove(obj);
                if (remove != null) {
                    this.b -= c(obj, remove);
                }
            }
            if (remove != null) {
                a(obj, remove, (Object) null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized Map b() {
        return new LinkedHashMap(this.a);
    }

    public final Object a(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.d++;
            this.b += c(obj, obj2);
            put = this.a.put(obj, obj2);
            if (put != null) {
                this.b -= c(obj, put);
            }
        }
        if (put != null) {
            a(obj, put, obj2);
        }
        a(this.c);
        return put;
    }

    public final void a() {
        a(-1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r0 = r4.b     // Catch:{ all -> 0x0070 }
            if (r0 < 0) goto L_0x0051
            java.util.LinkedHashMap r0 = r4.a     // Catch:{ all -> 0x0070 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0011
            int r0 = r4.b     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x0051
        L_0x0011:
            int r0 = r4.b     // Catch:{ all -> 0x0070 }
            if (r0 <= r5) goto L_0x004f
            java.util.LinkedHashMap r0 = r4.a     // Catch:{ all -> 0x0070 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x004f
            java.util.LinkedHashMap r0 = r4.a     // Catch:{ all -> 0x0070 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0070 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0070 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0070 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0070 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0070 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0070 }
            java.util.LinkedHashMap r2 = r4.a     // Catch:{ all -> 0x0070 }
            r2.remove(r1)     // Catch:{ all -> 0x0070 }
            int r2 = r4.b     // Catch:{ all -> 0x0070 }
            int r3 = r4.c(r1, r0)     // Catch:{ all -> 0x0070 }
            int r2 = r2 - r3
            r4.b = r2     // Catch:{ all -> 0x0070 }
            int r2 = r4.f     // Catch:{ all -> 0x0070 }
            int r2 = r2 + 1
            r4.f = r2     // Catch:{ all -> 0x0070 }
            monitor-exit(r4)     // Catch:{ all -> 0x0070 }
            r2 = 0
            r4.a(r1, r0, r2)
            goto L_0x0000
        L_0x004f:
            monitor-exit(r4)     // Catch:{ all -> 0x0070 }
            return
        L_0x0051:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0070 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r0.<init>()     // Catch:{ all -> 0x0070 }
            java.lang.Class r1 = r4.getClass()     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0070 }
            r0.append(r1)     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0070 }
            r5.<init>(r0)     // Catch:{ all -> 0x0070 }
            throw r5     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0070 }
            goto L_0x0074
        L_0x0073:
            throw r5
        L_0x0074:
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi.a(int):void");
    }
}
