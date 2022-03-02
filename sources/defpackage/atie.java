package defpackage;

import java.io.DataInputStream;
import java.io.InputStream;

/* renamed from: atie  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atie extends atii {
    private final athy c;

    public atie(athg athg) {
        super(athg);
        DataInputStream dataInputStream = new DataInputStream(athg);
        this.c = new athy(dataInputStream.readUTF(), dataInputStream.readInt(), athg);
    }

    public final int a() {
        return this.c.b;
    }

    public final InputStream b() {
        return this.c.a;
    }
}
