package defpackage;

import android.bluetooth.le.ScanRecord;
import android.content.Context;
import android.os.Build;
import android.os.ParcelUuid;
import android.util.SparseArray;
import com.google.android.gms.beacon.BleFilter;
import java.util.Arrays;

/* renamed from: tga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tga extends gtt {
    public static final ParcelUuid a = ParcelUuid.fromString("0000FE2C-0000-1000-8000-00805F9B34FB");
    public static final BleFilter b;

    static {
        gtf gtf = new gtf();
        ParcelUuid parcelUuid = a;
        byte[] bArr = new byte[0];
        if (parcelUuid != null) {
            gtf.c = parcelUuid;
            gtf.d = bArr;
            gtf.e = null;
            b = gtf.a();
            return;
        }
        throw new IllegalArgumentException("serviceDataUuid is null");
    }

    public static boolean b(byte[] bArr) {
        int d;
        if (bArr != null) {
            int length = bArr.length;
            if (length == 3) {
                return true;
            }
            if (length <= 3 || c(bArr) != 0 || (d = d(bArr)) < 3 || d > 14 || d + 1 > length) {
                return false;
            }
            return true;
        }
        return false;
    }

    private static int c(byte[] bArr) {
        if (bArr.length != 3) {
            return (bArr[0] & 224) >> 5;
        }
        return 0;
    }

    private static int d(byte[] bArr) {
        if (bArr.length != 3) {
            return (bArr[0] & 30) >> 1;
        }
        return 3;
    }

    public static byte[] e(ScanRecord scanRecord) {
        if (aymw.M()) {
            return a(scanRecord.getServiceData(a), 4);
        }
        return null;
    }

    public static byte[] f(gti gti) {
        if (aymw.M()) {
            return a(gti.a(a), 3);
        }
        return null;
    }

    public static byte[] g(gti gti) {
        if (aymw.M()) {
            return a(gti.a(a), 4);
        }
        return null;
    }

    public final int a() {
        return 106;
    }

    public final Integer b(gti gti) {
        return null;
    }

    public static boolean a(Context context) {
        if (context.getPackageManager().hasSystemFeature("org.chromium.arc")) {
            return aymw.a.a().P();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return aymw.B();
        }
        return false;
    }

    public static byte[] c(ScanRecord scanRecord) {
        if (aymw.Y()) {
            return a(scanRecord.getServiceData(a), 2);
        }
        return null;
    }

    public static byte[] d(ScanRecord scanRecord) {
        if (aymw.M()) {
            return a(scanRecord.getServiceData(a), 3);
        }
        return null;
    }

    public static byte[] b(ScanRecord scanRecord) {
        return a(scanRecord.getServiceData(a), 1);
    }

    public static byte[] e(gti gti) {
        if (aymw.Y()) {
            return a(gti.a(a), 2);
        }
        return null;
    }

    public static byte[] a(ScanRecord scanRecord) {
        return a(scanRecord.getServiceData(a), 0);
    }

    public static byte[] a(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) < 3) {
            return null;
        }
        if (length == 3) {
            return bArr;
        }
        int i = 1;
        int d = d(bArr) + 1;
        while (bArr[i] == 0 && d - i > 3) {
            i++;
        }
        return Arrays.copyOfRange(bArr, i, d);
    }

    public static byte[] a(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            SparseArray sparseArray = new SparseArray();
            if (c(bArr) == 0) {
                int d = d(bArr) + 1;
                while (true) {
                    int length = bArr.length;
                    if (d >= length) {
                        break;
                    }
                    byte b2 = bArr[d];
                    int i2 = d + 1;
                    byte b3 = b2 & 15;
                    int i3 = ((b2 & 240) >> 4) + i2;
                    if (sparseArray.get(b3) == null) {
                        if (i3 <= length) {
                            sparseArray.put(b3, Arrays.copyOfRange(bArr, i2, i3));
                        } else {
                            StringBuilder sb = new StringBuilder(72);
                            sb.append("Invalid length, ");
                            sb.append(i3);
                            sb.append(" is longer than service data size ");
                            sb.append(length);
                            throw new tfz(sb.toString());
                        }
                    }
                    d = i3;
                }
            }
            return (byte[]) sparseArray.get(i);
        } catch (tfz e) {
            jjg jjg = tgb.a;
            return null;
        }
    }

    public final Integer a(int i) {
        return Integer.valueOf(i);
    }

    public final byte[] a(gti gti) {
        return a(gti.a(a));
    }
}
