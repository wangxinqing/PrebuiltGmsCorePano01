package org.webrtc;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum MediaSource$State {
    INITIALIZING,
    LIVE,
    ENDED,
    MUTED;

    static MediaSource$State fromNativeIndex(int i) {
        return values()[i];
    }
}
