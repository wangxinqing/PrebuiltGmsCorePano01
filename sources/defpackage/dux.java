package defpackage;

import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.common.api.Status;

/* renamed from: dux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface dux extends IInterface {
    void a(GetRecentContextCall$Response getRecentContextCall$Response);

    void a(Status status);

    void a(Status status, ParcelFileDescriptor parcelFileDescriptor);
}
