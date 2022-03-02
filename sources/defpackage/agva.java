package defpackage;

import android.os.Binder;

/* renamed from: agva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class agva {
    public static Object a(agvb agvb) {
        long clearCallingIdentity;
        try {
            return agvb.a();
        } catch (SecurityException e) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object a = agvb.a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
