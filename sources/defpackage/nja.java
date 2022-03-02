package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;

/* renamed from: nja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class nja extends Exception {
    public final Status a;
    public boolean b;

    public nja(int i, String str) {
        this(i, str, (byte[]) null);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("OperationException[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public nja(int i, String str, PendingIntent pendingIntent, Throwable th) {
        super(str, th);
        this.b = false;
        this.a = new Status(i, str, pendingIntent);
    }

    public nja(int i, String str, byte[] bArr) {
        super(str);
        this.b = false;
        this.a = new Status(i, str, (PendingIntent) null);
    }
}
