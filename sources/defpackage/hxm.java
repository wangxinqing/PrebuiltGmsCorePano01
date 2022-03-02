package defpackage;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: hxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class hxm extends itr {
    private final int a;

    protected hxm(byte[] bArr) {
        iva.b(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    protected static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public abstract byte[] a();

    public final mby b() {
        return mbz.a((Object) a());
    }

    public final int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        mby b;
        if (obj == null || !(obj instanceof its)) {
            return false;
        }
        try {
            its its = (its) obj;
            if (its.c() != this.a || (b = its.b()) == null) {
                return false;
            }
            return Arrays.equals(a(), (byte[]) mbz.a(b));
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
