package defpackage;

import java.util.concurrent.Callable;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: bayv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class bayv implements Callable {
    private final WebRtcAudioRecord a;

    public bayv(WebRtcAudioRecord webRtcAudioRecord) {
        this.a = webRtcAudioRecord;
    }

    public final Object call() {
        this.a.a(true);
        return "Scheduled task is done";
    }
}
