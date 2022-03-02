package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.widget.TextView;
import com.google.android.gms.R;
import org.chromium.net.UrlRequest;

/* renamed from: rsr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rsr extends bhw implements rss {
    private Context a;

    public rsr() {
        super("com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    public final void a(Bundle bundle) {
    }

    public final void a(rts rts) {
    }

    public final void b() {
    }

    public final void b(Bundle bundle) {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final mby f() {
        TextView textView = new TextView(this.a);
        textView.setGravity(17);
        textView.setText(hxy.b(this.a).getString(R.string.common_google_play_services_updating_title));
        return mbz.a((Object) textView);
    }

    public rsr(Context context) {
        super("com.google.android.gms.maps.internal.IMapViewDelegate");
        this.a = context;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                rsh rsh = new rsh();
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) rsh);
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
                mby f = f();
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) f);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                    if (queryLocalInterface instanceof rts) {
                        rts rts = (rts) queryLocalInterface;
                    } else {
                        new rtq(readStrongBinder);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 10:
                Bundle bundle2 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                return true;
            case 12:
                parcel2.writeNoException();
                return true;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
