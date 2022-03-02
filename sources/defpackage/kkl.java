package defpackage;

import android.database.Cursor;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.drive.UserMetadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: kkl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kkl extends kjp implements kkd {
    private final kkh c;
    private final kkj d = new kkj();

    public kkl(kkb kkb, kkh kkh, Executor executor) {
        super(kkb, executor);
        this.c = kkh;
    }

    public final long a(UserMetadata userMetadata) {
        d();
        return super.a(userMetadata);
    }

    public final /* bridge */ /* synthetic */ List a(Long l) {
        throw null;
    }

    public final List a(khq khq, String str, String str2, boolean z) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final kkh a() {
        return this.c;
    }

    public final kmh b(kkz kkz, String str) {
        kki a = this.d.a(kkz);
        iva.a((Object) a);
        iva.a((Object) str, (Object) "Can't create a DriveIdMapping for a local entry in TransactionDriveModel");
        iva.a(!a.a(str), (Object) "Can't create a DriveIdMapping that's already in the cache");
        kmh b = super.b(kkz, str);
        a.a(b);
        return b;
    }

    public final List c(kkx kkx) {
        d();
        return super.c(kkx);
    }

    public final List d(kkx kkx) {
        d();
        return super.d(kkx);
    }

    public final List e(kkx kkx) {
        d();
        return super.e(kkx);
    }

    public final kmp c(kkz kkz, String str) {
        kki a = this.d.a(kkz);
        iva.a((Object) a);
        kmp kmp = (kmp) a.b.a.get(str);
        if (kmp != null) {
            return kmp;
        }
        kmp c2 = super.c(kkz, str);
        if (c2 != null) {
            a.b.a(c2);
        }
        return c2;
    }

    public final void d() {
        iva.a(this.c.b, (Object) "This drive model is not active");
    }

    public final List a(kkx kkx, String str, boolean z) {
        d();
        return super.a(kkx, (String) null, true);
    }

    public final kmh a(kkz kkz, String str) {
        kki a = this.d.a(kkz);
        iva.a((Object) a);
        kmh kmh = (kmh) a.c.get(str);
        if (kmh != null) {
            return kmh;
        }
        kmh a2 = super.a(kkz, str);
        if (a2 != null) {
            a.a(a2);
        }
        return a2;
    }

    public final knl b(kkx kkx) {
        d();
        return super.b(kkx);
    }

    public final krk b(String str) {
        krk krk;
        boolean z;
        if (this.d.a.containsKey(str)) {
            return this.d.a(str).a;
        }
        kkb kkb = this.a;
        Cursor a = kkb.a(this.c, kle.a.b(), (String[]) null, kld.ACCOUNT_HOLDER_NAME.l.b(str), (String) null);
        try {
            if (a.moveToFirst()) {
                klb a2 = klb.a(kkb, a);
                krk = new krk(new lgp(this, new kkz(str, a2.m)), a2);
            } else {
                a.close();
                krk = null;
            }
            kkj kkj = this.d;
            if (krk != null) {
                z = true;
            } else {
                z = false;
            }
            iva.b(z);
            iva.a(true ^ kkj.a.containsKey(krk.d()));
            kki kki = new kki(krk);
            kkj.a.put(krk.d(), kki);
            kkj.b.b(krk.e().b, kki);
            return krk;
        } finally {
            a.close();
        }
    }

    public final kmp a(kkz kkz, String str, String str2) {
        kki a = this.d.a(kkz);
        iva.a((Object) a);
        iva.a((Object) str2, (Object) "Can't create a local entry in TransactionDriveModel");
        iva.a(!a.b.a(str2), (Object) "Can't create an entry that's already in the cache");
        kmp a2 = super.a(kkz, str, str2);
        a.b.a(a2);
        return a2;
    }

    public final kqc a(long j) {
        throw new IllegalStateException("Method not supported in a transaction drive model");
    }

    public final void a(Runnable runnable) {
        d();
        runnable.run();
    }

    public final void b(kqi kqi) {
        d();
        iva.a(kqi.ao);
        iva.b(!kqi.an.equals(knf.a), "Entries should be marked as deleted on the server, but never deleted directly.");
        this.a.a(this.c, kqi.an, kqi.a());
        kqi.s();
    }

    public final void a(kmp kmp, long j) {
        d();
        super.a(kmp, j);
    }

    public final void a(kmp kmp, Set set) {
        d();
        super.a(kmp, set);
    }

    public final void a(knc knc, long j) {
        d();
        super.a(knc, j);
    }

    public final void a(kqi kqi) {
        d();
        if (kqi.ao) {
            this.a.a(this.c, kqi.an, kqi.a(), kqi.r());
        } else {
            kqi.c(this.a.a(this.c, kqi.an, kqi.r()));
        }
    }

    /* JADX INFO: finally extract failed */
    public final void a(krk krk, Collection collection) {
        d();
        kki a = this.d.a(krk.d());
        iva.a(a != null);
        kkz e = krk.e();
        kkk kkk = a.b;
        HashSet<String> hashSet = new HashSet<>();
        HashSet hashSet2 = new HashSet();
        HashSet<Pair> hashSet3 = new HashSet<>();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            lnj lnj = (lnj) it.next();
            String g = lnj.g();
            if (!kkk.a(g)) {
                hashSet.add(g);
            }
            if (!lnj.c()) {
                hashSet3.add(Pair.create(lnj.g(), lnj.q()));
                hashSet.addAll(lnj.e());
            } else {
                hashSet2.add(lnj.g());
            }
        }
        Cursor a2 = a(e, "EntryView", lrr.a(kmj.RESOURCE_ID.c.a(), (Iterable) hashSet), (String) null, (String[]) null);
        kkb kkb = this.a;
        kkr kkr = this.b;
        HashSet<kmp> hashSet4 = new HashSet<>();
        while (a2.moveToNext()) {
            try {
                hashSet4.add(kkr.a(kkb, a2));
            } catch (NullPointerException e2) {
                Log.e("TransactionDriveModel", "Queried entry could not be loaded.", e2);
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        }
        a2.close();
        for (kmp kmp : hashSet4) {
            kkk.a(kmp);
            a.a(kmp.c);
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            lnj lnj2 = (lnj) it2.next();
            if (!lnj2.c() && !kkk.a(lnj2.g()) && lnj2.L() != null && lnj2.M() != null && lnj2.I()) {
                khq a3 = khq.a(e);
                List<kmp> a4 = super.a(a3, lnj2.L(), lnj2.M(), lnj2.I());
                kki a5 = this.d.a(a3.a);
                if (a5 != null) {
                    kkk kkk2 = a5.b;
                    ArrayList arrayList = new ArrayList();
                    for (kmp kmp2 : a4) {
                        kmp kmp3 = (kmp) kkk2.b.get(kmp2.b());
                        if (kmp3 != null) {
                            kmp2 = kmp3;
                        }
                        arrayList.add(kmp2);
                    }
                    a4 = Collections.unmodifiableList(arrayList);
                }
                if (!a4.isEmpty()) {
                    kmp kmp4 = (kmp) a4.get(0);
                    kmp4.b(lnj2.g());
                    kkk.a(kmp4);
                    a.a(kmp4.c);
                }
            }
        }
        kqy a6 = kqz.a(lrr.b(e.b), lrr.a(kmj.RESOURCE_ID.c.a(), (Iterable) hashSet), kqz.a(String.format(Locale.US, "%s NOT IN (SELECT %s FROM %s)", new Object[]{kmk.a.a.a(), kne.ENTRY_ID.aB.a(), knf.a.b()})));
        HashSet<kmh> hashSet5 = new HashSet<>();
        Cursor a7 = this.a.a(this.c, kmk.a.b(), (String[]) null, a6, (String) null);
        while (a7.moveToNext()) {
            try {
                hashSet5.add(kmh.a(this.a, a7));
            } catch (Throwable th2) {
                a7.close();
                throw th2;
            }
        }
        a7.close();
        for (kmh kmh : hashSet5) {
            if (!a.a(kmh.b)) {
                a.a(kmh);
            }
        }
        for (String str : hashSet) {
            if (!a.a(str) && !hashSet2.contains(str)) {
                b(e, str);
            }
        }
        for (Pair pair : hashSet3) {
            String str2 = (String) pair.first;
            String str3 = (String) pair.second;
            if (!kkk.a(str2)) {
                a(e, str3, str2);
            }
        }
    }

    public final boolean a(khq khq, kkx kkx) {
        throw new IllegalStateException("Method not supported in a transaction drive model");
    }
}
