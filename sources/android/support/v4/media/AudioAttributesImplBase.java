package android.support.v4.media;

import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplBase) {
            AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
            if (this.b == audioAttributesImplBase.b) {
                int i = this.c;
                int i2 = audioAttributesImplBase.c;
                int i3 = audioAttributesImplBase.d;
                if (i3 == -1) {
                    i3 = AudioAttributesCompat.a(i2, audioAttributesImplBase.a);
                }
                if (i3 == 6) {
                    i2 |= 4;
                } else if (i3 == 7) {
                    i2 |= 1;
                }
                if (i == (i2 & 273) && this.a == audioAttributesImplBase.a && this.d == audioAttributesImplBase.d) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.d)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.a(this.a));
        sb.append(" content=");
        sb.append(this.b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }
}
