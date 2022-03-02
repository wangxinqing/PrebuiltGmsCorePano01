package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import com.google.android.gms.safetynet.RecaptchaResultData;
import com.google.android.gms.safetynet.RemoveHarmfulAppData;
import com.google.android.gms.safetynet.SafeBrowsingData;

/* renamed from: zzw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface zzw extends IInterface {
    void a(Status status);

    void a(Status status, AttestationData attestationData);

    void a(Status status, HarmfulAppsInfo harmfulAppsInfo);

    void a(Status status, RecaptchaResultData recaptchaResultData);

    void a(Status status, RemoveHarmfulAppData removeHarmfulAppData);

    void a(Status status, SafeBrowsingData safeBrowsingData);

    void a(Status status, boolean z);

    void a(String str);

    void b(Status status, boolean z);
}
