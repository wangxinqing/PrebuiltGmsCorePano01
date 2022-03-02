package defpackage;

import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.utils.InactiveReason;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/* renamed from: ajnh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajnh {
    public final Integer a;
    public final Integer b;
    public final List c;

    public ajnh(AccountConfig accountConfig) {
        List list;
        if (accountConfig != null) {
            this.a = Integer.valueOf(accountConfig.a());
            this.b = Integer.valueOf(accountConfig.b());
            list = accountConfig.e();
        } else {
            list = null;
            this.a = null;
            this.b = null;
        }
        this.c = list;
    }

    public static String a(Integer num, Integer num2) {
        if (atiu.a(num, num2)) {
            return String.valueOf(num2);
        }
        String valueOf = String.valueOf(num);
        String valueOf2 = String.valueOf(num2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(" -> ");
        sb.append(valueOf2);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajnh) {
            ajnh ajnh = (ajnh) obj;
            if (!atiu.a(this.a, ajnh.a) || !atiu.a(this.b, ajnh.b) || !atiu.a(this.c, ajnh.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String a() {
        if (this.c == null) {
            return "null";
        }
        TreeSet treeSet = new TreeSet();
        for (InactiveReason inactiveReason : this.c) {
            treeSet.add(inactiveReason.c);
        }
        return treeSet.toString();
    }
}
