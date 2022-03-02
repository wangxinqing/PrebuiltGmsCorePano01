package defpackage;

import org.webrtc.SessionDescription;

/* renamed from: ush  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ush extends uss {
    final /* synthetic */ aosh a;
    final /* synthetic */ SessionDescription b;

    public ush(aosh aosh, SessionDescription sessionDescription) {
        this.a = aosh;
        this.b = sessionDescription;
    }

    public final void onSetFailure(String str) {
        super.onSetFailure(str);
        this.a.a((Throwable) new ust(str));
    }

    public final void onSetSuccess() {
        super.onSetSuccess();
        this.a.b((Object) this.b);
    }
}
