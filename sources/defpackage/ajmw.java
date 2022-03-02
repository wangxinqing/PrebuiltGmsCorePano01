package defpackage;

import com.google.android.location.reporting.state.update.AccountConfig;
import java.util.Arrays;

/* renamed from: ajmw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajmw {
    public final AccountConfig a;
    public final ajmv b;
    public final long c;

    public ajmw(AccountConfig accountConfig, ajmv ajmv, long j) {
        this.a = accountConfig;
        this.b = ajmv;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajmw) {
            ajmw ajmw = (ajmw) obj;
            if (this.c == ajmw.c && this.a.equals(ajmw.a) && this.b == ajmw.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        long j = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64 + String.valueOf(valueOf2).length());
        sb.append("ActivationChange{account=");
        sb.append(valueOf);
        sb.append(", change=");
        sb.append(valueOf2);
        sb.append(", millis=");
        sb.append(j);
        sb.append('}');
        return sb.toString();
    }
}
