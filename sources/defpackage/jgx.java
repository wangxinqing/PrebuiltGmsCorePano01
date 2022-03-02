package defpackage;

import android.os.Handler;

/* renamed from: jgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jgx {
    protected final njy a;
    protected final String b;
    protected final int c;
    final /* synthetic */ jgy d;
    private jgw e;
    private volatile aoru f = null;

    public jgx(jgy jgy, jgw jgw, String str, int i) {
        this.d = jgy;
        this.a = jgw.a;
        this.e = jgw;
        this.b = str;
        this.c = i;
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.e = null;
        this.f = null;
    }

    /* access modifiers changed from: protected */
    public void a(Handler handler) {
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = "AlarmTask";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        r0 = "WakefulTask";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r0 = defpackage.amlv.a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        if (r0 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        defpackage.apev.a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        r0 = r4.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r0 != 2) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 == 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r4 = this;
            jgy r0 = r4.d
            java.lang.Object r0 = r0.a
            monitor-enter(r0)
            jgw r1 = r4.e     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0036
            jgy r2 = r4.d     // Catch:{ all -> 0x0038 }
            r3 = 0
            r2.a(r1, r3)     // Catch:{ all -> 0x0038 }
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            int r0 = r4.c
            r2 = 2
            if (r0 != r2) goto L_0x0016
            goto L_0x001b
        L_0x0016:
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = "AlarmTask"
            goto L_0x001d
        L_0x001b:
            java.lang.String r0 = "WakefulTask"
        L_0x001d:
            amkr r0 = defpackage.amlv.a((java.lang.String) r0)
            r1.a()     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0029
            r0.close()
        L_0x0029:
            return
        L_0x002a:
            r1 = move-exception
            if (r0 == 0) goto L_0x0035
            r0.close()     // Catch:{ all -> 0x0031 }
            goto L_0x0035
        L_0x0031:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r0)
        L_0x0035:
            throw r1
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            return
        L_0x0038:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgx.b():void");
    }
}
