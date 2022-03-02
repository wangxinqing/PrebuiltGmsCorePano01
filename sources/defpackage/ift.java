package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: ift  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ift extends bhw implements ifu {
    public ift() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR));
        return true;
    }
}
