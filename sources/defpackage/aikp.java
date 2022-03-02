package defpackage;

import android.location.Location;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: aikp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aikp {
    public final ou a = new ou();
    public final aucd b = ailw.d.o();
    private ArrayBlockingQueue c = null;
    private ArrayBlockingQueue d = null;
    private final int e;

    public aikp(int i) {
        if (i > 0) {
            if (aybx.b()) {
                this.d = new ArrayBlockingQueue(i);
            } else {
                this.c = new ArrayBlockingQueue(i);
            }
        }
        this.e = i;
    }

    public final void a(int i, int i2) {
        if (aybx.d()) {
            a((aiky) new aiks(i, i2));
        }
    }

    public final void b(int i, int i2) {
        if (aybx.d()) {
            a((aiky) new aikw(i, i2));
        }
    }

    public final void a(int i, int i2, aijt aijt) {
        if (!aybx.d()) {
            return;
        }
        if (aijt != null) {
            a((aiky) new aikz(i, aijt.a(""), i2));
        } else {
            a((aiky) new aikz(i, (ailt) null, i2));
        }
    }

    public final void a(int i, Location location, int i2) {
        if (aybx.e()) {
            a((aiky) new aikv(i, location, i2));
        }
    }

    public final void a(int i, String str, List list, int i2, boolean z) {
        a((aiky) new aiku(i, str, i2, z, list, this.a, this.b));
    }

    public final void a(int i, boolean z, int i2) {
        if (aybx.e()) {
            a((aiky) new aila(i, z, i2));
        }
    }

    public final void a(int i, boolean z, String str) {
        a((aiky) new ailb(i, str, z));
    }

    public final synchronized void a(aikn aikn) {
        ArrayBlockingQueue arrayBlockingQueue = this.c;
        if (arrayBlockingQueue != null) {
            if (arrayBlockingQueue.remainingCapacity() == 0) {
                this.c.poll();
            }
            this.c.add(aikn);
        }
    }

    public final synchronized void a(aiky aiky) {
        ArrayBlockingQueue arrayBlockingQueue = this.d;
        if (arrayBlockingQueue != null) {
            if (arrayBlockingQueue.remainingCapacity() == 0) {
                this.d.poll();
            }
            this.d.add(aiky);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0153, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.io.PrintWriter r11, java.util.List r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = r10.e     // Catch:{ all -> 0x0154 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0154 }
            r2 = 32
            r1.<init>(r2)     // Catch:{ all -> 0x0154 }
            java.lang.String r2 = "LogRecords: capacity="
            r1.append(r2)     // Catch:{ all -> 0x0154 }
            r1.append(r0)     // Catch:{ all -> 0x0154 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0154 }
            r11.println(r0)     // Catch:{ all -> 0x0154 }
            boolean r0 = defpackage.aybx.b()     // Catch:{ all -> 0x0154 }
            if (r0 == 0) goto L_0x0128
            ailg r0 = defpackage.ailg.d     // Catch:{ all -> 0x0154 }
            aucd r0 = r0.o()     // Catch:{ all -> 0x0154 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0154 }
            r1 = 0
            r2 = 0
        L_0x002b:
            boolean r3 = r12.hasNext()     // Catch:{ all -> 0x0154 }
            if (r3 == 0) goto L_0x0071
            java.lang.Object r3 = r12.next()     // Catch:{ all -> 0x0154 }
            aijt r3 = (defpackage.aijt) r3     // Catch:{ all -> 0x0154 }
            ou r4 = r10.a     // Catch:{ all -> 0x0154 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0154 }
            r4.put(r3, r5)     // Catch:{ all -> 0x0154 }
            aucd r4 = r10.b     // Catch:{ all -> 0x0154 }
            java.lang.String r5 = ""
            ailt r3 = r3.a((java.lang.String) r5)     // Catch:{ all -> 0x0154 }
            r4.a((defpackage.ailt) r3)     // Catch:{ all -> 0x0154 }
            boolean r3 = r0.c     // Catch:{ all -> 0x0154 }
            if (r3 != 0) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            r0.c()     // Catch:{ all -> 0x0154 }
            r0.c = r1     // Catch:{ all -> 0x0154 }
        L_0x0055:
            aucj r3 = r0.b     // Catch:{ all -> 0x0154 }
            ailg r3 = (defpackage.ailg) r3     // Catch:{ all -> 0x0154 }
            aucs r4 = r3.c     // Catch:{ all -> 0x0154 }
            boolean r4 = r4.a()     // Catch:{ all -> 0x0154 }
            if (r4 != 0) goto L_0x0069
            aucs r4 = r3.c     // Catch:{ all -> 0x0154 }
            aucs r4 = defpackage.aucj.a((defpackage.aucs) r4)     // Catch:{ all -> 0x0154 }
            r3.c = r4     // Catch:{ all -> 0x0154 }
        L_0x0069:
            aucs r3 = r3.c     // Catch:{ all -> 0x0154 }
            r3.d(r2)     // Catch:{ all -> 0x0154 }
            int r2 = r2 + 1
            goto L_0x002b
        L_0x0071:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0154 }
            long r4 = defpackage.aybx.c()     // Catch:{ all -> 0x0154 }
            java.util.concurrent.ArrayBlockingQueue r12 = r10.d     // Catch:{ all -> 0x0154 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0154 }
        L_0x007f:
            boolean r6 = r12.hasNext()     // Catch:{ all -> 0x0154 }
            if (r6 == 0) goto L_0x00c4
            java.lang.Object r6 = r12.next()     // Catch:{ all -> 0x0154 }
            aiky r6 = (defpackage.aiky) r6     // Catch:{ all -> 0x0154 }
            aucd r7 = r6.a     // Catch:{ all -> 0x0154 }
            aucj r7 = r7.b     // Catch:{ all -> 0x0154 }
            ailk r7 = (defpackage.ailk) r7     // Catch:{ all -> 0x0154 }
            long r7 = r7.d     // Catch:{ all -> 0x0154 }
            long r7 = r2 - r7
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x007f
            ailk r6 = r6.a()     // Catch:{ all -> 0x0154 }
            boolean r7 = r0.c     // Catch:{ all -> 0x0154 }
            if (r7 != 0) goto L_0x00a2
            goto L_0x00a7
        L_0x00a2:
            r0.c()     // Catch:{ all -> 0x0154 }
            r0.c = r1     // Catch:{ all -> 0x0154 }
        L_0x00a7:
            aucj r7 = r0.b     // Catch:{ all -> 0x0154 }
            ailg r7 = (defpackage.ailg) r7     // Catch:{ all -> 0x0154 }
            r6.getClass()     // Catch:{ all -> 0x0154 }
            aucx r8 = r7.a     // Catch:{ all -> 0x0154 }
            boolean r8 = r8.a()     // Catch:{ all -> 0x0154 }
            if (r8 != 0) goto L_0x00be
            aucx r8 = r7.a     // Catch:{ all -> 0x0154 }
            aucx r8 = defpackage.aucj.a((defpackage.aucx) r8)     // Catch:{ all -> 0x0154 }
            r7.a = r8     // Catch:{ all -> 0x0154 }
        L_0x00be:
            aucx r7 = r7.a     // Catch:{ all -> 0x0154 }
            r7.add(r6)     // Catch:{ all -> 0x0154 }
            goto L_0x007f
        L_0x00c4:
            aucd r12 = r10.b     // Catch:{ all -> 0x0154 }
            aucj r12 = r12.i()     // Catch:{ all -> 0x0154 }
            ailw r12 = (defpackage.ailw) r12     // Catch:{ all -> 0x0154 }
            boolean r2 = r0.c     // Catch:{ all -> 0x0154 }
            if (r2 != 0) goto L_0x00d1
            goto L_0x00d6
        L_0x00d1:
            r0.c()     // Catch:{ all -> 0x0154 }
            r0.c = r1     // Catch:{ all -> 0x0154 }
        L_0x00d6:
            aucj r2 = r0.b     // Catch:{ all -> 0x0154 }
            ailg r2 = (defpackage.ailg) r2     // Catch:{ all -> 0x0154 }
            r12.getClass()     // Catch:{ all -> 0x0154 }
            r2.b = r12     // Catch:{ all -> 0x0154 }
            aucj r12 = r0.i()     // Catch:{ all -> 0x0154 }
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0154 }
            java.lang.String r3 = "GeofencerDumpsysLogMessage"
            r2[r1] = r3     // Catch:{ all -> 0x0154 }
            java.lang.String r4 = "### %s START ###%n"
            r11.printf(r4, r2)     // Catch:{ all -> 0x0154 }
            byte[] r12 = r12.k()     // Catch:{ RuntimeException -> 0x00fd }
            anml r2 = defpackage.anml.e     // Catch:{ RuntimeException -> 0x00fd }
            java.lang.String r12 = r2.a((byte[]) r12)     // Catch:{ RuntimeException -> 0x00fd }
            r11.println(r12)     // Catch:{ RuntimeException -> 0x00fd }
            goto L_0x010b
        L_0x00fd:
            r12 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0154 }
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0154 }
            r2[r1] = r12     // Catch:{ all -> 0x0154 }
            java.lang.String r12 = "ERROR: %s%n"
            r11.printf(r12, r2)     // Catch:{ all -> 0x0154 }
        L_0x010b:
            java.lang.Object[] r12 = new java.lang.Object[r0]     // Catch:{ all -> 0x0154 }
            r12[r1] = r3     // Catch:{ all -> 0x0154 }
            java.lang.String r0 = "### %s END ###%n"
            r11.printf(r0, r12)     // Catch:{ all -> 0x0154 }
            ou r11 = r10.a     // Catch:{ all -> 0x0154 }
            r11.clear()     // Catch:{ all -> 0x0154 }
            aucd r11 = r10.b     // Catch:{ all -> 0x0154 }
            aucj r12 = r11.b     // Catch:{ all -> 0x0154 }
            r0 = 4
            java.lang.Object r12 = r12.c(r0)     // Catch:{ all -> 0x0154 }
            aucj r12 = (defpackage.aucj) r12     // Catch:{ all -> 0x0154 }
            r11.b = r12     // Catch:{ all -> 0x0154 }
            monitor-exit(r10)
            return
        L_0x0128:
            java.util.concurrent.ArrayBlockingQueue r12 = r10.c     // Catch:{ all -> 0x0154 }
            if (r12 == 0) goto L_0x0152
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0154 }
            long r2 = defpackage.aybx.c()     // Catch:{ all -> 0x0154 }
            java.util.concurrent.ArrayBlockingQueue r12 = r10.c     // Catch:{ all -> 0x0154 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0154 }
        L_0x013a:
            boolean r4 = r12.hasNext()     // Catch:{ all -> 0x0154 }
            if (r4 == 0) goto L_0x0152
            java.lang.Object r4 = r12.next()     // Catch:{ all -> 0x0154 }
            aikn r4 = (defpackage.aikn) r4     // Catch:{ all -> 0x0154 }
            long r5 = r4.b     // Catch:{ all -> 0x0154 }
            long r5 = r0 - r5
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 > 0) goto L_0x013a
            r4.a(r11)     // Catch:{ all -> 0x0154 }
            goto L_0x013a
        L_0x0152:
            monitor-exit(r10)
            return
        L_0x0154:
            r11 = move-exception
            monitor-exit(r10)
            goto L_0x0158
        L_0x0157:
            throw r11
        L_0x0158:
            goto L_0x0157
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aikp.a(java.io.PrintWriter, java.util.List):void");
    }
}
