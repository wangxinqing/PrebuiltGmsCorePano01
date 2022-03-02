package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: ere  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ere extends bhw implements erf {
    private final acwd a;

    public ere() {
        super("com.google.android.gms.auth.account.internal.IBooleanResultCallback");
    }

    public final void a(int i, boolean z) {
        ihd.a(new Status(i), Boolean.valueOf(z), this.a);
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        a(parcel.readInt(), bhx.a(parcel));
        return true;
    }

    public ere(acwd acwd) {
        super("com.google.android.gms.auth.account.internal.IBooleanResultCallback");
        this.a = acwd;
    }
}
