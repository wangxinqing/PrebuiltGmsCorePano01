package defpackage;

import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

/* renamed from: uss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class uss implements SdpObserver {
    public void onCreateFailure(String str) {
        ((anih) ((anih) ulh.a.c()).a("uss", "onCreateFailure", 22, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("SdpObserver.onCreateFailure %s.", (Object) str);
    }

    public void onCreateSuccess(SessionDescription sessionDescription) {
        ((anih) ((anih) ulh.a.d()).a("uss", "onCreateSuccess", 12, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("SdpObserver.onCreateSuccess %s.", (Object) sessionDescription.a);
    }

    public void onSetFailure(String str) {
        ((anih) ((anih) ulh.a.c()).a("uss", "onSetFailure", 27, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("SdpObserver.onSetFailure %s.", (Object) str);
    }

    public void onSetSuccess() {
        ((anih) ((anih) ulh.a.d()).a("uss", "onSetSuccess", 17, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("SdpObserver.onSetSuccess.");
    }
}
