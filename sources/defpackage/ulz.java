package defpackage;

import java.io.IOException;
import org.webrtc.DataChannel;

/* renamed from: ulz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ulz implements amqy {
    private final umm a;

    public ulz(umm umm) {
        this.a = umm;
    }

    public final Object a(Object obj) {
        umm umm = this.a;
        DataChannel dataChannel = (DataChannel) obj;
        if (dataChannel == null) {
            return null;
        }
        try {
            usx usx = new usx("WebRtcSocket", dataChannel);
            uma uma = new uma(umm);
            usx.b.clear();
            usx.a(uma);
            return usx;
        } catch (IOException e) {
            return null;
        }
    }
}
