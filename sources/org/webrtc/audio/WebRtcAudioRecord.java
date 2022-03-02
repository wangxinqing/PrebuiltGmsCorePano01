package org.webrtc.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.webrtc.Logging;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WebRtcAudioRecord {
    public final Context a;
    public final AudioManager b;
    public long c;
    public ByteBuffer d;
    public AudioRecord e;
    public volatile boolean f;
    public final bayr g;
    private final int h;
    private final int i;
    private final bayu j;
    private bayw k;
    private ScheduledExecutorService l;
    private ScheduledFuture m;
    private boolean n;
    private boolean o;
    private final boolean p;
    private final boolean q;

    WebRtcAudioRecord(Context context, AudioManager audioManager) {
        this(context, audioManager, bayu.a(), bayu.b());
    }

    private final void a() {
        Logging.a("WebRtcAudioRecordExternal", "releaseAudioResources");
        AudioRecord audioRecord = this.e;
        if (audioRecord != null) {
            audioRecord.release();
            this.e = null;
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private boolean enableBuiltInAEC(boolean z) {
        StringBuilder sb = new StringBuilder(23);
        sb.append("enableBuiltInAEC(");
        sb.append(z);
        sb.append(")");
        Logging.a("WebRtcAudioRecordExternal", sb.toString());
        bayu bayu = this.j;
        StringBuilder sb2 = new StringBuilder(13);
        sb2.append("setAEC(");
        sb2.append(z);
        sb2.append(")");
        Logging.a("WebRtcAudioEffectsExternal", sb2.toString());
        if (!bayu.a()) {
            Logging.c("WebRtcAudioEffectsExternal", "Platform AEC is not supported");
            bayu.c = false;
            return false;
        } else if (bayu.a == null || z == bayu.c) {
            bayu.c = z;
            return true;
        } else {
            Logging.b("WebRtcAudioEffectsExternal", "Platform AEC state can't be modified while recording");
            return false;
        }
    }

    private boolean enableBuiltInNS(boolean z) {
        StringBuilder sb = new StringBuilder(22);
        sb.append("enableBuiltInNS(");
        sb.append(z);
        sb.append(")");
        Logging.a("WebRtcAudioRecordExternal", sb.toString());
        bayu bayu = this.j;
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append("setNS(");
        sb2.append(z);
        sb2.append(")");
        Logging.a("WebRtcAudioEffectsExternal", sb2.toString());
        if (!bayu.b()) {
            Logging.c("WebRtcAudioEffectsExternal", "Platform NS is not supported");
            bayu.d = false;
            return false;
        } else if (bayu.b == null || z == bayu.d) {
            bayu.d = z;
            return true;
        } else {
            Logging.b("WebRtcAudioEffectsExternal", "Platform NS state can't be modified while recording");
            return false;
        }
    }

    private int initRecording(int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        String str2;
        String str3;
        int i4 = i2;
        int i5 = i3;
        StringBuilder sb = new StringBuilder(59);
        sb.append("initRecording(sampleRate=");
        sb.append(i4);
        sb.append(", channels=");
        sb.append(i5);
        sb.append(")");
        Logging.a("WebRtcAudioRecordExternal", sb.toString());
        if (this.e == null) {
            int i6 = i4 / 100;
            int i7 = this.i;
            if (i7 == 1 || i7 == 2) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i5 + i5) * i6);
                this.d = allocateDirect;
                if (!allocateDirect.hasArray()) {
                    a("ByteBuffer does not have backing array.");
                    return -1;
                }
                int capacity = this.d.capacity();
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("byteBuffer.capacity: ");
                sb2.append(capacity);
                Logging.a("WebRtcAudioRecordExternal", sb2.toString());
                byte[] bArr = new byte[this.d.capacity()];
                nativeCacheDirectBufferAddress(this.c, this.d);
                int i8 = i5 == 1 ? 16 : 12;
                int minBufferSize = AudioRecord.getMinBufferSize(i4, i8, this.i);
                if (minBufferSize == -1 || minBufferSize == -2) {
                    StringBuilder sb3 = new StringBuilder(48);
                    sb3.append("AudioRecord.getMinBufferSize failed: ");
                    sb3.append(minBufferSize);
                    a(sb3.toString());
                    return -1;
                }
                StringBuilder sb4 = new StringBuilder(41);
                sb4.append("AudioRecord.getMinBufferSize: ");
                sb4.append(minBufferSize);
                Logging.a("WebRtcAudioRecordExternal", sb4.toString());
                int max = Math.max(minBufferSize + minBufferSize, this.d.capacity());
                StringBuilder sb5 = new StringBuilder(30);
                sb5.append("bufferSizeInBytes: ");
                sb5.append(max);
                Logging.a("WebRtcAudioRecordExternal", sb5.toString());
                try {
                    if (Build.VERSION.SDK_INT < 23) {
                        int i9 = this.h;
                        int i10 = this.i;
                        Logging.a("WebRtcAudioRecordExternal", "createAudioRecordOnLowerThanM");
                        AudioRecord audioRecord = r2;
                        AudioRecord audioRecord2 = new AudioRecord(i9, i2, i8, i10, max);
                        this.e = audioRecord;
                    } else {
                        int i11 = this.h;
                        int i12 = this.i;
                        Logging.a("WebRtcAudioRecordExternal", "createAudioRecordOnMOrHigher");
                        this.e = new AudioRecord.Builder().setAudioSource(i11).setAudioFormat(new AudioFormat.Builder().setEncoding(i12).setSampleRate(i4).setChannelMask(i8).build()).setBufferSizeInBytes(max).build();
                    }
                    AudioRecord audioRecord3 = this.e;
                    if (audioRecord3 != null && audioRecord3.getState() == 1) {
                        bayu bayu = this.j;
                        int audioSessionId = this.e.getAudioSessionId();
                        StringBuilder sb6 = new StringBuilder(32);
                        sb6.append("enable(audioSession=");
                        sb6.append(audioSessionId);
                        sb6.append(")");
                        Logging.a("WebRtcAudioEffectsExternal", sb6.toString());
                        if (bayu.a == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bayu.a(z);
                        if (bayu.b == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        bayu.a(z2);
                        String str4 = "disabled";
                        if (bayu.a()) {
                            bayu.a = AcousticEchoCanceler.create(audioSessionId);
                            AcousticEchoCanceler acousticEchoCanceler = bayu.a;
                            if (acousticEchoCanceler != null) {
                                boolean enabled = acousticEchoCanceler.getEnabled();
                                if (!bayu.c || !bayu.a()) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                if (bayu.a.setEnabled(z4) != 0) {
                                    Logging.b("WebRtcAudioEffectsExternal", "Failed to set the AcousticEchoCanceler state");
                                }
                                if (!enabled) {
                                    str2 = str4;
                                } else {
                                    str2 = "enabled";
                                }
                                if (!bayu.a.getEnabled()) {
                                    str3 = str4;
                                } else {
                                    str3 = "enabled";
                                }
                                StringBuilder sb7 = new StringBuilder(str2.length() + 51 + str3.length());
                                sb7.append("AcousticEchoCanceler: was ");
                                sb7.append(str2);
                                sb7.append(", enable: ");
                                sb7.append(z4);
                                sb7.append(", is now: ");
                                sb7.append(str3);
                                Logging.a("WebRtcAudioEffectsExternal", sb7.toString());
                            } else {
                                Logging.b("WebRtcAudioEffectsExternal", "Failed to create the AcousticEchoCanceler instance");
                            }
                        }
                        if (bayu.b()) {
                            bayu.b = NoiseSuppressor.create(audioSessionId);
                            NoiseSuppressor noiseSuppressor = bayu.b;
                            if (noiseSuppressor != null) {
                                boolean enabled2 = noiseSuppressor.getEnabled();
                                if (!bayu.d || !bayu.b()) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                if (bayu.b.setEnabled(z3) != 0) {
                                    Logging.b("WebRtcAudioEffectsExternal", "Failed to set the NoiseSuppressor state");
                                }
                                if (!enabled2) {
                                    str = str4;
                                } else {
                                    str = "enabled";
                                }
                                if (bayu.b.getEnabled()) {
                                    str4 = "enabled";
                                }
                                StringBuilder sb8 = new StringBuilder(str.length() + 46 + str4.length());
                                sb8.append("NoiseSuppressor: was ");
                                sb8.append(str);
                                sb8.append(", enable: ");
                                sb8.append(z3);
                                sb8.append(", is now: ");
                                sb8.append(str4);
                                Logging.a("WebRtcAudioEffectsExternal", sb8.toString());
                            } else {
                                Logging.b("WebRtcAudioEffectsExternal", "Failed to create the NoiseSuppressor instance");
                            }
                        }
                        int audioSessionId2 = this.e.getAudioSessionId();
                        int channelCount = this.e.getChannelCount();
                        int sampleRate = this.e.getSampleRate();
                        StringBuilder sb9 = new StringBuilder(85);
                        sb9.append("AudioRecord: session ID: ");
                        sb9.append(audioSessionId2);
                        sb9.append(", channels: ");
                        sb9.append(channelCount);
                        sb9.append(", sample rate: ");
                        sb9.append(sampleRate);
                        Logging.a("WebRtcAudioRecordExternal", sb9.toString());
                        if (Build.VERSION.SDK_INT >= 23) {
                            int bufferSizeInFrames = this.e.getBufferSizeInFrames();
                            StringBuilder sb10 = new StringBuilder(47);
                            sb10.append("AudioRecord: buffer size in frames: ");
                            sb10.append(bufferSizeInFrames);
                            Logging.a("WebRtcAudioRecordExternal", sb10.toString());
                        }
                        int a2 = a(false);
                        if (a2 != 0) {
                            StringBuilder sb11 = new StringBuilder(59);
                            sb11.append("Potential microphone conflict. Active sessions: ");
                            sb11.append(a2);
                            Logging.c("WebRtcAudioRecordExternal", sb11.toString());
                        }
                        return i6;
                    }
                    a("Creation or initialization of audio recorder failed.");
                    a();
                    return -1;
                } catch (IllegalArgumentException | UnsupportedOperationException e2) {
                    a(e2.getMessage());
                    a();
                    return -1;
                }
            } else {
                StringBuilder sb12 = new StringBuilder(28);
                sb12.append("Bad audio format ");
                sb12.append(i7);
                throw new IllegalArgumentException(sb12.toString());
            }
        } else {
            a("InitRecording called twice without StopRecording.");
            return -1;
        }
    }

    private native void nativeCacheDirectBufferAddress(long j2, ByteBuffer byteBuffer);

    private boolean startRecording() {
        boolean z;
        boolean z2;
        Logging.a("WebRtcAudioRecordExternal", "startRecording");
        if (this.e != null) {
            z = true;
        } else {
            z = false;
        }
        b(z);
        if (this.k == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        b(z2);
        try {
            this.e.startRecording();
            if (this.e.getRecordingState() != 3) {
                int recordingState = this.e.getRecordingState();
                StringBuilder sb = new StringBuilder(64);
                sb.append("AudioRecord.startRecording failed - incorrect state: ");
                sb.append(recordingState);
                a(2, sb.toString());
                return false;
            }
            bayw bayw = new bayw(this, "AudioRecordJavaThread");
            this.k = bayw;
            bayw.start();
            Logging.a("WebRtcAudioRecordExternal", "scheduleLogRecordingConfigurationsTask");
            if (Build.VERSION.SDK_INT >= 24) {
                ScheduledExecutorService scheduledExecutorService = this.l;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
                this.l = Executors.newSingleThreadScheduledExecutor();
                bayv bayv = new bayv(this);
                ScheduledFuture scheduledFuture = this.m;
                if (scheduledFuture != null && !scheduledFuture.isDone()) {
                    this.m.cancel(true);
                }
                this.m = this.l.schedule(bayv, 100, TimeUnit.MILLISECONDS);
            }
            return true;
        } catch (IllegalStateException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            a(1, valueOf.length() == 0 ? new String("AudioRecord.startRecording failed: ") : "AudioRecord.startRecording failed: ".concat(valueOf));
            return false;
        }
    }

    private boolean stopRecording() {
        boolean z;
        Logging.a("WebRtcAudioRecordExternal", "stopRecording");
        if (this.k != null) {
            z = true;
        } else {
            z = false;
        }
        b(z);
        ScheduledFuture scheduledFuture = this.m;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isDone()) {
                this.m.cancel(true);
            }
            this.m = null;
        }
        ScheduledExecutorService scheduledExecutorService = this.l;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.l = null;
        }
        bayw bayw = this.k;
        Logging.a("WebRtcAudioRecordExternal", "stopThread");
        bayw.a = false;
        if (!baym.a((Thread) this.k)) {
            Logging.b("WebRtcAudioRecordExternal", "Join of AudioRecordJavaThread timed out");
            bayy.a("WebRtcAudioRecordExternal", this.a, this.b);
        }
        this.k = null;
        bayu bayu = this.j;
        Logging.a("WebRtcAudioEffectsExternal", "release");
        AcousticEchoCanceler acousticEchoCanceler = bayu.a;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            bayu.a = null;
        }
        NoiseSuppressor noiseSuppressor = bayu.b;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            bayu.b = null;
        }
        a();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isAcousticEchoCancelerSupported() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public boolean isAudioConfigVerified() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public boolean isAudioSourceMatchingRecordingSession() {
        if (this.o) {
            return this.n;
        }
        Logging.c("WebRtcAudioRecordExternal", "Audio configuration has not yet been verified");
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean isNoiseSuppressorSupported() {
        return this.q;
    }

    public native void nativeDataIsRecorded(long j2, int i2);

    public void setNativeAudioRecord(long j2) {
        this.c = j2;
    }

    public WebRtcAudioRecord(Context context, AudioManager audioManager, boolean z, boolean z2) {
        this.j = new bayu();
        if (z && !bayu.a()) {
            throw new IllegalArgumentException("HW AEC not supported");
        } else if (z2 && !bayu.b()) {
            throw new IllegalArgumentException("HW NS not supported");
        } else {
            this.a = context;
            this.b = audioManager;
            this.h = 7;
            this.i = 2;
            this.g = null;
            this.p = z;
            this.q = z2;
            String valueOf = String.valueOf(bayy.a());
            Logging.a("WebRtcAudioRecordExternal", valueOf.length() == 0 ? new String("ctor") : "ctor".concat(valueOf));
        }
    }

    public static final void a(int i2) {
        String str = i2 != 0 ? "STOP" : "START";
        Logging.a("WebRtcAudioRecordExternal", str.length() == 0 ? new String("doAudioRecordStateCallback: ") : "doAudioRecordStateCallback: ".concat(str));
    }

    private final void a(int i2, String str) {
        String str2 = i2 != 1 ? "AUDIO_RECORD_START_STATE_MISMATCH" : "AUDIO_RECORD_START_EXCEPTION";
        StringBuilder sb = new StringBuilder(str2.length() + 25 + String.valueOf(str).length());
        sb.append("Start recording error: ");
        sb.append(str2);
        sb.append(". ");
        sb.append(str);
        Logging.b("WebRtcAudioRecordExternal", sb.toString());
        bayy.a("WebRtcAudioRecordExternal", this.a, this.b);
        a(false);
    }

    private final void a(String str) {
        String valueOf = String.valueOf(str);
        Logging.b("WebRtcAudioRecordExternal", valueOf.length() == 0 ? new String("Init recording error: ") : "Init recording error: ".concat(valueOf));
        bayy.a("WebRtcAudioRecordExternal", this.a, this.b);
        a(false);
    }

    public final int a(boolean z) {
        boolean z2;
        String str;
        if (Build.VERSION.SDK_INT < 24) {
            Logging.c("WebRtcAudioRecordExternal", "AudioManager#getActiveRecordingConfigurations() requires N or higher");
            return 0;
        } else if (this.e == null) {
            return 0;
        } else {
            List<AudioRecordingConfiguration> activeRecordingConfigurations = this.b.getActiveRecordingConfigurations();
            int size = activeRecordingConfigurations.size();
            StringBuilder sb = new StringBuilder(48);
            sb.append("Number of active recording sessions: ");
            sb.append(size);
            Logging.a("WebRtcAudioRecordExternal", sb.toString());
            if (size > 0) {
                int audioSessionId = this.e.getAudioSessionId();
                b(!activeRecordingConfigurations.isEmpty());
                Logging.a("WebRtcAudioRecordExternal", "AudioRecordingConfigurations: ");
                for (AudioRecordingConfiguration next : activeRecordingConfigurations) {
                    StringBuilder sb2 = new StringBuilder();
                    int clientAudioSource = next.getClientAudioSource();
                    sb2.append("  client audio source=");
                    switch (clientAudioSource) {
                        case 0:
                            str = "DEFAULT";
                            break;
                        case 1:
                            str = "MIC";
                            break;
                        case 2:
                            str = "VOICE_UPLINK";
                            break;
                        case 3:
                            str = "VOICE_DOWNLINK";
                            break;
                        case 4:
                            str = "VOICE_CALL";
                            break;
                        case 5:
                            str = "CAMCORDER";
                            break;
                        case 6:
                            str = "VOICE_RECOGNITION";
                            break;
                        case 7:
                            str = "VOICE_COMMUNICATION";
                            break;
                        case 9:
                            str = "UNPROCESSED";
                            break;
                        case 10:
                            str = "VOICE_PERFORMANCE";
                            break;
                        default:
                            str = "INVALID";
                            break;
                    }
                    sb2.append(str);
                    sb2.append(", client session id=");
                    sb2.append(next.getClientAudioSessionId());
                    sb2.append(" (");
                    sb2.append(audioSessionId);
                    sb2.append(")\n");
                    AudioFormat format = next.getFormat();
                    sb2.append("  Device AudioFormat: channel count=");
                    sb2.append(format.getChannelCount());
                    sb2.append(", channel index mask=");
                    sb2.append(format.getChannelIndexMask());
                    sb2.append(", channel mask=");
                    sb2.append(bayy.b(format.getChannelMask()));
                    sb2.append(", encoding=");
                    sb2.append(bayy.c(format.getEncoding()));
                    sb2.append(", sample rate=");
                    sb2.append(format.getSampleRate());
                    sb2.append("\n");
                    AudioFormat clientFormat = next.getClientFormat();
                    sb2.append("  Client AudioFormat: channel count=");
                    sb2.append(clientFormat.getChannelCount());
                    sb2.append(", channel index mask=");
                    sb2.append(clientFormat.getChannelIndexMask());
                    sb2.append(", channel mask=");
                    sb2.append(bayy.b(clientFormat.getChannelMask()));
                    sb2.append(", encoding=");
                    sb2.append(bayy.c(clientFormat.getEncoding()));
                    sb2.append(", sample rate=");
                    sb2.append(clientFormat.getSampleRate());
                    sb2.append("\n");
                    AudioDeviceInfo audioDevice = next.getAudioDevice();
                    if (audioDevice != null) {
                        b(audioDevice.isSource());
                        sb2.append("  AudioDevice: type=");
                        sb2.append(bayy.a(audioDevice.getType()));
                        sb2.append(", id=");
                        sb2.append(audioDevice.getId());
                    }
                    Logging.a("WebRtcAudioRecordExternal", sb2.toString());
                }
                if (z) {
                    int audioSource = this.e.getAudioSource();
                    int audioSessionId2 = this.e.getAudioSessionId();
                    AudioFormat format2 = this.e.getFormat();
                    AudioDeviceInfo routedDevice = this.e.getRoutedDevice();
                    b(!activeRecordingConfigurations.isEmpty());
                    Iterator<AudioRecordingConfiguration> it = activeRecordingConfigurations.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            AudioRecordingConfiguration next2 = it.next();
                            AudioDeviceInfo audioDevice2 = next2.getAudioDevice();
                            if (audioDevice2 != null && next2.getClientAudioSource() == audioSource && next2.getClientAudioSessionId() == audioSessionId2 && next2.getClientFormat().getEncoding() == format2.getEncoding() && next2.getClientFormat().getSampleRate() == format2.getSampleRate() && next2.getClientFormat().getChannelMask() == format2.getChannelMask() && next2.getClientFormat().getChannelIndexMask() == format2.getChannelIndexMask() && next2.getFormat().getEncoding() != 0 && next2.getFormat().getSampleRate() > 0) {
                                if (!(next2.getFormat().getChannelMask() == 0 && next2.getFormat().getChannelIndexMask() == 0) && audioDevice2.getId() == routedDevice.getId() && audioDevice2.getType() == routedDevice.getType()) {
                                    Logging.a("WebRtcAudioRecordExternal", "verifyAudioConfig: PASS");
                                    z2 = true;
                                }
                            }
                        } else {
                            Logging.b("WebRtcAudioRecordExternal", "verifyAudioConfig: FAILED");
                            z2 = false;
                        }
                    }
                    this.n = z2;
                    this.o = true;
                    return size;
                }
            }
            return size;
        }
    }
}
