package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.ads.afma.proto2api.c;
import com.google.android.gms.ads.identifier.d;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;

/* renamed from: nop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class nop implements Callable {
    private final nou a;

    public nop(nou nou) {
        this.a = nou;
    }

    public final Object call() {
        Context context = this.a.a;
        aucd o = c.Q.o();
        d dVar = new d(context);
        dVar.a();
        com.google.android.gms.ads.identifier.c b = dVar.b();
        String str = b.a;
        if (str != null && str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(str);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            str = Base64.encodeToString(bArr, 11);
        }
        if (str != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            c cVar = (c) o.b;
            str.getClass();
            int i = cVar.c | 128;
            cVar.c = i;
            cVar.L = str;
            boolean z = b.b;
            int i2 = i | 512;
            cVar.c = i2;
            cVar.N = z;
            cVar.M = 5;
            cVar.c = i2 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        return (c) o.i();
    }
}
