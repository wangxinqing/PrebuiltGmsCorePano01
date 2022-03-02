package defpackage;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: bzk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bzk extends bzi {
    private static final int[] l = {-2};
    private bzx A;
    private bzo B;
    private cab C;
    private caf D;
    private bzz E;
    private cag F;
    private Set G;
    private List H;
    private List I;
    public String f;
    public boolean g;
    public List h;
    public List i;
    public List j;
    public long k;
    private bzk m;
    private cad n;
    private cad o;
    private bzq p;
    private bzv q;
    private bzg r;
    private bzy s;
    private bzw t;
    private bzt u;
    private bzh v;
    private bzj w;
    private bzr x;
    private cae y;
    private bzs z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bzk(defpackage.atjt r8) {
        /*
            r7 = this;
            int r0 = r8.b
            atjs r0 = defpackage.atjs.a(r0)
            if (r0 == 0) goto L_0x000a
            r5 = r0
            goto L_0x000d
        L_0x000a:
            atjs r0 = defpackage.atjs.UNKNOWN_CONTEXT_FENCE_TYPE
            r5 = r0
        L_0x000d:
            java.lang.Class<bzk> r2 = defpackage.bzk.class
            r4 = 0
            r0 = 0
            int[] r6 = new int[r0]
            r1 = r7
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = 0
            r7.m = r8
            r7.f = r8
            r7.g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzk.<init>(atjt):void");
    }

    private final void a(atjs atjs, List list) {
        atjs atjs2 = this.a;
        if (atjs2 != atjs) {
            atjs atjs3 = atjs.UNKNOWN_CONTEXT_FENCE_TYPE;
            int ordinal = atjs2.ordinal();
            if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 22) {
                for (bzk a : a()) {
                    a.a(atjs, list);
                }
                return;
            }
            return;
        }
        list.add(o());
    }

    public final boolean c() {
        if (q()) {
            bzn o2 = o();
            if (o2 != null) {
                return o2.c();
            }
            ((anih) ((anih) bxk.a.c()).a("bzk", "c", 848, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextFenceImpl] Expected to find a primitive fence for type=%s", (Object) this.a);
            return false;
        } else if (super.c()) {
            return true;
        } else {
            for (bzk c : a()) {
                if (c.c()) {
                    return true;
                }
            }
            return false;
        }
    }

    public final int e() {
        bzn o2 = o();
        if (o2 == null) {
            return 0;
        }
        return o2.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzk)) {
            return false;
        }
        bzk bzk = (bzk) obj;
        bzk t2 = t();
        bzk t3 = bzk.t();
        if (t2.a == atjs.OR && t3.a == atjs.OR) {
            if (t2.a().size() == t3.a().size()) {
                for (bzk bzk2 : t2.a()) {
                    if (bzk2.a == atjs.AND) {
                        Iterator it = t3.a().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                return false;
                            }
                            bzk bzk3 = (bzk) it.next();
                            if (bzk3.a != atjs.AND) {
                                ((anih) ((anih) bxk.a.c()).a("bxs", "b", 71, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceComparator] findMatching: Expected AND. Got %s", (Object) bzk3.a);
                            } else if (bzk2.a().size() == bzk3.a().size()) {
                                Iterator it2 = bzk2.a().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        bzk bzk4 = (bzk) it2.next();
                                        if (!bzk4.q()) {
                                            if (bzk4.a == atjs.NOT && !bxs.a((bzk) bzk4.a().get(0), true, bzk3)) {
                                                break;
                                            }
                                        } else if (!bxs.a(bzk4, false, bzk3)) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        ((anih) ((anih) bxk.a.c()).a("bxs", "a", 47, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceComparator] areEquivalent: Expected AND. Got %s", (Object) bzk2.a);
                    }
                }
                return true;
            }
            return false;
        }
        ((anih) ((anih) bxk.a.c()).a("bxs", "a", 33, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceComparator] Expected OR. fence1 type=%s, fence2 type=%s", (Object) this.a, (Object) bzk.a);
        return false;
    }

    public final int[] g() {
        bzn o2 = o();
        if (o2 == null) {
            return l;
        }
        return o2.g();
    }

    public final bza h() {
        if (!r()) {
            return super.h();
        }
        bza a = bza.a();
        atjs atjs = atjs.UNKNOWN_CONTEXT_FENCE_TYPE;
        int ordinal = this.a.ordinal();
        if (ordinal == 1) {
            for (bzk bzk : a()) {
                if (a.d()) {
                    a.a(bzk.h());
                } else {
                    bza h2 = bzk.h();
                    bza a2 = bza.a();
                    Iterator it = a.a.iterator();
                    Iterator it2 = h2.a.iterator();
                    if (it.hasNext() && it2.hasNext()) {
                        bzc bzc = (bzc) it.next();
                        bzc bzc2 = (bzc) it2.next();
                        while (true) {
                            long j2 = bzc.a;
                            if (j2 < bzc2.b) {
                                long j3 = bzc.b;
                                long j4 = bzc2.a;
                                if (j3 > j4) {
                                    bza.b(new bzc(Math.max(j2, j4), Math.min(bzc.b, bzc2.b)), a2.a);
                                }
                            }
                            if (bzc.b <= bzc2.b) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                bzc = (bzc) it.next();
                            } else if (!it2.hasNext()) {
                                break;
                            } else {
                                bzc2 = (bzc) it2.next();
                            }
                        }
                    }
                    if (a2.d()) {
                        return a2;
                    }
                    a = a2;
                }
            }
            new Object[1][0] = Integer.valueOf(a.a.size());
            return a;
        } else if (ordinal == 2) {
            for (bzk h3 : a()) {
                a.a(h3.h());
            }
            new Object[1][0] = Integer.valueOf(a.a.size());
            return a;
        } else if (ordinal == 3) {
            bza h4 = ((bzk) a().get(0)).h();
            bza a3 = bza.a();
            Iterator it3 = h4.a.iterator();
            long j5 = 0;
            while (it3.hasNext()) {
                bzc bzc3 = (bzc) it3.next();
                long j6 = bzc3.a;
                if (j5 < j6) {
                    bza.b(new bzc(j5, j6), a3.a);
                    j5 = bzc3.b;
                }
            }
            if (j5 < Long.MAX_VALUE) {
                bza.b(new bzc(j5, Long.MAX_VALUE), a3.a);
            }
            return a3;
        } else if (ordinal == 22) {
            return ((bzk) a().get(0)).h();
        } else {
            bzn o2 = o();
            if (o2 != null) {
                return o2.h();
            }
            ((anih) ((anih) bxk.a.c()).a("bzk", "h", 818, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextFenceImpl] Expected to find a primitive fence for type = %s", (Object) this.a);
            return a;
        }
    }

    public final int hashCode() {
        int i2 = 17;
        for (bzk a : t().a()) {
            for (bzk bzk : a.a()) {
                if (bzk.q()) {
                    i2 += (i2 * 31) + bzk.o().hashCode();
                } else if (bzk.a == atjs.NOT) {
                    i2 += (i2 * 31) + ((bzk) bzk.a().get(0)).o().hashCode();
                }
            }
        }
        return i2;
    }

    public final long i() {
        return this.k;
    }

    public final cad j() {
        atjt atjt = (atjt) this.c;
        if ((atjt.a & 2) == 0) {
            return null;
        }
        cad cad = this.n;
        if (cad == null) {
            atme atme = atjt.d;
            if (atme == null) {
                atme = atme.g;
            }
            cad = new cad(atme);
            this.n = cad;
            cad.d = this.d;
        }
        return cad;
    }

    public final bzv k() {
        atjt atjt = (atjt) this.c;
        if ((atjt.a & 8) == 0) {
            return null;
        }
        bzv bzv = this.q;
        if (bzv == null) {
            atlj atlj = atjt.f;
            if (atlj == null) {
                atlj = atlj.h;
            }
            bzv = new bzv(atlj);
            this.q = bzv;
            bzv.d = this.d;
        }
        return bzv;
    }

    public final bzj l() {
        atjt atjt = (atjt) this.c;
        if ((atjt.a & 512) == 0) {
            return null;
        }
        bzj bzj = this.w;
        if (bzj == null) {
            atji atji = atjt.l;
            if (atji == null) {
                atji = atji.d;
            }
            bzj = new bzj(atji);
            this.w = bzj;
            bzj.d = this.d;
        }
        return bzj;
    }

    public final Set m() {
        if (((atjt) this.c).u.size() == 0) {
            return null;
        }
        if (this.G == null) {
            this.G = new HashSet(((atjt) this.c).u.size());
            for (atjv atjv : new aucu(((atjt) this.c).u, atjt.v)) {
                this.G.add(Integer.valueOf(atjv.bA));
            }
        }
        return this.G;
    }

    public final List n() {
        if (this.I == null) {
            this.I = a(atjs.PLACE_FENCE);
        }
        return this.I;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: atlo} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v6, types: [bzn] */
    /* JADX WARNING: type inference failed for: r1v9, types: [bzn] */
    /* JADX WARNING: type inference failed for: r1v12, types: [bzn] */
    /* JADX WARNING: type inference failed for: r1v15, types: [bzn] */
    /* JADX WARNING: type inference failed for: r1v18, types: [bzn] */
    /* JADX WARNING: type inference failed for: r1v21, types: [bzn] */
    /* JADX WARNING: type inference failed for: r1v24, types: [bzn] */
    /* JADX WARNING: type inference failed for: r1v27, types: [bzn] */
    /* JADX WARNING: type inference failed for: r1v30, types: [bzn] */
    /* JADX WARNING: type inference failed for: r1v33, types: [bzn] */
    /* JADX WARNING: type inference failed for: r1v36, types: [bzn] */
    /* JADX WARNING: type inference failed for: r1v39, types: [bzn] */
    /* JADX WARNING: type inference failed for: r1v42, types: [bzn] */
    /* JADX WARNING: type inference failed for: r1v45, types: [bzn] */
    /* JADX WARNING: type inference failed for: r1v48, types: [bzn] */
    /* JADX WARNING: type inference failed for: r1v51 */
    /* JADX WARNING: type inference failed for: r1v52 */
    /* JADX WARNING: type inference failed for: r1v53 */
    /* JADX WARNING: type inference failed for: r1v54 */
    /* JADX WARNING: type inference failed for: r1v55 */
    /* JADX WARNING: type inference failed for: r1v56 */
    /* JADX WARNING: type inference failed for: r1v57 */
    /* JADX WARNING: type inference failed for: r1v58 */
    /* JADX WARNING: type inference failed for: r1v59 */
    /* JADX WARNING: type inference failed for: r1v60 */
    /* JADX WARNING: type inference failed for: r1v61 */
    /* JADX WARNING: type inference failed for: r1v62 */
    /* JADX WARNING: type inference failed for: r1v63 */
    /* JADX WARNING: type inference failed for: r1v64 */
    /* JADX WARNING: type inference failed for: r1v65 */
    /* JADX WARNING: type inference failed for: r1v66 */
    /* JADX WARNING: type inference failed for: r1v67 */
    /* JADX WARNING: type inference failed for: r1v68 */
    /* JADX WARNING: type inference failed for: r1v69 */
    /* JADX WARNING: type inference failed for: r1v70 */
    /* JADX WARNING: type inference failed for: r1v71 */
    /* JADX WARNING: type inference failed for: r1v72 */
    /* JADX WARNING: type inference failed for: r1v73 */
    /* JADX WARNING: type inference failed for: r1v74 */
    /* JADX WARNING: type inference failed for: r1v75 */
    /* JADX WARNING: type inference failed for: r1v76 */
    /* JADX WARNING: type inference failed for: r1v77 */
    /* JADX WARNING: type inference failed for: r1v78 */
    /* JADX WARNING: type inference failed for: r1v79 */
    /* JADX WARNING: type inference failed for: r1v80 */
    /* JADX WARNING: type inference failed for: r1v81 */
    /* JADX WARNING: type inference failed for: r1v82 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bzn o() {
        /*
            r6 = this;
            atjs r0 = defpackage.atjs.UNKNOWN_CONTEXT_FENCE_TYPE
            atjs r0 = r6.a
            int r0 = r0.ordinal()
            r1 = 0
            switch(r0) {
                case 1: goto L_0x0279;
                case 2: goto L_0x0279;
                case 3: goto L_0x0279;
                case 4: goto L_0x0274;
                case 5: goto L_0x023b;
                case 6: goto L_0x0236;
                case 7: goto L_0x0214;
                case 8: goto L_0x01f2;
                case 9: goto L_0x01d0;
                case 10: goto L_0x01ae;
                case 11: goto L_0x018c;
                case 12: goto L_0x0187;
                case 13: goto L_0x0165;
                case 14: goto L_0x000c;
                case 15: goto L_0x0142;
                case 16: goto L_0x0120;
                case 17: goto L_0x00fc;
                case 18: goto L_0x00d9;
                case 19: goto L_0x00b6;
                case 20: goto L_0x0093;
                case 21: goto L_0x0070;
                case 22: goto L_0x0279;
                case 23: goto L_0x004d;
                case 24: goto L_0x002a;
                default: goto L_0x000c;
            }
        L_0x000c:
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r2 = 448(0x1c0, float:6.28E-43)
            java.lang.String r3 = "bzk"
            java.lang.String r4 = "o"
            java.lang.String r5 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r4, (int) r2, (java.lang.String) r5)
            anih r0 = (defpackage.anih) r0
            atjs r2 = r6.a
            java.lang.String r3 = "[ContextFenceImpl] Unknown fence type=%s"
            r0.a((java.lang.String) r3, (java.lang.Object) r2)
            return r1
        L_0x002a:
            audx r0 = r6.c
            atjt r0 = (defpackage.atjt) r0
            int r2 = r0.a
            r3 = 4194304(0x400000, float:5.877472E-39)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x004b
            cag r1 = r6.F
            if (r1 != 0) goto L_0x004b
            cag r1 = new cag
            atmn r0 = r0.y
            if (r0 != 0) goto L_0x0041
            atmn r0 = defpackage.atmn.e
        L_0x0041:
            r1.<init>(r0)
            r6.F = r1
            bzm r0 = r6.d
            r1.d = r0
            goto L_0x004c
        L_0x004b:
        L_0x004c:
            return r1
        L_0x004d:
            audx r0 = r6.c
            atjt r0 = (defpackage.atjt) r0
            int r2 = r0.a
            r3 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x006e
            bzz r1 = r6.E
            if (r1 != 0) goto L_0x006e
            bzz r1 = new bzz
            atlv r0 = r0.x
            if (r0 != 0) goto L_0x0064
            atlv r0 = defpackage.atlv.a
        L_0x0064:
            r1.<init>(r0)
            r6.E = r1
            bzm r0 = r6.d
            r1.d = r0
            goto L_0x006f
        L_0x006e:
        L_0x006f:
            return r1
        L_0x0070:
            audx r0 = r6.c
            atjt r0 = (defpackage.atjt) r0
            int r2 = r0.a
            r3 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0091
            caf r1 = r6.D
            if (r1 != 0) goto L_0x0091
            caf r1 = new caf
            atmk r0 = r0.t
            if (r0 != 0) goto L_0x0087
            atmk r0 = defpackage.atmk.g
        L_0x0087:
            r1.<init>(r0)
            r6.D = r1
            bzm r0 = r6.d
            r1.d = r0
            goto L_0x0092
        L_0x0091:
        L_0x0092:
            return r1
        L_0x0093:
            audx r0 = r6.c
            atjt r0 = (defpackage.atjt) r0
            int r2 = r0.a
            r3 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x00b4
            cad r1 = r6.o
            if (r1 != 0) goto L_0x00b4
            cad r1 = new cad
            atme r0 = r0.s
            if (r0 != 0) goto L_0x00aa
            atme r0 = defpackage.atme.g
        L_0x00aa:
            r1.<init>(r0)
            r6.o = r1
            bzm r0 = r6.d
            r1.d = r0
            goto L_0x00b5
        L_0x00b4:
        L_0x00b5:
            return r1
        L_0x00b6:
            audx r0 = r6.c
            atjt r0 = (defpackage.atjt) r0
            int r2 = r0.a
            r3 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x00d7
            cab r1 = r6.C
            if (r1 != 0) goto L_0x00d7
            cab r1 = new cab
            atly r0 = r0.r
            if (r0 != 0) goto L_0x00cd
            atly r0 = defpackage.atly.d
        L_0x00cd:
            r1.<init>(r0)
            r6.C = r1
            bzm r0 = r6.d
            r1.d = r0
            goto L_0x00d8
        L_0x00d7:
        L_0x00d8:
            return r1
        L_0x00d9:
            audx r0 = r6.c
            atjt r0 = (defpackage.atjt) r0
            int r2 = r0.a
            r3 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x00fa
            bzx r1 = r6.A
            if (r1 != 0) goto L_0x00fa
            bzx r1 = new bzx
            atlr r0 = r0.q
            if (r0 != 0) goto L_0x00f0
            atlr r0 = defpackage.atlr.b
        L_0x00f0:
            r1.<init>(r0)
            r6.A = r1
            bzm r0 = r6.d
            r1.d = r0
            goto L_0x00fb
        L_0x00fa:
        L_0x00fb:
            return r1
        L_0x00fc:
            audx r0 = r6.c
            atjt r0 = (defpackage.atjt) r0
            int r2 = r0.a
            r3 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x011e
            bzs r1 = r6.z
            if (r1 != 0) goto L_0x011e
            bzs r1 = new bzs
            atlc r0 = r0.p
            if (r0 != 0) goto L_0x0114
            atlc r0 = defpackage.atlc.b
        L_0x0114:
            r1.<init>(r0)
            r6.z = r1
            bzm r0 = r6.d
            r1.d = r0
            goto L_0x011f
        L_0x011e:
        L_0x011f:
            return r1
        L_0x0120:
            audx r0 = r6.c
            atjt r0 = (defpackage.atjt) r0
            int r2 = r0.a
            r2 = r2 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0140
            bzo r1 = r6.B
            if (r1 != 0) goto L_0x0140
            bzo r1 = new bzo
            atjz r0 = r0.o
            if (r0 != 0) goto L_0x0136
            atjz r0 = defpackage.atjz.c
        L_0x0136:
            r1.<init>(r0)
            r6.B = r1
            bzm r0 = r6.d
            r1.d = r0
            goto L_0x0141
        L_0x0140:
        L_0x0141:
            return r1
        L_0x0142:
            audx r0 = r6.c
            atjt r0 = (defpackage.atjt) r0
            int r2 = r0.a
            r2 = r2 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0163
            cae r1 = r6.y
            if (r1 != 0) goto L_0x0163
            cae r1 = new cae
            atmh r0 = r0.n
            if (r0 == 0) goto L_0x0157
            goto L_0x0159
        L_0x0157:
            atmh r0 = defpackage.atmh.c
        L_0x0159:
            r1.<init>(r0)
            r6.y = r1
            bzm r0 = r6.d
            r1.d = r0
            goto L_0x0164
        L_0x0163:
        L_0x0164:
            return r1
        L_0x0165:
            audx r0 = r6.c
            atjt r0 = (defpackage.atjt) r0
            int r2 = r0.a
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0185
            bzr r1 = r6.x
            if (r1 != 0) goto L_0x0185
            bzr r1 = new bzr
            atkz r0 = r0.m
            if (r0 != 0) goto L_0x017b
            atkz r0 = defpackage.atkz.h
        L_0x017b:
            r1.<init>(r0)
            r6.x = r1
            bzm r0 = r6.d
            r1.d = r0
            goto L_0x0186
        L_0x0185:
        L_0x0186:
            return r1
        L_0x0187:
            bzj r0 = r6.l()
            return r0
        L_0x018c:
            audx r0 = r6.c
            atjt r0 = (defpackage.atjt) r0
            int r2 = r0.a
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x01ac
            bzh r1 = r6.v
            if (r1 != 0) goto L_0x01ac
            bzh r1 = new bzh
            atje r0 = r0.k
            if (r0 != 0) goto L_0x01a2
            atje r0 = defpackage.atje.i
        L_0x01a2:
            r1.<init>(r0)
            r6.v = r1
            bzm r0 = r6.d
            r1.d = r0
            goto L_0x01ad
        L_0x01ac:
        L_0x01ad:
            return r1
        L_0x01ae:
            audx r0 = r6.c
            atjt r0 = (defpackage.atjt) r0
            int r2 = r0.a
            r2 = r2 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x01ce
            bzt r1 = r6.u
            if (r1 != 0) goto L_0x01ce
            bzt r1 = new bzt
            atlf r0 = r0.j
            if (r0 != 0) goto L_0x01c4
            atlf r0 = defpackage.atlf.d
        L_0x01c4:
            r1.<init>(r0)
            r6.u = r1
            bzm r0 = r6.d
            r1.d = r0
            goto L_0x01cf
        L_0x01ce:
        L_0x01cf:
            return r1
        L_0x01d0:
            audx r0 = r6.c
            atjt r0 = (defpackage.atjt) r0
            int r2 = r0.a
            r2 = r2 & 64
            if (r2 == 0) goto L_0x01f0
            bzw r1 = r6.t
            if (r1 != 0) goto L_0x01f0
            bzw r1 = new bzw
            atln r0 = r0.i
            if (r0 != 0) goto L_0x01e6
            atln r0 = defpackage.atln.g
        L_0x01e6:
            r1.<init>(r0)
            r6.t = r1
            bzm r0 = r6.d
            r1.d = r0
            goto L_0x01f1
        L_0x01f0:
        L_0x01f1:
            return r1
        L_0x01f2:
            audx r0 = r6.c
            atjt r0 = (defpackage.atjt) r0
            int r2 = r0.a
            r2 = r2 & 32
            if (r2 == 0) goto L_0x0212
            bzy r1 = r6.s
            if (r1 != 0) goto L_0x0212
            bzy r1 = new bzy
            atlu r0 = r0.h
            if (r0 != 0) goto L_0x0208
            atlu r0 = defpackage.atlu.e
        L_0x0208:
            r1.<init>(r0)
            r6.s = r1
            bzm r0 = r6.d
            r1.d = r0
            goto L_0x0213
        L_0x0212:
        L_0x0213:
            return r1
        L_0x0214:
            audx r0 = r6.c
            atjt r0 = (defpackage.atjt) r0
            int r2 = r0.a
            r2 = r2 & 16
            if (r2 == 0) goto L_0x0234
            bzg r1 = r6.r
            if (r1 != 0) goto L_0x0234
            bzg r1 = new bzg
            atjb r0 = r0.g
            if (r0 != 0) goto L_0x022a
            atjb r0 = defpackage.atjb.e
        L_0x022a:
            r1.<init>(r0)
            r6.r = r1
            bzm r0 = r6.d
            r1.d = r0
            goto L_0x0235
        L_0x0234:
        L_0x0235:
            return r1
        L_0x0236:
            bzv r0 = r6.k()
            return r0
        L_0x023b:
            audx r0 = r6.c
            atjt r0 = (defpackage.atjt) r0
            int r2 = r0.a
            r2 = r2 & 4
            if (r2 == 0) goto L_0x0272
            bzq r2 = r6.p
            if (r2 != 0) goto L_0x0270
            bzq r2 = new bzq
            atku r0 = r0.e
            if (r0 != 0) goto L_0x0251
            atku r0 = defpackage.atku.j
        L_0x0251:
            audx r3 = r6.c
            atjt r3 = (defpackage.atjt) r3
            int r4 = r3.a
            r5 = 1048576(0x100000, float:1.469368E-39)
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0264
            atlo r1 = r3.w
            if (r1 == 0) goto L_0x0261
            goto L_0x0265
        L_0x0261:
            atlo r1 = defpackage.atlo.c
            goto L_0x0265
        L_0x0264:
        L_0x0265:
            r2.<init>(r0, r1)
            r6.p = r2
            bzm r0 = r6.d
            r2.d = r0
            r1 = r2
            goto L_0x0273
        L_0x0270:
            r1 = r2
            goto L_0x0273
        L_0x0272:
        L_0x0273:
            return r1
        L_0x0274:
            cad r0 = r6.j()
            return r0
        L_0x0279:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzk.o():bzn");
    }

    public final void p() {
        List list = this.i;
        if (list != null) {
            list.clear();
        }
        List list2 = this.j;
        if (list2 != null) {
            list2.clear();
        }
    }

    public final boolean q() {
        return o() != null;
    }

    public final boolean r() {
        return (((atjt) this.c).a & 1048576) != 0;
    }

    public final atsu s() {
        aucd o2 = atsu.e.o();
        atjs atjs = this.a;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atsu atsu = (atsu) o2.b;
        atsu.b = atjs.z;
        int i2 = 1;
        atsu.a |= 1;
        int a = atsz.a(d());
        if (a != 0) {
            i2 = a;
        }
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atsu atsu2 = (atsu) o2.b;
        atsu2.c = i2 - 1;
        atsu2.a |= 2;
        if (q()) {
            o().d();
        } else {
            List a2 = a();
            for (int i3 = 0; i3 < a2.size(); i3++) {
                atsu s2 = ((bzk) a2.get(i3)).s();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                atsu atsu3 = (atsu) o2.b;
                s2.getClass();
                if (!atsu3.d.a()) {
                    atsu3.d = aucj.a(atsu3.d);
                }
                atsu3.d.add(s2);
            }
        }
        return (atsu) o2.i();
    }

    public final bzk t() {
        if (this.m == null) {
            this.m = byi.b(byi.a(this));
        }
        return this.m;
    }

    public final String toString() {
        return Base64.encodeToString(((atjt) this.c).k(), 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r0 = k();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean u() {
        /*
            r4 = this;
            atjs r0 = defpackage.atjs.UNKNOWN_CONTEXT_FENCE_TYPE
            atjs r0 = r4.a
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0028
            r3 = 2
            if (r0 == r3) goto L_0x0028
            r3 = 3
            if (r0 == r3) goto L_0x0028
            r3 = 6
            if (r0 == r3) goto L_0x0016
            return r1
        L_0x0016:
            bzv r0 = r4.k()
            if (r0 == 0) goto L_0x0027
            java.util.List r0 = r0.k()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0027
            return r2
        L_0x0027:
            return r1
        L_0x0028:
            java.util.List r0 = r4.a()
            java.util.Iterator r0 = r0.iterator()
        L_0x0030:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0043
            java.lang.Object r3 = r0.next()
            bzk r3 = (defpackage.bzk) r3
            boolean r3 = r3.u()
            if (r3 == 0) goto L_0x0030
            return r2
        L_0x0043:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzk.u():boolean");
    }

    public final int a(long j2) {
        return a(j2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0257, code lost:
        if (r10 == false) goto L_0x026c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(long r17, boolean r19) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r4 = r19
            if (r4 != 0) goto L_0x0009
            goto L_0x0029
        L_0x0009:
            java.util.List r0 = r1.i
            if (r0 != 0) goto L_0x000e
            goto L_0x001b
        L_0x000e:
            java.util.List r5 = r1.j
            if (r5 == 0) goto L_0x001b
            r0.clear()
            java.util.List r0 = r1.j
            r0.clear()
            goto L_0x0029
        L_0x001b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.i = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.j = r0
        L_0x0029:
            atjs r0 = defpackage.atjs.UNKNOWN_CONTEXT_FENCE_TYPE
            java.lang.String r0 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r5 = "a"
            java.lang.String r6 = "bzk"
            atjs r7 = r1.a
            int r7 = r7.ordinal()
            java.lang.String r8 = "[ContextFenceImpl] Unknown eval state=%s"
            r9 = 2
            r10 = 0
            r11 = 1
            if (r7 == r11) goto L_0x01f7
            if (r7 == r9) goto L_0x0190
            r12 = 3
            if (r7 == r12) goto L_0x00e1
            r8 = 22
            if (r7 == r8) goto L_0x009c
            bzn r7 = r16.o()
            if (r7 != 0) goto L_0x0069
            jjg r2 = defpackage.bxk.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            r3 = 727(0x2d7, float:1.019E-42)
            anie r0 = r2.a((java.lang.String) r6, (java.lang.String) r5, (int) r3, (java.lang.String) r0)
            anih r0 = (defpackage.anih) r0
            atjs r2 = r1.a
            java.lang.String r3 = "[ContextFenceImpl] Expected to find a primitive fence for type = %s"
            r0.a((java.lang.String) r3, (java.lang.Object) r2)
            int r0 = r16.b()
            return r0
        L_0x0069:
            int r0 = r7.a((long) r2)
            long r2 = r1.k
            long r5 = r7.i()
            long r2 = java.lang.Math.max(r2, r5)
            r1.k = r2
            if (r4 != 0) goto L_0x007c
            goto L_0x0099
        L_0x007c:
            if (r0 == 0) goto L_0x007f
            goto L_0x0084
        L_0x007f:
            java.util.List r2 = r1.i
            r2.add(r1)
        L_0x0084:
            int[] r2 = r7.g()
            int r3 = r2.length
        L_0x0089:
            if (r10 >= r3) goto L_0x0099
            r4 = r2[r10]
            java.util.List r5 = r1.j
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.add(r4)
            int r10 = r10 + 1
            goto L_0x0089
        L_0x0099:
            r1.e = r0
            return r0
        L_0x009c:
            java.util.List r7 = r16.a()
            int r7 = r7.size()
            if (r7 == r11) goto L_0x00bb
            jjg r7 = defpackage.bxk.a
            anie r7 = r7.c()
            anih r7 = (defpackage.anih) r7
            r8 = 706(0x2c2, float:9.9E-43)
            anie r0 = r7.a((java.lang.String) r6, (java.lang.String) r5, (int) r8, (java.lang.String) r0)
            anih r0 = (defpackage.anih) r0
            java.lang.String r5 = "[ContextFenceImpl] Found an invalid PREDICTIVE fence with incorrect number of fences."
            r0.a((java.lang.String) r5)
        L_0x00bb:
            java.util.List r0 = r16.a()
            java.lang.Object r0 = r0.get(r10)
            bzk r0 = (defpackage.bzk) r0
            int r2 = r0.a((long) r2, (boolean) r4)
            if (r4 == 0) goto L_0x00de
            java.util.List r3 = r1.j
            java.util.List r4 = r0.j
            r3.addAll(r4)
            if (r2 != 0) goto L_0x00db
            java.util.List r3 = r1.i
            java.util.List r4 = r0.i
            r3.addAll(r4)
        L_0x00db:
            r0.p()
        L_0x00de:
            r1.e = r2
            return r2
        L_0x00e1:
            java.util.List r7 = r16.a()
            int r7 = r7.size()
            if (r7 != 0) goto L_0x0105
            jjg r2 = defpackage.bxk.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            r3 = 667(0x29b, float:9.35E-43)
            anie r0 = r2.a((java.lang.String) r6, (java.lang.String) r5, (int) r3, (java.lang.String) r0)
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "[ContextFenceImpl] No valid NOT fence type defined."
            r0.a((java.lang.String) r2)
            int r0 = r16.b()
            return r0
        L_0x0105:
            java.util.List r7 = r16.a()
            int r7 = r7.size()
            if (r7 <= r11) goto L_0x0124
            jjg r7 = defpackage.bxk.a
            anie r7 = r7.c()
            anih r7 = (defpackage.anih) r7
            r12 = 673(0x2a1, float:9.43E-43)
            anie r7 = r7.a((java.lang.String) r6, (java.lang.String) r5, (int) r12, (java.lang.String) r0)
            anih r7 = (defpackage.anih) r7
            java.lang.String r12 = "[ContextFenceImpl] Found an invalid NOT fence with more than one fences."
            r7.a((java.lang.String) r12)
        L_0x0124:
            java.util.List r7 = r16.a()
            java.lang.Object r7 = r7.get(r10)
            bzk r7 = (defpackage.bzk) r7
            int r2 = r7.a((long) r2, (boolean) r4)
            if (r4 == 0) goto L_0x013b
            java.util.List r3 = r1.j
            java.util.List r12 = r7.j
            r3.addAll(r12)
        L_0x013b:
            if (r2 == 0) goto L_0x0176
            if (r2 == r11) goto L_0x0169
            if (r2 == r9) goto L_0x015e
            jjg r3 = defpackage.bxk.a     // Catch:{ all -> 0x0174 }
            anie r3 = r3.b()     // Catch:{ all -> 0x0174 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0174 }
            r9 = 692(0x2b4, float:9.7E-43)
            anie r0 = r3.a((java.lang.String) r6, (java.lang.String) r5, (int) r9, (java.lang.String) r0)     // Catch:{ all -> 0x0174 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0174 }
            r0.a((java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x0174 }
            int r0 = r16.b()     // Catch:{ all -> 0x0174 }
            if (r4 == 0) goto L_0x015d
            r7.p()
        L_0x015d:
            return r0
        L_0x015e:
            int r0 = r1.a(r10)     // Catch:{ all -> 0x0174 }
            if (r4 == 0) goto L_0x0168
            r7.p()
        L_0x0168:
            return r0
        L_0x0169:
            int r0 = r1.a(r11)     // Catch:{ all -> 0x0174 }
            if (r4 == 0) goto L_0x0173
            r7.p()
        L_0x0173:
            return r0
        L_0x0174:
            r0 = move-exception
            goto L_0x0189
        L_0x0176:
            if (r4 == 0) goto L_0x017f
            java.util.List r0 = r1.i     // Catch:{ all -> 0x0174 }
            java.util.List r2 = r7.i     // Catch:{ all -> 0x0174 }
            r0.addAll(r2)     // Catch:{ all -> 0x0174 }
        L_0x017f:
            int r0 = r16.b()     // Catch:{ all -> 0x0174 }
            if (r4 == 0) goto L_0x0188
            r7.p()
        L_0x0188:
            return r0
        L_0x0189:
            if (r4 != 0) goto L_0x018c
            goto L_0x018f
        L_0x018c:
            r7.p()
        L_0x018f:
            throw r0
        L_0x0190:
            java.util.List r7 = r16.a()
            java.util.Iterator r7 = r7.iterator()
            r12 = 0
        L_0x0199:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L_0x01ea
            java.lang.Object r13 = r7.next()
            bzk r13 = (defpackage.bzk) r13
            int r14 = r13.a((long) r2, (boolean) r4)
            if (r4 == 0) goto L_0x01b2
            java.util.List r15 = r1.j
            java.util.List r10 = r13.j
            r15.addAll(r10)
        L_0x01b2:
            if (r14 == 0) goto L_0x01d7
            if (r14 == r11) goto L_0x01e3
            if (r14 == r9) goto L_0x01cc
            jjg r10 = defpackage.bxk.a
            anie r10 = r10.b()
            anih r10 = (defpackage.anih) r10
            r15 = 654(0x28e, float:9.16E-43)
            anie r10 = r10.a((java.lang.String) r6, (java.lang.String) r5, (int) r15, (java.lang.String) r0)
            anih r10 = (defpackage.anih) r10
            r10.a((java.lang.String) r8, (int) r14)
            goto L_0x01e3
        L_0x01cc:
            if (r4 == 0) goto L_0x01d1
            r13.p()
        L_0x01d1:
            int r0 = r1.a(r11)
            return r0
        L_0x01d7:
            if (r4 == 0) goto L_0x01e1
            java.util.List r10 = r1.i
            java.util.List r12 = r13.i
            r10.addAll(r12)
            goto L_0x01e2
        L_0x01e1:
        L_0x01e2:
            r12 = 1
        L_0x01e3:
            if (r4 == 0) goto L_0x01e8
            r13.p()
        L_0x01e8:
            r10 = 0
            goto L_0x0199
        L_0x01ea:
            if (r12 != 0) goto L_0x01f2
            r0 = 0
            int r0 = r1.a(r0)
            goto L_0x01f6
        L_0x01f2:
            int r0 = r16.b()
        L_0x01f6:
            return r0
        L_0x01f7:
            java.util.List r7 = r16.a()
            java.util.Iterator r7 = r7.iterator()
            r10 = 0
        L_0x0200:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x0251
            java.lang.Object r12 = r7.next()
            bzk r12 = (defpackage.bzk) r12
            int r13 = r12.a((long) r2, (boolean) r4)
            if (r4 == 0) goto L_0x0219
            java.util.List r14 = r1.j
            java.util.List r15 = r12.j
            r14.addAll(r15)
        L_0x0219:
            if (r13 == 0) goto L_0x023f
            if (r13 == r11) goto L_0x0233
            if (r13 == r9) goto L_0x024b
            jjg r14 = defpackage.bxk.a
            anie r14 = r14.b()
            anih r14 = (defpackage.anih) r14
            r15 = 612(0x264, float:8.58E-43)
            anie r14 = r14.a((java.lang.String) r6, (java.lang.String) r5, (int) r15, (java.lang.String) r0)
            anih r14 = (defpackage.anih) r14
            r14.a((java.lang.String) r8, (int) r13)
            goto L_0x024b
        L_0x0233:
            if (r4 == 0) goto L_0x0238
            r12.p()
        L_0x0238:
            r0 = 0
            int r0 = r1.a(r0)
            return r0
        L_0x023f:
            if (r4 == 0) goto L_0x0249
            java.util.List r10 = r1.i
            java.util.List r13 = r12.i
            r10.addAll(r13)
            goto L_0x024a
        L_0x0249:
        L_0x024a:
            r10 = 1
        L_0x024b:
            if (r4 == 0) goto L_0x0200
            r12.p()
            goto L_0x0200
        L_0x0251:
            boolean r0 = r16.r()
            if (r0 != 0) goto L_0x025a
            if (r10 != 0) goto L_0x0272
            goto L_0x026c
        L_0x025a:
            if (r10 != 0) goto L_0x0272
            bza r0 = r16.h()
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x026c
            r0 = 0
            int r0 = r1.a(r0)
            return r0
        L_0x026c:
            int r0 = r1.a(r11)
            goto L_0x0276
        L_0x0272:
            int r0 = r16.b()
        L_0x0276:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzk.a(long, boolean):int");
    }

    public final atjt a(byt byt) {
        bzv k2;
        atjs atjs = atjs.UNKNOWN_CONTEXT_FENCE_TYPE;
        int ordinal = this.a.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            atjt atjt = (atjt) this.c;
            aucd aucd = (aucd) atjt.c(5);
            aucd.a((aucj) atjt);
            atjq atjq = (atjq) aucd;
            if (atjq.c) {
                atjq.c();
                atjq.c = false;
            }
            auct auct = atjt.v;
            ((atjt) atjq.b).c = aucj.s();
            aucx aucx = ((atjt) this.c).c;
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                atjt a = new bzk((atjt) aucx.get(i2)).a(byt);
                if (a == null) {
                    return null;
                }
                atjq.a(a);
            }
            return (atjt) atjq.i();
        } else if (ordinal != 6 || (k2 = k()) == null || k2.k().isEmpty()) {
            return (atjt) this.c;
        } else {
            HashSet hashSet = new HashSet(k2.k());
            HashSet hashSet2 = new HashSet(k2.j());
            List k3 = k2.k();
            int size2 = k3.size();
            int i3 = 0;
            while (i3 < size2) {
                String str = (String) k3.get(i3);
                String a2 = byt.a(str);
                if (a2 != null) {
                    hashSet.remove(str);
                    hashSet2.add(a2);
                    i3++;
                } else {
                    ((anih) ((anih) bxk.a.b()).a("bzv", "a", 146, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PlaceFenceImpl] Failed to resolve alias %s", (Object) str);
                    return null;
                }
            }
            atlj atlj = (atlj) k2.c;
            aucd aucd2 = (aucd) atlj.c(5);
            aucd2.a((aucj) atlj);
            atlg atlg = (atlg) aucd2;
            if (atlg.c) {
                atlg.c();
                atlg.c = false;
            }
            atlj atlj2 = atlj.h;
            ((atlj) atlg.b).f = aucj.s();
            if (atlg.c) {
                atlg.c();
                atlg.c = false;
            }
            ((atlj) atlg.b).d = aucj.s();
            if (!hashSet.isEmpty()) {
                atlg.a(hashSet);
            }
            if (!hashSet2.isEmpty()) {
                atlg.b(hashSet2);
            }
            k2.c = (atlj) atlg.i();
            atjt atjt2 = (atjt) this.c;
            aucd aucd3 = (aucd) atjt2.c(5);
            aucd3.a((aucj) atjt2);
            atjq atjq2 = (atjq) aucd3;
            atlj atlj3 = (atlj) k2.c;
            if (atjq2.c) {
                atjq2.c();
                atjq2.c = false;
            }
            atjt atjt3 = (atjt) atjq2.b;
            auct auct2 = atjt.v;
            atlj3.getClass();
            atjt3.f = atlj3;
            atjt3.a |= 8;
            return (atjt) atjq2.i();
        }
    }

    public final List a() {
        if (this.H == null) {
            this.H = new ArrayList(((atjt) this.c).c.size());
            aucx aucx = ((atjt) this.c).c;
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                bzk bzk = new bzk((atjt) aucx.get(i2));
                bzk.d = this.d;
                this.H.add(bzk);
            }
        }
        Collections.sort(this.H, byi.a);
        return this.H;
    }

    public final List a(atjs atjs) {
        ArrayList arrayList = new ArrayList();
        a(atjs, (List) arrayList);
        return arrayList;
    }

    public final void a(atjl atjl) {
        atjs atjs = atjs.UNKNOWN_CONTEXT_FENCE_TYPE;
        int ordinal = this.a.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 22) {
            for (bzk a : a()) {
                a.a(atjl);
            }
            return;
        }
        bzn o2 = o();
        if (o2 == null) {
            ((anih) ((anih) bxk.a.c()).a("bzk", "a", 559, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextFenceImpl] Expected to find a primitive fence for type = %s", (Object) this.a);
        } else {
            o2.a(atjl);
        }
    }

    public final void a(Set set) {
        atjs atjs = atjs.UNKNOWN_CONTEXT_FENCE_TYPE;
        int ordinal = this.a.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 22) {
            for (bzk a : a()) {
                a.a(set);
            }
            return;
        }
        bzn o2 = o();
        if (o2 == null) {
            ((anih) ((anih) bxk.a.c()).a("bzk", "a", 484, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextFenceImpl] Expected a primitive fence for type=%s", (Object) this.a);
            return;
        }
        for (int valueOf : o2.g()) {
            set.add(Integer.valueOf(valueOf));
        }
    }

    public final boolean a(Collection collection, Collection collection2) {
        boolean z2;
        atjs atjs = atjs.UNKNOWN_CONTEXT_FENCE_TYPE;
        int ordinal = this.a.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 22) {
            boolean z3 = false;
            for (bzk a : a()) {
                z3 |= a.a(collection, collection2);
            }
            z2 = z3;
        } else {
            bzn o2 = o();
            if (o2 == null) {
                ((anih) ((anih) bxk.a.c()).a("bzk", "a", 765, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextFenceImpl] Expected to find a primitive fence for type = %s", (Object) this.a);
            }
            z2 = o2.a(collection, collection2);
        }
        return z2;
    }
}
