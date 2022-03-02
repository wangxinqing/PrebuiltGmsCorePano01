package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import java.util.List;

/* renamed from: adsp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface adsp extends IInterface {
    void a(Status status);

    void a(Status status, ConsentInformation consentInformation);

    void a(Status status, UsageReportingOptInOptions usageReportingOptInOptions);

    void a(Status status, List list);

    void a(Status status, boolean z, ConsentInformation consentInformation);

    void b(Status status);

    void c(Status status);

    void d(Status status);
}
