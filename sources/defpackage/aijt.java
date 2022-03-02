package defpackage;

import android.app.PendingIntent;
import android.location.Location;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Locale;

/* renamed from: aijt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aijt {
    public final ParcelableGeofence a;
    public final PendingIntent b;
    public final String c;
    public final int d;
    public byte e;
    public boolean f = true;
    public long g = -1;
    public boolean h;
    public boolean i;
    public final int j;
    public final aijz k;
    private double l;

    public aijt(ParcelableGeofence parcelableGeofence, int i2, PendingIntent pendingIntent, int i3, String str) {
        float f2;
        int i4;
        ParcelableGeofence parcelableGeofence2;
        ParcelableGeofence parcelableGeofence3 = parcelableGeofence;
        boolean z = true;
        boolean z2 = false;
        this.h = false;
        this.i = false;
        this.l = -1.0d;
        this.e = 0;
        if (axxg.b()) {
            float f3 = parcelableGeofence3.f;
            float geofenceMinimumRadiusMeters = (float) ((int) axxg.a.a().geofenceMinimumRadiusMeters());
            z2 = f3 < geofenceMinimumRadiusMeters ? true : z2;
            if (f3 >= geofenceMinimumRadiusMeters) {
                f2 = f3;
            } else {
                f2 = geofenceMinimumRadiusMeters;
            }
            int i5 = parcelableGeofence3.h;
            int geofenceMinimumResponsivenessMillis = (int) axxg.a.a().geofenceMinimumResponsivenessMillis();
            if (i5 >= geofenceMinimumResponsivenessMillis) {
                z = z2;
                i4 = i5;
            } else {
                i4 = geofenceMinimumResponsivenessMillis;
            }
            if (z) {
                parcelableGeofence2 = new ParcelableGeofence(parcelableGeofence3.a, parcelableGeofence3.g, parcelableGeofence3.c, parcelableGeofence3.d, parcelableGeofence3.e, f2, parcelableGeofence3.b, i4, parcelableGeofence3.i);
            } else {
                parcelableGeofence2 = parcelableGeofence3;
            }
            this.a = parcelableGeofence2;
        } else {
            this.a = parcelableGeofence3;
        }
        this.b = pendingIntent;
        this.d = i2;
        this.k = new aijz(parcelableGeofence3);
        this.j = i3;
        this.c = str;
    }

    public static byte b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return 0;
        }
        byte b2 = 1;
        if (i3 != 1) {
            b2 = 2;
            if (i3 != 2) {
                b2 = 3;
                if (i3 != 3) {
                    return 4;
                }
            }
        }
        return b2;
    }

    private static final int b(byte b2) {
        if (b2 == 0) {
            return 1;
        }
        if (b2 == 1) {
            return 2;
        }
        if (b2 != 2) {
            return b2 != 3 ? 5 : 4;
        }
        return 3;
    }

    public final byte a(byte b2) {
        return b2 != 1 ? b2 != 2 ? (b2 == 4 && (this.a.g & 4) != 0) ? (byte) 4 : 0 : (this.a.g & 2) != 0 ? (byte) 2 : 0 : (this.a.g & 1) != 0 ? (byte) 1 : 0;
    }

    public final short a() {
        return this.k.b;
    }

    public final boolean c() {
        return ((this.a.g & 4) == 0 || this.g == -1 || this.h) ? false : true;
    }

    public final int d() {
        return !c() ? Integer.MAX_VALUE : 60;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String a2;
        aijz aijz = this.k;
        byte b2 = aijz.b;
        if (b2 != 1) {
            str = b2 != 2 ? b2 != 3 ? b2 != 4 ? "?" : "STATE_OUTSIDE_LOW_CONFIDENCE" : "STATE_INSIDE_LOW_CONFIDENCE" : "OUT";
        } else {
            str = "IN";
        }
        if (aijz.c != Double.MAX_VALUE) {
            str2 = String.format(Locale.US, "%.0f", new Object[]{Double.valueOf(this.k.c)});
        } else {
            str2 = "UNKNOWN";
        }
        if (!this.h) {
            str3 = "";
        } else {
            str3 = " dwelled";
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[6];
        objArr[0] = this.a.toString();
        objArr[1] = Integer.valueOf(this.d);
        objArr[2] = str2;
        objArr[3] = str;
        objArr[4] = str3;
        PendingIntent pendingIntent = this.b;
        String str4 = "<null>";
        if (!(pendingIntent == null || (a2 = ajqj.a(pendingIntent)) == null)) {
            str4 = a2;
        }
        objArr[5] = str4;
        return String.format(locale, "%s it=%d, d=%s %s%s %s", objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        if ((r8.d & 2) != 0) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte a(long r9, android.location.Location r11) {
        /*
            r8 = this;
            r0 = 1
            r8.f = r0
            aijz r1 = r8.k
            r1.a(r11)
            aijz r11 = r8.k
            byte r11 = r11.b
            r1 = 2
            r2 = 0
            if (r11 != r0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            if (r11 == r1) goto L_0x0015
            goto L_0x0079
        L_0x0015:
            r3 = -1
            if (r11 == r0) goto L_0x001f
            r8.g = r3
            r8.h = r2
            r9 = 0
            goto L_0x0044
        L_0x001f:
            boolean r5 = r8.h
            if (r5 != 0) goto L_0x0042
            long r5 = r8.g
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x003f
            long r9 = r9 - r5
            com.google.android.gms.location.internal.ParcelableGeofence r5 = r8.a
            int r5 = r5.i
            long r5 = (long) r5
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0037
            boolean r9 = defpackage.aikq.a
            r9 = 0
            goto L_0x0044
        L_0x0037:
            r8.h = r0
            r8.g = r3
            boolean r9 = defpackage.aikq.a
            r9 = 1
            goto L_0x0044
        L_0x003f:
            r8.g = r9
            goto L_0x0043
        L_0x0042:
        L_0x0043:
            r9 = 0
        L_0x0044:
            byte r10 = r8.e
            if (r10 != 0) goto L_0x005b
            r8.e = r11
            if (r11 != r0) goto L_0x0053
            int r10 = r8.d
            r10 = r10 & r0
            if (r10 == 0) goto L_0x0053
            r2 = 1
            goto L_0x0064
        L_0x0053:
            if (r11 != r1) goto L_0x0064
            int r10 = r8.d
            r10 = r10 & r1
            if (r10 == 0) goto L_0x0064
            goto L_0x0063
        L_0x005b:
            if (r10 == r11) goto L_0x0064
            r8.e = r11
            if (r11 != r0) goto L_0x0063
            r2 = 1
            goto L_0x0064
        L_0x0063:
            r2 = 2
        L_0x0064:
            r10 = 4
            if (r9 == 0) goto L_0x0074
            boolean r9 = r8.i
            if (r9 != 0) goto L_0x0072
            int r9 = r8.d
            r9 = r9 & r10
            if (r9 == 0) goto L_0x0074
            r2 = 4
            goto L_0x0075
        L_0x0072:
            r2 = 4
            goto L_0x0075
        L_0x0074:
        L_0x0075:
            if (r11 != r1) goto L_0x0079
            r8.i = r0
        L_0x0079:
            byte r9 = r8.a((byte) r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aijt.a(long, android.location.Location):byte");
    }

    public final double b() {
        if (Double.compare(this.k.c, Double.MAX_VALUE) == 0) {
            return Double.MAX_VALUE;
        }
        double d2 = (double) this.a.f;
        double d3 = this.k.c;
        Double.isNaN(d2);
        return Math.abs(d2 - d3);
    }

    public final double a(Location location) {
        if (location == null) {
            return this.l;
        }
        ParcelableGeofence parcelableGeofence = this.a;
        double b2 = aell.b(parcelableGeofence.d, parcelableGeofence.e, location.getLatitude(), location.getLongitude());
        double d2 = (double) this.a.f;
        Double.isNaN(d2);
        double abs = Math.abs(d2 - b2);
        this.l = abs;
        return abs;
    }

    public final int a(double d2) {
        double b2 = b();
        if (b2 == Double.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (d2 == 0.0d) {
            d2 = 1.0E-20d;
        }
        double d3 = b2 / d2;
        double d4 = (double) (this.a.h / ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
        Double.isNaN(d4);
        double d5 = d3 + d4;
        if (d5 < 2.147483646E9d) {
            return (int) d5;
        }
        return 2147483646;
    }

    public final ailt a(String str) {
        aucd o = ails.l.o();
        String str2 = this.a.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        ails ails = (ails) o.b;
        str2.getClass();
        int i2 = ails.a | 32;
        ails.a = i2;
        ails.g = str2;
        ParcelableGeofence parcelableGeofence = this.a;
        double d2 = parcelableGeofence.d;
        int i3 = i2 | 2;
        ails.a = i3;
        ails.c = d2;
        double d3 = parcelableGeofence.e;
        int i4 = i3 | 4;
        ails.a = i4;
        ails.d = d3;
        float f2 = parcelableGeofence.f;
        int i5 = i4 | 8;
        ails.a = i5;
        ails.e = f2;
        short s = parcelableGeofence.c;
        if (s == 1) {
            ails.b = 1;
            int i6 = i5 | 1;
            ails.a = i6;
            long j2 = parcelableGeofence.b;
            int i7 = i6 | 16;
            ails.a = i7;
            ails.f = j2;
            int i8 = parcelableGeofence.g;
            int i9 = i7 | 64;
            ails.a = i9;
            ails.h = i8;
            int i10 = parcelableGeofence.h;
            int i11 = i9 | 128;
            ails.a = i11;
            ails.i = i10;
            int i12 = parcelableGeofence.i;
            int i13 = i11 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            ails.a = i13;
            ails.j = i12;
            int i14 = this.d;
            ails.a = i13 | 512;
            ails.k = i14;
            ails ails2 = (ails) o.i();
            aucd o2 = ailt.k.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ailt ailt = (ailt) o2.b;
            ails2.getClass();
            ailt.b = ails2;
            ailt.a |= 1;
            int b2 = b(this.k.b);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ailt ailt2 = (ailt) o2.b;
            ailt2.d = b2 - 1;
            ailt2.a |= 4;
            int b3 = b(this.e);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ailt ailt3 = (ailt) o2.b;
            ailt3.e = b3 - 1;
            int i15 = ailt3.a | 8;
            ailt3.a = i15;
            long j3 = this.g;
            int i16 = i15 | 16;
            ailt3.a = i16;
            ailt3.f = j3;
            boolean z = this.h;
            int i17 = i16 | 32;
            ailt3.a = i17;
            ailt3.g = z;
            str.getClass();
            int i18 = i17 | 2;
            ailt3.a = i18;
            ailt3.c = str;
            boolean z2 = this.i;
            int i19 = i18 | 64;
            ailt3.a = i19;
            ailt3.h = z2;
            int i20 = this.j;
            int i21 = i19 | 128;
            ailt3.a = i21;
            ailt3.i = i20;
            String str3 = this.c;
            str3.getClass();
            ailt3.a = i21 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            ailt3.j = str3;
            return (ailt) o2.i();
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("Type ");
        sb.append(s);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final arli a(int i2) {
        ParcelableGeofence parcelableGeofence = this.a;
        aucd o = arli.l.o();
        int i3 = (int) (parcelableGeofence.d * 1.0E7d);
        if (o.c) {
            o.c();
            o.c = false;
        }
        arli arli = (arli) o.b;
        int i4 = arli.a | 1;
        arli.a = i4;
        arli.b = i3;
        double d2 = parcelableGeofence.e;
        int i5 = i4 | 2;
        arli.a = i5;
        arli.c = (int) (d2 * 1.0E7d);
        float f2 = parcelableGeofence.f;
        int i6 = i5 | 4;
        arli.a = i6;
        arli.d = (int) f2;
        int i7 = parcelableGeofence.h;
        int i8 = i6 | 8;
        arli.a = i8;
        arli.e = (int) (((long) i7) / 1000);
        int i9 = parcelableGeofence.i;
        int i10 = i8 | 16;
        arli.a = i10;
        arli.f = (int) (((long) i9) / 1000);
        int i11 = parcelableGeofence.g;
        int i12 = i10 | 32;
        arli.a = i12;
        arli.g = i11;
        int i13 = this.d;
        int i14 = i12 | 128;
        arli.a = i14;
        arli.i = i11 & i13;
        int i15 = i14 | 64;
        arli.a = i15;
        arli.h = i2;
        int i16 = this.j;
        arli.a = i15 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        arli.j = i16;
        aucd o2 = arlu.f.o();
        byte b2 = this.k.b;
        if (b2 == 0) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arlu arlu = (arlu) o2.b;
            arlu.b = 0;
            arlu.a |= 1;
        } else if (b2 == 1) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arlu arlu2 = (arlu) o2.b;
            arlu2.b = 1;
            arlu2.a |= 1;
        } else if (b2 != 2) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arlu arlu3 = (arlu) o2.b;
            arlu3.b = 3;
            arlu3.a |= 1;
        } else {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arlu arlu4 = (arlu) o2.b;
            arlu4.b = 2;
            arlu4.a |= 1;
        }
        byte b3 = this.e;
        if (b3 == 0) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arlu arlu5 = (arlu) o2.b;
            arlu5.c = 0;
            arlu5.a = 2 | arlu5.a;
        } else if (b3 != 1) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arlu arlu6 = (arlu) o2.b;
            arlu6.c = 2;
            arlu6.a = 2 | arlu6.a;
        } else if (this.h) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arlu arlu7 = (arlu) o2.b;
            arlu7.c = 3;
            arlu7.a = 2 | arlu7.a;
        } else {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arlu arlu8 = (arlu) o2.b;
            arlu8.c = 1;
            arlu8.a = 2 | arlu8.a;
        }
        if (c()) {
            int i17 = (int) (this.g / 1000);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arlu arlu9 = (arlu) o2.b;
            arlu9.a |= 4;
            arlu9.d = i17;
        } else {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arlu arlu10 = (arlu) o2.b;
            arlu10.a |= 4;
            arlu10.d = -1;
        }
        boolean z = this.i;
        arlu arlu11 = (arlu) o2.b;
        arlu11.a |= 8;
        arlu11.e = z;
        if (o.c) {
            o.c();
            o.c = false;
        }
        arli arli2 = (arli) o.b;
        arlu arlu12 = (arlu) o2.i();
        arlu12.getClass();
        arli2.k = arlu12;
        arli2.a |= 512;
        return (arli) o.i();
    }
}
