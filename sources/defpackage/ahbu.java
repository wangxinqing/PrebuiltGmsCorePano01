package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: ahbu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ahbu extends FilterInputStream {
    public ahbu(InputStream inputStream) {
        super(inputStream);
    }

    public int read(byte[] bArr) {
        return this.in.read(bArr);
    }
}
