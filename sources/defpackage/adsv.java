package defpackage;

import android.os.IInterface;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* renamed from: adsv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface adsv extends IInterface {
    void a(adsp adsp);

    void a(adss adss, adsp adsp);

    void a(UsageReportingOptInOptions usageReportingOptInOptions, adsp adsp);

    void a(String str, adsp adsp);

    void a(String str, ConsentInformation consentInformation, adsp adsp);

    void b(adss adss, adsp adsp);

    void c(adss adss, adsp adsp);
}
