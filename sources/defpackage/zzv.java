package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import com.google.android.gms.safetynet.RecaptchaResultData;
import com.google.android.gms.safetynet.RemoveHarmfulAppData;
import com.google.android.gms.safetynet.SafeBrowsingData;

/* renamed from: zzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class zzv extends bhw implements zzw {
    public zzv() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    public void a(Status status) {
        throw new UnsupportedOperationException();
    }

    public final void b(Status status, boolean z) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, AttestationData attestationData) {
        throw new UnsupportedOperationException();
    }

    public void a(Status status, HarmfulAppsInfo harmfulAppsInfo) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, RecaptchaResultData recaptchaResultData) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, RemoveHarmfulAppData removeHarmfulAppData) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, SafeBrowsingData safeBrowsingData) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, boolean z) {
        throw new UnsupportedOperationException();
    }

    public final void a(String str) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((Status) bhx.a(parcel, Status.CREATOR), (AttestationData) bhx.a(parcel, AttestationData.CREATOR));
        } else if (i == 2) {
            a(parcel.readString());
        } else if (i == 3) {
            a((Status) bhx.a(parcel, Status.CREATOR), (SafeBrowsingData) bhx.a(parcel, SafeBrowsingData.CREATOR));
        } else if (i == 4) {
            a((Status) bhx.a(parcel, Status.CREATOR), bhx.a(parcel));
        } else if (i == 6) {
            a((Status) bhx.a(parcel, Status.CREATOR), (RecaptchaResultData) bhx.a(parcel, RecaptchaResultData.CREATOR));
        } else if (i == 8) {
            a((Status) bhx.a(parcel, Status.CREATOR), (HarmfulAppsInfo) bhx.a(parcel, HarmfulAppsInfo.CREATOR));
        } else if (i == 15) {
            a((Status) bhx.a(parcel, Status.CREATOR), (RemoveHarmfulAppData) bhx.a(parcel, RemoveHarmfulAppData.CREATOR));
        } else if (i == 10) {
            b((Status) bhx.a(parcel, Status.CREATOR), bhx.a(parcel));
        } else if (i != 11) {
            return false;
        } else {
            a((Status) bhx.a(parcel, Status.CREATOR));
        }
        return true;
    }
}
