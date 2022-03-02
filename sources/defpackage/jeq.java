package defpackage;

import com.google.android.gms.common.stats.radio.NetworkActivityEvent;

/* renamed from: jeq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jeq {
    public final long a;
    public final int b;

    public jeq(long j, int i) {
        this.a = j;
        this.b = NetworkActivityEvent.getNetworkType(i);
    }
}
