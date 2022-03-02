package defpackage;

import android.os.StrictMode;

/* renamed from: jlg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jlg {
    public static StrictMode.ThreadPolicy a() {
        StrictMode.noteSlowCall("gcore.dynamite");
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        return threadPolicy;
    }
}
