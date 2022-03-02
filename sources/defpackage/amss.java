package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Set;

/* renamed from: amss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amss {
    final boolean[] a = new boolean[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    final Set b;

    public amss(Set set) {
        this.b = set;
        int i = 0;
        while (true) {
            boolean[] zArr = this.a;
            if (i < zArr.length) {
                zArr[i] = this.b.contains(Integer.valueOf(i));
                i++;
            } else {
                return;
            }
        }
    }
}
