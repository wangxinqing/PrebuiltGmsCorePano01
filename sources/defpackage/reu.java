package defpackage;

import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: reu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class reu {
    public static int a(int i) {
        if ((i >= 0 && i <= 1) || (i >= 1000 && i < 1006)) {
            return i;
        }
        return 1;
    }

    public static Status b(int i) {
        if (i == 1) {
            i = 13;
        }
        return new Status(i);
    }
}
