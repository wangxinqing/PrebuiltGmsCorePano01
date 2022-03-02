package org.webrtc;

import java.util.IdentityHashMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class VideoTrack extends MediaStreamTrack {
    private final IdentityHashMap a = new IdentityHashMap();

    public VideoTrack(long j) {
        super(j);
    }

    private static native void nativeFreeSink(long j);

    private static native void nativeRemoveSink(long j, long j2);

    public final void a() {
        for (Long longValue : this.a.values()) {
            long longValue2 = longValue.longValue();
            nativeRemoveSink(b(), longValue2);
            nativeFreeSink(longValue2);
        }
        this.a.clear();
        super.a();
    }
}
