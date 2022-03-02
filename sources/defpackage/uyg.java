package defpackage;

import android.os.SystemClock;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.Strategy;
import java.security.MessageDigest;
import java.util.Date;

/* renamed from: uyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uyg {
    public final String a;
    public final Message b;
    public final Strategy c;
    public final long d = SystemClock.elapsedRealtime();
    public final ClientAppIdentifier e;
    public vdo f;

    public uyg(ClientAppIdentifier clientAppIdentifier, Message message, Strategy strategy) {
        this.a = a(clientAppIdentifier, message);
        this.b = message;
        this.c = strategy;
        this.e = clientAppIdentifier;
    }

    public final String toString() {
        long a2 = a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        long j = this.d;
        String valueOf = String.valueOf(this.e);
        String str = this.a;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(new Date(j + (currentTimeMillis - elapsedRealtime2)));
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 86 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Publication{client=");
        sb.append(valueOf);
        sb.append(", id=");
        sb.append(str);
        sb.append(", strategy=");
        sb.append(valueOf2);
        sb.append(", startTime=");
        sb.append(valueOf3);
        sb.append(", expiresInMillis=");
        sb.append(a2 - elapsedRealtime);
        sb.append('}');
        return sb.toString();
    }

    public static String a(ClientAppIdentifier clientAppIdentifier, Message message) {
        MessageDigest b2 = jhg.b("SHA1");
        if (b2 != null) {
            b2.update(clientAppIdentifier.d.getBytes());
            String str = clientAppIdentifier.c.c;
            if (str != null) {
                b2.update(str.getBytes());
            }
            b2.update(message.d.getBytes());
            b2.update(message.c.getBytes());
            b2.update(message.b);
            String valueOf = String.valueOf(jhy.d(b2.digest()));
            return valueOf.length() == 0 ? new String("p#") : "p#".concat(valueOf);
        }
        throw new IllegalStateException("No SHA1 implementation");
    }

    public final long a() {
        return this.d + vds.a(this.c);
    }
}
