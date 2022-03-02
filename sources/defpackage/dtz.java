package defpackage;

import com.google.android.gms.appdatasearch.SearchResults;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dtz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dtz {
    public final int a;
    public final /* synthetic */ SearchResults b;
    private final dua c;

    public dtz(SearchResults searchResults, int i, dua dua) {
        this.b = searchResults;
        this.c = dua;
        this.a = i;
    }

    public final dty a(String str) {
        Map[] mapArr = this.c.c;
        int i = this.b.h[this.a];
        Map map = mapArr[i];
        if (map == null) {
            map = new HashMap();
            mapArr[i] = map;
        }
        dty dty = (dty) map.get(str);
        if (dty != null) {
            return dty;
        }
        SearchResults searchResults = this.b;
        int[] intArray = searchResults.e[searchResults.h[this.a]].getIntArray(str);
        SearchResults searchResults2 = this.b;
        byte[] byteArray = searchResults2.f[searchResults2.h[this.a]].getByteArray(str);
        if (intArray == null || byteArray == null) {
            return null;
        }
        dty dty2 = new dty(intArray, byteArray);
        map.put(str, dty2);
        return dty2;
    }

    public final String b(String str) {
        dty a2 = a(str);
        if (a2 != null) {
            return a2.b(this.a);
        }
        return null;
    }

    public final String a() {
        byte[] bArr;
        dua dua = this.c;
        if (dua.b == null) {
            SearchResults searchResults = this.b;
            int[] iArr = searchResults.b;
            if (iArr == null || (bArr = searchResults.c) == null) {
                return null;
            }
            dua.b = new dty(iArr, bArr);
        }
        return this.c.b.b(this.a);
    }
}
