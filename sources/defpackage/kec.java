package defpackage;

import android.content.Context;
import android.content.SyncResult;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.Permission;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.auth.CallingAppInfo;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.SortOrder;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: kec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kec {
    public static final ith a = new ith("DataServiceConnection", "");
    public static final anax b = anax.a(lce.P, lch.b, lce.g, lce.M, lce.u);
    private static final Set v = anax.a("com.google.android.gms", "com.google.android.gms.drive.sample.texteditor", "com.google.android.gms.apitest.drive");
    private Boolean A;
    private final kdy B = new kdy(this);
    public final lsm c;
    public final khq d;
    public final kkf e;
    public final kim f;
    public final kdb g;
    public final lel h;
    public final kyo i;
    public final kkb j;
    public final int k;
    public final krr l;
    public final ktm m;
    public final lih n;
    public final khw o;
    public final ldd p;
    public final lfr q;
    public final keq r;
    public final khl s;
    public final List t = new ArrayList();
    public volatile boolean u;
    private final khp w;
    private final ClientContext x;
    private final Context y;
    private final DriveId z;

    public kec(ClientContext clientContext, int i2, int i3, lsm lsm) {
        this.k = i2;
        this.x = clientContext;
        this.c = lsm;
        this.g = lsm.f;
        this.j = lsm.c;
        this.e = lsm.d;
        this.y = lsm.b;
        this.w = lsm.q;
        this.h = lsm.z;
        this.i = new kyo(lsm);
        this.f = lsm.n;
        this.m = lsm.l;
        this.n = lsm.o;
        this.o = lsm.p;
        khn a2 = this.w.a(clientContext);
        if (a2.a.f) {
            this.d = a2.b;
            this.s = a2.d;
            this.p = new ldd(lsm, this.d);
            this.z = this.e.d(this.d.a, this.y.getString(R.string.drive_view_my_drive)).g();
            lge lge = lsm.H;
            CallingAppInfo callingAppInfo = new CallingAppInfo(this.d, i3);
            String str = this.d.a.a;
            iva.a((Object) str);
            lfv lfv = new lfv(callingAppInfo, str, i2, lge.a, lge.b);
            this.q = lfv;
            lfv.a();
            ksz ksz = lsm.E;
            this.l = axeh.a.b().a() ? new ksd(this.q, ksz) : new krx(this.q, ksz);
            this.r = new keq(this.c, this.d, this.B);
            if (ldn.a()) {
                this.l.a(new ldm(ldn.c(), this.d.a.a));
            }
            this.u = true;
            return;
        }
        throw a2.c;
    }

    private final void a(String str) {
        if (str != null) {
            try {
                this.h.a(this.d, str, lnk.a);
            } catch (VolleyError e2) {
                throw new nja(7, "Failed to retrieve item from network.");
            } catch (eif e3) {
                throw n();
            }
        } else {
            throw new nja(1502, "Provided resourceId is invalid.");
        }
    }

    private final kmp b(khq khq, DriveId driveId) {
        kmp a2 = a(khq, driveId);
        if (a2 != null) {
            return a2;
        }
        String i2 = i(driveId);
        a(i2);
        try {
            kmp a3 = this.e.a(khq, i2);
            if (!a3.A()) {
                return a3;
            }
            throw m();
        } catch (kcs e2) {
            throw m();
        }
    }

    private final kmp c(khq khq, DriveId driveId) {
        try {
            kmp a2 = this.e.a(khq, driveId);
            if (a2.N()) {
                return a2;
            }
            return null;
        } catch (kcs e2) {
            return null;
        } catch (ktv e3) {
            throw new nja(1502, "Provided DriveId is invalid.");
        }
    }

    private final String i(DriveId driveId) {
        String str = driveId.a;
        return str == null ? this.e.a(this.d.a, driveId) : str;
    }

    public static nja m() {
        return new nja(1502, "Drive item not found, or you are not authorized to access it.");
    }

    private final String o() {
        return this.x.e;
    }

    public final kmp d(DriveId driveId) {
        return c(this.d, driveId);
    }

    public final DriveId e(DriveId driveId) {
        njc.a((Object) driveId, "Invalid parent folder.");
        try {
            kmp b2 = b(khq.a(this.d.a), driveId);
            if (!b2.w()) {
                throw new nja(10, "Invalid parent folder.");
            } else if (b2.B()) {
                if (b2.aj().contains(DriveSpace.b)) {
                    if (!this.d.e.contains(jzl.APPDATA)) {
                        throw new nja(1511, "Insufficient scope for parent folder.");
                    }
                } else if (!b2.aj().contains(DriveSpace.a)) {
                    throw new nja(10, "Invalid parent folder.");
                } else if (!this.d.a((Set) EnumSet.of(jzl.FULL, jzl.FILE))) {
                    throw new nja(1511, "Insufficient scope for parent folder.");
                }
                return b2.g();
            } else {
                throw new nja(10, "Cannot create new items inside a non-editable folder.");
            }
        } catch (nja e2) {
            throw new nja(1502, "Invalid parent folder.");
        }
    }

    public final void f(DriveId driveId) {
        if (d(driveId) == null) {
            throw new nja(1502, "Provided DriveId is not available.");
        }
    }

    public final kmp g(DriveId driveId) {
        try {
            this.h.a(this.d, driveId.a, lnk.a);
        } catch (VolleyError e2) {
            a.c("Unable to fetch permissions from server");
        } catch (eif e3) {
            throw n();
        }
        kmp a2 = a(this.d, driveId);
        if (a2 != null) {
            return a2;
        }
        throw m();
    }

    public final String h() {
        if (this.x.d()) {
            return this.x.e;
        }
        return null;
    }

    public final khq j() {
        khq khq = this.d;
        if (khq != null) {
            return khq;
        }
        throw new nja(8, "Problem determining the application authorization.");
    }

    public final ChangeSequenceNumber k() {
        kkz kkz = this.d.a;
        long j2 = kkz.b;
        return new ChangeSequenceNumber(this.e.c(kkz), this.j.g(), j2);
    }

    public final boolean l() {
        return jjk.a(this.k);
    }

    public final nja n() {
        return new nja(13, "Authorization has been revoked by the user. Reconnect the Drive API client to reauthorize.");
    }

    public final boolean d() {
        return this.x.c();
    }

    public final boolean f() {
        if (this.A == null) {
            this.A = Boolean.valueOf(hya.a(this.y).b(o()));
        }
        return this.A.booleanValue();
    }

    public final void h(DriveId driveId) {
        if (c(driveId)) {
            throw new nja(10, "Cannot modify permissions of root folder.");
        }
    }

    public final void i() {
        ArrayList arrayList;
        this.u = false;
        this.l.a();
        synchronized (this.t) {
            arrayList = new ArrayList(this.t);
            this.t.clear();
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ici) arrayList.get(i2)).c();
        }
    }

    public final DriveId c() {
        if (!this.d.e.contains(jzl.APPDATA)) {
            return null;
        }
        try {
            this.c.y.a(this.d);
        } catch (VolleyError e2) {
            ith ith = a;
            if (ith.a(2)) {
                ith.a("Failed to get real appData folder from server");
            }
        }
        return this.e.a(this.d).g();
    }

    public final AppIdentity a(khq khq) {
        AppIdentity appIdentity = khq.c;
        if (appIdentity != null) {
            return appIdentity;
        }
        throw new nja(8, "appIdentity is null.");
    }

    public final MetadataBundle a(DriveId driveId, boolean z2) {
        kmp kmp;
        if (c(driveId)) {
            if (this.d.a((Set) EnumSet.of(jzl.FULL, jzl.FILE))) {
                kmp = b(khq.a(this.d.a), this.z);
            } else {
                throw new nja(1511, "Insufficient scopes authorized.");
            }
        } else if (!z2) {
            kmp = b(driveId);
        } else {
            String i2 = i(driveId);
            a(i2);
            try {
                kmp = this.e.a(this.d, i2);
                if (kmp.A()) {
                    throw m();
                }
            } catch (kcs e2) {
                throw m();
            }
        }
        MetadataBundle a2 = lbb.a(kmp, this.d.b);
        int i3 = this.k;
        ArrayList arrayList = new ArrayList();
        for (String str : a2.a.keySet()) {
            if (lbm.a(str) == null || lbm.a(str).d() > i3) {
                arrayList.add(str);
            }
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            a2.a.remove((String) arrayList.get(i4));
        }
        return a2;
    }

    public final DriveId b() {
        if (this.d.a((Set) EnumSet.of(jzl.FILE, jzl.FULL))) {
            return this.z;
        }
        return null;
    }

    public final boolean g() {
        return v.contains(o());
    }

    public final kmp b(DriveId driveId) {
        return b(this.d, driveId);
    }

    public final boolean b(DriveId driveId, boolean z2) {
        khq j2 = j();
        a(j2);
        f(driveId);
        kmp b2 = b(driveId);
        if (b2.aa().a()) {
            return false;
        }
        lii.a(this.n, this.o, this.e, j2, b2.a(), !z2 ? kpd.PINNED_ACTIVE : kpd.PINNED_PAUSED);
        return true;
    }

    public final boolean c(DriveId driveId) {
        return this.z.equals(driveId) || "root".equals(driveId.a);
    }

    public final khq e() {
        khn a2 = this.w.a(this.x);
        if (!a2.a.f) {
            throw n();
        } else if (a2.b.equals(this.d)) {
            return this.d;
        } else {
            throw new nja(13, String.format(Locale.US, "Authorized app changed from %s to %s.", new Object[]{this.d, a2.b}));
        }
    }

    public final Query a(Query query) {
        Set a2 = lsn.a(this.d, query.a());
        liq liq = new liq(query);
        liq.d = new HashSet(a2);
        return liq.a();
    }

    public final String a() {
        if (!d()) {
            return this.d.a.a;
        }
        return null;
    }

    public final List a(kmp kmp) {
        List<kmu> ak = kmp.ak();
        ArrayList arrayList = new ArrayList();
        for (kmu kmu : ak) {
            if (!kmu.b()) {
                arrayList.add(new Permission(kmu.b, kmu.d, kmu.c, kmu.e, kmu.f, kmu.i));
            }
        }
        return arrayList;
    }

    public final Set a(DriveId driveId, boolean z2, List<DriveId> list, Set set) {
        String str;
        if (list.size() == 1 && list.get(0) == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z3 = false;
        for (DriveId driveId2 : list) {
            if (driveId2 != null) {
                kmp b2 = b(driveId2);
                if (driveId.equals(driveId2)) {
                    throw new nja(10, "Cannot set oneself as a parent.");
                } else if (!b2.w()) {
                    throw new nja(10, "At least one of the provided parents is not a collection. All parents must be collections.");
                } else if (b2.B()) {
                    z3 = z3 || b2.aj().contains(DriveSpace.a);
                    if (z2 != b2.ai()) {
                        if (!z2) {
                            str = "Unable to assign a parent that belongs to the App folder to a resource that is not from within the App folder.";
                        } else {
                            str = "Unable to assign a parent that does not belong to the App folder to a resource from within the App folder.";
                        }
                        throw new nja(10, str);
                    }
                } else {
                    throw new nja(10, "At least one of the provided parents is not modifiable.");
                }
            } else {
                throw new nja(10, "Invalid null drive ID value in the parent set.");
            }
        }
        if (!z3) {
            return set;
        }
        ob obVar = new ob((Collection) set);
        obVar.add(DriveSpace.a);
        return obVar;
    }

    public final kdo a(boolean z2, String str) {
        return kdo.a(kdo.a.b, z2, d(), str, h(), kdo.a.g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.kis a(com.google.android.gms.drive.DriveId r6, defpackage.kip r7) {
        /*
            r5 = this;
            khq r0 = r5.d
            kmp r0 = r5.a((defpackage.khq) r0, (com.google.android.gms.drive.DriveId) r6)
            if (r0 == 0) goto L_0x000d
            java.lang.String r6 = r0.i()
            goto L_0x000f
        L_0x000d:
            java.lang.String r6 = r6.a
        L_0x000f:
            if (r6 == 0) goto L_0x008d
            if (r0 != 0) goto L_0x0014
            goto L_0x0044
        L_0x0014:
            java.lang.String r1 = r0.l()     // Catch:{ VolleyError -> 0x0050, eif -> 0x004e }
            if (r1 == 0) goto L_0x0044
            lel r1 = r5.h     // Catch:{ VolleyError -> 0x0050, eif -> 0x004e }
            khq r2 = r5.d     // Catch:{ VolleyError -> 0x0050, eif -> 0x004e }
            java.lang.String r0 = r0.l()     // Catch:{ VolleyError -> 0x0050, eif -> 0x004e }
            lnk r3 = defpackage.lnk.a     // Catch:{ VolleyError -> 0x0050, eif -> 0x004e }
            lnj r3 = r1.b(r2, r6, r3)     // Catch:{ VolleyError -> 0x0050, eif -> 0x004e }
            boolean r4 = r3.c()     // Catch:{ VolleyError -> 0x0050, eif -> 0x004e }
            if (r4 != 0) goto L_0x0040
            java.lang.String r4 = r3.K()     // Catch:{ VolleyError -> 0x0050, eif -> 0x004e }
            boolean r0 = r0.equals(r4)     // Catch:{ VolleyError -> 0x0050, eif -> 0x004e }
            if (r0 == 0) goto L_0x0040
            ith r0 = defpackage.lel.a     // Catch:{ VolleyError -> 0x0050, eif -> 0x004e }
            java.lang.String r1 = "Head revision ID did not change so not persisting metadata"
            r0.b(r1)     // Catch:{ VolleyError -> 0x0050, eif -> 0x004e }
            goto L_0x0060
        L_0x0040:
            r1.a(r2, r3)     // Catch:{ VolleyError -> 0x0050, eif -> 0x004e }
            goto L_0x0060
        L_0x0044:
            lel r0 = r5.h     // Catch:{ VolleyError -> 0x0050, eif -> 0x004e }
            khq r1 = r5.d     // Catch:{ VolleyError -> 0x0050, eif -> 0x004e }
            lnk r2 = defpackage.lnk.a     // Catch:{ VolleyError -> 0x0050, eif -> 0x004e }
            r0.a(r1, r6, r2)     // Catch:{ VolleyError -> 0x0050, eif -> 0x004e }
            goto L_0x0060
        L_0x004e:
            r6 = move-exception
            goto L_0x0052
        L_0x0050:
            r0 = move-exception
            goto L_0x0057
        L_0x0052:
            nja r6 = r5.n()
            throw r6
        L_0x0057:
            ith r0 = a
            java.lang.String r1 = "DataServiceConnection"
            java.lang.String r2 = "Failed to sync metadata"
            r0.c((java.lang.String) r1, (java.lang.String) r2)
        L_0x0060:
            kkf r0 = r5.e     // Catch:{ kcs -> 0x0087 }
            khq r1 = r5.d     // Catch:{ kcs -> 0x0087 }
            kmp r6 = r0.a((defpackage.khq) r1, (java.lang.String) r6)     // Catch:{ kcs -> 0x0087 }
            boolean r0 = r6.A()
            if (r0 != 0) goto L_0x0082
            lsm r0 = r5.c
            lhv r0 = r0.D
            lht r0 = r0.a()
            kim r1 = r5.f
            khq r2 = r5.d
            kis r6 = r1.a(r2, r6, r0)
            r6.a(r7)
            return r6
        L_0x0082:
            nja r6 = m()
            throw r6
        L_0x0087:
            r6 = move-exception
            nja r6 = m()
            throw r6
        L_0x008d:
            r6 = 3
            r7.a(r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kec.a(com.google.android.gms.drive.DriveId, kip):kis");
    }

    public final kmp a(khq khq, DriveId driveId) {
        kmp c2 = c(khq, driveId);
        if (c2 == null || !c2.A()) {
            return c2;
        }
        throw m();
    }

    public final lrw a(Query query, String str, Set set, List list) {
        Query query2 = query;
        List list2 = list;
        kqy a2 = new lil(this.d, list2).a(query);
        kkf kkf = this.e;
        khq khq = this.d;
        query.a();
        lrw a3 = kkf.a(khq, query.a(), a2, str, set, query2.e, query2.g, list2, l());
        lbm.a(a3.a, this.k);
        return a3;
    }

    public final void a(DriveId driveId, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            long j2 = ((DriveId) it.next()).b;
            khq a2 = khq.a(this.d.a);
            try {
                kmp a3 = this.e.a(a2, knc.a(j2));
                keb keb = new keb(this, a2);
                keb.d(a3);
                if (keb.b().contains(knc.a(driveId.b))) {
                    throw new nja(10, "Cannot create a cyclic hierarchy.");
                }
            } catch (kcs e2) {
                throw m();
            } catch (lsj e3) {
                throw new nja(8, "Traversal failure");
            }
        }
    }

    public final void a(DriveId driveId, String str) {
        try {
            DriveId c2 = c();
            if (c2 == null) {
                return;
            }
            if (c2.equals(driveId)) {
                throw new nja(10, str);
            }
        } catch (eif e2) {
            throw n();
        }
    }

    public final void a(DriveId driveId, lfq lfq, boolean z2) {
        kbx kbx;
        String str = !z2 ? "untrash" : "trash";
        if (!c(driveId)) {
            kmp b2 = b(driveId);
            if (b2.ai()) {
                StringBuilder sb = new StringBuilder(str.length() + 50);
                sb.append("Cannot ");
                sb.append(str);
                sb.append(" App Folder or files inside the App Folder.");
                throw new nja(10, sb.toString());
            } else if (!b2.d()) {
                StringBuilder sb2 = new StringBuilder(str.length() + 45);
                sb2.append("Cannot ");
                sb2.append(str);
                sb2.append(" resources that the user does not own.");
                throw new nja(10, sb2.toString());
            } else if (!b2.w() || jzp.a(jzo.TRASH_FOLDERS)) {
                lfq.a(b2);
                knc a2 = b2.a();
                if (z2) {
                    khq khq = this.d;
                    kbx = new kbx(khq.a, khq.c, a2, kpy.EXPLICITLY_TRASHED);
                } else {
                    khq khq2 = this.d;
                    kbx = new kbx(khq2.a, khq2.c, a2, kpy.UNTRASHED);
                }
                int a3 = this.g.a(kbx, lfq);
                if (a3 == 0) {
                    return;
                }
                if (a3 != 5) {
                    StringBuilder sb3 = new StringBuilder(str.length() + 20);
                    sb3.append("Failed to ");
                    sb3.append(str);
                    sb3.append(" resource.");
                    throw new nja(8, sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder(str.length() + 57);
                sb4.append("App has no access to a descendant of the folder to be ");
                sb4.append(str);
                sb4.append("ed.");
                throw new nja(10, sb4.toString());
            } else {
                StringBuilder sb5 = new StringBuilder(str.length() + 15);
                sb5.append("Cannot ");
                sb5.append(str);
                sb5.append(" folders");
                throw new nja(8, sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder(str.length() + 19);
            sb6.append("Cannot ");
            sb6.append(str);
            sb6.append(" root folder");
            throw new nja(10, sb6.toString());
        }
    }

    public final void a(Query query, Set set, kwj kwj, kgn kgn) {
        boolean z2;
        boolean z3;
        HashSet hashSet;
        kdz kdz;
        String str;
        Query query2 = query;
        char c2 = 0;
        if (kwj != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Query a2 = a(query);
        int i2 = 10;
        if (!query2.e || this.d.c() || Collections.singleton(DriveSpace.b).equals(a2.a())) {
            String str2 = new lij(this.r.b.b).a(query2).b;
            SortOrder sortOrder = query2.c;
            ArrayList arrayList = new ArrayList();
            Object obj = null;
            if (sortOrder == null) {
                z3 = false;
            } else {
                if (sortOrder.b) {
                    arrayList.add(String.format(Locale.US, "%s <> \"%s\"", new Object[]{lap.a((kyq) lce.N).b((Object) null), "application/vnd.google-apps.folder"}));
                }
                if (!sortOrder.a.isEmpty()) {
                    List list = sortOrder.a;
                    int size = list.size();
                    int i3 = 0;
                    while (i3 < size) {
                        FieldWithSortOrder fieldWithSortOrder = (FieldWithSortOrder) list.get(i3);
                        kyq a3 = lbm.a(fieldWithSortOrder.a);
                        if (a3 == null) {
                            String valueOf = String.valueOf(fieldWithSortOrder.a);
                            throw new nja(i2, valueOf.length() == 0 ? new String("Incorrect sorting field provided: ") : "Incorrect sorting field provided: ".concat(valueOf));
                        }
                        String b2 = lap.a(a3).b(obj);
                        String str3 = "DESC";
                        if (lch.f.equals(a3)) {
                            Locale locale = Locale.US;
                            Object[] objArr = new Object[2];
                            objArr[c2] = b2;
                            objArr[1] = !fieldWithSortOrder.b ? str3 : "ASC";
                            arrayList.add(String.format(locale, "%s IS NULL %s", objArr));
                        }
                        if (!(a3 instanceof lby)) {
                            str = "%s COLLATE LOCALIZED %s";
                        } else {
                            str = "TRIM(%s) COLLATE LOCALIZED %s";
                        }
                        Locale locale2 = Locale.US;
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = b2;
                        if (fieldWithSortOrder.b) {
                            str3 = "ASC";
                        }
                        objArr2[1] = str3;
                        arrayList.add(String.format(locale2, str, objArr2));
                        i3++;
                        i2 = 10;
                        c2 = 0;
                        obj = null;
                    }
                }
                z3 = false;
            }
            String join = TextUtils.join(",", arrayList);
            List<String> list2 = query2.d;
            if (list2 == null) {
                list2 = new ArrayList<>();
            } else if (!list2.isEmpty() && !set.isEmpty()) {
                list2.addAll(set);
            }
            if (list2.isEmpty() || !((Boolean) jzq.T.c()).booleanValue()) {
                hashSet = anfv.a;
            } else {
                HashSet hashSet2 = new HashSet();
                for (String str4 : list2) {
                    kyq a4 = lbm.a(str4);
                    if (a4 != null) {
                        hashSet2.addAll(a4.b());
                    } else {
                        String valueOf2 = String.valueOf(str4);
                        throw new nja(10, valueOf2.length() == 0 ? new String("Unknown metadata field requested: ") : "Unknown metadata field requested: ".concat(valueOf2));
                    }
                }
                if (hashSet2.size() != 0) {
                    hashSet = hashSet2;
                } else {
                    throw new nja(10, "Need at least one column to project");
                }
            }
            kdz kdz2 = new kdz(this, z2, query, a2, join, hashSet, str2, kwj, kgn);
            keq keq = this.r;
            List emptyList = Collections.emptyList();
            if (ljg.a(query)) {
                emptyList = keq.c.a(str2);
                if (!emptyList.isEmpty()) {
                    z3 = true;
                } else {
                    if (kwj != null) {
                        kdz = null;
                    } else {
                        kdz = kdz2;
                    }
                    if (!keq.c.a(str2, kdz)) {
                        kkz kkz = keq.b.a;
                        SyncResult syncResult = new SyncResult();
                        new ldt(keq.a, kkz, new ldq(lcq.a(new lct(str2, DriveSpace.e, (String) null), (String) null, 0)), new lez(syncResult), syncResult).a(new kep(keq, str2), ((Integer) jzq.aw.c()).intValue());
                    }
                    if (kwj == null) {
                        return;
                    }
                }
            } else {
                z3 = true;
            }
            kdz2.a(emptyList, z3);
            return;
        }
        throw new nja(10, "Can only call include parents when FULL scope is requested or only appdata space is requested");
    }

    public final void a(Iterable iterable) {
        khq a2 = khq.a(this.d.a);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DriveId driveId = (DriveId) it.next();
            if (driveId != null) {
                kmp b2 = b(a2, driveId);
                if (b2.w() && !b2.B()) {
                    throw new nja(10, "At least one of the existing parents being removed is not modifiable.");
                }
            } else {
                throw new nja(10, "Invalid null drive ID value in the removed parent set.");
            }
        }
    }

    public final void a(lfq lfq, DriveId driveId) {
        try {
            lfq.a(b(khq.a(this.d.a), driveId));
        } catch (nja e2) {
            a.c("Failed to retrieve entry for logging");
        }
    }

    public final boolean a(DriveId driveId) {
        kmp kmp;
        try {
            kmp = c(khq.a(this.d.a), driveId);
        } catch (nja e2) {
            a.b("DataServiceConnection", "Failed to retrieve entry from DB.", (Throwable) e2);
            kmp = null;
        }
        return kmp != null && kmp.ai();
    }
}
