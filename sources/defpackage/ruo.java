package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: ruo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ruo extends bhw implements rup {
    private Context a;

    public ruo() {
        super("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
    }

    public ruo(Context context) {
        super("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
        this.a = context;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) null);
                return true;
            case 2:
                Bundle bundle = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                return true;
            case 4:
                parcel2.writeNoException();
                return true;
            case 5:
                parcel2.writeNoException();
                return true;
            case 6:
                parcel2.writeNoException();
                return true;
            case 7:
                parcel2.writeNoException();
                bhx.b(parcel2, (Bundle) bhx.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                TextView textView = new TextView(this.a);
                textView.setGravity(17);
                textView.setText(hxy.b(this.a).getString(R.string.common_google_play_services_updating_title));
                mby a2 = mbz.a((Object) textView);
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) a2);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
                    if (queryLocalInterface instanceof ruf) {
                        ruf ruf = (ruf) queryLocalInterface;
                    } else {
                        new ruf(readStrongBinder);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
