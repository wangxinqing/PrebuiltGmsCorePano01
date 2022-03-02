package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bxx {
    private static List a(bzk bzk) {
        boolean z;
        if (bzk.a == atjs.AND) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        ArrayList arrayList = null;
        for (bzk bzk2 : bzk.a()) {
            if (bzk2.a == atjs.NOT) {
                if (bzk2.a().size() == 0) {
                    ((anih) ((anih) bxk.a.c()).a("bxx", "a", 241, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceDecomposer] Invalid NOT fence without any leaves.");
                } else {
                    if (bzk2.a().size() > 1) {
                        ((anih) ((anih) bxk.a.c()).a("bxx", "a", 247, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceDecomposer] Invalid NOT fence with more than one fences.");
                    }
                    if (((bzk) bzk2.a().get(0)).a == atjs.TIME_FENCE) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(bxw.a(((bzk) bzk2.a().get(0)).j(), 1));
                    }
                }
            } else if (bzk2.a == atjs.TIME_FENCE) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(bxw.a(bzk2.j(), 2));
            }
        }
        return arrayList;
    }

    private static void b(bzk bzk, SparseArray sparseArray) {
        iva.b(bzk.a == atjs.AND);
        ArrayList arrayList = null;
        for (bzk bzk2 : bzk.a()) {
            if (bzk2.a == atjs.NOT) {
                if (bzk2.a().size() == 0) {
                    ((anih) ((anih) bxk.a.c()).a("bxx", "a", 241, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceDecomposer] Invalid NOT fence without any leaves.");
                } else {
                    if (bzk2.a().size() > 1) {
                        ((anih) ((anih) bxk.a.c()).a("bxx", "a", 247, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceDecomposer] Invalid NOT fence with more than one fences.");
                    }
                    if (((bzk) bzk2.a().get(0)).a == atjs.TIME_FENCE) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(bxw.a(((bzk) bzk2.a().get(0)).j(), 1));
                    }
                }
            } else if (bzk2.a == atjs.TIME_FENCE) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(bxw.a(bzk2.j(), 2));
            }
        }
        for (bzk bzk3 : bzk.a()) {
            if (bzk3.q()) {
                a(bzk3, arrayList, sparseArray);
            } else if (bzk3.a != atjs.NOT) {
                ((anih) ((anih) bxk.a.c()).a("bxx", "b", 118, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceDecomposer] Invalid AND fence type due to incorrect normalization.");
            } else if (bzk3.a().size() == 0) {
                ((anih) ((anih) bxk.a.c()).a("bxx", "b", 96, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceDecomposer] Invalid NOT fence without any leaves.");
            } else {
                if (bzk3.a().size() > 1) {
                    ((anih) ((anih) bxk.a.c()).a("bxx", "b", 102, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceDecomposer] Invalid NOT fence with more than one fences.");
                }
                bzk bzk4 = (bzk) bzk3.a().get(0);
                if (!bzk4.q()) {
                    ((anih) ((anih) bxk.a.c()).a("bxx", "b", 111, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceDecomposer] Invalid NOT fence type due to incorrect normalization.");
                } else {
                    a(bzk4, arrayList, sparseArray);
                }
            }
        }
    }

    public static void a(bzk bzk, SparseArray sparseArray) {
        if (bzk.a != atjs.OR) {
            ((anih) ((anih) bxk.a.c()).a("bxx", "a", 65, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceDecomposer] Not a valid normalized ContextFenceImpl. fence type = %s", (Object) bzk.a);
            return;
        }
        for (bzk bzk2 : bzk.a()) {
            if (bzk2.a != atjs.AND) {
                ((anih) ((anih) bxk.a.c()).a("bxx", "a", 74, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceDecomposer] Expected AND.  Got fence type = %s", (Object) bzk2.a);
            } else {
                iva.b(bzk2.a == atjs.AND);
                ArrayList arrayList = null;
                for (bzk bzk3 : bzk2.a()) {
                    if (bzk3.a == atjs.NOT) {
                        if (bzk3.a().size() == 0) {
                            ((anih) ((anih) bxk.a.c()).a("bxx", "a", 241, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceDecomposer] Invalid NOT fence without any leaves.");
                        } else {
                            if (bzk3.a().size() > 1) {
                                ((anih) ((anih) bxk.a.c()).a("bxx", "a", 247, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceDecomposer] Invalid NOT fence with more than one fences.");
                            }
                            if (((bzk) bzk3.a().get(0)).a == atjs.TIME_FENCE) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(bxw.a(((bzk) bzk3.a().get(0)).j(), 1));
                            }
                        }
                    } else if (bzk3.a == atjs.TIME_FENCE) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(bxw.a(bzk3.j(), 2));
                    }
                }
                for (bzk bzk4 : bzk2.a()) {
                    if (bzk4.q()) {
                        a(bzk4, arrayList, sparseArray);
                    } else if (bzk4.a != atjs.NOT) {
                        ((anih) ((anih) bxk.a.c()).a("bxx", "b", 118, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceDecomposer] Invalid AND fence type due to incorrect normalization.");
                    } else if (bzk4.a().size() == 0) {
                        ((anih) ((anih) bxk.a.c()).a("bxx", "b", 96, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceDecomposer] Invalid NOT fence without any leaves.");
                    } else {
                        if (bzk4.a().size() > 1) {
                            ((anih) ((anih) bxk.a.c()).a("bxx", "b", 102, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceDecomposer] Invalid NOT fence with more than one fences.");
                        }
                        bzk bzk5 = (bzk) bzk4.a().get(0);
                        if (!bzk5.q()) {
                            ((anih) ((anih) bxk.a.c()).a("bxx", "b", 111, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceDecomposer] Invalid NOT fence type due to incorrect normalization.");
                        } else {
                            a(bzk5, arrayList, sparseArray);
                        }
                    }
                }
            }
        }
    }

    private static void a(bzk bzk, List list, SparseArray sparseArray) {
        bzf bzf;
        for (int i : bzk.g()) {
            if (i != -2) {
                bzf bzf2 = (bzf) sparseArray.get(i);
                if (bzf2 == null) {
                    if (list != null) {
                        bzf = new bzf(bzd.a(), bza.a());
                        a(list, bzf);
                    } else {
                        bzf = bzf.a;
                    }
                    sparseArray.put(i, bzf);
                } else if (list == null) {
                    bzf2.a();
                } else {
                    a(list, bzf2);
                }
            }
        }
    }

    private static void a(List list, bzf bzf) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bxw bxw = (bxw) list.get(i);
            cad cad = bxw.a;
            atmd a = atmd.a(cad.b);
            if (a == null) {
                a = atmd.UNKNOWN_TIME_FENCE_TRIGGER_TYPE;
            }
            atmd atmd = a;
            if (bxw.b != 1) {
                bzf.a(atmd, cad.a(), cad.j(), cad.k());
            } else {
                bzf.b(atmd, cad.a(), cad.j(), cad.k());
            }
        }
    }
}
