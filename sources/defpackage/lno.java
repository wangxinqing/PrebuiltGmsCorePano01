package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: lno  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lno {
    public final List a;
    public final String b;
    public final Long c;

    public lno(List list, String str, Long l) {
        iva.a((Object) list);
        this.a = Collections.unmodifiableList(list);
        this.b = str;
        this.c = l;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[4];
        boolean z = false;
        objArr[0] = Integer.valueOf(this.a.size());
        String str = this.b;
        objArr[1] = str;
        if (str != null) {
            z = true;
        }
        objArr[2] = Boolean.valueOf(z);
        objArr[3] = this.c;
        return String.format(locale, "ResultsPage[numFiles=%d, nextPageToken=%s, isClipped=%b, largestChangestamp=%d]", objArr);
    }
}
