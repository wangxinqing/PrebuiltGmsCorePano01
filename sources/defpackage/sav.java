package defpackage;

import android.accounts.Account;
import android.os.IInterface;
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

/* renamed from: sav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface sav extends IInterface {
    void a(ifu ifu);

    void a(ifu ifu, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, SyncStatus syncStatus);

    void a(ifu ifu, Account account, int i, int i2, SyncPolicy syncPolicy, LatestFootprintFilter latestFootprintFilter);

    void a(ifu ifu, Account account, int i, int i2, SyncPolicy syncPolicy, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter);

    void a(ifu ifu, Account account, int i, int i2, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, SyncStatus syncStatus);

    void a(ifu ifu, Account account, int i, int i2, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable);

    void a(ifu ifu, Account account, int i, int i2, byte[] bArr, ByteArraySafeParcelable byteArraySafeParcelable);

    void a(ifu ifu, Account account, List list, SyncPolicy syncPolicy);

    void a(ifu ifu, MdhBroadcastListenerKey mdhBroadcastListenerKey);

    void a(ifu ifu, MdhBroadcastListenerKey mdhBroadcastListenerKey, MdhBroadcastListenerParams mdhBroadcastListenerParams);

    void a(ifu ifu, String str);

    void a(ifu ifu, byte[] bArr);

    void a(sad sad);

    void a(sak sak, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter);

    void a(sak sak, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter);

    void a(san san, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter);

    void a(san san, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter);

    void a(sao sao, Account account, int i);

    void a(sap sap, Account account, int i, int i2, ByteArraySafeParcelable byteArraySafeParcelable);

    void a(sax sax);

    void b(ifu ifu);

    void b(sad sad);

    void c(ifu ifu);

    void d(ifu ifu);

    void e(ifu ifu);
}
