package defpackage;

/* renamed from: aiai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiai {
    private aiaj a;
    private Boolean b;
    private long c;
    private boolean d;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0011, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.d     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0012
            java.lang.Boolean r0 = r2.b     // Catch:{ all -> 0x0015 }
            r1 = 0
            if (r0 == 0) goto L_0x0010
            aiaj r0 = r2.a     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0010
            monitor-exit(r2)
            return r1
        L_0x0010:
            monitor-exit(r2)
            return r1
        L_0x0012:
            r0 = 1
            monitor-exit(r2)
            return r0
        L_0x0015:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiai.a():int");
    }

    public final synchronized boolean b() {
        boolean z;
        Boolean bool;
        z = false;
        if (a() == 1 || ((bool = this.b) != null && bool.booleanValue())) {
            z = true;
        }
        return z;
    }

    public final synchronized void a(long j, aiaj aiaj) {
        aiaj aiaj2;
        if (aiaj != null) {
            if (aiaj.e()) {
                Boolean bool = this.b;
                if (bool != null && !bool.booleanValue() && ((int) (Math.abs(j - this.c) / 1000)) > 3 && (aiaj2 = this.a) != null && !aiaj.b(aiaj2)) {
                    this.d = true;
                }
                this.a = aiaj;
            }
        }
    }

    public final synchronized void a(boolean z, long j) {
        this.c = j;
        this.b = Boolean.valueOf(z);
    }
}
