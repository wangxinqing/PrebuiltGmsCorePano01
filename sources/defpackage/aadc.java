package defpackage;

import com.android.volley.toolbox.ImageRequest;
import java.util.Set;

/* renamed from: aadc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aadc {
    private final Set a = new ob();
    private int b;

    public aadc() {
        iva.b(true);
        iva.b(true);
        this.b = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
    }

    public final synchronized int a() {
        int i;
        if (((ob) this.a).b < 2147482647) {
            i = this.b;
            this.b = i + 1;
            while (!this.a.add(Integer.valueOf(i))) {
                i = this.b;
                int i2 = i + 1;
                this.b = i2;
                if (i2 >= Integer.MAX_VALUE) {
                    this.b = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
                }
            }
        } else {
            throw new aadb("No JobIDs are available");
        }
        return i;
    }

    public final synchronized void b(int i) {
        this.a.remove(Integer.valueOf(i));
    }

    public final synchronized boolean a(int i) {
        return this.a.add(Integer.valueOf(i));
    }
}
