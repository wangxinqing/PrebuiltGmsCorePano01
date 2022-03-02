package defpackage;

import com.android.volley.toolbox.ImageRequest;
import java.util.List;

/* renamed from: aptp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aptp {
    public final int a;
    public final int b;

    public aptp(String str, int i) {
        this.a = a(str);
        this.b = i;
    }

    public static int a(String str) {
        try {
            List c = amsk.b("[.-]").c(str);
            if (c.size() == 1) {
                return Integer.parseInt(str);
            }
            if (c.size() >= 3) {
                return (Integer.parseInt((String) c.get(0)) * 1000000) + (Integer.parseInt((String) c.get(1)) * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS) + Integer.parseInt((String) c.get(2));
            }
            return -1;
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }
}
