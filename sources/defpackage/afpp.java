package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: afpp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afpp implements aoqb {
    private final afqn a;

    public afpp(afqn afqn) {
        this.a = afqn;
    }

    public final aorr a(Object obj) {
        aorr aorr;
        aorr aorr2;
        aorr aorr3;
        ArrayList arrayList;
        afqn afqn;
        aorr aorr4;
        long j;
        int i;
        long j2;
        ArrayList arrayList2;
        afqn afqn2;
        Iterator<String> it;
        HashSet hashSet;
        int i2;
        long j3;
        aorr aorr5;
        afqn afqn3 = this.a;
        Void voidR = (Void) obj;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(afqn3.d());
        afpf afpf = afqn3.d;
        SharedPreferences a2 = afst.a(afpf.a, "gms_icing_mdd_file_group_manager_metadata", afpf.i);
        int i3 = 0;
        if (a2.getBoolean("done_remove_groupkeys_with_downloaded_field_not_set", false)) {
            aorr = aorl.a((Object) null);
        } else {
            aorr = aopr.a(afpf.d.a(), (aoqb) new afoc(afpf, a2), afpf.h);
        }
        arrayList3.add(aorr);
        if (axsv.a.a().r()) {
            afpf afpf2 = afqn3.d;
            arrayList3.add(aopr.a(afpf2.d.a(), (aoqb) new afod(afpf2), afpf2.h));
        }
        if (axsv.a.a().u()) {
            afpf afpf3 = afqn3.d;
            arrayList3.add(aopr.a(afpf3.d.a(), (aoqb) new afnx(afpf3), afpf3.h));
        }
        if (axsv.a.a().t()) {
            afpf afpf4 = afqn3.d;
            if (!afpf4.g.a()) {
                aorr5 = aorl.a((Object) null);
            } else {
                Account[] accountsByTypeForPackage = ((AccountManager) afpf4.g.b()).getAccountsByTypeForPackage("com.google", afpf4.a.getPackageName());
                anav anav = new anav();
                for (Account account : accountsByTypeForPackage) {
                    if (!(account.name == null || account.type == null)) {
                        anav.b(afmj.a(account));
                    }
                }
                aorr5 = aopr.a(afpf4.d.a(), (aoqb) new afny(afpf4, anav.a()), afpf4.h);
            }
            arrayList3.add(aorr5);
        }
        if (axsv.a.a().w()) {
            afnt afnt = afqn3.h;
            List c = afnt.b.c();
            Iterator it2 = c.iterator();
            while (it2.hasNext()) {
                afkr afkr = (afkr) it2.next();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                afko afko = afkr.b;
                if (afko == null) {
                    afko = afko.g;
                }
                if (afsq.a(Math.min(timeUnit.toMillis(afko.b), afsq.a(afkr)), afnt.f)) {
                    afnt.e.a(1052, afkr.c, afkr.e);
                    it2.remove();
                }
            }
            afnt.b.e();
            if (!afnt.b.a(c)) {
                afnt.e.b(1036);
                afsh.a("%s: Failed to write back stale groups!", (Object) "ExpirationHandler");
            }
            arrayList3.add(aopr.a(aorl.a((Object) null), (aoqb) new afnk(afnt), afnt.i));
            afqn3.c.b(1053);
        }
        afsg afsg = afqn3.k;
        int b = (int) axtc.a.a().b();
        if (!scd.a(b)) {
            aorr2 = aorl.a((Object) null);
        } else {
            aorr2 = aopr.a(afsg.b.b(), (aoqb) new afsc(afsg, b), afsg.d);
        }
        arrayList3.add(aorr2);
        afso afso = afqn3.j;
        int h = (int) axtc.a.a().h();
        if (!scd.a(h)) {
            aorr3 = aorl.a((Object) null);
        } else {
            aorr3 = aopr.a(afso.a.b(), (aoqb) new afsj(afso, h), afso.h);
        }
        arrayList3.add(aorr3);
        afsi afsi = afqn3.l;
        int f = (int) axtc.a.a().f();
        if (scd.a(f)) {
            HashSet hashSet2 = new HashSet();
            aucd o = aoka.e.o();
            synchronized (afsz.class) {
                SharedPreferences a3 = afst.a(afsi.b, "gms_icing_mdd_network_usage_monitor", afsi.c);
                Iterator<String> it3 = a3.getAll().keySet().iterator();
                j = 0;
                long j4 = 0;
                while (it3.hasNext()) {
                    List c2 = amsk.a("|").c(it3.next());
                    if (c2.size() >= 4) {
                        int parseInt = Integer.parseInt((String) c2.get(2));
                        String a4 = afsz.a((String) c2.get(i3), (String) c2.get(1), parseInt);
                        if (!hashSet2.contains(a4)) {
                            hashSet2.add(a4);
                            String a5 = afsz.a(a4, "w");
                            String a6 = afsz.a(a4, "c");
                            HashSet hashSet3 = hashSet2;
                            int i4 = f;
                            Iterator<String> it4 = it3;
                            long j5 = a3.getLong(a5, 0);
                            afqn afqn4 = afqn3;
                            long j6 = a3.getLong(a6, 0);
                            aucd o2 = aojg.g.o();
                            String str = (String) c2.get(0);
                            afqn afqn5 = afqn4;
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            aojg aojg = (aojg) o2.b;
                            str.getClass();
                            ArrayList arrayList4 = arrayList3;
                            aojg.a |= 4;
                            aojg.d = str;
                            String str2 = (String) c2.get(1);
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            aojg aojg2 = (aojg) o2.b;
                            str2.getClass();
                            int i5 = aojg2.a | 1;
                            aojg2.a = i5;
                            aojg2.b = str2;
                            aojg2.a = i5 | 2;
                            aojg2.c = parseInt;
                            aojg aojg3 = (aojg) o2.i();
                            aucd o3 = aojz.e.o();
                            if (o3.c) {
                                o3.c();
                                o3.c = false;
                            }
                            aojz aojz = (aojz) o3.b;
                            aojg3.getClass();
                            aojz.b = aojg3;
                            int i6 = aojz.a | 1;
                            aojz.a = i6;
                            int i7 = i6 | 2;
                            aojz.a = i7;
                            aojz.c = j5;
                            aojz.a = i7 | 4;
                            aojz.d = j6;
                            aojz aojz2 = (aojz) o3.i();
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aoka aoka = (aoka) o.b;
                            aojz2.getClass();
                            if (!aoka.b.a()) {
                                aoka.b = aucj.a(aoka.b);
                            }
                            aoka.b.add(aojz2);
                            j += j5;
                            j4 += j6;
                            f = i4;
                            hashSet2 = hashSet3;
                            it3 = it4;
                            afqn3 = afqn5;
                            arrayList3 = arrayList4;
                            i3 = 0;
                        } else {
                            afqn2 = afqn3;
                            arrayList2 = arrayList3;
                            hashSet = hashSet2;
                            i2 = f;
                            it = it3;
                            j3 = j4;
                        }
                    } else {
                        afqn2 = afqn3;
                        arrayList2 = arrayList3;
                        hashSet = hashSet2;
                        i2 = f;
                        it = it3;
                        j3 = j4;
                    }
                    j4 = j3;
                    f = i2;
                    hashSet2 = hashSet;
                    it3 = it;
                    afqn3 = afqn2;
                    arrayList3 = arrayList2;
                    i3 = 0;
                }
                afqn = afqn3;
                arrayList = arrayList3;
                i = f;
                j2 = j4;
                a3.edit().clear().commit();
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoka aoka2 = (aoka) o.b;
            int i8 = aoka2.a | 1;
            aoka2.a = i8;
            aoka2.c = j;
            aoka2.a = i8 | 2;
            aoka2.d = j2;
            afsi.a.a((aoka) o.i(), i);
            aorr4 = aorl.a((Object) null);
        } else {
            afqn = afqn3;
            arrayList = arrayList3;
            synchronized (afsz.class) {
                afst.a(afsi.b, "gms_icing_mdd_network_usage_monitor", afsi.c).edit().clear().commit();
            }
            aorr4 = aorl.a((Object) null);
        }
        ArrayList arrayList5 = arrayList;
        arrayList5.add(aorr4);
        afqn afqn6 = afqn;
        afst.a(afqn6.b, "gms_icing_mdd_manager_metadata", afqn6.m).edit().remove("gms_icing_mdd_manager_ph_config_version").remove("gms_icing_mdd_manager_ph_config_version_timestamp").commit();
        return aorl.b((Iterable) arrayList5).a(afpz.a, afqn6.n);
    }
}
