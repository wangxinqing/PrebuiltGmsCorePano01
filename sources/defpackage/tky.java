package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;

/* renamed from: tky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tky {
    public static final jjg a = tgd.a("NearbyConnections");

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("[ ");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("0x%02x ", new Object[]{Byte.valueOf(bArr[i])}));
        }
        sb.append("]");
        return sb.toString();
    }

    public static void a(RemoteException remoteException, String str, Object... objArr) {
        if (remoteException instanceof DeadObjectException) {
            ((anih) ((anih) a.d()).a("tky", "a", 37, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s: DeadObjectException thrown. Client process has died.", (Object) String.format(str, objArr));
            return;
        }
        anih anih = (anih) a.c();
        anih.a((Throwable) remoteException);
        ((anih) anih.a("tky", "a", 41, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a(str, objArr);
    }
}
