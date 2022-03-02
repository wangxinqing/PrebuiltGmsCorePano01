package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.MdhBroadcastListenerKey;
import com.google.android.gms.mdh.MdhBroadcastListenerParams;
import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.TimeSeriesFootprintsReadFilter;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import com.google.android.gms.mdh.internal.ByteArraySafeParcelable;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;
import java.util.List;

/* renamed from: sat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sat extends bhv implements sav {
    public sat(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdh.internal.IMobileDataHubService");
    }

    public final void a(ifu ifu) {
        throw null;
    }

    public final void a(ifu ifu, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, SyncStatus syncStatus) {
        throw null;
    }

    public final void a(ifu ifu, Account account, int i, int i2, SyncPolicy syncPolicy, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter) {
        throw null;
    }

    public final void a(ifu ifu, Account account, int i, int i2, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, SyncStatus syncStatus) {
        throw null;
    }

    public final void a(ifu ifu, Account account, int i, int i2, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        throw null;
    }

    public final void a(ifu ifu, Account account, List list, SyncPolicy syncPolicy) {
        throw null;
    }

    public final void a(ifu ifu, String str) {
        throw null;
    }

    public final void a(ifu ifu, byte[] bArr) {
        throw null;
    }

    public final void a(sad sad) {
        throw null;
    }

    public final void a(sak sak, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter) {
        throw null;
    }

    public final void a(san san, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter) {
        throw null;
    }

    public final void a(sao sao, Account account, int i) {
        throw null;
    }

    public final void a(sap sap, Account account, int i, int i2, ByteArraySafeParcelable byteArraySafeParcelable) {
        throw null;
    }

    public final void a(sax sax) {
        throw null;
    }

    public final void b(ifu ifu) {
        throw null;
    }

    public final void b(sad sad) {
        throw null;
    }

    public final void c(ifu ifu) {
        throw null;
    }

    public final void d(ifu ifu) {
        throw null;
    }

    public final void e(ifu ifu) {
        throw null;
    }

    public final void a(ifu ifu, Account account, int i, int i2, SyncPolicy syncPolicy, LatestFootprintFilter latestFootprintFilter) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) account);
        aQ.writeInt(i);
        aQ.writeInt(i2);
        bhx.a(aQ, (Parcelable) syncPolicy);
        bhx.a(aQ, (Parcelable) latestFootprintFilter);
        b(11, aQ);
    }

    public final void a(ifu ifu, Account account, int i, int i2, byte[] bArr, ByteArraySafeParcelable byteArraySafeParcelable) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) account);
        aQ.writeInt(i);
        aQ.writeInt(i2);
        aQ.writeByteArray(bArr);
        bhx.a(aQ, (Parcelable) byteArraySafeParcelable);
        b(10, aQ);
    }

    public final void a(ifu ifu, MdhBroadcastListenerKey mdhBroadcastListenerKey) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) mdhBroadcastListenerKey);
        b(23, aQ);
    }

    public final void a(ifu ifu, MdhBroadcastListenerKey mdhBroadcastListenerKey, MdhBroadcastListenerParams mdhBroadcastListenerParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) mdhBroadcastListenerKey);
        bhx.a(aQ, (Parcelable) mdhBroadcastListenerParams);
        b(22, aQ);
    }

    public final void a(sak sak, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) sak);
        bhx.a(aQ, (Parcelable) account);
        aQ.writeInt(i);
        aQ.writeInt(i2);
        bhx.a(aQ, (Parcelable) latestFootprintFilter);
        b(9, aQ);
    }

    public final void a(san san, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) san);
        bhx.a(aQ, (Parcelable) account);
        aQ.writeInt(i);
        aQ.writeInt(i2);
        bhx.a(aQ, (Parcelable) latestFootprintFilter);
        b(19, aQ);
    }
}
