package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: lrl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lrl {
    public static List a(List list, jks jks) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (jks.a(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
