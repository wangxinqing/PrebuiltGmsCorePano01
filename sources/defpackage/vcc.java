package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: vcc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vcc extends vbw {
    public final UUID b() {
        ByteBuffer wrap = ByteBuffer.wrap(this.a);
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    public final Short c() {
        byte[] bArr = this.a;
        if (bArr.length >= 18) {
            return Short.valueOf(ByteBuffer.wrap(bArr).getShort(16));
        }
        return null;
    }

    public final Short d() {
        byte[] bArr = this.a;
        if (bArr.length == 20) {
            return Short.valueOf(ByteBuffer.wrap(bArr).getShort(18));
        }
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(b());
        String valueOf2 = String.valueOf(c());
        String valueOf3 = String.valueOf(d());
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("IBeaconIdPrefix{proximityUuid=");
        sb.append(valueOf);
        sb.append(", major=");
        sb.append(valueOf2);
        sb.append(", minor=");
        sb.append(valueOf3);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vcc(byte[] bArr) {
        super(bArr);
        int length = bArr.length;
        boolean z = true;
        if (!(length == 16 || length == 18 || length == 20)) {
            z = false;
        }
        iva.b(z, "Prefix must be a UUID, a UUID and a major, or a UUID, a major, and a minor.");
    }
}
