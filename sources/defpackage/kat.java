package defpackage;

import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: kat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kat extends kae {
    private static final ith f = new ith("ContentAndMetadataActio", "");
    private String g;
    private final String h;
    private final MetadataBundle i;
    private Long j;

    public kat(kkz kkz, AppIdentity appIdentity, knc knc, String str, MetadataBundle metadataBundle, String str2, kdo kdo) {
        super(kaj.CONTENT_AND_METADATA, kkz, appIdentity, knc, kbi.NORMAL, kdo);
        iva.a((Object) str);
        this.g = str;
        metadataBundle = metadataBundle == null ? MetadataBundle.a() : metadataBundle;
        this.i = metadataBundle;
        iva.b(!metadataBundle.c(lce.M));
        if (kdo.a()) {
            iva.a((Object) str2, (Object) "baseContentHash cannot be null when conflict detection is required");
        }
        this.h = !kdo.c ? null : str2;
    }

    private final void a(lsm lsm, kmp kmp, long j2, kjl kjl) {
        lsm lsm2 = lsm;
        long j3 = j2;
        kjl kjl2 = kjl;
        iva.a(b());
        if (kjl2 != null) {
            kjl2.a((String) null);
        }
        khq d = d(lsm2.d);
        String i2 = kmp.i();
        knc a = kmp.a();
        try {
            lsm2.z.a(d, i2, new lnk(302, 2, false, true));
            kkf kkf = lsm2.d;
            kmp e = e(kkf);
            if (e == null || e.A()) {
                f.a("Failed to sync entry (%s) after conflict detection", i2);
                throw new kcs(a);
            } else if (!this.h.equals(e.n()) || !e.o().equals(e.l())) {
                if (axee.a.a().a()) {
                    kkf.d();
                    try {
                        lrt.b(lsm2.d, this.b, j3, false);
                        lrt.a(kkf, this.b, e.a(), j2, false);
                        lrt.a(kkf, this.b, j3);
                        kkf.f();
                    } finally {
                        kkf.e();
                    }
                } else {
                    lrt.b(lsm2.d, this.b, j3, false);
                    lrt.a(kkf, this.b, e.a(), j2, false);
                }
                throw new kcp();
            } else {
                f.a("Failed to sync entry (%s) after conflict detection since app is not authorized anymore", i2);
                throw new kcn("Upload failed. Filtered false positive conflict", true);
            }
        } catch (VolleyError e2) {
            f.a("Failed to sync entry (%s) after conflict detection", i2);
            throw e2;
        } catch (eif e3) {
            f.a("Failed to sync entry (%s) after conflict detection since app is not authorized anymore", i2);
            throw new kcm(d.c);
        }
    }

    public final boolean b(kah kah) {
        return (kah instanceof kat) && this.d.a(kah.c()) && this.c.equals(kah.i());
    }

    /* access modifiers changed from: protected */
    public final String d() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public final String e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            kat kat = (kat) obj;
            return a((kac) kat) && ius.a(this.j, kat.j) && ius.a(this.g, kat.g) && ius.a(this.i, kat.i);
        }
    }

    /* access modifiers changed from: protected */
    public final MetadataBundle f() {
        return this.i;
    }

    public final JSONObject h() {
        JSONObject h2 = super.h();
        h2.putOpt("pendingUploadSqlId", this.j);
        h2.put("contentHash", this.g);
        h2.putOpt("metadataDelta", lbb.b(this.i));
        h2.putOpt("baseContentHash", this.h);
        return h2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(n()), this.j, this.g, this.i});
    }

    public final boolean j() {
        return true;
    }

    public final boolean l() {
        return true;
    }

    public final String toString() {
        return String.format(Locale.US, "ContentAndMetadataAction[%s, pendingUploadSqlId=%d, contentHash=%s, metadataChangeSet=%s]", new Object[]{m(), this.j, this.g, this.i});
    }

    public kat(kkz kkz, JSONObject jSONObject) {
        super(kaj.CONTENT_AND_METADATA, kkz, jSONObject);
        if (jSONObject.has("pendingUploadSqlId")) {
            this.j = Long.valueOf(Long.parseLong(jSONObject.getString("pendingUploadSqlId")));
        }
        this.g = jSONObject.getString("contentHash");
        this.h = lrv.a(jSONObject, "baseContentHash");
        if (jSONObject.has("metadataDelta")) {
            this.i = lbb.a(jSONObject.getJSONObject("metadataDelta"));
        } else {
            this.i = MetadataBundle.a();
        }
    }

    /* access modifiers changed from: protected */
    public final kah a(kam kam, khq khq, kmp kmp) {
        boolean z;
        knl knl;
        kkf kkf = kam.a;
        if (!b() || this.h.equals(kmp.q())) {
            long j2 = kam.b;
            this.j = Long.valueOf(kkf.a(this.g, this.h, j2, kmp.a()).m);
            if (!ius.a(this.g, kmp.q())) {
                String str = this.g;
                kmp.c(str, lru.b(str));
            }
            kmp.aq();
            kmp.b(Long.valueOf(j2));
            knh d = kkf.d(this.g);
            if (d != null) {
                z = true;
            } else {
                z = false;
            }
            iva.a(z, "Content does not exist: %s", this.g);
            if (kmp.t() == null) {
                kmp.c(Long.valueOf(kmp.s()));
            }
            kmp.a(d.f);
            if (kmp.ag()) {
                knl = kkf.b(kmp.b());
            } else {
                knl = kkf.a(kmp);
                kmp.j(true);
            }
            lbb.a(kmp, knl, j2, c(kkf).b, this.i);
            kmp.f((Date) null);
            kmp.f((String) null);
            kmp.m(true);
            knl.t();
            return new kbz(khq.a, khq.c, this.e);
        }
        throw new kcp();
    }

    public final void a(kah kah, kkf kkf, long j2) {
        iva.b(b(kah), "Invalid action to squash under.");
        kat kat = (kat) kah;
        this.g = kat.g;
        MetadataBundle metadataBundle = this.i;
        MetadataBundle metadataBundle2 = kat.i;
        for (kyq a : metadataBundle2.c()) {
            a.a(metadataBundle, metadataBundle2);
        }
        kdo kdo = this.d;
        kdo c = kah.c();
        iva.b(kdo.a(c), "Can't squash under the provided context!");
        ArrayList arrayList = new ArrayList(kdo.e);
        arrayList.addAll(c.e);
        this.d = new kdo(kdo.b, kdo.c, kdo.d, Collections.unmodifiableList(arrayList), kdo.f, c.g);
        kkf.e(this.j.longValue()).u();
        kkf.e(kat.j.longValue()).u();
        this.j = Long.valueOf(kkf.a(this.g, this.h, j2, this.e).m);
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext, String str) {
        ? r8;
        String str2;
        lsm lsm;
        String str3;
        kkf kkf;
        boolean z;
        kan kan2 = kan;
        ClientContext clientContext2 = clientContext;
        String str4 = str;
        lsm lsm2 = kan2.a;
        kkf kkf2 = lsm2.d;
        kmp e = e(kkf2);
        long j2 = kan2.b;
        String str5 = d(kkf2).b;
        String n = e.n();
        String o = e.o();
        if (b() && !this.h.equals(n)) {
            f.b("Conflict detected in applyOnServer -- content hash mismatch");
            a(lsm2, e, j2, (kjl) null);
        }
        lnj lnj = null;
        if (b()) {
            HashSet hashSet = new HashSet();
            hashSet.add(d(kkf2).b);
            try {
                lnj a = lsm2.i.a(clientContext2, str4, hashSet, lnk.a);
                String K = a.K();
                String str6 = ((lnl) a).a.l;
                if (o == null || !o.equals(K)) {
                    f.b("Conflict detected in applyOnServer -- revision ID mismatch");
                    z = true;
                    a(lsm2, e, j2, (kjl) null);
                } else {
                    z = true;
                }
                str2 = str6;
                r8 = z;
            } catch (VolleyError e2) {
                f.b("Request to get file metadata failed. Cannot proceed with conflict-aware upload of %s", str4);
                throw e2;
            }
        } else {
            r8 = 1;
            str2 = null;
        }
        String jag = lbb.a(this.i).toString();
        kmp e3 = e(kkf2);
        long j3 = j2;
        long longValue = this.j.longValue();
        String str7 = str5;
        kkf kkf3 = kkf2;
        String str8 = jag;
        lsm lsm3 = lsm2;
        kjl a2 = kjl.a(e3, lsm2, longValue, str2, str8, false, d(kkf2), 412, lbq.a(e.H()));
        kan kan3 = kan;
        lfp f2 = kan3.d.f();
        kjm a3 = lsm3.u.a(a2, lsm3, f2);
        f2.a(a2.e);
        try {
            lnj = a3.a(kan.a(), kan3.c, clientContext2);
            f2.a(a3.a());
            f2.a((List) a3.e());
            f2.b();
            lsm = lsm3;
            str3 = str7;
            kkf = kkf3;
        } catch (InterruptedException e4) {
            throw new kcn("Upload failed", e4, r8);
        } catch (kji e5) {
            f.b("Conflict detected in applyOnServer during upload");
            lsm = lsm3;
            str3 = str7;
            kkf = kkf3;
            a(lsm3, e, j3, a2);
            f2.a(a3.a());
            f2.a((List) a3.e());
            f2.b();
        } catch (kjj e6) {
            if (!(e6.getCause() instanceof kcn)) {
                throw new kcn("Upload failed", e6, r8);
            }
            throw ((kcn) e6.getCause());
        } catch (Throwable th) {
            f2.a(a3.a());
            f2.a((List) a3.e());
            f2.b();
            throw th;
        }
        lnj lnj2 = lnj;
        kim kim = kan3.a.n;
        knc a4 = e.a();
        kij kij = kim.e;
        synchronized (kij.a) {
            kit kit = (kit) kij.a.get(a4);
            if (!(kit == null || kit.a.getAndSet(0) == 0)) {
                kit.b();
            }
        }
        kkf.d();
        try {
            String R = lnj2.R();
            kmp e7 = e(kkf);
            if (R == null) {
                ith ith = f;
                Object[] objArr = new Object[2];
                objArr[0] = a3.e();
                objArr[r8] = lsm.b;
                ith.b("ContentAndMetadataActio", "Server did not return uploaded content revision ID. Upload IDs: %s, context: %s", objArr);
            } else {
                e7.b(this.g, R);
            }
            kju.a(kkf, lnj2, e7, str3);
            e7.n(false);
            long j4 = j3;
            lrt.b(kkf, this.b, j4, false);
            lrt.a(kkf, this.b, e7.a(), j4, false);
            lrt.a(kkf, this.b, j4);
            kkf.f();
        } finally {
            kkf.e();
        }
    }
}
