package defpackage;

import android.app.PendingIntent;
import android.app.StatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.westworld.ConfigActivationOperation;
import com.google.android.gms.westworld.DataAlarmOperation;
import com.google.android.gms.westworld.FetchOperation;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: aecg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aecg {
    static final TextUtils.SimpleStringSplitter a = new TextUtils.SimpleStringSplitter(',');

    static Set a(String str) {
        a.setString(str);
        anav j = anax.j();
        while (a.hasNext()) {
            try {
                j.b(Long.valueOf(Long.parseLong(a.next())));
            } catch (NumberFormatException e) {
            }
        }
        return j.a();
    }

    private static void a(Context context, StatsManager statsManager, Set set) {
        Set<String> stringSet = aecq.d(context).getStringSet("SENT_CONFIGS", anfv.a);
        try {
            if (!stringSet.contains(String.valueOf(azws.f())) && !set.contains(Long.valueOf(azws.f()))) {
                statsManager.removeConfig(azws.f());
            }
            for (String parseLong : stringSet) {
                long parseLong2 = Long.parseLong(parseLong);
                if (!set.contains(Long.valueOf(parseLong2))) {
                    statsManager.removeConfig(parseLong2);
                }
            }
        } catch (StatsManager.StatsUnavailableException e) {
        }
    }

    public static void a(Context context, Set set, List list, boolean z, aupy aupy, iby iby) {
        Set<bbx> set2;
        Set<String> stringSet;
        anav j = anax.j();
        anav j2 = anax.j();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            if (set.contains(Long.valueOf(longValue))) {
                j2.b(String.valueOf(longValue));
                bbx a2 = aecq.a(longValue);
                if (a2 != null) {
                    j.b(a2);
                }
            }
        }
        SharedPreferences d = aecq.d(context);
        anax<bbx> a3 = j.a();
        Set<String> stringSet2 = d.getStringSet("ACTIVE_CONFIGS", anfv.a);
        if (stringSet2.isEmpty()) {
            stringSet2 = d.getStringSet("SENT_CONFIGS", anfv.a);
        }
        if (stringSet2 != null) {
            anav j3 = anax.j();
            for (String parseLong : stringSet2) {
                bbx a4 = aecq.a(Long.parseLong(parseLong));
                if (a4 != null) {
                    j3.b(a4);
                }
            }
            set2 = j3.a();
        } else {
            set2 = anfv.a;
        }
        for (bbx bbx : set2) {
            if (!a3.contains(bbx)) {
                DataAlarmOperation.a(context, bbx);
            }
        }
        hph f = aecq.f(context);
        for (bbx bbx2 : a3) {
            DataAlarmOperation.a(context, Long.valueOf(DataAlarmOperation.a(bbx2)), f, bbx2, false);
        }
        if (!((aupy == null && iby == null) || (stringSet = d.getStringSet("ACTIVE_CONFIGS", anfv.a)) == null || stringSet.isEmpty())) {
            hph f2 = aecq.f(context);
            for (String parseLong2 : stringSet) {
                Long valueOf = Long.valueOf(Long.parseLong(parseLong2));
                if (!list.contains(valueOf)) {
                    FetchOperation.b(context, iby, aupy, f2, new Intent("com.google.android.gms.westworld.action.DEACTIVATE").putExtra("FETCH_CONFIG_ID", valueOf));
                }
            }
        }
        SharedPreferences.Editor edit = d.edit();
        edit.putStringSet("ACTIVE_CONFIGS", j2.a());
        if (z) {
            anav j4 = anax.j();
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                j4.b(String.valueOf(((Long) it2.next()).longValue()));
            }
            edit.putStringSet("SENT_CONFIGS", j4.a());
        }
        edit.apply();
    }

    static void a(aucd aucd, bci bci) {
        aucd o = bch.d.o();
        long j = bci.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        bch bch = (bch) o.b;
        int i = bch.a | 1;
        bch.a = i;
        bch.b = j;
        int i2 = bci.c;
        bch.a = i | 2;
        bch.c = i2;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        bci bci2 = (bci) aucd.b;
        bch bch2 = (bch) o.i();
        bci bci3 = bci.u;
        bch2.getClass();
        if (!bci2.p.a()) {
            bci2.p = aucj.a(bci2.p);
        }
        bci2.p.add(bch2);
    }

    public static boolean a(Context context) {
        aeci aeci;
        aecj aecj;
        anaf anaf;
        byte[] decode;
        aeci aeci2;
        aeci aeci3;
        aeci aeci4;
        bca bca;
        aucv aucv;
        Long l;
        aucd aucd;
        aucd aucd2;
        bca bca2;
        aucv aucv2;
        Long l2;
        aucd aucd3;
        bca bca3;
        aucv aucv3;
        Long l3;
        aucd aucd4;
        bca bca4;
        aucv aucv4;
        Long l4;
        aucd aucd5;
        bca bca5;
        List list;
        Long l5;
        aucd aucd6;
        aeci aeci5;
        Context context2 = context;
        StatsManager statsManager = (StatsManager) context2.getSystemService("stats");
        int i = 0;
        if (statsManager == null) {
            return false;
        }
        SharedPreferences c = aecq.c(context);
        aeck aeck = new aeck();
        if (jkr.h()) {
            aupy a2 = aecq.a(context);
            aeci = new aeci();
            aecj = new aecj(a2, context2, aeci);
        } else {
            aecj = null;
            aeci = null;
        }
        Map<String, ?> all = c.getAll();
        Iterator it = new TreeSet(all.keySet()).iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith(azws.g())) {
                byte[] decode2 = Base64.decode((String) all.get(str), i);
                if (decode2 == null || decode2.length == 0) {
                    aeci2 = aeci;
                } else {
                    try {
                        bci bci = (bci) aucj.a((aucj) bci.u, decode2, aubs.c());
                        if (!jkr.h()) {
                            a(aeck.m, bci);
                            for (bcc bcc : bci.j) {
                                if (!aeck.e.contains(Long.valueOf(bcc.c))) {
                                    aeck.m.a(bcc);
                                    aeck.e.add(Long.valueOf(bcc.c));
                                }
                            }
                            for (bbp bbp : bci.i) {
                                if (!aeck.f.contains(Long.valueOf(bbp.c))) {
                                    aeck.m.a(bbp);
                                    aeck.f.add(Long.valueOf(bbp.c));
                                }
                            }
                            for (bbm bbm : bci.l) {
                                if (aeck.a(aeck.c, bbm.a, aeck.i)) {
                                    aeck.m.a(bbm);
                                }
                            }
                            for (bcl bcl : bci.m) {
                                if (aeck.a(aeck.d, bcl.a, aeck.j)) {
                                    aeck.m.a(bcl);
                                }
                            }
                            for (bbn bbn : bci.k) {
                                if (!aeck.g.contains(Long.valueOf(bbn.a)) && !aeck.a.contains(Long.valueOf(bbn.b)) && !aeck.b.contains(Long.valueOf(bbn.a))) {
                                    aeck.m.a(bbn);
                                    aeck.g.add(Long.valueOf(bbn.a));
                                }
                            }
                            aeck.k.addAll(bci.o);
                            anax a3 = anax.a((Collection) bci.o);
                            for (bbv bbv : bci.d) {
                                if (aeck.a(aeck.a, bbv.b, aeck.h, a3, aeck.l)) {
                                    aeck.m.a(bbv);
                                }
                            }
                            for (bbs bbs : bci.e) {
                                if (aeck.a(aeck.a, bbs.b, aeck.h, aeck.k, aeck.l)) {
                                    aeck.m.a(bbs);
                                }
                            }
                            for (bbt bbt : bci.h) {
                                if (aeck.a(aeck.a, bbt.b, aeck.h, aeck.k, aeck.l)) {
                                    aeck.m.a(bbt);
                                }
                            }
                            for (bcm bcm : bci.f) {
                                if (aeck.a(aeck.a, bcm.b, aeck.h, aeck.k, aeck.l)) {
                                    aeck.m.a(bcm);
                                }
                            }
                            for (bby bby : bci.g) {
                                if (aeck.a(aeck.a, bby.b, aeck.h, aeck.k, aeck.l)) {
                                    aeck.m.a(bby);
                                }
                            }
                            aeci2 = aeci;
                        } else {
                            if (azur.b()) {
                                aeci.a(bci);
                            }
                            if (!azur.b()) {
                                aeci4 = aeci;
                            } else if (bci.l.size() != 0) {
                                long f = azws.f();
                                aecj.a(f);
                                aucd aucd7 = (aucd) aecj.a.get(Long.valueOf(f));
                                aecj.b(f, bci);
                                Iterator it2 = bci.l.iterator();
                                while (it2.hasNext()) {
                                    bbm bbm2 = (bbm) it2.next();
                                    Iterator it3 = it2;
                                    aeci2 = aeci;
                                    try {
                                        if (aecj.a(aecj.d, bbm2.a, aecj.l.a(Long.valueOf(f)))) {
                                            aucd7.a(bbm2);
                                        }
                                        if (!aecj.d.contains(Long.valueOf(bbm2.a))) {
                                            Iterator it4 = aecj.g.j.a(Long.valueOf(bbm2.a)).iterator();
                                            while (it4.hasNext()) {
                                                bcl bcl2 = (bcl) it4.next();
                                                Iterator it5 = it4;
                                                if (aecj.a(aecj.e, bcl2.a, aecj.m.a(Long.valueOf(f)))) {
                                                    aucd7.a(bcl2);
                                                    it4 = it5;
                                                } else {
                                                    it4 = it5;
                                                }
                                            }
                                            it2 = it3;
                                            aeci5 = aeci2;
                                        } else {
                                            it2 = it3;
                                            aeci5 = aeci2;
                                        }
                                    } catch (auda e) {
                                        aecq.f(context).c("InvalidConfigProto").a();
                                        aeci3 = aeci2;
                                        i = 0;
                                    }
                                }
                                aeci4 = aeci;
                            } else {
                                aeci4 = aeci;
                            }
                            List a4 = amzy.a((Collection) bci.o);
                            for (bbv bbv2 : bci.d) {
                                bca bca6 = bbv2.e;
                                if (bca6 == null) {
                                    bca6 = bca.g;
                                }
                                Long valueOf = Long.valueOf(aecq.a(bca6));
                                Set set = aecj.b;
                                long j = bbv2.b;
                                bca bca7 = bbv2.e;
                                if (bca7 != null) {
                                    bca5 = bca7;
                                } else {
                                    bca5 = bca.g;
                                }
                                List a5 = aecj.k.a(valueOf);
                                if (azul.b()) {
                                    list = bci.o;
                                } else {
                                    list = a4;
                                }
                                Long l6 = valueOf;
                                List list2 = a4;
                                bci bci2 = bci;
                                if (aecj.a(set, j, bca5, a5, list, aecj.o.a(valueOf))) {
                                    aecj.a(l6.longValue());
                                    l5 = l6;
                                    aucd aucd8 = (aucd) aecj.a.get(l5);
                                    if (azur.b()) {
                                        aucd6 = aucd8;
                                        aecj.b(aucd8, bbv2.c, bci2.b);
                                        if ((bbv2.a & 4) != 0) {
                                            aecj.a(aucd6, bbv2.d, bci2.b);
                                        }
                                    } else {
                                        aucd6 = aucd8;
                                        aecj.a(l5.longValue(), bci2);
                                    }
                                    aucd aucd9 = aucd6;
                                    aucd9.a(bbv2);
                                    if (!azur.b() && jkr.h()) {
                                        aecj.a(aucd9, bbv2.b, bci2);
                                    }
                                    if (azur.b() && jkr.h()) {
                                        aecj.c(aucd9, bbv2.b, bci2.b);
                                    }
                                    if (!azur.b() && !aecj.p.b(l5, Long.valueOf(bbv2.b))) {
                                        aecj.p.a((Object) l5, (Object) Long.valueOf(bbv2.b));
                                    }
                                    if (azuu.b() && bbv2.f) {
                                        aecj.f.add(l5);
                                    }
                                } else {
                                    l5 = l6;
                                }
                                if (!azur.b()) {
                                    bci = bci2;
                                    a4 = list2;
                                } else if (!aecj.b.contains(Long.valueOf(bbv2.b))) {
                                    bca bca8 = bbv2.e;
                                    if (bca8 == null) {
                                        bca8 = bca.g;
                                    }
                                    if (aecj.a(bca8)) {
                                        aecj.b(l5.longValue(), bci2);
                                        aecj.a(bci2.b, l5.longValue(), bbv2.b);
                                        bci = bci2;
                                        a4 = list2;
                                    } else {
                                        bci = bci2;
                                        a4 = list2;
                                    }
                                } else {
                                    bci = bci2;
                                    a4 = list2;
                                }
                            }
                            bci bci3 = bci;
                            for (bbs bbs2 : bci3.e) {
                                bca bca9 = bbs2.e;
                                if (bca9 == null) {
                                    bca9 = bca.g;
                                }
                                Long valueOf2 = Long.valueOf(aecq.a(bca9));
                                Set set2 = aecj.b;
                                long j2 = bbs2.b;
                                bca bca10 = bbs2.e;
                                if (bca10 != null) {
                                    bca4 = bca10;
                                } else {
                                    bca4 = bca.g;
                                }
                                List a6 = aecj.k.a(valueOf2);
                                if (!azul.b()) {
                                    aucv4 = aecj.n.a(valueOf2);
                                } else {
                                    aucv4 = bci3.o;
                                }
                                Long l7 = valueOf2;
                                if (aecj.a(set2, j2, bca4, a6, aucv4, aecj.o.a(valueOf2))) {
                                    aecj.a(l7.longValue());
                                    l4 = l7;
                                    aucd aucd10 = (aucd) aecj.a.get(l4);
                                    if (azur.b()) {
                                        aucd5 = aucd10;
                                        aecj.b(aucd10, bbs2.c, bci3.b);
                                        if ((bbs2.a & 4) != 0) {
                                            aecj.a(aucd5, bbs2.d, bci3.b);
                                        }
                                    } else {
                                        aucd5 = aucd10;
                                        aecj.a(l4.longValue(), bci3);
                                    }
                                    aucd aucd11 = aucd5;
                                    aucd11.a(bbs2);
                                    if (!azur.b() && jkr.h()) {
                                        aecj.a(aucd11, bbs2.b, bci3);
                                    }
                                    if (azur.b() && jkr.h()) {
                                        aecj.c(aucd11, bbs2.b, bci3.b);
                                    }
                                    if (!azur.b() && !aecj.p.b(l4, Long.valueOf(bbs2.b))) {
                                        aecj.p.a((Object) l4, (Object) Long.valueOf(bbs2.b));
                                    }
                                    if (azuu.b() && bbs2.f) {
                                        aecj.f.add(l4);
                                    }
                                } else {
                                    l4 = l7;
                                }
                                if (azur.b() && !aecj.b.contains(Long.valueOf(bbs2.b))) {
                                    bca bca11 = bbs2.e;
                                    if (bca11 == null) {
                                        bca11 = bca.g;
                                    }
                                    if (aecj.a(bca11)) {
                                        aecj.b(l4.longValue(), bci3);
                                        aecj.a(bci3.b, l4.longValue(), bbs2.b);
                                    }
                                }
                            }
                            for (bbt bbt2 : bci3.h) {
                                bca bca12 = bbt2.e;
                                if (bca12 == null) {
                                    bca12 = bca.g;
                                }
                                Long valueOf3 = Long.valueOf(aecq.a(bca12));
                                Set set3 = aecj.b;
                                long j3 = bbt2.b;
                                bca bca13 = bbt2.e;
                                if (bca13 != null) {
                                    bca3 = bca13;
                                } else {
                                    bca3 = bca.g;
                                }
                                List a7 = aecj.k.a(valueOf3);
                                if (!azul.b()) {
                                    aucv3 = aecj.n.a(valueOf3);
                                } else {
                                    aucv3 = bci3.o;
                                }
                                Long l8 = valueOf3;
                                if (aecj.a(set3, j3, bca3, a7, aucv3, aecj.o.a(valueOf3))) {
                                    aecj.a(l8.longValue());
                                    l3 = l8;
                                    aucd aucd12 = (aucd) aecj.a.get(l3);
                                    if (azur.b()) {
                                        aucd4 = aucd12;
                                        aecj.a(aucd12, bbt2.c, bci3.b);
                                        if ((bbt2.a & 4) != 0) {
                                            aecj.a(aucd4, bbt2.d, bci3.b);
                                        }
                                    } else {
                                        aucd4 = aucd12;
                                        aecj.a(l3.longValue(), bci3);
                                    }
                                    aucd aucd13 = aucd4;
                                    aucd13.a(bbt2);
                                    if (!azur.b() && jkr.h()) {
                                        aecj.a(aucd13, bbt2.b, bci3);
                                    }
                                    if (azur.b() && jkr.h()) {
                                        aecj.c(aucd13, bbt2.b, bci3.b);
                                    }
                                    if (!azur.b() && !aecj.p.b(l3, Long.valueOf(bbt2.b))) {
                                        aecj.p.a((Object) l3, (Object) Long.valueOf(bbt2.b));
                                    }
                                    if (azuu.b() && bbt2.f) {
                                        aecj.f.add(l3);
                                    }
                                } else {
                                    l3 = l8;
                                }
                                if (azur.b() && !aecj.b.contains(Long.valueOf(bbt2.b))) {
                                    bca bca14 = bbt2.e;
                                    if (bca14 == null) {
                                        bca14 = bca.g;
                                    }
                                    if (aecj.a(bca14)) {
                                        aecj.b(l3.longValue(), bci3);
                                        aecj.a(bci3.b, l3.longValue(), bbt2.b);
                                    }
                                }
                            }
                            for (bcm bcm2 : bci3.f) {
                                bca bca15 = bcm2.e;
                                if (bca15 == null) {
                                    bca15 = bca.g;
                                }
                                Long valueOf4 = Long.valueOf(aecq.a(bca15));
                                Set set4 = aecj.b;
                                long j4 = bcm2.b;
                                bca bca16 = bcm2.e;
                                if (bca16 != null) {
                                    bca2 = bca16;
                                } else {
                                    bca2 = bca.g;
                                }
                                List a8 = aecj.k.a(valueOf4);
                                if (!azul.b()) {
                                    aucv2 = aecj.n.a(valueOf4);
                                } else {
                                    aucv2 = bci3.o;
                                }
                                Long l9 = valueOf4;
                                if (aecj.a(set4, j4, bca2, a8, aucv2, aecj.o.a(valueOf4))) {
                                    aecj.a(l9.longValue());
                                    l2 = l9;
                                    aucd aucd14 = (aucd) aecj.a.get(l2);
                                    if (azur.b()) {
                                        aucd3 = aucd14;
                                        aecj.b(aucd14, bcm2.c, bci3.b);
                                        if ((bcm2.a & 8) != 0) {
                                            aecj.a(aucd3, bcm2.d, bci3.b);
                                        }
                                    } else {
                                        aucd3 = aucd14;
                                        aecj.a(l2.longValue(), bci3);
                                    }
                                    aucd aucd15 = aucd3;
                                    aucd15.a(bcm2);
                                    if (!azur.b() && jkr.h()) {
                                        aecj.a(aucd15, bcm2.b, bci3);
                                    }
                                    if (azur.b() && jkr.h()) {
                                        aecj.c(aucd15, bcm2.b, bci3.b);
                                    }
                                    if (!azur.b() && !aecj.p.b(l2, Long.valueOf(bcm2.b))) {
                                        aecj.p.a((Object) l2, (Object) Long.valueOf(bcm2.b));
                                    }
                                    if (azuu.b() && bcm2.f) {
                                        aecj.f.add(l2);
                                    }
                                } else {
                                    l2 = l9;
                                }
                                if (azur.b() && !aecj.b.contains(Long.valueOf(bcm2.b))) {
                                    bca bca17 = bcm2.e;
                                    if (bca17 == null) {
                                        bca17 = bca.g;
                                    }
                                    if (aecj.a(bca17)) {
                                        aecj.b(l2.longValue(), bci3);
                                        aecj.a(bci3.b, l2.longValue(), bcm2.b);
                                    }
                                }
                            }
                            for (bby bby2 : bci3.g) {
                                bca bca18 = bby2.f;
                                if (bca18 == null) {
                                    bca18 = bca.g;
                                }
                                Long valueOf5 = Long.valueOf(aecq.a(bca18));
                                Set set5 = aecj.b;
                                long j5 = bby2.b;
                                bca bca19 = bby2.f;
                                if (bca19 != null) {
                                    bca = bca19;
                                } else {
                                    bca = bca.g;
                                }
                                List a9 = aecj.k.a(valueOf5);
                                if (!azul.b()) {
                                    aucv = aecj.n.a(valueOf5);
                                } else {
                                    aucv = bci3.o;
                                }
                                Long l10 = valueOf5;
                                if (aecj.a(set5, j5, bca, a9, aucv, aecj.o.a(valueOf5))) {
                                    aecj.a(l10.longValue());
                                    l = l10;
                                    aucd aucd16 = (aucd) aecj.a.get(l);
                                    if (azur.b()) {
                                        aucd = aucd16;
                                        aecj.b(aucd16, bby2.c, bci3.b);
                                        if ((bby2.a & 16) != 0) {
                                            aecj.a(aucd, bby2.e, bci3.b);
                                        }
                                    } else {
                                        aucd = aucd16;
                                        aecj.a(l.longValue(), bci3);
                                    }
                                    aucd aucd17 = aucd;
                                    aucd17.a(bby2);
                                    if (!azur.b() && jkr.h()) {
                                        aecj.a(aucd17, bby2.b, bci3);
                                    }
                                    if (!azur.b() || !jkr.h()) {
                                        aucd2 = aucd17;
                                    } else {
                                        aucd2 = aucd17;
                                        aecj.c(aucd17, bby2.b, bci3.b);
                                    }
                                    if (azur.b() && (bby2.a & 4) != 0) {
                                        aecj.b(aucd2, bby2.d, bci3.b);
                                    }
                                    if (!azur.b() && !aecj.p.b(l, Long.valueOf(bby2.b))) {
                                        aecj.p.a((Object) l, (Object) Long.valueOf(bby2.b));
                                    }
                                    if (azuu.b() && bby2.g) {
                                        aecj.f.add(l);
                                    }
                                } else {
                                    l = l10;
                                }
                                if (azur.b() && !aecj.b.contains(Long.valueOf(bby2.b))) {
                                    bca bca20 = bby2.f;
                                    if (bca20 == null) {
                                        bca20 = bca.g;
                                    }
                                    if (aecj.a(bca20)) {
                                        aecj.b(l.longValue(), bci3);
                                        aecj.a(bci3.b, l.longValue(), bby2.b);
                                    }
                                }
                            }
                            aeci3 = aeci4;
                            i = 0;
                            z = true;
                        }
                    } catch (auda e2) {
                        aeci2 = aeci;
                        aecq.f(context).c("InvalidConfigProto").a();
                        aeci3 = aeci2;
                        i = 0;
                    }
                }
            } else {
                aeci2 = aeci;
            }
            aeci3 = aeci2;
            i = 0;
        }
        if (jkr.h()) {
            if (!azur.b()) {
                Iterator it6 = new TreeSet(all.keySet()).iterator();
                while (it6.hasNext()) {
                    String str2 = (String) it6.next();
                    if (!(!str2.startsWith(azws.g()) || (decode = Base64.decode((String) all.get(str2), 0)) == null || decode.length == 0)) {
                        try {
                            for (bbn bbn2 : ((bci) aucj.a((aucj) bci.u, decode, aubs.c())).k) {
                                long j6 = bbn2.b;
                                for (Long l11 : aecj.p.m()) {
                                    if (!aecj.j.b(l11, Long.valueOf(bbn2.a)) && aecj.p.b(l11, Long.valueOf(j6)) && !aecj.b.contains(Long.valueOf(bbn2.b)) && !aecj.c.contains(Long.valueOf(bbn2.a))) {
                                        ((aucd) aecj.a.get(l11)).a(bbn2);
                                        aecj.j.a((Object) l11, (Object) Long.valueOf(bbn2.a));
                                    }
                                }
                            }
                        } catch (auda e3) {
                        }
                    }
                }
            }
            for (Long l12 : aecj.n.m()) {
                for (Long l13 : aecj.n.a(l12)) {
                    if (aecj.o.d(l12) && !aecj.o.b(l12, l13)) {
                        ((aucd) aecj.a.get(l12)).a(l13.longValue());
                    }
                }
            }
            anab h = anaf.h();
            for (Map.Entry entry : aecj.a.entrySet()) {
                aucd aucd18 = (aucd) entry.getValue();
                a.setString(azvt.b());
                aucd18.h((Iterable) a);
                if (azws.h()) {
                    if (aucd18.c) {
                        aucd18.c();
                        aucd18.c = false;
                    }
                    bci.a((bci) aucd18.b);
                }
                if (azwl.a.a().c()) {
                    a.setString(azwl.a.a().a());
                    TextUtils.SimpleStringSplitter simpleStringSplitter = a;
                    if (aucd18.c) {
                        aucd18.c();
                        aucd18.c = false;
                    }
                    bci bci4 = (bci) aucd18.b;
                    bci bci5 = bci.u;
                    if (!bci4.s.a()) {
                        bci4.s = aucj.a(bci4.s);
                    }
                    auab.a((Iterable) simpleStringSplitter, (List) bci4.s);
                    aucx aucx = azwl.a.a().b().a;
                    if (aucd18.c) {
                        aucd18.c();
                        aucd18.c = false;
                    }
                    bci bci6 = (bci) aucd18.b;
                    if (!bci6.t.a()) {
                        bci6.t = aucj.a(bci6.t);
                    }
                    auab.a((Iterable) aucx, (List) bci6.t);
                }
                h.a((Long) entry.getKey(), (bci) aucd18.i());
            }
            anaf = h.a();
            if (azuu.b()) {
                SharedPreferences.Editor edit = aecq.d(context).edit();
                Set<Long> set6 = aecj.f;
                anav j7 = anax.j();
                for (Long valueOf6 : set6) {
                    j7.b(String.valueOf(valueOf6));
                }
                edit.putStringSet("KEEP_UID_MAP_CONFIGS", j7.a()).apply();
            }
            if (anaf.isEmpty() && z) {
                anaf = anaf.a(Long.valueOf(azws.f()), bci.u);
            }
        } else {
            Long valueOf7 = Long.valueOf(azws.f());
            for (Long l14 : aeck.k) {
                if (!aeck.l.contains(l14)) {
                    aeck.m.a(l14.longValue());
                }
            }
            a.setString(azvt.b());
            aeck.m.h((Iterable) a);
            if (azws.h()) {
                aucd aucd19 = aeck.m;
                if (aucd19.c) {
                    aucd19.c();
                    aucd19.c = false;
                }
                bci.a((bci) aucd19.b);
            }
            anaf = anaf.a(valueOf7, (bci) aeck.m.i());
        }
        if (anaf.isEmpty()) {
            return false;
        }
        if (jkr.h()) {
            ConfigActivationOperation.a(statsManager, (PendingIntent) null);
        }
        if (!a(context2, statsManager, (Map) anaf)) {
            return false;
        }
        if (jkr.h()) {
            a(context2, statsManager, anaf.keySet());
            List a10 = ConfigActivationOperation.a(statsManager, IntentOperation.getPendingIntent(context2, ConfigActivationOperation.class, new Intent("com.android.server.stats.action.ACTIVATE_CONFIG"), 0, 134217728));
            a(context, anaf.keySet(), a10, true, (aupy) null, (iby) null);
        }
        return true;
    }

    private static boolean a(Context context, StatsManager statsManager, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                try {
                    statsManager.addConfig(((Long) entry.getKey()).longValue(), ((bci) entry.getValue()).k());
                    if (jkr.h()) {
                        aecq.a(statsManager, ((Long) entry.getKey()).longValue(), context);
                    }
                } catch (IllegalArgumentException e) {
                    return false;
                } catch (StatsManager.StatsUnavailableException e2) {
                    return false;
                }
            }
        }
        return true;
    }
}
