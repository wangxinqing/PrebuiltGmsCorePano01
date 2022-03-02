package defpackage;

import android.content.ContentProviderOperation;
import java.util.ArrayList;

/* renamed from: xwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xwp {
    private ArrayList a = new ArrayList();
    private ContentProviderOperation.Builder b;
    private int c;

    private final int a(ContentProviderOperation.Builder builder) {
        this.c++;
        int d = d();
        ContentProviderOperation.Builder builder2 = this.b;
        if (builder2 != null) {
            this.a.add(builder2.build());
        }
        this.b = builder;
        return d;
    }

    public final synchronized ArrayList b() {
        ArrayList arrayList;
        arrayList = this.a;
        ContentProviderOperation.Builder builder = this.b;
        if (builder != null) {
            arrayList.add(builder.build());
        }
        this.a = new ArrayList();
        this.b = null;
        this.c = 0;
        return arrayList;
    }

    public final synchronized boolean c() {
        return this.b == null;
    }

    public final synchronized int d() {
        return !c() ? this.a.size() + 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(android.content.ContentProviderOperation.Builder r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            defpackage.amrl.a((java.lang.Object) r3)     // Catch:{ all -> 0x0049 }
            if (r4 == 0) goto L_0x000e
            int r3 = r2.a(r3)     // Catch:{ all -> 0x0049 }
            r2.a()     // Catch:{ all -> 0x0049 }
            goto L_0x0047
        L_0x000e:
            int r3 = r2.a(r3)     // Catch:{ all -> 0x0049 }
            defpackage.xip.a()     // Catch:{ all -> 0x0049 }
            ayrj r4 = defpackage.ayrj.a     // Catch:{ all -> 0x0049 }
            aytn r4 = r4.a()     // Catch:{ all -> 0x0049 }
            boolean r4 = r4.al()     // Catch:{ all -> 0x0049 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0049 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0049 }
            if (r4 == 0) goto L_0x0046
            ayrj r4 = defpackage.ayrj.a     // Catch:{ all -> 0x0049 }
            aytn r4 = r4.a()     // Catch:{ all -> 0x0049 }
            long r0 = r4.aH()     // Catch:{ all -> 0x0049 }
            int r4 = (int) r0     // Catch:{ all -> 0x0049 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0049 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0049 }
            int r0 = r2.c     // Catch:{ all -> 0x0049 }
            if (r0 >= r4) goto L_0x0041
            goto L_0x0047
        L_0x0041:
            r2.a()     // Catch:{ all -> 0x0049 }
            monitor-exit(r2)
            return r3
        L_0x0046:
        L_0x0047:
            monitor-exit(r2)
            return r3
        L_0x0049:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwp.a(android.content.ContentProviderOperation$Builder, boolean):int");
    }

    public final synchronized void a() {
        ContentProviderOperation.Builder builder = this.b;
        if (builder != null) {
            builder.withYieldAllowed(true);
            this.c = 0;
        }
    }
}
