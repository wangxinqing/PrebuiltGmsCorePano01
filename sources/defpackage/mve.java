package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackAsyncChimeraService;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import java.io.IOException;

/* renamed from: mve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class mve implements Runnable {
    private final FeedbackAsyncChimeraService a;
    private final int b;
    private final ParcelFileDescriptor.AutoCloseInputStream c;

    public mve(FeedbackAsyncChimeraService feedbackAsyncChimeraService, int i, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        this.a = feedbackAsyncChimeraService;
        this.b = i;
        this.c = autoCloseInputStream;
    }

    public final void run() {
        ErrorReport errorReport;
        muv muv;
        FeedbackAsyncChimeraService feedbackAsyncChimeraService = this.a;
        int i = this.b;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = this.c;
        byte[] bArr = new byte[i];
        Screenshot screenshot = null;
        try {
            autoCloseInputStream.read(bArr);
            try {
                autoCloseInputStream.close();
            } catch (IOException e) {
                Log.e("gf_FeedbackAsyncService", "Exception while closing report input stream", e);
            }
            try {
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(bArr, 0, i);
                obtain.setDataPosition(0);
                errorReport = (ErrorReport) ErrorReport.CREATOR.createFromParcel(obtain);
                obtain.recycle();
            } catch (Exception e2) {
                Log.e("gf_FeedbackAsyncService", "Exception while parsing report", e2);
                errorReport = null;
            }
        } catch (IOException e3) {
            Log.e("gf_FeedbackAsyncService", "Exception while reading report", e3);
            try {
                autoCloseInputStream.close();
                errorReport = null;
            } catch (IOException e4) {
                Log.e("gf_FeedbackAsyncService", "Exception while closing report input stream", e4);
                errorReport = null;
            }
        } catch (Throwable th) {
            try {
                autoCloseInputStream.close();
            } catch (IOException e5) {
                Log.e("gf_FeedbackAsyncService", "Exception while closing report input stream", e5);
            }
            throw th;
        }
        if (errorReport != null) {
            if (errorReport.E) {
                if (!errorReport.W) {
                    if (!TextUtils.isEmpty(errorReport.T)) {
                        try {
                            Screenshot screenshot2 = new Screenshot();
                            try {
                                Screenshot.a(feedbackAsyncChimeraService.getFilesDir(), errorReport.T, screenshot2, true, (ofu) null).get();
                            } catch (Exception e6) {
                            }
                            screenshot = screenshot2;
                        } catch (Exception e7) {
                        }
                    }
                    muv = new muv(feedbackAsyncChimeraService, errorReport, screenshot);
                    muv.a(mxu.a(errorReport.Z));
                } else {
                    muv = new muv(feedbackAsyncChimeraService, errorReport, (Screenshot) null);
                }
                errorReport = muv.b();
            }
            if (errorReport != null) {
                feedbackAsyncChimeraService.a(errorReport);
                if (!feedbackAsyncChimeraService.a().a(errorReport, mwj.a(errorReport, (Context) feedbackAsyncChimeraService), FeedbackAsyncChimeraService.b)) {
                    feedbackAsyncChimeraService.a((Context) feedbackAsyncChimeraService, errorReport);
                }
                feedbackAsyncChimeraService.stopSelf();
                return;
            }
            feedbackAsyncChimeraService.stopSelf();
        }
    }
}
