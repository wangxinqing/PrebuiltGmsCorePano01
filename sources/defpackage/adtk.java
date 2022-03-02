package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.usagereporting.ConsentInformation;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: adtk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adtk {
    protected static agqu a;
    private static final int[] c = {7, 9, 8, 10};
    private static final UdcCacheRequest d = new UdcCacheRequest(c);
    public final adtm b;
    private final aoru e = new jfz(1, 10);

    public adtk(adtm adtm) {
        this.b = adtm;
    }

    public static final void a(Map map, aupo aupo, adsp adsp) {
        boolean z;
        HashMap hashMap = new HashMap();
        ArrayDeque arrayDeque = new ArrayDeque(aupo.a);
        boolean z2 = true;
        boolean z3 = false;
        while (!arrayDeque.isEmpty()) {
            aupn aupn = (aupn) arrayDeque.remove();
            Iterator it = map.entrySet().iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Set hashSet = hashMap.containsKey(entry.getKey()) ? (Set) hashMap.get(entry.getKey()) : new HashSet();
                aucx aucx = aupn.b;
                int size = aucx.size();
                int i = 0;
                while (i < size) {
                    aupm aupm = (aupm) aucx.get(i);
                    avvt avvt = (avvt) entry.getValue();
                    avvt avvt2 = aupm.a;
                    if (avvt2 == null) {
                        avvt2 = avvt.l;
                    }
                    int a2 = avvs.a(avvt2.b);
                    Iterator it2 = it;
                    if (a2 == 0 || a2 != 4) {
                        int a3 = avvs.a(avvt2.b);
                        if (a3 == 0) {
                            a3 = 1;
                        }
                        int a4 = avvs.a(avvt.b);
                        if (a4 == 0) {
                            a4 = 1;
                        }
                        if (a3 != a4) {
                            i++;
                            it = it2;
                        }
                    }
                    int a5 = avvs.a(avvt2.c);
                    if (a5 == 0 || a5 != 4) {
                        int a6 = avvs.a(avvt2.c);
                        if (a6 == 0) {
                            a6 = 1;
                        }
                        int a7 = avvs.a(avvt.c);
                        if (a7 == 0) {
                            a7 = 1;
                        }
                        if (a6 != a7) {
                            i++;
                            it = it2;
                        }
                    }
                    int a8 = avvs.a(avvt2.d);
                    if (a8 == 0 || a8 != 4) {
                        int a9 = avvs.a(avvt2.d);
                        if (a9 == 0) {
                            a9 = 1;
                        }
                        int a10 = avvs.a(avvt.d);
                        if (a10 == 0) {
                            a10 = 1;
                        }
                        if (a9 != a10) {
                            i++;
                            it = it2;
                        }
                    }
                    int a11 = avvs.a(avvt2.e);
                    if (a11 == 0 || a11 != 4) {
                        int a12 = avvs.a(avvt2.e);
                        if (a12 == 0) {
                            a12 = 1;
                        }
                        int a13 = avvs.a(avvt.e);
                        if (a13 == 0) {
                            a13 = 1;
                        }
                        if (a12 != a13) {
                            i++;
                            it = it2;
                        }
                    }
                    int a14 = avvs.a(avvt2.f);
                    if (a14 == 0 || a14 != 4) {
                        int a15 = avvs.a(avvt2.f);
                        if (a15 == 0) {
                            a15 = 1;
                        }
                        int a16 = avvs.a(avvt.f);
                        if (a16 == 0) {
                            a16 = 1;
                        }
                        if (a15 != a16) {
                            i++;
                            it = it2;
                        }
                    }
                    int a17 = avvs.a(avvt2.g);
                    if (a17 == 0 || a17 != 4) {
                        int a18 = avvs.a(avvt2.g);
                        if (a18 == 0) {
                            a18 = 1;
                        }
                        int a19 = avvs.a(avvt.g);
                        if (a19 == 0) {
                            a19 = 1;
                        }
                        if (a18 != a19) {
                            i++;
                            it = it2;
                        }
                    }
                    int a20 = avvs.a(avvt2.h);
                    if (a20 == 0 || a20 != 4) {
                        int a21 = avvs.a(avvt2.h);
                        if (a21 == 0) {
                            a21 = 1;
                        }
                        int a22 = avvs.a(avvt.h);
                        if (a22 == 0) {
                            a22 = 1;
                        }
                        if (a21 != a22) {
                            i++;
                            it = it2;
                        }
                    }
                    int a23 = avvs.a(avvt2.i);
                    if (a23 == 0 || a23 != 4) {
                        int a24 = avvs.a(avvt2.i);
                        if (a24 == 0) {
                            a24 = 1;
                        }
                        int a25 = avvs.a(avvt.i);
                        if (a25 == 0) {
                            a25 = 1;
                        }
                        if (a24 != a25) {
                            i++;
                            it = it2;
                        }
                    }
                    int a26 = avvs.a(avvt2.j);
                    if (a26 == 0 || a26 != 4) {
                        int a27 = avvs.a(avvt2.j);
                        if (a27 == 0) {
                            a27 = 1;
                        }
                        int a28 = avvs.a(avvt.j);
                        if (a28 == 0) {
                            a28 = 1;
                        }
                        if (a27 != a28) {
                            i++;
                            it = it2;
                        }
                    }
                    int a29 = avvs.a(avvt2.k);
                    if (a29 == 0 || a29 != 4) {
                        int a30 = avvs.a(avvt2.k);
                        if (a30 == 0) {
                            a30 = 1;
                        }
                        int a31 = avvs.a(avvt.k);
                        if (a31 == 0) {
                            a31 = 1;
                        }
                        if (a30 != a31) {
                            i++;
                            it = it2;
                        }
                    }
                    aups a32 = aups.a(aupm.b);
                    if (a32 == null) {
                        a32 = aups.UNKNOWN;
                    }
                    hashSet.add(Integer.valueOf(a32.d));
                    if (!hashMap.containsKey(entry.getKey())) {
                        hashMap.put((String) entry.getKey(), hashSet);
                    }
                    aupl aupl = aupn.a;
                    if (aupl == null) {
                        aupl = aupl.c;
                    }
                    z2 &= aupl.a;
                    if (aztt.b()) {
                        aupl aupl2 = aupn.a;
                        if (aupl2 == null) {
                            aupl2 = aupl.c;
                        }
                        z3 = aupl2.b | z3;
                    }
                    z4 = true;
                    i++;
                    it = it2;
                }
                Iterator it3 = it;
            }
            if (!z4) {
                arrayDeque.addAll(aupn.c);
            }
        }
        adrs b2 = ConsentInformation.b();
        if (!z2) {
            z = false;
        } else {
            z = true;
        }
        b2.a = z;
        if (aztt.b()) {
            b2.b = z3;
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            avvt avvt3 = (avvt) map.get(entry2.getKey());
            amzy a33 = amzy.a((Collection) entry2.getValue());
            iva.a((Object) avvt3, (Object) "Account Consents proto cannot be null");
            b2.a(new ConsentInformation.AccountConsentInformation((String) entry2.getKey(), avvt3.k(), a33));
        }
        try {
            adsp.a(Status.a, !hashMap.isEmpty(), b2.a());
        } catch (RemoteException e2) {
        }
    }

    public final void a(Context context, aupo aupo, adsp adsp) {
        boolean z;
        int i;
        int i2;
        Context context2 = context;
        aupo aupo2 = aupo;
        adsp adsp2 = adsp;
        iva.a(aekv.b(context), (Object) "User is not unlocked.");
        adtm adtm = this.b;
        aucd o = avvt.l.o();
        synchronized (adtm.a) {
            SharedPreferences b2 = adtm.b();
            irk.a((Object) b2, (Object) "Unexpected null from getPrefs.");
            int i3 = b2.getInt("OptInGMSCoreVersion", -1);
            if (!adtm.a(b2)) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avvt avvt = (avvt) o.b;
                avvt.b = 1;
                int i4 = avvt.a | 1;
                avvt.a = i4;
                avvt.d = 1;
                avvt.a = i4 | 4;
            } else {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avvt avvt2 = (avvt) o.b;
                avvt2.b = 2;
                avvt2.a |= 1;
                if (((long) i3) < azuf.c()) {
                    i2 = 2;
                } else {
                    i2 = 3;
                }
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avvt avvt3 = (avvt) o.b;
                avvt3.d = i2 - 1;
                avvt3.a |= 4;
            }
            int i5 = !b2.getBoolean("CbFromSetupWizard", false) ? 2 : 3;
            if (o.c) {
                o.c();
                o.c = false;
            }
            avvt avvt4 = (avvt) o.b;
            avvt4.k = i5 - 1;
            avvt4.a |= 512;
        }
        int i6 = !azuf.a.a().d() ? 2 : 3;
        if (o.c) {
            o.c();
            o.c = false;
        }
        avvt avvt5 = (avvt) o.b;
        avvt5.i = i6 - 1;
        avvt5.a |= 128;
        if (aztt.e()) {
            int i7 = Build.VERSION.SDK_INT;
            int i8 = !adtl.a(adtm.c) ? 2 : 3;
            if (o.c) {
                o.c();
                o.c = false;
            }
            avvt avvt6 = (avvt) o.b;
            avvt6.c = i8 - 1;
            avvt6.a |= 2;
        }
        avvt avvt7 = (avvt) o.i();
        HashMap hashMap = new HashMap();
        List<Account> d2 = jgu.d(context2, context.getPackageName());
        if (!d2.isEmpty()) {
            aucd aucd = (aucd) avvt7.c(5);
            aucd.a((aucj) avvt7);
            boolean a2 = aztz.a.a().a();
            for (Account account : d2) {
                if (!a2) {
                    acwa a3 = acyr.a(context2, new acyq(account)).a(d);
                    adtj adtj = r1;
                    aoru aoru = this.e;
                    adtj adtj2 = new adtj(this, account, aucd, hashMap, d2, aupo, adsp);
                    a3.a((Executor) aoru, (acvp) adtj2);
                    aucd = aucd;
                    hashMap = hashMap;
                } else {
                    aucd aucd2 = aucd;
                    HashMap hashMap2 = hashMap;
                    try {
                        if (a == null) {
                            agqw agqw = new agqw();
                            agqw.a(context2);
                            agqw.b("gmscoreusagereportingfacsid");
                            a = agqw.a();
                        }
                        agqt a4 = a.a(account);
                        boolean booleanValue = ((Boolean) a4.a(4).get(15, TimeUnit.SECONDS)).booleanValue();
                        boolean booleanValue2 = ((Boolean) a4.a(5).get(15, TimeUnit.SECONDS)).booleanValue();
                        if (!aucd2.c) {
                            z = false;
                        } else {
                            aucd2.c();
                            z = false;
                            try {
                                aucd2.c = false;
                            } catch (ExecutionException | TimeoutException e2) {
                                adsp2.a(Status.c, z, ConsentInformation.a);
                                return;
                            } catch (InterruptedException e3) {
                                adsp2.a(Status.c, z, ConsentInformation.a);
                                Thread.currentThread().interrupt();
                                return;
                            }
                        }
                        avvt avvt8 = (avvt) aucd2.b;
                        int i9 = avvt8.a & -65;
                        avvt8.a = i9;
                        avvt8.h = z ? 1 : 0;
                        int i10 = i9 & -33;
                        avvt8.a = i10;
                        avvt8.g = z;
                        int i11 = i10 & -17;
                        avvt8.a = i11;
                        avvt8.f = z;
                        int i12 = i11 & -9;
                        avvt8.a = i12;
                        avvt8.e = z;
                        avvt8.a = i12 & -257;
                        avvt8.j = z;
                        int b3 = this.b.b(account.name);
                        if (aucd2.c) {
                            aucd2.c();
                            aucd2.c = z;
                        }
                        avvt avvt9 = (avvt) aucd2.b;
                        avvt9.j = b3 - 1;
                        int i13 = avvt9.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        avvt9.a = i13;
                        if (booleanValue) {
                            avvt9.e = 2;
                            int i14 = i13 | 8;
                            avvt9.a = i14;
                            avvt9.f = 2;
                            i = i14 | 16;
                            avvt9.a = i;
                        } else {
                            avvt9.e = 1;
                            int i15 = i13 | 8;
                            avvt9.a = i15;
                            avvt9.f = 1;
                            i = i15 | 16;
                            avvt9.a = i;
                        }
                        if (!booleanValue2) {
                            avvt9.g = 1;
                            int i16 = i | 32;
                            avvt9.a = i16;
                            avvt9.h = 1;
                            avvt9.a = i16 | 64;
                        } else {
                            avvt9.g = 2;
                            int i17 = i | 32;
                            avvt9.a = i17;
                            avvt9.h = 2;
                            avvt9.a = i17 | 64;
                        }
                        hashMap = hashMap2;
                        hashMap.put(account.name, (avvt) aucd2.i());
                        aucd = aucd2;
                    } catch (ExecutionException | TimeoutException e4) {
                        z = false;
                        adsp2.a(Status.c, z, ConsentInformation.a);
                        return;
                    } catch (InterruptedException e5) {
                        z = false;
                        adsp2.a(Status.c, z, ConsentInformation.a);
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
            if (a2 && hashMap.size() == d2.size()) {
                a((Map) hashMap, aupo2, adsp2);
                return;
            }
            return;
        }
        hashMap.put("", avvt7);
        a((Map) hashMap, aupo2, adsp2);
    }
}
