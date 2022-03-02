package defpackage;

import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.Arrays;

/* renamed from: jul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jul {
    public final int a;
    public final TimeFilterImpl b;
    public final KeyFilterImpl c;

    public jul(int i, TimeFilterImpl timeFilterImpl, KeyFilterImpl keyFilterImpl) {
        this.a = i;
        iva.a((Object) timeFilterImpl);
        this.b = timeFilterImpl;
        this.c = keyFilterImpl;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jul) {
            jul jul = (jul) obj;
            if (this.a == jul.a && this.b.equals(jul.b)) {
                KeyFilterImpl keyFilterImpl = this.c;
                return keyFilterImpl == null || keyFilterImpl.equals(jul.c);
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }
}
