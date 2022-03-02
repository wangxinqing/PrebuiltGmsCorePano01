package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackAsyncChimeraService;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: myi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class myi extends bhw implements myj {
    final /* synthetic */ FeedbackAsyncChimeraService a;

    public myi() {
        super("com.google.android.gms.feedback.internal.IFeedbackAsyncService");
    }

    public final String a(FeedbackOptions feedbackOptions) {
        if (feedbackOptions == null) {
            return "";
        }
        if (TextUtils.isEmpty(feedbackOptions.n)) {
            feedbackOptions.n = myo.b();
        }
        nz nzVar = FeedbackAsyncChimeraService.a;
        String str = feedbackOptions.n;
        muv muv = new muv(this.a, feedbackOptions);
        muv.a(mxu.a(feedbackOptions.k));
        nzVar.put(str, muv.b());
        return feedbackOptions.n;
    }

    public final Bitmap b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return ((ErrorReport) FeedbackAsyncChimeraService.a.get(str)).af;
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public myi(FeedbackAsyncChimeraService feedbackAsyncChimeraService) {
        super("com.google.android.gms.feedback.internal.IFeedbackAsyncService");
        this.a = feedbackAsyncChimeraService;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        ErrorReport errorReport;
        if (i == 1) {
            String a2 = a((FeedbackOptions) bhx.a(parcel, FeedbackOptions.CREATOR));
            parcel2.writeNoException();
            parcel2.writeString(a2);
        } else if (i == 2) {
            boolean a3 = a(parcel.readString());
            parcel2.writeNoException();
            bhx.a(parcel2, a3);
        } else if (i == 3) {
            Bitmap b = b(parcel.readString());
            parcel2.writeNoException();
            bhx.b(parcel2, b);
        } else if (i != 4) {
            return false;
        } else {
            String readString = parcel.readString();
            Bitmap bitmap = (Bitmap) bhx.a(parcel, Bitmap.CREATOR);
            if (!TextUtils.isEmpty(readString) && (errorReport = (ErrorReport) FeedbackAsyncChimeraService.a.get(readString)) != null) {
                errorReport.af = bitmap;
            }
            parcel2.writeNoException();
        }
        return true;
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ErrorReport errorReport = (ErrorReport) FeedbackAsyncChimeraService.a.get(str);
        if (errorReport == null) {
            this.a.stopSelf();
            return false;
        }
        this.a.a(errorReport);
        if (!this.a.a().a(errorReport, mwj.a(errorReport, this.a.getApplicationContext()), FeedbackAsyncChimeraService.b)) {
            FeedbackAsyncChimeraService feedbackAsyncChimeraService = this.a;
            feedbackAsyncChimeraService.a((Context) feedbackAsyncChimeraService, errorReport);
        }
        FeedbackAsyncChimeraService.a.remove(str);
        this.a.stopSelf();
        return true;
    }
}
