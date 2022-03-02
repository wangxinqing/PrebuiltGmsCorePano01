package defpackage;

import java.io.DataInputStream;
import java.io.InputStream;

/* renamed from: atib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atib extends atii {
    private final athx c;
    private final athx[] d;
    private final int e;

    public atib(athg athg) {
        super(athg);
        DataInputStream dataInputStream = new DataInputStream(athg);
        this.c = athx.a(dataInputStream);
        int readShort = dataInputStream.readShort();
        this.e = readShort;
        this.d = new athx[readShort];
        for (int i = 0; i < this.e; i++) {
            this.d[i] = athx.a(dataInputStream);
        }
    }

    public final int a() {
        return ((athy) this.c.a).b;
    }

    public final InputStream b() {
        return ((athy) this.c.a).a;
    }
}
