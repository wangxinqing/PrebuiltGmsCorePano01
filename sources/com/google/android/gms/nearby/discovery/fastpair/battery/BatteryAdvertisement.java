package com.google.android.gms.nearby.discovery.fastpair.battery;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.libraries.bluetooth.fastpair.HeadsetPiece;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BatteryAdvertisement extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new twy();
    private static final int[] t = {10, 11, 12};
    private static final int[] u = {13, 14, 15};
    public String a;
    public byte[] b;
    public boolean c;
    public double d;
    public long e;
    public auay f;
    public String g;
    String h;
    String i;
    String j;
    public Uri k;
    public Uri l;
    public Uri m;
    public Uri n;
    public long o;
    String p;
    public boolean q = false;
    public boolean r = false;
    public int s = 3;

    public BatteryAdvertisement() {
    }

    public static int a(byte b2) {
        byte b3 = b2 & Byte.MAX_VALUE;
        if (b3 > 100) {
            return -1;
        }
        return b3;
    }

    public static boolean b(byte b2) {
        return (b2 & 128) != 0;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < this.b.length; i2++) {
            sb.append(String.format(Locale.ENGLISH, " [%d](%s, %d)", new Object[]{Integer.valueOf(i2), Boolean.valueOf(b(this.b[i2])), Integer.valueOf(a(this.b[i2]))}));
        }
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[8];
        objArr[0] = this.a;
        objArr[1] = Double.valueOf(this.d);
        objArr[2] = Long.valueOf(this.e);
        if (!this.c) {
            str = "show";
        } else {
            str = "hide";
        }
        objArr[3] = str;
        objArr[4] = sb;
        String str4 = this.g;
        if (str4 == null) {
            str4 = "<null>";
        }
        objArr[5] = str4;
        if (!this.q) {
            str2 = "no";
        } else {
            str2 = "yes";
        }
        objArr[6] = str2;
        int i3 = this.s;
        if (i3 != 1) {
            str3 = i3 != 2 ? i3 != 3 ? "null" : "UNKNOWN" : "RFCOMM";
        } else {
            str3 = "BLE";
        }
        objArr[7] = str3;
        return String.format(locale, "BatteryAdvertisement, address:%s, distance:%.3fm, timestamp:%d, %s battery:%s, name:%s, shown:%s, type:%s", objArr);
    }

    public BatteryAdvertisement(String str, byte[] bArr, boolean z, double d2, long j2, String str2, String str3, String str4, String str5, Uri uri, Uri uri2, Uri uri3, Uri uri4, long j3, String str6) {
        this.a = str;
        this.b = bArr;
        this.c = z;
        this.d = d2;
        this.e = j2;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = uri;
        this.l = uri2;
        this.m = uri3;
        this.n = uri4;
        this.o = j3;
        this.p = str6;
    }

    public static void a(String str, byte[] bArr, byte[] bArr2) {
        if ((bArr == null || bArr.length == 3) && bArr2.length == 3 && aymw.ac() && jkr.h()) {
            jjg jjg = tsp.a;
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
            for (int i2 = 0; i2 < 3; i2++) {
                int a2 = a(bArr2[i2]);
                if (bArr == null || a2 != a(bArr[i2])) {
                    arww.a(remoteDevice, t[i2], Integer.toString(a2));
                }
                boolean b2 = b(bArr2[i2]);
                if (bArr == null || b2 != b(bArr[i2])) {
                    arww.a(remoteDevice, u[i2], Boolean.toString(b2));
                }
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.g, false);
        ivx.a(parcel, 7, this.h, false);
        ivx.a(parcel, 8, this.i, false);
        ivx.a(parcel, 9, this.j, false);
        ivx.a(parcel, 10, this.k, i2, false);
        ivx.a(parcel, 11, this.l, i2, false);
        ivx.a(parcel, 12, this.m, i2, false);
        ivx.a(parcel, 13, this.n, i2, false);
        ivx.a(parcel, 14, this.o);
        ivx.a(parcel, 15, this.p, false);
        ivx.b(parcel, a2);
    }

    public final TrueWirelessHeadset a() {
        if (this.b.length < 3) {
            return null;
        }
        aeim i2 = TrueWirelessHeadset.i();
        i2.b(this.g);
        i2.a = this.k;
        aehp f2 = HeadsetPiece.f();
        f2.b((int) aymt.e());
        f2.a(a(this.b[0]));
        f2.a(b(this.b[0]));
        f2.a(this.h);
        f2.a = this.l;
        i2.b(f2.a());
        aehp f3 = HeadsetPiece.f();
        f3.b((int) aymt.e());
        f3.a(a(this.b[1]));
        f3.a(b(this.b[1]));
        f3.a(this.i);
        f3.a = this.m;
        i2.c(f3.a());
        aehp f4 = HeadsetPiece.f();
        f4.b((int) aymt.d());
        f4.a(a(this.b[2]));
        f4.a(b(this.b[2]));
        f4.a(this.j);
        f4.a = this.n;
        i2.a(f4.a());
        i2.b(this.e);
        i2.a(this.p);
        i2.a(this.o);
        return i2.a();
    }

    public final void a(uaj uaj) {
        String str;
        this.g = uaj.h;
        this.p = uaj.y;
        auzo auzo = uaj.I;
        if (auzo == null) {
            auzo = auzo.j;
        }
        if ((auzo.a & 4) != 0) {
            auzo auzo2 = uaj.I;
            if (auzo2 == null) {
                auzo2 = auzo.j;
            }
            avan avan = auzo2.d;
            if (avan == null) {
                avan = avan.d;
            }
            this.h = avan.a;
            auzo auzo3 = uaj.I;
            if (auzo3 == null) {
                auzo3 = auzo.j;
            }
            avan avan2 = auzo3.d;
            if (avan2 == null) {
                avan2 = avan.d;
            }
            this.i = avan2.b;
            auzo auzo4 = uaj.I;
            if (auzo4 == null) {
                auzo4 = auzo.j;
            }
            avan avan3 = auzo4.d;
            if (avan3 == null) {
                avan3 = avan.d;
            }
            str = avan3.c;
        } else {
            str = "";
            this.h = str;
            this.i = str;
        }
        this.j = str;
    }

    public final void a(byte[] bArr) {
        this.b = bArr;
        this.e = SystemClock.elapsedRealtime();
    }
}
