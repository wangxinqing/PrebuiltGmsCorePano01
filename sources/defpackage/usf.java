package defpackage;

import org.webrtc.SessionDescription;

/* renamed from: usf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class usf extends uss {
    final /* synthetic */ aosh a;
    final /* synthetic */ usp b;

    public usf(usp usp, aosh aosh) {
        this.b = usp;
        this.a = aosh;
    }

    public final void onCreateFailure(String str) {
        super.onCreateFailure(str);
        this.a.a((Throwable) new ust(str));
    }

    public final void onCreateSuccess(SessionDescription sessionDescription) {
        super.onCreateSuccess(sessionDescription);
        if (this.b.a(uso.CREATING_OFFER, uso.WAITING_FOR_ANSWER)) {
            this.a.b((Object) sessionDescription);
        } else {
            this.a.a((Throwable) new ust("Invalid state transition to WAITING_FOR_ANSWER."));
        }
    }
}
