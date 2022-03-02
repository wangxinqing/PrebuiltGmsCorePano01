package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: atfz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atfz {
    public static final atfz a = new atfz();

    private atfz() {
    }

    public static final audx a(auef auef, DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        InputStream atfw = new atfw(dataInputStream, Math.abs(readInt));
        if (readInt < 0) {
            atfw = new GZIPInputStream(atfw);
        }
        try {
            return (audx) auef.a(atfw);
        } finally {
            atfw.close();
        }
    }

    public static final void a(OutputStream outputStream, audx audx) {
        new DataOutputStream(outputStream).writeInt(audx.p());
        audx.a(outputStream);
    }
}
