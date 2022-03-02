package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import java.util.List;

/* renamed from: adso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class adso extends bhw implements adsp {
    public adso() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    public void a(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    public void b(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    public void c(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    public final void d(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    public void a(Status status, ConsentInformation consentInformation) {
        throw new IllegalStateException("Not implemented");
    }

    public void a(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        throw new IllegalStateException("Not implemented.");
    }

    public final void a(Status status, List list) {
        throw new IllegalStateException("Not implemented.");
    }

    public void a(Status status, boolean z, ConsentInformation consentInformation) {
        throw new IllegalStateException("Not implemented.");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                a((Status) bhx.a(parcel, Status.CREATOR), (UsageReportingOptInOptions) bhx.a(parcel, UsageReportingOptInOptions.CREATOR));
                return true;
            case 3:
                a((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 4:
                b((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 5:
                c((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 6:
                a((Status) bhx.a(parcel, Status.CREATOR), (List) parcel.createStringArrayList());
                return true;
            case 7:
                d((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 8:
                a((Status) bhx.a(parcel, Status.CREATOR), bhx.a(parcel), (ConsentInformation) bhx.a(parcel, ConsentInformation.CREATOR));
                return true;
            case 9:
                a((Status) bhx.a(parcel, Status.CREATOR), (ConsentInformation) bhx.a(parcel, ConsentInformation.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
