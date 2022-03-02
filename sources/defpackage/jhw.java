package defpackage;

import android.content.Context;
import android.util.Log;

/* renamed from: jhw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jhw extends jhv {
    public jhw(Context context) {
        super(context);
    }

    public final void a(String str, int i, String str2, String str3) {
        try {
            this.b.finishOp(str, i, str2, str3);
        } catch (IllegalStateException e) {
            Log.e("AppOpsCompat30", String.format("Op %s finished but never started, %d:%s", new Object[]{str, Integer.valueOf(i), str2}), e);
        }
    }

    public final int b(String str, int i, String str2, String str3) {
        return this.b.noteOpNoThrow(str, i, str2, str3, (String) null);
    }

    public final int c(String str, int i, String str2, String str3) {
        return this.b.startOpNoThrow(str, i, str2, str3, (String) null);
    }
}
