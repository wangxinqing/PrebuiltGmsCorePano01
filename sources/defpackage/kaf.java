package defpackage;

import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: kaf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class kaf extends kae implements kbj {
    public Set f;

    protected kaf(kaj kaj, kkz kkz, AppIdentity appIdentity, knc knc, kbi kbi) {
        super(kaj, kkz, appIdentity, knc, kbi);
    }

    /* access modifiers changed from: protected */
    public final kah a(kam kam, khq khq, kmp kmp) {
        boolean z;
        if (this.f == null) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        kah b = b(kam, khq, kmp);
        if (b.k().equals(kaj.NULL) || this.f != null) {
            return b;
        }
        throw new IllegalStateException("Locally affected entry specs not populated");
    }

    /* access modifiers changed from: protected */
    public abstract kah b(kam kam, khq khq, kmp kmp);

    /* access modifiers changed from: protected */
    public final void b(Set set) {
        iva.a(this.f == null);
        this.f = Collections.unmodifiableSet(set);
    }

    public JSONObject h() {
        JSONObject h = super.h();
        if (this.f != null) {
            JSONArray jSONArray = new JSONArray();
            for (knc knc : this.f) {
                jSONArray.put(knc.a);
            }
            h.put("locallyAffectedEntrySpecs", jSONArray);
        }
        return h;
    }

    /* access modifiers changed from: protected */
    public int n() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.n()), this.f});
    }

    public final Set o() {
        iva.a(this.f != null, (Object) "Should only be called once the action is applied locally");
        return this.f;
    }

    protected kaf(kaj kaj, kkz kkz, AppIdentity appIdentity, knc knc, kbi kbi, kdo kdo) {
        super(kaj, kkz, appIdentity, knc, kbi, kdo);
    }

    protected kaf(kaj kaj, kkz kkz, JSONObject jSONObject) {
        super(kaj, kkz, jSONObject);
        JSONArray optJSONArray = jSONObject.optJSONArray("locallyAffectedEntrySpecs");
        if (optJSONArray != null) {
            this.f = new HashSet();
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.f.add(knc.a(optJSONArray.getLong(i)));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(kmp kmp, lfq lfq, kap kap) {
        try {
            kap.d(kmp);
            Set b = kap.b();
            int i = kap.c + 1;
            if (lfq != null) {
                lfq.b(b.size(), i);
            }
            b(b);
        } catch (lsj e) {
            if (e.getCause() instanceof kcq) {
                throw ((kcq) e.getCause());
            }
            throw new RuntimeException("Unexpected TraversalException!", e);
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(kac kac) {
        return super.a(kac) && ius.a(this.f, ((kaf) kac).f);
    }

    public final boolean a(kah kah) {
        if (super.a(kah)) {
            return true;
        }
        if ((kah instanceof kbj) && kai.a((Collection) o(), (Collection) ((kbj) kah).o())) {
            return true;
        }
        if (!(kah instanceof kbd) || !kai.a((kbj) this, (kbd) kah)) {
            return false;
        }
        return true;
    }
}
