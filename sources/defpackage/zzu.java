package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import com.google.android.gms.safetynet.RecaptchaResultData;
import com.google.android.gms.safetynet.RemoveHarmfulAppData;
import com.google.android.gms.safetynet.SafeBrowsingData;

/* renamed from: zzu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zzu extends bhv implements zzw {
    public zzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(11, aQ);
    }

    public final void b(Status status, boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, z);
        c(10, aQ);
    }

    public final void a(Status status, AttestationData attestationData) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) attestationData);
        c(1, aQ);
    }

    public final void a(Status status, HarmfulAppsInfo harmfulAppsInfo) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) harmfulAppsInfo);
        c(8, aQ);
    }

    public final void a(Status status, RecaptchaResultData recaptchaResultData) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) recaptchaResultData);
        c(6, aQ);
    }

    public final void a(Status status, RemoveHarmfulAppData removeHarmfulAppData) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) removeHarmfulAppData);
        c(15, aQ);
    }

    public final void a(Status status, SafeBrowsingData safeBrowsingData) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) safeBrowsingData);
        c(3, aQ);
    }

    public final void a(Status status, boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, z);
        c(4, aQ);
    }

    public final void a(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        c(2, aQ);
    }
}
