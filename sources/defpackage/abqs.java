package defpackage;

import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* renamed from: abqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abqs extends tjd {
    final /* synthetic */ abqw a;

    public abqs(abqw abqw) {
        this.a = abqw;
    }

    public final void a(String str, PayloadTransferUpdate payloadTransferUpdate) {
    }

    public final void a(String str, tjc tjc) {
        abqw.b.a("Received payload.", new Object[0]);
        if (!str.equals(this.a.g)) {
            iwd iwd = abqw.b;
            String str2 = this.a.g;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 62 + String.valueOf(str).length());
            sb.append("Connected to ");
            sb.append(str2);
            sb.append(", but receiving payloads from ");
            sb.append(str);
            sb.append("! Ignoring payload.");
            iwd.e(sb.toString(), new Object[0]);
        } else if (tjc.b == 1) {
            byte[] bArr = tjc.c;
            abqw abqw = this.a;
            if (!abqw.k.e) {
                acau acau = abqw.e;
                if (acau != null) {
                    acau.a(bArr);
                    return;
                }
                return;
            }
            abqw.a(bArr, str);
        } else {
            throw new IllegalArgumentException("Smart Setup should only be sending or receiving byte payloads!");
        }
    }
}
