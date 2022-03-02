package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.download.DownloadDetails;

/* renamed from: ipy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ipy extends bhw implements ipz {
    public ipy() {
        super("com.google.android.gms.common.download.internal.IDownloadService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        iqc iqc = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.download.internal.IDownloadServiceCallbacks");
                if (queryLocalInterface instanceof iqc) {
                    iqc = (iqc) queryLocalInterface;
                } else {
                    iqc = new iqa(readStrongBinder);
                }
            }
            a(iqc, parcel.readString());
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.download.internal.IDownloadServiceCallbacks");
                iqc = queryLocalInterface2 instanceof iqc ? (iqc) queryLocalInterface2 : new iqa(readStrongBinder2);
            }
            b(iqc, parcel.readString());
        } else if (i == 3) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.download.internal.IDownloadServiceCallbacks");
                if (queryLocalInterface3 instanceof iqc) {
                    iqc iqc2 = (iqc) queryLocalInterface3;
                } else {
                    new iqa(readStrongBinder3);
                }
            }
            parcel.readString();
        } else if (i == 4) {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.common.download.internal.IDownloadServiceCallbacks");
                if (queryLocalInterface4 instanceof iqc) {
                    iqc = (iqc) queryLocalInterface4;
                } else {
                    iqc = new iqa(readStrongBinder4);
                }
            }
            a(iqc, (DownloadDetails) bhx.a(parcel, DownloadDetails.CREATOR));
        } else if (i != 5) {
            return false;
        } else {
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.common.download.internal.IDownloadServiceCallbacks");
                if (queryLocalInterface5 instanceof iqc) {
                    iqc = (iqc) queryLocalInterface5;
                } else {
                    iqc = new iqa(readStrongBinder5);
                }
            }
            c(iqc, parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
