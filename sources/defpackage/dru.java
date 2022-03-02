package defpackage;

import android.text.format.Formatter;
import com.google.android.gms.app.settings.ManageSpaceChimeraActivity;
import com.google.android.gms.wearable.internal.StorageInfoResponse;

/* renamed from: dru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dru implements acvv {
    final /* synthetic */ ManageSpaceChimeraActivity a;

    public dru(ManageSpaceChimeraActivity manageSpaceChimeraActivity) {
        this.a = manageSpaceChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        long j;
        StorageInfoResponse storageInfoResponse = (StorageInfoResponse) obj;
        if (storageInfoResponse != null) {
            j = storageInfoResponse.b;
        } else {
            j = 0;
        }
        ManageSpaceChimeraActivity manageSpaceChimeraActivity = this.a;
        manageSpaceChimeraActivity.b.setText(Formatter.formatFileSize(manageSpaceChimeraActivity, j));
    }
}
