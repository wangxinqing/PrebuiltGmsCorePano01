package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.audit.LogAuditRecordsRequest;

/* renamed from: egx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class egx extends bhw implements egy {
    public egx() {
        super("com.google.android.gms.audit.internal.IAuditService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        ifu ifu;
        if (i != 1) {
            return false;
        }
        LogAuditRecordsRequest logAuditRecordsRequest = (LogAuditRecordsRequest) bhx.a(parcel, LogAuditRecordsRequest.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            ifu = queryLocalInterface instanceof ifu ? (ifu) queryLocalInterface : new ifs(readStrongBinder);
        } else {
            ifu = null;
        }
        a(logAuditRecordsRequest, ifu);
        parcel2.writeNoException();
        return true;
    }
}
