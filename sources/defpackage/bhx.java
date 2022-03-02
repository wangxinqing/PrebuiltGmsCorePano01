package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: bhx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bhx {
    private static final ClassLoader a = bhx.class.getClassLoader();

    private bhx() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return (Parcelable) creator.createFromParcel(parcel);
        }
        return null;
    }

    public static ArrayList b(Parcel parcel) {
        return parcel.readArrayList(a);
    }

    public static HashMap c(Parcel parcel) {
        return parcel.readHashMap(a);
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
            return;
        }
        parcel.writeInt(0);
    }

    public static void a(Parcel parcel, IInterface iInterface) {
        if (iInterface != null) {
            parcel.writeStrongBinder(iInterface.asBinder());
        } else {
            parcel.writeStrongBinder((IBinder) null);
        }
    }

    public static void a(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
