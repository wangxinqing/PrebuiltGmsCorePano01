package defpackage;

import com.android.volley.Request;
import com.android.volley.RequestQueue;

/* renamed from: bey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bey implements RequestQueue.RequestFilter {
    final /* synthetic */ Object a;

    public bey(Object obj) {
        this.a = obj;
    }

    public final boolean apply(Request request) {
        return request.getTag() == this.a;
    }
}
