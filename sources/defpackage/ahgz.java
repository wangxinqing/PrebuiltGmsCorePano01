package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ahgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ahgz {
    public final Object a;
    public final String b;
    public final ahgx[] c;
    Map d;
    public int e;
    private final ahhb f;
    private boolean g = true;

    public ahgz(String str, ahhb ahhb, ahgx... ahgxArr) {
        int i = 1;
        int length = ahgxArr.length;
        i = length > 0 ? 10 : i;
        amrl.a((Object) str);
        this.b = str;
        this.c = ahgxArr;
        HashMap hashMap = new HashMap(i);
        this.d = hashMap;
        if (length == 0) {
            hashMap.put(ahgo.b, a());
        }
        this.e = 0;
        amrl.a((Object) ahhb);
        this.f = ahhb;
        this.a = new Object();
    }

    public /* bridge */ /* synthetic */ ahgp a() {
        return new ahgu();
    }

    public final void b() {
        this.g = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d1, code lost:
        if (((defpackage.ahhj) r9).e.isCancelled() == false) goto L_0x00ef;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r9, defpackage.ahgo r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.a
            monitor-enter(r0)
            java.util.Map r1 = r8.d     // Catch:{ all -> 0x00f5 }
            java.lang.Object r1 = r1.get(r10)     // Catch:{ all -> 0x00f5 }
            ahgp r1 = (defpackage.ahgp) r1     // Catch:{ all -> 0x00f5 }
            if (r1 != 0) goto L_0x0017
            ahgp r1 = r8.a()     // Catch:{ all -> 0x00f5 }
            java.util.Map r2 = r8.d     // Catch:{ all -> 0x00f5 }
            r2.put(r10, r1)     // Catch:{ all -> 0x00f5 }
            goto L_0x0018
        L_0x0017:
        L_0x0018:
            r1.a(r9)     // Catch:{ all -> 0x00f5 }
            int r9 = r8.e     // Catch:{ all -> 0x00f5 }
            int r9 = r9 + 1
            r8.e = r9     // Catch:{ all -> 0x00f5 }
            monitor-exit(r0)     // Catch:{ all -> 0x00f5 }
            ahhb r9 = r8.f
            ahhc r9 = (defpackage.ahhc) r9
            ahha r9 = r9.c
            if (r9 == 0) goto L_0x00f4
            r10 = r9
            ahhj r10 = (defpackage.ahhj) r10
            java.util.concurrent.atomic.AtomicLong r0 = r10.d
            long r0 = r0.incrementAndGet()
            r2 = 100
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x00b7
            java.lang.Object r0 = r10.f
            monitor-enter(r0)
            r1 = r9
            ahhj r1 = (defpackage.ahhj) r1     // Catch:{ all -> 0x00b4 }
            java.util.concurrent.atomic.AtomicLong r1 = r1.d     // Catch:{ all -> 0x00b4 }
            long r4 = r1.get()     // Catch:{ all -> 0x00b4 }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x00b2
            r10 = r9
            ahhj r10 = (defpackage.ahhj) r10     // Catch:{ all -> 0x00b4 }
            java.lang.Object r10 = r10.f     // Catch:{ all -> 0x00b4 }
            monitor-enter(r10)     // Catch:{ all -> 0x00b4 }
            r1 = r9
            ahhj r1 = (defpackage.ahhj) r1     // Catch:{ all -> 0x00af }
            java.util.concurrent.ScheduledFuture r1 = r1.e     // Catch:{ all -> 0x00af }
            r4 = 1
            if (r1 != 0) goto L_0x0059
            goto L_0x0095
        L_0x0059:
            boolean r1 = r1.isDone()     // Catch:{ all -> 0x00af }
            if (r1 != 0) goto L_0x0095
            r1 = r9
            ahhj r1 = (defpackage.ahhj) r1     // Catch:{ all -> 0x00af }
            java.util.concurrent.ScheduledFuture r1 = r1.e     // Catch:{ all -> 0x00af }
            boolean r1 = r1.isCancelled()     // Catch:{ all -> 0x00af }
            if (r1 != 0) goto L_0x0095
            r1 = r9
            ahhj r1 = (defpackage.ahhj) r1     // Catch:{ all -> 0x00af }
            java.util.concurrent.ScheduledFuture r1 = r1.e     // Catch:{ all -> 0x00af }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00af }
            long r6 = r1.getDelay(r6)     // Catch:{ all -> 0x00af }
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ac
            r1 = r9
            ahhj r1 = (defpackage.ahhj) r1     // Catch:{ all -> 0x00af }
            r1.a()     // Catch:{ all -> 0x00af }
            r1 = r9
            ahhj r1 = (defpackage.ahhj) r1     // Catch:{ all -> 0x00af }
            java.util.concurrent.ScheduledExecutorService r1 = r1.a     // Catch:{ all -> 0x00af }
            ahhh r2 = new ahhh     // Catch:{ all -> 0x00af }
            r3 = r9
            ahhj r3 = (defpackage.ahhj) r3     // Catch:{ all -> 0x00af }
            r2.<init>(r3)     // Catch:{ all -> 0x00af }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00af }
            java.util.concurrent.ScheduledFuture r1 = r1.schedule(r2, r4, r3)     // Catch:{ all -> 0x00af }
            ahhj r9 = (defpackage.ahhj) r9     // Catch:{ all -> 0x00af }
            goto L_0x00aa
        L_0x0095:
            r1 = r9
            ahhj r1 = (defpackage.ahhj) r1     // Catch:{ all -> 0x00af }
            java.util.concurrent.ScheduledExecutorService r1 = r1.a     // Catch:{ all -> 0x00af }
            ahhg r2 = new ahhg     // Catch:{ all -> 0x00af }
            r3 = r9
            ahhj r3 = (defpackage.ahhj) r3     // Catch:{ all -> 0x00af }
            r2.<init>(r3)     // Catch:{ all -> 0x00af }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00af }
            java.util.concurrent.ScheduledFuture r1 = r1.schedule(r2, r4, r3)     // Catch:{ all -> 0x00af }
            ahhj r9 = (defpackage.ahhj) r9     // Catch:{ all -> 0x00af }
        L_0x00aa:
            r9.e = r1     // Catch:{ all -> 0x00af }
        L_0x00ac:
            monitor-exit(r10)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
            return
        L_0x00af:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00af }
            throw r9     // Catch:{ all -> 0x00b4 }
        L_0x00b2:
            monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
            goto L_0x00b7
        L_0x00b4:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
            throw r9
        L_0x00b7:
            java.lang.Object r10 = r10.f
            monitor-enter(r10)
            r0 = r9
            ahhj r0 = (defpackage.ahhj) r0     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.ScheduledFuture r0 = r0.e     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x00c2
            goto L_0x00d3
        L_0x00c2:
            boolean r0 = r0.isDone()     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x00d3
            r0 = r9
            ahhj r0 = (defpackage.ahhj) r0     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.ScheduledFuture r0 = r0.e     // Catch:{ all -> 0x00f1 }
            boolean r0 = r0.isCancelled()     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x00ef
        L_0x00d3:
            r0 = r9
            ahhj r0 = (defpackage.ahhj) r0     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.ScheduledExecutorService r0 = r0.a     // Catch:{ all -> 0x00f1 }
            ahhi r1 = new ahhi     // Catch:{ all -> 0x00f1 }
            r2 = r9
            ahhj r2 = (defpackage.ahhj) r2     // Catch:{ all -> 0x00f1 }
            r1.<init>(r2)     // Catch:{ all -> 0x00f1 }
            r2 = r9
            ahhj r2 = (defpackage.ahhj) r2     // Catch:{ all -> 0x00f1 }
            long r2 = r2.c     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.ScheduledFuture r0 = r0.schedule(r1, r2, r4)     // Catch:{ all -> 0x00f1 }
            ahhj r9 = (defpackage.ahhj) r9     // Catch:{ all -> 0x00f1 }
            r9.e = r0     // Catch:{ all -> 0x00f1 }
        L_0x00ef:
            monitor-exit(r10)     // Catch:{ all -> 0x00f1 }
            return
        L_0x00f1:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00f1 }
            throw r9
        L_0x00f4:
            return
        L_0x00f5:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f5 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahgz.a(java.lang.Object, ahgo):void");
    }

    public final void b(Object... objArr) {
        a(objArr);
        a(1L, new ahgo(objArr));
    }

    /* access modifiers changed from: package-private */
    public final void a(ahgx... ahgxArr) {
        if (!Arrays.equals(this.c, ahgxArr)) {
            String str = this.b;
            String arrays = Arrays.toString(this.c);
            String arrays2 = Arrays.toString(ahgxArr);
            int length = String.valueOf(str).length();
            StringBuilder sb = new StringBuilder(length + 32 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
            sb.append("Streamz ");
            sb.append(str);
            sb.append(" with field diffs: ");
            sb.append(arrays);
            sb.append(" and ");
            sb.append(arrays2);
            throw new ahhf(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Object... objArr) {
        boolean z;
        int i = 0;
        if (this.c.length == objArr.length) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        if (this.g) {
            while (i < objArr.length) {
                Object obj = objArr[i];
                if (obj == null) {
                    String str = this.b;
                    String arrays = Arrays.toString(objArr);
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(arrays).length());
                    sb.append("Streamz ");
                    sb.append(str);
                    sb.append(" has null parameter: ");
                    sb.append(arrays);
                    throw new NullPointerException(sb.toString());
                } else if (this.c[i].b.isInstance(obj)) {
                    i++;
                } else {
                    String str2 = this.b;
                    String valueOf = String.valueOf(obj);
                    String valueOf2 = String.valueOf(obj.getClass());
                    ahgx ahgx = this.c[i];
                    String str3 = ahgx.a;
                    String valueOf3 = String.valueOf(ahgx.b);
                    int length = String.valueOf(str2).length();
                    int length2 = String.valueOf(valueOf).length();
                    int length3 = String.valueOf(valueOf2).length();
                    StringBuilder sb2 = new StringBuilder(length + 92 + length2 + length3 + str3.length() + String.valueOf(valueOf3).length());
                    sb2.append("Streamz ");
                    sb2.append(str2);
                    sb2.append(" has parameter {index: ");
                    sb2.append(i);
                    sb2.append(", value: ");
                    sb2.append(valueOf);
                    sb2.append(", type: ");
                    sb2.append(valueOf2);
                    sb2.append("}, but expected: {name: ");
                    sb2.append(str3);
                    sb2.append(", type: ");
                    sb2.append(valueOf3);
                    sb2.append("}");
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
    }
}
