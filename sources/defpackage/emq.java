package defpackage;

import android.text.TextUtils;

/* renamed from: emq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class emq implements emr {
    public final /* bridge */ /* synthetic */ Object a(emg emg) {
        String str = (String) ((ems) emg).r.get(a());
        if (!TextUtils.isEmpty(str)) {
            return a(jhy.c(str));
        }
        return null;
    }

    public abstract Object a(byte[] bArr);

    public abstract String a();
}
