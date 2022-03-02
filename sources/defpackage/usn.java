package defpackage;

import org.webrtc.DataChannel;

/* renamed from: usn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class usn extends usq {
    final /* synthetic */ usp a;
    private final DataChannel b;

    public usn(usp usp, DataChannel dataChannel) {
        this.a = usp;
        this.b = dataChannel;
    }

    public final void onBufferedAmountChange(long j) {
        umh umh = this.a.d;
        umh.a.a((Runnable) new umg(umh));
    }

    public final void onMessage(DataChannel.Buffer buffer) {
        umh umh = this.a.d;
        byte[] bArr = new byte[buffer.a.remaining()];
        buffer.a.get(bArr);
        umh.a.a((Runnable) new umf(umh, bArr));
    }

    public final void onStateChange() {
        if (this.b.a() == DataChannel.State.OPEN) {
            this.a.b.b((Object) this.b);
            this.a.a((Runnable) new usl(this));
        } else if (this.b.a() == DataChannel.State.CLOSED) {
            this.a.a((Runnable) new usm(this));
        }
    }
}
