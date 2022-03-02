package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: aovc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aovc {
    static {
        Charset.forName("UTF-8");
    }

    public static aozc a(aoza aoza) {
        aucd o = aozc.c.o();
        int i = aoza.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((aozc) o.b).a = i;
        aucx aucx = aoza.b;
        int size = aucx.size();
        for (int i2 = 0; i2 < size; i2++) {
            aoyz aoyz = (aoyz) aucx.get(i2);
            aucd o2 = aozb.e.o();
            aoyu aoyu = aoyz.a;
            if (aoyu == null) {
                aoyu = aoyu.d;
            }
            String str = aoyu.a;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            str.getClass();
            ((aozb) o2.b).a = str;
            int b = aoyv.b(aoyz.b);
            int i3 = 1;
            if (b == 0) {
                b = 1;
            }
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ((aozb) o2.b).b = aoyv.a(b);
            int b2 = aozh.b(aoyz.d);
            if (b2 != 0) {
                i3 = b2;
            }
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ((aozb) o2.b).d = aozh.a(i3);
            int i4 = aoyz.c;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ((aozb) o2.b).c = i4;
            aozb aozb = (aozb) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aozc aozc = (aozc) o.b;
            aozb.getClass();
            if (!aozc.b.a()) {
                aozc.b = aucj.a(aozc.b);
            }
            aozc.b.add(aozb);
        }
        return (aozc) o.i();
    }

    public static void b(aoza aoza) {
        int i = aoza.a;
        aucx aucx = aoza.b;
        int size = aucx.size();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (int i3 = 0; i3 < size; i3++) {
            aoyz aoyz = (aoyz) aucx.get(i3);
            int b = aoyv.b(aoyz.b);
            if (b != 0 && b == 3) {
                if (aoyz.a != null) {
                    int b2 = aozh.b(aoyz.d);
                    if (b2 != 0 && b2 == 2) {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(aoyz.c)}));
                    }
                    int b3 = aoyv.b(aoyz.b);
                    if (b3 != 0 && b3 == 2) {
                        throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(aoyz.c)}));
                    }
                    if (aoyz.c == i) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    aoyu aoyu = aoyz.a;
                    if (aoyu == null) {
                        aoyu = aoyu.d;
                    }
                    int b4 = aoyt.b(aoyu.c);
                    if (b4 == 0 || b4 != 5) {
                        z2 = false;
                    }
                    i2++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(aoyz.c)}));
                }
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }

    public static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
