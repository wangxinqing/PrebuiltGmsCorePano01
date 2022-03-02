package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;

/* renamed from: yts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yts extends bhv implements ytu {
    public yts(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.plus.internal.IPlusService");
    }

    public final void a(String str, FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) favaDiagnosticsEntity);
        bhx.a(aQ, (Parcelable) favaDiagnosticsEntity2);
        b(46, aQ);
    }
}
