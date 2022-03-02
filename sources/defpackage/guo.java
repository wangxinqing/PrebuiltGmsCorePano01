package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.beacon.BleSighting;

/* renamed from: guo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class guo extends bhw implements IInterface {
    final ige a;

    public guo() {
        super("com.google.android.gms.beacon.internal.IBleListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            this.a.a(new guj(parcel.readInt(), (BleSighting) bhx.a(parcel, BleSighting.CREATOR)));
            return true;
        } else if (i == 3) {
            this.a.a(new guk(parcel.createTypedArrayList(BleSighting.CREATOR)));
            return true;
        } else if (i == 4) {
            this.a.a(new gum(parcel.readString()));
            return true;
        } else if (i != 5) {
            return false;
        } else {
            this.a.a(new gul(parcel.readInt()));
            return true;
        }
    }

    public guo(ige ige) {
        super("com.google.android.gms.beacon.internal.IBleListener");
        this.a = ige;
    }
}
