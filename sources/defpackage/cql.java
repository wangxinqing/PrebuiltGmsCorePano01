package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* renamed from: cql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class cql extends bhw implements cqm {
    public cql() {
        super("com.google.android.finsky.zapp.protocol.IDynamicModuleDownloader");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Bundle a = a((List) parcel.createTypedArrayList(Bundle.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a);
                return true;
            case 2:
                Bundle bundle = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                Bundle c = c();
                parcel2.writeNoException();
                bhx.b(parcel2, c);
                return true;
            case 3:
                Bundle a2 = a((Bundle) bhx.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a2);
                return true;
            case 4:
                Bundle c2 = c((Bundle) bhx.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, c2);
                return true;
            case 5:
                Bundle a3 = a(parcel.readLong());
                parcel2.writeNoException();
                bhx.b(parcel2, a3);
                return true;
            case 6:
                Bundle bundle2 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                Bundle d = d();
                parcel2.writeNoException();
                bhx.b(parcel2, d);
                return true;
            case 7:
                Bundle b = b((Bundle) bhx.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, b);
                return true;
            case 8:
                Bundle a4 = a(parcel.createTypedArrayList(Bundle.CREATOR), bhx.a(parcel));
                parcel2.writeNoException();
                bhx.b(parcel2, a4);
                return true;
            default:
                return false;
        }
    }
}
