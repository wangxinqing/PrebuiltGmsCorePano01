package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: ahxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahxa {
    final String a;
    final amzy b;

    public ahxa(String str, List list) {
        this.a = str;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, ahyw.c);
        this.b = amzy.a((Collection) arrayList);
    }
}
