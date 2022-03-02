package defpackage;

import android.os.Binder;
import android.os.Parcel;

/* renamed from: mvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mvi extends Binder {
    final /* synthetic */ byte[] a;

    public mvi(byte[] bArr) {
        this.a = bArr;
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        parcel2.writeByteArray(this.a);
        return true;
    }
}
