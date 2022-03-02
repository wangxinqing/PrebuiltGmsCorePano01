package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.download.DownloadDetails;
import com.google.android.gms.common.download.DownloadIntentOperation;
import com.google.android.gms.common.download.DownloadServiceSettingsChimeraActivity;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ipq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ipq extends jfx {
    public final DownloadServiceSettingsChimeraActivity a;
    private final ipl e;

    public ipq(DownloadServiceSettingsChimeraActivity downloadServiceSettingsChimeraActivity) {
        super(9);
        this.a = downloadServiceSettingsChimeraActivity;
        this.e = ipb.a(downloadServiceSettingsChimeraActivity);
    }

    /* access modifiers changed from: package-private */
    public final void a(MatrixCursor matrixCursor, long j) {
        String str;
        long j2 = j + 1;
        matrixCursor.addRow(new Object[]{Long.valueOf(j), "DownloadStatus", ""});
        try {
            ipl ipl = this.e;
            String str2 = DownloadServiceSettingsChimeraActivity.e().a;
            acwd acwd = new acwd();
            ibq ibq = ipb.a;
            icc icc = ipl.j;
            ipv ipv = new ipv(icc, str2);
            icc.a((idf) ipv);
            ipv.a((ice) new ipk(acwd));
            int i = ((Status) acws.a(acwd.a, 1, TimeUnit.SECONDS)).i;
            switch (i) {
                case 7000:
                    str = "PENDING";
                    break;
                case 7001:
                    str = "IN_PROGRESS";
                    break;
                case 7002:
                    str = "NOT_ALLOWED";
                    break;
                default:
                    str = ibt.a(i);
                    break;
            }
        } catch (ExecutionException e2) {
            Log.w("DownloadSvcSettingsActv", "Unknown execution exception", e2);
            str = "Unknown";
            matrixCursor.addRow(new Object[]{Long.valueOf(j2), DownloadServiceSettingsChimeraActivity.e().a, str});
        } catch (InterruptedException | TimeoutException e3) {
            str = "Unknown";
            matrixCursor.addRow(new Object[]{Long.valueOf(j2), DownloadServiceSettingsChimeraActivity.e().a, str});
        }
        matrixCursor.addRow(new Object[]{Long.valueOf(j2), DownloadServiceSettingsChimeraActivity.e().a, str});
    }

    public final void run() {
        long j;
        MatrixCursor matrixCursor = new MatrixCursor(DownloadServiceSettingsChimeraActivity.c);
        matrixCursor.addRow(new Object[]{1L, "Enabled status", ""});
        DownloadDetails[] a2 = ipt.a((Context) this.a);
        int length = a2.length;
        long j2 = 2;
        int i = 0;
        while (i < length) {
            DownloadDetails downloadDetails = a2[i];
            boolean a3 = DownloadIntentOperation.a((Context) this.a, downloadDetails.a);
            boolean c = DownloadIntentOperation.c((Context) this.a, downloadDetails.a);
            String str = downloadDetails.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
            sb.append(str);
            sb.append(" downloaded:");
            sb.append(a3);
            sb.append(" , enabled:");
            sb.append(c);
            matrixCursor.addRow(new Object[]{Long.valueOf(j), sb.toString(), downloadDetails.b});
            i++;
            j2 = j + 1;
        }
        Cursor a4 = ipt.a((DownloadManager) this.a.getSystemService("download"), new DownloadManager.Query());
        if (a4 != null) {
            try {
                if (a4.getCount() > 0) {
                    matrixCursor.addRow(new Object[]{Long.valueOf(j), "DownloadManager status", ""});
                    j++;
                    while (a4.moveToNext()) {
                        String string = a4.getString(a4.getColumnIndexOrThrow("title"));
                        int i2 = a4.getInt(a4.getColumnIndexOrThrow("status"));
                        long j3 = j + 1;
                        matrixCursor.addRow(new Object[]{Long.valueOf(j), string, i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? i2 != 16 ? "Unknown" : "Failed" : "Successful" : "Paused" : "Running" : "Pending"});
                        j = j3;
                    }
                }
            } catch (Throwable th) {
                a4.close();
                throw th;
            }
        }
        if (a4 != null) {
            a4.close();
        }
        a(matrixCursor, j);
        this.a.runOnUiThread(new ipp(this, matrixCursor));
    }
}
