package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import com.google.android.gms.scheduler.reachability.ReachabilityObserver$AlarmReceiver;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aadt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aadt {
    public static final /* synthetic */ int d = 0;
    private static final anax e = anfv.a;
    public final aoru a;
    public final Map b;
    public Long c = null;
    private final jbs f;
    private final nsh g;
    private final PendingIntent h;
    private final aady i;
    private final hph j;
    private final AtomicReference k = new AtomicReference(e);

    public aadt(Context context, jbs jbs, nsh nsh, aoru aoru, aady aady, aabe aabe) {
        this.f = jbs;
        this.g = nsh;
        this.a = aoru;
        this.i = aady;
        this.j = aabe.a;
        this.b = new nz();
        this.h = PendingIntent.getBroadcast(context, 0, new Intent("com.google.android.gms.gcm.nts.reachability.WAKE_UP"), 0);
        context.registerReceiver(new ReachabilityObserver$AlarmReceiver(this), new IntentFilter("com.google.android.gms.gcm.nts.reachability.WAKE_UP"), "com.google.android.gms.permission.INTERNAL_BROADCAST", (Handler) null);
    }

    private final void a(Uri uri, Set set) {
        ob obVar = new ob((Collection) this.k.get());
        if (uri != null) {
            obVar.add(uri);
        }
        if (set != null) {
            obVar.removeAll(set);
        }
        anax a2 = anax.a((Collection) obVar);
        if (!((anax) this.k.getAndSet(a2)).equals(a2)) {
            b();
        }
    }

    private final void c(long j2) {
        if (axlx.b()) {
            Long l = this.c;
            if (l == null || l.longValue() > j2) {
                this.f.a("Reachability", 2, j2, this.h, "com.google.android.gms");
                this.c = Long.valueOf(j2);
            }
        }
    }

    static String b(long j2) {
        String str;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String formatElapsedTime = DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j2));
        long j3 = j2 - elapsedRealtime;
        if (j3 >= 1000 || j3 == 0) {
            str = DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j3));
        } else if (j3 > 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("00:00.");
            sb.append(j3);
            str = sb.toString();
        } else if (j3 > -1000) {
            StringBuilder sb2 = new StringBuilder(27);
            sb2.append("-00:00.");
            sb2.append(-j3);
            str = sb2.toString();
        } else {
            String valueOf = String.valueOf(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(-j3)));
            str = valueOf.length() == 0 ? new String("-") : "-".concat(valueOf);
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(formatElapsedTime).length() + 3 + String.valueOf(str).length());
        sb3.append(formatElapsedTime);
        sb3.append(" (");
        sb3.append(str);
        sb3.append(")");
        return sb3.toString();
    }

    public final anax a() {
        return axlx.b() ? (anax) this.k.get() : e;
    }

    public final synchronized void a(long j2) {
        if (axlx.b()) {
            c(j2);
        }
    }

    private final void b() {
        if (axlx.a.a().b()) {
            this.j.c("REACHABILITY_CHANGED_BROADCAST").a();
        }
        this.g.b(6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.net.Uri r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = defpackage.axlx.b()     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0029
            java.util.Map r0 = r2.b     // Catch:{ all -> 0x0034 }
            boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0029
            java.util.concurrent.atomic.AtomicReference r0 = r2.k     // Catch:{ all -> 0x0034 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0034 }
            anax r0 = (defpackage.anax) r0     // Catch:{ all -> 0x0034 }
            boolean r0 = r0.contains(r3)     // Catch:{ all -> 0x0034 }
            r1 = 0
            if (r4 == 0) goto L_0x002b
            if (r0 != 0) goto L_0x0021
            goto L_0x002b
        L_0x0021:
            anax r3 = defpackage.anax.a((java.lang.Object) r3)     // Catch:{ all -> 0x0034 }
            r2.a((android.net.Uri) r1, (java.util.Set) r3)     // Catch:{ all -> 0x0034 }
        L_0x0029:
            monitor-exit(r2)
            return
        L_0x002b:
            if (r4 != 0) goto L_0x0032
            if (r0 != 0) goto L_0x0032
            r2.a((android.net.Uri) r3, (java.util.Set) r1)     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r2)
            return
        L_0x0034:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aadt.a(android.net.Uri, boolean):void");
    }

    public final void a(PrintWriter printWriter) {
        if (axlx.b()) {
            printWriter.println("ReachabilityObserver:");
            synchronized (this) {
                for (aadx a2 : this.b.values()) {
                    a2.a(printWriter);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.util.Collection r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = defpackage.axlx.b()     // Catch:{ all -> 0x0130 }
            if (r0 != 0) goto L_0x0021
            java.util.Map r12 = r11.b     // Catch:{ all -> 0x0130 }
            r12.clear()     // Catch:{ all -> 0x0130 }
            java.util.concurrent.atomic.AtomicReference r12 = r11.k     // Catch:{ all -> 0x0130 }
            anax r0 = e     // Catch:{ all -> 0x0130 }
            java.lang.Object r12 = r12.getAndSet(r0)     // Catch:{ all -> 0x0130 }
            anax r12 = (defpackage.anax) r12     // Catch:{ all -> 0x0130 }
            boolean r12 = r12.isEmpty()     // Catch:{ all -> 0x0130 }
            if (r12 != 0) goto L_0x001f
            r11.b()     // Catch:{ all -> 0x0130 }
        L_0x001f:
            monitor-exit(r11)
            return
        L_0x0021:
            anav r0 = defpackage.anax.j()     // Catch:{ all -> 0x0130 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0130 }
        L_0x0029:
            boolean r1 = r12.hasNext()     // Catch:{ all -> 0x0130 }
            if (r1 == 0) goto L_0x003d
            java.lang.Object r1 = r12.next()     // Catch:{ all -> 0x0130 }
            aabq r1 = (defpackage.aabq) r1     // Catch:{ all -> 0x0130 }
            qxx r1 = r1.n     // Catch:{ all -> 0x0130 }
            java.util.Set r1 = r1.k     // Catch:{ all -> 0x0130 }
            r0.b((java.lang.Iterable) r1)     // Catch:{ all -> 0x0130 }
            goto L_0x0029
        L_0x003d:
            anax r12 = r0.a()     // Catch:{ all -> 0x0130 }
            java.util.Map r0 = r11.b     // Catch:{ all -> 0x0130 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0130 }
            angk r1 = defpackage.angm.c(r12, r0)     // Catch:{ all -> 0x0130 }
            angk r12 = defpackage.angm.c(r0, r12)     // Catch:{ all -> 0x0130 }
            r0 = 0
            r11.a((android.net.Uri) r0, (java.util.Set) r12)     // Catch:{ all -> 0x0130 }
            java.util.Map r2 = r11.b     // Catch:{ all -> 0x0130 }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x0130 }
            r2.removeAll(r12)     // Catch:{ all -> 0x0130 }
            angg r1 = (defpackage.angg) r1     // Catch:{ all -> 0x0130 }
            anhj r12 = r1.iterator()     // Catch:{ all -> 0x0130 }
            r1 = 0
        L_0x0063:
            boolean r2 = r12.hasNext()     // Catch:{ all -> 0x0130 }
            if (r2 == 0) goto L_0x0125
            java.lang.Object r2 = r12.next()     // Catch:{ all -> 0x0130 }
            android.net.Uri r2 = (android.net.Uri) r2     // Catch:{ all -> 0x0130 }
            aadr r3 = new aadr     // Catch:{ all -> 0x0130 }
            r3.<init>(r11, r2)     // Catch:{ all -> 0x0130 }
            aady r4 = r11.i     // Catch:{ all -> 0x0130 }
            aoru r5 = r11.a     // Catch:{ all -> 0x0130 }
            if (r2 == 0) goto L_0x011a
            java.lang.String r6 = r2.getScheme()     // Catch:{ all -> 0x0130 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0130 }
            if (r6 != 0) goto L_0x011a
            java.lang.String r6 = r2.getHost()     // Catch:{ all -> 0x0130 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0130 }
            if (r6 != 0) goto L_0x011a
            java.lang.String r6 = r2.getScheme()     // Catch:{ all -> 0x0130 }
            java.lang.String r7 = "tcp"
            java.lang.String r8 = "ping"
            anax r7 = defpackage.anax.a((java.lang.Object) r7, (java.lang.Object) r8)     // Catch:{ all -> 0x0130 }
            r8 = 44
            amsk r9 = defpackage.amsk.a((char) r8)     // Catch:{ all -> 0x0130 }
            amsk r9 = r9.b()     // Catch:{ all -> 0x0130 }
            axlx r10 = defpackage.axlx.a     // Catch:{ all -> 0x0130 }
            axly r10 = r10.a()     // Catch:{ all -> 0x0130 }
            java.lang.String r10 = r10.f()     // Catch:{ all -> 0x0130 }
            java.lang.Iterable r9 = r9.a((java.lang.CharSequence) r10)     // Catch:{ all -> 0x0130 }
            anax r9 = defpackage.anax.a((java.lang.Iterable) r9)     // Catch:{ all -> 0x0130 }
            angk r7 = defpackage.angm.b(r7, r9)     // Catch:{ all -> 0x0130 }
            if (r6 == 0) goto L_0x011a
            boolean r7 = r7.contains(r6)     // Catch:{ all -> 0x0130 }
            if (r7 == 0) goto L_0x011a
            java.lang.String r7 = r2.getHost()     // Catch:{ all -> 0x0130 }
            if (r7 == 0) goto L_0x011a
            amsk r8 = defpackage.amsk.a((char) r8)     // Catch:{ all -> 0x0130 }
            amsk r8 = r8.b()     // Catch:{ all -> 0x0130 }
            axlx r9 = defpackage.axlx.a     // Catch:{ all -> 0x0130 }
            axly r9 = r9.a()     // Catch:{ all -> 0x0130 }
            java.lang.String r9 = r9.e()     // Catch:{ all -> 0x0130 }
            java.lang.Iterable r8 = r8.a((java.lang.CharSequence) r9)     // Catch:{ all -> 0x0130 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0130 }
        L_0x00e2:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0130 }
            if (r9 == 0) goto L_0x011a
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0130 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0130 }
            boolean r9 = r7.endsWith(r9)     // Catch:{ all -> 0x0130 }
            if (r9 == 0) goto L_0x00e2
            java.lang.String r7 = "tcp"
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0130 }
            if (r6 != 0) goto L_0x00fd
        L_0x00fc:
            goto L_0x0104
        L_0x00fd:
            int r6 = r2.getPort()     // Catch:{ all -> 0x0130 }
            if (r6 > 0) goto L_0x00fc
            goto L_0x011a
        L_0x0104:
            anaf r4 = r4.a     // Catch:{ all -> 0x0130 }
            java.lang.String r6 = r2.getScheme()     // Catch:{ all -> 0x0130 }
            java.lang.Object r4 = r4.get(r6)     // Catch:{ all -> 0x0130 }
            aadq r4 = (defpackage.aadq) r4     // Catch:{ all -> 0x0130 }
            if (r4 == 0) goto L_0x0118
            aadx r6 = new aadx     // Catch:{ all -> 0x0130 }
            r6.<init>(r2, r4, r3, r5)     // Catch:{ all -> 0x0130 }
            goto L_0x011b
        L_0x0118:
            r6 = r0
            goto L_0x011b
        L_0x011a:
            r6 = r0
        L_0x011b:
            if (r6 == 0) goto L_0x0063
            java.util.Map r1 = r11.b     // Catch:{ all -> 0x0130 }
            r1.put(r2, r6)     // Catch:{ all -> 0x0130 }
            r1 = 1
            goto L_0x0063
        L_0x0125:
            if (r1 == 0) goto L_0x012e
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0130 }
            r11.c(r0)     // Catch:{ all -> 0x0130 }
        L_0x012e:
            monitor-exit(r11)
            return
        L_0x0130:
            r12 = move-exception
            monitor-exit(r11)
            goto L_0x0134
        L_0x0133:
            throw r12
        L_0x0134:
            goto L_0x0133
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aadt.a(java.util.Collection):void");
    }
}
