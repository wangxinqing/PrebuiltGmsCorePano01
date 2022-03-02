package defpackage;

import java.io.DataInputStream;
import java.io.InputStream;

/* renamed from: atii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class atii extends athw implements athh {
    protected final athg a;
    public final int b;

    public atii(athg athg) {
        this.a = athg;
        DataInputStream dataInputStream = new DataInputStream(athg);
        a(dataInputStream.readUnsignedShort());
        this.b = dataInputStream.readUnsignedShort();
    }

    public abstract int a();

    public abstract InputStream b();

    public final void d() {
        athg athg = this.a;
        if (athg != null) {
            athg.a();
        }
    }
}
