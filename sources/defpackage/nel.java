package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: nel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nel extends bhw implements nem {
    private final idg a;

    public nel() {
        super("com.google.android.gms.fitness.internal.IStatusCallback");
    }

    public nel(idg idg) {
        super("com.google.android.gms.fitness.internal.IStatusCallback");
        this.a = idg;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        this.a.a((Object) (Status) bhx.a(parcel, Status.CREATOR));
        return true;
    }
}
