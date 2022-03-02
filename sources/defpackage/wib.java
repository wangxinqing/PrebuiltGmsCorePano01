package defpackage;

import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: wib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wib {
    public static SafeParcelable a(byte[] bArr, Parcelable.Creator creator) {
        try {
            return ivy.a(bArr, creator);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
