package defpackage;

import android.os.ParcelUuid;
import com.google.android.gms.beacon.BleFilter;

/* renamed from: gtf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gtf {
    public ParcelUuid a;
    public ParcelUuid b;
    public ParcelUuid c;
    public byte[] d;
    public byte[] e;
    private int f = -1;
    private byte[] g;
    private byte[] h;

    public final BleFilter a() {
        return new BleFilter((String) null, (String) null, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final void a(ParcelUuid parcelUuid) {
        this.a = parcelUuid;
        this.b = null;
    }

    public final void a(int i, byte[] bArr, byte[] bArr2) {
        if (bArr == null || i >= 0) {
            if (bArr2 != null) {
                if (bArr == null) {
                    throw new IllegalArgumentException("manufacturerData is null while manufacturerDataMask is not null");
                } else if (bArr.length != bArr2.length) {
                    throw new IllegalArgumentException("size mismatch for manufacturerData and manufacturerDataMask");
                }
            }
            this.f = i;
            if (bArr == null) {
                bArr = new byte[0];
            }
            this.g = bArr;
            this.h = bArr2;
            return;
        }
        throw new IllegalArgumentException("invalid manufacture id");
    }

    public final void a(ParcelUuid parcelUuid, byte[] bArr, byte[] bArr2) {
        if (parcelUuid != null) {
            if (bArr2 != null) {
                if (bArr == null) {
                    throw new IllegalArgumentException("serviceData is null while serviceDataMask is not null");
                } else if (bArr.length != bArr2.length) {
                    throw new IllegalArgumentException("size mismatch for service data and service data mask");
                }
            }
            this.c = parcelUuid;
            this.d = bArr;
            this.e = bArr2;
            return;
        }
        throw new IllegalArgumentException("serviceDataUuid is null");
    }

    public final void a(byte[] bArr) {
        a(224, bArr, (byte[]) null);
    }
}
