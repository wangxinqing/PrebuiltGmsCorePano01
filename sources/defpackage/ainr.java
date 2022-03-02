package defpackage;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.location.RemoveGeofencingRequest;

/* renamed from: ainr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ainr extends aimi {
    final int a;
    final String b;
    final RemoveGeofencingRequest c;
    public final ainq e;

    public ainr(int i, String str, ainq ainq, RemoveGeofencingRequest removeGeofencingRequest) {
        super(5);
        this.a = i;
        this.b = str;
        this.c = removeGeofencingRequest;
        this.e = ainq;
    }

    public static ainr a(String str, ainq ainq) {
        return new ainr(1, str, ainq, (RemoveGeofencingRequest) null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemoveGeofencingRequest[");
        int i = this.a;
        if (i == 1) {
            sb.append("REMOVE_ALL ");
        } else if (i != 2) {
            sb.append("REMOVE_BY_PENDING_INTENT pendingIntent=PendingIntent[creatorPackage=");
            sb.append(ajqj.a(this.c.b));
            sb.append("], ");
        } else {
            sb.append("REMOVE_BY_IDS Ids=[");
            for (String replaceAll : this.c.a) {
                sb.append(replaceAll.replaceAll("\\p{C}", "?"));
                sb.append(", ");
            }
            sb.setLength(sb.length() - 2);
            sb.append("], ");
        }
        sb.append("packageName=");
        sb.append(this.b);
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final void a() {
        int intValue = ((Integer) b()).intValue();
        ainq ainq = this.e;
        if (ainq != null) {
            int i = this.a;
            if (i == 1) {
                throw new UnsupportedOperationException("onRemoveAllGeofences not implemented in remote side.");
            } else if (i != 2) {
                PendingIntent pendingIntent = this.c.b;
                rgh rgh = ainq.a;
                if (rgh != null) {
                    try {
                        rgh.a(intValue, pendingIntent);
                    } catch (RemoteException e2) {
                    }
                }
            } else {
                String[] strArr = (String[]) this.c.a.toArray(new String[this.c.a.size()]);
                rgh rgh2 = this.e.a;
                if (rgh2 != null) {
                    try {
                        rgh2.b(intValue, strArr);
                    } catch (RemoteException e3) {
                    }
                }
            }
        }
    }
}
