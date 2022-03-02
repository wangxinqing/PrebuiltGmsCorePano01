package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.view.Surface;

/* renamed from: guv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class guv extends bhw implements guw {
    public guv() {
        super("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        guu guu;
        guu guu2;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
                    if (queryLocalInterface instanceof guu) {
                        guu = (guu) queryLocalInterface;
                        a(guu, bhx.a(parcel), parcel.readString(), (Surface) bhx.a(parcel, Surface.CREATOR), parcel.readInt());
                        return true;
                    }
                    guu2 = new guu(readStrongBinder);
                } else {
                    guu2 = null;
                }
                guu = guu2;
                a(guu, bhx.a(parcel), parcel.readString(), (Surface) bhx.a(parcel, Surface.CREATOR), parcel.readInt());
                return true;
            case 2:
                a();
                return true;
            case 3:
                b();
                return true;
            case 4:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
                    if (queryLocalInterface2 instanceof guu) {
                        guu guu3 = (guu) queryLocalInterface2;
                    } else {
                        new guu(readStrongBinder2);
                    }
                }
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringSessionCallbacks");
                    if (queryLocalInterface3 instanceof gux) {
                        gux gux = (gux) queryLocalInterface3;
                    } else {
                        new gux(readStrongBinder3);
                    }
                }
                parcel.readString();
                PendingIntent pendingIntent = (PendingIntent) bhx.a(parcel, PendingIntent.CREATOR);
                f();
                return true;
            case 5:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
                    if (queryLocalInterface4 instanceof guu) {
                        guu guu4 = (guu) queryLocalInterface4;
                    } else {
                        new guu(readStrongBinder4);
                    }
                }
                d();
                return true;
            case 6:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
                    if (queryLocalInterface5 instanceof guu) {
                        guu guu5 = (guu) queryLocalInterface5;
                    } else {
                        new guu(readStrongBinder5);
                    }
                }
                e();
                return true;
            case 7:
                a(bhx.a(parcel), parcel.readString());
                return true;
            case 8:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
                    if (queryLocalInterface6 instanceof guu) {
                        guu guu6 = (guu) queryLocalInterface6;
                    } else {
                        new guu(readStrongBinder6);
                    }
                }
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bhx.a(parcel, ParcelFileDescriptor.CREATOR);
                c();
                return true;
            default:
                return false;
        }
    }
}
