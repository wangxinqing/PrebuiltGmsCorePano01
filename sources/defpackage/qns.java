package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: qns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qns {
    private static qns e;
    private static final qnz f = new qnz();
    public final Context a;
    public final aplf b;
    public final qnu c;
    public final PackageManager d;

    public qns(Context context, aplf aplf, qnu qnu, PackageManager packageManager) {
        this.a = context;
        this.b = aplf;
        this.c = qnu;
        this.d = packageManager;
    }

    public static acvs a(long j, ansz ansz, int i) {
        return new qnr(i, ansz, j);
    }

    public final void b() {
        Set set;
        long j;
        aplu a2;
        aucd o = ansz.k.o();
        int i = 0;
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((ansz) o.b).a = ansy.a(6);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        aafj aafj = new aafj();
        aafj.a = "IpaAppsCorpus";
        Set a3 = qnt.a(aafi.a(this.a, aafj.a()));
        if (a3 == null) {
            if (!axvz.a.a().e() || !this.c.a().isEmpty()) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ((ansz) o.b).h = ansx.a(4);
                qoh.a().a((ansz) o.i());
                return;
            }
            a3 = anfv.a;
        }
        amzy b2 = qnt.b(this.d);
        if (b2 == null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((ansz) o.b).h = ansx.a(4);
            qoh.a().a((ansz) o.i());
            qoh.a().a(30);
            return;
        }
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        int size = b2.size();
        int i2 = 0;
        while (i2 < size) {
            qnj qnj = (qnj) b2.get(i2);
            hashMap.put(qnj.d, qnj);
            hashSet.add(qnj.c);
            i2++;
            elapsedRealtime = elapsedRealtime;
            i = 0;
        }
        Set keySet = hashMap.keySet();
        long j2 = elapsedRealtime;
        if (System.currentTimeMillis() - TimeUnit.DAYS.toMillis(axvz.a.a().i()) < this.a.getSharedPreferences("AppsIndexerSharedPrefs", i).getLong("AppsIndexerAppsRefreshed", 0)) {
            set = angm.c(keySet, a3);
        } else {
            this.a.getSharedPreferences("AppsIndexerSharedPrefs", 0).edit().putLong("AppsIndexerAppsRefreshed", System.currentTimeMillis()).apply();
            set = keySet;
        }
        angk c2 = angm.c(a3, keySet);
        anax<String> a4 = anax.a((Collection) set);
        ArrayList arrayList = new ArrayList();
        for (String str : a4) {
            qnj qnj2 = (qnj) hashMap.get(str);
            if (!(qnj2 == null || (a2 = a(qnj2)) == null)) {
                arrayList.add(a2);
            }
        }
        int size2 = arrayList.size();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ansz ansz = (ansz) o.b;
        ansz.b = size2;
        ansz.j = aucj.s();
        if (arrayList.size() > 0) {
            acwa a5 = this.b.a((aplu[]) arrayList.toArray(new aplu[arrayList.size()]));
            j = j2;
            a5.a(a(j, (ansz) o.i(), 31));
            a5.a(a(j, (ansz) o.i()));
        } else {
            j = j2;
        }
        aucd e2 = o.clone();
        int size3 = c2.size();
        if (e2.c) {
            e2.c();
            e2.c = false;
        }
        ((ansz) e2.b).d = size3;
        ansz ansz2 = (ansz) e2.i();
        if (c2.size() > 0) {
            acwa a6 = this.b.a((String[]) c2.toArray(new String[c2.size()]));
            a6.a(a(j, ansz2, 32));
            a6.a(a(j, ansz2));
        }
        this.c.a(hashSet);
    }

    public static acvv a(long j, ansz ansz) {
        return new qnq(ansz, j);
    }

    public static final aplu a(qnj qnj) {
        aply aply = new aply("MobileApplication");
        if (qnj.a()) {
            aply.c(qnj.a);
            if (!TextUtils.isEmpty(qnj.d)) {
                String str = qnj.d;
                int i = 0;
                if (str.length() > 256) {
                    qoh.a().a(36);
                    qoi.b("Can't build MobileApplication indexable: URL too long %s", str);
                    return null;
                }
                aply.b(str);
                if (!TextUtils.isEmpty(qnj.b)) {
                    aply.a(qnj.b);
                }
                Long l = qnj.e;
                if (l != null) {
                    Date date = new Date(l.longValue());
                    iva.a((Object) date);
                    aply.a("dateModified", date.getTime());
                }
                anax anax = qnj.f;
                if (qnj.b()) {
                    String flattenToShortString = qnj.c.flattenToShortString();
                    iva.a((Object) flattenToShortString);
                    aply.a("identifier", flattenToShortString);
                    qnz qnz = f;
                    String packageName = qnj.c.getPackageName();
                    MessageDigest messageDigest = qnz.b;
                    if (messageDigest != null) {
                        byte[] digest = messageDigest.digest(packageName.getBytes());
                        long j = 0;
                        for (int i2 = 0; i2 < 8; i2++) {
                            j = (j << 8) | ((long) (digest[i2] & 255));
                        }
                        while (true) {
                            long[][] jArr = qnz.c;
                            if (i < jArr.length) {
                                if (Arrays.binarySearch(jArr[i], j) >= 0) {
                                    break;
                                }
                                i++;
                            } else {
                                break;
                            }
                        }
                    }
                    i = -1;
                    if (i == -1) {
                        i = qnz.c.length;
                    }
                    Long valueOf = Long.valueOf(qnz.a[i]);
                    aplt aplt = new aplt();
                    aplt.a(valueOf.intValue());
                    aplt.b();
                    aply.a(aplt);
                } else {
                    aplt aplt2 = new aplt();
                    aplt2.b();
                    aply.a(aplt2);
                }
                return aply.a();
            }
            qoi.b("Cant build MobileApplication indexable. URL missing");
            return null;
        }
        qoi.b("Cant build MobileApplication indexable. Name missing.");
        return null;
    }

    public static qns a(Context context) {
        synchronized (qns.class) {
            if (!axvz.d()) {
                e = null;
                aplf.a(context).b("MobileApplication");
                qns qns = e;
                return qns;
            }
            if (e == null) {
                qns qns2 = new qns(context, aplf.a(context), new qnu(context), context.getPackageManager());
                e = qns2;
                SharedPreferences sharedPreferences = qns2.a.getSharedPreferences("AppsIndexerSharedPrefs", 0);
                int i = sharedPreferences.getInt("Version", 0);
                if (i != 1) {
                    sharedPreferences.edit().putInt("Version", 1).commit();
                    if (i != 1) {
                        qok.a().a(new qno(qns2));
                    }
                }
                SharedPreferences sharedPreferences2 = qns2.a.getSharedPreferences("AppsIndexerSharedPrefs", 0);
                String string = sharedPreferences2.getString("CurrentOsBuildId", (String) null);
                if (string != null) {
                    if (Build.ID.equals(string)) {
                    }
                }
                sharedPreferences2.edit().putString("CurrentOsBuildId", Build.ID).apply();
                qok.a().a(new qnp(qns2));
            }
            qns qns3 = e;
            return qns3;
        }
    }

    public final void a() {
        aucd o = ansz.k.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((ansz) o.b).a = ansy.a(5);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        amzy b2 = qnt.b(this.d);
        if (b2 != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                qnj qnj = (qnj) b2.get(i);
                if (qnj.b()) {
                    arrayList2.add(qnj.c);
                }
                aplu a2 = a(qnj);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            int size2 = arrayList.size();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((ansz) o.b).b = size2;
            acwa a3 = this.b.a((aplu[]) arrayList.toArray(new aplu[arrayList.size()]));
            a3.a(a(elapsedRealtime, (ansz) o.i()));
            a3.a(a(elapsedRealtime, (ansz) o.i(), 31));
            this.c.a(arrayList2);
        }
    }
}
