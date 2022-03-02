package defpackage;

import android.os.Build;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;

/* renamed from: icy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class icy {
    public final int c;

    public icy(int i) {
        this.c = i;
    }

    public static Status a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        int i = Build.VERSION.SDK_INT;
        if (remoteException instanceof TransactionTooLargeException) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    public abstract void a(Status status);

    public abstract void a(ied ied, boolean z);

    public abstract void a(Exception exc);

    public abstract void b(ifj ifj);
}
