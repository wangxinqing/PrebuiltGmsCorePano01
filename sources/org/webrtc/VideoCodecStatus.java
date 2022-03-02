package org.webrtc;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum VideoCodecStatus {
    REQUEST_SLI(2),
    NO_OUTPUT(1),
    OK(0),
    ERROR(-1),
    LEVEL_EXCEEDED(-2),
    MEMORY(-3),
    ERR_PARAMETER(-4),
    ERR_SIZE(-5),
    TIMEOUT(-6),
    UNINITIALIZED(-7),
    ERR_REQUEST_SLI(-12),
    FALLBACK_SOFTWARE(-13),
    TARGET_BITRATE_OVERSHOOT(-14);
    
    private final int n;

    private VideoCodecStatus(int i) {
        this.n = i;
    }

    public int getNumber() {
        return this.n;
    }
}
