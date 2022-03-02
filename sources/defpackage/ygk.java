package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.RegistrationInfo;

/* renamed from: ygk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ygk extends bhv implements ygm {
    public ygk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    public final void a(ygj ygj) {
        throw null;
    }

    public final void a(ygj ygj, String str) {
        throw null;
    }

    public final void a(ygj ygj, String str, long j) {
        throw null;
    }

    public final void a(ygj ygj, String str, String str2) {
        throw null;
    }

    public final void a(ygj ygj, String str, String str2, int i) {
        throw null;
    }

    public final void a(ygj ygj, String str, String str2, String str3, int i, int i2, String str4) {
        throw null;
    }

    public final void a(ygj ygj, byte[] bArr) {
        throw null;
    }

    public final void b(ygj ygj) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ygj);
        b(22, aQ);
    }

    public final void c(ygj ygj, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ygj);
        aQ.writeString(str);
        b(10, aQ);
    }

    public final void c(ygj ygj, String str, String str2, String str3) {
        throw null;
    }

    public final void b(ygj ygj, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ygj);
        aQ.writeString(str);
        b(5, aQ);
    }

    public final void a(ygj ygj, String str, int i, String[] strArr, byte[] bArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ygj);
        aQ.writeString(str);
        aQ.writeInt(i);
        aQ.writeStringArray(strArr);
        aQ.writeByteArray(bArr);
        b(1, aQ);
    }

    public final void b(ygj ygj, String str, String str2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ygj);
        aQ.writeString(str);
        aQ.writeString(str2);
        b(6, aQ);
    }

    public final void a(ygj ygj, String str, int i, String[] strArr, byte[] bArr, String str2, String str3) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ygj);
        aQ.writeString(str);
        aQ.writeInt(i);
        aQ.writeStringArray(strArr);
        aQ.writeByteArray(bArr);
        aQ.writeString(str2);
        aQ.writeString((String) null);
        b(13, aQ);
    }

    public final void b(ygj ygj, String str, String str2, String str3) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ygj);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        b(15, aQ);
    }

    public final void a(ygj ygj, String str, int i, String[] strArr, int[] iArr, byte[] bArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ygj);
        aQ.writeString(str);
        aQ.writeInt(i);
        aQ.writeStringArray(strArr);
        aQ.writeIntArray(iArr);
        aQ.writeByteArray((byte[]) null);
        b(2, aQ);
    }

    public final void b(ygj ygj, String str, String str2, String str3, String str4) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ygj);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        aQ.writeString(str4);
        b(23, aQ);
    }

    public final void a(ygj ygj, String str, String str2, String str3) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ygj);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        b(11, aQ);
    }

    public final void a(ygj ygj, String str, String str2, String str3, String str4) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ygj);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        aQ.writeString(str4);
        b(17, aQ);
    }

    public final void a(ygj ygj, String str, String str2, Flag[] flagArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ygj);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeTypedArray(flagArr, 0);
        b(18, aQ);
    }

    public final void a(ygj ygj, String str, byte[] bArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ygj);
        aQ.writeString(str);
        aQ.writeByteArray(bArr);
        b(20, aQ);
    }

    public final void a(ygj ygj, RegistrationInfo[] registrationInfoArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ygj);
        aQ.writeTypedArray(registrationInfoArr, 0);
        b(19, aQ);
    }
}
