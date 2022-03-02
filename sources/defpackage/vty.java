package defpackage;

import android.os.Bundle;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;

/* renamed from: vty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vty {
    public int a = 0;
    public String b;
    public boolean c = false;
    private final String d;

    public vty(String str) {
        this.d = str;
    }

    public final WifiCredentialsAttachment a() {
        return new WifiCredentialsAttachment(this.d, this.a, new Bundle(), this.b, this.c);
    }
}
