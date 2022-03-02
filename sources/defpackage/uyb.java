package defpackage;

import android.os.SystemClock;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;

/* renamed from: uyb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uyb {
    final ClientAppIdentifier a;
    final long b = SystemClock.elapsedRealtime();
    final int c;

    public uyb(ClientAppIdentifier clientAppIdentifier, int i) {
        this.a = clientAppIdentifier;
        this.c = i;
    }

    public final int a() {
        return (int) (SystemClock.elapsedRealtime() - this.b);
    }
}
