package defpackage;

import com.android.volley.NetworkResponse;

/* renamed from: fvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fvc extends Exception {
    public final int a;
    public final NetworkResponse b;

    public fvc(String str, int i, NetworkResponse networkResponse) {
        super(str);
        this.a = i;
        this.b = networkResponse;
    }
}
