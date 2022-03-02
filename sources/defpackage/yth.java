package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.internal.model.people.PersonEntity;

/* renamed from: yth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface yth extends IInterface {
    void a(int i, Bundle bundle);

    void a(int i, Bundle bundle, Bundle bundle2);

    void a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor);

    void a(int i, Bundle bundle, SafeParcelResponse safeParcelResponse);

    void a(int i, PersonEntity personEntity);

    void a(Status status);

    void a(DataHolder dataHolder, String str);

    void a(DataHolder dataHolder, String str, String str2);
}
