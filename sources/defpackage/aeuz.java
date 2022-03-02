package defpackage;

/* renamed from: aeuz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeuz {
    public static aeta a(aukf aukf) {
        boolean z;
        auln auln;
        if (aukf.a == 1) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        if (aukf.a == 1) {
            auln = (auln) aukf.b;
        } else {
            auln = auln.b;
        }
        return a(auln);
    }

    public static aeti b(aukf aukf) {
        boolean z;
        aumy aumy;
        if (aukf.a == 2) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        if (aukf.a == 2) {
            aumy = (aumy) aukf.b;
        } else {
            aumy = aumy.e;
        }
        return a(aumy);
    }

    public static aeta a(auln auln) {
        String str;
        aesz b = aeta.b();
        aucx aucx = auln.a;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            aumi aumi = (aumi) aucx.get(i);
            byte[] k = aumi.b.k();
            int a = aumh.a(aumi.c);
            int i2 = 1;
            if (a == 0) {
                a = 1;
            }
            int i3 = a - 1;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (a != 1) {
                        str = a != 2 ? "PREFIX" : "EXACT";
                    } else {
                        str = "UNKNOWN";
                    }
                    throw new IllegalArgumentException(str.length() == 0 ? new String("Unknown secondary id matching type ") : "Unknown secondary id matching type ".concat(str));
                }
                i2 = 2;
            }
            b.a(k, i2);
        }
        return b.a();
    }

    public static auln b(aeta aeta) {
        int i;
        aucd o = auln.b.o();
        anhk i2 = aeta.a().listIterator();
        while (i2.hasNext()) {
            aetg aetg = (aetg) i2.next();
            aucd o2 = aumi.d.o();
            auay a = auay.a(aetg.a());
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aumi aumi = (aumi) o2.b;
            a.getClass();
            aumi.a |= 1;
            aumi.b = a;
            int b = aetg.b();
            if (b == 1) {
                i = 2;
            } else if (b == 2) {
                i = 3;
            } else {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Unknown secondary id matching type ");
                sb.append(b);
                throw new IllegalArgumentException(sb.toString());
            }
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aumi aumi2 = (aumi) o2.b;
            aumi2.c = i - 1;
            aumi2.a |= 2;
            if (o.c) {
                o.c();
                o.c = false;
            }
            auln auln = (auln) o.b;
            aumi aumi3 = (aumi) o2.i();
            aumi3.getClass();
            if (!auln.a.a()) {
                auln.a = aucj.a(auln.a);
            }
            auln.a.add(aumi3);
        }
        return (auln) o.i();
    }

    public static aeti a(aumy aumy) {
        Long l;
        Long l2 = null;
        if ((aumy.a & 4) != 0) {
            l = Long.valueOf(aumy.d);
        } else {
            l = null;
        }
        if ((aumy.a & 2) != 0) {
            l2 = Long.valueOf(aumy.c);
        }
        return aeti.a(aumy.b, l, l2);
    }

    public static auay a(aukq aukq) {
        return auay.a(anln.e().a(aukq.d.k()).b());
    }

    public static aukf a(aeta aeta) {
        aucd o = aukf.c.o();
        auln b = b(aeta);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aukf aukf = (aukf) o.b;
        b.getClass();
        aukf.b = b;
        aukf.a = 1;
        return (aukf) o.i();
    }

    public static aukh a(int i, int i2, auku auku) {
        aucd o = aukh.c.o();
        aucd o2 = aukv.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aukv aukv = (aukv) o2.b;
        int i3 = aukv.a | 1;
        aukv.a = i3;
        aukv.b = i;
        int i4 = i3 | 2;
        aukv.a = i4;
        aukv.c = i2;
        aukv.d = auku.e;
        aukv.a = i4 | 4;
        aukv aukv2 = (aukv) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aukh aukh = (aukh) o.b;
        aukv2.getClass();
        aukh.b = aukv2;
        aukh.a = 2;
        return (aukh) o.i();
    }

    public static aulx a(byte[] bArr) {
        if (bArr != null) {
            aubs a = aubs.a();
            a.a(aulx.d);
            aujv aujv = (aujv) aucj.a((aucj) aujv.a, bArr, a);
            auci auci = aulx.d;
            aujv.a(auci);
            if (aujv.m.a(auci.d)) {
                auci auci2 = aulx.d;
                aujv.a(auci2);
                Object b = aujv.m.b(auci2.d);
                if (b == null) {
                    b = auci2.b;
                } else {
                    auci2.a(b);
                }
                return (aulx) b;
            }
            throw new auda("Missing MessageSet extension");
        }
        throw new auda("Missing RecordingSetting data");
    }

    public static aumy a(aeti aeti) {
        aucd o = aumy.e.o();
        int a = aeti.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aumy aumy = (aumy) o.b;
        aumy.a |= 1;
        aumy.b = a;
        Long c = aeti.c();
        if (c != null) {
            long longValue = c.longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aumy aumy2 = (aumy) o.b;
            aumy2.a |= 2;
            aumy2.c = longValue;
        }
        Long b = aeti.b();
        if (b != null) {
            long longValue2 = b.longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aumy aumy3 = (aumy) o.b;
            aumy3.a |= 4;
            aumy3.d = longValue2;
        }
        return (aumy) o.i();
    }

    public static String a(auay auay) {
        return anml.g.a(auay.k());
    }
}
