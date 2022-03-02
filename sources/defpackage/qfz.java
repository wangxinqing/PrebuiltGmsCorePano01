package defpackage;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.instantapps.internal.RoutingOptions;
import java.util.List;

/* renamed from: qfz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qfz extends bhv implements qgb {
    public qfz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.instantapps.internal.IInstantAppsService");
    }

    public final void a(ifu ifu) {
        throw null;
    }

    public final void a(ifu ifu, int i) {
        throw null;
    }

    public final void a(ifu ifu, int i, String str) {
        throw null;
    }

    public final void a(ifu ifu, PackageInfo packageInfo) {
        throw null;
    }

    public final void a(ifu ifu, PackageInfo packageInfo, ParcelFileDescriptor parcelFileDescriptor) {
        throw null;
    }

    public final void a(ifu ifu, String str, String str2, int i) {
        throw null;
    }

    public final void a(ifu ifu, String str, String str2, String str3) {
        throw null;
    }

    public final void a(ifu ifu, String str, boolean z) {
        throw null;
    }

    public final void a(ifu ifu, String str, byte[] bArr) {
        throw null;
    }

    public final void a(ifu ifu, boolean z) {
        throw null;
    }

    public final void a(qfy qfy, Intent intent) {
        throw null;
    }

    public final void a(qfy qfy, Intent intent, RoutingOptions routingOptions) {
        throw null;
    }

    public final void a(qfy qfy, String str) {
        throw null;
    }

    public final void a(qfy qfy, String str, String str2) {
        throw null;
    }

    public final void a(qfy qfy, String str, byte[] bArr) {
        throw null;
    }

    public final void a(qfy qfy, List list, boolean z) {
        throw null;
    }

    public final void b(ifu ifu) {
        throw null;
    }

    public final void b(ifu ifu, String str, String str2, String str3) {
        throw null;
    }

    public final void b(ifu ifu, boolean z) {
        throw null;
    }

    public final void b(qfy qfy) {
        throw null;
    }

    public final void b(qfy qfy, String str) {
        throw null;
    }

    public final void c(ifu ifu) {
        throw null;
    }

    public final void c(ifu ifu, String str) {
        throw null;
    }

    public final void c(qfy qfy) {
        throw null;
    }

    public final void c(qfy qfy, String str) {
        throw null;
    }

    public final void d(ifu ifu) {
        throw null;
    }

    public final void d(ifu ifu, String str) {
        throw null;
    }

    public final void d(qfy qfy) {
        throw null;
    }

    public final void e(ifu ifu) {
        throw null;
    }

    public final void e(qfy qfy) {
        throw null;
    }

    public final void b(ifu ifu, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        aQ.writeString(str);
        b(4, aQ);
    }

    public final void a(ifu ifu, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        aQ.writeString(str);
        b(22, aQ);
    }

    public final void a(qfy qfy) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) qfy);
        b(13, aQ);
    }
}
