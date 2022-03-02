package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.internal.CreatorImpl;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: rsa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rsa extends bhw implements rsb {
    public rsb a;
    final /* synthetic */ CreatorImpl b;

    public rsa() {
        super("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    public final mby a(float f) {
        return this.b.a((rrx) new rrq(this, f));
    }

    public final mby b() {
        return this.b.a((rrx) new rrn(this));
    }

    public final mby c() {
        return this.b.a((rrx) new rro(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rsa(CreatorImpl creatorImpl) {
        super("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        this.b = creatorImpl;
        this.a = null;
    }

    public final mby a(float f, float f2) {
        return this.b.a((rrx) new rrp(this, f, f2));
    }

    public final mby b(float f) {
        return this.b.a((rrx) new rrr(this, f));
    }

    public final mby a(float f, int i, int i2) {
        return this.b.a((rrx) new rrs(this, f, i, i2));
    }

    public final mby a(CameraPosition cameraPosition) {
        return this.b.a((rrx) new rrt(this, cameraPosition));
    }

    public final mby a(LatLng latLng) {
        return this.b.a((rrx) new rru(this, latLng));
    }

    public final mby a(LatLng latLng, float f) {
        return this.b.a((rrx) new rrv(this, latLng, f));
    }

    public final mby a(LatLngBounds latLngBounds, int i) {
        return this.b.a((rrx) new rrl(this, latLngBounds, i));
    }

    public final mby a(LatLngBounds latLngBounds, int i, int i2, int i3) {
        return this.b.a((rrx) new rrm(this, latLngBounds, i, i2, i3));
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mby b2 = b();
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) b2);
                return true;
            case 2:
                mby c = c();
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) c);
                return true;
            case 3:
                mby a2 = a(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) a2);
                return true;
            case 4:
                mby a3 = a(parcel.readFloat());
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) a3);
                return true;
            case 5:
                mby b3 = b(parcel.readFloat());
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) b3);
                return true;
            case 6:
                mby a4 = a(parcel.readFloat(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) a4);
                return true;
            case 7:
                mby a5 = a((CameraPosition) bhx.a(parcel, CameraPosition.CREATOR));
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) a5);
                return true;
            case 8:
                mby a6 = a((LatLng) bhx.a(parcel, LatLng.CREATOR));
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) a6);
                return true;
            case 9:
                mby a7 = a((LatLng) bhx.a(parcel, LatLng.CREATOR), parcel.readFloat());
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) a7);
                return true;
            case 10:
                mby a8 = a((LatLngBounds) bhx.a(parcel, LatLngBounds.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) a8);
                return true;
            case 11:
                mby a9 = a((LatLngBounds) bhx.a(parcel, LatLngBounds.CREATOR), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) a9);
                return true;
            default:
                return false;
        }
    }
}
