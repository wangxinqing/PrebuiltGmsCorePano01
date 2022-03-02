package defpackage;

import android.content.Context;
import com.google.android.gms.leveldb.WriteBatch;
import com.google.android.gms.nearby.messages.internal.BleSignalImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: vak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vak implements uxc {
    public static final tga a = new tga();
    public final uzy b = new uzy();
    public final gtu c = new gtu();
    public final Context d;
    public final vav e;
    public final int f;
    public final Map g = new HashMap();
    public final Map h = new HashMap();
    public final Map i = new HashMap();
    public final vah j;
    public final Collection k = new ArrayList();
    public final arwg l;
    private final uyc m;

    public vak(Context context) {
        this.d = context;
        vav vav = (vav) thl.a(context, vav.class);
        this.e = vav;
        this.f = vav.m().g;
        ((uxd) thl.a(context, uxd.class)).a(this);
        this.l = (arwg) thl.a(context, arwg.class);
        this.j = (vah) thl.a(context, vah.class);
        this.m = (uyc) thl.a(this.d, uyc.class);
    }

    public static boolean a(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    public final List b(List list) {
        this.l.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            auzf auzf = (auzf) it.next();
            if (this.h.containsKey(auzf)) {
                arrayList.add((vai) this.g.get(this.h.get(auzf)));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final int a(vai vai, BleSignalImpl bleSignalImpl, auzf auzf, String str, byte[] bArr) {
        int i2;
        this.l.b();
        int i3 = 0;
        if (auzf != null) {
            a(auzf, vai);
            i2 = vai.a(auzf, bleSignalImpl, vai.c, 1);
            if (a(i2, 1)) {
                jjg jjg = tgc.a;
            }
        } else {
            i2 = 0;
        }
        if (str != null) {
            i2 |= vai.a(str, bleSignalImpl, vai.d, 2);
            if (a(i2, 2)) {
                jjg jjg2 = tgc.a;
                String str2 = vai.b;
            }
        }
        if (bArr == null) {
            return i2;
        }
        if (!Arrays.equals(vai.i, bArr)) {
            vai.i = bArr;
            i3 = 8;
        }
        return i2 | i3;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.util.List, java.util.Collection] */
    public final void b() {
        int i2;
        this.l.b();
        jjg jjg = tgc.a;
        this.g.size();
        this.h.size();
        ArrayList arrayList = new ArrayList(this.g.values());
        this.g.clear();
        this.h.clear();
        this.i.clear();
        ? r1 = this.k;
        int size = r1.size();
        int i3 = 0;
        while (i3 < size) {
            vaj vaj = (vaj) r1.get(i3);
            int size2 = arrayList.size();
            int i4 = 0;
            while (true) {
                i2 = i3 + 1;
                if (i4 >= size2) {
                    break;
                }
                vaj.a((vai) arrayList.get(i4));
                i4++;
            }
            i3 = i2;
        }
        this.b.a = new vab();
    }

    public final long a(List list) {
        this.l.b();
        int size = list.size();
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            vai a2 = a((auzf) list.get(i2));
            if (a2 != null) {
                long j3 = a2.f;
                if (j3 < j2) {
                    j2 = j3;
                }
            }
        }
        return j2;
    }

    public final Collection a() {
        this.l.b();
        return this.g.values();
    }

    public final Set a(auzf... auzfArr) {
        this.l.b();
        TreeSet treeSet = new TreeSet();
        for (vai vai : this.g.values()) {
            for (auzf containsKey : auzfArr) {
                if (vai.c.containsKey(containsKey)) {
                    treeSet.add(vai);
                }
            }
        }
        return treeSet;
    }

    public final vai a(auzf auzf) {
        this.l.b();
        return (vai) this.g.get(this.h.get(auzf));
    }

    public final void a(int i2) {
        this.l.b();
        if (i2 >= 80) {
            b();
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.List, java.util.Collection] */
    public final void a(auzf auzf, vai vai) {
        for (vai vai2 : a()) {
            if (vai2.c.containsKey(auzf) && (vai == null || vai2.compareTo(vai) < 0)) {
                vai = vai2;
            }
        }
        String str = (String) this.h.get(auzf);
        if (vai == null) {
            this.h.remove(auzf);
            this.i.remove(auzf);
        } else if (!vai.b.equals(str)) {
            this.h.put(auzf, vai.b);
            if (str != null) {
                ? r0 = this.k;
                int size = r0.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((vaj) r0.get(i2)).a(auzf, vai);
                }
            }
        }
    }

    public final void a(String str, int i2, int i3, double d2, auzf auzf, int i4) {
        String str2;
        String str3;
        String str4 = str;
        auzf auzf2 = auzf;
        int i5 = i4;
        anih anih = (anih) ((anih) tgc.a.d()).a("vak", "a", 538, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i3);
        Double valueOf3 = Double.valueOf(d2);
        String a2 = anml.g.a(auzf2.c.k());
        String a3 = avay.a(i4);
        if (i5 != 0) {
            anih.a("BleDeviceCache: new Fast Pair device [%s]: rssi=%d, tx=%d, distance=%.2fm, id=%s, scanMode=%s", str, valueOf, valueOf2, valueOf3, a2, a3);
            uyc uyc = this.m;
            uxz uxz = new uxz();
            auay auay = auzf2.c;
            if (auay != null) {
                uxz.a = auay;
                uxz.b = valueOf;
                uxz.c = valueOf2;
                uxz.d = valueOf3;
                if (str4 != null) {
                    uxz.e = str4;
                    if (i5 != 0) {
                        uxz.f = i5;
                        String str5 = uxz.a == null ? " modelId" : "";
                        if (uxz.b == null) {
                            str5 = str5.concat(" rssi");
                        }
                        if (uxz.c == null) {
                            str5 = String.valueOf(str5).concat(" txPower");
                        }
                        if (uxz.d == null) {
                            str5 = String.valueOf(str5).concat(" distance");
                        }
                        if (uxz.e == null) {
                            str5 = String.valueOf(str5).concat(" macAddress");
                        }
                        if (uxz.f == 0) {
                            str5 = String.valueOf(str5).concat(" bleScanMode");
                        }
                        if (!str5.isEmpty()) {
                            String valueOf4 = String.valueOf(str5);
                            throw new IllegalStateException(valueOf4.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf4));
                        }
                        uwj uwj = new uwj(uxz.a, uxz.b.intValue(), uxz.c.intValue(), uxz.d.doubleValue(), uxz.e, uxz.f);
                        aucd o = auwz.n.o();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        auwz auwz = (auwz) o.b;
                        auwz.b = 10;
                        auwz.a |= 1;
                        aucd o2 = auwm.e.o();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        auwm auwm = (auwm) o2.b;
                        auwm.b = 1;
                        int i6 = auwm.a | 1;
                        auwm.a = i6;
                        auwm.a = i6 | 2;
                        auwm.c = 1;
                        aucd o3 = auwg.i.o();
                        byte a4 = uwj.a.a() == 3 ? ((uwj.a.a(0) & 255) << 16) | ((uwj.a.a(1) & 255) << 8) | (uwj.a.a(2) & 255) : 0;
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        auwg auwg = (auwg) o3.b;
                        auwg.a |= 1;
                        auwg.b = a4;
                        int i7 = uwj.b;
                        auwg auwg2 = (auwg) o3.b;
                        auwg2.a |= 2;
                        auwg2.c = i7;
                        int i8 = uwj.c;
                        auwg auwg3 = (auwg) o3.b;
                        auwg3.a |= 4;
                        auwg3.d = i8;
                        double d3 = uwj.d;
                        auwg auwg4 = (auwg) o3.b;
                        auwg4.a |= 8;
                        auwg4.e = d3;
                        long longValue = uyc.b(uwj.e).longValue();
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        auwg auwg5 = (auwg) o3.b;
                        auwg5.a |= 16;
                        auwg5.f = longValue;
                        int i9 = uwj.f;
                        auwg auwg6 = (auwg) o3.b;
                        int i10 = i9 - 1;
                        if (i9 != 0) {
                            auwg6.g = i10;
                            auwg6.a |= 32;
                            int a5 = tgl.a();
                            if (o3.c) {
                                o3.c();
                                o3.c = false;
                            }
                            auwg auwg7 = (auwg) o3.b;
                            auwg7.h = a5 - 1;
                            auwg7.a |= 64;
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            auwm auwm2 = (auwm) o2.b;
                            auwg auwg8 = (auwg) o3.i();
                            auwg8.getClass();
                            auwm2.d = auwg8;
                            auwm2.a |= 4;
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            auwz auwz2 = (auwz) o.b;
                            auwm auwm3 = (auwm) o2.i();
                            auwm3.getClass();
                            auwz2.m = auwm3;
                            auwz2.a |= 2048;
                            if (aynf.b()) {
                                anih anih2 = (anih) ((anih) tgc.a.d()).a("uyc", "a", 277, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                                auwm auwm4 = ((auwz) o.b).m;
                                if (auwm4 == null) {
                                    auwm4 = auwm.e;
                                }
                                int a6 = avbu.a(auwm4.b);
                                if (a6 == 0) {
                                    a6 = 1;
                                }
                                String str6 = a6 != 1 ? "CACHE_TYPE_FAST_PAIR" : "CACHE_TYPE_UNKNOWN";
                                auwm auwm5 = ((auwz) o.b).m;
                                if (auwm5 == null) {
                                    auwm5 = auwm.e;
                                }
                                auwg auwg9 = auwm5.d;
                                if (auwg9 == null) {
                                    auwg9 = auwg.i;
                                }
                                Integer valueOf5 = Integer.valueOf(auwg9.b);
                                auwm auwm6 = ((auwz) o.b).m;
                                if (auwm6 == null) {
                                    auwm6 = auwm.e;
                                }
                                auwg auwg10 = auwm6.d;
                                if (auwg10 == null) {
                                    auwg10 = auwg.i;
                                }
                                Double valueOf6 = Double.valueOf(auwg10.e);
                                String str7 = uwj.e;
                                auwm auwm7 = ((auwz) o.b).m;
                                if (auwm7 == null) {
                                    auwm7 = auwm.e;
                                }
                                auwg auwg11 = auwm7.d;
                                if (auwg11 == null) {
                                    auwg11 = auwg.i;
                                }
                                Long valueOf7 = Long.valueOf(auwg11.f);
                                auwm auwm8 = ((auwz) o.b).m;
                                if (auwm8 == null) {
                                    auwm8 = auwm.e;
                                }
                                auwg auwg12 = auwm8.d;
                                if (auwg12 == null) {
                                    auwg12 = auwg.i;
                                }
                                int b2 = avay.b(auwg12.g);
                                if (b2 == 0) {
                                    b2 = 1;
                                }
                                String a7 = avay.a(b2);
                                auwm auwm9 = ((auwz) o.b).m;
                                if (auwm9 == null) {
                                    auwm9 = auwm.e;
                                }
                                auwg auwg13 = auwm9.d;
                                if (auwg13 == null) {
                                    auwg13 = auwg.i;
                                }
                                int a8 = aspa.a(auwg13.h);
                                if (a8 == 0) {
                                    a8 = 1;
                                }
                                if (a8 == 1) {
                                    str3 = "UNKNOWN_USER_TYPE";
                                } else if (a8 == 2) {
                                    str3 = "PRODUCTION";
                                } else if (a8 == 3) {
                                    str3 = "MODULEFOOD";
                                } else if (a8 == 4) {
                                    str3 = "TEST";
                                } else if (a8 != 5) {
                                    str2 = "AUTO_TEST";
                                    anih2.a("NearbyMessagesLogger UPDATE %s, model %s, distance .%2fm, address %s (salted %s), scan mode %s, user type %s", str6, valueOf5, valueOf6, str7, valueOf7, a7, str2);
                                } else {
                                    str3 = "PRESTO_DOGFOOD";
                                }
                                str2 = str3;
                                anih2.a("NearbyMessagesLogger UPDATE %s, model %s, distance .%2fm, address %s (salted %s), scan mode %s, user type %s", str6, valueOf5, valueOf6, str7, valueOf7, a7, str2);
                            }
                            uyc.a((String) null, (String) null, (auwz) o.i());
                            return;
                        }
                        throw null;
                    }
                    throw new NullPointerException("Null bleScanMode");
                }
                throw new NullPointerException("Null macAddress");
            }
            throw new NullPointerException("Null modelId");
        }
        throw null;
    }

    public final void a(vaj vaj) {
        this.k.add(vaj);
    }

    public final void a(auze[] auzeArr) {
        if (auzeArr != null && (r0 = auzeArr.length) > 0) {
            vah vah = this.j;
            if (vah.c()) {
                WriteBatch create = WriteBatch.create();
                for (auze auze : auzeArr) {
                    auzf auzf = auze.b;
                    if (auzf == null) {
                        auzf = auzf.d;
                    }
                    vag vag = new vag(auzf);
                    aiss a2 = vah.a(vag);
                    if (a2 == null) {
                        a2 = vah.a((Collection) anfv.a);
                    }
                    aucd aucd = (aucd) a2.c(5);
                    aucd.a((aucj) a2);
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    aiss aiss = (aiss) aucd.b;
                    aiss aiss2 = aiss.f;
                    auze.getClass();
                    aiss.d = auze;
                    aiss.a |= 2;
                    vah.a(create, vag, (aiss) aucd.i());
                }
                vah.a(create);
            }
        }
    }
}
