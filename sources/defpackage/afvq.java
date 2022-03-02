package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: afvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afvq {
    private final Context a;

    public afvq(Context context) {
        this.a = context;
    }

    public final void a() {
        this.a.sendBroadcast(new Intent("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"));
    }

    public final void b() {
        this.a.sendBroadcast(new Intent("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"));
    }
}
