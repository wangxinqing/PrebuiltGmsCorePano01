package defpackage;

import android.util.SparseArray;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bww extends bwp {
    public final Set c = new HashSet();

    public bww() {
        super("FenceSchedulerOperation");
    }

    private final void b() {
        byd byd;
        long a = cbi.i().a();
        byd E = cbi.E();
        SparseArray b = E.b();
        int i = 0;
        while (i < b.size()) {
            int keyAt = b.keyAt(i);
            bzf bzf = (bzf) b.valueAt(i);
            Set a2 = E.a(keyAt);
            if (keyAt != -1) {
                if (a2 == null) {
                    byd = E;
                } else if (a2.size() != 0) {
                    long j = 1 + a;
                    boolean a3 = bzf.a(j);
                    Set set = this.c;
                    byd = E;
                    Integer valueOf = Integer.valueOf(keyAt);
                    boolean contains = set.contains(valueOf);
                    if (a3) {
                        a(keyAt, a2);
                    } else if (contains) {
                        b(keyAt, a2);
                    }
                    bzb b2 = bzf.b(j);
                    new Object[1][0] = b2;
                    if (b2.a() && contains) {
                        ((anih) ((anih) bxk.a.c()).a("bww", "b", 133, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceSchedulerOperation] Received none epoch time but already running for context=%s", keyAt);
                        b(keyAt, a2);
                    } else {
                        long j2 = b2.c;
                        if (j2 == -2 && !contains) {
                            ((anih) ((anih) bxk.a.c()).a("bww", "b", 140, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceSchedulerOperation] Received any epoch time but production not running for context=%s", keyAt);
                            a(keyAt, a2);
                        } else if (j2 <= a) {
                            Object[] objArr = {valueOf, Long.valueOf(a), Boolean.valueOf(contains)};
                        } else {
                            a(j2 - a, bvq.a("FenceScheduler"));
                        }
                    }
                } else {
                    byd = E;
                }
                ((anih) ((anih) bxk.a.c()).a("bww", "b", 109, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceSchedulerOperation] No interest records found for context= [%s]", keyAt);
            } else {
                byd = E;
                a(a, bzf);
            }
            i++;
            E = byd;
        }
    }

    private final void a(int i, Set set) {
        cbi.r().a((Collection) set);
        this.c.add(Integer.valueOf(i));
    }

    private final void a(long j, bzf bzf) {
        cbi.k().a(new bxy(cbi.E()), bvq.a("EvaluateFences"));
        if (bzf != null) {
            bzb b = bzf.b(1 + j);
            Object[] objArr = {b, Long.valueOf(j)};
            long j2 = b.c;
            if (j2 > j) {
                a(j2 - j, bvq.a("FenceScheduler"));
            }
        }
    }

    public static final void a(Set set) {
        cbi.r().b((Collection) set);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        Object obj;
        long j = 1;
        int i = -1;
        if (cbi.E().d) {
            long a = cbi.i().a();
            byd E = cbi.E();
            bzf bzf = (bzf) E.b().get(-1);
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(E.c().size());
            if (bzf == null) {
                obj = "null";
            } else {
                obj = bzf;
            }
            objArr[1] = obj;
            a(a, bzf);
            for (bzk bzk : E.c()) {
                SparseArray sparseArray = new SparseArray();
                bxx.a(bzk.t(), sparseArray);
                bzf bzf2 = (bzf) sparseArray.get(-1);
                if (bzf2 != null && !bzf2.a(a + 1)) {
                    E.a(bzk);
                }
            }
            return;
        }
        long a2 = cbi.i().a();
        byd E2 = cbi.E();
        SparseArray b = E2.b();
        int i2 = 0;
        while (i2 < b.size()) {
            int keyAt = b.keyAt(i2);
            bzf bzf3 = (bzf) b.valueAt(i2);
            Set a3 = E2.a(keyAt);
            if (keyAt != i) {
                if (a3 != null) {
                    if (a3.size() != 0) {
                        long j2 = a2 + j;
                        boolean a4 = bzf3.a(j2);
                        Set set = this.c;
                        Integer valueOf = Integer.valueOf(keyAt);
                        boolean contains = set.contains(valueOf);
                        if (a4) {
                            a(keyAt, a3);
                        } else if (contains) {
                            b(keyAt, a3);
                        }
                        bzb b2 = bzf3.b(j2);
                        new Object[1][0] = b2;
                        if (b2.a() && contains) {
                            ((anih) ((anih) bxk.a.c()).a("bww", "b", 133, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceSchedulerOperation] Received none epoch time but already running for context=%s", keyAt);
                            b(keyAt, a3);
                        } else {
                            long j3 = b2.c;
                            if (j3 == -2 && !contains) {
                                ((anih) ((anih) bxk.a.c()).a("bww", "b", 140, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceSchedulerOperation] Received any epoch time but production not running for context=%s", keyAt);
                                a(keyAt, a3);
                            } else if (j3 <= a2) {
                                Object[] objArr2 = {valueOf, Long.valueOf(a2), Boolean.valueOf(contains)};
                            } else {
                                a(j3 - a2, bvq.a("FenceScheduler"));
                            }
                        }
                    }
                }
                ((anih) ((anih) bxk.a.c()).a("bww", "b", 109, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceSchedulerOperation] No interest records found for context= [%s]", keyAt);
            } else {
                a(a2, bzf3);
            }
            i2++;
            j = 1;
            i = -1;
        }
    }

    private final void b(int i, Set set) {
        a(set);
        this.c.remove(Integer.valueOf(i));
    }
}
