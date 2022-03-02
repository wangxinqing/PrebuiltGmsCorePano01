package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;

/* renamed from: eef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eef {
    public AudioRecord a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;
    public final int f;

    protected eef(int i, int i2, boolean z, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = i3;
        this.f = i4;
    }

    public static int a(int i) {
        double d2 = (double) i;
        double m = aymc.a.a().m();
        Double.isNaN(d2);
        return (int) (d2 * m);
    }

    private static int a(String str) {
        try {
            return AudioFormat.class.getField(str).getInt((Object) null);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException e2) {
            jjg jjg = edx.a;
            return 1;
        }
    }

    private static int a(String str, boolean z) {
        if (z && "HOTWORD".equals(str)) {
            return 1999;
        }
        try {
            return MediaRecorder.AudioSource.class.getField(str).getInt((Object) null);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException e2) {
            jjg jjg = edx.a;
            return 0;
        }
    }

    private static eef a(int i, int i2) {
        String str;
        eef a2 = a(i2, i, 16, false);
        if (a2 != null) {
            jjg jjg = edx.a;
            return a2;
        } else if (i == 44100) {
            if (i2 != 0) {
                str = i2 != 1 ? i2 != 5 ? i2 != 6 ? i2 != 1999 ? "UNKNOWN" : "HOTWORD" : "VOICE_RECOGNITION" : "CAMCORDER" : "MIC";
            } else {
                str = "DEFAULT";
            }
            StringBuilder sb = new StringBuilder(str.length() + 76);
            sb.append("Unable to create a mono recording configuration for source ");
            sb.append(str);
            sb.append(" at 44100hz");
            throw new IllegalStateException(sb.toString());
        } else {
            jjg jjg2 = edx.a;
            return a(44100, i2);
        }
    }

    private static eef a(int i, int i2, int i3, boolean z) {
        int minBufferSize = AudioRecord.getMinBufferSize(i2, i3, 2);
        if (minBufferSize <= 0) {
            return null;
        }
        AudioRecord audioRecord = new AudioRecord(i, i2, i3, 2, a(minBufferSize));
        if (audioRecord.getState() != 1) {
            return null;
        }
        audioRecord.release();
        return new eef(i3, i, z, i2, minBufferSize);
    }

    public static eef a(Context context) {
        int a2 = a(aymc.c(), true);
        int r = (int) aymc.a.a().r();
        int checkPermission = context.getPackageManager().checkPermission("android.permission.CAPTURE_AUDIO_HOTWORD", context.getPackageName());
        if (a2 == 1999 && checkPermission != 0) {
            jjg jjg = edx.a;
            a2 = a(aymc.a.a().p(), false);
        }
        if (!aymc.a.a().s()) {
            return a(r, a2);
        }
        String[] split = aymc.a.a().q().split("\\|");
        int i = 0;
        for (String a3 : split) {
            i |= a(a3);
        }
        eef a4 = a(a2, r, i, true);
        if (a4 != null) {
            return a4;
        }
        eef a5 = a(6, r, 48, true);
        if (a5 != null) {
            jjg jjg2 = edx.a;
            return a5;
        }
        eef a6 = a(5, r, 12, true);
        if (a6 != null) {
            jjg jjg3 = edx.a;
            return a6;
        }
        jjg jjg4 = edx.a;
        return a(r, a2);
    }
}
