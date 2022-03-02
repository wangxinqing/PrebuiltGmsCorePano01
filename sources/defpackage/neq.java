package defpackage;

import android.os.Parcel;
import com.google.android.gms.fitness.result.BleDevicesResult;

/* renamed from: neq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class neq extends bhw implements ner {
    private final idg a;

    public neq() {
        super("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        this.a.a((Object) (BleDevicesResult) bhx.a(parcel, BleDevicesResult.CREATOR));
        return true;
    }

    public neq(idg idg) {
        super("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
        this.a = idg;
    }
}
