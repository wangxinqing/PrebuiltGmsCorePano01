package defpackage;

import com.android.volley.RequestQueue;

/* renamed from: npa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class npa {
    public final aoru a;
    public final RequestQueue b;
    public final noa c;

    public npa(aoru aoru, RequestQueue requestQueue, noa noa) {
        this.a = aoru;
        this.b = requestQueue;
        this.c = noa;
    }

    public static lyf a(String str, String str2) {
        aucd o = lyf.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        lyf lyf = (lyf) o.b;
        str.getClass();
        int i = lyf.a | 1;
        lyf.a = i;
        lyf.b = str;
        str2.getClass();
        lyf.a = i | 2;
        lyf.c = str2;
        return (lyf) o.i();
    }
}
