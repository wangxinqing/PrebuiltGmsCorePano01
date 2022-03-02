package defpackage;

import android.database.SQLException;
import android.os.RemoteException;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.CallingAppInfo;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ktm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ktm {
    public static final ith a = new ith("SubscriptionStore", "");
    public final kkf b;
    public final kth c;
    public final Map d = new HashMap();
    public final Set e = new HashSet();
    final Set f = new HashSet();
    private final kkb g;
    private final ksz h;
    private final lfr i;

    public ktm(kkb kkb, kkf kkf, kth kth, ksz ksz, lfr lfr, jiq jiq) {
        iva.a((Object) kkb);
        this.g = kkb;
        iva.a((Object) kkf);
        this.b = kkf;
        iva.a((Object) kth);
        this.c = kth;
        iva.a((Object) ksz);
        this.h = ksz;
        iva.a((Object) lfr);
        this.i = lfr;
        iva.a((Object) jiq);
    }

    private final List a(khq khq, krn krn) {
        ArrayList arrayList = new ArrayList();
        this.b.d();
        try {
            for (TransferProgressData transferProgressData : this.h.a()) {
                try {
                    if (krn.a(this.b.a(khq, knc.a(transferProgressData.b.b)))) {
                        arrayList.add(transferProgressData);
                    }
                } catch (kcs e2) {
                }
            }
            this.b.f();
            this.b.e();
            return arrayList;
        } catch (SQLException e3) {
            throw new nja(8, "Unable to load entry");
        } catch (Throwable th) {
            this.b.e();
            throw th;
        }
    }

    private final void b(long j) {
        a(7, this.f, j);
    }

    public final void b(khq khq) {
        this.b.d();
        try {
            klf b2 = this.b.b(khq);
            iva.a((Object) b2);
            long j = b2.m;
            this.b.b(j, (knc) null, 7);
            b(j);
            this.b.f();
            this.b.e();
        } catch (SQLException e2) {
            throw new nja(8, "Unable to remove transfer state subscription");
        } catch (Throwable th) {
            this.b.e();
            throw th;
        }
    }

    private static final void a(int i2, Set set, long j) {
        synchronized (set) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                kpk b2 = ((ktj) it.next()).b();
                if (b2.c == i2 && b2.b == j && b2.a == null) {
                    it.remove();
                    break;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ab, code lost:
        a.c("SubscriptionStore", "Error reloading changes available subscription from the DB", r5);
        r4.u();
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2 A[Catch:{ JSONException -> 0x00aa, RemoteException -> 0x008f, all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a6 A[Catch:{ JSONException -> 0x00aa, RemoteException -> 0x008f, all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00aa A[Catch:{ JSONException -> 0x00aa, RemoteException -> 0x008f, all -> 0x01ad }, ExcHandler: JSONException (r5v7 'e' org.json.JSONException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:27:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r11 = this;
            r0 = 0
            kkf r1 = r11.b     // Catch:{ all -> 0x01c6 }
            r2 = 1
            kky r1 = r1.a((int) r2)     // Catch:{ all -> 0x01c6 }
            java.util.Map r2 = r11.d     // Catch:{ all -> 0x01c1 }
            monitor-enter(r2)     // Catch:{ all -> 0x01c1 }
            java.util.Map r3 = r11.d     // Catch:{ all -> 0x01be }
            r3.clear()     // Catch:{ all -> 0x01be }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x01be }
        L_0x0014:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x01be }
            if (r4 == 0) goto L_0x003c
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x01be }
            kpk r4 = (defpackage.kpk) r4     // Catch:{ all -> 0x01be }
            knc r5 = r4.a     // Catch:{ all -> 0x01be }
            java.util.Map r6 = r11.d     // Catch:{ all -> 0x01be }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x01be }
            java.util.Set r6 = (java.util.Set) r6     // Catch:{ all -> 0x01be }
            if (r6 != 0) goto L_0x0037
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x01be }
            r6.<init>()     // Catch:{ all -> 0x01be }
            java.util.Map r7 = r11.d     // Catch:{ all -> 0x01be }
            r7.put(r5, r6)     // Catch:{ all -> 0x01be }
            goto L_0x0038
        L_0x0037:
        L_0x0038:
            r6.add(r4)     // Catch:{ all -> 0x01be }
            goto L_0x0014
        L_0x003c:
            monitor-exit(r2)     // Catch:{ all -> 0x01be }
            if (r1 != 0) goto L_0x0040
            goto L_0x0043
        L_0x0040:
            r1.close()
        L_0x0043:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            kkf r2 = r11.b
            r2.d()
            kkf r2 = r11.b     // Catch:{ all -> 0x01b1 }
            r3 = 4
            kky r2 = r2.a((int) r3)     // Catch:{ all -> 0x01b1 }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x01ad }
        L_0x0058:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x01ad }
            if (r4 == 0) goto L_0x00b8
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x01ad }
            kpk r4 = (defpackage.kpk) r4     // Catch:{ all -> 0x01ad }
            kkf r5 = r11.b     // Catch:{ all -> 0x01ad }
            long r6 = r4.b     // Catch:{ all -> 0x01ad }
            khq r5 = r5.g((long) r6)     // Catch:{ all -> 0x01ad }
            if (r5 != 0) goto L_0x007b
            ith r5 = a     // Catch:{ all -> 0x01ad }
            java.lang.String r6 = "SubscriptionStore"
            java.lang.String r7 = "App no longer exists when reloading subscription"
            r5.b((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x01ad }
            r4.u()     // Catch:{ all -> 0x01ad }
            goto L_0x0058
        L_0x007b:
            krm r6 = new krm     // Catch:{ JSONException -> 0x00aa, RemoteException -> 0x0091 }
            ktk r7 = new ktk     // Catch:{ JSONException -> 0x00aa, RemoteException -> 0x0091 }
            com.google.android.gms.drive.auth.AppIdentity r8 = r5.c     // Catch:{ JSONException -> 0x00aa, RemoteException -> 0x0091 }
            java.lang.String r8 = r8.b     // Catch:{ JSONException -> 0x00aa, RemoteException -> 0x0091 }
            r7.<init>(r11, r8)     // Catch:{ JSONException -> 0x00aa, RemoteException -> 0x0091 }
            r6.<init>(r4, r7)     // Catch:{ JSONException -> 0x00aa, RemoteException -> 0x0091 }
            kkf r7 = r11.b     // Catch:{ JSONException -> 0x00aa, RemoteException -> 0x008f }
            r6.a(r5, r7)     // Catch:{ JSONException -> 0x00aa, RemoteException -> 0x008f }
            goto L_0x009c
        L_0x008f:
            r5 = move-exception
            goto L_0x0093
        L_0x0091:
            r5 = move-exception
            r6 = r0
        L_0x0093:
            ith r7 = a     // Catch:{ all -> 0x01ad }
            java.lang.String r8 = "SubscriptionStore"
            java.lang.String r9 = "Error raising initial changes available subscription event"
            r7.c(r8, r9, r5)     // Catch:{ all -> 0x01ad }
        L_0x009c:
            boolean r5 = r6.c()     // Catch:{ all -> 0x01ad }
            if (r5 == 0) goto L_0x00a6
            r1.add(r6)     // Catch:{ all -> 0x01ad }
            goto L_0x0058
        L_0x00a6:
            r4.u()     // Catch:{ all -> 0x01ad }
            goto L_0x0058
        L_0x00aa:
            r5 = move-exception
            ith r6 = a     // Catch:{ all -> 0x01ad }
            java.lang.String r7 = "SubscriptionStore"
            java.lang.String r8 = "Error reloading changes available subscription from the DB"
            r6.c(r7, r8, r5)     // Catch:{ all -> 0x01ad }
            r4.u()     // Catch:{ all -> 0x01ad }
            goto L_0x0058
        L_0x00b8:
            kkf r3 = r11.b     // Catch:{ all -> 0x01ad }
            r3.f()     // Catch:{ all -> 0x01ad }
            if (r2 != 0) goto L_0x00c0
            goto L_0x00c3
        L_0x00c0:
            r2.close()
        L_0x00c3:
            kkf r2 = r11.b
            r2.e()
            java.util.Set r3 = r11.e
            monitor-enter(r3)
            java.util.Set r2 = r11.e     // Catch:{ all -> 0x01aa }
            r2.clear()     // Catch:{ all -> 0x01aa }
            java.util.Set r2 = r11.e     // Catch:{ all -> 0x01aa }
            r2.addAll(r1)     // Catch:{ all -> 0x01aa }
            monitor-exit(r3)     // Catch:{ all -> 0x01aa }
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            kkf r2 = r11.b
            r2.d()
            kkf r2 = r11.b     // Catch:{ all -> 0x019d }
            r3 = 7
            kky r0 = r2.a((int) r3)     // Catch:{ all -> 0x019d }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x019b }
        L_0x00eb:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x019b }
            if (r3 == 0) goto L_0x012e
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x019b }
            kpk r3 = (defpackage.kpk) r3     // Catch:{ all -> 0x019b }
            kkf r4 = r11.b     // Catch:{ all -> 0x019b }
            long r5 = r3.b     // Catch:{ all -> 0x019b }
            khq r4 = r4.g((long) r5)     // Catch:{ all -> 0x019b }
            if (r4 != 0) goto L_0x010e
            ith r4 = a     // Catch:{ all -> 0x019b }
            java.lang.String r5 = "SubscriptionStore"
            java.lang.String r6 = "App no longer exists when reloading subscription"
            r4.b((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ all -> 0x019b }
            r3.u()     // Catch:{ all -> 0x019b }
            goto L_0x00eb
        L_0x010e:
            krn r5 = new krn     // Catch:{ JSONException -> 0x0120 }
            ktl r6 = new ktl     // Catch:{ JSONException -> 0x0120 }
            com.google.android.gms.drive.auth.AppIdentity r4 = r4.c     // Catch:{ JSONException -> 0x0120 }
            java.lang.String r4 = r4.b     // Catch:{ JSONException -> 0x0120 }
            r6.<init>(r11, r4)     // Catch:{ JSONException -> 0x0120 }
            r5.<init>(r3, r6)     // Catch:{ JSONException -> 0x0120 }
            r1.add(r5)     // Catch:{ all -> 0x019b }
            goto L_0x00eb
        L_0x0120:
            r4 = move-exception
            ith r5 = a     // Catch:{ all -> 0x019b }
            java.lang.String r6 = "SubscriptionStore"
            java.lang.String r7 = "Error reloading transfer state subscription from the DB"
            r5.c(r6, r7, r4)     // Catch:{ all -> 0x019b }
            r3.u()     // Catch:{ all -> 0x019b }
            goto L_0x00eb
        L_0x012e:
            kkf r2 = r11.b     // Catch:{ all -> 0x019b }
            r2.f()     // Catch:{ all -> 0x019b }
            if (r0 != 0) goto L_0x0136
            goto L_0x0139
        L_0x0136:
            r0.close()
        L_0x0139:
            kkf r0 = r11.b
            r0.e()
            java.util.Set r2 = r11.f
            monitor-enter(r2)
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0198 }
            r0.<init>()     // Catch:{ all -> 0x0198 }
            java.util.Set r3 = r11.f     // Catch:{ all -> 0x0198 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0198 }
        L_0x014c:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0198 }
            if (r4 != 0) goto L_0x0182
            java.util.Set r3 = r11.f     // Catch:{ all -> 0x0198 }
            r3.clear()     // Catch:{ all -> 0x0198 }
            java.util.Set r3 = r11.f     // Catch:{ all -> 0x0198 }
            r3.addAll(r1)     // Catch:{ all -> 0x0198 }
            java.util.Set r1 = r11.f     // Catch:{ all -> 0x0198 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0198 }
        L_0x0162:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0198 }
            if (r3 == 0) goto L_0x0180
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0198 }
            krn r3 = (defpackage.krn) r3     // Catch:{ all -> 0x0198 }
            long r4 = r3.c()     // Catch:{ all -> 0x0198 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0198 }
            boolean r4 = r0.contains(r4)     // Catch:{ all -> 0x0198 }
            if (r4 != 0) goto L_0x0162
            r3.a()     // Catch:{ all -> 0x0198 }
            goto L_0x0162
        L_0x0180:
            monitor-exit(r2)     // Catch:{ all -> 0x0198 }
            return
        L_0x0182:
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0198 }
            krn r4 = (defpackage.krn) r4     // Catch:{ all -> 0x0198 }
            boolean r5 = r4.b     // Catch:{ all -> 0x0198 }
            if (r5 != 0) goto L_0x014c
            long r4 = r4.c()     // Catch:{ all -> 0x0198 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0198 }
            r0.add(r4)     // Catch:{ all -> 0x0198 }
            goto L_0x014c
        L_0x0198:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0198 }
            throw r0
        L_0x019b:
            r1 = move-exception
            goto L_0x019e
        L_0x019d:
            r1 = move-exception
        L_0x019e:
            if (r0 != 0) goto L_0x01a1
            goto L_0x01a4
        L_0x01a1:
            r0.close()
        L_0x01a4:
            kkf r0 = r11.b
            r0.e()
            throw r1
        L_0x01aa:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01aa }
            throw r0
        L_0x01ad:
            r0 = move-exception
            r1 = r0
            r0 = r2
            goto L_0x01b2
        L_0x01b1:
            r1 = move-exception
        L_0x01b2:
            if (r0 != 0) goto L_0x01b5
            goto L_0x01b8
        L_0x01b5:
            r0.close()
        L_0x01b8:
            kkf r0 = r11.b
            r0.e()
            throw r1
        L_0x01be:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01be }
            throw r0     // Catch:{ all -> 0x01c1 }
        L_0x01c1:
            r0 = move-exception
            r10 = r1
            r1 = r0
            r0 = r10
            goto L_0x01c7
        L_0x01c6:
            r1 = move-exception
        L_0x01c7:
            if (r0 == 0) goto L_0x01cc
            r0.close()
        L_0x01cc:
            goto L_0x01ce
        L_0x01cd:
            throw r1
        L_0x01ce:
            goto L_0x01cd
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ktm.a():void");
    }

    public final void a(int i2, khq khq, kmp kmp) {
        lfq c2 = this.i.c();
        c2.c(2, i2);
        c2.c(1);
        c2.a(new CallingAppInfo(khq, 0));
        c2.j();
        if (kmp != null) {
            c2.a(kmp);
        }
        c2.a();
    }

    public final void a(long j) {
        a(4, this.e, j);
    }

    public final void a(TransferProgressData transferProgressData) {
        HashSet<krn> hashSet = new HashSet<>();
        synchronized (this.f) {
            hashSet.addAll(this.f);
        }
        if (!hashSet.isEmpty()) {
            HashSet<kpk> hashSet2 = new HashSet<>();
            for (krn krn : hashSet) {
                kpk kpk = krn.a;
                khq g2 = this.b.g(kpk.b);
                if (g2 != null) {
                    try {
                        kmp a2 = this.b.a(g2, knc.a(transferProgressData.b.b));
                        try {
                            if (krn.b && krn.a(a2)) {
                                krn.a((List) amzy.a((Object) transferProgressData));
                                a.b("Raised transfer state event to subscription");
                                a(71, g2, (kmp) null);
                            }
                        } catch (RemoteException e2) {
                            a.c("SubscriptionStore", "Error raising transfer state event to one subscriber", e2);
                        }
                    } catch (kcs e3) {
                    }
                } else {
                    hashSet2.add(kpk);
                }
            }
            synchronized (this.f) {
                for (kpk kpk2 : hashSet2) {
                    b(kpk2.b);
                }
            }
        }
    }

    public final void a(khq khq) {
        this.b.d();
        try {
            klf b2 = this.b.b(khq);
            iva.a((Object) b2);
            long j = b2.m;
            this.b.b(j, (knc) null, 4);
            a(j);
            this.b.f();
            this.b.e();
        } catch (SQLException e2) {
            throw new nja(8, "Unable to remove changes available subscription");
        } catch (Throwable th) {
            this.b.e();
            throw th;
        }
    }

    public final void a(khq khq, DriveId driveId) {
        iva.a((Object) driveId);
        knc a2 = knc.a(driveId.b);
        this.b.d();
        try {
            klf b2 = this.b.b(khq);
            iva.a((Object) b2);
            long j = b2.m;
            this.b.b(j, a2, 1);
            a(a2, j);
            this.b.f();
            this.b.e();
        } catch (SQLException e2) {
            String valueOf = String.valueOf(driveId);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("Unable to remove change event subscription: id = ");
            sb.append(valueOf);
            throw new nja(8, sb.toString());
        } catch (Throwable th) {
            this.b.e();
            throw th;
        }
    }

    public final void a(khq khq, boolean z, DriveId driveId) {
        kpk kpk;
        long j;
        kpk kpk2;
        iva.a((Object) driveId);
        knc a2 = knc.a(driveId.b);
        this.b.d();
        try {
            klf b2 = this.b.b(khq);
            iva.a((Object) b2);
            long j2 = b2.m;
            kpk = this.b.a(j2, a2, 1);
            if (!z) {
                try {
                    j = System.currentTimeMillis();
                } catch (SQLException e2) {
                    e = e2;
                    try {
                        a.c("SubscriptionStore", String.format("Unable to insert change event subscription: %s", new Object[]{kpk}), e);
                        throw new nja(8, "Unable to store change event subscription");
                    } catch (Throwable th) {
                        this.b.e();
                        throw th;
                    }
                }
            } else {
                j = Long.MAX_VALUE;
            }
            if (kpk == null) {
                kpk2 = new kpk(this.g, a2, (String) null, j2, 1, j);
            } else {
                kpk.d = j;
                kpk2 = kpk;
            }
            try {
                kpk2.t();
                synchronized (this.d) {
                    if (kpk != null) {
                        a(a2, j2);
                    }
                    Set set = (Set) this.d.get(a2);
                    if (set == null) {
                        set = new HashSet();
                        this.d.put(a2, set);
                    }
                    set.add(kpk2);
                }
                this.b.f();
                this.b.e();
            } catch (SQLException e3) {
                e = e3;
                kpk = kpk2;
            }
        } catch (SQLException e4) {
            e = e4;
            kpk = null;
            a.c("SubscriptionStore", String.format("Unable to insert change event subscription: %s", new Object[]{kpk}), e);
            throw new nja(8, "Unable to store change event subscription");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0098, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098 A[ExcHandler: SQLException (e android.database.SQLException), Splitter:B:1:0x000c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.khq r17, boolean r18, com.google.android.gms.drive.events.ChangesAvailableOptions r19, java.lang.String r20, java.util.Set r21) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            kkf r2 = r1.b
            r2.d()
            r2 = 8
            r3 = 0
            kkf r4 = r1.b     // Catch:{ SQLException -> 0x0098, JSONException -> 0x0096 }
            klf r4 = r4.b((defpackage.khq) r0)     // Catch:{ SQLException -> 0x0098, JSONException -> 0x0096 }
            defpackage.iva.a((java.lang.Object) r4)     // Catch:{ SQLException -> 0x0098, JSONException -> 0x0096 }
            long r14 = r4.m     // Catch:{ SQLException -> 0x0098, JSONException -> 0x0096 }
            kkf r4 = r1.b     // Catch:{ SQLException -> 0x0098, JSONException -> 0x0096 }
            kkz r5 = r0.a     // Catch:{ SQLException -> 0x0098, JSONException -> 0x0096 }
            long r4 = r4.c((defpackage.kkz) r5)     // Catch:{ SQLException -> 0x0098, JSONException -> 0x0096 }
            r6 = r19
            r7 = r20
            r8 = r21
            java.lang.String r8 = defpackage.kti.a(r6, r7, r8, r4)     // Catch:{ JSONException -> 0x008b, SQLException -> 0x0098 }
            kkf r4 = r1.b     // Catch:{ SQLException -> 0x0098, JSONException -> 0x0096 }
            r5 = 4
            kpk r3 = r4.a((long) r14, (defpackage.knc) r3, (int) r5)     // Catch:{ SQLException -> 0x0098, JSONException -> 0x0096 }
            if (r18 != 0) goto L_0x003c
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ SQLException -> 0x003a, JSONException -> 0x0038 }
            r12 = r4
            goto L_0x0042
        L_0x0038:
            r0 = move-exception
            goto L_0x0099
        L_0x003a:
            r0 = move-exception
            goto L_0x0099
        L_0x003c:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r4
        L_0x0042:
            if (r3 != 0) goto L_0x0050
            kpk r4 = new kpk     // Catch:{ SQLException -> 0x003a, JSONException -> 0x0038 }
            kkb r6 = r1.g     // Catch:{ SQLException -> 0x003a, JSONException -> 0x0038 }
            r7 = 0
            r11 = 4
            r5 = r4
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r11, r12)     // Catch:{ SQLException -> 0x003a, JSONException -> 0x0038 }
            goto L_0x0055
        L_0x0050:
            r3.e = r8     // Catch:{ SQLException -> 0x003a, JSONException -> 0x0038 }
            r3.d = r12     // Catch:{ SQLException -> 0x003a, JSONException -> 0x0038 }
            r4 = r3
        L_0x0055:
            r4.t()     // Catch:{ SQLException -> 0x0088, JSONException -> 0x0086 }
            krm r5 = new krm     // Catch:{ SQLException -> 0x0088, JSONException -> 0x0086 }
            ktk r6 = new ktk     // Catch:{ SQLException -> 0x0088, JSONException -> 0x0086 }
            com.google.android.gms.drive.auth.AppIdentity r0 = r0.c     // Catch:{ SQLException -> 0x0088, JSONException -> 0x0086 }
            java.lang.String r0 = r0.b     // Catch:{ SQLException -> 0x0088, JSONException -> 0x0086 }
            r6.<init>(r1, r0)     // Catch:{ SQLException -> 0x0088, JSONException -> 0x0086 }
            r5.<init>(r4, r6)     // Catch:{ SQLException -> 0x0088, JSONException -> 0x0086 }
            r5.a()     // Catch:{ SQLException -> 0x0088, JSONException -> 0x0086 }
            java.util.Set r6 = r1.e     // Catch:{ SQLException -> 0x0088, JSONException -> 0x0086 }
            monitor-enter(r6)     // Catch:{ SQLException -> 0x0088, JSONException -> 0x0086 }
            if (r3 != 0) goto L_0x006f
            goto L_0x0072
        L_0x006f:
            r1.a((long) r14)     // Catch:{ all -> 0x0083 }
        L_0x0072:
            java.util.Set r0 = r1.e     // Catch:{ all -> 0x0083 }
            r0.add(r5)     // Catch:{ all -> 0x0083 }
            monitor-exit(r6)     // Catch:{ all -> 0x0083 }
            kkf r0 = r1.b     // Catch:{ SQLException -> 0x0088, JSONException -> 0x0086 }
            r0.f()     // Catch:{ SQLException -> 0x0088, JSONException -> 0x0086 }
            kkf r0 = r1.b
            r0.e()
            return
        L_0x0083:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0083 }
            throw r0     // Catch:{ SQLException -> 0x0088, JSONException -> 0x0086 }
        L_0x0086:
            r0 = move-exception
            goto L_0x0089
        L_0x0088:
            r0 = move-exception
        L_0x0089:
            r3 = r4
            goto L_0x0099
        L_0x008b:
            r0 = move-exception
            nja r0 = new nja     // Catch:{ SQLException -> 0x0098, JSONException -> 0x0096 }
            java.lang.String r4 = "Unable to store changes available subscription"
            r0.<init>(r2, r4)     // Catch:{ SQLException -> 0x0098, JSONException -> 0x0096 }
            throw r0     // Catch:{ SQLException -> 0x0098, JSONException -> 0x0096 }
        L_0x0094:
            r0 = move-exception
            goto L_0x00b4
        L_0x0096:
            r0 = move-exception
            goto L_0x0099
        L_0x0098:
            r0 = move-exception
        L_0x0099:
            ith r4 = a     // Catch:{ all -> 0x0094 }
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0094 }
            r6 = 0
            r5[r6] = r3     // Catch:{ all -> 0x0094 }
            java.lang.String r3 = "SubscriptionStore"
            java.lang.String r6 = "Unable to insert changes available subscription: %s"
            java.lang.String r5 = java.lang.String.format(r6, r5)     // Catch:{ all -> 0x0094 }
            r4.c(r3, r5, r0)     // Catch:{ all -> 0x0094 }
            nja r0 = new nja     // Catch:{ all -> 0x0094 }
            java.lang.String r3 = "Unable to store changes available subscription"
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0094 }
            throw r0     // Catch:{ all -> 0x0094 }
        L_0x00b4:
            kkf r2 = r1.b
            r2.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ktm.a(khq, boolean, com.google.android.gms.drive.events.ChangesAvailableOptions, java.lang.String, java.util.Set):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c8 A[ExcHandler: SQLException (e android.database.SQLException), Splitter:B:1:0x000c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.khq r17, boolean r18, com.google.android.gms.drive.events.TransferStateOptions r19, java.lang.String r20, java.util.Set r21) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            kkf r2 = r1.b
            r2.d()
            r2 = 8
            r3 = 0
            kkf r4 = r1.b     // Catch:{ SQLException -> 0x00c8, JSONException -> 0x00c6 }
            klf r4 = r4.b((defpackage.khq) r0)     // Catch:{ SQLException -> 0x00c8, JSONException -> 0x00c6 }
            defpackage.iva.a((java.lang.Object) r4)     // Catch:{ SQLException -> 0x00c8, JSONException -> 0x00c6 }
            long r14 = r4.m     // Catch:{ SQLException -> 0x00c8, JSONException -> 0x00c6 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00bb, SQLException -> 0x00c8 }
            r4.<init>()     // Catch:{ JSONException -> 0x00bb, SQLException -> 0x00c8 }
            java.lang.String r5 = "optionsSpaces"
            java.util.Set r6 = r19.a()     // Catch:{ JSONException -> 0x00bb, SQLException -> 0x00c8 }
            org.json.JSONArray r6 = defpackage.kti.a((java.util.Set) r6)     // Catch:{ JSONException -> 0x00bb, SQLException -> 0x00c8 }
            r4.putOpt(r5, r6)     // Catch:{ JSONException -> 0x00bb, SQLException -> 0x00c8 }
            java.lang.String r5 = "account"
            r6 = r20
            r4.putOpt(r5, r6)     // Catch:{ JSONException -> 0x00bb, SQLException -> 0x00c8 }
            java.lang.String r5 = "spaces"
            org.json.JSONArray r6 = defpackage.kti.a((java.util.Set) r21)     // Catch:{ JSONException -> 0x00bb, SQLException -> 0x00c8 }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x00bb, SQLException -> 0x00c8 }
            java.lang.String r8 = r4.toString()     // Catch:{ JSONException -> 0x00bb, SQLException -> 0x00c8 }
            kkf r4 = r1.b     // Catch:{ SQLException -> 0x00c8, JSONException -> 0x00c6 }
            r5 = 7
            kpk r3 = r4.a((long) r14, (defpackage.knc) r3, (int) r5)     // Catch:{ SQLException -> 0x00c8, JSONException -> 0x00c6 }
            if (r18 != 0) goto L_0x0052
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ SQLException -> 0x004f, JSONException -> 0x004c }
            r12 = r4
            goto L_0x0058
        L_0x004c:
            r0 = move-exception
            goto L_0x00c9
        L_0x004f:
            r0 = move-exception
            goto L_0x00c9
        L_0x0052:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r4
        L_0x0058:
            if (r3 != 0) goto L_0x0066
            kpk r4 = new kpk     // Catch:{ SQLException -> 0x004f, JSONException -> 0x004c }
            kkb r6 = r1.g     // Catch:{ SQLException -> 0x004f, JSONException -> 0x004c }
            r7 = 0
            r11 = 7
            r5 = r4
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r11, r12)     // Catch:{ SQLException -> 0x004f, JSONException -> 0x004c }
            goto L_0x006b
        L_0x0066:
            r3.e = r8     // Catch:{ SQLException -> 0x004f, JSONException -> 0x004c }
            r3.d = r12     // Catch:{ SQLException -> 0x004f, JSONException -> 0x004c }
            r4 = r3
        L_0x006b:
            r4.t()     // Catch:{ SQLException -> 0x00b8, JSONException -> 0x00b6 }
            krn r5 = new krn     // Catch:{ SQLException -> 0x00b8, JSONException -> 0x00b6 }
            ktl r6 = new ktl     // Catch:{ SQLException -> 0x00b8, JSONException -> 0x00b6 }
            com.google.android.gms.drive.auth.AppIdentity r7 = r0.c     // Catch:{ SQLException -> 0x00b8, JSONException -> 0x00b6 }
            java.lang.String r7 = r7.b     // Catch:{ SQLException -> 0x00b8, JSONException -> 0x00b6 }
            r6.<init>(r1, r7)     // Catch:{ SQLException -> 0x00b8, JSONException -> 0x00b6 }
            r5.<init>(r4, r6)     // Catch:{ SQLException -> 0x00b8, JSONException -> 0x00b6 }
            java.util.Set r6 = r1.f     // Catch:{ SQLException -> 0x00b8, JSONException -> 0x00b6 }
            monitor-enter(r6)     // Catch:{ SQLException -> 0x00b8, JSONException -> 0x00b6 }
            if (r3 != 0) goto L_0x0082
            goto L_0x0085
        L_0x0082:
            r1.b((long) r14)     // Catch:{ all -> 0x00b3 }
        L_0x0085:
            java.util.Set r3 = r1.f     // Catch:{ all -> 0x00b3 }
            r3.add(r5)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r6)     // Catch:{ all -> 0x00b3 }
            kkf r3 = r1.b     // Catch:{ SQLException -> 0x00b8, JSONException -> 0x00b6 }
            r3.f()     // Catch:{ SQLException -> 0x00b8, JSONException -> 0x00b6 }
            kkf r2 = r1.b
            r2.e()
            java.util.Set r2 = r1.f
            monitor-enter(r2)
            java.util.List r0 = r1.a((defpackage.khq) r0, (defpackage.krn) r5)     // Catch:{ all -> 0x00b0 }
            r5.a((java.util.List) r0)     // Catch:{ RemoteException -> 0x00a0 }
            goto L_0x00ab
        L_0x00a0:
            r0 = move-exception
            r3 = r0
            ith r0 = a     // Catch:{ all -> 0x00b0 }
            java.lang.String r4 = "SubscriptionStore"
            java.lang.String r6 = "Error raising transfer state event"
            r0.c(r4, r6, r3)     // Catch:{ all -> 0x00b0 }
        L_0x00ab:
            r5.a()     // Catch:{ all -> 0x00b0 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b0 }
            return
        L_0x00b0:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b0 }
            throw r0
        L_0x00b3:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00b3 }
            throw r0     // Catch:{ SQLException -> 0x00b8, JSONException -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            goto L_0x00b9
        L_0x00b8:
            r0 = move-exception
        L_0x00b9:
            r3 = r4
            goto L_0x00c9
        L_0x00bb:
            r0 = move-exception
            nja r0 = new nja     // Catch:{ SQLException -> 0x00c8, JSONException -> 0x00c6 }
            java.lang.String r4 = "Unable to store transfer state subscription"
            r0.<init>(r2, r4)     // Catch:{ SQLException -> 0x00c8, JSONException -> 0x00c6 }
            throw r0     // Catch:{ SQLException -> 0x00c8, JSONException -> 0x00c6 }
        L_0x00c4:
            r0 = move-exception
            goto L_0x00e4
        L_0x00c6:
            r0 = move-exception
            goto L_0x00c9
        L_0x00c8:
            r0 = move-exception
        L_0x00c9:
            ith r4 = a     // Catch:{ all -> 0x00c4 }
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00c4 }
            r6 = 0
            r5[r6] = r3     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = "SubscriptionStore"
            java.lang.String r6 = "Unable to insert transfer state subscription: %s"
            java.lang.String r5 = java.lang.String.format(r6, r5)     // Catch:{ all -> 0x00c4 }
            r4.c(r3, r5, r0)     // Catch:{ all -> 0x00c4 }
            nja r0 = new nja     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = "Unable to store transfer state subscription"
            r0.<init>(r2, r3)     // Catch:{ all -> 0x00c4 }
            throw r0     // Catch:{ all -> 0x00c4 }
        L_0x00e4:
            kkf r2 = r1.b
            r2.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ktm.a(khq, boolean, com.google.android.gms.drive.events.TransferStateOptions, java.lang.String, java.util.Set):void");
    }

    public final void a(knc knc, long j) {
        synchronized (this.d) {
            Set set = (Set) this.d.get(knc);
            if (set != null) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    kpk kpk = (kpk) it.next();
                    if (kpk.c == 1 && kpk.b == j && ius.a(kpk.a, knc)) {
                        it.remove();
                        break;
                    }
                }
                if (set.isEmpty()) {
                    this.d.remove(knc);
                }
            }
        }
    }
}
