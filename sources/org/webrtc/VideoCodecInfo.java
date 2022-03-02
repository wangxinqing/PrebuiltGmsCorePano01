package org.webrtc;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class VideoCodecInfo {
    public final String a;
    public final Map b;

    public VideoCodecInfo(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof VideoCodecInfo) {
            VideoCodecInfo videoCodecInfo = (VideoCodecInfo) obj;
            return this.a.equalsIgnoreCase(videoCodecInfo.a) && this.b.equals(videoCodecInfo.b);
        }
    }

    public String getName() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public Map getParams() {
        return this.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.toUpperCase(Locale.ROOT), this.b});
    }
}
