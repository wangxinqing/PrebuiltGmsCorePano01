package defpackage;

import java.util.TimerTask;
import org.webrtc.Logging;

/* renamed from: bays  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bays extends TimerTask {
    final /* synthetic */ bayt a;
    private final int b;
    private final int c;

    public bays(bayt bayt, int i, int i2) {
        this.a = bayt;
        this.b = i;
        this.c = i2;
    }

    public final void run() {
        int mode = this.a.a.getMode();
        if (mode == 1) {
            int streamVolume = this.a.a.getStreamVolume(2);
            int i = this.b;
            StringBuilder sb = new StringBuilder(56);
            sb.append("STREAM_RING stream volume: ");
            sb.append(streamVolume);
            sb.append(" (max=");
            sb.append(i);
            sb.append(")");
            Logging.a("VolumeLogger", sb.toString());
        } else if (mode == 3) {
            int streamVolume2 = this.a.a.getStreamVolume(0);
            int i2 = this.c;
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("VOICE_CALL stream volume: ");
            sb2.append(streamVolume2);
            sb2.append(" (max=");
            sb2.append(i2);
            sb2.append(")");
            Logging.a("VolumeLogger", sb2.toString());
        }
    }
}
