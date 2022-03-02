package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: auqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auqb {
    public final String a;
    public final amzy b;

    public auqb() {
        this(" -_", Arrays.asList(new String[]{"Sony", "HTC", "Samsung", "sonyericsson", "MICROMAX", "huawei", "nook", "ZTE"}));
    }

    public static final String a(String str, String str2) {
        return str2 != null ? !str2.isEmpty() ? str2 : str : "";
    }

    public auqb(String str, List list) {
        this.a = str;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).toLowerCase());
        }
        Collections.reverse(arrayList);
        this.b = amzy.a((Collection) arrayList);
    }
}
