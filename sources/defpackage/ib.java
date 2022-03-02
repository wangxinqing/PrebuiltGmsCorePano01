package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: ib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ib {
    public static final il a = new ih();
    public static final il b;
    private static final int[] c = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    static {
        il ilVar;
        int i = Build.VERSION.SDK_INT;
        try {
            ilVar = (il) Class.forName("are").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            ilVar = null;
        }
        b = ilVar;
    }

    static View a(nz nzVar, ia iaVar, Object obj, boolean z) {
        ArrayList arrayList;
        fw fwVar = iaVar.c;
        if (obj == null || nzVar == null || (arrayList = fwVar.q) == null || arrayList.isEmpty()) {
            return null;
        }
        return (View) nzVar.get(!z ? (String) fwVar.r.get(0) : (String) fwVar.q.get(0));
    }

    private static Object b(il ilVar, gj gjVar, boolean z) {
        if (gjVar == null) {
            return null;
        }
        return ilVar.b(!z ? gjVar.getExitTransition() : gjVar.getReturnTransition());
    }

    private static ia a(ia iaVar, SparseArray sparseArray, int i) {
        if (iaVar != null) {
            return iaVar;
        }
        ia iaVar2 = new ia();
        sparseArray.put(i, iaVar2);
        return iaVar2;
    }

    private static nz b(il ilVar, nz nzVar, Object obj, ia iaVar) {
        ArrayList arrayList;
        if (!nzVar.isEmpty() && obj != null) {
            gj gjVar = iaVar.d;
            nz nzVar2 = new nz();
            ilVar.a((Map) nzVar2, gjVar.requireView());
            fw fwVar = iaVar.f;
            if (iaVar.e) {
                gjVar.h();
                arrayList = fwVar.r;
            } else {
                gjVar.i();
                arrayList = fwVar.q;
            }
            if (arrayList != null) {
                oo.b(nzVar2, arrayList);
            }
            oo.b(nzVar, nzVar2.keySet());
            return nzVar2;
        }
        nzVar.clear();
        return null;
    }

    private static il a(gj gjVar, gj gjVar2) {
        ArrayList arrayList = new ArrayList();
        if (gjVar != null) {
            Object exitTransition = gjVar.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = gjVar.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = gjVar.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (gjVar2 != null) {
            Object enterTransition = gjVar2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = gjVar2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = gjVar2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        il ilVar = a;
        if (ilVar != null && a(ilVar, (List) arrayList)) {
            return a;
        }
        il ilVar2 = b;
        if (ilVar2 != null && a(ilVar2, (List) arrayList)) {
            return b;
        }
        if (a == null && b == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    private static Object a(il ilVar, gj gjVar, gj gjVar2, boolean z) {
        return ilVar.c(ilVar.b(!z ? gjVar.getSharedElementEnterTransition() : gjVar2.getSharedElementReturnTransition()));
    }

    private static Object a(il ilVar, gj gjVar, boolean z) {
        if (gjVar == null) {
            return null;
        }
        return ilVar.b(!z ? gjVar.getEnterTransition() : gjVar.getReenterTransition());
    }

    private static Object a(il ilVar, Object obj, Object obj2, Object obj3, gj gjVar, boolean z) {
        if (!(obj == null || obj2 == null || gjVar == null)) {
            if (!(!z ? gjVar.getAllowEnterTransitionOverlap() : gjVar.getAllowReturnTransitionOverlap())) {
                return ilVar.b(obj2, obj, obj3);
            }
        }
        return ilVar.a(obj2, obj, obj3);
    }

    static ArrayList a(il ilVar, Object obj, gj gjVar, ArrayList arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        View view2 = gjVar.getView();
        if (view2 != null) {
            ilVar.a(arrayList2, view2);
        }
        arrayList2.removeAll(arrayList);
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        ilVar.a(obj, arrayList2);
        return arrayList2;
    }

    static nz a(il ilVar, nz nzVar, Object obj, ia iaVar) {
        ArrayList arrayList;
        gj gjVar = iaVar.a;
        View view = gjVar.getView();
        if (nzVar.isEmpty() || obj == null || view == null) {
            nzVar.clear();
            return null;
        }
        nz nzVar2 = new nz();
        ilVar.a((Map) nzVar2, view);
        fw fwVar = iaVar.c;
        if (iaVar.b) {
            gjVar.i();
            arrayList = fwVar.q;
        } else {
            gjVar.h();
            arrayList = fwVar.r;
        }
        if (arrayList != null) {
            oo.b(nzVar2, arrayList);
            oo.b(nzVar2, nzVar.values());
        }
        for (int i = nzVar.h - 1; i >= 0; i--) {
            if (!nzVar2.containsKey((String) nzVar.c(i))) {
                nzVar.d(i);
            }
        }
        return nzVar2;
    }

    static void a(Context context, gt gtVar, ArrayList arrayList, ArrayList arrayList2, int i, int i2, boolean z, hb hbVar) {
        int i3;
        int i4;
        int i5;
        SparseArray sparseArray;
        hb hbVar2;
        nz nzVar;
        ArrayList arrayList3;
        gj gjVar;
        ArrayList arrayList4;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean z2;
        Object obj6;
        Rect rect;
        int i6;
        boolean z3;
        nz nzVar2;
        Object obj7;
        nz nzVar3;
        Object obj8;
        Rect rect2;
        View view;
        int i7;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7 = arrayList;
        ArrayList arrayList8 = arrayList2;
        int i8 = i2;
        boolean z4 = z;
        hb hbVar3 = hbVar;
        SparseArray sparseArray2 = new SparseArray();
        int i9 = i;
        while (true) {
            i3 = 0;
            if (i9 >= i8) {
                break;
            }
            fw fwVar = (fw) arrayList7.get(i9);
            if (!((Boolean) arrayList8.get(i9)).booleanValue()) {
                int size = fwVar.d.size();
                for (int i10 = 0; i10 < size; i10++) {
                    a(fwVar, (hs) fwVar.d.get(i10), sparseArray2, false, z4);
                }
            } else if (fwVar.a.l.a()) {
                for (int size2 = fwVar.d.size() - 1; size2 >= 0; size2--) {
                    a(fwVar, (hs) fwVar.d.get(size2), sparseArray2, true, z4);
                }
            }
            i9++;
        }
        if (sparseArray2.size() != 0) {
            View view2 = new View(context);
            int size3 = sparseArray2.size();
            int i11 = 0;
            while (i11 < size3) {
                int keyAt = sparseArray2.keyAt(i11);
                nz nzVar4 = new nz();
                int i12 = i8 - 1;
                while (i12 >= i) {
                    fw fwVar2 = (fw) arrayList7.get(i12);
                    int size4 = fwVar2.d.size();
                    while (true) {
                        if (i3 >= size4) {
                            break;
                        }
                        gj gjVar2 = ((hs) fwVar2.d.get(i3)).b;
                        if (gjVar2 != null) {
                            i7 = gjVar2.I;
                        } else {
                            i7 = 0;
                        }
                        if (i7 != 0 && i7 == keyAt) {
                            boolean booleanValue = ((Boolean) arrayList8.get(i12)).booleanValue();
                            ArrayList arrayList9 = fwVar2.q;
                            if (arrayList9 != null) {
                                int size5 = arrayList9.size();
                                if (booleanValue) {
                                    arrayList6 = fwVar2.q;
                                    arrayList5 = fwVar2.r;
                                } else {
                                    arrayList5 = fwVar2.q;
                                    arrayList6 = fwVar2.r;
                                }
                                int i13 = 0;
                                while (i13 < size5) {
                                    String str = (String) arrayList5.get(i13);
                                    ArrayList arrayList10 = arrayList6;
                                    String str2 = (String) arrayList6.get(i13);
                                    String str3 = (String) nzVar4.remove(str2);
                                    if (str3 != null) {
                                        nzVar4.put(str, str3);
                                    } else {
                                        nzVar4.put(str, str2);
                                    }
                                    i13++;
                                    ArrayList arrayList11 = arrayList2;
                                    int i14 = i2;
                                    arrayList6 = arrayList10;
                                }
                            }
                        } else {
                            i3++;
                            ArrayList arrayList12 = arrayList;
                            arrayList8 = arrayList2;
                            int i15 = i2;
                        }
                    }
                    i12--;
                    arrayList7 = arrayList;
                    arrayList8 = arrayList2;
                    int i16 = i2;
                    i3 = 0;
                }
                ia iaVar = (ia) sparseArray2.valueAt(i11);
                if (gtVar.a()) {
                    ViewGroup viewGroup = (ViewGroup) gtVar.a(keyAt);
                    if (viewGroup == null) {
                        hbVar2 = hbVar3;
                        sparseArray = sparseArray2;
                        i4 = i11;
                        i5 = size3;
                    } else if (z4) {
                        gj gjVar3 = iaVar.a;
                        gj gjVar4 = iaVar.d;
                        il a2 = a(gjVar4, gjVar3);
                        if (a2 != null) {
                            boolean z5 = iaVar.b;
                            boolean z6 = iaVar.e;
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = new ArrayList();
                            sparseArray = sparseArray2;
                            Object a3 = a(a2, gjVar3, z5);
                            Object b2 = b(a2, gjVar4, z6);
                            gj gjVar5 = iaVar.a;
                            int i17 = i11;
                            gj gjVar6 = iaVar.d;
                            if (gjVar5 != null) {
                                i6 = size3;
                                gjVar5.requireView().setVisibility(0);
                            } else {
                                i6 = size3;
                            }
                            if (gjVar5 == null) {
                                z3 = z5;
                                nzVar2 = nzVar4;
                                obj7 = null;
                            } else if (gjVar6 != null) {
                                boolean z7 = iaVar.b;
                                if (!nzVar4.isEmpty()) {
                                    obj8 = a(a2, gjVar5, gjVar6, z7);
                                } else {
                                    obj8 = null;
                                }
                                nz b3 = b(a2, nzVar4, obj8, iaVar);
                                nz a4 = a(a2, nzVar4, obj8, iaVar);
                                if (!nzVar4.isEmpty()) {
                                    a(arrayList14, b3, (Collection) nzVar4.keySet());
                                    a(arrayList13, a4, nzVar4.values());
                                    obj7 = obj8;
                                } else {
                                    if (b3 != null) {
                                        b3.clear();
                                    }
                                    if (a4 != null) {
                                        a4.clear();
                                    }
                                    obj7 = null;
                                }
                                if (a3 == null && b2 == null && obj7 == null) {
                                    z3 = z5;
                                    nzVar2 = nzVar4;
                                    obj7 = null;
                                } else {
                                    if (obj7 != null) {
                                        arrayList13.add(view2);
                                        a2.a(obj7, view2, arrayList14);
                                        nzVar2 = nzVar4;
                                        z3 = z5;
                                        a(a2, obj7, b2, b3, iaVar.e, iaVar.f);
                                        rect2 = new Rect();
                                        view = a(a4, iaVar, a3, z7);
                                        if (view != null) {
                                            a2.a(a3, rect2);
                                        }
                                    } else {
                                        z3 = z5;
                                        nzVar2 = nzVar4;
                                        view = null;
                                        rect2 = null;
                                    }
                                    pr.a(viewGroup, new hy(view, rect2));
                                }
                            } else {
                                z3 = z5;
                                nzVar2 = nzVar4;
                                obj7 = null;
                            }
                            if (a3 == null && obj7 == null && b2 == null) {
                                hbVar2 = hbVar;
                                i4 = i17;
                                i5 = i6;
                            } else {
                                ArrayList a5 = a(a2, b2, gjVar4, arrayList14, view2);
                                ArrayList a6 = a(a2, a3, gjVar3, arrayList13, view2);
                                a(a6, 4);
                                Object a7 = a(a2, a3, b2, obj7, gjVar3, z3);
                                if (gjVar4 == null || a5 == null) {
                                    hb hbVar4 = hbVar;
                                } else if (a5.size() > 0 || arrayList14.size() > 0) {
                                    mo moVar = new mo();
                                    hb hbVar5 = hbVar;
                                    hbVar5.a(gjVar4, moVar);
                                    a2.a(a7, moVar, (Runnable) new hu(hbVar5, gjVar4, moVar));
                                } else {
                                    hb hbVar6 = hbVar;
                                }
                                if (a7 != null) {
                                    if (gjVar4 != null) {
                                        if (b2 != null && gjVar4.w && gjVar4.K && gjVar4.X) {
                                            gjVar4.a(true);
                                            a2.b(b2, gjVar4.getView(), a5);
                                            pr.a(gjVar4.R, new hv(a5));
                                        }
                                    }
                                    ArrayList arrayList15 = new ArrayList();
                                    int i18 = 0;
                                    for (int size6 = arrayList13.size(); i18 < size6; size6 = size6) {
                                        View view3 = (View) arrayList13.get(i18);
                                        arrayList15.add(qb.p(view3));
                                        qb.a(view3, (String) null);
                                        i18++;
                                    }
                                    a2.a(a7, a3, a6, b2, a5, obj7, arrayList13);
                                    a2.a(viewGroup, a7);
                                    int size7 = arrayList13.size();
                                    ArrayList arrayList16 = new ArrayList();
                                    int i19 = 0;
                                    while (i19 < size7) {
                                        View view4 = (View) arrayList14.get(i19);
                                        String p = qb.p(view4);
                                        arrayList16.add(p);
                                        if (p != null) {
                                            qb.a(view4, (String) null);
                                            nzVar3 = nzVar2;
                                            String str4 = (String) nzVar3.get(p);
                                            int i20 = 0;
                                            while (true) {
                                                if (i20 < size7) {
                                                    if (str4.equals(arrayList15.get(i20))) {
                                                        qb.a((View) arrayList13.get(i20), p);
                                                        break;
                                                    } else {
                                                        i20++;
                                                        hb hbVar7 = hbVar;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            nzVar3 = nzVar2;
                                        }
                                        i19++;
                                        hb hbVar8 = hbVar;
                                        nzVar2 = nzVar3;
                                    }
                                    pr.a(viewGroup, new ii(size7, arrayList13, arrayList15, arrayList14, arrayList16));
                                    a(a6, 0);
                                    a2.a(obj7, arrayList14, arrayList13);
                                    hbVar2 = hbVar;
                                    i4 = i17;
                                    i5 = i6;
                                } else {
                                    hbVar2 = hbVar;
                                    i4 = i17;
                                    i5 = i6;
                                }
                            }
                        } else {
                            sparseArray = sparseArray2;
                            hbVar2 = hbVar;
                            i4 = i11;
                            i5 = size3;
                        }
                    } else {
                        sparseArray = sparseArray2;
                        nz nzVar5 = nzVar4;
                        int i21 = i11;
                        int i22 = size3;
                        gj gjVar7 = iaVar.a;
                        gj gjVar8 = iaVar.d;
                        il a8 = a(gjVar8, gjVar7);
                        if (a8 != null) {
                            boolean z8 = iaVar.b;
                            boolean z9 = iaVar.e;
                            Object a9 = a(a8, gjVar7, z8);
                            Object b4 = b(a8, gjVar8, z9);
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = new ArrayList();
                            gj gjVar9 = iaVar.a;
                            gj gjVar10 = iaVar.d;
                            if (gjVar9 == null) {
                                gjVar = gjVar7;
                                nzVar = nzVar5;
                                arrayList3 = arrayList18;
                                arrayList4 = arrayList17;
                                obj2 = b4;
                                i4 = i21;
                                i5 = i22;
                                obj3 = null;
                                obj = null;
                                hbVar2 = hbVar;
                            } else if (gjVar10 != null) {
                                boolean z10 = iaVar.b;
                                if (!nzVar5.isEmpty()) {
                                    obj5 = a(a8, gjVar9, gjVar10, z10);
                                } else {
                                    obj5 = null;
                                }
                                nz b5 = b(a8, nzVar5, obj5, iaVar);
                                if (!nzVar5.isEmpty()) {
                                    arrayList17.addAll(b5.values());
                                } else {
                                    obj5 = null;
                                }
                                if (a9 == null && b4 == null && obj5 == null) {
                                    gjVar = gjVar7;
                                    nzVar = nzVar5;
                                    arrayList3 = arrayList18;
                                    arrayList4 = arrayList17;
                                    obj2 = b4;
                                    i4 = i21;
                                    i5 = i22;
                                    obj3 = null;
                                    obj = null;
                                    hbVar2 = hbVar;
                                } else {
                                    if (obj5 != null) {
                                        Rect rect3 = new Rect();
                                        a8.a(obj5, view2, arrayList17);
                                        gjVar = gjVar7;
                                        Rect rect4 = rect3;
                                        obj6 = obj5;
                                        z2 = z10;
                                        arrayList3 = arrayList18;
                                        arrayList4 = arrayList17;
                                        a(a8, obj5, b4, b5, iaVar.e, iaVar.f);
                                        if (a9 != null) {
                                            a8.a(a9, rect4);
                                        }
                                        rect = rect4;
                                    } else {
                                        gjVar = gjVar7;
                                        obj6 = obj5;
                                        z2 = z10;
                                        arrayList3 = arrayList18;
                                        arrayList4 = arrayList17;
                                        rect = null;
                                    }
                                    obj = null;
                                    nzVar = nzVar5;
                                    i4 = i21;
                                    obj2 = b4;
                                    i5 = i22;
                                    hbVar2 = hbVar;
                                    pr.a(viewGroup, new hz(a8, nzVar5, obj6, iaVar, arrayList3, view2, z2, arrayList4, a9, rect));
                                    obj3 = obj6;
                                }
                            } else {
                                gjVar = gjVar7;
                                nzVar = nzVar5;
                                arrayList3 = arrayList18;
                                arrayList4 = arrayList17;
                                obj2 = b4;
                                i4 = i21;
                                i5 = i22;
                                obj = null;
                                hbVar2 = hbVar;
                                obj3 = null;
                            }
                            if (a9 != null || obj3 != null || obj2 != null) {
                                ArrayList arrayList19 = arrayList4;
                                ArrayList a10 = a(a8, obj2, gjVar8, arrayList19, view2);
                                if (a10 != null) {
                                    obj4 = a10.isEmpty() ? obj : obj2;
                                } else {
                                    obj4 = obj;
                                }
                                a8.b(a9, view2);
                                Object a11 = a(a8, a9, obj4, obj3, gjVar, iaVar.b);
                                if (!(gjVar8 == null || a10 == null || (a10.size() <= 0 && arrayList19.size() <= 0))) {
                                    mo moVar2 = new mo();
                                    hbVar2.a(gjVar8, moVar2);
                                    a8.a(a11, moVar2, (Runnable) new hw(hbVar2, gjVar8, moVar2));
                                }
                                if (a11 != null) {
                                    ArrayList arrayList20 = new ArrayList();
                                    a8.a(a11, a9, arrayList20, obj4, a10, obj3, arrayList3);
                                    pr.a(viewGroup, new hx(a9, a8, view2, gjVar, arrayList3, arrayList20, a10, obj4));
                                    ArrayList arrayList21 = arrayList3;
                                    nz nzVar6 = nzVar;
                                    pr.a(viewGroup, new ij(arrayList21, nzVar6));
                                    a8.a(viewGroup, a11);
                                    pr.a(viewGroup, new ik(arrayList21, nzVar6));
                                }
                            }
                        } else {
                            hbVar2 = hbVar;
                            i4 = i21;
                            i5 = i22;
                        }
                    }
                } else {
                    hbVar2 = hbVar3;
                    sparseArray = sparseArray2;
                    i4 = i11;
                    i5 = size3;
                }
                i11 = i4 + 1;
                arrayList7 = arrayList;
                arrayList8 = arrayList2;
                i8 = i2;
                z4 = z;
                hbVar3 = hbVar2;
                sparseArray2 = sparseArray;
                size3 = i5;
                i3 = 0;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003b, code lost:
        if (r0.w != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x005e, code lost:
        if (r0.K == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0060, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x008a, code lost:
        if (r0.K == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x008c, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00db A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(defpackage.fw r8, defpackage.hs r9, android.util.SparseArray r10, boolean r11, boolean r12) {
        /*
            gj r0 = r9.b
            if (r0 == 0) goto L_0x00e6
            int r1 = r0.I
            if (r1 == 0) goto L_0x00e6
            if (r11 == 0) goto L_0x0011
            int[] r2 = c
            int r9 = r9.a
            r9 = r2[r9]
            goto L_0x0013
        L_0x0011:
            int r9 = r9.a
        L_0x0013:
            r2 = 1
            r3 = 0
            if (r9 == r2) goto L_0x007f
            r4 = 3
            if (r9 == r4) goto L_0x0056
            r4 = 4
            if (r9 == r4) goto L_0x003e
            r4 = 5
            if (r9 == r4) goto L_0x002b
            r4 = 6
            if (r9 == r4) goto L_0x0056
            r4 = 7
            if (r9 == r4) goto L_0x007f
            r9 = 0
            r2 = 0
            r4 = 0
            goto L_0x0090
        L_0x002b:
            if (r12 != 0) goto L_0x0031
            boolean r9 = r0.K
            goto L_0x008f
        L_0x0031:
            boolean r9 = r0.X
            if (r9 == 0) goto L_0x008e
            boolean r9 = r0.K
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.w
            if (r9 == 0) goto L_0x008e
            goto L_0x008c
        L_0x003e:
            if (r12 != 0) goto L_0x0049
            boolean r9 = r0.w
            if (r9 == 0) goto L_0x0062
            boolean r9 = r0.K
            if (r9 != 0) goto L_0x0062
        L_0x0048:
            goto L_0x0060
        L_0x0049:
            boolean r9 = r0.X
            if (r9 == 0) goto L_0x0062
            boolean r9 = r0.w
            if (r9 == 0) goto L_0x0062
            boolean r9 = r0.K
            if (r9 == 0) goto L_0x0062
            goto L_0x0048
        L_0x0056:
            boolean r9 = r0.w
            if (r12 != 0) goto L_0x0064
            if (r9 == 0) goto L_0x0062
            boolean r9 = r0.K
            if (r9 != 0) goto L_0x0062
        L_0x0060:
            r9 = 1
            goto L_0x007a
        L_0x0062:
            r9 = 0
            goto L_0x007a
        L_0x0064:
            if (r9 != 0) goto L_0x0079
            android.view.View r9 = r0.S
            if (r9 == 0) goto L_0x0079
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0079
            float r9 = r0.Y
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0079
            r9 = 1
            goto L_0x007a
        L_0x0079:
            r9 = 0
        L_0x007a:
            r4 = r9
            r9 = 0
            r2 = 0
            r3 = 1
            goto L_0x0090
        L_0x007f:
            if (r12 == 0) goto L_0x0084
            boolean r9 = r0.W
            goto L_0x008f
        L_0x0084:
            boolean r9 = r0.w
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.K
            if (r9 != 0) goto L_0x008e
        L_0x008c:
            r9 = 1
            goto L_0x008f
        L_0x008e:
            r9 = 0
        L_0x008f:
            r4 = 0
        L_0x0090:
            java.lang.Object r5 = r10.get(r1)
            ia r5 = (defpackage.ia) r5
            if (r9 == 0) goto L_0x00a3
            ia r5 = a((defpackage.ia) r5, (android.util.SparseArray) r10, (int) r1)
            r5.a = r0
            r5.b = r11
            r5.c = r8
            goto L_0x00a4
        L_0x00a3:
        L_0x00a4:
            r9 = 0
            if (r12 != 0) goto L_0x00c4
            if (r2 == 0) goto L_0x00c4
            if (r5 == 0) goto L_0x00b2
            gj r2 = r5.d
            if (r2 == r0) goto L_0x00b0
            goto L_0x00b2
        L_0x00b0:
            r5.d = r9
        L_0x00b2:
            boolean r2 = r8.s
            if (r2 != 0) goto L_0x00c4
            hl r2 = r8.a
            hq r6 = r2.e(r0)
            hr r7 = r2.a
            r7.a((defpackage.hq) r6)
            r2.c((defpackage.gj) r0)
        L_0x00c4:
            if (r4 != 0) goto L_0x00c7
            goto L_0x00d9
        L_0x00c7:
            if (r5 != 0) goto L_0x00ca
            goto L_0x00cf
        L_0x00ca:
            gj r2 = r5.d
            if (r2 == 0) goto L_0x00cf
            goto L_0x00d9
        L_0x00cf:
            ia r5 = a((defpackage.ia) r5, (android.util.SparseArray) r10, (int) r1)
            r5.d = r0
            r5.e = r11
            r5.f = r8
        L_0x00d9:
            if (r12 != 0) goto L_0x00e5
            if (r3 == 0) goto L_0x00e5
            if (r5 == 0) goto L_0x00e5
            gj r8 = r5.a
            if (r8 != r0) goto L_0x00e5
            r5.a = r9
        L_0x00e5:
            return
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib.a(fw, hs, android.util.SparseArray, boolean, boolean):void");
    }

    private static void a(il ilVar, Object obj, Object obj2, nz nzVar, boolean z, fw fwVar) {
        ArrayList arrayList = fwVar.q;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = (View) nzVar.get(!z ? (String) fwVar.q.get(0) : (String) fwVar.r.get(0));
            ilVar.a(obj, view);
            if (obj2 != null) {
                ilVar.a(obj2, view);
            }
        }
    }

    static void a(ArrayList arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    private static void a(ArrayList arrayList, nz nzVar, Collection collection) {
        for (int i = nzVar.h - 1; i >= 0; i--) {
            View view = (View) nzVar.c(i);
            if (collection.contains(qb.p(view))) {
                arrayList.add(view);
            }
        }
    }

    private static boolean a(il ilVar, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!ilVar.a(list.get(i))) {
                return false;
            }
        }
        return true;
    }
}
