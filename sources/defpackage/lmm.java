package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.realtime.internal.BeginCompoundOperationRequest;
import com.google.android.gms.drive.realtime.internal.ParcelableIndexReference;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;

/* renamed from: lmm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface lmm extends IInterface {
    ParcelableEventList a(String str, String str2, String str3);

    void a(int i, lmo lmo);

    void a(DriveId driveId, lmo lmo);

    void a(BeginCompoundOperationRequest beginCompoundOperationRequest, lmo lmo);

    void a(ParcelableIndexReference parcelableIndexReference, lmn lmn);

    void a(String str, int i, int i2, lme lme);

    void a(String str, int i, int i2, lmh lmh);

    void a(String str, int i, DataHolder dataHolder, lme lme);

    void a(String str, int i, DataHolder dataHolder, lmh lmh);

    void a(String str, int i, String str2, int i2, lmh lmh);

    void a(String str, int i, String str2, lmh lmh);

    void a(String str, int i, lmn lmn);

    void a(String str, int i, lmo lmo);

    void a(String str, DataHolder dataHolder, lmh lmh);

    void a(String str, String str2, DataHolder dataHolder, lmh lmh);

    void a(String str, String str2, lmd lmd);

    void a(String str, String str2, lme lme);

    void a(String str, String str2, lmh lmh);

    void a(String str, lmd lmd);

    void a(String str, lmh lmh);

    void a(String str, lmi lmi);

    void a(String str, lmj lmj);

    void a(String str, lmn lmn);

    void a(String str, lmo lmo);

    void a(lma lma);

    void a(lmb lmb);

    void a(lmc lmc);

    void a(lmf lmf);

    void a(lmg lmg);

    void a(lmh lmh);

    void a(lmj lmj);

    void a(lmo lmo);

    void a(boolean z, lmo lmo);

    void b(String str, String str2, lmd lmd);

    void b(String str, lmd lmd);

    void b(String str, lmj lmj);

    void b(String str, lmn lmn);

    void b(lma lma);

    void b(lmh lmh);

    void b(lmj lmj);

    void b(lmo lmo);

    void c(String str, lmj lmj);

    void c(lma lma);

    void c(lmh lmh);

    void c(lmo lmo);

    void d(lma lma);

    void d(lmh lmh);

    void d(lmo lmo);

    void e(lma lma);

    void e(lmo lmo);
}
