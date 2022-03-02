package defpackage;

import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Request;

/* renamed from: aahi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aahi implements igp {
    private final String a;

    public aahi(String str) {
        this.a = str;
    }

    public final void a(Object obj, Object obj2) {
        String str = this.a;
        aagz aagz = new aagz((acwd) obj2);
        ((aahd) ((aahl) obj).x()).a(new ClearDebugUiCacheCall$Request(str), (aaha) aagz);
    }
}
