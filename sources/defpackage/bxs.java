package defpackage;

import java.util.Iterator;

/* renamed from: bxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bxs {
    private static bzk a(bzk bzk) {
        if (bzk.a != atjs.NOT) {
            return null;
        }
        if (bzk.a().size() == 0) {
            ((anih) ((anih) bxk.a.c()).a("bxs", "a", 165, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceComparator] Invalid NOT fence without any leaves.");
            return null;
        }
        if (bzk.a().size() > 1) {
            ((anih) ((anih) bxk.a.c()).a("bxs", "a", 171, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceComparator] Invalid NOT fence with more than one fences.");
        }
        bzk bzk2 = (bzk) bzk.a().get(0);
        if (bzk2.q()) {
            return bzk2;
        }
        ((anih) ((anih) bxk.a.c()).a("bxs", "a", 180, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceComparator] Invalid NOT fence type due to incorrect normalization.");
        return null;
    }

    private static boolean b(bzk bzk, bzk bzk2) {
        for (bzk bzk3 : bzk2.a()) {
            if (bzk3.a != atjs.AND) {
                ((anih) ((anih) bxk.a.c()).a("bxs", "b", 71, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceComparator] findMatching: Expected AND. Got %s", (Object) bzk3.a);
            } else if (bzk.a().size() == bzk3.a().size()) {
                for (bzk bzk4 : bzk.a()) {
                    if (!bzk4.q()) {
                        if (bzk4.a == atjs.NOT && !a((bzk) bzk4.a().get(0), true, bzk3)) {
                        }
                    } else if (!a(bzk4, false, bzk3)) {
                    }
                }
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    private static boolean c(bzk bzk, bzk bzk2) {
        String valueOf = String.valueOf(bzk);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("Primitive1: ");
        sb.append(valueOf);
        sb.toString();
        String valueOf2 = String.valueOf(bzk2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 12);
        sb2.append("Primitive2: ");
        sb2.append(valueOf2);
        sb2.toString();
        atjs atjs = bzk.a;
        if (atjs != bzk2.a) {
            Object[] objArr = {Integer.valueOf(atjs.z), Integer.valueOf(bzk2.a.z)};
            return false;
        }
        bzn o = bzk.o();
        bzn o2 = bzk2.o();
        if (o != null && o2 != null) {
            return o.equals(o2);
        }
        new Object[1][0] = Integer.valueOf(bzk.a.z);
        return false;
    }

    public static boolean a(bzk bzk, bzk bzk2) {
        bzk t = bzk.t();
        bzk t2 = bzk2.t();
        if (t.a != atjs.OR || t2.a != atjs.OR) {
            ((anih) ((anih) bxk.a.c()).a("bxs", "a", 33, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceComparator] Expected OR. fence1 type=%s, fence2 type=%s", (Object) bzk.a, (Object) bzk2.a);
            return false;
        } else if (t.a().size() != t2.a().size()) {
            return false;
        } else {
            for (bzk bzk3 : t.a()) {
                if (bzk3.a == atjs.AND) {
                    Iterator it = t2.a().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            return false;
                        }
                        bzk bzk4 = (bzk) it.next();
                        if (bzk4.a != atjs.AND) {
                            ((anih) ((anih) bxk.a.c()).a("bxs", "b", 71, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceComparator] findMatching: Expected AND. Got %s", (Object) bzk4.a);
                        } else if (bzk3.a().size() == bzk4.a().size()) {
                            Iterator it2 = bzk3.a().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    bzk bzk5 = (bzk) it2.next();
                                    if (!bzk5.q()) {
                                        if (bzk5.a == atjs.NOT && !a((bzk) bzk5.a().get(0), true, bzk4)) {
                                            break;
                                        }
                                    } else if (!a(bzk5, false, bzk4)) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    ((anih) ((anih) bxk.a.c()).a("bxs", "a", 47, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceComparator] areEquivalent: Expected AND. Got %s", (Object) bzk3.a);
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean a(bzk bzk, boolean z, bzk bzk2) {
        for (bzk bzk3 : bzk2.a()) {
            if (z) {
                if (bzk3.a == atjs.NOT) {
                    bzk bzk4 = null;
                    if (bzk3.a == atjs.NOT) {
                        if (bzk3.a().size() == 0) {
                            ((anih) ((anih) bxk.a.c()).a("bxs", "a", 165, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceComparator] Invalid NOT fence without any leaves.");
                        } else {
                            if (bzk3.a().size() > 1) {
                                ((anih) ((anih) bxk.a.c()).a("bxs", "a", 171, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceComparator] Invalid NOT fence with more than one fences.");
                            }
                            bzk bzk5 = (bzk) bzk3.a().get(0);
                            if (!bzk5.q()) {
                                ((anih) ((anih) bxk.a.c()).a("bxs", "a", 180, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceComparator] Invalid NOT fence type due to incorrect normalization.");
                            } else {
                                bzk4 = bzk5;
                            }
                        }
                    }
                    if (bzk4 != null && bzk.a == bzk4.a) {
                        return c(bzk, bzk4);
                    }
                } else {
                    continue;
                }
            } else if (bzk3.q() && bzk3.a == bzk.a) {
                return c(bzk, bzk3);
            }
        }
        return false;
    }
}
