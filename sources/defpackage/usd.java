package defpackage;

import android.nfc.tech.IsoDep;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: usd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class usd implements Closeable {
    public abstract IsoDep a();

    public final urw a(urv urv) {
        urw urw;
        a().setTimeout((int) aymi.a.a().aw());
        IsoDep a = a();
        ByteBuffer allocate = ByteBuffer.allocate(urv.e.length + 4 + urv.f.length + urv.g.length + urv.h.length + urv.i.length);
        allocate.put(urv.a);
        allocate.put(urv.b);
        allocate.put(urv.c);
        allocate.put(urv.d);
        allocate.put(urv.e);
        allocate.put(urv.f);
        allocate.put(urv.g);
        allocate.put(urv.h);
        allocate.put(urv.i);
        byte[] transceive = a.transceive(allocate.array());
        int length = transceive.length;
        if (length < 2) {
            ((anih) ((anih) ulh.a.c()).a("urw", "b", 254, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse response %s because the byte array was too short", (Object) ulu.a(transceive));
            urw = null;
        } else {
            ByteBuffer wrap = ByteBuffer.wrap(transceive);
            byte[] bArr = new byte[(length - 2)];
            wrap.get(bArr);
            byte[] bArr2 = new byte[2];
            wrap.get(bArr2);
            urw = new urw(bArr, bArr2);
        }
        return urw == null ? urw.b() : urw;
    }

    public final int b() {
        return a().isExtendedLengthApduSupported() ? Math.min(65535, a().getMaxTransceiveLength() - 9) : Math.min(255, a().getMaxTransceiveLength() - 6);
    }

    /* JADX INFO: finally extract failed */
    public final boolean c() {
        if (a().isConnected()) {
            return true;
        }
        try {
            a().connect();
            boolean isConnected = a().isConnected();
            jjt.a((Closeable) a());
            return isConnected;
        } catch (IOException e) {
            jjt.a((Closeable) a());
            return false;
        } catch (Throwable th) {
            jjt.a((Closeable) a());
            throw th;
        }
    }

    public final void close() {
        jjt.a((Closeable) a());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof usd) {
            return amqx.a(a().getTag(), ((usd) obj).a().getTag());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a().getTag()});
    }

    public final void a(String str) {
        a().connect();
        if (a(new urv((byte) 0, (byte) -92, (byte) 4, (byte) 0, jjp.a(str), 0)).c()) {
            jjt.a((Closeable) this);
            throw new IOException(String.format("Failed to bind to the remote NFC service %s.", new Object[]{str}));
        }
    }
}
