package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: aluo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class aluo extends alua {
    public boolean e;
    private Set f;

    public aluo(alui alui, alsu alsu, alss alss) {
        super(alui, alsu, alss, true);
    }

    /* access modifiers changed from: protected */
    public final void a(alsk alsk) {
        if (this.e) {
            if (this.f == null) {
                this.f = Collections.newSetFromMap(new IdentityHashMap());
            }
            this.f.add(alsk);
        }
    }

    /* access modifiers changed from: package-private */
    public final Set e() {
        Set set = this.f;
        if (set == null) {
            return Collections.emptySet();
        }
        Set unmodifiableSet = Collections.unmodifiableSet(set);
        this.f = null;
        return unmodifiableSet;
    }
}
