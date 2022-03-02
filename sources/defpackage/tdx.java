package defpackage;

import android.os.Parcel;

/* renamed from: tdx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tdx extends bhw implements tdy {
    private final abql a;

    public tdx() {
        super("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
    }

    public final void a(byte[] bArr) {
        abql abql = this.a;
        abql.a.c.post(new abqj(abql, bArr));
    }

    public tdx(abql abql) {
        super("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
        this.a = abql;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a(parcel.createByteArray());
        } else if (i != 2) {
            return false;
        } else {
            int readInt = parcel.readInt();
            abql abql = this.a;
            abql.a.c.post(new abqk(abql, readInt));
        }
        return true;
    }
}
