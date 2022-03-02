package defpackage;

import android.os.Parcel;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: jxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jxe extends bhw implements jxf {
    public jxe() {
        super("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a((Status) bhx.a(parcel, Status.CREATOR));
                break;
            case 2:
                DataHolder dataHolder = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                b((Status) bhx.a(parcel, Status.CREATOR), (DataHolder) bhx.a(parcel, DataHolder.CREATOR));
                break;
            case 3:
                a((Status) bhx.a(parcel, Status.CREATOR), (WriteBatchImpl) bhx.a(parcel, WriteBatchImpl.CREATOR));
                break;
            case 5:
                a((Status) bhx.a(parcel, Status.CREATOR), (DataHolder) bhx.a(parcel, DataHolder.CREATOR));
                break;
            case 6:
                a((Status) bhx.a(parcel, Status.CREATOR), (Snapshot) bhx.a(parcel, Snapshot.CREATOR));
                break;
            case 7:
                a((Status) bhx.a(parcel, Status.CREATOR), (FenceStateMapImpl) bhx.a(parcel, FenceStateMapImpl.CREATOR));
                break;
            case 8:
                a((Status) bhx.a(parcel, Status.CREATOR), (FenceStateImpl) bhx.a(parcel, FenceStateImpl.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
