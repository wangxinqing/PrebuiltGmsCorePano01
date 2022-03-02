package defpackage;

import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Request;

/* renamed from: aahh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aahh implements igp {
    private final String a;

    public aahh(String str) {
        this.a = str;
    }

    public final void a(Object obj, Object obj2) {
        String str = this.a;
        aagz aagz = new aagz((acwd) obj2);
        ((aahd) ((aahl) obj).x()).a(new RequestAppIndexingUpdateIndexCall$Request(str), (aaha) aagz);
    }
}
