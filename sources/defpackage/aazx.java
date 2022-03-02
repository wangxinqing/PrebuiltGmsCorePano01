package defpackage;

import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aazx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aazx {
    protected final Map a = new HashMap();

    public final byte[] a(String str, long j, File file) {
        aazw aazw = new aazw(str, j);
        byte[] bArr = (byte[]) this.a.get(aazw);
        if (bArr != null) {
            return bArr;
        }
        try {
            byte[] a2 = aann.a(file);
            this.a.put(aazw, a2);
            return a2;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
