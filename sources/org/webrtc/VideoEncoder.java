package org.webrtc;

import org.webrtc.EncodedImage;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface VideoEncoder {

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class BitrateAllocation {
        public BitrateAllocation(int[][] iArr) {
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface Callback {
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Capabilities {
        public Capabilities(boolean z) {
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class EncodeInfo {
        public EncodeInfo(EncodedImage.FrameType[] frameTypeArr) {
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ResolutionBitrateLimits {
        public int getFrameSizePixels() {
            throw null;
        }

        public int getMaxBitrateBps() {
            throw null;
        }

        public int getMinBitrateBps() {
            throw null;
        }

        public int getMinStartBitrateBps() {
            throw null;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ScalingSettings {
        public final boolean a = false;
        public final Integer b = null;
        public final Integer c = null;

        static {
            new ScalingSettings();
        }

        private ScalingSettings() {
        }

        public final String toString() {
            return "OFF";
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Settings {
        public Settings(int i, int i2, int i3, int i4, int i5, int i6, boolean z, Capabilities capabilities) {
        }
    }

    long createNativeVideoEncoder();

    VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo);

    String getImplementationName();

    ResolutionBitrateLimits[] getResolutionBitrateLimits();

    ScalingSettings getScalingSettings();

    VideoCodecStatus initEncode(Settings settings, Callback callback);

    boolean isHardwareEncoder();

    VideoCodecStatus release();

    VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i);
}
