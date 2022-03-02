package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.GoogleCertificatesQuery;

/* renamed from: iub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface iub extends IInterface {
    mby getGoogleCertificates();

    mby getGoogleReleaseCertificates();

    boolean isGoogleOrPlatformSigned(GoogleCertificatesQuery googleCertificatesQuery, mby mby);

    boolean isGoogleReleaseSigned(String str, mby mby);

    boolean isGoogleSigned(String str, mby mby);
}
