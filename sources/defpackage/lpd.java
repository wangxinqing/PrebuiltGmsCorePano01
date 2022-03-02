package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.internal.FilterHolder;

/* renamed from: lpd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lpd {
    public final Intent a;

    public lpd(Context context, String str, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.PICK");
        this.a = intent;
        intent.setClassName(context, "com.google.android.gms.drive.ui.select.SelectFileActivity");
        iva.a(str, (Object) "Account Name not specified");
        iva.a((Object) str2, (Object) "Authorized app not specified");
        this.a.putExtra("accountName", str);
        this.a.putExtra("callerSdkAppId", str2);
        this.a.putExtra("callerPackageName", str3);
    }

    public final void a(DriveId driveId) {
        this.a.putExtra("initialFolderId", driveId);
    }

    public final void a(Filter filter) {
        this.a.putExtra("filterHolder", new FilterHolder(filter));
    }

    public final void a(String str) {
        this.a.putExtra("dialogTitle", str);
    }

    public final void a(boolean z) {
        this.a.putExtra("authorizeResource", z);
    }
}
