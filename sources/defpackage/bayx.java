package defpackage;

import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.Logging;
import org.webrtc.audio.WebRtcAudioTrack;

/* renamed from: bayx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bayx extends Thread {
    public volatile boolean a = true;
    final /* synthetic */ WebRtcAudioTrack b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bayx(WebRtcAudioTrack webRtcAudioTrack, String str) {
        super(str);
        this.b = webRtcAudioTrack;
    }

    public final void run() {
        boolean z;
        boolean z2;
        Process.setThreadPriority(-19);
        String valueOf = String.valueOf(bayy.a());
        Logging.a("WebRtcAudioTrackExternal", valueOf.length() == 0 ? new String("AudioTrackThread") : "AudioTrackThread".concat(valueOf));
        WebRtcAudioTrack webRtcAudioTrack = this.b;
        int i = WebRtcAudioTrack.g;
        if (webRtcAudioTrack.e.getPlayState() == 3) {
            z = true;
        } else {
            z = false;
        }
        WebRtcAudioTrack.a(z);
        this.b.a(0);
        int capacity = this.b.d.capacity();
        while (this.a) {
            WebRtcAudioTrack.nativeGetPlayoutData(this.b.a, capacity);
            if (capacity <= this.b.d.remaining()) {
                z2 = true;
            } else {
                z2 = false;
            }
            WebRtcAudioTrack.a(z2);
            boolean z3 = this.b.f;
            WebRtcAudioTrack webRtcAudioTrack2 = this.b;
            AudioTrack audioTrack = webRtcAudioTrack2.e;
            ByteBuffer byteBuffer = webRtcAudioTrack2.d;
            int i2 = Build.VERSION.SDK_INT;
            int write = audioTrack.write(byteBuffer, capacity, 0);
            if (write != capacity) {
                StringBuilder sb = new StringBuilder(60);
                sb.append("AudioTrack.write played invalid number of bytes: ");
                sb.append(write);
                Logging.b("WebRtcAudioTrackExternal", sb.toString());
                if (write < 0) {
                    this.a = false;
                    WebRtcAudioTrack webRtcAudioTrack3 = this.b;
                    StringBuilder sb2 = new StringBuilder(36);
                    sb2.append("AudioTrack.write failed: ");
                    sb2.append(write);
                    String valueOf2 = String.valueOf(sb2.toString());
                    Logging.b("WebRtcAudioTrackExternal", valueOf2.length() == 0 ? new String("Run-time playback error: ") : "Run-time playback error: ".concat(valueOf2));
                    bayy.a("WebRtcAudioTrackExternal", webRtcAudioTrack3.b, webRtcAudioTrack3.c);
                }
            }
            this.b.d.rewind();
        }
    }
}
