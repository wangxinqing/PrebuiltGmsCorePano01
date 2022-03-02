package org.webrtc;

import org.webrtc.VideoEncoderFactory;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract /* synthetic */ class VideoEncoderFactory$$CC {
    public static VideoEncoderFactory.VideoEncoderSelector getEncoderSelector$$dflt$$(VideoEncoderFactory videoEncoderFactory) {
        return null;
    }

    public static VideoCodecInfo[] getImplementations$$dflt$$(VideoEncoderFactory videoEncoderFactory) {
        return videoEncoderFactory.getSupportedCodecs();
    }
}
