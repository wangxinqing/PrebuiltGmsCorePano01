package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Set;

/* renamed from: ess  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ess implements ibj, ibl {
    public final Bundle a;

    public ess(Bundle bundle) {
        this.a = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ess)) {
            return false;
        }
        Bundle bundle = this.a;
        Bundle bundle2 = ((ess) obj).a;
        if (bundle.size() == bundle2.size()) {
            Set<String> keySet = bundle.keySet();
            if (keySet.containsAll(bundle2.keySet())) {
                for (String str : keySet) {
                    if (!ius.a(bundle.get(str), bundle2.get(str))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
