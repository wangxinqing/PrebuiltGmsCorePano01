package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;
import java.util.List;

/* renamed from: wzw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wzw extends bhv implements wzy {
    public wzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.internal.IPeopleService");
    }

    public final Bundle a(String str, String str2) {
        throw null;
    }

    public final Bundle a(String str, String str2, long j) {
        throw null;
    }

    public final Bundle a(String str, String str2, long j, boolean z) {
        throw null;
    }

    public final itp a(wzv wzv, String str, int i) {
        throw null;
    }

    public final itp a(wzv wzv, String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, boolean z2) {
        throw null;
    }

    public final void a(wzv wzv, Account account, String str) {
        throw null;
    }

    public final void a(wzv wzv, Uri uri) {
        throw null;
    }

    public final void a(wzv wzv, Uri uri, String str) {
        throw null;
    }

    public final void a(wzv wzv, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw null;
    }

    public final void a(wzv wzv, String str, int i, int i2) {
        throw null;
    }

    public final void a(wzv wzv, String str, String str2) {
        throw null;
    }

    public final void a(wzv wzv, String str, String str2, int i) {
        throw null;
    }

    public final void a(wzv wzv, String str, String str2, int i, int i2) {
        throw null;
    }

    public final void a(wzv wzv, String str, String str2, Uri uri) {
        throw null;
    }

    public final void a(wzv wzv, String str, String str2, String str3, int i, String str4) {
        throw null;
    }

    public final void a(wzv wzv, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4) {
        throw null;
    }

    public final void a(wzv wzv, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2) {
        throw null;
    }

    public final void a(wzv wzv, String str, String str2, String str3, List list, int i, boolean z, long j) {
        throw null;
    }

    public final void a(wzv wzv, String str, String str2, String str3, List list, int i, boolean z, long j, String str4, int i2) {
        throw null;
    }

    public final void a(wzv wzv, String str, String str2, String str3, List list, int i, boolean z, long j, String str4, int i2, int i3) {
        throw null;
    }

    public final void a(wzv wzv, String str, String str2, String str3, boolean z, int i) {
        throw null;
    }

    public final void a(wzv wzv, String str, String str2, String str3, boolean z, int i, int i2) {
        throw null;
    }

    public final void a(wzv wzv, String str, String str2, String[] strArr) {
        throw null;
    }

    public final void a(wzv wzv, boolean z, boolean z2, String str, String str2) {
        throw null;
    }

    public final Bundle b(String str, String str2) {
        throw null;
    }

    public final void b() {
        throw null;
    }

    public final void b(wzv wzv, Account account, String str) {
        throw null;
    }

    public final void b(wzv wzv, String str) {
        throw null;
    }

    public final void b(wzv wzv, String str, String str2, int i) {
        throw null;
    }

    public final itp c(wzv wzv, String str, String str2, int i) {
        throw null;
    }

    public final void c() {
        throw null;
    }

    public final void d(wzv wzv, Account account, String str) {
        throw null;
    }

    public final void d(wzv wzv, String str, String str2) {
        throw null;
    }

    public final itp e(wzv wzv, String str, String str2) {
        throw null;
    }

    public final itp b(wzv wzv, String str, int i, int i2) {
        itp itp;
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wzv);
        aQ.writeString(str);
        aQ.writeInt(i);
        aQ.writeInt(i2);
        Parcel a = a(502, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            itp = queryLocalInterface instanceof itp ? (itp) queryLocalInterface : new itn(readStrongBinder);
        } else {
            itp = null;
        }
        a.recycle();
        return itp;
    }

    public final void c(wzv wzv, Account account, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wzv);
        bhx.a(aQ, (Parcelable) account);
        aQ.writeString(str);
        b(2101, aQ);
    }

    public final Bundle a(String str, String str2, long j, boolean z, boolean z2) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeLong(j);
        bhx.a(aQ, z);
        bhx.a(aQ, false);
        Parcel a = a(205, aQ);
        Bundle bundle = (Bundle) bhx.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final void c(wzv wzv, String str, String str2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wzv);
        aQ.writeString(str);
        aQ.writeString(str2);
        b(102, aQ);
    }

    public final Bundle a(wzv wzv, boolean z, String str, String str2, int i) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wzv);
        bhx.a(aQ, z);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeInt(i);
        Parcel a = a(11, aQ);
        Bundle bundle = (Bundle) bhx.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final itp a(wzv wzv, AccountToken accountToken, ParcelableListOptions parcelableListOptions) {
        itp itp;
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wzv);
        bhx.a(aQ, (Parcelable) accountToken);
        bhx.a(aQ, (Parcelable) parcelableListOptions);
        Parcel a = a(601, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            itp = queryLocalInterface instanceof itp ? (itp) queryLocalInterface : new itn(readStrongBinder);
        } else {
            itp = null;
        }
        a.recycle();
        return itp;
    }

    public final itp b(wzv wzv, String str, String str2, int i, int i2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wzv);
        aQ.writeString(str);
        itp itp = null;
        aQ.writeString((String) null);
        aQ.writeInt(i);
        aQ.writeInt(i2);
        Parcel a = a(505, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            if (queryLocalInterface instanceof itp) {
                itp = (itp) queryLocalInterface;
            } else {
                itp = new itn(readStrongBinder);
            }
        }
        a.recycle();
        return itp;
    }

    public final itp a(wzv wzv, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        itp itp;
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wzv);
        bhx.a(aQ, (Parcelable) avatarReference);
        bhx.a(aQ, (Parcelable) parcelableLoadImageOptions);
        Parcel a = a(508, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            itp = queryLocalInterface instanceof itp ? (itp) queryLocalInterface : new itn(readStrongBinder);
        } else {
            itp = null;
        }
        a.recycle();
        return itp;
    }

    public final void b(wzv wzv, String str, String str2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wzv);
        aQ.writeString(str);
        aQ.writeString(str2);
        b(101, aQ);
    }

    public final itp a(wzv wzv, String str) {
        itp itp;
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wzv);
        aQ.writeString(str);
        Parcel a = a(504, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            itp = queryLocalInterface instanceof itp ? (itp) queryLocalInterface : new itn(readStrongBinder);
        } else {
            itp = null;
        }
        a.recycle();
        return itp;
    }

    public final void b(wzv wzv, String str, String str2, String str3, int i, String str4) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wzv);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        aQ.writeInt(i);
        aQ.writeString(str4);
        b(22, aQ);
    }

    public final void a(wzv wzv, Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wzv);
        bhx.a(aQ, (Parcelable) bundle);
        b(304, aQ);
    }

    public final void a(wzv wzv, AccountToken accountToken, List list, ParcelableGetOptions parcelableGetOptions) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wzv);
        bhx.a(aQ, (Parcelable) accountToken);
        aQ.writeStringList(list);
        bhx.a(aQ, (Parcelable) parcelableGetOptions);
        b(501, aQ);
    }

    public final void a(wzv wzv, String str, String str2, Uri uri, boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wzv);
        aQ.writeString(str);
        aQ.writeString(str2);
        bhx.a(aQ, (Parcelable) uri);
        bhx.a(aQ, z);
        b(18, aQ);
    }

    public final void a(wzv wzv, String str, String str2, String str3) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wzv);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        aQ.writeString((String) null);
        bhx.a(aQ, true);
        b(701, aQ);
    }

    public final void a(wzv wzv, String str, String str2, String str3, int i, String str4, boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wzv);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString((String) null);
        aQ.writeInt(i);
        aQ.writeString(str4);
        bhx.a(aQ, z);
        b(19, aQ);
    }

    public final void a(wzv wzv, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, int i4, int i5) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wzv);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString((String) null);
        aQ.writeInt(7);
        bhx.a(aQ, z);
        aQ.writeInt(i2);
        aQ.writeInt(0);
        aQ.writeString((String) null);
        bhx.a(aQ, z2);
        aQ.writeInt(i4);
        aQ.writeInt(3);
        b(402, aQ);
    }

    public final void a(wzv wzv, String str, String str2, String str3, List list) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wzv);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        aQ.writeStringList(list);
        b(28, aQ);
    }

    public final void a(wzv wzv, String str, String str2, String str3, List list, int i, boolean z, long j, String str4, int i2, int i3, int i4) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wzv);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString((String) null);
        aQ.writeStringList(list);
        aQ.writeInt(2097151);
        bhx.a(aQ, false);
        aQ.writeLong(0);
        aQ.writeString(str4);
        aQ.writeInt(7);
        aQ.writeInt(0);
        aQ.writeInt(0);
        b(404, aQ);
    }

    public final void a(wzv wzv, String str, String str2, String str3, List list, List list2, FavaDiagnosticsEntity favaDiagnosticsEntity) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wzv);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        aQ.writeStringList(list);
        aQ.writeStringList(list2);
        bhx.a(aQ, (Parcelable) favaDiagnosticsEntity);
        b(23, aQ);
    }

    public final void a(wzv wzv, boolean z, boolean z2, String str, String str2, int i) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wzv);
        bhx.a(aQ, z);
        bhx.a(aQ, z2);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeInt(i);
        b(305, aQ);
    }
}
