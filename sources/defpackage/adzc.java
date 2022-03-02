package defpackage;

import com.google.android.gms.wearable.internal.ChannelEventParcelable;

/* renamed from: adzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adzc implements Runnable {
    final /* synthetic */ ChannelEventParcelable a;
    final /* synthetic */ adzd b;

    public adzc(adzd adzd, ChannelEventParcelable channelEventParcelable) {
        this.b = adzd;
        this.a = channelEventParcelable;
    }

    public final void run() {
        this.a.a(this.b.a);
        this.a.a(this.b.a.e);
    }
}
