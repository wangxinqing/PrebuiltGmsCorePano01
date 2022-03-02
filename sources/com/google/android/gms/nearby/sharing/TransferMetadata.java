package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;
import org.chromium.net.UrlRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TransferMetadata extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR = new vtw();
    public final int a;
    public final float b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public TransferMetadata(int i, float f, String str, boolean z, boolean z2) {
        this.a = i;
        this.b = f;
        this.c = str;
        this.d = z;
        this.e = z2;
    }

    /* renamed from: a */
    public final TransferMetadata clone() {
        try {
            return (TransferMetadata) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TransferMetadata) {
            TransferMetadata transferMetadata = (TransferMetadata) obj;
            return ius.a(Integer.valueOf(this.a), Integer.valueOf(transferMetadata.a)) && ius.a(Float.valueOf(this.b), Float.valueOf(transferMetadata.b)) && ius.a(this.c, transferMetadata.c) && ius.a(Boolean.valueOf(this.d), Boolean.valueOf(transferMetadata.d)) && ius.a(Boolean.valueOf(this.e), Boolean.valueOf(transferMetadata.e));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Float.valueOf(this.b), this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        switch (this.a) {
            case 0:
                str = "UNKNOWN";
                break;
            case 1:
                str = "CONNECTING";
                break;
            case 2:
                str = "AWAITING_LOCAL_CONFIRMATION";
                break;
            case 3:
                str = "AWAITING_REMOTE_ACCEPTANCE";
                break;
            case 4:
                str = "AWAITING_REMOTE_ACCEPTANCE_FAILED";
                break;
            case 5:
                str = "IN_PROGRESS";
                break;
            case 6:
                str = "COMPLETE";
                break;
            case 7:
                str = "FAILED";
                break;
            case 8:
                str = "REJECTED";
                break;
            case 9:
                str = "CANCELLED";
                break;
            case 10:
                str = "TIMED_OUT";
                break;
            case 11:
                str = "MEDIA_UNAVAILABLE";
                break;
            case 12:
                str = "MEDIA_DOWNLOADING";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                str = "NOT_ENOUGH_SPACE";
                break;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                str = "UNSUPPORTED_ATTACHMENT_TYPE";
                break;
            case Service.START_CONTINUATION_MASK:
                str = "EXTERNAL_PROVIDER_LAUNCHED";
                break;
            default:
                str = "INVALID_STATUS";
                break;
        }
        objArr[0] = str;
        objArr[1] = Float.valueOf(this.b);
        objArr[2] = this.c;
        objArr[3] = Boolean.valueOf(this.d);
        objArr[4] = Boolean.valueOf(this.e);
        return String.format(locale, "TransferMetadata<status: %s, progress: %s, token: %s, isOriginal: %s, isFinalStatus: %s>", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.b(parcel, a2);
    }
}
