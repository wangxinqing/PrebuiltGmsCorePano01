package org.webrtc;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract /* synthetic */ class VideoDecoderFactory$$CC {
    public static VideoDecoder createDecoder$$dflt$$(VideoDecoderFactory videoDecoderFactory, VideoCodecInfo videoCodecInfo) {
        videoCodecInfo.getName();
        return videoDecoderFactory.a();
    }

    public static VideoCodecInfo[] getSupportedCodecs$$dflt$$(VideoDecoderFactory videoDecoderFactory) {
        return new VideoCodecInfo[0];
    }
}
