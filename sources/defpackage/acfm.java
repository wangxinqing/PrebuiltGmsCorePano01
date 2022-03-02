package defpackage;

import android.os.Bundle;

/* renamed from: acfm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class acfm implements igp {
    private final long a;

    public acfm(long j) {
        this.a = j;
    }

    public final void a(Object obj, Object obj2) {
        long j = this.a;
        Bundle bundle = new Bundle();
        bundle.putLong("sessionId", j);
        ((acfj) ((acfr) obj).x()).a(new acfq(new acfo((acwd) obj2)), bundle);
    }
}
