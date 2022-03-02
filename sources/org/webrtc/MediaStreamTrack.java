package org.webrtc;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MediaStreamTrack {
    private long a;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum MediaType {
        MEDIA_TYPE_AUDIO(0),
        MEDIA_TYPE_VIDEO(1);
        
        private final int c;

        private MediaType(int i) {
            this.c = i;
        }

        static MediaType fromNativeIndex(int i) {
            for (MediaType mediaType : values()) {
                if (mediaType.getNative() == i) {
                    return mediaType;
                }
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown native media type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public int getNative() {
            return this.c;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum State {
        LIVE,
        ENDED;

        static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public MediaStreamTrack(long j) {
        if (j != 0) {
            this.a = j;
            return;
        }
        throw new IllegalArgumentException("nativeTrack may not be null");
    }

    static MediaStreamTrack a(long j) {
        if (j == 0) {
            return null;
        }
        String nativeGetKind = nativeGetKind(j);
        if (nativeGetKind.equals("audio")) {
            return new AudioTrack(j);
        }
        if (nativeGetKind.equals("video")) {
            return new VideoTrack(j);
        }
        return null;
    }

    private final void c() {
        if (this.a == 0) {
            throw new IllegalStateException("MediaStreamTrack has been disposed.");
        }
    }

    private static native String nativeGetKind(long j);

    /* access modifiers changed from: package-private */
    public final long b() {
        c();
        return this.a;
    }

    public void a() {
        c();
        JniCommon.nativeReleaseRef(this.a);
        this.a = 0;
    }
}
