package org.webrtc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MediaStream {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public long d;

    public MediaStream(long j) {
        this.d = j;
    }

    private static void a(List list, long j) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) it.next();
            if (mediaStreamTrack.b() == j) {
                mediaStreamTrack.a();
                it.remove();
                return;
            }
        }
        Logging.b("MediaStream", "Couldn't not find track");
    }

    private static native String nativeGetId(long j);

    private static native boolean nativeRemoveAudioTrack(long j, long j2);

    private static native boolean nativeRemoveVideoTrack(long j, long j2);

    /* access modifiers changed from: package-private */
    public void addNativeAudioTrack(long j) {
        this.a.add(new AudioTrack(j));
    }

    /* access modifiers changed from: package-private */
    public void addNativeVideoTrack(long j) {
        this.b.add(new VideoTrack(j));
    }

    public void dispose() {
        a();
        while (!this.a.isEmpty()) {
            AudioTrack audioTrack = (AudioTrack) this.a.get(0);
            a();
            this.a.remove(audioTrack);
            nativeRemoveAudioTrack(this.d, audioTrack.b());
            audioTrack.a();
        }
        while (!this.b.isEmpty()) {
            VideoTrack videoTrack = (VideoTrack) this.b.get(0);
            a(videoTrack);
            videoTrack.a();
        }
        while (!this.c.isEmpty()) {
            a((VideoTrack) this.c.get(0));
        }
        JniCommon.nativeReleaseRef(this.d);
        this.d = 0;
    }

    /* access modifiers changed from: package-private */
    public void removeAudioTrack(long j) {
        a(this.a, j);
    }

    /* access modifiers changed from: package-private */
    public void removeVideoTrack(long j) {
        a(this.b, j);
    }

    public final String toString() {
        a();
        String nativeGetId = nativeGetId(this.d);
        int size = this.a.size();
        int size2 = this.b.size();
        StringBuilder sb = new StringBuilder(String.valueOf(nativeGetId).length() + 30);
        sb.append("[");
        sb.append(nativeGetId);
        sb.append(":A=");
        sb.append(size);
        sb.append(":V=");
        sb.append(size2);
        sb.append("]");
        return sb.toString();
    }

    public final void a() {
        if (this.d == 0) {
            throw new IllegalStateException("MediaStream has been disposed.");
        }
    }

    public final void a(VideoTrack videoTrack) {
        a();
        this.b.remove(videoTrack);
        this.c.remove(videoTrack);
        nativeRemoveVideoTrack(this.d, videoTrack.b());
    }
}
