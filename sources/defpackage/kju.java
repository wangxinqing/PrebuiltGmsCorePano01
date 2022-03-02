package defpackage;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.UserMetadata;
import com.google.android.gms.drive.internal.model.Permission;
import com.google.android.gms.drive.internal.model.Property;
import com.google.android.gms.drive.internal.model.User;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: kju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kju {
    private static final ith a = new ith("DocEntryConverter", "");
    private static final Locale b = Locale.US;
    private static final lsp c = b("yyyy-MM-dd'T'HH:mm:ss.SSS");
    private static final lsp d = b("yyyy-MM-dd'T'HH:mm:ss.SSSz");
    private static final ThreadLocal e = new kjt();

    public static DriveId a(krk krk, lnj lnj, boolean z) {
        iva.a(krk.b(), (Object) "The provided account should be valid.");
        iva.a(krk.b());
        String g = lnj.g();
        kmp a2 = krk.a(g);
        if (a2 == null) {
            a.c("DocEntryConverter", "Prefetch should already have created all the entries!");
            String q = lnj.q();
            lgp lgp = krk.d;
            a2 = lgp.a.a(lgp.b, q, g);
        }
        if (z || a(lnj, a2)) {
            a2.M();
            iva.b(lnj.g().equals(a2.i()));
            a(krk.a, lnj, a2, (String) null);
            iva.b(lnj.d(), "Cannot copy internal fields from response of a non-Drive Android API request");
            iva.b(lnj.d(), "Cannot copy internal fields from response of a non-Drive Android API request");
            if (lnj.I()) {
                Set f = lnj.f();
                if (f.size() > 0) {
                    a2.e((String) f.iterator().next());
                }
            }
            if (lnj.V() != null) {
                a2.i(lnj.V().booleanValue());
            }
            boolean z2 = false;
            if (lnj.L() != null) {
                if (lnj.M() != null) {
                    a2.d(lnj.L(), lnj.M());
                    a2.d(lnj.N());
                } else {
                    a.b("DocEntryConverter", "Creator sdkAppId of singleton (resourceId: %s) not provided.", lnj.g());
                }
            }
            a2.a.K = lnj.S();
            if (lnj.m() != null) {
                z2 = true;
            }
            a2.g(z2);
            a2.an();
            a(krk, lnj, a2);
            a2.d.a.a(a2, (Set) new HashSet(lnj.f()));
            iva.a(krk.b());
            lgp lgp2 = krk.d;
            HashSet<Long> hashSet = new HashSet<>();
            for (DriveId driveId : lgp2.a.a(lgp2.c, a2)) {
                hashSet.add(Long.valueOf(driveId.b));
            }
            for (String str : lnj.e()) {
                lgp lgp3 = krk.d;
                kmh a3 = lgp3.a.a(lgp3.b, str);
                if (a3 == null) {
                    lgp lgp4 = krk.d;
                    a3 = lgp4.a.b(lgp4.b, str);
                }
                krk.a.a((kqi) a3);
                if (!hashSet.remove(Long.valueOf(a3.m))) {
                    a2.d.a.a(a2, a3.m);
                }
            }
            for (Long longValue : hashSet) {
                long longValue2 = longValue.longValue();
                lgs lgs = a2.d;
                lgs.a.a(knc.a(lgs.b.a.longValue()), longValue2);
            }
            a2.n(true);
            return a2.g();
        } else if (lnj.S() <= a2.al() || !a(krk, lnj, a2)) {
            return null;
        } else {
            a2.n(true);
            return a2.g();
        }
    }

    private static lsp b(String str) {
        lsp lsp = new lsp(str, b);
        lsp.a(TimeZone.getTimeZone("UTC"));
        return lsp;
    }

    private static Date c(String str) {
        try {
            return a(str);
        } catch (ParseException e2) {
            a.c("DocEntryConverter", String.format("Failed to parse date: %s", new Object[]{str}), e2);
            return null;
        }
    }

    private static UserMetadata a(User user) {
        String str;
        if (user == null || (str = user.e) == null) {
            return null;
        }
        User.Picture picture = user.f;
        return new UserMetadata(str, user.b, picture != null ? picture.b : null, user.d, user.c);
    }

    private static String a(String str, int i) {
        boolean z;
        if (str == null) {
            return null;
        }
        if (i > 1) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "Length limit must be greater than 1");
        int length = str.length();
        if (length <= i) {
            return str;
        }
        int i2 = i / 2;
        String substring = str.substring(0, i2);
        String substring2 = str.substring((length - i2) + 1);
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 1 + String.valueOf(substring2).length());
        sb.append(substring);
        sb.append("…");
        sb.append(substring2);
        return sb.toString();
    }

    public static String a(Date date) {
        return String.valueOf(c.a(date)).concat("Z");
    }

    public static Date a(String str) {
        if (str == null) {
            return null;
        }
        try {
            int indexOf = str.indexOf(45);
            if (indexOf == 4) {
                int parseInt = Integer.parseInt(str.substring(0, 4));
                int parseInt2 = Integer.parseInt(str.substring(5, 7));
                int parseInt3 = Integer.parseInt(str.substring(8, 10));
                int parseInt4 = Integer.parseInt(str.substring(11, 13));
                int parseInt5 = Integer.parseInt(str.substring(14, 16));
                int parseInt6 = Integer.parseInt(str.substring(17, 19));
                int parseInt7 = Integer.parseInt(str.substring(20, 23));
                ((Calendar) e.get()).set(parseInt, parseInt2 - 1, parseInt3, parseInt4, parseInt5, parseInt6);
                return new Date(((Calendar) e.get()).getTimeInMillis() + ((long) parseInt7));
            }
            throw new ParseException("Could not parse the year correctly.", indexOf);
        } catch (NumberFormatException | ParseException e2) {
            a.c("DocEntryConverter", String.format("Error parsing date using fast parser: %s", new Object[]{str}), e2);
            lsp lsp = (!str.endsWith("z") && !str.endsWith("Z")) ? d : c;
            synchronized (lsp.b) {
                return lsp.a.parse(str);
            }
        }
    }

    private static void a(kke kke, lnj lnj, kmp kmp, String str) {
        boolean z;
        boolean z2;
        String str2;
        knl ah = kmp.ah();
        iva.b((!kmp.ag()) ^ (ah != null));
        if (lnj.d()) {
            iva.b(lnj.d(), "Cannot copy internal fields from response of a non-Drive Android API request");
            List U = lnj.U();
            boolean Y = lnj.Y();
            if (!U.isEmpty()) {
                boolean contains = U.contains("plusMediaFolderRoot");
                kmp.a.Y = contains;
                Y |= U.contains("plusMediaFolder") ? true : contains;
            }
            kmp.a.X = Y;
            kmp.f(c(lnj.Z()));
            kmp.f(lnj.aa());
            ob obVar = new ob();
            for (String str3 : lnj.W()) {
                DriveSpace a2 = DriveSpace.a(str3);
                if (a2 != null) {
                    obVar.add(a2);
                } else if (!"GOOGLE_PHOTOS".equals(str3)) {
                    a.a("Discarding unrecognized space '%s' from response", str3);
                }
            }
            if (ah != null && ah.j().a()) {
                ah.j().a((Object) Boolean.valueOf(obVar.contains(DriveSpace.a)));
            } else {
                kmp.k(obVar.contains(DriveSpace.a));
            }
            kmp.l(obVar.contains(DriveSpace.c));
        }
        kmp.a.v = lnj.k();
        kmp.a.A = lnj.E();
        kmp.a(a(lnj.O()));
        kmp.b(a(lnj.P()));
        kmp.a.B = lnj.F();
        kmp.a.m = lnj.u();
        kmp.e(lnj.B());
        kmp.i(lnj.C());
        kmp.a.U = lnj.w();
        kmp.a.o = lnj.x();
        kmp.a.p = lnj.y();
        if (lnj.G() != null) {
            z = true;
        } else {
            z = false;
        }
        kmp.a.V = z;
        kmp.a.r = lnj.K();
        if (kmp.p() == null) {
            kmp.a(lnj.z());
        } else {
            kmp.c(Long.valueOf(lnj.z()));
        }
        if (lnj.d()) {
            z2 = true;
        } else {
            z2 = str != null;
        }
        iva.b(z2);
        List<Property> H = lnj.H();
        Map a3 = krl.a(kmp.a(str, true));
        for (Property property : H) {
            if (property.c == null || property.d == null) {
                a.b("DocEntryConverter", "Property from server should not have null key or value. sdkAppId: %s", property.b);
            } else {
                if (!"PUBLIC".equalsIgnoreCase(property.e)) {
                    str2 = property.a.contains(2) ? property.b : str;
                } else {
                    str2 = null;
                }
                krl krl = (krl) a3.remove(krl.a(property.c, str2));
                if (krl == null) {
                    krl = kmp.a(property.c, str2);
                }
                krl.a(property.d, (Long) null);
            }
        }
        for (krl a4 : a3.values()) {
            a4.a((String) null, (Long) null);
        }
        String str4 = "";
        if (ah == null) {
            if (((Boolean) jzq.O.c()).booleanValue()) {
                kmp.c(lnj.T());
            }
            String a5 = a(lnj.l(), ((Integer) jzq.aF.c()).intValue());
            if (a5 != null) {
                str4 = a5;
            }
            kmp.a(str4);
            kmp.h(a(lnj.v(), ((Integer) jzq.aD.c()).intValue()));
            kmp.a(kpy.a(lnj.r(), lnj.n()));
            kmp.g(a(lnj.q(), ((Integer) jzq.aE.c()).intValue()));
            kmp.b(lnj.a());
            kmp.d(lnj.A());
            kmp.j(lnj.J().h);
            kmp.a(lnj.s());
            kmp.c(lnj.b());
            kmp.c(lnj.D());
            kmp.a(lnj.t());
            kmp.f(lnj.Q());
            Date c2 = c(lnj.j());
            if (c2 != null) {
                kmp.e(c2);
            }
            Date c3 = c(lnj.h());
            if (c3 != null) {
                kmp.d(c3);
            }
            Date c4 = c(lnj.o());
            if (c4 != null) {
                kmp.a(c4);
            }
            Date c5 = c(lnj.i());
            if (c5 != null) {
                kmp.b(c5);
            }
            Date c6 = c(lnj.p());
            if (c6 != null) {
                kmp.c(c6);
                return;
            }
            return;
        }
        if (((Boolean) jzq.O.c()).booleanValue()) {
            String T = lnj.T();
            if (ah.b().a()) {
                ah.b().a((Object) T);
            } else {
                kmp.c(T);
            }
        }
        String a6 = a(lnj.l(), ((Integer) jzq.aF.c()).intValue());
        if (a6 != null) {
            str4 = lso.a(a6);
        }
        if (ah.d().a()) {
            ah.d().a((Object) str4);
        } else {
            kmp.a(str4);
        }
        String a7 = a(lnj.v(), ((Integer) jzq.aD.c()).intValue());
        if (ah.g().a()) {
            ah.g().a((Object) a7);
        } else {
            kmp.h(a7);
        }
        kpy a8 = kpy.a(lnj.r(), lnj.n());
        if (ah.c.a()) {
            ah.c.a((Object) a8);
        } else {
            kmp.a(a8);
        }
        String a9 = a(lnj.q(), ((Integer) jzq.aE.c()).intValue());
        if (ah.c().a()) {
            ah.c().a((Object) a9);
        } else {
            kmp.g(a9);
        }
        boolean a10 = lnj.a();
        if (ah.f().a()) {
            ah.f().a((Object) Boolean.valueOf(a10));
        } else {
            kmp.b(a10);
        }
        boolean A = lnj.A();
        if (ah.i().a()) {
            ah.i().a((Object) Boolean.valueOf(A));
        } else {
            kmp.d(A);
        }
        String str5 = lnj.J().h;
        if (ah.e().a()) {
            ah.e().a((Object) str5);
        } else {
            kmp.j(str5);
        }
        boolean s = lnj.s();
        if (ah.k().a()) {
            ah.k().a((Object) Boolean.valueOf(s));
        } else {
            kmp.a(s);
        }
        boolean b2 = lnj.b();
        if (ah.l().a()) {
            ah.l().a((Object) Boolean.valueOf(b2));
        } else {
            kmp.c(b2);
        }
        long D = lnj.D();
        if (ah.d.a()) {
            ah.d.a((Object) Long.valueOf(D));
        } else {
            kmp.c(D);
        }
        amzy t = lnj.t();
        if (ah.e.a()) {
            ah.e.a((Object) t);
        } else {
            kmp.a(t);
        }
        boolean Q = lnj.Q();
        if (ah.n().a()) {
            ah.n().a((Object) Boolean.valueOf(Q));
        } else {
            kmp.f(Q);
        }
        Date c7 = c(lnj.j());
        if (c7 != null) {
            if (ah.h().a()) {
                ah.h().a((Object) c7);
            } else {
                kmp.e(c7);
            }
        }
        Date c8 = c(lnj.h());
        if (c8 != null) {
            if (ah.m().a()) {
                ah.m().a((Object) c8);
            } else {
                kmp.d(c8);
            }
        }
        Date c9 = c(lnj.o());
        if (c9 != null) {
            if (ah.o().a()) {
                ah.o().a((Object) c9);
            } else {
                kmp.a(c9);
            }
        }
        Date c10 = c(lnj.i());
        if (c10 != null) {
            if (ah.p().a()) {
                ah.p().a((Object) c10);
            } else {
                kmp.b(c10);
            }
        }
        Date c11 = c(lnj.p());
        if (c11 != null) {
            if (ah.q().a()) {
                ah.q().a((Object) c11);
            } else {
                kmp.c(c11);
            }
        }
        kke.a((kqi) ah);
    }

    public static void a(kkf kkf, lnj lnj, kmp kmp, String str) {
        if (a(lnj, kmp)) {
            a((kke) kkf, lnj, kmp, str);
        }
    }

    static boolean a(krk krk, lnj lnj, kmp kmp) {
        kmu kmu;
        if (!((Boolean) jzq.R.c()).booleanValue()) {
            return false;
        }
        List<Permission> X = lnj.X();
        List<kmu> ak = kmp.ak();
        kmu kmu2 = null;
        if (X.isEmpty()) {
            Permission J = lnj.J();
            String str = J.d;
            if (str == null) {
                return false;
            }
            Iterator it = ak.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                kmu kmu3 = (kmu) it.next();
                if (str.equals(kmu3.b)) {
                    kmu2 = kmu3;
                    break;
                }
            }
            if (!"owner".equals(J.h)) {
                if (kmu2 != null && kmu2.f == 3) {
                    kmu2.a(krk.a);
                    return true;
                }
            } else if (kmu2 == null) {
                kmp.a(J);
                return true;
            }
            return false;
        }
        HashSet hashSet = new HashSet();
        for (Permission permission : X) {
            if (hashSet.add(lrz.c(permission))) {
                Iterator it2 = ak.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        kmu = null;
                        break;
                    }
                    kmu = (kmu) it2.next();
                    if (ius.a(kmu.b, lrz.c(permission))) {
                        kmu.a(krk.a, permission);
                        break;
                    }
                }
                if (kmu != null) {
                    ak.remove(kmu);
                } else {
                    kmp.a(permission);
                }
            }
        }
        for (kmu kmu4 : ak) {
            if (kmu4.a != null) {
                kmu4.a(krk.a);
            }
        }
        kmp.a.ag = lnj.S();
        kmp.an();
        return true;
    }

    private static boolean a(lnj lnj, kmp kmp) {
        return kmp.ae() <= 0 || lnj.S() > kmp.ae();
    }
}
