package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: fvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fvj implements baah {
    public final /* bridge */ /* synthetic */ InputStream a(Object obj) {
        return new ByteArrayInputStream((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ Object a(InputStream inputStream) {
        byte[] bArr = new byte[0];
        try {
            bArr = jjt.b(inputStream);
        } catch (IOException e) {
        } catch (Throwable th) {
            jjt.a((Closeable) inputStream);
            throw th;
        }
        jjt.a((Closeable) inputStream);
        return bArr;
    }
}
