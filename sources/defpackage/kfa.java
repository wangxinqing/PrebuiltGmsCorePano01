package defpackage;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: kfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class kfa extends kez {
    private final List f;

    protected kfa(String str, kec kec, kwg kwg, String str2) {
        super(str, kec, kwg);
        this.f = a(str2);
    }

    private static List a(String str) {
        if (str != null) {
            return Arrays.asList(str.split("\\s*,\\s*"));
        }
        return Collections.EMPTY_LIST;
    }

    public abstract void c(Context context);

    public final void d(Context context) {
        if (this.f.contains(this.e.b) || this.a.g()) {
            c(context);
            return;
        }
        throw new nja(10, "App is not whitelisted to make this request.");
    }

    protected kfa(String str, kec kec, kwg kwg, String str2, int i) {
        super(str, kec, kwg, i);
        this.f = a(str2);
    }
}
