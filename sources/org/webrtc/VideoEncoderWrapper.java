package org.webrtc;

import org.webrtc.VideoEncoder;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class VideoEncoderWrapper {
    VideoEncoderWrapper() {
    }

    static VideoEncoder.Callback createEncoderCallback(long j) {
        return new bayo();
    }

    static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        Integer num = scalingSettings.c;
        return null;
    }

    static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        Integer num = scalingSettings.b;
        return null;
    }

    static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        boolean z = scalingSettings.a;
        return false;
    }
}
