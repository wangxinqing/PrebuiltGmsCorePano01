package org.webrtc.voiceengine;

import android.media.AudioManager;
import android.os.Build;
import com.google.android.chimera.Service;
import java.util.Arrays;
import java.util.List;
import org.chromium.net.UrlRequest;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class WebRtcAudioUtils {
    private static final String[] BLACKLISTED_AEC_MODELS = new String[0];
    private static final String[] BLACKLISTED_NS_MODELS = new String[0];
    private static final String[] BLACKLISTED_OPEN_SL_ES_MODELS = new String[0];
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static final String TAG = "WebRtcAudioUtils";
    private static int defaultSampleRateHz = DEFAULT_SAMPLE_RATE_HZ;
    private static boolean isDefaultSampleRateOverridden;
    private static boolean useWebRtcBasedAcousticEchoCanceler;
    private static boolean useWebRtcBasedNoiseSuppressor;

    public static boolean deviceIsBlacklistedForOpenSLESUsage() {
        return Arrays.asList(BLACKLISTED_OPEN_SL_ES_MODELS).contains(Build.MODEL);
    }

    private static String deviceTypeToString(int i) {
        switch (i) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case UrlRequest.Status.WAITING_FOR_RESPONSE:
                return "TYPE_DOCK";
            case UrlRequest.Status.READING_RESPONSE:
                return "TYPE_FM";
            case Service.START_CONTINUATION_MASK:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static List getBlackListedModelsForAecUsage() {
        return Arrays.asList(BLACKLISTED_AEC_MODELS);
    }

    public static List getBlackListedModelsForNsUsage() {
        return Arrays.asList(BLACKLISTED_NS_MODELS);
    }

    public static synchronized int getDefaultSampleRateHz() {
        int i;
        synchronized (WebRtcAudioUtils.class) {
            i = defaultSampleRateHz;
        }
        return i;
    }

    public static String getThreadInfo() {
        String name = Thread.currentThread().getName();
        long id = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 33);
        sb.append("@[name=");
        sb.append(name);
        sb.append(", id=");
        sb.append(id);
        sb.append("]");
        return sb.toString();
    }

    private static boolean hasMicrophone() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    public static boolean isAutomaticGainControlSupported() {
        return false;
    }

    public static synchronized boolean isDefaultSampleRateOverridden() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            z = isDefaultSampleRateOverridden;
        }
        return z;
    }

    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private static boolean isVolumeFixed(AudioManager audioManager) {
        int i = Build.VERSION.SDK_INT;
        return audioManager.isVolumeFixed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r7 = r7.getDevices(3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void logAudioDeviceInfo(java.lang.String r6, android.media.AudioManager r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x00a3
            r0 = 3
            android.media.AudioDeviceInfo[] r7 = r7.getDevices(r0)
            int r0 = r7.length
            if (r0 == 0) goto L_0x00a3
            java.lang.String r1 = "Audio Devices: "
            org.webrtc.Logging.a(r6, r1)
            r1 = 0
        L_0x0014:
            if (r1 >= r0) goto L_0x00a3
            r2 = r7[r1]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "  "
            r3.append(r4)
            int r4 = r2.getType()
            java.lang.String r4 = deviceTypeToString(r4)
            r3.append(r4)
            boolean r4 = r2.isSource()
            if (r4 != 0) goto L_0x0036
            java.lang.String r4 = "(out): "
            goto L_0x0038
        L_0x0036:
            java.lang.String r4 = "(in): "
        L_0x0038:
            r3.append(r4)
            int[] r4 = r2.getChannelCounts()
            int r4 = r4.length
            java.lang.String r5 = ", "
            if (r4 <= 0) goto L_0x0057
            java.lang.String r4 = "channels="
            r3.append(r4)
            int[] r4 = r2.getChannelCounts()
            java.lang.String r4 = java.util.Arrays.toString(r4)
            r3.append(r4)
            r3.append(r5)
        L_0x0057:
            int[] r4 = r2.getEncodings()
            int r4 = r4.length
            if (r4 <= 0) goto L_0x0071
            java.lang.String r4 = "encodings="
            r3.append(r4)
            int[] r4 = r2.getEncodings()
            java.lang.String r4 = java.util.Arrays.toString(r4)
            r3.append(r4)
            r3.append(r5)
        L_0x0071:
            int[] r4 = r2.getSampleRates()
            int r4 = r4.length
            if (r4 <= 0) goto L_0x008b
            java.lang.String r4 = "sample rates="
            r3.append(r4)
            int[] r4 = r2.getSampleRates()
            java.lang.String r4 = java.util.Arrays.toString(r4)
            r3.append(r4)
            r3.append(r5)
        L_0x008b:
            java.lang.String r4 = "id="
            r3.append(r4)
            int r2 = r2.getId()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            org.webrtc.Logging.a(r6, r2)
            int r1 = r1 + 1
            goto L_0x0014
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.voiceengine.WebRtcAudioUtils.logAudioDeviceInfo(java.lang.String, android.media.AudioManager):void");
    }

    static void logAudioState(String str) {
        logDeviceInfo(str);
        AudioManager audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        logAudioStateBasic(str, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    private static void logAudioStateBasic(String str, AudioManager audioManager) {
        String modeToString = modeToString(audioManager.getMode());
        boolean hasMicrophone = hasMicrophone();
        boolean isMicrophoneMute = audioManager.isMicrophoneMute();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        boolean isBluetoothScoOn = audioManager.isBluetoothScoOn();
        StringBuilder sb = new StringBuilder(modeToString.length() + 116);
        sb.append("Audio State: audio mode: ");
        sb.append(modeToString);
        sb.append(", has mic: ");
        sb.append(hasMicrophone);
        sb.append(", mic muted: ");
        sb.append(isMicrophoneMute);
        sb.append(", music active: ");
        sb.append(isMusicActive);
        sb.append(", speakerphone: ");
        sb.append(isSpeakerphoneOn);
        sb.append(", BT SCO: ");
        sb.append(isBluetoothScoOn);
        Logging.a(str, sb.toString());
    }

    private static void logAudioStateVolume(String str, AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.a(str, "Audio State: ");
        boolean isVolumeFixed = isVolumeFixed(audioManager);
        StringBuilder sb = new StringBuilder(20);
        sb.append("  fixed volume=");
        sb.append(isVolumeFixed);
        Logging.a(str, sb.toString());
        if (!isVolumeFixed) {
            for (int i = 0; i < 6; i++) {
                int i2 = iArr[i];
                StringBuilder sb2 = new StringBuilder();
                String streamTypeToString = streamTypeToString(i2);
                StringBuilder sb3 = new StringBuilder(streamTypeToString.length() + 4);
                sb3.append("  ");
                sb3.append(streamTypeToString);
                sb3.append(": ");
                sb2.append(sb3.toString());
                sb2.append("volume=");
                sb2.append(audioManager.getStreamVolume(i2));
                sb2.append(", max=");
                sb2.append(audioManager.getStreamMaxVolume(i2));
                logIsStreamMute(str, audioManager, i2, sb2);
                Logging.a(str, sb2.toString());
            }
        }
    }

    static void logDeviceInfo(String str) {
        int i = Build.VERSION.SDK_INT;
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.BRAND;
        String str4 = Build.DEVICE;
        String str5 = Build.ID;
        String str6 = Build.HARDWARE;
        String str7 = Build.MANUFACTURER;
        String str8 = Build.MODEL;
        String str9 = Build.PRODUCT;
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        int length3 = String.valueOf(str4).length();
        int length4 = String.valueOf(str5).length();
        int length5 = String.valueOf(str6).length();
        int length6 = String.valueOf(str7).length();
        String str10 = str9;
        StringBuilder sb = new StringBuilder(length + 108 + length2 + length3 + length4 + length5 + length6 + String.valueOf(str8).length() + String.valueOf(str9).length());
        sb.append("Android SDK: ");
        sb.append(i);
        sb.append(", Release: ");
        sb.append(str2);
        sb.append(", Brand: ");
        sb.append(str3);
        sb.append(", Device: ");
        sb.append(str4);
        sb.append(", Id: ");
        sb.append(str5);
        sb.append(", Hardware: ");
        sb.append(str6);
        sb.append(", Manufacturer: ");
        sb.append(str7);
        sb.append(", Model: ");
        sb.append(str8);
        sb.append(", Product: ");
        sb.append(str10);
        Logging.a(str, sb.toString());
    }

    private static void logIsStreamMute(String str, AudioManager audioManager, int i, StringBuilder sb) {
        if (Build.VERSION.SDK_INT >= 23) {
            sb.append(", muted=");
            sb.append(audioManager.isStreamMute(i));
        }
    }

    static String modeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    public static boolean runningOnEmulator() {
        return Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_");
    }

    public static synchronized void setDefaultSampleRateHz(int i) {
        synchronized (WebRtcAudioUtils.class) {
            isDefaultSampleRateOverridden = true;
            defaultSampleRateHz = i;
        }
    }

    public static synchronized void setWebRtcBasedAcousticEchoCanceler(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedAcousticEchoCanceler = z;
        }
    }

    public static synchronized void setWebRtcBasedAutomaticGainControl(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            Logging.c(TAG, "setWebRtcBasedAutomaticGainControl() is deprecated");
        }
    }

    public static synchronized void setWebRtcBasedNoiseSuppressor(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedNoiseSuppressor = z;
        }
    }

    private static String streamTypeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
    }

    public static synchronized boolean useWebRtcBasedAcousticEchoCanceler() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            if (useWebRtcBasedAcousticEchoCanceler) {
                Logging.c(TAG, "Overriding default behavior; now using WebRTC AEC!");
            }
            z = useWebRtcBasedAcousticEchoCanceler;
        }
        return z;
    }

    public static synchronized boolean useWebRtcBasedAutomaticGainControl() {
        synchronized (WebRtcAudioUtils.class) {
        }
        return true;
    }

    public static synchronized boolean useWebRtcBasedNoiseSuppressor() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            if (useWebRtcBasedNoiseSuppressor) {
                Logging.c(TAG, "Overriding default behavior; now using WebRTC NS!");
            }
            z = useWebRtcBasedNoiseSuppressor;
        }
        return z;
    }
}
