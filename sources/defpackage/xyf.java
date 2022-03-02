package defpackage;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: xyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class xyf {
    protected static final anaf a;
    public final Map b = new EnumMap(wvo.class);
    private final Map c = new EnumMap(wvo.class);
    private final int d;

    static {
        anab h = anaf.h();
        h.a(wvc.OK, Integer.valueOf(babg.OK.r));
        h.a(wvc.CANCELLED, Integer.valueOf(babg.CANCELLED.r));
        h.a(wvc.UNKNOWN, Integer.valueOf(babg.UNKNOWN.r));
        h.a(wvc.INVALID_ARGUMENT, Integer.valueOf(babg.INVALID_ARGUMENT.r));
        h.a(wvc.DEADLINE_EXCEEDED, Integer.valueOf(babg.DEADLINE_EXCEEDED.r));
        h.a(wvc.NOT_FOUND, Integer.valueOf(babg.NOT_FOUND.r));
        h.a(wvc.ALREADY_EXISTS, Integer.valueOf(babg.ALREADY_EXISTS.r));
        h.a(wvc.PERMISSION_DENIED, Integer.valueOf(babg.PERMISSION_DENIED.r));
        h.a(wvc.RESOURCE_EXHAUSTED, Integer.valueOf(babg.RESOURCE_EXHAUSTED.r));
        h.a(wvc.FAILED_PRECONDITION, Integer.valueOf(babg.FAILED_PRECONDITION.r));
        h.a(wvc.ABORTED, Integer.valueOf(babg.ABORTED.r));
        h.a(wvc.OUT_OF_RANGE, Integer.valueOf(babg.OUT_OF_RANGE.r));
        h.a(wvc.UNIMPLEMENTED, Integer.valueOf(babg.UNIMPLEMENTED.r));
        h.a(wvc.INTERNAL, Integer.valueOf(babg.INTERNAL.r));
        h.a(wvc.UNAVAILABLE, Integer.valueOf(babg.UNAVAILABLE.r));
        h.a(wvc.DATA_LOSS, Integer.valueOf(babg.DATA_LOSS.r));
        h.a(wvc.UNAUTHENTICATED, Integer.valueOf(babg.UNAUTHENTICATED.r));
        a = h.a();
    }

    public xyf(int i) {
        wvf wvf;
        this.d = i;
        try {
            wvf = (wvf) aucj.a((aucj) wvf.c, a());
        } catch (auda e) {
            wvf = wvf.c;
        }
        int a2 = wve.a(wvf.b);
        if ((a2 == 0 ? 1 : a2) == this.d) {
            anaf b2 = b();
            aucx aucx = wvf.a;
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                wvp wvp = (wvp) aucx.get(i2);
                int a3 = wvm.a(wvp.c);
                if (a3 != 0 && a3 == 3) {
                    a((Map) b2, wvp, this.b);
                } else {
                    int a4 = wvm.a(wvp.c);
                    if (a4 != 0 && a4 == 2) {
                        a((Map) a, wvp, this.c);
                    }
                }
            }
        }
    }

    public static final int a(wvo wvo, int i, String str, Map map) {
        if (map.containsKey(wvo)) {
            Map map2 = (Map) map.get(wvo);
            Integer valueOf = Integer.valueOf(i);
            if (map2.containsKey(valueOf)) {
                for (wvp wvp : (List) map2.get(valueOf)) {
                    if ((wvp.a & 16) != 0) {
                        wvk wvk = wvp.f;
                        if (wvk == null) {
                            wvk = wvk.c;
                        }
                        int a2 = wvj.a(wvk.a);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        if (a2 - 1 != 0) {
                            if (str != null) {
                                wvk wvk2 = wvp.f;
                                if (wvk2 == null) {
                                    wvk2 = wvk.c;
                                }
                                if (str.contains(wvk2.b)) {
                                }
                            }
                        }
                    }
                    int a3 = wvh.a(wvp.e);
                    if (a3 != 0) {
                        return a3;
                    }
                    return 1;
                }
            }
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] a();

    /* access modifiers changed from: protected */
    public abstract anaf b();

    private static void a(Map map, wvp wvp, Map map2) {
        wvo a2 = wvo.a(wvp.b);
        if (a2 == null) {
            a2 = wvo.UNKNOWN_OPERATION;
        }
        if (!map2.containsKey(a2)) {
            map2.put(a2, new HashMap());
        }
        Map map3 = (Map) map2.get(a2);
        wvc a3 = wvc.a(wvp.d);
        if (a3 == null) {
            a3 = wvc.OK;
        }
        if (map.containsKey(a3)) {
            wvc a4 = wvc.a(wvp.d);
            if (a4 == null) {
                a4 = wvc.OK;
            }
            Integer num = (Integer) map.get(a4);
            if (!map3.containsKey(num)) {
                map3.put(num, new ArrayList());
            }
            ((List) map3.get(num)).add(wvp);
        }
    }

    public final int a(wvo wvo, int i, String str) {
        return a(wvo, i, str, this.c);
    }
}
