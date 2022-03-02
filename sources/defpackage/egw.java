package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audit.LogAuditRecordsRequest;

/* renamed from: egw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class egw extends bhv implements egy {
    public egw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.audit.internal.IAuditService");
    }

    public final void a(LogAuditRecordsRequest logAuditRecordsRequest, ifu ifu) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) logAuditRecordsRequest);
        bhx.a(aQ, (IInterface) ifu);
        b(1, aQ);
    }
}
