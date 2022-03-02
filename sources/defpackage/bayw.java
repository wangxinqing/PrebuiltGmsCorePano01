package defpackage;

import android.media.AudioRecord;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.Logging;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: bayw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bayw extends Thread {
    public volatile boolean a = true;
    final /* synthetic */ WebRtcAudioRecord b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bayw(WebRtcAudioRecord webRtcAudioRecord, String str) {
        super(str);
        this.b = webRtcAudioRecord;
    }

    public final void run() {
        Process.setThreadPriority(-19);
        String valueOf = String.valueOf(bayy.a());
        Logging.a("WebRtcAudioRecordExternal", valueOf.length() == 0 ? new String("AudioRecordThread") : "AudioRecordThread".concat(valueOf));
        WebRtcAudioRecord.b(this.b.e.getRecordingState() == 3);
        WebRtcAudioRecord.a(0);
        System.nanoTime();
        while (this.a) {
            WebRtcAudioRecord webRtcAudioRecord = this.b;
            AudioRecord audioRecord = webRtcAudioRecord.e;
            ByteBuffer byteBuffer = webRtcAudioRecord.d;
            int read = audioRecord.read(byteBuffer, byteBuffer.capacity());
            if (read != this.b.d.capacity()) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("AudioRecord.read failed: ");
                sb.append(read);
                String sb2 = sb.toString();
                Logging.b("WebRtcAudioRecordExternal", sb2);
                if (read == -3) {
                    this.a = false;
                    WebRtcAudioRecord webRtcAudioRecord2 = this.b;
                    String valueOf2 = String.valueOf(sb2);
                    Logging.b("WebRtcAudioRecordExternal", valueOf2.length() == 0 ? new String("Run-time recording error: ") : "Run-time recording error: ".concat(valueOf2));
                    bayy.a("WebRtcAudioRecordExternal", webRtcAudioRecord2.a, webRtcAudioRecord2.b);
                }
            } else {
                boolean z = this.b.f;
                if (this.a) {
                    WebRtcAudioRecord webRtcAudioRecord3 = this.b;
                    webRtcAudioRecord3.nativeDataIsRecorded(webRtcAudioRecord3.c, read);
                }
                bayr bayr = this.b.g;
            }
        }
        try {
            AudioRecord audioRecord2 = this.b.e;
            if (audioRecord2 != null) {
                audioRecord2.stop();
                WebRtcAudioRecord.a(1);
            }
        } catch (IllegalStateException e) {
            String valueOf3 = String.valueOf(e.getMessage());
            Logging.b("WebRtcAudioRecordExternal", valueOf3.length() == 0 ? new String("AudioRecord.stop failed: ") : "AudioRecord.stop failed: ".concat(valueOf3));
        }
    }
}
