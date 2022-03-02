package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Comparator;

/* renamed from: viz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class viz implements Comparator {
    public static final Comparator a = new viz();

    private viz() {
    }

    public final int compare(Object obj, Object obj2) {
        ShareTarget shareTarget = (ShareTarget) obj;
        ShareTarget shareTarget2 = (ShareTarget) obj2;
        if (shareTarget.k) {
            if (!shareTarget2.k) {
                return -1;
            }
        } else if (shareTarget2.k) {
            return 1;
        }
        return shareTarget.b.compareTo(shareTarget2.b);
    }
}
