package defpackage;

import android.util.Log;
import org.apache.http.params.AbstractHttpParams;
import org.apache.http.params.HttpParams;

/* renamed from: opi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class opi extends AbstractHttpParams {
    final /* synthetic */ opc a;

    public opi(opc opc) {
        this.a = opc;
    }

    public final HttpParams copy() {
        throw new UnsupportedOperationException();
    }

    public final Object getParameter(String str) {
        if ("http.connection.timeout".equals(str)) {
            return Integer.valueOf(((opl) this.a.a).d);
        }
        String valueOf = String.valueOf(str);
        Log.w("GoogleHttpClient", valueOf.length() == 0 ? new String("Ignoring to get unsupported parameter: ") : "Ignoring to get unsupported parameter: ".concat(valueOf));
        return null;
    }

    public final boolean removeParameter(String str) {
        String valueOf = String.valueOf(str);
        Log.w("GoogleHttpClient", valueOf.length() == 0 ? new String("Ignoring unsupported remove operation for: ") : "Ignoring unsupported remove operation for: ".concat(valueOf));
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [org.apache.http.params.HttpParams, opi] */
    public final HttpParams setParameter(String str, Object obj) {
        if (!"http.conn-manager.timeout".equals(str)) {
            if ("http.socket.timeout".equals(str)) {
                ((opl) this.a.a).c = ((Integer) obj).intValue();
            } else if ("http.connection.timeout".equals(str)) {
                ((opl) this.a.a).d = ((Integer) obj).intValue();
            } else {
                String valueOf = String.valueOf(str);
                Log.w("GoogleHttpClient", valueOf.length() == 0 ? new String("Ignoring unsupported parameter: ") : "Ignoring unsupported parameter: ".concat(valueOf));
            }
        }
        return this;
    }
}
