package defpackage;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.instantapps.internal.RoutingOptions;
import java.util.List;

/* renamed from: qgb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface qgb extends IInterface {
    void a(ifu ifu);

    void a(ifu ifu, int i);

    void a(ifu ifu, int i, String str);

    void a(ifu ifu, PackageInfo packageInfo);

    void a(ifu ifu, PackageInfo packageInfo, ParcelFileDescriptor parcelFileDescriptor);

    void a(ifu ifu, String str);

    void a(ifu ifu, String str, String str2, int i);

    void a(ifu ifu, String str, String str2, String str3);

    void a(ifu ifu, String str, boolean z);

    void a(ifu ifu, String str, byte[] bArr);

    void a(ifu ifu, boolean z);

    void a(qfy qfy);

    void a(qfy qfy, Intent intent);

    void a(qfy qfy, Intent intent, RoutingOptions routingOptions);

    void a(qfy qfy, String str);

    void a(qfy qfy, String str, String str2);

    void a(qfy qfy, String str, byte[] bArr);

    void a(qfy qfy, List list, boolean z);

    void b(ifu ifu);

    void b(ifu ifu, String str);

    void b(ifu ifu, String str, String str2, String str3);

    void b(ifu ifu, boolean z);

    void b(qfy qfy);

    void b(qfy qfy, String str);

    void c(ifu ifu);

    void c(ifu ifu, String str);

    void c(qfy qfy);

    void c(qfy qfy, String str);

    void d(ifu ifu);

    void d(ifu ifu, String str);

    void d(qfy qfy);

    @Deprecated
    void e(ifu ifu);

    void e(qfy qfy);
}
