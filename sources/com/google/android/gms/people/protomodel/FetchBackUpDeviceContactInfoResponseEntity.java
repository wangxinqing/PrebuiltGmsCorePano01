package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FetchBackUpDeviceContactInfoResponseEntity extends AbstractSafeParcelable implements FetchBackUpDeviceContactInfoResponse {
    public static final Parcelable.Creator CREATOR = new xox();
    private final List a;
    private List b;

    public FetchBackUpDeviceContactInfoResponseEntity(List list) {
        this.a = list;
    }

    public final List a() {
        List list;
        if (this.b == null && (list = this.a) != null) {
            this.b = new ArrayList(list.size());
            List list2 = this.a;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                this.b.add((BackedUpContactsPerDevice) list2.get(i));
            }
        }
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FetchBackUpDeviceContactInfoResponse)) {
            return false;
        }
        if (this != obj) {
            return ius.a(a(), ((FetchBackUpDeviceContactInfoResponse) obj).a());
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public FetchBackUpDeviceContactInfoResponseEntity(List list, byte[] bArr) {
        this.b = list;
        if (list != null) {
            this.a = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.a.add((BackedUpContactsPerDeviceEntity) ((BackedUpContactsPerDevice) list.get(i)));
            }
            return;
        }
        this.a = null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 2, a(), false);
        ivx.b(parcel, a2);
    }
}
