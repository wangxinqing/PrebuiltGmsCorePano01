package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.backup.ParcelableDevice;

/* renamed from: gta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gta extends bhw implements IInterface {
    final /* synthetic */ acwd a;

    public gta() {
        super("com.google.android.gms.backup.internal.IGmsRestoreCallback");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        this.a.a((Object) parcel.createTypedArrayList(ParcelableDevice.CREATOR));
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gta(acwd acwd) {
        super("com.google.android.gms.backup.internal.IGmsRestoreCallback");
        this.a = acwd;
    }
}
