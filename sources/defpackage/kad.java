package defpackage;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.UserMetadata;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: kad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class kad extends kac implements kbd {
    protected final MetadataBundle e;
    protected DriveId f;
    public DriveId g;

    protected kad(kaj kaj, kkz kkz, AppIdentity appIdentity, MetadataBundle metadataBundle, DriveId driveId, kdo kdo) {
        super(kaj, kkz, appIdentity, kbi.NORMAL, kdo);
        this.e = metadataBundle;
        this.f = driveId;
    }

    private static final void a(MetadataBundle metadataBundle, Set set, kyq kyq, Object obj) {
        if (!set.contains(kyq)) {
            metadataBundle.b(kyq, obj);
        }
    }

    /* access modifiers changed from: protected */
    public abstract String a(khq khq);

    /* access modifiers changed from: protected */
    public abstract void a(kam kam, kmp kmp);

    /* access modifiers changed from: protected */
    public final DriveId b(kkf kkf) {
        return this.g;
    }

    public JSONObject h() {
        JSONObject h = super.h();
        h.put("metadata", lbb.b(this.e));
        DriveId driveId = this.f;
        if (driveId != null) {
            h.put("parent", driveId.a());
        }
        DriveId driveId2 = this.g;
        if (driveId2 != null) {
            h.put("newDriveId", driveId2.a());
        }
        return h;
    }

    /* access modifiers changed from: protected */
    public final String m() {
        return String.format(Locale.US, "%s, initialMetadata=%s, parent=%s, newDriveId=%s", new Object[]{super.m(), this.e, this.f, this.g});
    }

    /* access modifiers changed from: protected */
    public final int n() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.n()), this.e, this.g, this.f});
    }

    /* access modifiers changed from: protected */
    public boolean o() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void p() {
        if (this.f != null) {
            Collection collection = (Collection) this.e.a((kyq) lce.z);
            ob obVar = new ob();
            if (collection != null) {
                obVar.addAll(collection);
            }
            obVar.add(this.f);
            this.e.b(lce.z, obVar);
        }
    }

    public final Set q() {
        DriveId driveId = this.f;
        if (driveId != null) {
            return Collections.singleton(knc.a(driveId.b));
        }
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return kyo.a(this.e);
    }

    public final knc s() {
        DriveId driveId = this.g;
        if (driveId != null) {
            return knc.a(driveId.b);
        }
        return null;
    }

    protected kad(kaj kaj, kkz kkz, JSONObject jSONObject) {
        super(kaj, kkz, jSONObject);
        this.e = lbb.a(jSONObject.getJSONObject("metadata"));
        if (jSONObject.has("parent")) {
            this.f = DriveId.b(jSONObject.getString("parent"));
        } else {
            this.f = null;
        }
        if (jSONObject.has("newDriveId")) {
            this.g = DriveId.b(jSONObject.getString("newDriveId"));
        }
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [java.lang.String, com.google.android.gms.drive.UserMetadata] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* access modifiers changed from: protected */
    public final kah a(kam kam, khq khq) {
        kmp kmp;
        kmp kmp2;
        kmp kmp3;
        ? r9;
        kam kam2 = kam;
        khq khq2 = khq;
        kkf kkf = kam2.a;
        long j = kam2.b;
        try {
            DriveId driveId = this.f;
            if (driveId != null) {
                knc a = knc.a(driveId.b);
                kmp a2 = kkf.a(khq.a(this.b), a);
                if (a2.w()) {
                    kmp = a2;
                } else {
                    throw new kcu(a);
                }
            } else {
                kmp = kkf.a(khq.a(this.b), "root");
            }
            String str = (String) this.e.a((kyq) lce.Q);
            String a3 = a(khq2);
            this.e.b(lce.N, a3);
            if (r()) {
                String str2 = (String) this.e.a(lce.E);
                kmp b = kkf.b(khq.a(this.b), str2, khq2.b, kmp.ai());
                if (b == null) {
                    kmp2 = kkf.c(khq.a(this.b), str2, khq2.b, kmp.ai());
                    if (kmp2 != null) {
                        kmp2.a(false, j);
                        ((kjp) kkf).a.a(knz.a, kny.CHILD_ENTRY_ID.c.e(kmp2.a().a));
                        kmp2.ap();
                    }
                } else {
                    throw new kcr(b.g());
                }
            } else {
                kmp2 = null;
            }
            if (kmp2 != null) {
                kmp3 = kmp2;
            } else {
                kkz kkz = this.b;
                iva.a((Object) str);
                kmp a4 = ((kjp) kkf).a(kkz, a3, (String) null);
                a4.a(str);
                a4.g(a3);
                Date date = new Date();
                a4.c(date);
                a4.a(date);
                a4.b(date);
                a4.a(true);
                a4.f();
                a4.a(false, j);
                a4.K();
                kmp3 = a4;
            }
            String str3 = khq2.b;
            MetadataBundle b2 = this.e.b();
            Set c = b2.c();
            a(b2, c, lce.c, (Object) null);
            a(b2, c, lce.P, false);
            a(b2, c, lce.u, false);
            a(b2, c, lch.c, new Date(0));
            a(b2, c, lch.d, (Object) null);
            a(b2, c, lch.b, (Object) null);
            a(b2, c, lch.e, (Object) null);
            a(b2, c, lce.F, true);
            kmp kmp4 = kmp3;
            knl a5 = lrt.a(kkf, kmp4);
            lbb.a(kmp4, a5, j, str3, b2);
            lrt.a(kmp4, a5, kpy.UNTRASHED, j);
            lrt.a(kmp4, a5, true, j);
            if (((Boolean) jzq.w.c()).booleanValue()) {
                List a6 = kmp4.a((String) null, true);
                int size = a6.size();
                for (int i = 0; i < size; i++) {
                    krl krl = (krl) a6.get(i);
                    kns g2 = krl.g();
                    if (!g2.a() || g2.c() != j) {
                        krl.a((String) null, Long.valueOf(j));
                    }
                }
                r9 = 0;
            } else {
                r9 = 0;
            }
            kmp4.a((UserMetadata) r9);
            kmp4.b((UserMetadata) r9);
            kmp4.h(true);
            kmp4.c(false);
            kmp4.e(false);
            kmp4.i((String) r9);
            kmp4.g(o());
            kmp4.m(false);
            a5.t();
            kkf.a(kmp4, kmp.h());
            kmp4.e(kmp.z());
            kmp4.k(!kmp4.ai());
            kmp4.l(false);
            kkf.a(kmp4, Collections.singleton(khq2.b));
            for (kmu kmu : kmp4.ak()) {
                kmu.a(-100, j);
                kmu.t();
            }
            kmu a7 = kkf.a(kmp4, this.b.a);
            if (a7 == null) {
                kmp4.a(this.b.a, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 3, false, j);
            } else {
                a7.a(false, j);
                a7.a(3, j);
                a7.t();
            }
            kmp4.j("owner");
            a(kam2, kmp4);
            kmp4.m(true);
            this.g = kmp4.g();
            return new kcb(khq2.a, khq2.c, s());
        } catch (kcs e2) {
            throw new kcu(knc.a(this.b.b));
        }
    }

    /* access modifiers changed from: protected */
    public final void b(kan kan) {
        DriveId driveId = this.f;
        if (driveId != null) {
            try {
                kmp a = kan.a.d.a(khq.a(this.b), driveId);
                if (a.i() != null) {
                    this.f = a.g();
                    return;
                }
                throw new kct(knc.a(driveId.b));
            } catch (kcs | ktv e2) {
                throw new kcu(driveId);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(kkf kkf, kmp kmp, String str) {
        String i = kmp.i();
        if (i == null) {
            kmh a = kkf.a(this.b, str);
            if (a != null) {
                a.u();
            }
            kmp.b(str);
        } else if (!i.equals(str)) {
            boolean r = r();
            StringBuilder sb = new StringBuilder(44);
            sb.append("Inconsistent resourceId, isSingleton = ");
            sb.append(r);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(kac kac) {
        if (kac.getClass() == getClass() && super.a(kac)) {
            kad kad = (kad) kac;
            if (!ius.a(this.e, kad.e) || !ius.a(this.g, kad.g) || !ius.a(this.f, kad.f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean a(kah kah) {
        if (super.a(kah) || ((kah instanceof kbj) && kai.a((kbj) kah, (kbd) this))) {
            return true;
        }
        return false;
    }
}
