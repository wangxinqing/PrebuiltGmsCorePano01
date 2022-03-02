package defpackage;

import android.util.Base64;

/* renamed from: cmm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class cmm {
    public static cml d() {
        cml cml = new cml();
        cml.a(clp.DEFAULT);
        return cml;
    }

    public abstract String a();

    public abstract byte[] b();

    public abstract clp c();

    public final String toString() {
        String str;
        Object[] objArr = new Object[3];
        objArr[0] = a();
        objArr[1] = c();
        if (b() != null) {
            str = Base64.encodeToString(b(), 2);
        } else {
            str = "";
        }
        objArr[2] = str;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
