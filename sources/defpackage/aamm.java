package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.search.queries.QueryCall$Request;

/* renamed from: aamm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aamm extends iby implements aalw {
    private static final ibq a = new ibq("SearchIndex.QUERIES_API", l, b);
    private static final ibg b = new ibg();
    private static final ibn l = new aaml();

    public aamm(Context context, aafk aafk) {
        super(context, a, (ibm) aafk, ibx.a);
    }

    public final acwa a(String str, String str2, String[] strArr, int i, int i2, QuerySpecification querySpecification) {
        QueryCall$Request queryCall$Request = new QueryCall$Request();
        queryCall$Request.g = new Bundle();
        queryCall$Request.g.putLong("request_timestamp_ms", System.currentTimeMillis());
        queryCall$Request.a = str;
        queryCall$Request.b = str2;
        queryCall$Request.c = strArr;
        queryCall$Request.d = i;
        queryCall$Request.e = i2;
        queryCall$Request.f = querySpecification;
        iha b2 = ihb.b();
        b2.a = new aamk(queryCall$Request);
        return a(b2.a());
    }
}
