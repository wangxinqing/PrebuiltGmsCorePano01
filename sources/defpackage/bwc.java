package defpackage;

import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.awareness.snapshot.internal.SnapshotRequest;
import com.google.android.gms.contextmanager.ContextData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: bwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bwc extends bvs implements bvt {
    public final bwa a;
    public final HashMap b = new HashMap();
    private final Object c = new Object();
    private boolean d = true;

    public bwc(bwa bwa) {
        super(bwa.a());
        this.a = bwa;
    }

    private final void b(bzm bzm) {
        bzk bzk = bzm.b;
        ArrayList arrayList = new ArrayList();
        Set<Integer> m = bzk.m();
        CountDownLatch countDownLatch = new CountDownLatch(m.size());
        for (Integer intValue : m) {
            int intValue2 = intValue.intValue();
            if (intValue2 != 26) {
                jwz a2 = jwz.a((idg) new bvz(this, arrayList, intValue2, countDownLatch, bzm, m));
                SnapshotRequest snapshotRequest = new SnapshotRequest(0, (ArrayList) null, intValue2);
                if (intValue2 == 1) {
                    long b2 = ayew.b();
                    snapshotRequest.d = b2;
                    new Object[1][0] = Long.valueOf(b2);
                }
                new cif(a2, this.a.a, snapshotRequest).a(bvq.a("FenceListenerConsumer_snapshot"));
            } else {
                ((anih) ((anih) bxk.a.b()).a("bwc", "b", 441, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceListenerConsumer] Fence-to-Snapshot DETECTED_BEACON not supported!");
                return;
            }
        }
    }

    private final void f() {
        synchronized (this.c) {
            this.d = false;
        }
        cbi.k().a(new bvx(this), bvq.a("remove_canceled_consumer"));
    }

    public final bzm a(String str) {
        return (bzm) this.b.remove(str);
    }

    public final void a(bsz bsz, Collection collection, bun bun, but but) {
    }

    public final Set c() {
        return this.b.keySet();
    }

    public final Collection d() {
        return this.b.values();
    }

    public final boolean e() {
        return this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bwc) {
            return this.a.equals(((bwc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String obj = super.toString();
        int identityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 12);
        sb.append(obj);
        sb.append("-");
        sb.append(identityHashCode);
        return sb.toString();
    }

    public final void a(bsz bsz, ContextData contextData) {
        for (bzm a2 : d()) {
            a(bsz, contextData, a2);
        }
    }

    /* JADX WARNING: type inference failed for: r2v15, types: [java.util.List, java.util.Collection] */
    public final void a(bsz bsz, ContextData contextData, bzm bzm) {
        int i;
        bsz bsz2 = bsz;
        bzm bzm2 = bzm;
        new Object[1][0] = contextData;
        bsz g = super.g();
        if (g == null || !g.equals(bsz2)) {
            ((anih) ((anih) bxk.a.b()).a("bwc", "a", 131, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceListenerConsumer] Mismatched account name on deliver.  Expected %s, got %s", (Object) g, (Object) bsz2);
            return;
        }
        bzk bzk = bzm2.b;
        int i2 = bzm2.l;
        if (contextData != null) {
            bzk.a(contextData.c());
        }
        boolean z = cbi.E().d;
        int a2 = bzk.a(cbi.i().a(), z);
        if (z) {
            if (a2 != 0) {
                List list = bzk.j;
                Set m = bzk.m();
                if (!jir.a((Collection) m) && awuz.v() > 0) {
                    list = new ArrayList(bzk.j);
                    list.addAll(m);
                }
                Collection collection = bzm2.d;
                if (collection != null) {
                    list.addAll(collection);
                }
                bzm2.a(list);
            } else {
                List list2 = bzk.i;
                if (list2 != null && !list2.isEmpty()) {
                    Collections.sort(bzk.i, byi.a);
                    int a3 = byi.a(((bzk) bzk.i.get(0)).a);
                    List list3 = bzk.i;
                    int size = list3.size();
                    int i3 = 0;
                    boolean z2 = false;
                    while (i3 < size) {
                        bzk bzk2 = (bzk) list3.get(i3);
                        if (z2 && byi.a(bzk2.a) > a3) {
                            break;
                        }
                        int[] g2 = bzk2.g();
                        int length = g2.length;
                        int i4 = 0;
                        while (true) {
                            i = i3 + 1;
                            if (i4 >= length) {
                                break;
                            }
                            z2 |= bzm2.a(g2[i4]);
                            i4++;
                        }
                        i3 = i;
                    }
                } else {
                    ((anih) ((anih) bxk.a.b()).a("bwc", "a", 153, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceListenerConsumer] Unexpected fence value computed.");
                }
                ? r2 = bzm2.d;
                if (r2 != 0) {
                    int size2 = r2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        bzm2.a(((Integer) r2.get(i5)).intValue());
                    }
                }
            }
        }
        if (bzm2.k != a2) {
            Object[] objArr = {FenceState.a(i2), FenceState.a(bzm2.k), FenceState.a(a2)};
            long j = bzk.k;
            if (j > 0) {
                bzm2.o = j;
                Object[] objArr2 = {bzm2.a, Long.valueOf(cbi.i().a() - bzm2.o)};
            } else {
                bzm2.o = cbi.i().a();
            }
            bzm2.k = a2;
            if (!jir.a((Collection) bzk.m())) {
                bzk bzk3 = bzm2.b;
                ArrayList arrayList = new ArrayList();
                Set m2 = bzk3.m();
                CountDownLatch countDownLatch = new CountDownLatch(m2.size());
                Iterator it = m2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        int intValue = ((Integer) it.next()).intValue();
                        if (intValue == 26) {
                            ((anih) ((anih) bxk.a.b()).a("bwc", "b", 441, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceListenerConsumer] Fence-to-Snapshot DETECTED_BEACON not supported!");
                            break;
                        }
                        jwz a4 = jwz.a((idg) new bvz(this, arrayList, intValue, countDownLatch, bzm, m2));
                        SnapshotRequest snapshotRequest = new SnapshotRequest(0, (ArrayList) null, intValue);
                        if (intValue == 1) {
                            long b2 = ayew.b();
                            snapshotRequest.d = b2;
                            new Object[1][0] = Long.valueOf(b2);
                        }
                        new cif(a4, this.a.a, snapshotRequest).a(bvq.a("FenceListenerConsumer_snapshot"));
                    } else {
                        break;
                    }
                }
            } else {
                a(bzm2);
            }
        }
        bzm.a(bzm2, 4);
    }

    public final bzm b(String str) {
        return (bzm) this.b.get(str);
    }

    public final boolean b() {
        boolean z;
        synchronized (this.c) {
            z = this.d;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:94:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.bzm r29) {
        /*
            r28 = this;
            r1 = r28
            r2 = r29
            java.lang.String r7 = r2.a
            int r8 = r2.l
            int r10 = r2.k
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r11 = 0
            r3[r11] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r12 = 1
            r3[r12] = r4
            if (r8 == r10) goto L_0x02ac
            bzk r3 = r2.b
            java.util.ArrayList r4 = r2.n
            if (r4 != 0) goto L_0x002a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.n = r4
        L_0x002a:
            java.util.ArrayList r4 = r2.n
            r13 = 0
            boolean r14 = r3.a((java.util.Collection) r4, (java.util.Collection) r13)
            java.util.Set r4 = r3.m()
            boolean r4 = defpackage.jir.a((java.util.Collection) r4)
            if (r4 != 0) goto L_0x003e
            r22 = 1
            goto L_0x0045
        L_0x003e:
            if (r14 == 0) goto L_0x0043
            r22 = 2
            goto L_0x0045
        L_0x0043:
            r22 = 0
        L_0x0045:
            long r4 = r3.k
            r15 = 0
            int r9 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r9 <= 0) goto L_0x005e
            jiq r4 = defpackage.cbi.i()
            long r4 = r4.a()
            r23 = r14
            long r13 = r3.k
            long r4 = r4 - r13
            int r5 = (int) r4
            r21 = r5
            goto L_0x0062
        L_0x005e:
            r23 = r14
            r21 = -1
        L_0x0062:
            bwa r4 = r1.a
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r13 = r4.a
            java.lang.String r14 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r9 = "a"
            java.lang.String r5 = "bwc"
            boolean r4 = defpackage.awuz.l()
            if (r4 != 0) goto L_0x0073
            goto L_0x00b3
        L_0x0073:
            java.util.List r4 = r3.j
            int r15 = r4.size()
            r6 = 0
        L_0x007a:
            if (r6 >= r15) goto L_0x00b3
            java.lang.Object r17 = r4.get(r6)
            java.lang.Integer r17 = (java.lang.Integer) r17
            int r11 = r17.intValue()
            bti r0 = defpackage.cbi.l()
            int r0 = r0.a(r11, r13)
            int r6 = r6 + 1
            if (r0 == 0) goto L_0x00b0
            jjg r2 = defpackage.bxk.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            r3 = 277(0x115, float:3.88E-43)
            anie r2 = r2.a((java.lang.String) r5, (java.lang.String) r9, (int) r3, (java.lang.String) r14)
            anih r2 = (defpackage.anih) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "[FenceListenerConsumer] Permission denied to notify %s of %s: %s"
            r2.a((java.lang.String) r4, (java.lang.Object) r13, (java.lang.Object) r3, (java.lang.Object) r0)
            return
        L_0x00b0:
            r0 = 2
            r11 = 0
            goto L_0x007a
        L_0x00b3:
            bwa r0 = r1.a
            int r4 = r0.b
            r15 = 4
            if (r4 == r12) goto L_0x01e2
            r6 = 2
            if (r4 == r6) goto L_0x00d8
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r3 = 394(0x18a, float:5.52E-43)
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r9, (int) r3, (java.lang.String) r14)
            anih r0 = (defpackage.anih) r0
            bwa r3 = r1.a
            int r3 = r3.b
            java.lang.String r4 = "[FenceListenerConsumer] Unknown type=%s"
            r0.a((java.lang.String) r4, (int) r3)
            goto L_0x028e
        L_0x00d8:
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r0 = 0
            r4[r0] = r7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r4[r12] = r0
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r4 = "context_fence_current_state"
            r0.putExtra(r4, r10)
            java.lang.String r4 = "context_fence_previous_state"
            r0.putExtra(r4, r8)
            java.lang.String r4 = "context_fence_key"
            r0.putExtra(r4, r7)
            long r6 = r2.o
            java.lang.String r4 = "context_fence_last_updated_time"
            r0.putExtra(r4, r6)
            atjs r4 = r3.a
            atjs r6 = defpackage.atjs.SHUSH_STATE_FENCE
            if (r4 != r6) goto L_0x0116
            awuz r4 = defpackage.awuz.a
            awva r4 = r4.a()
            boolean r4 = r4.aC()
            if (r4 == 0) goto L_0x0116
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r0.setFlags(r4)
        L_0x0116:
            java.util.ArrayList r4 = r2.n
            boolean r4 = defpackage.jir.a((java.util.Collection) r4)
            if (r4 != 0) goto L_0x0125
            java.util.ArrayList r4 = r2.n
            java.lang.String r6 = "context_data_list"
            defpackage.ivy.a((java.lang.Iterable) r4, (android.content.Intent) r0, (java.lang.String) r6)
        L_0x0125:
            r4 = 2
            if (r10 != r4) goto L_0x012a
            r4 = 1
            goto L_0x012b
        L_0x012a:
            r4 = 0
        L_0x012b:
            java.lang.String r6 = "is_triggered"
            r0.putExtra(r6, r4)
            bwa r4 = r1.a     // Catch:{ CanceledException -> 0x01a9 }
            android.app.PendingIntent r4 = r4.d     // Catch:{ CanceledException -> 0x01a9 }
            boolean r6 = r3.g     // Catch:{ CanceledException -> 0x01a9 }
            if (r6 != 0) goto L_0x0186
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ CanceledException -> 0x01a9 }
            r6.<init>()     // Catch:{ CanceledException -> 0x01a9 }
            r3.a((java.util.Set) r6)     // Catch:{ CanceledException -> 0x01a9 }
            boolean r7 = r6.isEmpty()     // Catch:{ CanceledException -> 0x01a9 }
            if (r7 != 0) goto L_0x0181
            java.util.Iterator r6 = r6.iterator()     // Catch:{ CanceledException -> 0x01a9 }
            r7 = -1
            r8 = 0
        L_0x014d:
            boolean r13 = r6.hasNext()     // Catch:{ CanceledException -> 0x01a9 }
            if (r13 == 0) goto L_0x0180
            java.lang.Object r13 = r6.next()     // Catch:{ CanceledException -> 0x01a9 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ CanceledException -> 0x01a9 }
            int r13 = r13.intValue()     // Catch:{ CanceledException -> 0x01a9 }
            boolean r16 = defpackage.bta.a(r13)     // Catch:{ CanceledException -> 0x01a9 }
            if (r16 != 0) goto L_0x017d
            boolean r16 = defpackage.bta.b(r13)     // Catch:{ CanceledException -> 0x01a9 }
            r11 = 6
            if (r16 == 0) goto L_0x016e
            java.lang.String r8 = "com.google.android.gms.permission.ACTIVITY_RECOGNITION"
            r7 = 6
            goto L_0x017c
        L_0x016e:
            if (r7 == r11) goto L_0x017b
            boolean r11 = defpackage.bta.e(r13)     // Catch:{ CanceledException -> 0x01a9 }
            if (r11 == 0) goto L_0x017b
            java.lang.String r8 = "android.permission.BLUETOOTH"
            r7 = 26
            goto L_0x017c
        L_0x017b:
        L_0x017c:
            goto L_0x014d
        L_0x017d:
            java.lang.String r8 = "android.permission.ACCESS_FINE_LOCATION"
            goto L_0x0182
        L_0x0180:
            goto L_0x0182
        L_0x0181:
            r8 = 0
        L_0x0182:
            r3.f = r8     // Catch:{ CanceledException -> 0x01a9 }
            r3.g = r12     // Catch:{ CanceledException -> 0x01a9 }
        L_0x0186:
            java.lang.String r3 = r3.f     // Catch:{ CanceledException -> 0x01a9 }
            defpackage.bvc.a(r4, r0, r3)     // Catch:{ CanceledException -> 0x01a9 }
            buc r0 = defpackage.cbi.F()     // Catch:{ CanceledException -> 0x01a9 }
            java.lang.String r3 = r2.f     // Catch:{ CanceledException -> 0x01a9 }
            java.lang.String r4 = r2.h     // Catch:{ CanceledException -> 0x01a9 }
            r6 = 2
            if (r10 != r6) goto L_0x0199
            r18 = 3
            goto L_0x019b
        L_0x0199:
            r18 = 4
        L_0x019b:
            r20 = 1
            r15 = r0
            r16 = r3
            r17 = r4
            r19 = r22
            r15.a(r16, r17, r18, r19, r20, r21)     // Catch:{ CanceledException -> 0x01a9 }
            goto L_0x028e
        L_0x01a9:
            r0 = move-exception
            jjg r3 = defpackage.bxk.a
            anie r3 = r3.c()
            anih r3 = (defpackage.anih) r3
            r3.a((java.lang.Throwable) r0)
            r0 = 380(0x17c, float:5.32E-43)
            anie r0 = r3.a((java.lang.String) r5, (java.lang.String) r9, (int) r0, (java.lang.String) r14)
            anih r0 = (defpackage.anih) r0
            java.lang.String r3 = r2.f
            aqcr r3 = defpackage.aqcr.a(r3)
            java.lang.String r4 = "[FenceListenerConsumer] Couldn't trigger fence; %s unreachable."
            r0.a((java.lang.String) r4, (java.lang.Object) r3)
            buc r15 = defpackage.cbi.F()
            java.lang.String r0 = r2.f
            java.lang.String r3 = r2.h
            r18 = 5
            r20 = 1
            r16 = r0
            r17 = r3
            r19 = r22
            r15.a(r16, r17, r18, r19, r20)
            r28.f()
            goto L_0x028e
        L_0x01e2:
            int r3 = r13.e     // Catch:{ RemoteException -> 0x024f }
            r4 = 10200000(0x9ba3c0, float:1.4293244E-38)
            if (r3 >= r4) goto L_0x0209
            jvm r0 = r0.c     // Catch:{ RemoteException -> 0x024f }
            com.google.android.gms.contextmanager.fence.internal.FenceTriggerInfoImpl r3 = new com.google.android.gms.contextmanager.fence.internal.FenceTriggerInfoImpl     // Catch:{ RemoteException -> 0x024f }
            r4 = 2
            if (r10 != r4) goto L_0x01f2
            r4 = 1
            goto L_0x01f3
        L_0x01f2:
            r4 = 0
        L_0x01f3:
            r3.<init>(r4, r7)     // Catch:{ RemoteException -> 0x024f }
            r0.a((com.google.android.gms.contextmanager.fence.internal.FenceTriggerInfoImpl) r3)     // Catch:{ RemoteException -> 0x024f }
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ RemoteException -> 0x024f }
            int r3 = r13.e     // Catch:{ RemoteException -> 0x024f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ RemoteException -> 0x024f }
            r4 = 0
            r0[r4] = r3     // Catch:{ RemoteException -> 0x024f }
            r26 = r5
            r27 = r9
            goto L_0x0230
        L_0x0209:
            jvm r0 = r0.c     // Catch:{ RemoteException -> 0x024f }
            com.google.android.gms.contextmanager.fence.internal.FenceStateImpl r11 = new com.google.android.gms.contextmanager.fence.internal.FenceStateImpl     // Catch:{ RemoteException -> 0x024f }
            long r3 = r2.o     // Catch:{ RemoteException -> 0x024f }
            java.util.ArrayList r6 = r2.n     // Catch:{ RemoteException -> 0x024f }
            r24 = r3
            r3 = r11
            r4 = r10
            r26 = r5
            r16 = r6
            r5 = r24
            r27 = r9
            r9 = r16
            r3.<init>(r4, r5, r7, r8, r9)     // Catch:{ RemoteException -> 0x024d }
            r0.a((com.google.android.gms.contextmanager.fence.internal.FenceStateImpl) r11)     // Catch:{ RemoteException -> 0x024d }
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ RemoteException -> 0x024d }
            int r3 = r13.e     // Catch:{ RemoteException -> 0x024d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ RemoteException -> 0x024d }
            r4 = 0
            r0[r4] = r3     // Catch:{ RemoteException -> 0x024d }
        L_0x0230:
            buc r0 = defpackage.cbi.F()     // Catch:{ RemoteException -> 0x024d }
            java.lang.String r3 = r2.f     // Catch:{ RemoteException -> 0x024d }
            java.lang.String r4 = r2.h     // Catch:{ RemoteException -> 0x024d }
            r5 = 2
            if (r10 != r5) goto L_0x023e
            r18 = 3
            goto L_0x0240
        L_0x023e:
            r18 = 4
        L_0x0240:
            r20 = 0
            r15 = r0
            r16 = r3
            r17 = r4
            r19 = r22
            r15.a(r16, r17, r18, r19, r20, r21)     // Catch:{ RemoteException -> 0x024d }
            goto L_0x028e
        L_0x024d:
            r0 = move-exception
            goto L_0x0254
        L_0x024f:
            r0 = move-exception
            r26 = r5
            r27 = r9
        L_0x0254:
            jjg r3 = defpackage.bxk.a
            anie r3 = r3.c()
            anih r3 = (defpackage.anih) r3
            r3.a((java.lang.Throwable) r0)
            r0 = 325(0x145, float:4.55E-43)
            r5 = r26
            r4 = r27
            anie r0 = r3.a((java.lang.String) r5, (java.lang.String) r4, (int) r0, (java.lang.String) r14)
            anih r0 = (defpackage.anih) r0
            java.lang.String r3 = r2.f
            aqcr r3 = defpackage.aqcr.a(r3)
            java.lang.String r4 = "[FenceListenerConsumer] Couldn't trigger fence listener; %s unreachable."
            r0.a((java.lang.String) r4, (java.lang.Object) r3)
            buc r15 = defpackage.cbi.F()
            java.lang.String r0 = r2.f
            java.lang.String r3 = r2.h
            r18 = 5
            r20 = 0
            r16 = r0
            r17 = r3
            r19 = r22
            r15.a(r16, r17, r18, r19, r20)
            r28.f()
        L_0x028e:
            clj r0 = defpackage.cbi.C()
            long r3 = r2.o
            java.lang.String r5 = r2.a
            int r6 = defpackage.jyc.a(r10)
            r0.a((long) r3, (java.lang.String) r5, (int) r6)
            if (r23 == 0) goto L_0x02a5
            r2.k = r12
            r2.b(r12)
            goto L_0x02a8
        L_0x02a5:
            r2.b(r10)
        L_0x02a8:
            r3 = 0
            r2.n = r3
            return
        L_0x02ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwc.a(bzm):void");
    }
}
