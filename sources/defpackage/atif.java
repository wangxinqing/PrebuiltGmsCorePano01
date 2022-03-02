package defpackage;

import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: atif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atif {
    public DataInputStream a;
    public athg b;

    public atif(DataInputStream dataInputStream) {
        this.a = dataInputStream;
        if (dataInputStream.readUnsignedShort() != 2) {
            throw new IOException("Unrecognised protocol version");
        }
    }
}
