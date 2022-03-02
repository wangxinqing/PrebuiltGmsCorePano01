package com.google.android.contextmanager.interest;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InterestRecordStub extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new caw();
    public final atke a;

    public InterestRecordStub(atke atke) {
        iva.a((Object) atke);
        this.a = atke;
    }

    public final int a() {
        atjv a2 = atjv.a(this.a.c);
        if (a2 == null) {
            a2 = atjv.UNKNOWN_CONTEXT_NAME;
        }
        return a2.bA;
    }

    public InterestRecordStub(byte[] bArr) {
        atke atke;
        try {
            atke = (atke) aucj.a((aucj) atke.i, bArr, aubs.c());
        } catch (auda e) {
            Log.e("InterestRecordStub", "Could not deserialize interest bytes.", e);
            atke = null;
        }
        this.a = atke;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a.k(), false);
        ivx.b(parcel, a2);
    }
}
