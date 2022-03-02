package defpackage;

import com.google.android.gms.contextmanager.internal.QueryFilterParameters;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: jum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jum implements jxo {
    public final bsz a;
    public final int b;
    public final ArrayList c;
    private final QueryFilterParameters d;

    public jum(bsz bsz, int i, ArrayList arrayList, QueryFilterParameters queryFilterParameters) {
        this.a = bsz;
        this.b = i;
        this.c = arrayList;
        iva.a((Object) queryFilterParameters);
        this.d = queryFilterParameters;
    }

    public final QueryFilterParameters a() {
        return this.d;
    }

    public final boolean b() {
        ArrayList arrayList = this.c;
        return arrayList != null && !arrayList.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jum) {
            jum jum = (jum) obj;
            if (b() == jum.b()) {
                if (b()) {
                    if (jum.c.size() == this.c.size()) {
                        ArrayList arrayList = this.c;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            i++;
                            if (!jum.c.contains((jul) arrayList.get(i))) {
                            }
                        }
                    }
                    return false;
                }
                return this.d.equals(jum.d);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += Arrays.hashCode(new Object[]{(jul) arrayList.get(i2)});
            }
        } else {
            i = 0;
        }
        return i + Arrays.hashCode(new Object[]{this.d});
    }
}
