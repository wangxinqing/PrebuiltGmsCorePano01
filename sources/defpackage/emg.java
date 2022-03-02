package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* renamed from: emg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class emg {
    protected final Map r;

    protected emg(String str) {
        Map map;
        iva.a((Object) str);
        if (TextUtils.isEmpty(str)) {
            map = Collections.emptyMap();
        } else {
            try {
                map = amsk.a(10).a().a(amsk.a('=').a(2)).a(str);
            } catch (IllegalArgumentException e) {
                map = Collections.emptyMap();
            }
        }
        this.r = map;
    }

    public final Object a(eme eme) {
        return eme.a(this);
    }
}
