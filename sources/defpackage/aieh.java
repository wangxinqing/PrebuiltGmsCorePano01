package defpackage;

import com.google.android.gms.location.LocationRequest;

/* renamed from: aieh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aieh {
    public final String a;
    public final int b;
    public final String c;

    public aieh(String str, int i, String str2) {
        this.a = str == null ? "" : str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aieh) {
            aieh aieh = (aieh) obj;
            if (!this.a.equals(aieh.a) || this.b != aieh.b || !atiu.a(this.c, aieh.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.a);
        sb.append(", ");
        sb.append(LocationRequest.a(this.b));
        if (this.c != null) {
            sb.append(", ");
            sb.append(this.c);
        }
        sb.append("]");
        return sb.toString();
    }
}
