package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: nuh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nuh {
    private static final long a = TimeUnit.DAYS.toMillis(28);
    private final Context b;
    private final nvq c;
    private final nub d;
    private final hph e;
    private final nsb f;
    private final List g = new ArrayList();
    private final List h = new ArrayList();

    public nuh(Context context, nvq nvq, nub nub, hph hph, nsb nsb) {
        this.b = context;
        this.c = nvq;
        this.d = nub;
        this.e = hph;
        this.f = nsb;
    }

    private final void a(List list, ntx ntx, nxy nxy) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nug nug = (nug) it.next();
            if (nug.c.equals(ntx)) {
                it.remove();
                a(ntx, nug.d, nug.a());
                this.d.a(nug.c, nug.d, nug.e, nxy);
            }
        }
    }

    private final amri b(amnc amnc) {
        List list = this.h;
        int size = list.size();
        int i = 0;
        while (i < size) {
            nuf nuf = (nuf) list.get(i);
            i++;
            if (nuf.a(amnc)) {
                return amri.b(nuf);
            }
        }
        return ampu.a;
    }

    public final synchronized void b(nrj nrj) {
        nvq nvq;
        if (!aekv.a(this.b)) {
            List list = this.g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                nue nue = (nue) list.get(i);
                amri a2 = a((nug) nue);
                if (a2.a()) {
                    nrp nrp = (nrp) a2.b();
                    try {
                        if (a(nrp)) {
                            this.f.a(nue.c, nue.d, nue.e, nxy.TTL_EXPIRED);
                            nvq = this.c;
                        } else {
                            amnc amnc = nrp.c;
                            if (amnc == null) {
                                amnc = amnc.r;
                            }
                            nrj.b(amnc);
                            this.f.a(nue.c, nue.d, nue.e, nxw.SENT_ON_LEAVING_DOZE);
                            nvq = this.c;
                        }
                        nvq.b((aucj) nrp);
                    } catch (Throwable th) {
                        this.c.b((aucj) nrp);
                        throw th;
                    }
                }
            }
            this.g.clear();
        }
    }

    private final void a(ntx ntx, String str, int i) {
        amri a2 = this.c.a(str);
        if (a2.a()) {
            nrp nrp = (nrp) a2.b();
            amnc amnc = nrp.c;
            if (amnc == null) {
                amnc = amnc.r;
            }
            if (ntx.a(amnc).equals(ntx)) {
                int a3 = nro.a(nrp.d);
                if (a3 == 0) {
                    a3 = 1;
                }
                if (a3 == i) {
                    this.c.b((aucj) nrp);
                }
            }
        }
    }

    private final void a(nuf nuf) {
        a(nuf.c, nuf.d);
    }

    private static boolean a(nrp nrp) {
        long j;
        long j2 = nrp.b;
        amnc amnc = nrp.c;
        if (amnc == null) {
            amnc = amnc.r;
        }
        if ((amnc.a & 65536) != 0) {
            j2 = Math.min(j2, amnc.m);
        }
        if ((amnc.a & 32768) != 0) {
            j = Math.min(TimeUnit.SECONDS.toMillis((long) amnc.l), a);
        } else {
            j = a;
        }
        return j2 + j <= System.currentTimeMillis();
    }

    public final synchronized void b(ntx ntx, nxy nxy) {
        if (!aekv.a(this.b)) {
            a(this.h, ntx, nxy);
        }
    }

    public final synchronized amri a() {
        amri amri;
        if (aekv.a(this.b) || this.h.isEmpty()) {
            amri = ampu.a;
        } else {
            List list = this.h;
            int size = list.size();
            long j = Long.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                j = Math.min(((nuf) list.get(i)).b(), j);
            }
            amri = amri.b(Long.valueOf(j));
        }
        return amri;
    }

    /* access modifiers changed from: package-private */
    public final amri a(nug nug) {
        amri a2 = this.c.a(nug.d);
        if (!a2.a()) {
            String valueOf = String.valueOf(nug);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
            sb.append("Failed to load message missing from store: ");
            sb.append(valueOf);
            Log.w("GCM", sb.toString());
            this.d.a(nug.c, nug.d, nug.e, 2);
            return ampu.a;
        }
        nrp nrp = (nrp) a2.b();
        amnc amnc = nrp.c;
        if (amnc == null) {
            amnc = amnc.r;
        }
        if (nug.a(amnc)) {
            int a3 = nug.a();
            int a4 = nro.a(nrp.d);
            if (a4 == 0) {
                a4 = 1;
            }
            if (a3 == a4) {
                return a2;
            }
        }
        String valueOf2 = String.valueOf(nug);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 53);
        sb2.append("Failed to load message, stored version is different: ");
        sb2.append(valueOf2);
        Log.w("GCM", sb2.toString());
        this.d.a(nug.c, nug.d, nug.e, 3);
        return ampu.a;
    }

    public final synchronized Set a(nrj nrj) {
        synchronized (this) {
            if (aekv.a(this.b)) {
                Set emptySet = Collections.emptySet();
                return emptySet;
            }
            anav j = anax.j();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            List list = this.h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                nuf nuf = (nuf) list.get(i);
                if (nuf.b() <= elapsedRealtime) {
                    arrayList.add(nuf);
                }
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                nuf nuf2 = (nuf) arrayList.get(i2);
                amri a2 = a((nug) nuf2);
                if (!a2.a()) {
                    this.h.remove(nuf2);
                    nrj nrj2 = nrj;
                } else {
                    nrp nrp = (nrp) a2.b();
                    if (a(nrp)) {
                        a(nuf2);
                        this.d.a(nuf2.c, nuf2.d, nuf2.e, nxy.TTL_EXPIRED);
                        nrj nrj3 = nrj;
                    } else {
                        amnc amnc = nrp.c;
                        if (amnc == null) {
                            amnc = amnc.r;
                        }
                        nrj.a(amnc);
                        nuf2.b++;
                        nuf2.a = SystemClock.elapsedRealtime();
                        this.d.a(nuf2.c, nuf2.d, nuf2.e, 3, nuf2.b, 0);
                        if (((long) nuf2.b) >= axlc.a.a().u()) {
                            a(nuf2);
                            this.d.a(nuf2.c, nuf2.d, nuf2.e, nxy.CLIENT_QUEUE_EXCEEDED_MAX_RETRIES);
                            j.b(nuf2.c);
                        }
                    }
                }
            }
            anax a3 = j.a();
            return a3;
        }
    }

    public final synchronized void a(amnc amnc, long j) {
        long j2;
        if (aekv.a(this.b)) {
            this.e.c("DIRECT_BOOT_RETRY_QUEUE_DROPPED").a();
            return;
        }
        amri b2 = b(amnc);
        if (b2.a()) {
            nuf nuf = (nuf) b2.b();
            String valueOf = String.valueOf(nuf);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Received duplicate message: ");
            sb.append(valueOf);
            Log.w("GCM", sb.toString());
            this.d.a(nuf.c, nuf.d, nuf.e, 4);
            return;
        }
        aucd o = nrp.e.o();
        long currentTimeMillis = System.currentTimeMillis();
        if (o.c) {
            o.c();
            o.c = false;
        }
        nrp nrp = (nrp) o.b;
        int i = nrp.a | 1;
        nrp.a = i;
        nrp.b = currentTimeMillis;
        amnc.getClass();
        nrp.c = amnc;
        int i2 = i | 2;
        nrp.a = i2;
        nrp.d = 1;
        nrp.a = 4 | i2;
        if (this.c.a((aucj) (nrp) o.i())) {
            nuf nuf2 = new nuf(amnc);
            ntx ntx = nuf2.c;
            int t = (int) axlc.a.a().t();
            if (t > 0) {
                int i3 = 0;
                int i4 = -1;
                for (int i5 = 0; i5 < this.h.size(); i5++) {
                    if (((nuf) this.h.get(i5)).c.equals(ntx)) {
                        if (i4 == -1) {
                            i4 = i5;
                        }
                        i3++;
                    }
                }
                if (i3 >= t) {
                    nuf nuf3 = (nuf) this.h.remove(i4);
                    this.c.b(nvq.b(nuf3.d));
                    this.d.a(nuf3.c, nuf3.d, nuf3.e, nxy.CLIENT_QUEUE_EXCEEDED_STORAGE_LIMIT);
                }
            }
            this.h.add(nuf2);
            if (j != -1) {
                j2 = SystemClock.elapsedRealtime() - j;
            } else {
                j2 = 0;
            }
            this.d.a(nuf2.c, nuf2.d, nuf2.e, 2, 0, j2);
        }
    }

    public final synchronized void a(Context context, nrj nrj) {
        amri amri;
        nrj nrj2 = nrj;
        synchronized (this) {
            if (!aekv.a(context)) {
                boolean z = nrj.d() && ntu.b(context);
                for (nrp nrp : this.c.b()) {
                    if (a(nrp)) {
                        this.c.b((aucj) nrp);
                        amnc amnc = nrp.c;
                        if (amnc == null) {
                            amnc = amnc.r;
                        }
                        int a2 = nro.a(nrp.d);
                        if (a2 != 0) {
                            if (a2 == 2) {
                                this.d.a(ntx.a(amnc), amnc.h, amnc.q, nxy.TTL_EXPIRED);
                            }
                        }
                        int a3 = nro.a(nrp.d);
                        if (a3 != 0 && a3 == 3) {
                            this.f.a(ntx.a(amnc), amnc.h, amnc.q, nxy.TTL_EXPIRED);
                        }
                    } else {
                        int a4 = nro.a(nrp.d);
                        if (a4 == 0) {
                            a4 = 1;
                        }
                        int i = a4 - 1;
                        if (i == 0 || i == 1) {
                            if (axlr.b()) {
                                amnc amnc2 = nrp.c;
                                if (amnc2 == null) {
                                    amnc2 = amnc.r;
                                }
                                if (!b(amnc2).a()) {
                                    nrj2.a(amnc2);
                                    this.d.a(ntx.a(amnc2), amnc2.h, amnc2.q, 4, 0, 0);
                                    this.c.b((aucj) nrp);
                                }
                            }
                        } else if (nrj.e()) {
                            amnc amnc3 = nrp.c;
                            if (amnc3 == null) {
                                amnc3 = amnc.r;
                            }
                            List list = this.g;
                            int size = list.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    amri = ampu.a;
                                    break;
                                }
                                nue nue = (nue) list.get(i2);
                                i2++;
                                if (nue.a(amnc3)) {
                                    amri = amri.b(nue);
                                    break;
                                }
                            }
                            if (!amri.a()) {
                                if (!z) {
                                    nrj2.b(amnc3);
                                    this.c.b((aucj) nrp);
                                    this.f.a(ntx.a(amnc3), amnc3.h, amnc3.q, nxw.SENT_ON_GMSCORE_RESTART);
                                } else {
                                    this.g.add(new nue(amnc3));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final synchronized void a(PrintWriter printWriter) {
        printWriter.println("\nQueued messages:");
        for (nug println : amym.a(this.g, this.h)) {
            printWriter.println(println);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b2, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.nrj r11, defpackage.ntn r12, defpackage.ntx r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            android.content.Context r0 = r10.b     // Catch:{ all -> 0x00b5 }
            boolean r0 = defpackage.aekv.a(r0)     // Catch:{ all -> 0x00b5 }
            if (r0 != 0) goto L_0x00b3
            int r12 = r12.a(r13)     // Catch:{ all -> 0x00b5 }
            java.util.List r0 = r10.g     // Catch:{ all -> 0x00b5 }
            int r1 = r0.size()     // Catch:{ all -> 0x00b5 }
            r2 = 0
            r3 = 0
        L_0x0015:
            if (r3 >= r1) goto L_0x00b1
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x00b5 }
            nue r4 = (defpackage.nue) r4     // Catch:{ all -> 0x00b5 }
            if (r12 <= 0) goto L_0x00b1
            ntx r5 = r4.c     // Catch:{ all -> 0x00b5 }
            boolean r5 = r13.equals(r5)     // Catch:{ all -> 0x00b5 }
            if (r5 != 0) goto L_0x0029
            goto L_0x00ad
        L_0x0029:
            amri r5 = r10.a((defpackage.nug) r4)     // Catch:{ all -> 0x00b5 }
            boolean r6 = r5.a()     // Catch:{ all -> 0x00b5 }
            if (r6 == 0) goto L_0x00ad
            java.lang.Object r5 = r5.b()     // Catch:{ all -> 0x00b5 }
            nrp r5 = (defpackage.nrp) r5     // Catch:{ all -> 0x00b5 }
            boolean r6 = a((defpackage.nrp) r5)     // Catch:{ all -> 0x00a6 }
            if (r6 == 0) goto L_0x004f
            nsb r6 = r10.f     // Catch:{ all -> 0x00a6 }
            ntx r7 = r4.c     // Catch:{ all -> 0x00a6 }
            java.lang.String r8 = r4.d     // Catch:{ all -> 0x00a6 }
            int r4 = r4.e     // Catch:{ all -> 0x00a6 }
            nxy r9 = defpackage.nxy.TTL_EXPIRED     // Catch:{ all -> 0x00a6 }
            r6.a((defpackage.ntx) r7, (java.lang.String) r8, (int) r4, (defpackage.nxy) r9)     // Catch:{ all -> 0x00a6 }
            nvq r4 = r10.c     // Catch:{ all -> 0x00b5 }
            goto L_0x00a2
        L_0x004f:
            nrr r4 = defpackage.nrr.a()     // Catch:{ all -> 0x00a6 }
            ntv r4 = r4.l     // Catch:{ all -> 0x00a6 }
            int r6 = r13.b     // Catch:{ all -> 0x00a6 }
            android.content.Context r4 = r4.b(r6)     // Catch:{ all -> 0x00a6 }
            int r4 = defpackage.nqw.a((android.content.Context) r4, (defpackage.ntx) r13)     // Catch:{ all -> 0x00a6 }
            nya r6 = defpackage.nya.k     // Catch:{ all -> 0x00a6 }
            aucd r6 = r6.o()     // Catch:{ all -> 0x00a6 }
            java.lang.String r7 = r13.a     // Catch:{ all -> 0x00a6 }
            boolean r8 = r6.c     // Catch:{ all -> 0x00a6 }
            if (r8 != 0) goto L_0x006c
            goto L_0x0071
        L_0x006c:
            r6.c()     // Catch:{ all -> 0x00a6 }
            r6.c = r2     // Catch:{ all -> 0x00a6 }
        L_0x0071:
            aucj r8 = r6.b     // Catch:{ all -> 0x00a6 }
            nya r8 = (defpackage.nya) r8     // Catch:{ all -> 0x00a6 }
            r7.getClass()     // Catch:{ all -> 0x00a6 }
            int r9 = r8.a     // Catch:{ all -> 0x00a6 }
            r9 = r9 | 2
            r8.a = r9     // Catch:{ all -> 0x00a6 }
            r8.e = r7     // Catch:{ all -> 0x00a6 }
            int r7 = r13.b     // Catch:{ all -> 0x00a6 }
            r9 = r9 | 4
            r8.a = r9     // Catch:{ all -> 0x00a6 }
            r8.f = r7     // Catch:{ all -> 0x00a6 }
            r7 = r9 | 16
            r8.a = r7     // Catch:{ all -> 0x00a6 }
            r8.h = r4     // Catch:{ all -> 0x00a6 }
            nsb r4 = r10.f     // Catch:{ all -> 0x00a6 }
            nxt r7 = defpackage.nxt.SENT_PRIORITY_REDUCED_MESSAGE_ON_NEW_MESSAGE_RECEIVED     // Catch:{ all -> 0x00a6 }
            r4.a(r6, r7)     // Catch:{ all -> 0x00a6 }
            amnc r4 = r5.c     // Catch:{ all -> 0x00a6 }
            if (r4 != 0) goto L_0x009b
            amnc r4 = defpackage.amnc.r     // Catch:{ all -> 0x00a6 }
        L_0x009b:
            r11.b(r4)     // Catch:{ all -> 0x00a6 }
            int r12 = r12 + -1
            nvq r4 = r10.c     // Catch:{ all -> 0x00b5 }
        L_0x00a2:
            r4.b((defpackage.aucj) r5)     // Catch:{ all -> 0x00b5 }
            goto L_0x00ad
        L_0x00a6:
            r11 = move-exception
            nvq r12 = r10.c     // Catch:{ all -> 0x00b5 }
            r12.b((defpackage.aucj) r5)     // Catch:{ all -> 0x00b5 }
            throw r11     // Catch:{ all -> 0x00b5 }
        L_0x00ad:
            int r3 = r3 + 1
            goto L_0x0015
        L_0x00b1:
            monitor-exit(r10)
            return
        L_0x00b3:
            monitor-exit(r10)
            return
        L_0x00b5:
            r11 = move-exception
            monitor-exit(r10)
            goto L_0x00b9
        L_0x00b8:
            throw r11
        L_0x00b9:
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuh.a(nrj, ntn, ntx):void");
    }

    public final synchronized void a(ntx ntx, String str) {
        if (!aekv.a(this.b)) {
            int i = 0;
            while (true) {
                if (i < this.h.size()) {
                    if (((nuf) this.h.get(i)).a(ntx, str)) {
                        this.h.remove(i);
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            a(ntx, str, 2);
        }
    }

    public final synchronized void a(ntx ntx, nxy nxy) {
        if (!aekv.a(this.b)) {
            b(ntx, nxy);
            a(this.g, ntx, nxy);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01b2, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b3 A[SYNTHETIC, Splitter:B:67:0x01b3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(defpackage.amnc r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            android.content.Context r0 = r12.b     // Catch:{ all -> 0x0292 }
            boolean r0 = defpackage.aekv.a(r0)     // Catch:{ all -> 0x0292 }
            r1 = 0
            if (r0 != 0) goto L_0x0285
            int r0 = r13.a     // Catch:{ all -> 0x0292 }
            r2 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r2
            r2 = 1
            if (r0 == 0) goto L_0x0029
            int r0 = r13.l     // Catch:{ all -> 0x0292 }
            if (r0 == 0) goto L_0x0018
            goto L_0x0029
        L_0x0018:
            nsb r0 = r12.f     // Catch:{ all -> 0x0292 }
            ntx r1 = defpackage.ntx.a((defpackage.amnc) r13)     // Catch:{ all -> 0x0292 }
            java.lang.String r3 = r13.h     // Catch:{ all -> 0x0292 }
            int r13 = r13.q     // Catch:{ all -> 0x0292 }
            nxy r4 = defpackage.nxy.TTL_ZERO     // Catch:{ all -> 0x0292 }
            r0.a((defpackage.ntx) r1, (java.lang.String) r3, (int) r13, (defpackage.nxy) r4)     // Catch:{ all -> 0x0292 }
            monitor-exit(r12)
            return r2
        L_0x0029:
            nue r0 = new nue     // Catch:{ all -> 0x0292 }
            r0.<init>(r13)     // Catch:{ all -> 0x0292 }
            java.util.List r3 = r12.g     // Catch:{ all -> 0x0292 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0292 }
        L_0x0034:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0292 }
            r5 = 3
            if (r4 != 0) goto L_0x0240
            ntx r3 = r0.c     // Catch:{ all -> 0x0292 }
            java.util.List r4 = r12.g     // Catch:{ all -> 0x0292 }
            int r6 = r4.size()     // Catch:{ all -> 0x0292 }
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0046:
            if (r8 >= r6) goto L_0x005c
            java.lang.Object r10 = r4.get(r8)     // Catch:{ all -> 0x0292 }
            nue r10 = (defpackage.nue) r10     // Catch:{ all -> 0x0292 }
            ntx r11 = r10.c     // Catch:{ all -> 0x0292 }
            boolean r11 = r11.equals(r3)     // Catch:{ all -> 0x0292 }
            if (r11 == 0) goto L_0x0059
            int r9 = r9 + 1
            r7 = r10
        L_0x0059:
            int r8 = r8 + 1
            goto L_0x0046
        L_0x005c:
            if (r9 == r2) goto L_0x005f
            goto L_0x0065
        L_0x005f:
            boolean r3 = r7.b     // Catch:{ all -> 0x0292 }
            if (r3 == 0) goto L_0x0065
            r3 = 1
            goto L_0x0077
        L_0x0065:
            long r3 = (long) r9     // Catch:{ all -> 0x0292 }
            axlc r6 = defpackage.axlc.a     // Catch:{ all -> 0x0292 }
            axld r6 = r6.a()     // Catch:{ all -> 0x0292 }
            long r6 = r6.s()     // Catch:{ all -> 0x0292 }
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0076
            r3 = 1
            goto L_0x0077
        L_0x0076:
            r3 = 0
        L_0x0077:
            r4 = 2
            if (r3 == 0) goto L_0x0120
            nsb r6 = r12.f     // Catch:{ all -> 0x0292 }
            ntx r7 = r0.c     // Catch:{ all -> 0x0292 }
            java.lang.String r8 = r0.d     // Catch:{ all -> 0x0292 }
            int r0 = r0.e     // Catch:{ all -> 0x0292 }
            nxy r9 = defpackage.nxy.DOZE_QUEUE_CONVERTED_TO_DIRTY_PING     // Catch:{ all -> 0x0292 }
            r6.a((defpackage.ntx) r7, (java.lang.String) r8, (int) r0, (defpackage.nxy) r9)     // Catch:{ all -> 0x0292 }
            amnc r0 = defpackage.amnc.r     // Catch:{ all -> 0x0292 }
            aucd r0 = r0.o()     // Catch:{ all -> 0x0292 }
            amnb r0 = (defpackage.amnb) r0     // Catch:{ all -> 0x0292 }
            java.lang.String r6 = r13.e     // Catch:{ all -> 0x0292 }
            boolean r7 = r0.c     // Catch:{ all -> 0x0292 }
            if (r7 != 0) goto L_0x0096
            goto L_0x009b
        L_0x0096:
            r0.c()     // Catch:{ all -> 0x0292 }
            r0.c = r1     // Catch:{ all -> 0x0292 }
        L_0x009b:
            aucj r7 = r0.b     // Catch:{ all -> 0x0292 }
            amnc r7 = (defpackage.amnc) r7     // Catch:{ all -> 0x0292 }
            r6.getClass()     // Catch:{ all -> 0x0292 }
            int r8 = r7.a     // Catch:{ all -> 0x0292 }
            r8 = r8 | 16
            r7.a = r8     // Catch:{ all -> 0x0292 }
            r7.e = r6     // Catch:{ all -> 0x0292 }
            java.lang.String r6 = ""
            r6.getClass()     // Catch:{ all -> 0x0292 }
            r8 = r8 | 4
            r7.a = r8     // Catch:{ all -> 0x0292 }
            r7.c = r6     // Catch:{ all -> 0x0292 }
            long r9 = r13.m     // Catch:{ all -> 0x0292 }
            r6 = 65536(0x10000, float:9.18355E-41)
            r6 = r6 | r8
            r7.a = r6     // Catch:{ all -> 0x0292 }
            r7.m = r9     // Catch:{ all -> 0x0292 }
            java.lang.String r8 = r13.h     // Catch:{ all -> 0x0292 }
            r8.getClass()     // Catch:{ all -> 0x0292 }
            r6 = r6 | 128(0x80, float:1.794E-43)
            r7.a = r6     // Catch:{ all -> 0x0292 }
            r7.h = r8     // Catch:{ all -> 0x0292 }
            ammv r6 = defpackage.ammv.d     // Catch:{ all -> 0x0292 }
            aucd r6 = r6.o()     // Catch:{ all -> 0x0292 }
            boolean r7 = r6.c     // Catch:{ all -> 0x0292 }
            if (r7 != 0) goto L_0x00d4
            goto L_0x00d9
        L_0x00d4:
            r6.c()     // Catch:{ all -> 0x0292 }
            r6.c = r1     // Catch:{ all -> 0x0292 }
        L_0x00d9:
            aucj r7 = r6.b     // Catch:{ all -> 0x0292 }
            ammv r7 = (defpackage.ammv) r7     // Catch:{ all -> 0x0292 }
            java.lang.String r8 = "message_type"
            r8.getClass()     // Catch:{ all -> 0x0292 }
            int r9 = r7.a     // Catch:{ all -> 0x0292 }
            r9 = r9 | r2
            r7.a = r9     // Catch:{ all -> 0x0292 }
            r7.b = r8     // Catch:{ all -> 0x0292 }
            java.lang.String r8 = "deleted_messages"
            r8.getClass()     // Catch:{ all -> 0x0292 }
            r9 = r9 | r4
            r7.a = r9     // Catch:{ all -> 0x0292 }
            r7.c = r8     // Catch:{ all -> 0x0292 }
            r0.a(r6)     // Catch:{ all -> 0x0292 }
            int r6 = r13.a     // Catch:{ all -> 0x0292 }
            r6 = r6 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x0114
            long r6 = r13.k     // Catch:{ all -> 0x0292 }
            boolean r13 = r0.c     // Catch:{ all -> 0x0292 }
            if (r13 != 0) goto L_0x0103
            goto L_0x0108
        L_0x0103:
            r0.c()     // Catch:{ all -> 0x0292 }
            r0.c = r1     // Catch:{ all -> 0x0292 }
        L_0x0108:
            aucj r13 = r0.b     // Catch:{ all -> 0x0292 }
            amnc r13 = (defpackage.amnc) r13     // Catch:{ all -> 0x0292 }
            int r8 = r13.a     // Catch:{ all -> 0x0292 }
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
            r13.a = r8     // Catch:{ all -> 0x0292 }
            r13.k = r6     // Catch:{ all -> 0x0292 }
        L_0x0114:
            aucj r13 = r0.i()     // Catch:{ all -> 0x0292 }
            amnc r13 = (defpackage.amnc) r13     // Catch:{ all -> 0x0292 }
            nue r0 = new nue     // Catch:{ all -> 0x0292 }
            r0.<init>(r13, r2)     // Catch:{ all -> 0x0292 }
            goto L_0x0121
        L_0x0120:
        L_0x0121:
            nrp r6 = defpackage.nrp.e     // Catch:{ all -> 0x0292 }
            aucd r6 = r6.o()     // Catch:{ all -> 0x0292 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0292 }
            boolean r9 = r6.c     // Catch:{ all -> 0x0292 }
            if (r9 != 0) goto L_0x0130
            goto L_0x0135
        L_0x0130:
            r6.c()     // Catch:{ all -> 0x0292 }
            r6.c = r1     // Catch:{ all -> 0x0292 }
        L_0x0135:
            aucj r9 = r6.b     // Catch:{ all -> 0x0292 }
            nrp r9 = (defpackage.nrp) r9     // Catch:{ all -> 0x0292 }
            int r10 = r9.a     // Catch:{ all -> 0x0292 }
            r10 = r10 | r2
            r9.a = r10     // Catch:{ all -> 0x0292 }
            r9.b = r7     // Catch:{ all -> 0x0292 }
            r13.getClass()     // Catch:{ all -> 0x0292 }
            r9.c = r13     // Catch:{ all -> 0x0292 }
            r7 = r10 | 2
            r9.a = r7     // Catch:{ all -> 0x0292 }
            r9.d = r4     // Catch:{ all -> 0x0292 }
            r7 = r7 | 4
            r9.a = r7     // Catch:{ all -> 0x0292 }
            aucj r6 = r6.i()     // Catch:{ all -> 0x0292 }
            nrp r6 = (defpackage.nrp) r6     // Catch:{ all -> 0x0292 }
            nvq r7 = r12.c     // Catch:{ all -> 0x0292 }
            boolean r6 = r7.a((defpackage.aucj) r6)     // Catch:{ all -> 0x0292 }
            if (r6 == 0) goto L_0x01b3
            java.util.List r1 = r12.g     // Catch:{ all -> 0x0292 }
            r1.add(r0)     // Catch:{ all -> 0x0292 }
            nsb r1 = r12.f     // Catch:{ all -> 0x0292 }
            ntx r4 = defpackage.ntx.a((defpackage.amnc) r13)     // Catch:{ all -> 0x0292 }
            java.lang.String r6 = r13.h     // Catch:{ all -> 0x0292 }
            int r13 = r13.q     // Catch:{ all -> 0x0292 }
            nxw r7 = defpackage.nxw.WRITTEN_TO_DOZE_QUEUE     // Catch:{ all -> 0x0292 }
            r1.a((defpackage.ntx) r4, (java.lang.String) r6, (int) r13, (defpackage.nxw) r7)     // Catch:{ all -> 0x0292 }
            if (r3 == 0) goto L_0x01b1
            java.util.List r13 = r12.g     // Catch:{ all -> 0x0292 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x0292 }
        L_0x0179:
            boolean r1 = r13.hasNext()     // Catch:{ all -> 0x0292 }
            if (r1 == 0) goto L_0x01b1
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x0292 }
            nue r1 = (defpackage.nue) r1     // Catch:{ all -> 0x0292 }
            ntx r3 = r1.c     // Catch:{ all -> 0x0292 }
            ntx r4 = r0.c     // Catch:{ all -> 0x0292 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0292 }
            if (r3 == 0) goto L_0x0179
            java.lang.String r3 = r1.d     // Catch:{ all -> 0x0292 }
            java.lang.String r4 = r0.d     // Catch:{ all -> 0x0292 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0292 }
            if (r3 != 0) goto L_0x0179
            r13.remove()     // Catch:{ all -> 0x0292 }
            ntx r3 = r1.c     // Catch:{ all -> 0x0292 }
            java.lang.String r4 = r1.d     // Catch:{ all -> 0x0292 }
            r12.a((defpackage.ntx) r3, (java.lang.String) r4, (int) r5)     // Catch:{ all -> 0x0292 }
            nsb r3 = r12.f     // Catch:{ all -> 0x0292 }
            ntx r4 = r1.c     // Catch:{ all -> 0x0292 }
            java.lang.String r6 = r1.d     // Catch:{ all -> 0x0292 }
            int r1 = r1.e     // Catch:{ all -> 0x0292 }
            nxy r7 = defpackage.nxy.DOZE_QUEUE_DROPPED_DUE_TO_DIRTY_PING     // Catch:{ all -> 0x0292 }
            r3.a((defpackage.ntx) r4, (java.lang.String) r6, (int) r1, (defpackage.nxy) r7)     // Catch:{ all -> 0x0292 }
            goto L_0x0179
        L_0x01b1:
            monitor-exit(r12)
            return r2
        L_0x01b3:
            nsb r13 = r12.f     // Catch:{ all -> 0x0292 }
            ntx r3 = r0.c     // Catch:{ all -> 0x0292 }
            java.lang.String r5 = r0.d     // Catch:{ all -> 0x0292 }
            int r0 = r0.e     // Catch:{ all -> 0x0292 }
            boolean r6 = defpackage.axkq.b()     // Catch:{ all -> 0x0292 }
            if (r6 == 0) goto L_0x0231
            nya r6 = defpackage.nya.k     // Catch:{ all -> 0x0292 }
            aucd r6 = r6.o()     // Catch:{ all -> 0x0292 }
            boolean r7 = r6.c     // Catch:{ all -> 0x0292 }
            if (r7 != 0) goto L_0x01cc
            goto L_0x01d1
        L_0x01cc:
            r6.c()     // Catch:{ all -> 0x0292 }
            r6.c = r1     // Catch:{ all -> 0x0292 }
        L_0x01d1:
            aucj r7 = r6.b     // Catch:{ all -> 0x0292 }
            nya r7 = (defpackage.nya) r7     // Catch:{ all -> 0x0292 }
            r5.getClass()     // Catch:{ all -> 0x0292 }
            int r8 = r7.a     // Catch:{ all -> 0x0292 }
            r2 = r2 | r8
            r7.a = r2     // Catch:{ all -> 0x0292 }
            r7.d = r5     // Catch:{ all -> 0x0292 }
            java.lang.String r5 = r3.a     // Catch:{ all -> 0x0292 }
            r5.getClass()     // Catch:{ all -> 0x0292 }
            r2 = r2 | r4
            r7.a = r2     // Catch:{ all -> 0x0292 }
            r7.e = r5     // Catch:{ all -> 0x0292 }
            int r3 = r3.b     // Catch:{ all -> 0x0292 }
            r2 = r2 | 4
            r7.a = r2     // Catch:{ all -> 0x0292 }
            r7.f = r3     // Catch:{ all -> 0x0292 }
            r2 = r2 | 8
            r7.a = r2     // Catch:{ all -> 0x0292 }
            r7.g = r0     // Catch:{ all -> 0x0292 }
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0292 }
            r7.c = r0     // Catch:{ all -> 0x0292 }
            r0 = 6
            r7.b = r0     // Catch:{ all -> 0x0292 }
            aucj r0 = r6.i()     // Catch:{ all -> 0x0292 }
            nya r0 = (defpackage.nya) r0     // Catch:{ all -> 0x0292 }
            nsa r2 = r13.a     // Catch:{ all -> 0x0292 }
            nyb r3 = defpackage.nyb.c     // Catch:{ all -> 0x0292 }
            aucd r3 = r3.o()     // Catch:{ all -> 0x0292 }
            boolean r4 = r3.c     // Catch:{ all -> 0x0292 }
            if (r4 != 0) goto L_0x0214
            goto L_0x0219
        L_0x0214:
            r3.c()     // Catch:{ all -> 0x0292 }
            r3.c = r1     // Catch:{ all -> 0x0292 }
        L_0x0219:
            aucj r4 = r3.b     // Catch:{ all -> 0x0292 }
            nyb r4 = (defpackage.nyb) r4     // Catch:{ all -> 0x0292 }
            r0.getClass()     // Catch:{ all -> 0x0292 }
            r4.b = r0     // Catch:{ all -> 0x0292 }
            int r0 = r4.a     // Catch:{ all -> 0x0292 }
            r0 = r0 | 4
            r4.a = r0     // Catch:{ all -> 0x0292 }
            aucj r0 = r3.i()     // Catch:{ all -> 0x0292 }
            nyb r0 = (defpackage.nyb) r0     // Catch:{ all -> 0x0292 }
            r2.a(r0)     // Catch:{ all -> 0x0292 }
        L_0x0231:
            nsa r13 = r13.a     // Catch:{ all -> 0x0292 }
            hph r13 = r13.a     // Catch:{ all -> 0x0292 }
            java.lang.String r0 = "DOZE_QUEUE_WRITE_FAILED"
            hox r13 = r13.c(r0)     // Catch:{ all -> 0x0292 }
            r13.a()     // Catch:{ all -> 0x0292 }
            monitor-exit(r12)
            return r1
        L_0x0240:
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0292 }
            nue r4 = (defpackage.nue) r4     // Catch:{ all -> 0x0292 }
            java.lang.String r6 = r4.a     // Catch:{ all -> 0x0292 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0292 }
            if (r6 != 0) goto L_0x0034
            java.lang.String r6 = r4.a     // Catch:{ all -> 0x0292 }
            java.lang.String r7 = "do_not_collapse"
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0292 }
            if (r6 != 0) goto L_0x0034
            ntx r6 = r4.c     // Catch:{ all -> 0x0292 }
            ntx r7 = r0.c     // Catch:{ all -> 0x0292 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0292 }
            if (r6 == 0) goto L_0x0034
            java.lang.String r6 = r4.a     // Catch:{ all -> 0x0292 }
            java.lang.String r7 = r0.a     // Catch:{ all -> 0x0292 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0292 }
            if (r6 == 0) goto L_0x0034
            r3.remove()     // Catch:{ all -> 0x0292 }
            ntx r6 = r4.c     // Catch:{ all -> 0x0292 }
            java.lang.String r7 = r4.d     // Catch:{ all -> 0x0292 }
            r12.a((defpackage.ntx) r6, (java.lang.String) r7, (int) r5)     // Catch:{ all -> 0x0292 }
            nsb r5 = r12.f     // Catch:{ all -> 0x0292 }
            ntx r6 = r4.c     // Catch:{ all -> 0x0292 }
            java.lang.String r7 = r4.d     // Catch:{ all -> 0x0292 }
            int r4 = r4.e     // Catch:{ all -> 0x0292 }
            nxy r8 = defpackage.nxy.DOZE_QUEUE_COLLAPSED     // Catch:{ all -> 0x0292 }
            r5.a((defpackage.ntx) r6, (java.lang.String) r7, (int) r4, (defpackage.nxy) r8)     // Catch:{ all -> 0x0292 }
            goto L_0x0034
        L_0x0285:
            hph r13 = r12.e     // Catch:{ all -> 0x0292 }
            java.lang.String r0 = "DIRECT_BOOT_DOZE_QUEUE_IGNORED"
            hox r13 = r13.c(r0)     // Catch:{ all -> 0x0292 }
            r13.a()     // Catch:{ all -> 0x0292 }
            monitor-exit(r12)
            return r1
        L_0x0292:
            r13 = move-exception
            monitor-exit(r12)
            goto L_0x0296
        L_0x0295:
            throw r13
        L_0x0296:
            goto L_0x0295
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuh.a(amnc):boolean");
    }
}
