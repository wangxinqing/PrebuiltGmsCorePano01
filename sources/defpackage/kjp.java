package defpackage;

import android.database.Cursor;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.UserMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: kjp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class kjp implements kkd, lgr {
    public final kkb a;
    public final kkr b = new kkr(this, this.d, this.c);
    private final Executor c;
    private final kkm d = new kkm(this);

    protected kjp(kkb kkb, Executor executor) {
        iva.a((Object) kkb);
        this.a = kkb;
        iva.a((Object) executor);
        this.c = executor;
    }

    protected static Object a(kky kky) {
        try {
            if (!kky.isEmpty()) {
                return kky.get(0);
            }
            kky.close();
            return null;
        } finally {
            kky.close();
        }
    }

    public static Object b(kky kky) {
        try {
            if (kky.isEmpty()) {
                kky.close();
                return null;
            } else if (kky.size() == 1) {
                return kky.get(0);
            } else {
                int size = kky.size();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Result list has ");
                sb.append(size);
                sb.append(" items, but only 1 was expected.");
                throw new IllegalArgumentException(sb.toString());
            }
        } finally {
            kky.close();
        }
    }

    /* access modifiers changed from: protected */
    public abstract kkh a();

    /* JADX INFO: finally extract failed */
    public final long c() {
        long j;
        kkb kkb = this.a;
        kkh a2 = a();
        AtomicLong atomicLong = kkb.e;
        if (atomicLong == null) {
            synchronized (kkb) {
                atomicLong = kkb.e;
                if (atomicLong == null) {
                    String a3 = kne.SEQUENCE_NUMBER.aB.a();
                    Cursor a4 = kkb.a(a2, knf.a.b(), new String[]{a3}, (kqy) null, (String) null, String.valueOf(a3).concat(" DESC"), "1");
                    try {
                        if (a4.moveToFirst()) {
                            j = a4.getLong(0);
                        } else {
                            j = 0;
                        }
                        a4.close();
                        atomicLong = new AtomicLong(j);
                        kkb.e = atomicLong;
                    } catch (Throwable th) {
                        a4.close();
                        throw th;
                    }
                }
            }
        }
        return atomicLong.incrementAndGet();
    }

    public List d(kkx kkx) {
        if (!kkx.a()) {
            return Collections.EMPTY_LIST;
        }
        return a(this.a.a(a(), kpx.a.b(), (String[]) null, kpw.ENTRY_ID.d.e(kkx.a.longValue()), String.valueOf(kpw.VERSION.d.a()).concat(" DESC")), (kkp) kkv.a).a();
    }

    public List e(kkx kkx) {
        if (!kkx.a()) {
            return Collections.EMPTY_LIST;
        }
        return a(this.a.a(a(), kpi.a.b(), (String[]) null, kph.ENTRY_ID.n.e(kkx.a.longValue()), (String) null), (kkp) kku.a).a();
    }

    private final List a(Cursor cursor) {
        kky a2 = a(cursor, (kkp) kko.a);
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                klw klw = (klw) it.next();
                arrayList.add(new krl(new lgq(this, klw.a, klw.c, klw.b), klw));
            }
            return arrayList;
        } finally {
            a2.close();
        }
    }

    public long a(UserMetadata userMetadata) {
        kqc kqc;
        boolean z;
        Cursor a2 = this.a.a(a(), kqf.a.b(), (String[]) null, kqe.PERMISSIONS_ID.f.b(userMetadata.a), (String) null);
        try {
            boolean z2 = true;
            if (a2.moveToFirst()) {
                kqc = kqc.a(this.a, a2);
                String str = userMetadata.a;
                String str2 = userMetadata.b;
                String str3 = userMetadata.c;
                boolean z3 = userMetadata.d;
                String str4 = userMetadata.e;
                if (!ius.a(kqc.a, str)) {
                    iva.a((Object) str);
                    kqc.a = str;
                    z = true;
                } else {
                    z = false;
                }
                if (!ius.a(kqc.b, str2)) {
                    kqc.b = str2;
                    z = true;
                }
                if (!ius.a(kqc.c, str3)) {
                    kqc.c = str3;
                    z = true;
                }
                if (kqc.d != z3) {
                    kqc.d = z3;
                    z = true;
                }
                if (ius.a(kqc.e, str4)) {
                    z2 = z;
                } else {
                    kqc.e = str4;
                }
            } else {
                kqc = new kqc(this.a, -1, userMetadata.a, userMetadata.b, userMetadata.c, userMetadata.d, userMetadata.e);
            }
            if (z2) {
                a((kqi) kqc);
            }
            return kqc.m;
        } finally {
            a2.close();
        }
    }

    public kmh b(kkz kkz, String str) {
        return new kmh(this.a, -1, kkz.b, str);
    }

    public knl b(kkx kkx) {
        if (!kkx.a()) {
            return null;
        }
        long longValue = kkx.a.longValue();
        if (longValue < 0) {
            return null;
        }
        Cursor a2 = this.a.a(a(), knv.a.b(), (String[]) null, knu.ENTRY_ID.O.e(longValue), (String) null);
        try {
            if (a2.moveToFirst()) {
                return knl.a((kqg) this.a, a2);
            }
            a2.close();
            return null;
        } finally {
            a2.close();
        }
    }

    public List c(kkx kkx) {
        if (!kkx.a()) {
            return Collections.EMPTY_LIST;
        }
        return a(kmw.ENTRY_ID.m.e(kkx.a.longValue()));
    }

    public kmp c(kkz kkz, String str) {
        return a(khq.a(kkz), "EntryView", "ScopedEntryView", lrr.a(kkz.b, str));
    }

    public final void b(long j) {
        this.a.a(a(), knz.a, kny.CHILD_ENTRY_ID.c.e(j));
        this.a.a(a(), knz.a, kny.PARENT_ENTRY_ID.c.e(j));
    }

    public final boolean b() {
        return this.a.a().inTransaction();
    }

    /* access modifiers changed from: protected */
    public final Cursor a(kkz kkz, String str, kqy kqy, String str2, String[] strArr) {
        kqy kqy2;
        if (kkz != null) {
            kqy2 = kqz.a(lrr.b(kkz.b), kqy);
        } else {
            kqy2 = kqy;
        }
        return this.a.a(a(), str, strArr, kqy2, str2);
    }

    public List a(Long l) {
        return a(this.a.a(a(), klz.a.b(), (String[]) null, kly.ACTION_ID.h.e(l.longValue()), (String) null));
    }

    public List a(khq khq, String str, String str2, boolean z) {
        return a(khq, "EntryView", "ScopedEntryView", lrr.a(khq.a.b, str, str2, z), String.valueOf(kmk.a.a.a()).concat(" ASC")).a();
    }

    public List a(kkx kkx, String str, boolean z) {
        if (!kkx.a()) {
            return Collections.EMPTY_LIST;
        }
        return a(this.a.a(a(), klz.a.b(), (String[]) null, lrr.a(Collections.singletonList(kkx.a), str, z), (String) null));
    }

    public final List a(kqy kqy) {
        Cursor a2 = this.a.a(a(), kmx.a.b(), (String[]) null, kqy, (String) null);
        ArrayList arrayList = new ArrayList();
        while (a2.moveToNext()) {
            try {
                arrayList.add(new kmu(this.a, kmx.a.a.b(a2).longValue(), kmw.ENTRY_ID.m.b(a2).longValue(), kmw.PERMISSION_ID.m.a(a2), kmw.ACCOUNT_IDENTIFIER.m.a(a2), kmw.ACCOUNT_NAME.m.a(a2), kmw.ACCOUNT_TYPE.m.b(a2).intValue(), kmw.PHOTO_LINK.m.a(a2), kmw.ROLE.m.b(a2).intValue(), kmw.GENOA_ROLE_VALUE.m.b(a2), kmw.GENOA_ROLE_ACTION_ID.m.b(a2), kmw.IS_LINK_REQUIRED.m.e(a2), kmw.GENOA_IS_LINK_REQUIRED_VALUE.m.d(a2), kmw.GENOA_IS_LINK_REQUIRED_ACTION_ID.m.b(a2)));
            } finally {
                a2.close();
            }
        }
        return arrayList;
    }

    public final Set a(String str, boolean z, kqy kqy) {
        int i;
        int i2;
        String a2 = kmk.a.a.a();
        String a3 = kmj.RESOURCE_ID.c.a();
        String a4 = kne.MIME_TYPE.aB.a();
        Cursor a5 = this.a.a(a(), str, z ? new String[]{a2, a3, a4} : new String[]{a2, a3}, kqy, a2, (String) null, (String) null);
        HashSet hashSet = new HashSet();
        int columnIndexOrThrow = a5.getColumnIndexOrThrow(a2);
        int columnIndexOrThrow2 = a5.getColumnIndexOrThrow(a3);
        if (z) {
            i = a5.getColumnIndexOrThrow(a4);
        } else {
            i = 0;
        }
        long g = this.a.g();
        while (a5.moveToNext()) {
            try {
                if (z) {
                    i2 = "application/vnd.google-apps.folder".equals(a5.getString(i)) ? 1 : 0;
                } else {
                    i2 = -1;
                }
                hashSet.add(new DriveId(a5.getString(columnIndexOrThrow2), a5.getLong(columnIndexOrThrow), g, i2));
            } finally {
                a5.close();
            }
        }
        return hashSet;
    }

    public final Set a(khq khq, kmp kmp) {
        String str;
        iva.a((Object) khq);
        iva.a((Object) kmp);
        kqy a2 = kqz.a(lrr.a(khq), kny.CHILD_ENTRY_ID.c.e(kmp.h()));
        if (khq.a()) {
            str = "ParentDriveIdView";
        } else {
            str = !khq.d() ? "ParentEntryView" : "ScopedParentEntryView";
        }
        return a(str, !khq.a(), a2);
    }

    public final kky a(Cursor cursor, kkp kkp) {
        return new kky(this.a, cursor, kkp);
    }

    public final kky a(khq khq, String str, String str2, kqy kqy, String str3) {
        iva.a((Object) khq);
        if (khq.d()) {
            str = str2;
        }
        return a(khq.a, str, kqz.a(kqy, lrr.a(khq)), str3);
    }

    public final kky a(kkz kkz, String str, kqy kqy, String str2) {
        return a(a(kkz, str, kqy, str2, (String[]) null), (kkp) this.b);
    }

    public final kky a(kmp kmp, kqy kqy) {
        return a(this.a.a(a(), kmt.a.b(), (String[]) null, kqz.a(kqy, kms.ENTRY_ID.c.e(kmp.h())), (String) null), (kkp) new kkq(kmp));
    }

    /* access modifiers changed from: protected */
    public final klb a(String str) {
        kkb kkb = this.a;
        Cursor a2 = kkb.a(a(), kle.a.b(), (String[]) null, kld.ACCOUNT_HOLDER_NAME.l.b(str), (String) null);
        try {
            if (a2.moveToFirst()) {
                return klb.a(kkb, a2);
            }
            a2.close();
            return null;
        } finally {
            a2.close();
        }
    }

    public kmh a(kkz kkz, String str) {
        iva.a((Object) str);
        Cursor a2 = this.a.a(a(), kmk.a.b(), (String[]) null, kqz.a(kmj.ACCOUNT_ID.c.e(kkz.b), kmj.RESOURCE_ID.c.b(str)), (String) null);
        try {
            if (a2.moveToFirst()) {
                return kmh.a(this.a, a2);
            }
            a2.close();
            return null;
        } finally {
            a2.close();
        }
    }

    public final kmp a(khq khq, String str, String str2, kqy kqy) {
        return (kmp) a(a(khq, str, str2, kqy, (String) null));
    }

    public kmp a(kkz kkz, String str, String str2) {
        kmh kmh;
        kmh kmh2;
        if (str2 != null) {
            kmh = a(kkz, str2);
        } else {
            kmh = null;
        }
        if (kmh == null) {
            kmh2 = b(kkz, str2);
        } else {
            kmh2 = kmh;
        }
        kkb kkb = this.a;
        kmp kmp = new kmp(kkb, a(new kkx((Long) null)), this.d, this.c, kmh2, new kmy(kkb, kmh2.m, false));
        kmp.g(str);
        return kmp;
    }

    public kqc a(long j) {
        return (kqc) b(a(this.a.a(a(), kqf.a.b(), (String[]) null, kqf.a.a.e(j), (String) null), (kkp) kkw.a));
    }

    public final krl a(kkx kkx, String str, String str2) {
        return new krl(new lgq(this, kkx, str, str2), new klw(this.a, kkx, str, str2));
    }

    public final lgs a(kkx kkx) {
        return new lgs(this, kkx);
    }

    public void a(kmp kmp, long j) {
        a((kqi) new knw(this.a, kmp.h(), j));
    }

    public void a(kmp kmp, Set set) {
        iva.b(kmp.x(), "entry must be saved to database before authorized apps are set");
        a((Runnable) new kjo(this, kmp, set));
    }

    public final void a(kmy kmy, boolean z) {
        long c2 = c();
        kmy.aj = c2;
        if (z) {
            kmy.ak = c2;
        }
        a((kqi) kmy);
    }

    public void a(knc knc, long j) {
        kqy e = kny.CHILD_ENTRY_ID.c.e(knc.a);
        kqy e2 = kny.PARENT_ENTRY_ID.c.e(j);
        this.a.a(a(), knz.a, kqz.a(e, e2));
    }

    public boolean a(khq khq, kkx kkx) {
        if (!kkx.a() || a(khq, "EntryView", "ScopedEntryView", lrr.a(khq.a.b, kkx.a.longValue())) == null) {
            return false;
        }
        return true;
    }
}
