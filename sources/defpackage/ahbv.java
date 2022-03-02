package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: ahbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ahbv extends FilterOutputStream {
    public ahbv(OutputStream outputStream) {
        super(outputStream);
    }

    public void write(byte[] bArr) {
        this.out.write(bArr);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
    }
}
