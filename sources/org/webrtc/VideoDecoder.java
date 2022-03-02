package org.webrtc;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface VideoDecoder {

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface Callback {
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class DecodeInfo {
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Settings {
        public Settings(int i, int i2, int i3) {
        }
    }

    long createNativeVideoDecoder();

    VideoCodecStatus decode(EncodedImage encodedImage, DecodeInfo decodeInfo);

    String getImplementationName();

    boolean getPrefersLateDecoding();

    VideoCodecStatus initDecode(Settings settings, Callback callback);

    VideoCodecStatus release();
}
