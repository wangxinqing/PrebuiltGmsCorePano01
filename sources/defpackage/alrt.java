package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: alrt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alrt {
    public final String a;
    public final int b;
    public final String c;
    public final List d;

    public alrt(int i, String str, List list) {
        this((String) null, i, str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof alrt)) {
            return false;
        }
        alrt alrt = (alrt) obj;
        return alyr.a(this.a, alrt.a, Integer.valueOf(this.b), Integer.valueOf(alrt.b), this.c, alrt.c, this.d, alrt.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d});
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        String valueOf = String.valueOf(this.d);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 81 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("OtManagerState [modelId=");
        sb.append(str);
        sb.append(", revision=");
        sb.append(i);
        sb.append(", meSessionId=");
        sb.append(str2);
        sb.append(", pendingOperations=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Deprecated
    public alrt(String str, int i, String str2, List list) {
        this.a = str;
        this.b = i;
        try {
            long parseLong = Long.parseLong(str2, 16);
            if (parseLong < 0) {
                String valueOf = String.valueOf(str2);
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid negative session ID: ") : "Invalid negative session ID: ".concat(valueOf));
            }
            this.c = Long.toHexString(parseLong);
            this.d = list;
        } catch (NumberFormatException e) {
            String valueOf2 = String.valueOf(str2);
            throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Invalid session ID: ") : "Invalid session ID: ".concat(valueOf2));
        }
    }
}
