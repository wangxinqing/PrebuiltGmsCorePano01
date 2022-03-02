package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: akkj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akkj implements akkg {
    public final aklf a;
    public final aklc b;
    public akkf c;
    public final akuo d;
    private final akni e;
    private Collection f;
    private final akki g = new akki(this);

    public akkj(aklf aklf, akni akni, akuo akuo, aklc aklc) {
        this.a = aklf;
        this.e = akni;
        this.b = aklc;
        this.d = akuo;
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList();
        ob obVar = new ob();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            obVar.add(Long.valueOf(((akkk) list.get(i)).h()));
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            akkk akkk = (akkk) list.get(i2);
            asth i3 = akkk.i();
            if (i3 != null) {
                long j = i3.a;
                if (j != 0) {
                    Long valueOf = Long.valueOf(j);
                    if (!obVar.contains(valueOf)) {
                        obVar.add(valueOf);
                        aucd o = astz.o.o();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        astz astz = (astz) o.b;
                        i3.getClass();
                        astz.b = i3;
                        astz.a |= 1;
                        int b2 = akkk.b();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        astz astz2 = (astz) o.b;
                        astz2.a |= 4;
                        astz2.d = b2;
                        int c2 = akkk.c();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        astz astz3 = (astz) o.b;
                        astz3.a |= 8;
                        astz3.e = c2;
                        arrayList.add(akkk.a((astz) o.i()));
                    }
                }
            }
        }
        return arrayList;
    }

    public final void a() {
        this.e.a();
        this.c = null;
    }

    public final void a(long j, String str, aklr aklr) {
        aucd aucd;
        aucd aucd2;
        try {
            astw astw = (astw) aucj.a((aucj) astw.c, anml.f.b((CharSequence) str));
            aucd o = astz.o.o();
            asth asth = astw.b;
            if (asth == null) {
                asth = asth.b;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            astz astz = (astz) o.b;
            asth.getClass();
            astz.b = asth;
            int i = astz.a | 1;
            astz.a = i;
            int i2 = astw.a;
            if ((i2 & 1) == 0 || (i2 & 2) != 0) {
                astw.getClass();
                astz.n = astw;
                i |= 262144;
                astz.a = i;
            }
            if (aklr != null) {
                int i3 = aklr.a;
                int i4 = i | 4;
                astz.a = i4;
                astz.d = i3;
                int i5 = aklr.b;
                astz.a = i4 | 8;
                astz.e = i5;
            }
            astz astz2 = (astz) o.i();
            this.a.a(new astz[]{astz2});
            aklc aklc = this.b;
            astl astl = astl.CHECKIN_EDIT;
            asth asth2 = astz2.b;
            if (asth2 == null) {
                asth2 = asth.b;
            }
            long j2 = asth2.a;
            if (j2 != 0) {
                aklc.a(astz2);
                astv astv = (astv) aklc.b.get(Long.valueOf(j2));
                if (astv == null) {
                    aucd = astv.f.o();
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    astv astv2 = (astv) aucd.b;
                    astv2.a |= 4;
                    astv2.b = j2;
                } else {
                    aucd aucd3 = (aucd) astv.c(5);
                    aucd3.a((aucj) astv);
                    aucd = aucd3;
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= ((astv) aucd.b).d.size()) {
                        aucd2 = null;
                        i6 = -1;
                        break;
                    }
                    astm astm = (astm) ((astv) aucd.b).d.get(i6);
                    astl a2 = astl.a(astm.b);
                    if (a2 == null) {
                        a2 = astl.INVALID;
                    }
                    if (a2 == astl) {
                        aucd2 = (aucd) astm.c(5);
                        aucd2.a((aucj) astm);
                        break;
                    }
                    i6++;
                }
                if (aucd2 == null) {
                    aucd2 = astm.e.o();
                    if (aucd2.c) {
                        aucd2.c();
                        aucd2.c = false;
                    }
                    astm astm2 = (astm) aucd2.b;
                    astm2.b = astl.ao;
                    astm2.a |= 1;
                }
                int i7 = ((astm) aucd2.b).c + 1;
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                astm astm3 = (astm) aucd2.b;
                astm astm4 = astm.e;
                astm3.a |= 2;
                astm3.c = i7;
                if (!astm3.d.a()) {
                    astm3.d = aucj.a(astm3.d);
                }
                astm3.d.a(j);
                if (i6 != -1) {
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    astv astv3 = (astv) aucd.b;
                    astm astm5 = (astm) aucd2.i();
                    astm5.getClass();
                    astv3.a();
                    astv3.d.set(i6, astm5);
                } else {
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    astv astv4 = (astv) aucd.b;
                    astm astm6 = (astm) aucd2.i();
                    astm6.getClass();
                    astv4.a();
                    astv4.d.add(astm6);
                }
                aklc.b.put(Long.valueOf(j2), (astv) aucd.i());
                return;
            }
            akof a3 = aklz.a();
            String valueOf = String.valueOf(astz2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
            sb.append("PlaceInfoMobile passed to addInteraction missing fprint: ");
            sb.append(valueOf);
            a3.b(sb.toString());
        } catch (auda e2) {
            throw new IllegalArgumentException("Could not parse place id into a proto", e2);
        }
    }

    public final void a(akkf akkf) {
        this.c = akkf;
        this.e.a(this.g);
    }

    public final void a(akln akln, List list) {
        HashSet<Long> hashSet;
        if (this.c != null) {
            List a2 = aklw.a(akln.a, (int) azcf.a.a().m());
            this.f = a2;
            if (a2 == null) {
                hashSet = new HashSet<>();
            } else {
                aklc aklc = this.b;
                HashSet hashSet2 = new HashSet();
                int size = a2.size();
                for (int i = 0; i < size; i++) {
                    List list2 = (List) aklc.a.get(Long.valueOf(((Long) a2.get(i)).longValue()));
                    if (list2 != null) {
                        hashSet2.addAll(list2);
                    }
                }
                hashSet = hashSet2;
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                hashSet.add(Long.valueOf(((akkk) list.get(i2)).h()));
            }
            aklc aklc2 = this.b;
            nz nzVar = new nz();
            for (Long longValue : hashSet) {
                long longValue2 = longValue.longValue();
                ou ouVar = aklc2.b;
                Long valueOf = Long.valueOf(longValue2);
                astv astv = (astv) ouVar.get(valueOf);
                if (astv != null) {
                    nzVar.put(valueOf, astv);
                }
            }
            ArrayList arrayList = new ArrayList(list.size() + nzVar.h);
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                akkk akkk = (akkk) list.get(i3);
                Long valueOf2 = Long.valueOf(akkk.h());
                astv astv2 = (astv) nzVar.get(valueOf2);
                if (astv2 == null) {
                    arrayList.add(akkk);
                } else {
                    arrayList.add(new akkk(akkk.a, astv2, akkk.c));
                    nzVar.remove(valueOf2);
                }
            }
            this.a.a((Collection) nzVar.keySet(), (akle) new akkh(this, nzVar, arrayList, akln));
            return;
        }
        aklz.a().c("Candidate callback not set - unable to deliver updates");
    }
}
