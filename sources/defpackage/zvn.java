package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: zvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zvn extends bhv implements zvp {
    public zvn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.romanesco.internal.IRomanescoService");
    }

    public final void a(zvm zvm, String str) {
        throw null;
    }

    public final void a(zvm zvm, String str, String str2, String str3, String[] strArr) {
        throw null;
    }

    public final void b(zvm zvm, String str, String str2, String str3, String str4, String[] strArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) zvm);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        aQ.writeString(str4);
        aQ.writeStringArray(strArr);
        b(2801, aQ);
    }

    public final void a(zvm zvm, String str, long j) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) zvm);
        aQ.writeString(str);
        aQ.writeLong(j);
        b(2701, aQ);
    }

    public final void b(zvm zvm, String str, String str2, String[] strArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) zvm);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeStringArray(strArr);
        b(2802, aQ);
    }

    public final void a(zvm zvm, String str, String str2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) zvm);
        aQ.writeString(str);
        aQ.writeString(str2);
        b(1201, aQ);
    }

    public final void a(zvm zvm, String str, String str2, String str3, String str4, String[] strArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) zvm);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        aQ.writeString(str4);
        aQ.writeStringArray(strArr);
        b(1401, aQ);
    }

    public final void a(zvm zvm, String str, String str2, String[] strArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) zvm);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeStringArray(strArr);
        b(1101, aQ);
    }
}
