package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: emd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class emd implements eme, elz, emr {
    private final String a;

    public emd(String str) {
        iva.c(str);
        this.a = str;
    }

    public final /* bridge */ /* synthetic */ Object a(emg emg) {
        String str = (String) emg.r.get(this.a);
        if (str != null) {
            return new ArrayList(Arrays.asList(TextUtils.split(str, ",")));
        }
        return null;
    }
}
