package defpackage;

import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* renamed from: abub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abub extends tjd {
    final /* synthetic */ abuc a;

    public abub(abuc abuc) {
        this.a = abuc;
    }

    public final void a(String str, PayloadTransferUpdate payloadTransferUpdate) {
    }

    public final void a(String str, tjc tjc) {
        abuc.a.a("Received payload.", new Object[0]);
        if (!str.equals(this.a.g)) {
            iwd iwd = abuc.a;
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
            abuc abuc = this.a;
            if (!abuc.m) {
                acau acau = abuc.k;
                if (acau != null) {
                    acau.a(bArr);
                    return;
                }
                return;
            }
            abuc.a(bArr, str);
        } else {
            throw new IllegalArgumentException("Smart Setup should only be sending or receiving byte payloads!");
        }
    }
}
