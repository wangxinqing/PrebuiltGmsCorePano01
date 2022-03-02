package defpackage;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import java.util.UUID;
import org.webrtc.Logging;

/* renamed from: bayu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bayu {
    private static final UUID e = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID f = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static AudioEffect.Descriptor[] g;
    public AcousticEchoCanceler a;
    public NoiseSuppressor b;
    public boolean c;
    public boolean d;

    public bayu() {
        String valueOf = String.valueOf(bayy.a());
        Logging.a("WebRtcAudioEffectsExternal", valueOf.length() == 0 ? new String("ctor") : "ctor".concat(valueOf));
    }

    public static void a(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static boolean b() {
        int i = Build.VERSION.SDK_INT;
        return a(AudioEffect.EFFECT_TYPE_NS, f);
    }

    public static boolean a() {
        int i = Build.VERSION.SDK_INT;
        return a(AudioEffect.EFFECT_TYPE_AEC, e);
    }

    private static boolean a(UUID uuid, UUID uuid2) {
        AudioEffect.Descriptor[] descriptorArr = g;
        if (descriptorArr == null) {
            descriptorArr = AudioEffect.queryEffects();
            g = descriptorArr;
        }
        if (descriptorArr != null) {
            int length = descriptorArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                AudioEffect.Descriptor descriptor = descriptorArr[i];
                if (!descriptor.type.equals(uuid)) {
                    i++;
                } else if (!descriptor.uuid.equals(uuid2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
