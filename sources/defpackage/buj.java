package defpackage;

import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: buj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class buj extends bwp {
    public buj() {
        super("PushAnalyticsDataToServer");
    }

    /* access modifiers changed from: protected */
    public final void a() {
        char c;
        jud jud;
        long j;
        aucd aucd;
        aucd aucd2;
        Iterator it;
        aucd aucd3;
        ator ator;
        int i;
        atoq atoq;
        bui bui;
        long j2;
        boolean z;
        buc F = cbi.F();
        int i2 = 1;
        boolean z2 = false;
        if (F.a) {
            aucd b = btx.b();
            long a = cbi.i().a();
            aucd o = atol.h.o();
            if (F.b.size() > 0) {
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                while (i3 < F.b.size()) {
                    bui bui2 = (bui) F.b.valueAt(i3);
                    int size = bui2.b.size();
                    aucd o2 = ator.d.o();
                    atjv atjv = bui2.a;
                    if (o2.c) {
                        o2.c();
                        o2.c = z2;
                    }
                    ator ator2 = (ator) o2.b;
                    ator2.b = atjv.bA;
                    ator2.a |= i2;
                    if (size == 0) {
                        ator = (ator) o2.i();
                    } else {
                        int i4 = 0;
                        while (i4 < size) {
                            buh buh = (buh) bui2.b.get(i4);
                            if (!buh.b) {
                                atoq = buh.b();
                                buh.b = z2;
                                aucd aucd4 = buh.e;
                                if (aucd4.c) {
                                    aucd4.c();
                                    aucd4.c = z2;
                                }
                                atos atos = (atos) aucd4.b;
                                atos atos2 = atos.d;
                                int i5 = atos.a | 1;
                                atos.a = i5;
                                atos.b = 0;
                                atos.a = i5 | 2;
                                atos.c = 0;
                                buh.c = 0;
                                buh.d = 0;
                                buh.a.a();
                                i = i3;
                                bui = bui2;
                                j2 = a;
                            } else {
                                long j3 = a;
                                aucd aucd5 = buh.e;
                                if (!aucd5.c) {
                                    z = false;
                                } else {
                                    aucd5.c();
                                    z = false;
                                    aucd5.c = false;
                                }
                                atos atos3 = (atos) aucd5.b;
                                atos atos4 = atos.d;
                                atos3.a |= 2;
                                j2 = j3;
                                atos3.c = j2;
                                buh.b = z;
                                btz btz = new btz();
                                Iterator it2 = buh.a.a.entrySet().iterator();
                                while (it2.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it2.next();
                                    bua bua = (bua) entry.getKey();
                                    Iterator it3 = ((HashMap) entry.getValue()).values().iterator();
                                    while (it3.hasNext()) {
                                        Iterator it4 = it2;
                                        bty bty = (bty) it3.next();
                                        Iterator it5 = it3;
                                        if (bty.b) {
                                            btz.a(bua, new bty(bty.a, j2));
                                            bty.a(j2);
                                            it3 = it5;
                                            it2 = it4;
                                            i3 = i3;
                                        } else {
                                            int i6 = i3;
                                            it3 = it5;
                                            it2 = it4;
                                        }
                                    }
                                    Iterator it6 = it2;
                                    int i7 = i3;
                                }
                                i = i3;
                                atoq = buh.b();
                                aucd aucd6 = buh.e;
                                if (aucd6.c) {
                                    aucd6.c();
                                    aucd6.c = false;
                                }
                                atos atos5 = (atos) aucd6.b;
                                atos5.a |= 1;
                                atos5.b = j2;
                                aucd aucd7 = buh.e;
                                if (aucd7.c) {
                                    aucd7.c();
                                    aucd7.c = false;
                                }
                                atos atos6 = (atos) aucd7.b;
                                atos6.a |= 2;
                                bui = bui2;
                                atos6.c = Long.MAX_VALUE;
                                buh.b = true;
                                buh.c = 0;
                                buh.d = 0;
                                buh.a.a();
                                buh.a = btz;
                            }
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            ator ator3 = (ator) o2.b;
                            atoq.getClass();
                            if (!ator3.c.a()) {
                                ator3.c = aucj.a(ator3.c);
                            }
                            ator3.c.add(atoq);
                            i4++;
                            bui2 = bui;
                            i3 = i;
                            i2 = 1;
                            a = j2;
                            z2 = false;
                        }
                        int i8 = size - 1;
                        if (!((buh) bui2.b.get(i8)).b) {
                            bui2.b.clear();
                        } else {
                            bui2.b.clear();
                            bui2.b.add((buh) bui2.b.get(i8));
                        }
                        ator = (ator) o2.i();
                    }
                    if (o.c) {
                        o.c();
                        o.c = z2;
                    }
                    atol atol = (atol) o.b;
                    ator.getClass();
                    if (!atol.b.a()) {
                        atol.b = aucj.a(atol.b);
                    }
                    atol.b.add(ator);
                    if (!bui2.c) {
                        arrayList.add(Integer.valueOf(F.b.keyAt(i3)));
                    }
                    i3++;
                }
                j = a;
                int size2 = arrayList.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    F.b.remove(((Integer) arrayList.get(i9)).intValue());
                }
            } else {
                j = a;
            }
            if (!F.d.isEmpty()) {
                Iterator it7 = F.d.values().iterator();
                while (it7.hasNext()) {
                    bub bub = (bub) it7.next();
                    aucd o3 = atok.e.o();
                    if (!TextUtils.isEmpty(bub.a)) {
                        String str = bub.a;
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        atok atok = (atok) o3.b;
                        str.getClass();
                        atok.a |= 1;
                        atok.b = str;
                    }
                    if (!TextUtils.isEmpty(bub.b)) {
                        String str2 = bub.b;
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        atok atok2 = (atok) o3.b;
                        str2.getClass();
                        atok2.a |= 2;
                        atok2.c = str2;
                    }
                    if (bub.c.size() <= 0) {
                        aucd2 = b;
                        it = it7;
                    } else {
                        int i10 = 0;
                        while (i10 < bub.c.size()) {
                            bue bue = (bue) bub.c.valueAt(i10);
                            aucd o4 = atoo.h.o();
                            int i11 = bue.a;
                            if (o4.c) {
                                o4.c();
                                o4.c = false;
                            }
                            atoo atoo = (atoo) o4.b;
                            int i12 = atoo.a | 1;
                            atoo.a = i12;
                            atoo.b = i11;
                            int i13 = bue.b;
                            int i14 = i12 | 8;
                            atoo.a = i14;
                            atoo.c = i13;
                            int i15 = bue.c;
                            int i16 = i14 | 16;
                            atoo.a = i16;
                            atoo.d = i15;
                            int i17 = bue.d;
                            int i18 = i16 | 32;
                            atoo.a = i18;
                            atoo.e = i17;
                            int i19 = bue.e;
                            int i20 = i18 | 64;
                            atoo.a = i20;
                            atoo.f = i19;
                            aucd aucd8 = b;
                            Iterator it8 = it7;
                            long j4 = bue.f;
                            if (j4 != -1) {
                                aucd3 = aucd8;
                                atoo.a = i20 | 128;
                                atoo.g = (int) (j4 / ((long) (i13 + i15)));
                            } else {
                                aucd3 = aucd8;
                            }
                            bue.a();
                            atoo atoo2 = (atoo) o4.i();
                            if (o3.c) {
                                o3.c();
                                o3.c = false;
                            }
                            atok atok3 = (atok) o3.b;
                            atoo2.getClass();
                            if (!atok3.d.a()) {
                                atok3.d = aucj.a(atok3.d);
                            }
                            atok3.d.add(atoo2);
                            i10++;
                            it7 = it8;
                            b = aucd3;
                        }
                        aucd2 = b;
                        it = it7;
                    }
                    bub.c.clear();
                    atok atok4 = (atok) o3.i();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    atol atol2 = (atol) o.b;
                    atok4.getClass();
                    if (!atol2.e.a()) {
                        atol2.e = aucj.a(atol2.e);
                    }
                    atol2.e.add(atok4);
                    it7 = it;
                    b = aucd2;
                }
                aucd = b;
                F.d.clear();
            } else {
                aucd = b;
            }
            bug bug = F.e;
            aucd o5 = atop.m.o();
            int i21 = bug.a;
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            atop atop = (atop) o5.b;
            int i22 = atop.a | 1;
            atop.a = i22;
            atop.b = i21;
            int i23 = bug.b;
            int i24 = i22 | 2;
            atop.a = i24;
            atop.c = i23;
            int i25 = bug.c;
            int i26 = i24 | 4;
            atop.a = i26;
            atop.d = i25;
            int i27 = bug.d;
            atop.a = i26 | 8;
            atop.e = i27;
            if (bug.g.size() > 0) {
                for (int i28 = 0; i28 < bug.g.size(); i28++) {
                    buf buf = (buf) bug.g.valueAt(i28);
                    aucd o6 = aton.n.o();
                    atjv atjv2 = buf.a;
                    if (o6.c) {
                        o6.c();
                        o6.c = false;
                    }
                    aton aton = (aton) o6.b;
                    aton.b = atjv2.bA;
                    int i29 = aton.a | 1;
                    aton.a = i29;
                    int i30 = buf.b;
                    int i31 = i29 | 4;
                    aton.a = i31;
                    aton.c = i30;
                    int i32 = buf.c;
                    int i33 = i31 | 8;
                    aton.a = i33;
                    aton.d = i32;
                    int i34 = buf.d;
                    int i35 = i33 | 512;
                    aton.a = i35;
                    aton.i = i34;
                    int i36 = buf.e;
                    int i37 = i35 | 1024;
                    aton.a = i37;
                    aton.j = i36;
                    int i38 = buf.f;
                    int i39 = i37 | 16;
                    aton.a = i39;
                    aton.e = i38;
                    int i40 = buf.g;
                    int i41 = i39 | 32;
                    aton.a = i41;
                    aton.f = i40;
                    int i42 = buf.h;
                    int i43 = i41 | 128;
                    aton.a = i43;
                    aton.g = i42;
                    int i44 = buf.i;
                    int i45 = i43 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    aton.a = i45;
                    aton.h = i44;
                    int i46 = buf.j;
                    int i47 = i45 | 2048;
                    aton.a = i47;
                    aton.k = i46;
                    int i48 = buf.k;
                    int i49 = i47 | FragmentTransaction.TRANSIT_ENTER_MASK;
                    aton.a = i49;
                    aton.l = i48;
                    int i50 = buf.l;
                    aton.a = i49 | FragmentTransaction.TRANSIT_EXIT_MASK;
                    aton.m = i50;
                    aton aton2 = (aton) o6.i();
                    buf.a();
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    atop atop2 = (atop) o5.b;
                    aton2.getClass();
                    if (!atop2.l.a()) {
                        atop2.l = aucj.a(atop2.l);
                    }
                    atop2.l.add(aton2);
                }
            }
            long b2 = (long) bug.e.b();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            atop atop3 = (atop) o5.b;
            atop3.a |= 16;
            atop3.f = b2;
            long c2 = (long) bug.e.c();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            atop atop4 = (atop) o5.b;
            int i51 = atop4.a | 32;
            atop4.a = i51;
            atop4.g = c2;
            int i52 = bug.e.c;
            atop4.a = i51 | 64;
            atop4.h = (long) i52;
            long b3 = (long) bug.f.b();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            atop atop5 = (atop) o5.b;
            atop5.a |= 128;
            atop5.i = b3;
            long c3 = (long) bug.f.c();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            atop atop6 = (atop) o5.b;
            int i53 = atop6.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            atop6.a = i53;
            atop6.j = c3;
            int i54 = bug.f.c;
            atop6.a = i53 | 512;
            atop6.k = (long) i54;
            bug.a();
            atop atop7 = (atop) o5.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            atol atol3 = (atol) o.b;
            atop7.getClass();
            atol3.d = atop7;
            atol3.a |= 4;
            if (!F.f.isEmpty()) {
                List list = F.f;
                int size3 = list.size();
                for (int i55 = 0; i55 < size3; i55++) {
                    jyk jyk = (jyk) list.get(i55);
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    atol atol4 = (atol) o.b;
                    jyk.getClass();
                    if (!atol4.f.a()) {
                        atol4.f = aucj.a(atol4.f);
                    }
                    atol4.f.add(jyk);
                }
                F.f.clear();
            }
            if (F.g.size() > 0) {
                for (int i56 = 0; i56 < F.g.size(); i56++) {
                    bud bud = (bud) F.g.valueAt(i56);
                    aucd o7 = atom.g.o();
                    int i57 = bud.a;
                    if (o7.c) {
                        o7.c();
                        o7.c = false;
                    }
                    atom atom = (atom) o7.b;
                    int i58 = atom.a | 1;
                    atom.a = i58;
                    atom.b = i57;
                    int i59 = bud.b;
                    int i60 = i58 | 2;
                    atom.a = i60;
                    atom.c = i59;
                    int i61 = bud.c;
                    int i62 = i60 | 4;
                    atom.a = i62;
                    atom.d = i61;
                    int i63 = bud.d;
                    int i64 = i62 | 8;
                    atom.a = i64;
                    atom.e = i63;
                    int i65 = bud.e;
                    atom.a = i64 | 16;
                    atom.f = i65;
                    atom atom2 = (atom) o7.i();
                    bud.b = 0;
                    bud.c = 0;
                    bud.d = 0;
                    bud.e = 0;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    atol atol5 = (atol) o.b;
                    atom2.getClass();
                    if (!atol5.g.a()) {
                        atol5.g = aucj.a(atol5.g);
                    }
                    atol5.g.add(atom2);
                }
                F.g.clear();
            }
            aucd o8 = atos.d.o();
            long j5 = F.c;
            if (o8.c) {
                o8.c();
                o8.c = false;
            }
            atos atos7 = (atos) o8.b;
            int i66 = atos7.a | 1;
            atos7.a = i66;
            atos7.b = j5;
            atos7.a = i66 | 2;
            atos7.c = j;
            atos atos8 = (atos) o8.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            atol atol6 = (atol) o.b;
            atos8.getClass();
            atol6.c = atos8;
            atol6.a |= 1;
            F.c = j;
            atol atol7 = (atol) o.i();
            aucd aucd9 = aucd;
            if (aucd9.c) {
                aucd9.c();
                aucd9.c = false;
            }
            jud jud2 = (jud) aucd9.b;
            jud jud3 = jud.i;
            atol7.getClass();
            jud2.b = atol7;
            jud2.a |= 1;
            jud = (jud) aucd9.i();
            c = 0;
            F.a = false;
        } else {
            c = 0;
            jud = null;
        }
        if (jud != null) {
            new Object[1][c] = jud;
            cbi.G().a(jud, 2);
        }
        a(awuz.a.a().h(), bvq.a("PushAnalyticsDataToServer"));
    }
}
