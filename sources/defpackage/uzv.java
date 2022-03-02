package defpackage;

import android.os.ParcelUuid;
import com.google.android.gms.nearby.messages.ble.BleFilter;

/* renamed from: uzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uzv {
    public ParcelUuid a;
    public int b = -1;
    public byte[] c;
    public byte[] d;

    public final BleFilter a() {
        return new BleFilter(1, this.a, (ParcelUuid) null, (ParcelUuid) null, (byte[]) null, (byte[]) null, this.b, this.c, this.d);
    }
}
