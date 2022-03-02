package defpackage;

import java.util.Locale;

/* renamed from: ahnw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahnw {
    public final int a;
    public final long b;
    public final long c;
    public final float d;
    public final int e;

    public ahnw(int i, long j, long j2, float f, int i2) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = f;
        this.e = i2;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[5];
        switch (this.a) {
            case 0:
                str = "NOT_FLOOR_CHANGE";
                break;
            case 1:
                str = "STAIRS_UP";
                break;
            case 2:
                str = "STAIRS_DOWN";
                break;
            case 3:
                str = "ELEVATOR_UP";
                break;
            case 4:
                str = "ELEVATOR_DOWN";
                break;
            case 5:
                str = "ESCALATOR_UP";
                break;
            case 6:
                str = "ESCALATOR_DOWN";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        objArr[0] = str;
        objArr[1] = Integer.valueOf(this.e);
        objArr[2] = Float.valueOf(this.d);
        double d2 = (double) this.b;
        Double.isNaN(d2);
        objArr[3] = Double.valueOf(d2 * 1.0E-9d);
        double d3 = (double) this.c;
        Double.isNaN(d3);
        objArr[4] = Double.valueOf(d3 * 1.0E-9d);
        return String.format(locale, "FloorChangeActivity [type=%s, confidence=%d, altitudeChange=%.2f, start=%.2fs, end=%.2fs]", objArr);
    }
}
