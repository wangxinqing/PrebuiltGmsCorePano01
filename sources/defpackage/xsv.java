package defpackage;

import android.util.Log;

/* renamed from: xsv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class xsv implements acvp {
    private final String a;
    private final aqnk b;

    public xsv(String str, aqnk aqnk) {
        this.a = str;
        this.b = aqnk;
    }

    public final void a(acwa acwa) {
        String str = this.a;
        aqnk aqnk = this.b;
        if (acwa.b()) {
            Object[] objArr = {str, aqnk.i()};
        } else {
            Log.e("CoreUiAuditRecordUtil", "Error logging the audit record", acwa.e());
        }
    }
}
