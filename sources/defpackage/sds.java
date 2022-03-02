package defpackage;

import com.google.android.gms.mdd.FileGroupWithDownloadStatus;
import com.google.android.gms.mdi.download.ui.DebugUiChimeraActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sds implements acvv {
    final /* synthetic */ DebugUiChimeraActivity a;

    public sds(DebugUiChimeraActivity debugUiChimeraActivity) {
        this.a = debugUiChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (FileGroupWithDownloadStatus fileGroupWithDownloadStatus : (List) obj) {
            Object[] objArr = {"DebugUiChimeraActivity", fileGroupWithDownloadStatus.a, fileGroupWithDownloadStatus.b};
            arrayList.add("GroupName = " + fileGroupWithDownloadStatus.a + "\nOwnerPackage = " + fileGroupWithDownloadStatus.b + "\nFileGroupVersionNumber = " + fileGroupWithDownloadStatus.c + "\nDownloaded = " + fileGroupWithDownloadStatus.d);
        }
        this.a.a.clear();
        this.a.a.addAll(arrayList);
    }
}
