package defpackage;

import android.net.Uri;

/* renamed from: qvz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qvz {
    public final Uri a;
    public final int b;

    public qvz(Uri uri, int i) {
        this.a = uri;
        this.b = i;
    }

    public final boolean a() {
        return (this.b & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qvz) {
            qvz qvz = (qvz) obj;
            Uri uri = this.a;
            if (uri != null) {
                if (!uri.equals(qvz.a) || qvz.b != this.b) {
                    return false;
                }
                return true;
            } else if (qvz.a == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        return (uri != null ? uri.hashCode() : 0) ^ this.b;
    }
}
