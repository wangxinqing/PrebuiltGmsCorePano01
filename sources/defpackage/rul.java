package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import org.chromium.net.UrlRequest;

/* renamed from: rul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rul extends bhw implements rum {
    private Context a;

    public rul() {
        super("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
    }

    public rul(Context context) {
        super("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
        this.a = context;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) null);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface instanceof mby) {
                        mby mby = (mby) queryLocalInterface;
                    } else {
                        new mbw(readStrongBinder);
                    }
                }
                StreetViewPanoramaOptions streetViewPanoramaOptions = (StreetViewPanoramaOptions) bhx.a(parcel, StreetViewPanoramaOptions.CREATOR);
                Bundle bundle = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                parcel2.writeNoException();
                return true;
            case 3:
                Bundle bundle2 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface2 instanceof mby) {
                        mby mby2 = (mby) queryLocalInterface2;
                    } else {
                        new mbw(readStrongBinder2);
                    }
                }
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface3 instanceof mby) {
                        mby mby3 = (mby) queryLocalInterface3;
                    } else {
                        new mbw(readStrongBinder3);
                    }
                }
                Bundle bundle3 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                TextView textView = new TextView(this.a);
                textView.setGravity(17);
                textView.setText(hxy.b(this.a).getString(R.string.common_google_play_services_updating_title));
                mby a2 = mbz.a((Object) textView);
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) a2);
                return true;
            case 5:
                parcel2.writeNoException();
                return true;
            case 6:
                parcel2.writeNoException();
                return true;
            case 7:
                parcel2.writeNoException();
                return true;
            case 8:
                parcel2.writeNoException();
                return true;
            case 9:
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                bhx.b(parcel2, (Bundle) bhx.a(parcel, Bundle.CREATOR));
                return true;
            case 11:
                parcel2.writeNoException();
                bhx.a(parcel2, false);
                return true;
            case 12:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
                    if (queryLocalInterface4 instanceof ruf) {
                        ruf ruf = (ruf) queryLocalInterface4;
                    } else {
                        new ruf(readStrongBinder4);
                    }
                }
                parcel2.writeNoException();
                return true;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                parcel2.writeNoException();
                return true;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
