package defpackage;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

/* renamed from: hyd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hyd {
    public final String a;
    public final hxm b;
    public final byte[] c;
    public byte[] d = null;
    private byte[] e = null;

    public hyd(String str, hxm hxm) {
        this.a = str;
        this.b = hxm;
        this.c = ((hxn) hxm).a;
    }

    public static byte[] a(byte[] bArr, String str) {
        MessageDigest a2 = jhh.a("SHA-256");
        try {
            a2.update(str.getBytes("US-ASCII"));
            a2.update((byte) 32);
            a2.update(bArr);
            return a2.digest();
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public hyd(String str, byte[] bArr) {
        this.a = str;
        this.b = null;
        this.c = bArr;
    }

    public final boolean a(hxc hxc) {
        if (this.e == null) {
            this.e = a(this.c, this.a);
        }
        return hxc.a(this.e);
    }
}
