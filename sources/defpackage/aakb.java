package defpackage;

import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Request;

/* renamed from: aakb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aakb implements igp {
    private final String a;
    private final boolean b;

    public aakb(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final void a(Object obj, Object obj2) {
        String str = this.a;
        boolean z = this.b;
        aajv aajv = new aajv((acwd) obj2);
        SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request = new SetIncludeInGlobalSearchCall$Request();
        setIncludeInGlobalSearchCall$Request.a = str;
        setIncludeInGlobalSearchCall$Request.b = null;
        setIncludeInGlobalSearchCall$Request.c = z;
        ((aajz) ((aajt) obj).x()).a(setIncludeInGlobalSearchCall$Request, (aajw) aajv);
    }
}
