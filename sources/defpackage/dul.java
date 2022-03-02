package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: dul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dul {
    public static final List a = Collections.unmodifiableList(Arrays.asList(new String[]{"seqno", "action", "uri", "tag"}));
    private static final List b = Collections.unmodifiableList(Arrays.asList(new String[]{"seqno", "action", "uri", "doc_score"}));

    public static String a(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("section_") : "section_".concat(valueOf);
    }

    public static List a(Iterable iterable) {
        ArrayList arrayList = new ArrayList(b.size() + 17);
        arrayList.addAll(b);
        arrayList.add("created_timestamp");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(a((String) it.next()));
        }
        return arrayList;
    }
}
