package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.location.reporting.server.RemoteDevice;
import com.google.android.location.reporting.state.update.AccountConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ajli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajli extends bhv implements ajlk {
    public ajli(IBinder iBinder) {
        super(iBinder, "com.google.android.location.reporting.service.IPreferenceService");
    }

    public final AccountConfig a(Account account) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) account);
        Parcel a = a(2, aQ);
        AccountConfig accountConfig = (AccountConfig) bhx.a(a, AccountConfig.CREATOR);
        a.recycle();
        return accountConfig;
    }

    public final List b(Account account) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) account);
        Parcel a = a(5, aQ);
        ArrayList createTypedArrayList = a.createTypedArrayList(RemoteDevice.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final List a(Account account, int i, boolean z, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) account);
        aQ.writeInt(i);
        bhx.a(aQ, z);
        aQ.writeString(str);
        Parcel a = a(6, aQ);
        ArrayList createTypedArrayList = a.createTypedArrayList(RemoteDevice.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final void b(Account account, String str, boolean z, String str2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) account);
        aQ.writeString(str);
        bhx.a(aQ, z);
        aQ.writeString(str2);
        b(4, aQ);
    }

    public final void a(Account account, String str, boolean z, String str2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) account);
        aQ.writeString(str);
        bhx.a(aQ, z);
        aQ.writeString(str2);
        b(3, aQ);
    }
}
