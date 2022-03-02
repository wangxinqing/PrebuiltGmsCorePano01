package defpackage;

import android.util.Log;

/* renamed from: hts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hts extends qxc {
    public final void a(int i) {
        StringBuilder sb = new StringBuilder("RequestUpload finished with status: ");
        if (i != 2) {
            sb.append("RESULT SUCCESS");
        } else {
            sb.append("RESULT FAILURE");
        }
        Log.i("RequestUploadService", sb.toString());
    }
}
