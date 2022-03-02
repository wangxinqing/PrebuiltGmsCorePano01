package defpackage;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.widget.ListView;
import com.google.android.gms.common.download.DownloadServiceSettingsChimeraActivity;

/* renamed from: ipp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ipp implements Runnable {
    private final ipq a;
    private final MatrixCursor b;

    public ipp(ipq ipq, MatrixCursor matrixCursor) {
        this.a = ipq;
        this.b = matrixCursor;
    }

    public final void run() {
        ipq ipq = this.a;
        MatrixCursor matrixCursor = this.b;
        ListView listView = (ListView) ipq.a.findViewById(16908298);
        if (listView.getAdapter() == null) {
            listView.setAdapter(new ahy(ipq.a, matrixCursor, new String[]{DownloadServiceSettingsChimeraActivity.c[1], DownloadServiceSettingsChimeraActivity.c[2]}, new int[]{16908308, 16908309}));
        } else {
            ((ahu) listView.getAdapter()).a((Cursor) matrixCursor);
        }
        DownloadServiceSettingsChimeraActivity downloadServiceSettingsChimeraActivity = ipq.a;
        downloadServiceSettingsChimeraActivity.e.postDelayed(downloadServiceSettingsChimeraActivity.d, 2000);
    }
}
