package org.webrtc.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.Timer;
import org.webrtc.Logging;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WebRtcAudioTrack {
    public static final /* synthetic */ int g = 0;
    public long a;
    public final Context b;
    public final AudioManager c;
    public ByteBuffer d;
    public AudioTrack e;
    public volatile boolean f;
    private final bayl h;
    private bayx i;
    private final bayt j;

    WebRtcAudioTrack(Context context, AudioManager audioManager) {
        this(context, audioManager, (byte[]) null);
    }

    private int GetPlayoutUnderrunCount() {
        if (Build.VERSION.SDK_INT < 24) {
            return -2;
        }
        AudioTrack audioTrack = this.e;
        if (audioTrack != null) {
            return audioTrack.getUnderrunCount();
        }
        return -1;
    }

    private final void a() {
        Logging.a("WebRtcAudioTrackExternal", "releaseAudioResources");
        AudioTrack audioTrack = this.e;
        if (audioTrack != null) {
            audioTrack.release();
            this.e = null;
        }
    }

    private int getStreamMaxVolume() {
        this.h.a();
        Logging.a("WebRtcAudioTrackExternal", "getStreamMaxVolume");
        return this.c.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.h.a();
        Logging.a("WebRtcAudioTrackExternal", "getStreamVolume");
        return this.c.getStreamVolume(0);
    }

    private boolean initPlayout(int i2, int i3, double d2) {
        this.h.a();
        StringBuilder sb = new StringBuilder(100);
        sb.append("initPlayout(sampleRate=");
        sb.append(i2);
        sb.append(", channels=");
        sb.append(i3);
        sb.append(", bufferSizeFactor=");
        sb.append(d2);
        sb.append(")");
        Logging.a("WebRtcAudioTrackExternal", sb.toString());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i3 + i3) * (i2 / 100));
        this.d = allocateDirect;
        int capacity = allocateDirect.capacity();
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("byteBuffer.capacity: ");
        sb2.append(capacity);
        Logging.a("WebRtcAudioTrackExternal", sb2.toString());
        byte[] bArr = new byte[this.d.capacity()];
        nativeCacheDirectBufferAddress(this.a, this.d);
        int i4 = i3 == 1 ? 4 : 12;
        double minBufferSize = (double) AudioTrack.getMinBufferSize(i2, i4, 2);
        Double.isNaN(minBufferSize);
        int i5 = (int) (minBufferSize * d2);
        StringBuilder sb3 = new StringBuilder(33);
        sb3.append("minBufferSizeInBytes: ");
        sb3.append(i5);
        Logging.a("WebRtcAudioTrackExternal", sb3.toString());
        if (i5 < this.d.capacity()) {
            a("AudioTrack.getMinBufferSize returns an invalid value.");
            return false;
        } else if (this.e == null) {
            try {
                int i6 = Build.VERSION.SDK_INT;
                Logging.a("WebRtcAudioTrackExternal", "createAudioTrackOnLollipopOrHigher");
                int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
                StringBuilder sb4 = new StringBuilder(35);
                sb4.append("nativeOutputSampleRate: ");
                sb4.append(nativeOutputSampleRate);
                Logging.a("WebRtcAudioTrackExternal", sb4.toString());
                if (i2 != nativeOutputSampleRate) {
                    Logging.c("WebRtcAudioTrackExternal", "Unable to use fast mode since requested sample rate is not native");
                }
                AudioTrack audioTrack = new AudioTrack(new AudioAttributes.Builder().setUsage(2).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i2).setChannelMask(i4).build(), i5, 1, 0);
                this.e = audioTrack;
                if (audioTrack.getState() == 1) {
                    int audioSessionId = this.e.getAudioSessionId();
                    int channelCount = this.e.getChannelCount();
                    int sampleRate = this.e.getSampleRate();
                    float maxVolume = AudioTrack.getMaxVolume();
                    StringBuilder sb5 = new StringBuilder(111);
                    sb5.append("AudioTrack: session ID: ");
                    sb5.append(audioSessionId);
                    sb5.append(", channels: ");
                    sb5.append(channelCount);
                    sb5.append(", sample rate: ");
                    sb5.append(sampleRate);
                    sb5.append(", max gain: ");
                    sb5.append(maxVolume);
                    Logging.a("WebRtcAudioTrackExternal", sb5.toString());
                    if (Build.VERSION.SDK_INT >= 23) {
                        int bufferSizeInFrames = this.e.getBufferSizeInFrames();
                        StringBuilder sb6 = new StringBuilder(46);
                        sb6.append("AudioTrack: buffer size in frames: ");
                        sb6.append(bufferSizeInFrames);
                        Logging.a("WebRtcAudioTrackExternal", sb6.toString());
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        int bufferCapacityInFrames = this.e.getBufferCapacityInFrames();
                        StringBuilder sb7 = new StringBuilder(50);
                        sb7.append("AudioTrack: buffer capacity in frames: ");
                        sb7.append(bufferCapacityInFrames);
                        Logging.a("WebRtcAudioTrackExternal", sb7.toString());
                    }
                    return true;
                }
                a("Initialization of audio track failed.");
                a();
                return false;
            } catch (IllegalArgumentException e2) {
                a(e2.getMessage());
                a();
                return false;
            }
        } else {
            a("Conflict with existing AudioTrack.");
            return false;
        }
    }

    private static native void nativeCacheDirectBufferAddress(long j2, ByteBuffer byteBuffer);

    public static native void nativeGetPlayoutData(long j2, int i2);

    private boolean setStreamVolume(int i2) {
        this.h.a();
        StringBuilder sb = new StringBuilder(28);
        sb.append("setStreamVolume(");
        sb.append(i2);
        sb.append(")");
        Logging.a("WebRtcAudioTrackExternal", sb.toString());
        int i3 = Build.VERSION.SDK_INT;
        if (!this.c.isVolumeFixed()) {
            this.c.setStreamVolume(0, i2, 0);
            return true;
        }
        Logging.b("WebRtcAudioTrackExternal", "The device implements a fixed volume policy.");
        return false;
    }

    private boolean startPlayout() {
        boolean z;
        boolean z2;
        this.h.a();
        bayt bayt = this.j;
        String valueOf = String.valueOf(bayy.a());
        Logging.a("VolumeLogger", valueOf.length() == 0 ? new String("start") : "start".concat(valueOf));
        if (bayt.b == null) {
            String d2 = bayy.d(bayt.a.getMode());
            Logging.a("VolumeLogger", d2.length() == 0 ? new String("audio mode is: ") : "audio mode is: ".concat(d2));
            bayt.b = new Timer("WebRtcVolumeLevelLoggerThread");
            bayt.b.schedule(new bays(bayt, bayt.a.getStreamMaxVolume(2), bayt.a.getStreamMaxVolume(0)), 0, 30000);
        }
        Logging.a("WebRtcAudioTrackExternal", "startPlayout");
        if (this.e != null) {
            z = true;
        } else {
            z = false;
        }
        a(z);
        if (this.i == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        a(z2);
        try {
            this.e.play();
            if (this.e.getPlayState() != 3) {
                int playState = this.e.getPlayState();
                StringBuilder sb = new StringBuilder(53);
                sb.append("AudioTrack.play failed - incorrect state :");
                sb.append(playState);
                a(2, sb.toString());
                a();
                return false;
            }
            bayx bayx = new bayx(this, "AudioTrackJavaThread");
            this.i = bayx;
            bayx.start();
            return true;
        } catch (IllegalStateException e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            a(1, valueOf2.length() == 0 ? new String("AudioTrack.play failed: ") : "AudioTrack.play failed: ".concat(valueOf2));
            a();
            return false;
        }
    }

    private boolean stopPlayout() {
        boolean z;
        this.h.a();
        bayt bayt = this.j;
        String valueOf = String.valueOf(bayy.a());
        Logging.a("VolumeLogger", valueOf.length() == 0 ? new String("stop") : "stop".concat(valueOf));
        Timer timer = bayt.b;
        if (timer != null) {
            timer.cancel();
            bayt.b = null;
        }
        Logging.a("WebRtcAudioTrackExternal", "stopPlayout");
        if (this.i != null) {
            z = true;
        } else {
            z = false;
        }
        a(z);
        if (Build.VERSION.SDK_INT >= 24) {
            int underrunCount = this.e.getUnderrunCount();
            StringBuilder sb = new StringBuilder(27);
            sb.append("underrun count: ");
            sb.append(underrunCount);
            Logging.a("WebRtcAudioTrackExternal", sb.toString());
        }
        bayx bayx = this.i;
        Logging.a("WebRtcAudioTrackExternal", "stopThread");
        bayx.a = false;
        Logging.a("WebRtcAudioTrackExternal", "Stopping the AudioTrackThread...");
        this.i.interrupt();
        if (!baym.a((Thread) this.i)) {
            Logging.b("WebRtcAudioTrackExternal", "Join of AudioTrackThread timed out.");
            bayy.a("WebRtcAudioTrackExternal", this.b, this.c);
        }
        Logging.a("WebRtcAudioTrackExternal", "AudioTrackThread has now been stopped.");
        this.i = null;
        if (this.e != null) {
            Logging.a("WebRtcAudioTrackExternal", "Calling AudioTrack.stop...");
            try {
                this.e.stop();
                Logging.a("WebRtcAudioTrackExternal", "AudioTrack.stop is done.");
                a(1);
            } catch (IllegalStateException e2) {
                String valueOf2 = String.valueOf(e2.getMessage());
                Logging.b("WebRtcAudioTrackExternal", valueOf2.length() == 0 ? new String("AudioTrack.stop failed: ") : "AudioTrack.stop failed: ".concat(valueOf2));
            }
        }
        a();
        return true;
    }

    public void setNativeAudioTrack(long j2) {
        this.a = j2;
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
    }

    public WebRtcAudioTrack(Context context, AudioManager audioManager, byte[] bArr) {
        bayl bayl = new bayl();
        this.h = bayl;
        bayl.a = null;
        this.b = context;
        this.c = audioManager;
        this.j = new bayt(audioManager);
        String valueOf = String.valueOf(bayy.a());
        Logging.a("WebRtcAudioTrackExternal", valueOf.length() == 0 ? new String("ctor") : "ctor".concat(valueOf));
    }

    private final void a(int i2, String str) {
        String str2 = i2 != 1 ? "AUDIO_TRACK_START_STATE_MISMATCH" : "AUDIO_TRACK_START_EXCEPTION";
        StringBuilder sb = new StringBuilder(str2.length() + 23 + String.valueOf(str).length());
        sb.append("Start playout error: ");
        sb.append(str2);
        sb.append(". ");
        sb.append(str);
        Logging.b("WebRtcAudioTrackExternal", sb.toString());
        bayy.a("WebRtcAudioTrackExternal", this.b, this.c);
    }

    private final void a(String str) {
        String valueOf = String.valueOf(str);
        Logging.b("WebRtcAudioTrackExternal", valueOf.length() == 0 ? new String("Init playout error: ") : "Init playout error: ".concat(valueOf));
        bayy.a("WebRtcAudioTrackExternal", this.b, this.c);
    }

    public static void a(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public final void a(int i2) {
        StringBuilder sb = new StringBuilder(38);
        sb.append("doAudioTrackStateCallback: ");
        sb.append(i2);
        Logging.a("WebRtcAudioTrackExternal", sb.toString());
    }
}
