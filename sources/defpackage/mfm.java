package defpackage;

import android.os.Bundle;

/* renamed from: mfm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mfm implements mfl {
    public static final String a = mfk.a("FamilyApiMessage");
    public final Bundle b = new Bundle(13);

    static {
        mfk.a("isDirectAddInvitations");
    }

    public mfm(String str, String str2) {
        iva.c(str);
        iva.c(str2);
        this.b.putString(a, "ManageFamilyV2");
        this.b.putString("accountName", str);
        this.b.putString("appId", str2);
    }
}
