package defpackage;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* renamed from: ein  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ein extends UserRecoverableAuthException {
    public final int a;

    public ein(int i, String str, Intent intent) {
        super(str, intent);
        this.a = i;
    }
}
