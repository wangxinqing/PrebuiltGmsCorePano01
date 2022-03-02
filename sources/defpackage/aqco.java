package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: aqco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqco implements aqay {
    private final amsv a;

    public aqco(amsv amsv) {
        this.a = amsv;
    }

    public final aqcb a(aqau aqau) {
        if (!((Boolean) this.a.a()).booleanValue()) {
            return aqcb.a;
        }
        azxh azxh = aqau.b;
        aqcl aqcl = (aqcl) azxh.a(aqcl.b);
        amrl.a((Object) aqcl, "%s missing from CallOptions.", (Object) aqcl.b);
        aqcn aqcn = new aqcn(aqcl);
        azxh azxh2 = new azxh(azxh);
        ArrayList arrayList = new ArrayList(azxh.f.size() + 1);
        arrayList.addAll(azxh.f);
        arrayList.add(aqcn);
        azxh2.f = Collections.unmodifiableList(arrayList);
        return aqcb.a(azxh2);
    }

    public final aqcc c() {
        return aqcc.a;
    }

    public final aqcb b() {
        return aqcb.a;
    }

    public final aqcb b(aqau aqau) {
        return aqcb.a;
    }

    public final aqcb a(aqav aqav) {
        return aqcb.a;
    }

    public final aqcc a(aqat aqat) {
        return aqcc.a;
    }

    public final aqcc a(aqaw aqaw) {
        return aqcc.a;
    }
}
