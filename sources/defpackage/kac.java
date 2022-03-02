package defpackage;

import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.auth.CallingAppInfo;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Arrays;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: kac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class kac implements kah {
    private static final ith e = new ith("AbstractAction", "");
    public final kaj a;
    public final kkz b;
    public final AppIdentity c;
    public kdo d;
    private final kbi f;

    protected kac(kaj kaj, kkz kkz, AppIdentity appIdentity, kbi kbi) {
        this(kaj, kkz, appIdentity, kbi, kdo.a);
    }

    /* access modifiers changed from: protected */
    public abstract kah a(kam kam, khq khq);

    public final kao a(kam kam) {
        return new kao(this, a(kam, d(kam.a)));
    }

    public final kkz a() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public abstract void a(kan kan, ClientContext clientContext);

    /* access modifiers changed from: protected */
    public abstract DriveId b(kkf kkf);

    /* access modifiers changed from: protected */
    public void b(kan kan) {
    }

    public boolean b(kah kah) {
        return false;
    }

    public final kdo c() {
        return this.d;
    }

    public void c(kan kan) {
    }

    /* access modifiers changed from: protected */
    public String d() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String e() {
        return null;
    }

    /* access modifiers changed from: protected */
    public MetadataBundle f() {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean g() {
        return true;
    }

    public JSONObject h() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestingAppIdentity", this.c.a());
        jSONObject.put("operationType", this.a.y);
        jSONObject.put("permissionEnforcement", this.f.c);
        kdo kdo = this.d;
        jSONObject.put("conflictStrategy", kdo.b);
        jSONObject.put("notifyOnCompletion", kdo.c);
        jSONObject.put("usesDefaultAccount", kdo.d);
        jSONObject.put("operationTag", new JSONArray(kdo.e));
        jSONObject.putOpt("binderPackageName", kdo.f);
        jSONObject.put("mustCreateNewRevision", kdo.g);
        return jSONObject;
    }

    public final AppIdentity i() {
        return this.c;
    }

    public boolean j() {
        return false;
    }

    public final kaj k() {
        return this.a;
    }

    public boolean l() {
        return false;
    }

    /* access modifiers changed from: protected */
    public String m() {
        return String.format("Action type=%s, account=%s, requestingAppIdentity=%s, enforcementMode=%s", new Object[]{this.a, this.b, this.c, this.f});
    }

    /* access modifiers changed from: protected */
    public int n() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.f, this.d});
    }

    protected kac(kaj kaj, kkz kkz, AppIdentity appIdentity, kbi kbi, kdo kdo) {
        iva.a((Object) kaj, (Object) "type must not be null");
        this.a = kaj;
        iva.a((Object) kkz, (Object) "account must not be null");
        this.b = kkz;
        iva.a((Object) appIdentity, (Object) "app identity must not be null");
        this.c = appIdentity;
        iva.a((Object) kbi, (Object) "enforcement mode must not be null");
        this.f = kbi;
        iva.a((Object) kdo, (Object) "execution context must not be null");
        this.d = kdo;
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        return this.d.a();
    }

    public final khq c(kkf kkf) {
        khq b2 = kkf.b(this.b.b, this.c);
        if (b2 != null) {
            return b2;
        }
        throw new kcm(this.c);
    }

    public final khq d(kkf kkf) {
        if (this.f == kbi.NONE) {
            return khq.a(this.b);
        }
        return c(kkf);
    }

    public final kdm a(kkf kkf) {
        if (this.d.c) {
            try {
                DriveId b2 = b(kkf);
                if (b2 != null) {
                    return new kdm(this.d, b2, d(), e(), f(), d(kkf), s(), this.a);
                }
                e.b("AbstractAction", "Cannot notify on action completion: null DriveId!");
                return null;
            } catch (kcm e2) {
            }
        }
        return null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected kac(defpackage.kaj r8, defpackage.kkz r9, org.json.JSONObject r10) {
        /*
            r7 = this;
            java.lang.String r0 = "requestingAppIdentity"
            org.json.JSONObject r0 = r10.getJSONObject(r0)
            com.google.android.gms.drive.auth.AppIdentity r4 = com.google.android.gms.drive.auth.AppIdentity.a(r0)
            java.lang.String r0 = "permissionEnforcement"
            java.lang.String r0 = r10.getString(r0)
            kbi[] r1 = defpackage.kbi.values()
            int r2 = r1.length
            r3 = 0
        L_0x0016:
            if (r3 < r2) goto L_0x0034
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = java.lang.String.valueOf(r0)
            java.lang.String r10 = "Unknown permission enforcement mode: "
            int r0 = r9.length()
            if (r0 != 0) goto L_0x002c
            java.lang.String r9 = new java.lang.String
            r9.<init>(r10)
            goto L_0x0030
        L_0x002c:
            java.lang.String r9 = r10.concat(r9)
        L_0x0030:
            r8.<init>(r9)
            throw r8
        L_0x0034:
            r5 = r1[r3]
            java.lang.String r6 = r5.c
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0041
            int r3 = r3 + 1
            goto L_0x0016
        L_0x0041:
            kdo r6 = defpackage.kdo.a((org.json.JSONObject) r10)
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kac.<init>(kaj, kkz, org.json.JSONObject):void");
    }

    public void a(kah kah, kkf kkf, long j) {
        throw new UnsupportedOperationException();
    }

    public final void a(kan kan) {
        lsm lsm = kan.a;
        try {
            khq d2 = d(lsm.d);
            kan.d.a(new CallingAppInfo(d2, 0));
            b(kan);
            a(kan, d2.a(lsm.b));
            if (g()) {
                kkf kkf = lsm.d;
                iva.a((Object) s(), (Object) "Must have entry spec after apply locally");
                try {
                    kmh d3 = kkf.d(s().a);
                    if (d3 != null) {
                        if (d3.b != null) {
                            lsm.z.a(d(kkf), d3.b, new lnk(302, 2, false, false));
                            return;
                        }
                    }
                    e.b("AbstractAction", "No driveId data in db to sync entry after apply on server: %s", m());
                } catch (kcm e2) {
                    e.b("AbstractAction", "Entry not authorized on the app after applying action on server.", (Throwable) e2);
                } catch (VolleyError e3) {
                    e = e3;
                    e.b("AbstractAction", "Unable to sync entry after applying action on server.", e);
                } catch (eif e4) {
                    e = e4;
                    e.b("AbstractAction", "Unable to sync entry after applying action on server.", e);
                } catch (RuntimeException e5) {
                    e.c("AbstractAction", "Runtime exception while syncing entry after apply on server.", e5);
                }
            }
        } catch (UserRecoverableAuthException e6) {
            e.b("AbstractAction", "Failed to apply due to recoverable auth exception.");
            throw e6;
        } catch (eif e7) {
            e.b("AbstractAction", "App is not authorized on the server. Removing from local cache.");
            kkf kkf2 = lsm.d;
            try {
                kkf2.b(this.b.b, c(kkf2).b);
            } catch (kcm e8) {
            }
            throw new kcm(this.c);
        } catch (VolleyError e9) {
            throw kbn.a(e9);
        }
    }

    public final boolean a(DriveId driveId, kkf kkf) {
        try {
            return driveId.equals(b(kkf));
        } catch (kcm e2) {
            return false;
        }
    }

    public final boolean a(AppIdentity appIdentity, kkz kkz) {
        return this.c.equals(appIdentity) && this.b.equals(kkz);
    }

    public final boolean a(Set set) {
        return set.contains(this.a);
    }

    /* access modifiers changed from: protected */
    public boolean a(kac kac) {
        return this.a.equals(kac.a) && this.b.equals(kac.b) && this.c.equals(kac.c) && this.f.equals(kac.f) && this.d.equals(kac.d);
    }

    public boolean a(kah kah) {
        knc s = kah.s();
        if (s == null) {
            e.b("AbstractAction", "Action provided to shouldBlock has null EntrySpec: %s", kah.toString());
            return true;
        } else if (s() != null) {
            return s.equals(s());
        } else {
            e.b("AbstractAction", "Executing shouldBlock on an action with null EntrySpec: %s", toString());
            return true;
        }
    }

    public final boolean a(kkz kkz) {
        return this.b.equals(kkz);
    }
}
