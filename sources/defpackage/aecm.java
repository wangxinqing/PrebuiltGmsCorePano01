package defpackage;

import android.os.Process;

/* renamed from: aecm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aecm {
    public static boolean a() {
        if (!jkr.g() || !Process.myUserHandle().isOwner()) {
            return true;
        }
        return false;
    }
}
