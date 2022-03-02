package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import java.util.List;

/* renamed from: abxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class abxd extends bhw implements abxe {
    protected final idg a;

    public void a(Status status) {
        throw new UnsupportedOperationException();
    }

    public void b(Status status) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status) {
        throw new UnsupportedOperationException();
    }

    public void d(Status status) {
        throw new UnsupportedOperationException();
    }

    public void e(Status status) {
        throw new UnsupportedOperationException();
    }

    public void f(Status status) {
        throw new UnsupportedOperationException();
    }

    public void g(Status status) {
        throw new UnsupportedOperationException();
    }

    public final void h(Status status) {
        throw new UnsupportedOperationException();
    }

    public final void i(Status status) {
        throw new UnsupportedOperationException();
    }

    public final void j(Status status) {
        throw new UnsupportedOperationException();
    }

    public void k(Status status) {
        throw new UnsupportedOperationException();
    }

    protected abxd(idg idg) {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
        this.a = idg;
    }

    public final void a(Status status, List list) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 2:
                b((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 3:
                c((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 4:
                d((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 5:
                e((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 6:
                f((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 7:
                g((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 8:
                h((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 9:
                a((Status) bhx.a(parcel, Status.CREATOR), parcel.createTypedArrayList(BootstrapAccount.CREATOR));
                return true;
            case 10:
                i((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 11:
                j((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 12:
                k((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
