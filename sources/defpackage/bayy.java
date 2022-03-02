package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.google.android.chimera.Service;
import java.util.Arrays;
import org.chromium.net.UrlRequest;
import org.webrtc.Logging;

/* renamed from: bayy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bayy {
    public static String a() {
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

    public static String a(int i) {
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
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return "TYPE_DOCK";
            case UrlRequest.Status.READING_RESPONSE /*14*/:
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

    public static String b(int i) {
        return i != 12 ? i != 16 ? "INVALID" : "IN_MONO" : "IN_STEREO";
    }

    public static String c(int i) {
        if (i == 0) {
            return "INVALID";
        }
        switch (i) {
            case 2:
                return "PCM_16BIT";
            case 3:
                return "PCM_8BIT";
            case 4:
                return "PCM_FLOAT";
            case 5:
            case 6:
                return "AC3";
            case 7:
                return "DTS";
            case 8:
                return "DTS_HD";
            case 9:
                return "MP3";
            default:
                StringBuilder sb = new StringBuilder(29);
                sb.append("Invalid encoding: ");
                sb.append(i);
                return sb.toString();
        }
    }

    public static String d(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    public static void a(String str, Context context, AudioManager audioManager) {
        AudioManager audioManager2;
        AudioDeviceInfo[] devices;
        int length;
        String str2;
        String str3;
        String str4 = str;
        AudioManager audioManager3 = audioManager;
        int i = Build.VERSION.SDK_INT;
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.BRAND;
        String str7 = Build.DEVICE;
        String str8 = Build.ID;
        String str9 = Build.HARDWARE;
        String str10 = Build.MANUFACTURER;
        String str11 = Build.MODEL;
        String str12 = Build.PRODUCT;
        int length2 = String.valueOf(str5).length();
        StringBuilder sb = new StringBuilder(length2 + 108 + String.valueOf(str6).length() + String.valueOf(str7).length() + String.valueOf(str8).length() + String.valueOf(str9).length() + String.valueOf(str10).length() + String.valueOf(str11).length() + String.valueOf(str12).length());
        sb.append("Android SDK: ");
        sb.append(i);
        sb.append(", Release: ");
        sb.append(str5);
        sb.append(", Brand: ");
        sb.append(str6);
        sb.append(", Device: ");
        sb.append(str7);
        sb.append(", Id: ");
        sb.append(str8);
        sb.append(", Hardware: ");
        sb.append(str9);
        sb.append(", Manufacturer: ");
        sb.append(str10);
        sb.append(", Model: ");
        sb.append(str11);
        sb.append(", Product: ");
        sb.append(str12);
        Logging.a(str4, sb.toString());
        String d = d(audioManager.getMode());
        boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.microphone");
        boolean isMicrophoneMute = audioManager.isMicrophoneMute();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        boolean isBluetoothScoOn = audioManager.isBluetoothScoOn();
        StringBuilder sb2 = new StringBuilder(d.length() + 116);
        sb2.append("Audio State: audio mode: ");
        sb2.append(d);
        sb2.append(", has mic: ");
        sb2.append(hasSystemFeature);
        sb2.append(", mic muted: ");
        sb2.append(isMicrophoneMute);
        sb2.append(", music active: ");
        sb2.append(isMusicActive);
        sb2.append(", speakerphone: ");
        sb2.append(isSpeakerphoneOn);
        sb2.append(", BT SCO: ");
        sb2.append(isBluetoothScoOn);
        Logging.a(str4, sb2.toString());
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.a(str4, "Audio State: ");
        int i2 = Build.VERSION.SDK_INT;
        boolean isVolumeFixed = audioManager.isVolumeFixed();
        StringBuilder sb3 = new StringBuilder(20);
        sb3.append("  fixed volume=");
        sb3.append(isVolumeFixed);
        Logging.a(str4, sb3.toString());
        if (isVolumeFixed) {
            audioManager2 = audioManager;
        } else {
            for (int i3 = 0; i3 < 6; i3++) {
                int i4 = iArr[i3];
                StringBuilder sb4 = new StringBuilder();
                if (i4 != 0) {
                    str3 = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM";
                } else {
                    str3 = "STREAM_VOICE_CALL";
                }
                StringBuilder sb5 = new StringBuilder(str3.length() + 4);
                sb5.append("  ");
                sb5.append(str3);
                sb5.append(": ");
                sb4.append(sb5.toString());
                sb4.append("volume=");
                AudioManager audioManager4 = audioManager;
                sb4.append(audioManager4.getStreamVolume(i4));
                sb4.append(", max=");
                sb4.append(audioManager4.getStreamMaxVolume(i4));
                if (Build.VERSION.SDK_INT >= 23) {
                    sb4.append(", muted=");
                    sb4.append(audioManager4.isStreamMute(i4));
                }
                Logging.a(str4, sb4.toString());
            }
            audioManager2 = audioManager;
        }
        if (Build.VERSION.SDK_INT >= 23 && (length = devices.length) != 0) {
            Logging.a(str4, "Audio Devices: ");
            for (int i5 = 0; i5 < length; i5++) {
                AudioDeviceInfo audioDeviceInfo = (devices = audioManager2.getDevices(3))[i5];
                StringBuilder sb6 = new StringBuilder();
                sb6.append("  ");
                sb6.append(a(audioDeviceInfo.getType()));
                if (!audioDeviceInfo.isSource()) {
                    str2 = "(out): ";
                } else {
                    str2 = "(in): ";
                }
                sb6.append(str2);
                if (audioDeviceInfo.getChannelCounts().length > 0) {
                    sb6.append("channels=");
                    sb6.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                    sb6.append(", ");
                }
                if (audioDeviceInfo.getEncodings().length > 0) {
                    sb6.append("encodings=");
                    sb6.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                    sb6.append(", ");
                }
                if (audioDeviceInfo.getSampleRates().length > 0) {
                    sb6.append("sample rates=");
                    sb6.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                    sb6.append(", ");
                }
                sb6.append("id=");
                sb6.append(audioDeviceInfo.getId());
                Logging.a(str4, sb6.toString());
            }
        }
    }
}
