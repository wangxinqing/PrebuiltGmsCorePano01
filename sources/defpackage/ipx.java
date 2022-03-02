package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.download.DownloadDetails;

/* renamed from: ipx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ipx extends bhv implements ipz {
    public ipx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.download.internal.IDownloadService");
    }

    public final void a(iqc iqc, DownloadDetails downloadDetails) {
        throw null;
    }

    public final void b(iqc iqc, String str) {
        throw null;
    }

    public final void c(iqc iqc, String str) {
        throw null;
    }

    public final void a(iqc iqc, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) iqc);
        aQ.writeString(str);
        b(1, aQ);
    }
}
