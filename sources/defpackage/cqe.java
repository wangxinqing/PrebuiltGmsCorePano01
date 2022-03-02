package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.util.Map;

/* renamed from: cqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface cqe {
    long a(Uri uri, String str, String str2, boolean z, boolean z2, String str3, String str4, int i);

    ParcelFileDescriptor a(long j);

    Map a(long... jArr);

    boolean a(Context context);

    void b(long... jArr);
}
