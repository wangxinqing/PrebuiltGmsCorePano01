package com.google.android.gms.feedback;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.BinderWrapper;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FeedbackAsyncChimeraService extends Service {
    public static final nz a = new nz();
    public static final aoru b = jfm.a(10);
    private final IBinder c = new myi(this);

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ReportTransferIntentOperation extends IntentOperation {
        /* JADX WARNING: Removed duplicated region for block: B:33:0x006f A[SYNTHETIC, Splitter:B:33:0x006f] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0075 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0079 A[SYNTHETIC, Splitter:B:40:0x0079] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onHandleIntent(android.content.Intent r9) {
            /*
                r8 = this;
                java.lang.String r0 = "Exception while closing report output stream"
                java.lang.String r1 = "gf_FeedbackAsyncService"
                r2 = 0
                java.lang.String r3 = "com.google.android.gms.feedback.REPORT_BYTES"
                android.os.Parcelable r3 = r9.getParcelableExtra(r3)     // Catch:{ Exception -> 0x0067, all -> 0x0065 }
                com.google.android.gms.common.internal.BinderWrapper r3 = (com.google.android.gms.common.internal.BinderWrapper) r3     // Catch:{ Exception -> 0x0067, all -> 0x0065 }
                java.lang.String r4 = "com.google.android.gms.feedback.REPORT_SIZE_BYTES"
                r5 = 0
                int r4 = r9.getIntExtra(r4, r5)     // Catch:{ Exception -> 0x0067, all -> 0x0065 }
                if (r3 != 0) goto L_0x0017
                goto L_0x005f
            L_0x0017:
                if (r4 == 0) goto L_0x005f
                android.os.Parcel r6 = android.os.Parcel.obtain()     // Catch:{ Exception -> 0x0067, all -> 0x0065 }
                android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch:{ Exception -> 0x0067, all -> 0x0065 }
                android.os.IBinder r3 = r3.a     // Catch:{ Exception -> 0x0067, all -> 0x0065 }
                r3.transact(r5, r7, r6, r5)     // Catch:{ Exception -> 0x0067, all -> 0x0065 }
                r7.recycle()     // Catch:{ Exception -> 0x0067, all -> 0x0065 }
                byte[] r3 = new byte[r4]     // Catch:{ Exception -> 0x0067, all -> 0x0065 }
                r6.readByteArray(r3)     // Catch:{ Exception -> 0x0067, all -> 0x0065 }
                r6.recycle()     // Catch:{ Exception -> 0x0067, all -> 0x0065 }
                java.lang.String r4 = "com.google.android.gms.feedback.REPORT_WRITER_BINDER_WRAPPER"
                android.os.Parcelable r9 = r9.getParcelableExtra(r4)     // Catch:{ Exception -> 0x0067, all -> 0x0065 }
                com.google.android.gms.common.internal.BinderWrapper r9 = (com.google.android.gms.common.internal.BinderWrapper) r9     // Catch:{ Exception -> 0x0067, all -> 0x0065 }
                android.os.ParcelFileDescriptor r9 = com.google.android.gms.feedback.FeedbackAsyncChimeraService.a((com.google.android.gms.common.internal.BinderWrapper) r9)     // Catch:{ Exception -> 0x0067, all -> 0x0065 }
                if (r9 == 0) goto L_0x0059
                android.os.ParcelFileDescriptor$AutoCloseOutputStream r4 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream     // Catch:{ Exception -> 0x0067, all -> 0x0065 }
                r4.<init>(r9)     // Catch:{ Exception -> 0x0067, all -> 0x0065 }
                r4.write(r3)     // Catch:{ Exception -> 0x0056, all -> 0x0053 }
                r4.flush()     // Catch:{ Exception -> 0x0056, all -> 0x0053 }
                r4.close()     // Catch:{ IOException -> 0x004e }
                return
            L_0x004e:
                r9 = move-exception
            L_0x004f:
                android.util.Log.e(r1, r0, r9)
                return
            L_0x0053:
                r9 = move-exception
                r2 = r4
                goto L_0x0077
            L_0x0056:
                r9 = move-exception
                r2 = r4
                goto L_0x0068
            L_0x0059:
                java.lang.String r9 = "Failed to get FileDescriptor"
                android.util.Log.e(r1, r9)     // Catch:{ Exception -> 0x0067, all -> 0x0065 }
                return
            L_0x005f:
                java.lang.String r9 = "Failed to get report bytes"
                android.util.Log.e(r1, r9)     // Catch:{ Exception -> 0x0067, all -> 0x0065 }
                return
            L_0x0065:
                r9 = move-exception
                goto L_0x0077
            L_0x0067:
                r9 = move-exception
            L_0x0068:
                java.lang.String r3 = "Exception while transferring report"
                android.util.Log.e(r1, r3, r9)     // Catch:{ all -> 0x0076 }
                if (r2 == 0) goto L_0x0075
                r2.close()     // Catch:{ IOException -> 0x0073 }
                return
            L_0x0073:
                r9 = move-exception
                goto L_0x004f
            L_0x0075:
                return
            L_0x0076:
                r9 = move-exception
            L_0x0077:
                if (r2 == 0) goto L_0x0081
                r2.close()     // Catch:{ IOException -> 0x007d }
                goto L_0x0081
            L_0x007d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0081:
                goto L_0x0083
            L_0x0082:
                throw r9
            L_0x0083:
                goto L_0x0082
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.feedback.FeedbackAsyncChimeraService.ReportTransferIntentOperation.onHandleIntent(android.content.Intent):void");
        }
    }

    static ParcelFileDescriptor a(BinderWrapper binderWrapper) {
        if (binderWrapper != null) {
            IBinder iBinder = binderWrapper.a;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                iBinder.transact(0, obtain2, obtain, 0);
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                obtain2.recycle();
                return parcelFileDescriptor;
            } catch (RemoteException e) {
                Log.e("gf_FeedbackAsyncService", "Failed to get FileDescriptor", e);
                return null;
            }
        } else {
            Log.e("gf_FeedbackAsyncService", "No binder wrapper found");
            return null;
        }
    }

    public static void b(Context context, ErrorReport errorReport) {
        byte[] bArr;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
            ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
            try {
                Parcel obtain = Parcel.obtain();
                muq.a(errorReport, obtain, 0);
                bArr = obtain.marshall();
                obtain.recycle();
            } catch (NullPointerException e) {
                if (Build.MODEL.toLowerCase(Locale.ENGLISH).contains("vivo")) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Got NPE when trying to create report for Vivo: ");
                    sb.append(valueOf);
                    Log.e("gf_FeedbackAsyncService", sb.toString());
                    bArr = null;
                } else {
                    throw e;
                }
            }
            if (bArr != null) {
                Intent startIntent = IntentOperation.getStartIntent(context, ReportTransferIntentOperation.class, "com.google.android.gms.feedback.transfer_report");
                if (startIntent != null) {
                    startIntent.putExtra("com.google.android.gms.feedback.REPORT_SIZE_BYTES", bArr.length);
                    startIntent.putExtra("com.google.android.gms.feedback.REPORT_BYTES", new BinderWrapper((IBinder) new mvi(bArr)));
                    startIntent.putExtra("com.google.android.gms.feedback.REPORT_WRITER_BINDER_WRAPPER", a(parcelFileDescriptor2));
                    context.startService(startIntent);
                }
                context.startService(new Intent().setClassName(context, "com.google.android.gms.feedback.FeedbackAsyncService").putExtra("com.google.android.gms.feedback.REPORT_SIZE_BYTES", bArr.length).putExtra("com.google.android.gms.feedback.REPORT_READER_BINDER", a(parcelFileDescriptor)));
            }
        } catch (IOException e2) {
            Log.e("gf_FeedbackAsyncService", "Exception while creating IPC pipe to transfer report", e2);
        }
    }

    public final IBinder onBind(Intent intent) {
        return this.c;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream;
        if (intent != null) {
            int intExtra = intent.getIntExtra("com.google.android.gms.feedback.REPORT_SIZE_BYTES", 0);
            if (intExtra != 0) {
                ParcelFileDescriptor a2 = a((BinderWrapper) intent.getParcelableExtra("com.google.android.gms.feedback.REPORT_READER_BINDER"));
                if (a2 == null) {
                    Log.e("gf_FeedbackAsyncService", "Failed to get FileDescriptor");
                    autoCloseInputStream = null;
                } else {
                    autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(a2);
                }
                if (autoCloseInputStream != null) {
                    b.execute(new mve(this, intExtra, autoCloseInputStream));
                    return 2;
                }
                Log.e("gf_FeedbackAsyncService", "Unable to get input stream.");
                stopSelf();
                return 2;
            }
            Log.e("gf_FeedbackAsyncService", "Empty report!");
        }
        stopSelf();
        return 2;
    }

    private static BinderWrapper a(ParcelFileDescriptor parcelFileDescriptor) {
        return new BinderWrapper((IBinder) new mvf(parcelFileDescriptor));
    }

    public static void a(Context context, FeedbackOptions feedbackOptions) {
        if (feedbackOptions != null) {
            mvh mvh = new mvh("feedback", feedbackOptions, context);
            jca.a().a(context, new Intent().setClassName(context, "com.google.android.gms.feedback.FeedbackAsyncService"), mvh, 1);
        }
    }

    public final mwo a() {
        return new mwo(this);
    }

    public final void a(Context context, ErrorReport errorReport) {
        try {
            mxj.a(context, mxj.b(errorReport, context));
            OfflineReportSendTaskChimeraService.a(context);
        } catch (IOException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Error saving report: ");
            sb.append(valueOf);
            Log.e("gf_FeedbackAsyncService", sb.toString());
        } catch (IllegalArgumentException | mxd e2) {
            Log.e("gf_FeedbackAsyncService", "invalid report", e2);
        }
    }

    public final void a(ErrorReport errorReport) {
        String str = errorReport.B;
        if (!TextUtils.isEmpty(str)) {
            if (!str.toLowerCase(Locale.ENGLISH).equals("anonymous")) {
                List d = jgu.d(this, getPackageName());
                int size = d.size();
                int i = 0;
                while (i < size) {
                    if (!((Account) d.get(i)).name.equals(str)) {
                        i++;
                    } else {
                        return;
                    }
                }
                Log.e("gf_FeedbackAsyncService", "Requested account was not found on device. Submitting anonymously");
            }
            errorReport.B = "";
        }
    }

    public static void b(Context context, FeedbackOptions feedbackOptions) {
        if (feedbackOptions != null) {
            mvj mvj = new mvj("feedback", feedbackOptions, context);
            jca.a().a(context, new Intent().setClassName(context, "com.google.android.gms.feedback.FeedbackAsyncService"), mvj, 1);
        }
    }
}
