package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: csj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class csj extends au {
    public final List a;

    public csj(List list) {
        this.a = list;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((as) list.get(i), new csi(this));
        }
        if (list.isEmpty()) {
            b((Object) Collections.emptyList());
        }
    }
}
