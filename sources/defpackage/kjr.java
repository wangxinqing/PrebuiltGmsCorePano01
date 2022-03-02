package defpackage;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteConstraintException;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kjr extends kjp implements kkf {
    public static final ith c = new ith("DatabaseModelLoader", "");
    private final kla d = new kla();

    public kjr(kkb kkb, Executor executor) {
        super(kkb, executor);
        kkb kkb2 = this.a;
        kjw kjw = new kjw(kkb2);
        if (kkb2.c.compareAndSet((Object) null, kjw)) {
            new kjy("Open database in background", kjw).start();
        }
    }

    public static String a(Collection collection, String str) {
        if (collection == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!z) {
                sb.append(str);
            }
            sb.append(DatabaseUtils.sqlEscapeString(str2));
            z = false;
        }
        return sb.toString();
    }

    private static final boolean b(kmp kmp, String str) {
        return kmp.x() && kmp.P().equals(str) && kmp.aj().equals(anax.a((Object) DriveSpace.a)) && kmp.B();
    }

    public static final String d(khq khq) {
        return !khq.d() ? "MetadataView" : "ScopedMetadataView";
    }

    private final long h(String str) {
        Cursor a = this.a.a(str, (String[]) null, (kqy) null, (String) null);
        try {
            if (a.moveToFirst() && !a.isNull(0)) {
                return a.getLong(0);
            }
            a.close();
            return 0;
        } finally {
            a.close();
        }
    }

    /* access modifiers changed from: protected */
    public final kkh a() {
        return null;
    }

    public final Set e(kkz kkz) {
        return a(kkz, true);
    }

    public final kmd f(long j) {
        kqy e = kmg.a.a.e(j);
        kkb kkb = this.a;
        Cursor a = kkb.a(kmg.a.b(), (String[]) null, e, (String) null);
        try {
            if (a.moveToFirst()) {
                return kmd.a(kkb, a);
            }
            throw new AssertionError("Drive App row must exist due to foreign key constraint");
        } finally {
            a.close();
        }
    }

    public final khq g(long j) {
        return a(kli.a.a.e(j), true);
    }

    public final long i() {
        return h("InternalCachedContentSizeView");
    }

    public final long j() {
        return h("SharedCachedContentSizeView");
    }

    public final kky k() {
        return a("SharedCachedContentView", kqz.a);
    }

    private final void c(long j, String str) {
        kqy e = koc.ACCOUNT_ID.g.e(j);
        kqy b = koc.FEED_TYPE.g.b(lcr.APPDATA.f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
        sb.append("%");
        sb.append(str);
        sb.append("%");
        String sb2 = sb.toString();
        kqh kqh = koc.FEED_PARAMETERS.g;
        kqh.b(2);
        this.a.a(kod.a, kqz.a(e, b, kqz.g(kqh.a(), sb2)));
    }

    public final Set b(khq khq, kmp kmp) {
        String str;
        if (khq.a()) {
            return Collections.emptySet();
        }
        String a = kmk.a.a.a();
        kqy e = kny.CHILD_ENTRY_ID.c.e(kmp.h());
        kqy a2 = kqz.a(e, lrr.a(khq));
        if (!khq.d()) {
            str = "ParentEntryView";
        } else {
            str = "ScopedParentEntryView";
        }
        String str2 = a2.a;
        int length = String.valueOf(a).length();
        int length2 = String.valueOf(a).length();
        StringBuilder sb = new StringBuilder(length + 30 + length2 + str.length() + String.valueOf(str2).length());
        sb.append(a);
        sb.append(" NOT IN (SELECT ");
        sb.append(a);
        sb.append(" FROM ");
        sb.append(str);
        sb.append(" WHERE ");
        sb.append(str2);
        sb.append(")");
        Set a3 = a("ParentEntryView", true, kqz.a(e, kqz.a(sb.toString(), (List) a2.b), kne.IS_DELETED.aB.c()));
        StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 32 + String.valueOf(a).length());
        sb2.append(a);
        sb2.append(" NOT IN (SELECT ");
        sb2.append(a);
        sb2.append(" FROM EntryView)");
        return iko.a(a3, a("ParentDriveIdView", false, kqz.a(kqz.a(sb2.toString()), e)));
    }

    public final Set d(kkz kkz) {
        return a(kkz, false);
    }

    public final kmd e(kkz kkz, String str) {
        kqy a = kqz.a(kmf.ACCOUNT_ID.h.e(kkz.b), kmf.SDK_APP_ID.h.b(str));
        kkb kkb = this.a;
        Cursor a2 = kkb.a(kmg.a.b(), (String[]) null, a, (String) null);
        try {
            if (a2.moveToFirst()) {
                return kmd.a(kkb, a2);
            }
            a2.close();
            return null;
        } finally {
            a2.close();
        }
    }

    public final void g() {
        iva.b(b());
        kkb kkb = this.a;
        Cursor a = kkb.a(kmg.a.b(), (String[]) null, kqz.a(String.format("%s NOT IN (SELECT DISTINCT %s FROM %s)", new Object[]{kmg.a.a.a(), klh.DRIVE_APP_ID.j.a(), kli.a.b()})), (String) null);
        while (a.moveToNext()) {
            try {
                kmd a2 = kmd.a(kkb, a);
                c(a2.a, a2.b);
                a2.u();
            } finally {
                a.close();
            }
        }
    }

    public final Set i(long j) {
        kkb kkb = this.a;
        ArrayList arrayList = new ArrayList();
        for (knu knu : knu.values()) {
            if (knu.N) {
                arrayList.add(knu.O.e(j));
            }
        }
        Cursor a = kkb.a(knv.a.b(), (String[]) null, kqz.b((List) arrayList), (String) null);
        try {
            HashSet hashSet = new HashSet(a.getCount());
            while (a.moveToNext()) {
                hashSet.add(knl.a((kqg) kkb, a));
            }
            return hashSet;
        } finally {
            a.close();
        }
    }

    public final kmh d(long j) {
        kmh kmh = null;
        Cursor a = this.a.a(kmk.a.b(), (String[]) null, kmk.a.a.e(j), (String) null);
        try {
            if (a.moveToFirst()) {
                kmh = kmh.a(this.a, a);
            }
            return kmh;
        } finally {
            a.close();
        }
    }

    private final Set a(kkz kkz, boolean z) {
        kkb kkb = this.a;
        HashSet hashSet = new HashSet();
        kqy a = kqz.a(kmf.ACCOUNT_ID.h.e(kkz.b), kmf.IS_APPDATA_ROOT_PLACEHOLDER.h.a(z));
        kqh kqh = kmf.SDK_APP_ID.h;
        Cursor a2 = kkb.a(kmg.a.b(), new String[]{kqh.a()}, a, (String) null);
        while (a2.moveToNext()) {
            try {
                hashSet.add(kqh.a(a2));
            } finally {
                a2.close();
            }
        }
        return hashSet;
    }

    public final long h() {
        return h("InternalContentSizeView");
    }

    public final kov h(long j) {
        kkb kkb = this.a;
        Cursor a = kkb.a(kpc.a.b(), (String[]) null, kpc.a.a.e(j), (String) null);
        try {
            if (a.moveToFirst()) {
                return kov.a(kkb, a);
            }
            a.close();
            return null;
        } finally {
            a.close();
        }
    }

    public final long c(kkz kkz) {
        kqh kqh = kne.SEQUENCE_NUMBER.aB;
        kqy b = lrr.b(kkz.b);
        Cursor a = this.a.a("EntryView", new String[]{kqh.a()}, b, String.valueOf(kqh.a()).concat(" DESC"), "1");
        try {
            if (a.moveToFirst()) {
                return a.getLong(0);
            }
            a.close();
            return 0;
        } finally {
            a.close();
        }
    }

    public final synchronized kmp d(kkz kkz, String str) {
        iva.c(str);
        kmp c2 = c(kkz, "root");
        if (c2 != null && b(c2, str)) {
            return c2;
        }
        d();
        try {
            kmp c3 = c(kkz, "root");
            if (c3 == null) {
                c3 = a(kkz, "application/vnd.google-apps.folder", "root");
            }
            if (!b(c3, str)) {
                c3.a(str);
                c3.k(true);
                c3.l(false);
                c3.a(true);
                c3.m(false);
            }
            f();
            return c3;
        } finally {
            e();
        }
    }

    public final void f() {
        this.a.f();
    }

    public final kor e(long j) {
        return (kor) kjp.b(a(this.a.a(kou.a.b(), (String[]) null, kou.a.a.e(j), (String) null), (kkp) kkt.a));
    }

    public final void f(String str) {
        this.a.a(klv.a, klu.FILENAME.b.b(str));
    }

    /* JADX INFO: finally extract failed */
    public final boolean g(String str) {
        Cursor a = this.a.a("CannotDeleteFilenameView", (String[]) null, kqz.a("filename", str), (String) null);
        try {
            boolean moveToFirst = a.moveToFirst();
            a.close();
            return !moveToFirst;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    public final void e() {
        this.a.d();
    }

    /* JADX INFO: finally extract failed */
    private final khq a(kqy kqy, boolean z) {
        kkb kkb = this.a;
        ArrayList arrayList = new ArrayList();
        Cursor a = kkb.a("AndroidAppView", (String[]) null, kqy, (String) null);
        while (a.moveToNext()) {
            try {
                kmd a2 = kmd.a(kkb, a);
                arrayList.add(new khq(c(a2.a), a2.b, klf.a(kkb, a).b, a2.c, Collections.unmodifiableSet(a2.f)));
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        }
        a.close();
        if (arrayList.size() == 0) {
            return null;
        }
        if (!z || arrayList.size() <= 1) {
            return (khq) arrayList.get(0);
        }
        String valueOf = String.valueOf(arrayList);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
        sb.append("Multiple apps present when expecting a single app: ");
        sb.append(valueOf);
        throw new AssertionError(sb.toString());
    }

    /* JADX INFO: finally extract failed */
    public final kkz c(long j) {
        klb klb;
        kkz kkz = (kkz) this.d.b.get(Long.valueOf(j));
        if (kkz != null) {
            return kkz;
        }
        kkb kkb = this.a;
        Cursor a = kkb.a(kle.a.b(), (String[]) null, kle.a.a.e(j), (String) null);
        try {
            if (!a.moveToFirst()) {
                a.close();
                klb = null;
            } else {
                klb = klb.a(kkb, a);
                a.close();
            }
            if (klb == null) {
                return null;
            }
            kkz kkz2 = new kkz(klb.f, klb.m);
            this.d.a(kkz2);
            return kkz2;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    public final void e(String str) {
        try {
            new kls(this.a, str).t();
        } catch (SQLiteConstraintException e) {
        }
    }

    public final khq b(long j, AppIdentity appIdentity) {
        return a(lrr.a(j, appIdentity), true);
    }

    public final knh d(String str) {
        return (knh) kjp.b(a(knk.a.b(), knj.CONTENT_HASH.k.b(str)));
    }

    public final klb b(String str) {
        klb a = a(str);
        if (a != null) {
            return a;
        }
        AtomicReference atomicReference = new AtomicReference();
        a((Runnable) new kjq(this, str, atomicReference));
        return (klb) atomicReference.get();
    }

    public final void d() {
        this.a.b();
    }

    public final klf b(khq khq) {
        return a(khq.a.b, khq.c);
    }

    public final kmp b(khq khq, String str, String str2, boolean z) {
        return a(khq, "EntryView", "ScopedEntryView", kqz.a(lrr.a(khq.a.b, str, str2, z), kne.IS_DELETED.aB.c()));
    }

    public final kkz c(String str) {
        kkz kkz = (kkz) this.d.a.get(str);
        if (kkz != null) {
            return kkz;
        }
        kkz kkz2 = new kkz(str, b(str).m);
        this.d.a(kkz2);
        return kkz2;
    }

    public final kmd c(khq khq) {
        return e(khq.a, khq.b);
    }

    public final koa b(kkz kkz) {
        List a = a(kkz, lcr.PHOTOS);
        if (a.isEmpty()) {
            return null;
        }
        if (a.size() > 1) {
            c.c("DatabaseModelLoader", "More than 1 photos feed found for an account");
        }
        return (koa) a.get(0);
    }

    public final kmp c(khq khq, String str, String str2, boolean z) {
        return (kmp) kjp.a(a(khq, "EntryView", "ScopedEntryView", lrr.a(khq.a.b, str, str2, z), String.valueOf(kmk.a.a.a()).concat(" DESC")));
    }

    public final void b(long j, String str) {
        kkb kkb = this.a;
        kkb.b();
        try {
            c(j, str);
            this.a.a(kmg.a, kqz.a(kmf.ACCOUNT_ID.h.e(j), kmf.SDK_APP_ID.h.b(str)));
            kkb.f();
        } finally {
            kkb.d();
        }
    }

    private final boolean a(DriveId driveId) {
        return driveId.c == this.a.g() && driveId.b > 0;
    }

    public final String a(kkz kkz, DriveId driveId) {
        boolean z;
        kmh d2;
        if (driveId.a == null) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "This DriveId already has a resource ID. What are you asking me for?");
        if (!a(driveId) || (d2 = d(driveId.b)) == null || d2.a != kkz.b) {
            return null;
        }
        return d2.b;
    }

    public final String a(kmp kmp, boolean z) {
        kon kon;
        kkb kkb = this.a;
        Cursor a = kkb.a(koq.a.b(), (String[]) null, kop.ENTRY_ID.d.e(kmp.h()), String.valueOf(kop.ACTION_ID.d.a()).concat(" DESC"), "1");
        try {
            if (a.moveToFirst()) {
                int i = kon.b;
                String a2 = kop.CONTENT_HASH.d.a(a);
                long longValue = kop.ENTRY_ID.d.b(a).longValue();
                kkb kkb2 = kkb;
                kon = new kon(kkb2, koq.a.a.b(a).longValue(), a2, knc.a(longValue), kop.ACTION_ID.d.b(a).longValue());
            } else {
                a.close();
                kon = null;
            }
            if (kon != null) {
                return kon.a;
            }
            List d2 = d(kmp.b());
            if (!d2.isEmpty()) {
                kpu kpu = (kpu) d2.get(0);
                if (z || kmp.ae() == kpu.b) {
                    return kpu.a;
                }
            }
            return null;
        } finally {
            a.close();
        }
    }

    public final void b(long j, knc knc, int i) {
        this.a.a(kpn.a, lrr.a(j, knc, i));
    }

    public final void b(khq khq, String str) {
        kkb kkb;
        kkb kkb2;
        boolean z;
        boolean z2;
        boolean z3;
        kmd kmd;
        khq khq2 = khq;
        String str2 = str;
        kkb kkb3 = this.a;
        kkb3.b();
        try {
            klf a = a(khq2.a.b, khq2.c);
            kmd kmd2 = null;
            if (a != null) {
                kmd f = f(a.a);
                if (!f.b.equals(khq2.b)) {
                    c.b("Existing androidAppRow has different sdkAppId (%s vs %s)", f.b, khq2.b);
                    a.u();
                    g();
                    a = null;
                } else {
                    c.b("AndroidApp entry already exists, simply updating it");
                    f.c = khq2.d;
                    f.a(khq2.e);
                    f.t();
                    kmd2 = f;
                }
            }
            if (a == null) {
                kmd c2 = c(khq);
                if (c2 != null) {
                    c2.c = khq2.d;
                    c2.a(khq2.e);
                    c2.t();
                    kmd = c2;
                    kkb = kkb3;
                } else {
                    c.b("No matching driveApp entry, inserting a new one");
                    kkb = kkb3;
                    try {
                        kmd kmd3 = new kmd(kkb3, -1, khq2.a.b, khq2.b, khq2.d, (Long) null, (Boolean) null, khq2.e);
                        kmd3.t();
                        kmd = kmd3;
                    } catch (Throwable th) {
                        th = th;
                        kkb.d();
                        throw th;
                    }
                }
                c.b("No matching androidApp entry, inserting a new one");
                new klf(kkb, -1, kmd.m, khq2.c, 1, PSKKeyManager.MAX_KEY_LENGTH_BYTES, true).t();
                kmd2 = kmd;
            } else {
                kkb = kkb3;
            }
            if (khq2.e.contains(jzl.APPDATA)) {
                if (kmd2.d == null) {
                    if (str2 != null) {
                        kkz kkz = khq2.a;
                        kkb2 = this.a;
                        if (kkz.b >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        iva.b(z, "Not persisted: %s", kkz);
                        iva.a((Object) kmd2);
                        if (kmd2.m >= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        iva.b(z2, "Not persisted: %s", kmd2);
                        if (kmd2.d == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        iva.a(z3, (Object) "App data root already exist");
                        kkb2.b();
                        kmp c3 = c(kkz, str2);
                        if (c3 == null) {
                            c3 = a(kkz, "application/vnd.google-apps.folder", str2);
                        }
                        if (c3.B()) {
                            if (kmd2.b.equals(c3.z())) {
                                kmd2.d = Long.valueOf(c3.h());
                                kmd2.b();
                                kmd2.t();
                                kkb2.f();
                                kkb2.d();
                            }
                        }
                        c3.a(true);
                        c3.e(kmd2.b);
                        c3.m(false);
                        kmd2.d = Long.valueOf(c3.h());
                        kmd2.b();
                        kmd2.t();
                        kkb2.f();
                        kkb2.d();
                    } else {
                        throw new IllegalArgumentException("Tried to create appData folder, but received null appDataRootResourceId.");
                    }
                }
            }
            kkb.f();
            kkb.d();
        } catch (Throwable th2) {
            th = th2;
            kkb = kkb3;
            kkb.d();
            throw th;
        }
    }

    public final List a(kkz kkz, lcr lcr) {
        boolean z;
        if (kkz.b >= 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Not persisted: %s", kkz);
        iva.a((Object) lcr);
        kkb kkb = this.a;
        Cursor a = kkb.a(kod.a.b(), (String[]) null, kqz.a(koc.FEED_TYPE.g.b(lcr.f), koc.ACCOUNT_ID.g.e(kkz.b)), (String) null);
        ArrayList arrayList = new ArrayList();
        while (a.moveToNext()) {
            try {
                arrayList.add(koa.a((kqg) kkb, a));
            } finally {
                a.close();
            }
        }
        return arrayList;
    }

    public final khq a(long j, String str) {
        return a(kqz.a(kmf.ACCOUNT_ID.h.e(j), kmf.SDK_APP_ID.h.b(str)), false);
    }

    public final kky a(int i) {
        return a(this.a.a(kpn.a.b(), (String[]) null, kpm.EVENT_TYPE.i.e((long) i), (String) null), (kkp) kpj.a);
    }

    public final kky a(String str, kqy kqy) {
        return a(this.a.a(str, (String[]) null, kqy, (String) null), (kkp) kks.a);
    }

    public final kky a(khq khq, Set set, kqy kqy) {
        return a(khq, "EntryView", "ScopedEntryView", kqz.a(kqy, lrr.a(set)), (String) null);
    }

    public final kky a(kkz kkz, long j) {
        return a(khq.a(kkz), "EntryView", "ScopedEntryView", kqz.b(kne.IS_DELETED_ACTION_ID.aB.e(j), kne.LAST_CONTENT_ACTION_ID.aB.e(j)), (String) null);
    }

    public final void b(kqi kqi) {
        kqi.u();
    }

    public final kky a(kkz kkz, long j, long j2) {
        return a(khq.a(kkz), "EntryView", "ScopedEntryView", kqz.a(lrr.a(), kne.IS_DELETED.aB.c(), lrr.a(kne.UNSUBSCRIBED_ON_SERVER_TIME.aB, j, j2)), (String) null);
    }

    /* access modifiers changed from: package-private */
    public final klf a(long j, AppIdentity appIdentity) {
        kkb kkb = this.a;
        kqy a = lrr.a(j, appIdentity);
        klf klf = null;
        Cursor a2 = kkb.a("AndroidAppView", (String[]) null, a, (String) null);
        try {
            if (a2.moveToNext()) {
                klf = klf.a(kkb, a2);
            }
            return klf;
        } finally {
            a2.close();
        }
    }

    public final kmp a(khq khq) {
        Long l;
        iva.b(!khq.a());
        if (khq.e.contains(jzl.APPDATA)) {
            if (axdv.a.a().a()) {
                kmd c2 = c(khq);
                if (c2 != null) {
                    l = c2.d;
                    if (l == null) {
                        throw new eif("App data root does not exist.");
                    }
                } else {
                    throw new eif("App does not exist.");
                }
            } else {
                kmd c3 = c(khq);
                iva.a((Object) c3, (Object) "App does not exist.");
                l = c3.d;
                iva.a((Object) l, (Object) "App data root does not exist.");
            }
            try {
                return a(khq, knc.a(l.longValue()));
            } catch (kcs e) {
                throw new eif((Throwable) e);
            }
        } else {
            throw new eif("App does not have APPDATA scope.");
        }
    }

    public final kmp a(khq khq, DriveId driveId) {
        if (a(driveId)) {
            try {
                return a(khq, knc.a(driveId.b));
            } catch (kcs e) {
            }
        }
        String str = driveId.a;
        if (str != null) {
            return a(khq, str);
        }
        throw new ktv();
    }

    public final kmp a(khq khq, String str) {
        kmp kmp;
        if ("appdata".equals(str)) {
            try {
                kmp = a(khq);
            } catch (eif e) {
                throw new kcs(knc.a(khq.a.b));
            }
        } else {
            kmp = a(khq, "EntryView", "ScopedEntryView", lrr.a(khq.a.b, str));
        }
        if (kmp != null) {
            return kmp;
        }
        throw new kcs(knc.a(khq.a.b));
    }

    public final kmp a(khq khq, knc knc) {
        kmp a = a(khq, "EntryView", "ScopedEntryView", lrr.a(khq.a.b, knc.a));
        if (a != null) {
            return a;
        }
        throw new kcs(knc);
    }

    public final kmu a(kmp kmp, String str) {
        kqy kqy;
        kqy e = kmw.ENTRY_ID.m.e(kmp.h());
        if (str != null) {
            kqy = kmw.ACCOUNT_IDENTIFIER.m.b(str);
        } else {
            kqy = kmw.ACCOUNT_IDENTIFIER.m.e();
        }
        boolean z = true;
        List a = a(kqz.a(e, kqy));
        if (a.isEmpty()) {
            return null;
        }
        if (a.size() != 1) {
            z = false;
        }
        iva.a(z);
        return (kmu) a.get(0);
    }

    public final knl a(kmp kmp) {
        boolean z = true;
        iva.b(!kmp.ag(), "Entry has genoa values already");
        if (kmp.h() < 0) {
            z = false;
        }
        iva.b(z, "Entry is not persisted");
        knl knl = new knl((kqg) this.a, kmp.a(), -1);
        knl.t();
        return knl;
    }

    public final koa a(kkz kkz, lcp lcp, long j) {
        koa a;
        kkz kkz2 = kkz;
        iva.b(kkz2.b >= 0, "Not persisted: %s", kkz2);
        iva.a((Object) lcp);
        kkb kkb = this.a;
        Cursor a2 = kkb.a(kod.a.b(), (String[]) null, kqz.a(koc.FEED_TYPE.g.b(lcp.c.f), koc.FEED_PARAMETERS.g.b(lcp.a()), koc.ACCOUNT_ID.g.e(kkz2.b)), (String) null);
        try {
            if (!a2.moveToFirst()) {
                a = new koa(kkb, -1, kkz2.b, lcp, (String) null, Long.valueOf(j), 0);
            } else {
                a = koa.a((kqg) kkb, a2);
            }
            return a;
        } finally {
            a2.close();
        }
    }

    public final kor a(String str, String str2, long j, knc knc) {
        kor kor = new kor(this.a, -1, str, str2, Long.valueOf(j), knc, (String) null);
        kor.t();
        return kor;
    }

    public final kpk a(long j, knc knc, int i) {
        return (kpk) kjp.b(a(this.a.a(kpn.a.b(), (String[]) null, lrr.a(j, knc, i), (String) null), (kkp) kpj.a));
    }

    public final lrw a(khq khq, Set set, kqy kqy, String str, Set set2, boolean z, boolean z2, List list, boolean z3) {
        String str2;
        List list2 = list;
        if (str != null && !str.isEmpty()) {
            str2 = str;
        } else {
            String concat = String.valueOf(kne.LAST_MODIFIED_DATE.aB.a()).concat(" DESC");
            if (list2 == null || list.isEmpty()) {
                str2 = concat;
            } else {
                iva.a((Object) list);
                iva.a(!list.isEmpty());
                StringBuilder sb = new StringBuilder();
                sb.append("CASE ");
                sb.append(kmj.RESOURCE_ID.c.a());
                for (int i = 0; i < list.size(); i++) {
                    sb.append(" WHEN ");
                    DatabaseUtils.appendEscapedSQLString(sb, (String) list2.get(i));
                    sb.append(" THEN ");
                    sb.append(i);
                }
                sb.append(" ELSE ");
                sb.append(list.size());
                sb.append(" END");
                str2 = sb.toString() + ',' + concat;
            }
        }
        c.a("Entry sorting clause for query %s", str2);
        return a(khq, set, kqy, str2, set2, z, z3, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0090, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0094, code lost:
        if (r25 != false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r12 = r0.b;
        r13 = r1.getColumnIndexOrThrow("sqlId");
        r5 = r1.getColumnIndexOrThrow("hasCustomProperties");
        r14 = new android.util.SparseArray();
        r1.moveToFirst();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ae, code lost:
        if (r1.isAfterLast() == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b0, code lost:
        r1.moveToFirst();
        r10.putSparseParcelableArray("customPropertiesExtra", r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00be, code lost:
        if (r1.getLong(r5) == r2) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c0, code lost:
        r15 = a(defpackage.kkx.a(r1.getLong(r13)), r12, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d0, code lost:
        if (r15.size() <= 0) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d2, code lost:
        r9 = new defpackage.lbh();
        r15 = r15.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00df, code lost:
        if (r15.hasNext() != false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e1, code lost:
        r14.put(r1.getPosition(), r9.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ed, code lost:
        r16 = (defpackage.krl) r15.next();
        r3 = r16.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fd, code lost:
        if (r16.f() != null) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ff, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0101, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0102, code lost:
        r9.a(new com.google.android.gms.drive.metadata.internal.CustomProperty(new com.google.android.gms.drive.metadata.CustomPropertyKey(r3, r11), r16.e()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0114, code lost:
        r1.moveToNext();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011b, code lost:
        r3 = r0.b;
        r6 = r1.getColumnIndexOrThrow("sqlId");
        r5 = r1.getColumnIndexOrThrow("hasCustomProperties");
        r9 = new java.util.ArrayList();
        r1.moveToFirst();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0133, code lost:
        if (r1.isAfterLast() == false) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0135, code lost:
        r1.moveToFirst();
        r3 = defpackage.lrr.a((java.util.List) r9, r3, false);
        r6 = r7.a;
        r8 = defpackage.krc.a(defpackage.klz.a.b());
        r8.a((defpackage.lsb) defpackage.kly.a);
        r8.a((defpackage.lsb) defpackage.kly.c);
        r8.a((defpackage.lsb) defpackage.kly.e);
        r8.a(java.lang.String.valueOf(defpackage.kly.b.h.a()).concat(" IS NOT NULL"), "visibility");
        r8.b(r3.a);
        r3 = r6.b(r8.a(), r3.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r6 = defpackage.kly.a.h.a();
        r8 = defpackage.kly.c.h.a();
        r9 = defpackage.kly.e.h.a();
        r3.getColumnIndexOrThrow(r6);
        r3.getColumnIndexOrThrow(r8);
        r3.getColumnIndexOrThrow("visibility");
        r3.getColumnIndexOrThrow(r9);
        r11 = new android.os.Bundle();
        r11.putString("entryIdColumn", r6);
        r11.putString("keyColumn", r8);
        r11.putString("visibilityColumn", "visibility");
        r11.putString("valueColumn", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r10.putParcelable("customPropertiesExtraHolder", new com.google.android.gms.common.data.DataHolder(r3, r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0261, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0265, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x027d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x027e, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0282, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0283, code lost:
        r11 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x028e, code lost:
        if (r1.getLong(r5) == 0) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0290, code lost:
        r9.add(java.lang.Long.valueOf(r1.getLong(r6)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x029b, code lost:
        r1.moveToNext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02a0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.lrw a(defpackage.khq r19, java.util.Set r20, defpackage.kqy r21, java.lang.String r22, java.util.Set r23, boolean r24, boolean r25, boolean r26) {
        /*
            r18 = this;
            r7 = r18
            r0 = r19
            r1 = 4
            kqy[] r1 = new defpackage.kqy[r1]
            r8 = 0
            r1[r8] = r21
            kqy r2 = defpackage.lrr.a((defpackage.khq) r19)
            r9 = 1
            r1[r9] = r2
            kqy r2 = defpackage.lrr.a((java.util.Set) r20)
            r3 = 2
            r1[r3] = r2
            kne r2 = defpackage.kne.IS_DELETED
            kqh r2 = r2.aB
            kqy r2 = r2.c()
            r4 = 3
            r1[r4] = r2
            kqy r1 = defpackage.kqz.a((defpackage.kqy[]) r1)
            if (r26 != 0) goto L_0x003d
            kqy[] r2 = new defpackage.kqy[r3]
            r2[r8] = r1
            kne r1 = defpackage.kne.SUBSCRIBED
            kqh r1 = r1.aB
            kqy r1 = r1.f()
            r2[r9] = r1
            kqy r1 = defpackage.kqz.a((defpackage.kqy[]) r2)
            r4 = r1
            goto L_0x003e
        L_0x003d:
            r4 = r1
        L_0x003e:
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            int r1 = r23.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r23
            java.lang.Object[] r1 = r2.toArray(r1)
            r6 = r1
            java.lang.String[] r6 = (java.lang.String[]) r6
            r18.d()
            java.lang.String r1 = "dbInstanceId"
            kkb r2 = r7.a     // Catch:{ all -> 0x02a6 }
            long r2 = r2.g()     // Catch:{ all -> 0x02a6 }
            r10.putLong(r1, r2)     // Catch:{ all -> 0x02a6 }
            kkz r2 = r0.a     // Catch:{ all -> 0x02a6 }
            java.lang.String r3 = d((defpackage.khq) r19)     // Catch:{ all -> 0x02a6 }
            r1 = r18
            r5 = r22
            android.database.Cursor r1 = r1.a((defpackage.kkz) r2, (java.lang.String) r3, (defpackage.kqy) r4, (java.lang.String) r5, (java.lang.String[]) r6)     // Catch:{ all -> 0x02a6 }
            r1.getCount()     // Catch:{ all -> 0x02a2 }
            lcg r2 = defpackage.lce.L     // Catch:{ all -> 0x02a2 }
            java.util.Set r2 = r2.b     // Catch:{ all -> 0x02a2 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x02a2 }
        L_0x0079:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x02a2 }
            java.lang.String r4 = "sqlId"
            if (r3 == 0) goto L_0x0090
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x02a2 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x02a2 }
            int r3 = r1.getColumnIndex(r3)     // Catch:{ all -> 0x02a2 }
            r5 = -1
            if (r3 != r5) goto L_0x0079
            goto L_0x01c4
        L_0x0090:
            r2 = 0
            java.lang.String r5 = "hasCustomProperties"
            if (r25 != 0) goto L_0x011b
            java.lang.String r6 = "customPropertiesExtra"
            java.lang.String r12 = r0.b     // Catch:{ all -> 0x02a2 }
            int r13 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x02a2 }
            int r5 = r1.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x02a2 }
            android.util.SparseArray r14 = new android.util.SparseArray     // Catch:{ all -> 0x02a2 }
            r14.<init>()     // Catch:{ all -> 0x02a2 }
            r1.moveToFirst()     // Catch:{ all -> 0x02a2 }
        L_0x00aa:
            boolean r15 = r1.isAfterLast()     // Catch:{ all -> 0x02a2 }
            if (r15 == 0) goto L_0x00b8
            r1.moveToFirst()     // Catch:{ all -> 0x02a2 }
            r10.putSparseParcelableArray(r6, r14)     // Catch:{ all -> 0x02a2 }
            goto L_0x01c4
        L_0x00b8:
            long r15 = r1.getLong(r5)     // Catch:{ all -> 0x02a2 }
            int r17 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r17 == 0) goto L_0x0114
            long r15 = r1.getLong(r13)     // Catch:{ all -> 0x02a2 }
            kkx r15 = defpackage.kkx.a(r15)     // Catch:{ all -> 0x02a2 }
            java.util.List r15 = r7.a((defpackage.kkx) r15, (java.lang.String) r12, (boolean) r8)     // Catch:{ all -> 0x02a2 }
            int r16 = r15.size()     // Catch:{ all -> 0x02a2 }
            if (r16 <= 0) goto L_0x0114
            lbh r9 = new lbh     // Catch:{ all -> 0x02a2 }
            r9.<init>()     // Catch:{ all -> 0x02a2 }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ all -> 0x02a2 }
        L_0x00db:
            boolean r16 = r15.hasNext()     // Catch:{ all -> 0x02a2 }
            if (r16 != 0) goto L_0x00ed
            int r15 = r1.getPosition()     // Catch:{ all -> 0x02a2 }
            com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties r9 = r9.a()     // Catch:{ all -> 0x02a2 }
            r14.put(r15, r9)     // Catch:{ all -> 0x02a2 }
            goto L_0x0114
        L_0x00ed:
            java.lang.Object r16 = r15.next()     // Catch:{ all -> 0x02a2 }
            krl r16 = (defpackage.krl) r16     // Catch:{ all -> 0x02a2 }
            com.google.android.gms.drive.metadata.CustomPropertyKey r2 = new com.google.android.gms.drive.metadata.CustomPropertyKey     // Catch:{ all -> 0x02a2 }
            java.lang.String r3 = r16.d()     // Catch:{ all -> 0x02a2 }
            java.lang.String r17 = r16.f()     // Catch:{ all -> 0x02a2 }
            if (r17 != 0) goto L_0x0101
            r11 = 0
            goto L_0x0102
        L_0x0101:
            r11 = 1
        L_0x0102:
            r2.<init>(r3, r11)     // Catch:{ all -> 0x02a2 }
            com.google.android.gms.drive.metadata.internal.CustomProperty r3 = new com.google.android.gms.drive.metadata.internal.CustomProperty     // Catch:{ all -> 0x02a2 }
            java.lang.String r11 = r16.e()     // Catch:{ all -> 0x02a2 }
            r3.<init>(r2, r11)     // Catch:{ all -> 0x02a2 }
            r9.a((com.google.android.gms.drive.metadata.internal.CustomProperty) r3)     // Catch:{ all -> 0x02a2 }
            r2 = 0
            goto L_0x00db
        L_0x0114:
            r1.moveToNext()     // Catch:{ all -> 0x02a2 }
            r2 = 0
            r9 = 1
            goto L_0x00aa
        L_0x011b:
            java.lang.String r2 = "customPropertiesExtraHolder"
            java.lang.String r3 = r0.b     // Catch:{ all -> 0x02a2 }
            int r6 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x02a2 }
            int r5 = r1.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x02a2 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x02a2 }
            r9.<init>()     // Catch:{ all -> 0x02a2 }
            r1.moveToFirst()     // Catch:{ all -> 0x02a2 }
        L_0x012f:
            boolean r11 = r1.isAfterLast()     // Catch:{ all -> 0x02a2 }
            if (r11 == 0) goto L_0x0283
            r1.moveToFirst()     // Catch:{ all -> 0x02a2 }
            kqy r3 = defpackage.lrr.a((java.util.List) r9, (java.lang.String) r3, (boolean) r8)     // Catch:{ all -> 0x02a2 }
            java.lang.String r5 = "visibility"
            kkb r6 = r7.a     // Catch:{ all -> 0x02a2 }
            kql r8 = defpackage.klz.a     // Catch:{ all -> 0x02a2 }
            java.lang.String r8 = r8.b()     // Catch:{ all -> 0x02a2 }
            krc r8 = defpackage.krc.a((java.lang.String) r8)     // Catch:{ all -> 0x02a2 }
            kly r9 = defpackage.kly.ENTRY_ID     // Catch:{ all -> 0x02a2 }
            r8.a((defpackage.lsb) r9)     // Catch:{ all -> 0x02a2 }
            kly r9 = defpackage.kly.NAME     // Catch:{ all -> 0x02a2 }
            r8.a((defpackage.lsb) r9)     // Catch:{ all -> 0x02a2 }
            kly r9 = defpackage.kly.VALUE     // Catch:{ all -> 0x02a2 }
            r8.a((defpackage.lsb) r9)     // Catch:{ all -> 0x02a2 }
            kly r9 = defpackage.kly.SDK_APP_ID     // Catch:{ all -> 0x02a2 }
            kqh r9 = r9.h     // Catch:{ all -> 0x02a2 }
            java.lang.String r9 = r9.a()     // Catch:{ all -> 0x02a2 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x02a2 }
            java.lang.String r11 = " IS NOT NULL"
            java.lang.String r9 = r9.concat(r11)     // Catch:{ all -> 0x02a2 }
            r8.a((java.lang.String) r9, (java.lang.String) r5)     // Catch:{ all -> 0x02a2 }
            java.lang.String r9 = r3.a     // Catch:{ all -> 0x02a2 }
            r8.b(r9)     // Catch:{ all -> 0x02a2 }
            java.lang.String r8 = r8.a()     // Catch:{ all -> 0x02a2 }
            java.lang.String[] r3 = r3.a()     // Catch:{ all -> 0x02a2 }
            android.database.Cursor r3 = r6.b(r8, r3)     // Catch:{ all -> 0x02a2 }
            kly r6 = defpackage.kly.ENTRY_ID     // Catch:{ all -> 0x027d }
            kqh r6 = r6.h     // Catch:{ all -> 0x027d }
            java.lang.String r6 = r6.a()     // Catch:{ all -> 0x027d }
            kly r8 = defpackage.kly.NAME     // Catch:{ all -> 0x027d }
            kqh r8 = r8.h     // Catch:{ all -> 0x027d }
            java.lang.String r8 = r8.a()     // Catch:{ all -> 0x027d }
            kly r9 = defpackage.kly.VALUE     // Catch:{ all -> 0x027d }
            kqh r9 = r9.h     // Catch:{ all -> 0x027d }
            java.lang.String r9 = r9.a()     // Catch:{ all -> 0x027d }
            r3.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x027d }
            r3.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x027d }
            r3.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x027d }
            r3.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x027d }
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ all -> 0x027d }
            r11.<init>()     // Catch:{ all -> 0x027d }
            java.lang.String r12 = "entryIdColumn"
            r11.putString(r12, r6)     // Catch:{ all -> 0x027d }
            java.lang.String r6 = "keyColumn"
            r11.putString(r6, r8)     // Catch:{ all -> 0x027d }
            java.lang.String r6 = "visibilityColumn"
            r11.putString(r6, r5)     // Catch:{ all -> 0x027d }
            java.lang.String r5 = "valueColumn"
            r11.putString(r5, r9)     // Catch:{ all -> 0x027d }
            com.google.android.gms.common.data.DataHolder r5 = new com.google.android.gms.common.data.DataHolder     // Catch:{ all -> 0x027d }
            r5.<init>(r3, r11)     // Catch:{ all -> 0x027d }
            r10.putParcelable(r2, r5)     // Catch:{ all -> 0x02a2 }
        L_0x01c4:
            if (r24 == 0) goto L_0x0266
            boolean r0 = r19.c()     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x01cd
            goto L_0x01de
        L_0x01cd:
            com.google.android.gms.drive.DriveSpace r0 = com.google.android.gms.drive.DriveSpace.b     // Catch:{ all -> 0x02a2 }
            java.util.Set r0 = java.util.Collections.singleton(r0)     // Catch:{ all -> 0x02a2 }
            r11 = r20
            boolean r0 = r0.equals(r11)     // Catch:{ all -> 0x02a2 }
            if (r0 != 0) goto L_0x01de
            r11 = 0
            goto L_0x0268
        L_0x01de:
            int r0 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x02a2 }
            int r2 = r1.getCount()     // Catch:{ all -> 0x02a2 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x02a2 }
            r3.<init>(r2)     // Catch:{ all -> 0x02a2 }
            r1.moveToFirst()     // Catch:{ all -> 0x02a2 }
        L_0x01ef:
            boolean r2 = r1.isAfterLast()     // Catch:{ all -> 0x02a2 }
            if (r2 != 0) goto L_0x0204
            long r4 = r1.getLong(r0)     // Catch:{ all -> 0x02a2 }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x02a2 }
            r3.add(r2)     // Catch:{ all -> 0x02a2 }
            r1.moveToNext()     // Catch:{ all -> 0x02a2 }
            goto L_0x01ef
        L_0x0204:
            r1.moveToFirst()     // Catch:{ all -> 0x02a2 }
            kny r0 = defpackage.kny.CHILD_ENTRY_ID     // Catch:{ all -> 0x02a2 }
            kqh r0 = r0.c     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = r0.a()     // Catch:{ all -> 0x02a2 }
            kqy r0 = defpackage.lrr.a((java.lang.String) r0, (java.lang.Iterable) r3)     // Catch:{ all -> 0x02a2 }
            kkb r2 = r7.a     // Catch:{ all -> 0x02a2 }
            java.lang.String r3 = "ParentDriveIdView"
            r12 = 0
            android.database.Cursor r2 = r2.a((java.lang.String) r3, (java.lang.String[]) r12, (defpackage.kqy) r0, (java.lang.String) r12)     // Catch:{ all -> 0x02a0 }
            kny r0 = defpackage.kny.CHILD_ENTRY_ID     // Catch:{ all -> 0x0261 }
            kqh r0 = r0.c     // Catch:{ all -> 0x0261 }
            java.lang.String r0 = r0.a()     // Catch:{ all -> 0x0261 }
            kny r3 = defpackage.kny.PARENT_ENTRY_ID     // Catch:{ all -> 0x0261 }
            kqh r3 = r3.c     // Catch:{ all -> 0x0261 }
            java.lang.String r3 = r3.a()     // Catch:{ all -> 0x0261 }
            kmj r4 = defpackage.kmj.RESOURCE_ID     // Catch:{ all -> 0x0261 }
            kqh r4 = r4.c     // Catch:{ all -> 0x0261 }
            java.lang.String r4 = r4.a()     // Catch:{ all -> 0x0261 }
            r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0261 }
            r2.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0261 }
            r2.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0261 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x0261 }
            r5.<init>()     // Catch:{ all -> 0x0261 }
            java.lang.String r6 = "childSqlIdColumn"
            r5.putString(r6, r0)     // Catch:{ all -> 0x0261 }
            java.lang.String r0 = "parentSqlIdColumn"
            r5.putString(r0, r3)     // Catch:{ all -> 0x0261 }
            java.lang.String r0 = "parentResIdColumn"
            r5.putString(r0, r4)     // Catch:{ all -> 0x0261 }
            com.google.android.gms.common.data.DataHolder r3 = new com.google.android.gms.common.data.DataHolder     // Catch:{ all -> 0x0261 }
            r3.<init>(r2, r5)     // Catch:{ all -> 0x0261 }
            java.lang.String r0 = "parentsExtraHolder"
            r10.putParcelable(r0, r3)     // Catch:{ all -> 0x025d }
            r11 = r3
            goto L_0x0268
        L_0x025d:
            r0 = move-exception
            r11 = r1
            r12 = r3
            goto L_0x02a9
        L_0x0261:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x02a0 }
            throw r0     // Catch:{ all -> 0x02a0 }
        L_0x0266:
            r12 = 0
            r11 = r12
        L_0x0268:
            r18.f()     // Catch:{ all -> 0x0279 }
            r18.e()
            lrw r0 = new lrw
            com.google.android.gms.common.data.DataHolder r2 = new com.google.android.gms.common.data.DataHolder
            r2.<init>(r1, r10)
            r0.<init>(r2)
            return r0
        L_0x0279:
            r0 = move-exception
            r12 = r11
            r11 = r1
            goto L_0x02a9
        L_0x027d:
            r0 = move-exception
            r12 = 0
            r3.close()     // Catch:{ all -> 0x02a0 }
            throw r0     // Catch:{ all -> 0x02a0 }
        L_0x0283:
            r11 = r20
            r12 = 0
            long r13 = r1.getLong(r5)     // Catch:{ all -> 0x02a0 }
            r15 = 0
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x029b
            long r13 = r1.getLong(r6)     // Catch:{ all -> 0x02a0 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x02a0 }
            r9.add(r13)     // Catch:{ all -> 0x02a0 }
        L_0x029b:
            r1.moveToNext()     // Catch:{ all -> 0x02a0 }
            goto L_0x012f
        L_0x02a0:
            r0 = move-exception
            goto L_0x02a4
        L_0x02a2:
            r0 = move-exception
            r12 = 0
        L_0x02a4:
            r11 = r1
            goto L_0x02a9
        L_0x02a6:
            r0 = move-exception
            r12 = 0
            r11 = r12
        L_0x02a9:
            if (r11 == 0) goto L_0x02ae
            r11.close()
        L_0x02ae:
            if (r12 == 0) goto L_0x02b3
            r12.close()
        L_0x02b3:
            r18.e()
            goto L_0x02b8
        L_0x02b7:
            throw r0
        L_0x02b8:
            goto L_0x02b7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjr.a(khq, java.util.Set, kqy, java.lang.String, java.util.Set, boolean, boolean, boolean):lrw");
    }

    public final void a(Runnable runnable) {
        d();
        try {
            runnable.run();
            f();
        } finally {
            e();
        }
    }

    public final void a(Set set) {
        for (kmp kmp : a((kkz) null, "EntryView", kqz.b(kqz.a(String.format(Locale.US, "%s IN (%s)", new Object[]{kne.LOCAL_CONTENT_HASH.aB.a(), a((Collection) set, ",")})), kqz.a(String.format(Locale.US, "%s IN (%s)", new Object[]{kne.INSYNC_CONTENT_HASH.aB.a(), a((Collection) set, ",")}))), (String) null).a()) {
            if (set.contains(kmp.q())) {
                kmp.c((String) null, (String) null);
                kmp.aq();
            }
            if (set.contains(kmp.n())) {
                kmp.m();
            }
            kmp.m(true);
        }
    }

    public final void a(kkz kkz) {
        boolean z;
        d();
        try {
            klb a = a(kkz.a);
            if (a != null) {
                if (a.m == kkz.b) {
                    z = true;
                } else {
                    z = false;
                }
                iva.a(z);
                a.u();
            }
            kla kla = this.d;
            kla.a.remove(kkz.a);
            kla.b.remove(Long.valueOf(kkz.b));
            f();
        } finally {
            e();
        }
    }

    public final void a(kkz kkz, kaj kaj, long j, long j2) {
        boolean z;
        if (kaj != null) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "ActionType cannot be null");
        new koj(this.a, -1, kkz.b, kaj, j, j2).t();
    }

    public final void a(kqi kqi) {
        kqi.t();
    }

    public final boolean a(kql kql) {
        kkb kkb = this.a;
        String b = kql.b();
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 30);
        sb.append("SELECT EXISTS (SELECT * FROM ");
        sb.append(b);
        sb.append(")");
        Cursor a = kkb.a(sb.toString(), (String[]) null);
        try {
            boolean z = false;
            if (!a.moveToFirst()) {
                kkb.a.c("DocListDatabase", "EXISTS returned empty.");
            } else if (a.getInt(0) == 0) {
                z = true;
            }
            return z;
        } finally {
            a.close();
        }
    }
}
