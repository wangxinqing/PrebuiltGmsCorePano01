package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: cgw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cgw {
    public static List a(List list, Number number) {
        ArrayList arrayList = new ArrayList(list.subList(0, Math.min(list.size(), 5)));
        arrayList.addAll(Collections.nCopies(5 - arrayList.size(), number));
        if (arrayList.size() == 5) {
            return arrayList;
        }
        String valueOf = String.valueOf(arrayList);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("Logic error: ");
        sb.append(valueOf);
        sb.append(" should be exactly 5 long ");
        throw new IllegalArgumentException(sb.toString());
    }
}
