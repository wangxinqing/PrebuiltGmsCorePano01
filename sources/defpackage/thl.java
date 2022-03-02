package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: thl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class thl {
    private static final Object a = new Object();
    private final Context b;
    private final String c;
    private final Map d = new HashMap();
    private final ArrayList e = new ArrayList();

    public static Object a(Context context, Class cls) {
        thl a2 = a(context);
        if (a2 != null) {
            return a2.a(cls);
        }
        String valueOf = String.valueOf(context);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("No locator found in context ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    public static Object b(Context context, Class cls) {
        thl a2 = a(context);
        if (a2 != null) {
            return a2.b(cls);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized java.lang.Object c(java.lang.Class r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.content.Context r0 = r4.b     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0040
            java.util.Map r0 = r4.d     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0037
            java.util.ArrayList r0 = r4.e     // Catch:{ all -> 0x0048 }
            int r0 = r0.size()     // Catch:{ all -> 0x0048 }
            r1 = 0
        L_0x0014:
            if (r1 >= r0) goto L_0x0026
            java.util.ArrayList r2 = r4.e     // Catch:{ all -> 0x0048 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0048 }
            thn r2 = (defpackage.thn) r2     // Catch:{ all -> 0x0048 }
            android.content.Context r3 = r4.b     // Catch:{ all -> 0x0048 }
            r2.a(r3, r5, r4)     // Catch:{ all -> 0x0048 }
            int r1 = r1 + 1
            goto L_0x0014
        L_0x0026:
            java.util.Map r0 = r4.d     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0035
            java.util.Map r1 = r4.d     // Catch:{ all -> 0x0048 }
            java.lang.Object r2 = a     // Catch:{ all -> 0x0048 }
            r1.put(r5, r2)     // Catch:{ all -> 0x0048 }
        L_0x0035:
            monitor-exit(r4)
            return r0
        L_0x0037:
            java.lang.Object r5 = a     // Catch:{ all -> 0x0048 }
            if (r0 == r5) goto L_0x003d
            monitor-exit(r4)
            return r0
        L_0x003d:
            r5 = 0
            monitor-exit(r4)
            return r5
        L_0x0040:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "Locator not initialized yet."
            r5.<init>(r0)     // Catch:{ all -> 0x0048 }
            throw r5     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x004c
        L_0x004b:
            throw r5
        L_0x004c:
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.thl.c(java.lang.Class):java.lang.Object");
    }

    public thl(Context context) {
        this.b = context;
        this.c = context.getClass().getName();
    }

    public final Object b(Class cls) {
        Object c2 = c(cls);
        if (c2 != null) {
            return c2;
        }
        return null;
    }

    public static thl a(Context context) {
        thl thl;
        boolean z;
        Context applicationContext = context.getApplicationContext();
        boolean z2 = false;
        Context context2 = context;
        do {
            if (context2 instanceof thm) {
                thl = ((thm) context2).a();
                if (thl == null) {
                    String valueOf = String.valueOf(context2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                    sb.append("LocatorContext must not return null Locator: ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                thl = null;
            }
            if (thl != null) {
                return thl;
            }
            if (context2 == applicationContext) {
                z = true;
            } else {
                z = false;
            }
            z2 |= z;
            if (context2 instanceof ContextWrapper) {
                context2 = ((ContextWrapper) context).getBaseContext();
                if (context2 == null) {
                    throw new IllegalStateException("Invalid ContextWrapper -- If this is a Robolectric test, have you called ActivityController.create()?");
                }
            } else if (!z2) {
                context2 = applicationContext;
                continue;
            } else {
                context2 = null;
                continue;
            }
        } while (context2 != null);
        return null;
    }

    public final Object a(Class cls) {
        Object b2 = b(cls);
        if (b2 != null) {
            return b2;
        }
        throw new IllegalStateException("Unbound type: " + cls.getName() + "\nSearched locators:\n" + this.c);
    }

    public final synchronized void a() {
        for (Class cls : this.d.keySet()) {
            Object obj = this.d.get(cls);
            if (obj != a) {
                ArrayList arrayList = this.e;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((thn) arrayList.get(i)).a(cls, obj);
                }
            }
        }
        this.d.clear();
    }

    public final synchronized void a(Class cls, Object obj) {
        Object obj2 = this.d.get(cls);
        if (obj2 != null) {
            if (obj2 == a) {
                ((anih) ((anih) tgb.a.c()).a("thl", "a", 132, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Bind call too late - someone already tried to get: %s", (Object) cls);
            } else {
                String valueOf = String.valueOf(cls);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Duplicate binding: ");
                sb.append(valueOf);
                throw new thk(sb.toString());
            }
        }
        this.d.put(cls, obj);
    }

    public final synchronized void a(thn thn) {
        this.e.add(thn);
    }
}
