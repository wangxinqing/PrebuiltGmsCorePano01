package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: myl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class myl extends bhw implements mym {
    public myl() {
        super("com.google.android.gms.feedback.internal.IFeedbackService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                boolean a = a((ErrorReport) bhx.a(parcel, ErrorReport.CREATOR));
                parcel2.writeNoException();
                bhx.a(parcel2, a);
                return true;
            case 3:
                boolean b = b((ErrorReport) bhx.a(parcel, ErrorReport.CREATOR));
                parcel2.writeNoException();
                bhx.a(parcel2, b);
                return true;
            case 4:
                a((Bundle) bhx.a(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5:
                a((FeedbackOptions) bhx.a(parcel, FeedbackOptions.CREATOR), (Bundle) bhx.a(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 6:
                a((ErrorReport) bhx.a(parcel, ErrorReport.CREATOR), parcel.readLong());
                return true;
            case 7:
                boolean b2 = b((FeedbackOptions) bhx.a(parcel, FeedbackOptions.CREATOR));
                parcel2.writeNoException();
                bhx.a(parcel2, b2);
                return true;
            case 8:
                a((FeedbackOptions) bhx.a(parcel, FeedbackOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
