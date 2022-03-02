package defpackage;

import android.graphics.Bitmap;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.internal.CreatorImpl;

/* renamed from: rvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rvt extends bhw implements rvu {
    public rvu a;
    public final /* synthetic */ CreatorImpl b;

    public rvt() {
        super("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    public final mby a(float f) {
        return this.b.a((rrx) new rrh(this, f));
    }

    public final mby b() {
        return this.b.a((rrx) new rrg(this));
    }

    public final mby c(String str) {
        return this.b.a((rrx) new rrj(this, str));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rvt(CreatorImpl creatorImpl) {
        super("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        this.b = creatorImpl;
        this.a = null;
    }

    public final mby a(int i) {
        return this.b.a((rrx) new rrd(this, i));
    }

    public final mby b(String str) {
        return this.b.a((rrx) new rrf(this, str));
    }

    public final mby a(Bitmap bitmap) {
        return this.b.a((rrx) new rri(this, bitmap));
    }

    public final mby a(String str) {
        return this.b.a((rrx) new rre(this, str));
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mby a2 = a(parcel.readInt());
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) a2);
                return true;
            case 2:
                mby a3 = a(parcel.readString());
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) a3);
                return true;
            case 3:
                mby b2 = b(parcel.readString());
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) b2);
                return true;
            case 4:
                mby b3 = b();
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) b3);
                return true;
            case 5:
                mby a4 = a(parcel.readFloat());
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) a4);
                return true;
            case 6:
                mby a5 = a((Bitmap) bhx.a(parcel, Bitmap.CREATOR));
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) a5);
                return true;
            case 7:
                mby c = c(parcel.readString());
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) c);
                return true;
            default:
                return false;
        }
    }
}
