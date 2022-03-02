package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* renamed from: byi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class byi {
    public static final Comparator a = new byh();

    public static int a(atjs atjs) {
        atjs atjs2 = atjs.UNKNOWN_CONTEXT_FENCE_TYPE;
        switch (atjs.ordinal()) {
            case 4:
            case 8:
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return 0;
            case 5:
                return 3;
            case 6:
                return 2;
            case 7:
                return 4;
            case 12:
                return 5;
            default:
                return 10;
        }
    }

    public static bzk b(bzk bzk) {
        atjs atjs = atjs.UNKNOWN_CONTEXT_FENCE_TYPE;
        int ordinal = bzk.a.ordinal();
        if (ordinal == 1) {
            ArrayList arrayList = new ArrayList();
            for (bzk b : bzk.a()) {
                arrayList.add(b(b));
            }
            bzk bzk2 = (bzk) arrayList.get(0);
            for (int i = 1; i < arrayList.size(); i++) {
                bzk bzk3 = (bzk) arrayList.get(i);
                ArrayList arrayList2 = new ArrayList();
                for (bzk bzk4 : bzk2.a()) {
                    for (bzk a2 : bzk3.a()) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(bzk4.a());
                        arrayList3.addAll(a2.a());
                        arrayList2.add(a((List) arrayList3));
                    }
                }
                bzk2 = b((List) arrayList2);
            }
            return bzk2;
        } else if (ordinal == 2) {
            ArrayList arrayList4 = new ArrayList();
            for (bzk b2 : bzk.a()) {
                arrayList4.add(b(b2));
            }
            ArrayList arrayList5 = new ArrayList();
            int size = arrayList4.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList5.addAll(((bzk) arrayList4.get(i2)).a());
            }
            return b((List) arrayList5);
        } else if (ordinal == 3) {
            if (bzk.a().size() == 0) {
                ((anih) ((anih) bxk.a.c()).a("byi", "b", 169, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceNormalizer] No valid NOT fence type defined.");
            }
            if (bzk.a().size() > 1) {
                ((anih) ((anih) bxk.a.c()).a("byi", "b", 174, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceNormalizer] Found an invalid NOT fence with more than one fences.");
            }
            ArrayList arrayList6 = new ArrayList();
            arrayList6.add(bzk);
            ArrayList arrayList7 = new ArrayList();
            arrayList7.add(a((List) arrayList6));
            return b((List) arrayList7);
        } else if (ordinal == 22) {
            return c(e(b((bzk) bzk.a().get(0))));
        } else {
            if (bzk.q()) {
                return c(bzk);
            }
            ((anih) ((anih) bxk.a.c()).a("byi", "b", 190, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceNormalizer] Unknown context fence type = %s", (Object) bzk.a);
            return null;
        }
    }

    private static bzk c(bzk bzk) {
        return b(Collections.singletonList(a(Collections.singletonList(bzk))));
    }

    private static bzk d(bzk bzk) {
        iva.a((Object) bzk);
        return new bzk(a(atjs.NOT, c(Collections.singletonList(bzk))));
    }

    private static bzk e(bzk bzk) {
        iva.a((Object) bzk);
        return new bzk(a(atjs.PREDICTIVE, c(Collections.singletonList(bzk))));
    }

    private static atjt a(atjs atjs, atjt[] atjtArr) {
        boolean z;
        if (atjs == atjs.AND || atjs == atjs.OR || atjs == atjs.NOT || atjs == atjs.PREDICTIVE) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        atjq atjq = (atjq) atjt.z.o();
        if (atjq.c) {
            atjq.c();
            atjq.c = false;
        }
        atjt atjt = (atjt) atjq.b;
        atjt.b = atjs.z;
        atjt.a |= 1;
        atjq.a((Iterable) Arrays.asList(atjtArr));
        return (atjt) atjq.i();
    }

    private static atjt[] c(List list) {
        atjt[] atjtArr = new atjt[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            atjtArr[i] = (atjt) ((bzk) it.next()).c;
            i++;
        }
        return atjtArr;
    }

    public static bzk a(bzk bzk) {
        atjs atjs = atjs.UNKNOWN_CONTEXT_FENCE_TYPE;
        int ordinal = bzk.a.ordinal();
        if (ordinal == 1) {
            ArrayList arrayList = new ArrayList();
            for (bzk a2 : bzk.a()) {
                arrayList.add(a(a2));
            }
            return a((List) arrayList);
        } else if (ordinal == 2) {
            ArrayList arrayList2 = new ArrayList();
            for (bzk a3 : bzk.a()) {
                arrayList2.add(a(a3));
            }
            return b((List) arrayList2);
        } else if (ordinal != 3) {
            if (ordinal != 22) {
                if (bzk.q()) {
                    return bzk;
                }
                ((anih) ((anih) bxk.a.c()).a("byi", "a", 143, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceNormalizer] Unknown context fence type = %s", (Object) bzk.a);
                return null;
            } else if (bzk.a().size() == 1) {
                return e(a((bzk) bzk.a().get(0)));
            } else {
                ((anih) ((anih) bxk.a.c()).a("byi", "a", 128, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceNormalizer] Found an invalid PREDICTIVE fence with incorrect number of internal fences.");
                return bzk;
            }
        } else if (bzk.a().size() == 0) {
            ((anih) ((anih) bxk.a.c()).a("byi", "a", 73, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceNormalizer] No valid NOT fence type defined.");
            return bzk;
        } else {
            if (bzk.a().size() > 1) {
                ((anih) ((anih) bxk.a.c()).a("byi", "a", 81, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceNormalizer] Found an invalid NOT fence with more than one fences.");
            }
            bzk bzk2 = (bzk) bzk.a().get(0);
            int ordinal2 = bzk2.a.ordinal();
            if (ordinal2 == 1) {
                ArrayList arrayList3 = new ArrayList();
                for (bzk d : bzk2.a()) {
                    arrayList3.add(a(d(d)));
                }
                return b((List) arrayList3);
            } else if (ordinal2 == 2) {
                ArrayList arrayList4 = new ArrayList();
                for (bzk d2 : bzk2.a()) {
                    arrayList4.add(a(d(d2)));
                }
                return a((List) arrayList4);
            } else if (ordinal2 == 3) {
                return a((bzk) bzk2.a().get(0));
            } else {
                if (ordinal2 == 22) {
                    return d(a(bzk2));
                }
                if (bzk2.q()) {
                    return bzk;
                }
                ((anih) ((anih) bxk.a.c()).a("byi", "a", 108, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceNormalizer] Unknown NOT context fence type = %s", (Object) bzk2.a);
                return null;
            }
        }
    }

    private static bzk b(List list) {
        iva.a((Object) list);
        iva.b(!list.isEmpty());
        return new bzk(a(atjs.OR, c(list)));
    }

    private static bzk a(List list) {
        iva.a((Object) list);
        iva.b(!list.isEmpty());
        return new bzk(a(atjs.AND, c(list)));
    }
}
