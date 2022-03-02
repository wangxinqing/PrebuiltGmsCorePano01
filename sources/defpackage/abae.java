package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* renamed from: abae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abae implements ibj {
    public final Bundle a;

    private abae(Bundle bundle) {
        this.a = bundle;
    }

    public static abae a(Bundle bundle) {
        return new abae(bundle);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof abae)) {
            return false;
        }
        Bundle bundle = this.a;
        Bundle bundle2 = ((abae) obj).a;
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
        ArrayList arrayList = new ArrayList(this.a.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        int i = 17;
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) arrayList.get(i2);
            i = (((i * 31) + str.hashCode()) * 31) + Arrays.hashCode(new Object[]{this.a.get(str)});
        }
        return i;
    }
}
